/* This file was generated by SableCC (http://www.sablecc.org/). */

package dot.node;

import dot.analysis.*;

@SuppressWarnings("nls")
public final class ACreatePcNodes extends PCreatePcNodes
{
    private TId _parent_;
    private TId _child_;

    public ACreatePcNodes()
    {
        // Constructor
    }

    public ACreatePcNodes(
        @SuppressWarnings("hiding") TId _parent_,
        @SuppressWarnings("hiding") TId _child_)
    {
        // Constructor
        setParent(_parent_);

        setChild(_child_);

    }

    @Override
    public Object clone()
    {
        return new ACreatePcNodes(
            cloneNode(this._parent_),
            cloneNode(this._child_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACreatePcNodes(this);
    }

    public TId getParent()
    {
        return this._parent_;
    }

    public void setParent(TId node)
    {
        if(this._parent_ != null)
        {
            this._parent_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parent_ = node;
    }

    public TId getChild()
    {
        return this._child_;
    }

    public void setChild(TId node)
    {
        if(this._child_ != null)
        {
            this._child_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._child_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parent_)
            + toString(this._child_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parent_ == child)
        {
            this._parent_ = null;
            return;
        }

        if(this._child_ == child)
        {
            this._child_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parent_ == oldChild)
        {
            setParent((TId) newChild);
            return;
        }

        if(this._child_ == oldChild)
        {
            setChild((TId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
