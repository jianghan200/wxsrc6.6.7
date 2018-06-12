package com.tencent.mm.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;

public class d
  implements View.OnClickListener
{
  private long grW = 0L;
  private View.OnClickListener mtE;
  
  public void onClick(View paramView)
  {
    long l = System.currentTimeMillis();
    if (l - this.grW >= 500L)
    {
      this.mtE.onClick(paramView);
      this.grW = l;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/wallet_core/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */