package dot.graph;

import java.util.ArrayList;

public class Graph
{
    private ArrayList<GraphNode> knownNodes = new ArrayList<GraphNode>();
    private String name;

    public Graph(String name)
    {
        this.name = name;
    }

    public void add_node(GraphNode node)
    {
        if (!knownNodes.contains(node))
        {
            this.knownNodes.add(node);
        }
    }

    public void add_parent_child(GraphNode parent, GraphNode child)
    {
        add_node(parent);
        add_node(child);
        parent.addChild(child);
    }

    public String toString()
    {
        String output = "";
        if (this.knownNodes.size() > 0)
        {
            output = this.knownNodes.get(0).toString();
            for (int i = 0; i < this.knownNodes.size(); i++) {
                output = output + "," + this.knownNodes.get(i).toString();
            }
        }
        return output;
    }
    
    public Boolean isNil() {
		if ( knownNodes==null || knownNodes.size()==0 )  {
			return true;
		}
		else 
		{
			return false;
		}
	}
    
    
    
    public String toStringTree() {
		StringBuilder buf = new StringBuilder(); 
		if ( knownNodes==null || knownNodes.size()==0 ) return this.toString(); 
		if ( !isNil() ) { 
			buf.append("("); 
			buf.append(this.toString()); 
			buf.append(' '); }
			buf.append("(");
		for (int i=0; knownNodes!=null && i < knownNodes.size(); i++) 	{
			
			GraphNode t = (GraphNode)knownNodes.get(i);
			if ( i>0 ) buf.append(' '); 
			buf.append(t.toStringTree());
		}
		if ( !isNil() ) {
			buf.append(")");
			}
			buf.append(")");
	 
		return buf.toString(); 
	}
}
