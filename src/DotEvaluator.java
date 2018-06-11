import dot.analysis.DepthFirstAdapter;
import dot.node.ACreateGraph;
import dot.graph.*;
import dot.node.ACreateNode;
import dot.node.ACreatePcNodes;
import dot.node.Start;

public class DotEvaluator extends DepthFirstAdapter
{
    private Graph graph;
    
    
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPCreateGraph().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }
    
	public void outACreateGraph(ACreateGraph node)
	{
		
        graph = new Graph(node.getName().getText());
        GraphNode test = new GraphNode("Test");
        graph.add_node(test);
        System.out.println(graph.toString());
	}

    public void outACreateNode(ACreateNode node)
    {
        GraphNode current_node = new GraphNode(node.getName().toString());
        graph.add_node(current_node);
        System.out.println(graph.toString());
    }

    public void outACreatePcNodes(ACreatePcNodes node)
    {
        GraphNode parent = new GraphNode(node.getParent().toString());
        GraphNode child = new GraphNode(node.getChild().toString());
        graph.add_parent_child(parent, child);
        System.out.println(graph.toString());

    }
    
}
