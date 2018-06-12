package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.LinkedList;
import java.util.Queue;

abstract class b
  extends MutableContextWrapper
{
  final Queue<Runnable> gho = new LinkedList();
  private ah ghp;
  
  public b()
  {
    super(ad.getContext());
  }
  
  private void s(Runnable paramRunnable)
  {
    if ((getBaseContext() instanceof AppBrandLaunchProxyUI))
    {
      paramRunnable.run();
      return;
    }
    this.gho.offer(paramRunnable);
  }
  
  protected final void a(LaunchParcel paramLaunchParcel)
  {
    ah localah = new ah("AppBrandLaunchProxyUI-PrepareThread");
    this.ghp = localah;
    localah.H(new b.3(this, paramLaunchParcel));
  }
  
  protected abstract String akW();
  
  protected void akX()
  {
    s(new b.1(this));
  }
  
  protected final boolean akY()
  {
    return ((getBaseContext() instanceof AppBrandLaunchProxyUI)) && (((AppBrandLaunchProxyUI)getBaseContext()).isDestroyed());
  }
  
  protected boolean b(AppBrandInitConfig paramAppBrandInitConfig)
  {
    if ((paramAppBrandInitConfig.fqs) || (e.vD(paramAppBrandInitConfig.appId)) || (paramAppBrandInitConfig.aaq())) {}
    for (int i = 1; i == 0; i = 0) {
      return true;
    }
    return false;
  }
  
  protected void e(AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject)
  {
    if (paramAppBrandInitConfig != null) {
      k.a(getBaseContext(), paramAppBrandInitConfig, paramAppBrandStatObject);
    }
    akX();
    if (this.ghp != null) {
      this.ghp.H(new b.4(this));
    }
  }
  
  protected final void finish()
  {
    e(null, null);
  }
  
  protected final boolean isFinishing()
  {
    return ((getBaseContext() instanceof AppBrandLaunchProxyUI)) && (((AppBrandLaunchProxyUI)getBaseContext()).isFinishing());
  }
  
  public final void setBaseContext(Context paramContext)
  {
    super.setBaseContext(paramContext);
    if ((getBaseContext() instanceof AppBrandLaunchProxyUI)) {
      while (!this.gho.isEmpty()) {
        ((Runnable)this.gho.poll()).run();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/precondition/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */