package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class b
  extends h
{
  public b(View paramView, k paramk)
  {
    super(paramView, paramk);
    this.qvq.setVisibility(8);
    this.bOA.setVisibility(8);
    this.eRj.setVisibility(8);
    this.qvq.setOnClickListener(null);
  }
  
  public final void a(com.tencent.mm.plugin.wenote.model.a.b paramb, int paramInt1, int paramInt2)
  {
    super.a(paramb, paramInt1, paramInt2);
    if (paramb.getType() != -2) {}
    while (this.qtF.qrC != 3) {
      return;
    }
    this.qvy.setVisibility(0);
  }
  
  public final int caZ()
  {
    return -2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */