package com.tencent.mm.plugin.appbrand.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.os.SystemClock;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.s.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMFragmentActivity.a;

public final class AppBrandEmbedUI
  extends AppBrandUI
{
  public final long gul = SystemClock.elapsedRealtimeNanos();
  
  private boolean anl()
  {
    return (this.gwx != null) && (this.gwx.aaA() != null) && (this.gwx.aaA().aap());
  }
  
  static boolean x(Intent paramIntent)
  {
    if (paramIntent != null) {}
    try
    {
      if (paramIntent.getComponent() != null)
      {
        boolean bool = paramIntent.getComponent().getClassName().equals(AppBrandEmbedUI.class.getName());
        if (bool) {
          return true;
        }
      }
      return false;
    }
    catch (Exception paramIntent)
    {
      x.e("MicroMsg.AppBrandEmbedUI", "isIntentForEmbedUI e=%s", new Object[] { paramIntent });
    }
    return false;
  }
  
  public final void finish()
  {
    if (isFinishing()) {
      return;
    }
    anC();
  }
  
  protected final void initActivityCloseAnimation()
  {
    if (anl())
    {
      super.overridePendingTransition(MMFragmentActivity.a.tnE, MMFragmentActivity.a.tnF);
      return;
    }
    overridePendingTransition(s.a.anim_not_change, s.a.appbrand_ui_push_close_exit);
  }
  
  protected final void initActivityOpenAnimation(Intent paramIntent)
  {
    if (anl())
    {
      super.overridePendingTransition(MMFragmentActivity.a.tnC, MMFragmentActivity.a.tnD);
      return;
    }
    super.overridePendingTransition(s.a.appbrand_ui_push_open_enter, s.a.anim_not_change);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandEmbedUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */