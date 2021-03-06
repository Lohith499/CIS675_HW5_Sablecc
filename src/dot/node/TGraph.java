/* This file was generated by SableCC (http://www.sablecc.org/). */

package dot.node;

import dot.analysis.*;

@SuppressWarnings("nls")
public final class TGraph extends Token
{
    public TGraph()
    {
        super.setText("graph");
    }

    public TGraph(int line, int pos)
    {
        super.setText("graph");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TGraph(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTGraph(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TGraph text.");
    }
}
