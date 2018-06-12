package com.tencent.mm.plugin.multitalk.a;

import android.app.Activity;
import com.tencent.mm.R.l;
import com.tencent.mm.ax.e;

public final class h
{
  private boolean ltY;
  private boolean ltZ;
  
  public final void reset()
  {
    this.ltZ = false;
    this.ltY = false;
  }
  
  public final void v(Activity paramActivity)
  {
    if (!this.ltY)
    {
      this.ltY = true;
      e.a(paramActivity, R.l.multitalk_not_support_video_tip, null);
    }
  }
  
  public final void w(Activity paramActivity)
  {
    if (!this.ltZ)
    {
      this.ltZ = true;
      e.a(paramActivity, R.l.voip_not_wifi_warnning_message, null);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/multitalk/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */