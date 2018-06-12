package com.tencent.mm.plugin.fav.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.ui.m.e;
import com.tencent.mm.plugin.fav.ui.m.f;
import com.tencent.mm.plugin.fav.ui.m.i;

public class FavCapacityPanel
  extends LinearLayout
{
  private View.OnClickListener iZP = new FavCapacityPanel.1(this);
  private LinearLayout jeZ = this;
  public long jfa;
  public TextView jfb;
  public int jfc = 0;
  public long jfd;
  
  public FavCapacityPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = View.inflate(getContext(), m.f.fav_tag_panel_footview, null);
    paramContext.measure(-2, -2);
    paramAttributeSet = paramContext.findViewById(m.e.fav_capacity_foot_line);
    View localView = paramContext.findViewById(m.e.fav_capacity_foot_linear);
    this.jfb = ((TextView)paramContext.findViewById(m.e.fav_capacity_foot_desc));
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramAttributeSet.getLayoutParams();
    localLayoutParams.width = paramContext.getMeasuredWidth();
    paramAttributeSet.setLayoutParams(localLayoutParams);
    localView.setOnClickListener(this.iZP);
    paramAttributeSet = new LinearLayout.LayoutParams(0, -2);
    paramAttributeSet.weight = 1.0F;
    this.jeZ.addView(paramContext, paramAttributeSet);
    this.jfa = (b.aKR() / 1048576L);
    this.jfd = (b.aKS() / 1048576L);
    paramContext = this.jfb;
    paramAttributeSet = this.jfb.getContext();
    int i = m.i.fav_capacity_info;
    if (this.jfd - this.jfa > 0L) {}
    for (long l = this.jfd - this.jfa;; l = 0L)
    {
      paramContext.setText(paramAttributeSet.getString(i, new Object[] { Long.valueOf(l), Long.valueOf(this.jfa) }));
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/widget/FavCapacityPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */