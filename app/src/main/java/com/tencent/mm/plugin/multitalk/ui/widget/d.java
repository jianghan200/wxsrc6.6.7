package com.tencent.mm.plugin.multitalk.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.R.h;
import com.tencent.mm.bp.a;
import com.tencent.mm.pluginsdk.ui.a.b;

public final class d
  implements View.OnClickListener
{
  private Context context;
  private View jxR;
  public LinearLayout lvA;
  public LinearLayout lvB;
  private int lvC;
  private int lvD;
  private int lvE = b.lvh + b.lvg;
  private int lvF = b.lvh * 2 + b.lvg;
  private int lvG = b.lvh * 4;
  public int lvH;
  private int lvh = b.lvh;
  private int lvn = b.lvn;
  private LinearLayout lvz;
  public int size = 0;
  
  public d(Activity paramActivity)
  {
    this.context = paramActivity.getBaseContext();
    int i = a.fk(this.context) - this.lvG * 2;
    this.lvC = ((i - this.lvE * 10) / 5);
    this.lvD = ((i - this.lvF * 10) / 5);
    i = this.lvD;
    int j = this.lvh;
    this.jxR = paramActivity.findViewById(R.h.padding_view);
    this.jxR.getLayoutParams().height = (i * 2 + j * 12);
    this.lvz = ((LinearLayout)paramActivity.findViewById(R.h.avatar_container));
    paramActivity = (RelativeLayout.LayoutParams)this.lvz.getLayoutParams();
    paramActivity.topMargin = (this.lvh * 2);
    paramActivity.bottomMargin = (this.lvh * 2);
    paramActivity.leftMargin = this.lvG;
    paramActivity.rightMargin = this.lvG;
    this.lvz.setLayoutParams(paramActivity);
    this.lvA = new LinearLayout(this.context);
    this.lvB = new LinearLayout(this.context);
    paramActivity = new LinearLayout.LayoutParams(-2, -2);
    this.lvA.setLayoutParams(paramActivity);
    paramActivity = new RelativeLayout.LayoutParams(-2, -2);
    paramActivity.addRule(14);
    this.lvB.setLayoutParams(paramActivity);
    paramActivity = new LinearLayout.LayoutParams(-1, -2);
    RelativeLayout localRelativeLayout = new RelativeLayout(this.context);
    localRelativeLayout.addView(this.lvB);
    localRelativeLayout.setLayoutParams(paramActivity);
    this.lvz.addView(this.lvA);
    this.lvz.addView(localRelativeLayout);
  }
  
  public final void HQ(String paramString)
  {
    this.size += 1;
    ImageView localImageView = new ImageView(this.context);
    localImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    localImageView.setTag(paramString);
    localImageView.setOnClickListener(this);
    a.b.a(localImageView, paramString, 0.1F, false);
    if (this.size <= 5) {
      this.lvA.addView(localImageView);
    }
    for (;;)
    {
      tm(this.size);
      tn(this.size);
      return;
      this.lvB.addView(localImageView);
    }
  }
  
  public final void onClick(View paramView)
  {
    this.lvH += 1;
  }
  
  public final void setVisible(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.jxR.setVisibility(0);
      return;
    }
    this.jxR.setVisibility(8);
  }
  
  public final void tm(int paramInt)
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.lvA.getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)this.lvB.getLayoutParams();
    if (paramInt <= 5)
    {
      localLayoutParams.height = this.lvC;
      this.lvB.setVisibility(8);
      return;
    }
    localLayoutParams.height = this.lvD;
    localLayoutParams.topMargin = (this.lvh * 2);
    localLayoutParams.bottomMargin = (this.lvh * 2);
    this.lvB.setVisibility(0);
    localLayoutParams1.height = this.lvD;
    localLayoutParams1.topMargin = (this.lvh * 2);
    localLayoutParams1.bottomMargin = (this.lvh * 2);
  }
  
  public final void tn(int paramInt)
  {
    int k = 0;
    int j = 0;
    int i;
    LinearLayout.LayoutParams localLayoutParams;
    if (paramInt <= 5)
    {
      paramInt = 0;
      for (;;)
      {
        i = j;
        if (paramInt >= this.lvA.getChildCount()) {
          break;
        }
        localLayoutParams = (LinearLayout.LayoutParams)this.lvA.getChildAt(paramInt).getLayoutParams();
        localLayoutParams.width = this.lvC;
        localLayoutParams.height = this.lvC;
        localLayoutParams.rightMargin = this.lvE;
        localLayoutParams.leftMargin = this.lvE;
        paramInt += 1;
      }
      while (i < this.lvB.getChildCount())
      {
        localLayoutParams = (LinearLayout.LayoutParams)this.lvB.getChildAt(i).getLayoutParams();
        localLayoutParams.width = this.lvD;
        localLayoutParams.height = this.lvD;
        localLayoutParams.rightMargin = this.lvE;
        localLayoutParams.leftMargin = this.lvE;
        i += 1;
      }
    }
    paramInt = 0;
    for (;;)
    {
      i = k;
      if (paramInt >= this.lvA.getChildCount()) {
        break;
      }
      localLayoutParams = (LinearLayout.LayoutParams)this.lvA.getChildAt(paramInt).getLayoutParams();
      localLayoutParams.width = this.lvD;
      localLayoutParams.height = this.lvD;
      localLayoutParams.rightMargin = this.lvF;
      localLayoutParams.leftMargin = this.lvF;
      paramInt += 1;
    }
    while (i < this.lvB.getChildCount())
    {
      localLayoutParams = (LinearLayout.LayoutParams)this.lvB.getChildAt(i).getLayoutParams();
      localLayoutParams.width = this.lvD;
      localLayoutParams.height = this.lvD;
      localLayoutParams.rightMargin = this.lvF;
      localLayoutParams.leftMargin = this.lvF;
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/multitalk/ui/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */