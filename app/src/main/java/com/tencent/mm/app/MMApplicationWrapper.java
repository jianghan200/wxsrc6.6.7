package com.tencent.mm.app;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import com.tencent.mm.boot.a.a;
import com.tencent.mm.booter.c;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.b.h.2;
import com.tencent.mm.kernel.b.h.3;
import com.tencent.mm.kernel.b.h.4;
import com.tencent.mm.kernel.b.h.5;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.splash.m;
import com.tencent.tinker.loader.app.ApplicationLifeCycle;
import com.tencent.tinker.loader.app.ApplicationLike;

public class MMApplicationWrapper
  implements ApplicationLifeCycle
{
  private static final String TAG = "MicroMsg.MMApplicationWrapper";
  public Application app;
  private final ApplicationLike lifeCycle;
  private h profile = null;
  private String thisProcess = "";
  
  public MMApplicationWrapper(ApplicationLike paramApplicationLike, String paramString)
  {
    com.tencent.mm.blink.a.aB(paramApplicationLike.getApplicationStartMillisTime());
    this.app = paramApplicationLike.getApplication();
    this.lifeCycle = paramApplicationLike;
    this.thisProcess = paramString;
  }
  
  private void setupXLogDebugger(h paramh)
  {
    c localc = paramh.cXF;
    if (paramh.ES()) {
      localc.ez("MM");
    }
    do
    {
      return;
      if (paramh.gn(":push"))
      {
        localc.ez("PUSH");
        return;
      }
      if (paramh.gn(":tools"))
      {
        localc.ez("TOOL");
        return;
      }
      if (paramh.gn(":sandbox"))
      {
        localc.ez("SANDBOX");
        return;
      }
      if (paramh.gn(":exdevice"))
      {
        localc.ez("EXDEVICE");
        return;
      }
      if (paramh.gn(":patch"))
      {
        localc.ez("PATCH");
        return;
      }
      if (paramh.gn(":appbrand"))
      {
        localc.ez("APPBRAND");
        return;
      }
      if (paramh.gn(":TMAssistantDownloadSDKService"))
      {
        localc.ez("TMSDK");
        return;
      }
    } while (!paramh.gn(":dexopt"));
    localc.ez("DEXOPT");
  }
  
  public void onBaseContextAttached(Context paramContext)
  {
    com.tencent.mm.kernel.a.a.drq = SystemClock.elapsedRealtime();
    this.profile = new h(this.thisProcess, this.app, this.lifeCycle);
    n.vd();
    k.b("stlport_shared", paramContext.getClassLoader());
    k.b("c++_shared", paramContext.getClassLoader());
    k.b(com.tencent.mm.xlog.app.a.uZO, paramContext.getClassLoader());
    this.profile.cXF = c.bj(this.profile.dsQ);
    setupXLogDebugger(this.profile);
    com.tencent.mm.splash.a.e(this.app);
    x.v("PreventAccessModification", "profile %s", new Object[] { q.bzn });
    if (!n.cP(this.thisProcess)) {
      q.a(this.profile, "com.tencent.mm.app.WeChatSplashStartup");
    }
    for (;;)
    {
      o.h(a.a.class);
      o.cQ("com.tencent.mm.boot");
      return;
      x.i("MicroMsg.MMApplicationWrapper", "is plain process. load nothing");
      q.a(this.profile, null);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (this.profile != null)
    {
      h localh = this.profile;
      localh.dsT.a(new h.5(localh, paramConfiguration));
    }
  }
  
  public void onCreate() {}
  
  public void onLowMemory()
  {
    if (this.profile != null)
    {
      h localh = this.profile;
      localh.dsT.a(new h.2(localh));
    }
  }
  
  public void onTerminate()
  {
    if (this.profile != null)
    {
      h localh = this.profile;
      localh.dsT.a(new h.4(localh));
    }
  }
  
  public void onTrimMemory(int paramInt)
  {
    if (this.profile != null)
    {
      h localh = this.profile;
      localh.dsT.a(new h.3(localh, paramInt));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/app/MMApplicationWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */