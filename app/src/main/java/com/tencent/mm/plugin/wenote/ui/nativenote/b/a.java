package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.support.v7.widget.RecyclerView.t;
import android.view.View;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public abstract class a
  extends RecyclerView.t
{
  protected k qtF;
  
  public a(View paramView, k paramk)
  {
    super(paramView);
    this.qtF = paramk;
  }
  
  public abstract void a(b paramb, int paramInt1, int paramInt2);
  
  public abstract int caZ();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */