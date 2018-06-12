package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class j
  extends h
{
  private View qvI;
  
  public j(View paramView, k paramk)
  {
    super(paramView, paramk);
    this.qvq.setVisibility(8);
    this.bOA.setVisibility(8);
    this.eRj.setVisibility(8);
    this.qvq.setOnClickListener(null);
    this.qvv.setOnClickListener(new j.1(this));
  }
  
  public final void a(b paramb, int paramInt1, int paramInt2)
  {
    super.a(paramb, paramInt1, paramInt2);
    if (paramb.getType() != -1) {
      return;
    }
    paramb = (RelativeLayout.LayoutParams)this.qvw.getLayoutParams();
    paramb.bottomMargin = 0;
    paramb.topMargin = 0;
    this.qvw.setLayoutParams(paramb);
    this.qvv.setVisibility(0);
    this.qvI = this.SU.findViewById(R.h.note_split_line);
  }
  
  public final int caZ()
  {
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */