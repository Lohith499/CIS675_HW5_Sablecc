/* This file was generated by SableCC (http://www.sablecc.org/). */

package dot.node;

import dot.analysis.*;

@SuppressWarnings("nls")
public final class TLCb extends Token
{
    public TLCb()
    {
        super.setText("{");
    }

    public TLCb(int line, int pos)
    {
        super.setText("{");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLCb(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLCb(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLCb text.");
    }
}
