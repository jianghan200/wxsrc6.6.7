package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

public final class i
  extends LinearLayout
{
  private Context context;
  private int hjO = 0;
  private int nLH = 6;
  private LinearLayout nLI;
  
  public i(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
    setOrientation(1);
  }
  
  public final void addView(View paramView)
  {
    if (this.hjO % this.nLH == 0)
    {
      this.nLI = new LinearLayout(this.context);
      this.nLI.setOrientation(0);
      this.nLI.addView(paramView);
      super.addView(this.nLI);
    }
    for (;;)
    {
      this.hjO += 1;
      return;
      this.nLI.addView(paramView);
    }
  }
  
  public final void setLineMaxCounte(int paramInt)
  {
    this.nLH = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */