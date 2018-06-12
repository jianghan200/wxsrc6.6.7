package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.content.Intent;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Queue;

public final class d
  extends b
  implements h
{
  private Intent Hq;
  int fDQ = 0;
  
  public d(AppBrandLaunchProxyUI paramAppBrandLaunchProxyUI)
  {
    setBaseContext(paramAppBrandLaunchProxyUI);
  }
  
  private void akZ()
  {
    if ((isFinishing()) || (akY())) {
      return;
    }
    super.akX();
  }
  
  protected final String akW()
  {
    return this.Hq.getStringExtra("extra_launch_source_context");
  }
  
  protected final void akX() {}
  
  protected final boolean b(AppBrandInitConfig paramAppBrandInitConfig)
  {
    try
    {
      Class localClass = Class.forName(bi.oV(this.Hq.getStringExtra("extra_launch_source_context")));
      if ((localClass != null) && (AppBrandUI.class.isAssignableFrom(localClass))) {
        return false;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject = null;
      }
    }
    return super.b(paramAppBrandInitConfig);
  }
  
  protected final void e(AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject)
  {
    super.e(paramAppBrandInitConfig, paramAppBrandStatObject);
    paramAppBrandInitConfig = new d.1(this);
    if ((getBaseContext() instanceof AppBrandLaunchProxyUI))
    {
      ah.A(paramAppBrandInitConfig);
      return;
    }
    this.gho.offer(paramAppBrandInitConfig);
  }
  
  public final void onPause()
  {
    akZ();
  }
  
  public final void onResume()
  {
    int i = this.fDQ + 1;
    this.fDQ = i;
    if (i > 1) {
      akZ();
    }
  }
  
  public final void w(Intent paramIntent)
  {
    this.Hq = paramIntent;
    paramIntent = (LaunchParcel)paramIntent.getParcelableExtra("extra_launch_parcel");
    if (paramIntent == null)
    {
      finish();
      return;
    }
    a(paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/precondition/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */