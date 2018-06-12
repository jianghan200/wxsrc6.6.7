package com.tencent.mm.plugin.gallery.ui;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public final class g
  extends LinearLayoutManager
{
  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    paramRecyclerView = new g.1(this, paramRecyclerView.getContext());
    paramRecyclerView.Sv = paramInt;
    a(paramRecyclerView);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/gallery/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */