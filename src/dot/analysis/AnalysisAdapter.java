/* This file was generated by SableCC (http://www.sablecc.org/). */

package dot.analysis;

import java.util.*;
import dot.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseACreateGraph(ACreateGraph node)
    {
        defaultCase(node);
    }

    public void caseACreateNode(ACreateNode node)
    {
        defaultCase(node);
    }

    public void caseACreatePcNodes(ACreatePcNodes node)
    {
        defaultCase(node);
    }

    public void caseTEquals(TEquals node)
    {
        defaultCase(node);
    }

    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTLCb(TLCb node)
    {
        defaultCase(node);
    }

    public void caseTRCb(TRCb node)
    {
        defaultCase(node);
    }

    public void caseTLBr(TLBr node)
    {
        defaultCase(node);
    }

    public void caseTRBr(TRBr node)
    {
        defaultCase(node);
    }

    public void caseTDirectedEdge(TDirectedEdge node)
    {
        defaultCase(node);
    }

    public void caseTUndirectedEdge(TUndirectedEdge node)
    {
        defaultCase(node);
    }

    public void caseTStrict(TStrict node)
    {
        defaultCase(node);
    }

    public void caseTDigraph(TDigraph node)
    {
        defaultCase(node);
    }

    public void caseTGraph(TGraph node)
    {
        defaultCase(node);
    }

    public void caseTSubgraph(TSubgraph node)
    {
        defaultCase(node);
    }

    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    public void caseTEol(TEol node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    public void caseTType(TType node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
