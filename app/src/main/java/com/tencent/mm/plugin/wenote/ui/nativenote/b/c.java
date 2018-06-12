package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class c
  extends h
{
  public c(View paramView, k paramk)
  {
    super(paramView, paramk);
    this.qvq.setVisibility(0);
    this.bOA.setVisibility(8);
    this.eRj.setVisibility(8);
    this.qvq.setTag(this);
    this.qvq.setOnClickListener(this.jXR);
  }
  
  public final void a(b paramb, int paramInt1, int paramInt2)
  {
    this.qvt.setImageResource(com.tencent.mm.plugin.fav.ui.c.Bx(((com.tencent.mm.plugin.wenote.model.a.c)paramb).qoT));
    this.qvr.setText(((com.tencent.mm.plugin.wenote.model.a.c)paramb).title);
    this.qvs.setText(((com.tencent.mm.plugin.wenote.model.a.c)paramb).content);
    super.a(paramb, paramInt1, paramInt2);
  }
  
  public final int caZ()
  {
    return 5;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */