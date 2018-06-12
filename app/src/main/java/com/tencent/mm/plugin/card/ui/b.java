package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import com.tencent.mm.plugin.card.d.c;
import com.tencent.mm.plugin.card.ui.view.m;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  implements Application.ActivityLifecycleCallbacks
{
  private int hBn = 0;
  
  public static Application ano()
  {
    return (Application)ad.getContext().getApplicationContext();
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity) {}
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity)
  {
    if (this.hBn < 0)
    {
      if ((paramActivity == null) || (!(paramActivity instanceof CardDetailUI))) {
        break label80;
      }
      paramActivity = (CardDetailUI)paramActivity;
      if (paramActivity.hBC != null)
      {
        com.tencent.mm.plugin.card.ui.view.g localg = paramActivity.hBC.hCa;
        if ((localg != null) && ((localg instanceof m)))
        {
          x.i("MicroMsg.CardAcitivityLifecycleListener", "CardAcitivityLifecycleListener on activity from background to foreground！is showing CardDetailUI,updateCodeView!");
          paramActivity.hBC.hCa.d(c.hIA);
        }
      }
    }
    for (;;)
    {
      this.hBn += 1;
      return;
      label80:
      com.tencent.mm.kernel.g.Em().H(new b.1(this));
    }
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    this.hBn -= 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */