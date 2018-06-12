package com.tencent.mm.app;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Process;
import com.tencent.mm.a.e;
import com.tencent.mm.loader.stub.BaseBuildInfo;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.tinker.loader.app.ApplicationLifeCycle;
import com.tencent.tinker.loader.app.ApplicationLike;
import com.tencent.tinker.loader.app.DefaultApplicationLike;
import java.lang.reflect.Constructor;

public class MMApplicationLike
  extends DefaultApplicationLike
{
  private static final String TAG = "MicroMsg.MMApplication";
  private j mMMApplicationLikeImpl = new j(this);
  private ApplicationLifeCycle wrapper;
  
  public MMApplicationLike(Application paramApplication, int paramInt, boolean paramBoolean, long paramLong1, long paramLong2, Intent paramIntent)
  {
    super(paramApplication, paramInt, paramBoolean, paramLong1, paramLong2, paramIntent);
  }
  
  public Resources getResources(Resources paramResources)
  {
    if (ad.getResources() == null) {
      return paramResources;
    }
    return ad.getResources();
  }
  
  public void onBaseContextAttached(Context paramContext)
  {
    com.tencent.mm.loader.stub.a.DEBUG = false;
    com.tencent.mm.loader.stub.a.duK = false;
    com.tencent.mm.loader.stub.a.PATCH_ENABLED = BaseBuildInfo.PATCH_ENABLED;
    com.tencent.mm.loader.stub.a.REV = BaseBuildInfo.REV;
    com.tencent.mm.loader.stub.a.CLIENT_VERSION = BaseBuildInfo.CLIENT_VERSION;
    com.tencent.mm.loader.stub.a.DEVICE_TYPE = BaseBuildInfo.DEVICE_TYPE;
    com.tencent.mm.loader.stub.a.TIME = BaseBuildInfo.TIME;
    com.tencent.mm.loader.stub.a.HOSTNAME = BaseBuildInfo.HOSTNAME;
    com.tencent.mm.loader.stub.a.BUILD_TAG = BaseBuildInfo.BUILD_TAG;
    com.tencent.mm.loader.stub.a.OWNER = BaseBuildInfo.OWNER;
    com.tencent.mm.loader.stub.a.COMMAND = BaseBuildInfo.COMMAND;
    com.tencent.mm.loader.stub.a.SVNPATH = BaseBuildInfo.SVNPATH;
    com.tencent.mm.loader.stub.a.PATCH_REV = BaseBuildInfo.PATCH_REV;
    com.tencent.mm.loader.stub.a.PATCH_TINKER_FLAG = BaseBuildInfo.PATCH_TINKER_FLAG;
    com.tencent.mm.loader.stub.a.ENABLE_STETHO = BaseBuildInfo.ENABLE_STETHO;
    com.tencent.mm.loader.stub.a.EX_DEVICE_LOGIN = BaseBuildInfo.EX_DEVICE_LOGIN;
    com.tencent.mm.loader.stub.a.duL = Boolean.valueOf(BaseBuildInfo.REDESIGN_ENTRANCE);
    com.tencent.mm.sdk.platformtools.d.DEBUG = false;
    com.tencent.mm.sdk.platformtools.d.BUILD_TAG = "MicroMessenger_Android_GIT_RELEASE_GRADLE #6878";
    com.tencent.mm.sdk.platformtools.d.OWNER = "amm_code_helper";
    com.tencent.mm.sdk.platformtools.d.HOSTNAME = "45ea8765cf33";
    com.tencent.mm.sdk.platformtools.d.TIME = "2018-05-31 14:12:58";
    com.tencent.mm.sdk.platformtools.d.COMMAND = "null";
    com.tencent.mm.sdk.platformtools.d.REV = "f6b4b06b7ce8bc23015c8c8704a7aaf7d858dfb6";
    com.tencent.mm.sdk.platformtools.d.SVNPATH = "origin/RB-2018-APR@git";
    com.tencent.mm.sdk.platformtools.d.CLIENT_VERSION = "0x26060736";
    com.tencent.mm.sdk.platformtools.d.sFx = true;
    com.tencent.mm.sdk.platformtools.d.EX_DEVICE_LOGIN = false;
    com.tencent.mm.sdk.platformtools.d.duK = false;
    com.tencent.mm.sdk.platformtools.d.REDESIGN_ENTRANCE = false;
    com.tencent.mm.sdk.platformtools.d.sFy = false;
    super.onBaseContextAttached(paramContext);
    Object localObject = this.mMMApplicationLikeImpl;
    if ((com.tencent.tinker.lib.e.b.c(j.applicationLike)) && (com.tencent.tinker.lib.e.b.d(j.applicationLike)))
    {
      com.tencent.tinker.lib.a.a.a(j.applicationLike, "armeabi-v7a");
      com.tencent.tinker.lib.a.a.a(j.applicationLike, "armeabi");
    }
    long l1 = j.applicationLike.getApplicationStartMillisTime();
    j.bya = l1;
    b.bya = l1;
    j.a(j.applicationLike);
    j.byA = j.byA + "/" + localObject.hashCode();
    ad.le(false);
    ad.setContext(j.applicationLike.getApplication());
    String str = bi.an(paramContext, Process.myPid());
    x.Da(0);
    b.bqA = str;
    if (!com.tencent.mm.loader.stub.a.DEBUG) {
      h.a(j.applicationLike.getApplication(), str);
    }
    l1 = System.currentTimeMillis();
    com.tencent.mm.sdk.e.a locala = new com.tencent.mm.sdk.e.a(com.tencent.mm.loader.stub.b.duN + "NowRev.ini");
    ((j)localObject).byB = locala.getValue("NowRev");
    ((j)localObject).byC = com.tencent.mm.loader.stub.a.baseRevision();
    long l2 = System.currentTimeMillis();
    ((j)localObject).byD = (l2 - l1);
    ((j)localObject).byE = 0L;
    if (!((j)localObject).byC.equals(((j)localObject).byB))
    {
      ad.sGA = true;
      e.l(j.applicationLike.getApplication().getDir("lib", 0));
      e.l(j.applicationLike.getApplication().getDir("dex", 0));
      e.l(j.applicationLike.getApplication().getDir("cache", 0));
      e.l(j.applicationLike.getApplication().getDir("recover_lib", 0));
      com.tencent.tinker.lib.e.b.f(j.applicationLike);
      locala.fT("NowRev", ((j)localObject).byC);
      ((j)localObject).byE = (System.currentTimeMillis() - l2);
      x.w("MicroMsg.MMApplicationLikeImpl", "application hash:%s, %s", new Object[] { j.byA, bi.cjd().toString() });
    }
    x.i("MicroMsg.MMApplicationLikeImpl", "clearOldDirIfNewVersion oldversion:%s, newversion:%s, gettime:%d, settime:%d", new Object[] { ((j)localObject).byB, ((j)localObject).byC, Long.valueOf(((j)localObject).byD), Long.valueOf(((j)localObject).byE) });
    if ((com.tencent.mm.loader.stub.a.DEBUG) || (com.tencent.mm.loader.stub.a.duK)) {
      h.a(j.applicationLike.getApplication(), str);
    }
    localObject = b.bqA;
    try
    {
      this.wrapper = ((ApplicationLifeCycle)Class.forName(ad.getPackageName() + ".app.MMApplicationWrapper").getConstructor(new Class[] { ApplicationLike.class, String.class }).newInstance(new Object[] { this, localObject }));
      this.wrapper.onBaseContextAttached(paramContext);
      return;
    }
    catch (Exception paramContext)
    {
      x.printErrStackTrace("MicroMsg.MMApplication", paramContext, "failed to create application wrapper class", new Object[0]);
      throw new RuntimeException("failed to create application wrapper class", paramContext);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    x.d("MicroMsg.MMApplication", "configuration changed");
    super.onConfigurationChanged(paramConfiguration);
    if (this.wrapper != null) {
      this.wrapper.onConfigurationChanged(paramConfiguration);
    }
  }
  
  public void onCreate()
  {
    if (this.wrapper != null) {
      this.wrapper.onCreate();
    }
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    if (this.wrapper != null) {
      this.wrapper.onLowMemory();
    }
  }
  
  public void onTerminate()
  {
    super.onTerminate();
    if (this.wrapper != null) {
      this.wrapper.onTerminate();
    }
  }
  
  public void onTrimMemory(int paramInt)
  {
    super.onTrimMemory(paramInt);
    if (this.wrapper != null) {
      this.wrapper.onTrimMemory(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/app/MMApplicationLike.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */