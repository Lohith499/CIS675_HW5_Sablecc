package dot.graph;

import java.util.ArrayList;

public class GraphNode
{
    private String value;
    private ArrayList<GraphNode> children;

    public GraphNode(String value)
    {
        System.out.println("Creating Node: " + value);
        this.value = value;
        this.children = new ArrayList<GraphNode>();
    }

    public void addChild(GraphNode child)
    {
        if (!children.contains(child))
        {
            this.children.add(child);
        }
    }

    public String toString() { return this.value; }
    
    public Boolean isNil() {
		if ( children==null || children.size()==0 )  {
			return true;
		}
		else 
		{
			return false;
		}
	}
    
    public String toStringTree() {
		StringBuilder buf = new StringBuilder(); 
		if ( children==null || children.size()==0 ) return this.toString(); 
		if ( !isNil() ) { 
			buf.append("("); 
			buf.append(this.toString()); 
			buf.append(' '); }
			buf.append("(");
		for (int i=0; children!=null && i < children.size(); i++) 	{
			
			GraphNode t = (GraphNode)children.get(i);
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
