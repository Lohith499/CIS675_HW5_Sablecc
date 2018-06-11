/* This file was generated by SableCC (http://www.sablecc.org/). */

package dot.node;

import dot.analysis.*;

@SuppressWarnings("nls")
public final class TSubgraph extends Token
{
    public TSubgraph()
    {
        super.setText("subgraph");
    }

    public TSubgraph(int line, int pos)
    {
        super.setText("subgraph");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSubgraph(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSubgraph(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSubgraph text.");
    }
}
