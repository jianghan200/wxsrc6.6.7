package com.tencent.mm.app;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Process;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ab.u;
import com.tencent.mm.ab.u.a;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.console.Shell;
import com.tencent.mm.console.Shell.Receiver;
import com.tencent.mm.g.a.cg;
import com.tencent.mm.g.a.hc;
import com.tencent.mm.g.a.ja;
import com.tencent.mm.g.a.kl;
import com.tencent.mm.g.a.oi;
import com.tencent.mm.g.a.ow;
import com.tencent.mm.g.a.rr;
import com.tencent.mm.kiss.a.b.2;
import com.tencent.mm.model.al;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.d.a.1;
import com.tencent.mm.model.d.a.2;
import com.tencent.mm.model.f.a;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.plugin.report.service.IKVReportNotify;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.ui.i.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.az.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.AccountDeletedAlphaAlertUI;
import com.tencent.mm.ui.tools.NewTaskUI;
import java.io.File;
import java.util.Locale;
import java.util.Map;

public final class WorkerProfile
  extends com.tencent.mm.compatible.loader.e
  implements com.tencent.mm.ab.e, u.a, com.tencent.mm.model.ak, f.a, IKVReportNotify
{
  public static final String byu = com.tencent.mm.sdk.platformtools.ad.getPackageName();
  private static WorkerProfile bzx;
  private com.tencent.mm.model.ad bzA;
  private boolean bzB;
  private boolean bzC = false;
  @Deprecated
  public boolean bzD;
  public boolean bzE;
  private final int bzF = 0;
  private final int bzG = 1;
  private int bzH;
  private final int bzI = 2130706432;
  private StringBuilder bzJ = new StringBuilder();
  private com.tencent.mm.booter.notification.a.g bzK;
  private com.tencent.mm.h.b bzL;
  public final s bzM = new s();
  public final r bzN = new r();
  private final Shell bzd = new Shell();
  private final com.tencent.mm.console.a bzw = new com.tencent.mm.console.a();
  private al bzy;
  private az.b bzz;
  protected Locale locale;
  
  public WorkerProfile()
  {
    bzx = this;
  }
  
  private void a(Configuration paramConfiguration)
  {
    w.c(paramConfiguration);
    paramConfiguration = be.getProperty("system_property_key_locale");
    if ((paramConfiguration != null) && (paramConfiguration.length() > 0))
    {
      if (!"language_default".equalsIgnoreCase(paramConfiguration)) {
        break label154;
      }
      this.locale = Locale.getDefault();
    }
    for (;;)
    {
      Object localObject = MMActivity.initLanguage(this.app.getBaseContext());
      x.d("MicroMsg.WorkerProfile", "onConfigurationChanged, locale = %s, n = %s, lang = %s", new Object[] { this.locale, localObject, paramConfiguration });
      if ((localObject == null) || (this.locale == null) || (((Locale)localObject).equals(this.locale)) || (au.HX())) {}
      try
      {
        paramConfiguration = au.DF().dJs;
        if (paramConfiguration != null)
        {
          paramConfiguration = paramConfiguration.Lr();
          if (paramConfiguration != null)
          {
            au.HU();
            int i = com.tencent.mm.model.c.Df();
            paramConfiguration.x(new byte[0], i);
          }
        }
      }
      catch (Exception paramConfiguration)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.WorkerProfile", paramConfiguration, "", new Object[0]);
          x.printErrStackTrace("MicroMsg.WorkerProfile", paramConfiguration, "what the f$!k", new Object[0]);
        }
      }
      x.w("MicroMsg.WorkerProfile", "language changed, restart process");
      System.exit(-1);
      return;
      label154:
      localObject = paramConfiguration.split("_");
      if ((localObject != null) && (localObject.length >= 2))
      {
        x.d("MicroMsg.WorkerProfile", "initLanguage arr.length = %s", new Object[] { Integer.valueOf(localObject.length) });
        this.locale = new Locale(localObject[0], localObject[1]);
      }
      else
      {
        this.locale = new Locale(paramConfiguration);
      }
    }
  }
  
  public static WorkerProfile vt()
  {
    return bzx;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.WorkerProfile", "onSceneEnd dkwt type:%d [%d,%d,%s]", new Object[] { Integer.valueOf(paraml.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 3) && (paramInt2 == -1)) {
      x.i("MicroMsg.WorkerProfile", "getStack([ %s ]), ThreadID: %s", new Object[] { com.tencent.mm.sdk.platformtools.bi.cjd(), Long.valueOf(Thread.currentThread().getId()) });
    }
    if ((paramInt1 == 4) && (paramInt2 == 62534)) {
      if (com.tencent.mm.sdk.platformtools.bi.oW(paramString)) {
        x.e("MicroMsg.WorkerProfile", "summerdiz -3002 but errMsg is null");
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          paraml = paramString;
          if (paramString.startsWith("autoauth_errmsg_")) {
            paraml = paramString.substring(16);
          }
          x.i("MicroMsg.WorkerProfile", "summerdiz MM_ERR_IDCDISASTER -3002 errStr:%s", new Object[] { paraml });
          paramString = new com.tencent.mm.g.a.ah();
          paramString.bHy.type = 4;
          paramString.bHy.bHA = paraml;
          com.tencent.mm.sdk.b.a.sFg.m(paramString);
          return;
          if ((!au.HX()) || (paramInt1 != 4) || ((paramInt2 != -6) && (paramInt2 != 65226) && (paramInt2 != 65225)) || (paramString == null) || (!paramString.startsWith("autoauth_errmsg_"))) {
            break;
          }
        } while (NewTaskUI.czP() != null);
        paramString = new Intent();
        paramString.setClass(com.tencent.mm.sdk.platformtools.ad.getContext(), NewTaskUI.class).addFlags(268435456);
        com.tencent.mm.sdk.platformtools.ad.getContext().startActivity(paramString);
        return;
      } while ((paramInt1 != 4) || (paramInt2 != 65323));
      paraml = new ja();
      paraml.bSG.status = 0;
      paraml.bSG.aAk = 3;
      com.tencent.mm.sdk.b.a.sFg.m(paraml);
    } while (AccountDeletedAlphaAlertUI.czr() != null);
    paraml = new Intent();
    paraml.setClass(com.tencent.mm.sdk.platformtools.ad.getContext(), AccountDeletedAlphaAlertUI.class).addFlags(268435456);
    paraml.putExtra("errmsg", paramString);
    com.tencent.mm.sdk.platformtools.ad.getContext().startActivity(paraml);
  }
  
  public final void cW(String paramString)
  {
    x.i("MicroMsg.WorkerProfile", "summerdiz onOldDisaster errStr[%s]", new Object[] { paramString });
    com.tencent.mm.g.a.ah localah = new com.tencent.mm.g.a.ah();
    localah.bHy.type = 4;
    localah.bHy.bHA = paramString;
    com.tencent.mm.sdk.b.a.sFg.m(localah);
  }
  
  public final void cX(String paramString)
  {
    x.i("MicroMsg.WorkerProfile", "summerdiz onReMoveNoticeId:%s", new Object[] { paramString });
    com.tencent.mm.g.a.ah localah = new com.tencent.mm.g.a.ah();
    localah.bHy.type = 1;
    localah.bHy.bHA = paramString;
    com.tencent.mm.sdk.b.a.sFg.m(localah);
  }
  
  public final al getNotification()
  {
    if (this.bzy == null) {
      this.bzy = new com.tencent.mm.booter.notification.b(this.app);
    }
    return this.bzy;
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    String str = be.getProperty("system_property_key_locale");
    if ((str != null) && (str.length() > 0)) {
      this.locale = new Locale(str);
    }
    try
    {
      if (!this.bzC)
      {
        this.bzB = true;
        return;
      }
      a(paramConfiguration);
      return;
    }
    finally {}
  }
  
  public final void onCreate()
  {
    long l2 = System.currentTimeMillis();
    a.cI(byu);
    x.v("MicroMsg.WorkerProfile", "workerProfile onCreate, step 1");
    x.i("MicroMsg.WorkerProfile", "start time check onCreate proc:%s pid:%d" + byu + Process.myPid());
    x.i("MicroMsg.WorkerProfile", "appOnCreate start getAccStg %b, thread name %s", new Object[] { Boolean.valueOf(true), Thread.currentThread().getName() });
    l1 = System.currentTimeMillis();
    Object localObject1 = com.tencent.mm.model.d.a.JA();
    com.tencent.mm.model.d.a.byP = byu;
    if (com.tencent.mm.sdk.platformtools.ad.sGA)
    {
      bool = com.tencent.mm.a.e.deleteFile(com.tencent.mm.model.d.a.dEI);
      x.i("MicroMsg.HandlerTraceManager", "trace setup delete old file ret: " + bool);
    }
    ((com.tencent.mm.model.d.a)localObject1).dEX = System.currentTimeMillis();
    ag.setLogCallback(new a.1((com.tencent.mm.model.d.a)localObject1));
    com.tencent.mm.sdk.platformtools.ak.a("NetsceneQueue forbid in ", new a.2((com.tencent.mm.model.d.a)localObject1));
    au.DF().a(-1, this);
    u.a(this);
    au.HY().dAx = this;
    au.a(new WorkerProfile.1(this));
    au.getSysCmdMsgExtension().a("getkvidkeystg", new WorkerProfile.12(this), true);
    localObject1 = this.app;
    com.tencent.mm.sdk.platformtools.e.fq((Context)localObject1);
    com.tencent.mm.sdk.platformtools.e.fr((Context)localObject1);
    Object localObject3 = ((Context)localObject1).getPackageManager();
    for (;;)
    {
      try
      {
        localObject1 = ((PackageManager)localObject3).getPackageInfo(((Context)localObject1).getPackageName(), 0).applicationInfo.sourceDir;
        x.i("MicroMsg.WorkerProfile", "initChannelUtil sourceFile = %s", new Object[] { localObject1 });
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        x.e("MicroMsg.WorkerProfile", "initChannelUtil NameNotFoundException");
        continue;
        if (localException2.bxj + 8 - 8 < 0) {
          continue;
        }
        com.tencent.mm.c.b localb = new com.tencent.mm.c.b();
        localb.aG(com.tencent.mm.a.e.f(localNameNotFoundException, i - (localException2.bxj + 8 - 8) - 8, localException2.bxj + 8 - 8));
        new com.tencent.mm.c.a(localb);
        x.i("MicroMsg.WorkerProfile", "checkApkExternal, check ok");
        continue;
        x.e("MicroMsg.WorkerProfile", "checkApkExternal header wrong");
        continue;
        if (localNameNotFoundException != null) {
          continue;
        }
        bool = true;
        x.e("MicroMsg.WorkerProfile", "initChannelUtil something null %s", new Object[] { Boolean.valueOf(bool) });
        continue;
      }
      catch (Exception localException1)
      {
        int j;
        x.e("MicroMsg.WorkerProfile", "Exception in initChannel, %s", new Object[] { localException1.getMessage() });
        continue;
        bool = false;
        continue;
        try
        {
          Object localObject2 = localException1.getSharedPreferences("crash_status_file", 4);
          int k = ((SharedPreferences)localObject2).getInt("channel", -1);
          int m = ((SharedPreferences)localObject2).getInt("version", 0);
          if ((k == i) && (m == j)) {
            continue;
          }
          localObject2 = ((SharedPreferences)localObject2).edit();
          ((SharedPreferences.Editor)localObject2).putInt("channel", i);
          ((SharedPreferences.Editor)localObject2).putInt("version", j);
          ((SharedPreferences.Editor)localObject2).commit();
        }
        catch (Throwable localThrowable) {}
        continue;
        String str = com.tencent.mm.sdk.platformtools.e.bxl;
        continue;
        l1 = 6L;
        continue;
        int i = 5002;
        continue;
      }
      try
      {
        i = com.tencent.mm.a.e.cm((String)localObject1);
        x.i("MicroMsg.WorkerProfile", "checkApkExternal, fileSize = %s", new Object[] { Integer.valueOf(i) });
        if (i >= 8) {
          continue;
        }
      }
      catch (Exception localException2)
      {
        x.printErrStackTrace("MicroMsg.WorkerProfile", localException2, "", new Object[0]);
        x.e("MicroMsg.WorkerProfile", "Exception in checkApkExternal, %s", new Object[] { localException2.getMessage() });
        continue;
      }
      localObject1 = com.tencent.mm.c.a.cD((String)localObject1);
      if ((localObject1 == null) || (((com.tencent.mm.c.a)localObject1).bxh == null)) {
        continue;
      }
      x.i("MicroMsg.WorkerProfile", "apk external info not null");
      if (((com.tencent.mm.c.a)localObject1).bxh.bxk != 0)
      {
        com.tencent.mm.sdk.platformtools.e.bxk = ((com.tencent.mm.c.a)localObject1).bxh.bxk;
        x.i("MicroMsg.WorkerProfile", "read channelId from apk external");
      }
      if (((com.tencent.mm.c.a)localObject1).bxh.bxm != 0)
      {
        com.tencent.mm.sdk.platformtools.e.bxm = ((com.tencent.mm.c.a)localObject1).bxh.bxm;
        x.i("MicroMsg.WorkerProfile", "ext.updateMode = %s", new Object[] { Integer.valueOf(com.tencent.mm.sdk.platformtools.e.bxm) });
      }
      if (((com.tencent.mm.c.a)localObject1).bxh.bxn != null) {
        com.tencent.mm.sdk.platformtools.e.sFA = com.tencent.mm.sdk.platformtools.bi.getInt(((com.tencent.mm.c.a)localObject1).bxh.bxn, 0);
      }
      if (((com.tencent.mm.c.a)localObject1).bxh.bxo != null) {
        com.tencent.mm.sdk.platformtools.e.sFB = ((com.tencent.mm.c.a)localObject1).bxh.bxo;
      }
      if (((com.tencent.mm.c.a)localObject1).bxh.bxl != null) {
        com.tencent.mm.sdk.platformtools.e.bxl = ((com.tencent.mm.c.a)localObject1).bxh.bxl;
      }
      if (((com.tencent.mm.c.a)localObject1).bxh.bxr)
      {
        com.tencent.mm.sdk.platformtools.e.sFF = ((com.tencent.mm.c.a)localObject1).bxh.bxr;
        x.i("MicroMsg.WorkerProfile", "ext.isNokiaol = %s", new Object[] { Boolean.valueOf(com.tencent.mm.sdk.platformtools.e.sFF) });
      }
      if (((com.tencent.mm.c.a)localObject1).bxh.bxq != 0)
      {
        com.tencent.mm.sdk.platformtools.e.bxq = ((com.tencent.mm.c.a)localObject1).bxh.bxq;
        x.i("MicroMsg.WorkerProfile", "ext.autoAddAccount = %s", new Object[] { Integer.valueOf(com.tencent.mm.sdk.platformtools.e.bxq) });
      }
      if (((com.tencent.mm.c.a)localObject1).bxh.bxp)
      {
        com.tencent.mm.sdk.platformtools.e.sFE = ((com.tencent.mm.c.a)localObject1).bxh.bxp;
        x.i("MicroMsg.WorkerProfile", "ext.shouldShowGprsAlert = %s", new Object[] { Boolean.valueOf(com.tencent.mm.sdk.platformtools.e.sFE) });
      }
      d.uN();
      localObject1 = com.tencent.mm.booter.c.bj(this.app);
      if ((localObject1 != null) && (((com.tencent.mm.booter.c)localObject1).cWO != -1)) {
        com.tencent.mm.sdk.platformtools.e.bxk = ((com.tencent.mm.booter.c)localObject1).cWO;
      }
      localObject1 = this.app.getApplicationContext();
      i = com.tencent.mm.sdk.platformtools.e.bxk;
      j = com.tencent.mm.protocal.d.qVN;
      if ((localObject1 != null) && (i >= 0) && (j >= 637534208)) {
        continue;
      }
      if (com.tencent.mm.sdk.platformtools.e.sFA > 0) {
        com.tencent.mm.sdk.platformtools.e.sFC = true;
      }
      com.tencent.mm.bg.d.cfH();
      localObject3 = new StringBuilder("android-");
      if (!com.tencent.mm.sdk.platformtools.bi.oW(com.tencent.mm.sdk.platformtools.e.bxl)) {
        continue;
      }
      localObject1 = Integer.valueOf(Build.VERSION.SDK_INT);
      com.tencent.mm.protocal.d.DEVICE_TYPE = localObject1;
      if (!com.tencent.mm.sdk.platformtools.bi.oW(com.tencent.mm.sdk.a.b.chq())) {
        com.tencent.mm.protocal.d.DEVICE_TYPE = "android-" + com.tencent.mm.sdk.a.b.chq();
      }
      x.v("MicroMsg.WorkerProfile", "set device type :%s  %s", new Object[] { com.tencent.mm.protocal.d.DEVICE_TYPE, com.tencent.mm.sdk.a.b.chq() });
      this.locale = MMActivity.initLanguage(this.app.getBaseContext());
      if (com.tencent.mm.sdk.a.b.chp())
      {
        localObject1 = this.bzd;
        localObject3 = com.tencent.mm.sdk.platformtools.ad.getContext();
        if (((Shell)localObject1).dhr == null)
        {
          ((Shell)localObject1).dhr = new Shell.Receiver();
          ((Context)localObject3).registerReceiver(((Shell)localObject1).dhr, Shell.dht);
        }
      }
      localObject1 = this.bzw;
      com.tencent.mm.sdk.b.a.sFg.b((com.tencent.mm.sdk.b.c)localObject1);
      localObject1 = new c();
      x.d("MicroMsg.AvatarDrawable", "setLoader" + localObject1);
      com.tencent.mm.pluginsdk.ui.a.b.lZs = (i.a)localObject1;
      com.tencent.mm.pluginsdk.f.e.qBn = new WorkerProfile.25(this);
      com.tencent.mm.kernel.g.a(com.tencent.mm.ab.h.class, new com.tencent.mm.kernel.c.e(this.bzN));
      com.tencent.mm.kernel.g.a(com.tencent.mm.pluginsdk.g.class, new com.tencent.mm.kernel.c.e(this.bzN));
      com.tencent.mm.kernel.g.a(i.class, new com.tencent.mm.kernel.c.e(this.bzN));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.brandservice.a.a.class, new com.tencent.mm.plugin.bbom.d());
      com.tencent.mm.sdk.b.a.sFg.b(new com.tencent.mm.app.plugin.b.a.a());
      if (this.bzy == null) {
        this.bzy = new com.tencent.mm.booter.notification.b(this.app);
      }
      this.bzL = new com.tencent.mm.h.b();
      localObject1 = this.bzL;
      x.i("MicroMsg.BroadcastController", "summerdiz init");
      com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.h.b)localObject1).cZQ);
      if (this.bzB)
      {
        a(null);
        this.bzB = false;
      }
      localObject1 = com.tencent.mm.kiss.a.b.EY();
      com.tencent.mm.sdk.b.a.sFg.b(new b.2((com.tencent.mm.kiss.a.b)localObject1));
      com.tencent.mm.sdk.b.a.sFg.b(new com.tencent.mm.plugin.account.bind.ui.e());
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.23(this));
      com.tencent.mm.sdk.b.a.sFg.b(new com.tencent.mm.sdk.b.c() {});
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.30(this));
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.31(this));
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.32(this));
      com.tencent.mm.sdk.b.a.sFg.b(new com.tencent.mm.sdk.b.c() {});
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.34(this));
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.2(this));
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.3(this));
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.4(this));
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.5(this));
      com.tencent.mm.sdk.b.a.sFg.b(new com.tencent.mm.sdk.b.c() {});
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.7(this));
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.8(this));
      com.tencent.mm.sdk.b.a.sFg.b(new com.tencent.mm.sdk.b.c() {});
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.10(this));
      com.tencent.mm.sdk.b.a.sFg.b(new com.tencent.mm.sdk.b.c() {});
      com.tencent.mm.sdk.b.a.sFg.b(new com.tencent.mm.sdk.b.c() {});
      com.tencent.mm.sdk.b.a.sFg.b(new com.tencent.mm.sdk.b.c() {});
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.15(this));
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.16(this));
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.17(this));
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.18(this));
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.19(this));
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.20(this));
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.21(this));
      com.tencent.mm.sdk.b.a.sFg.b(new WorkerProfile.22(this));
      com.tencent.mm.sdk.b.a.sFg.b(new l(2, 12));
      com.tencent.mm.plugin.messenger.a.g.lbL = new com.tencent.mm.ui.transmit.d();
      com.tencent.mm.pluginsdk.p.a.qyl = new com.tencent.mm.app.plugin.a();
      com.tencent.mm.pluginsdk.o.a.qyj = new com.tencent.mm.app.plugin.c();
      com.tencent.mm.pluginsdk.ui.d.b.a.qPF = com.tencent.mm.app.plugin.d.vA();
      if (!au.Dr()) {
        au.HU();
      }
      localObject1 = new cg();
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
      this.bzC = true;
      Log.setLogImpl(new WorkerProfile.24(this));
      x.d("MicroMsg.WorkerProfile", "start time check WorkerProfile appOnCreate use time " + (System.currentTimeMillis() - l1));
      localObject1 = new WorkerProfile.26(com.tencent.mm.sdk.platformtools.ad.getContext());
      ((WorkerProfile.26)localObject1).map.put("qqmail", Integer.valueOf(R.l.hardcode_plugin_qqmail_nick));
      ((WorkerProfile.26)localObject1).map.put("fmessage", Integer.valueOf(R.l.hardcode_plugin_fmessage_nick));
      ((WorkerProfile.26)localObject1).map.put("floatbottle", Integer.valueOf(R.l.hardcode_plugin_bottle_nick));
      ((WorkerProfile.26)localObject1).map.put("lbsapp", Integer.valueOf(R.l.hardcode_plugin_lbs_nick));
      ((WorkerProfile.26)localObject1).map.put("shakeapp", Integer.valueOf(R.l.hardcode_plugin_shake_nick));
      ((WorkerProfile.26)localObject1).map.put("medianote", Integer.valueOf(R.l.hardcode_plugin_medianote_nick));
      ((WorkerProfile.26)localObject1).map.put("qqfriend", Integer.valueOf(R.l.hardcode_plugin_qqfriend_nick));
      ((WorkerProfile.26)localObject1).map.put("newsapp", Integer.valueOf(R.l.hardcode_plugin_readerappnews_nick));
      ((WorkerProfile.26)localObject1).map.put("facebookapp", Integer.valueOf(R.l.hardcode_plugin_facebookapp_nick));
      ((WorkerProfile.26)localObject1).map.put("masssendapp", Integer.valueOf(R.l.hardcode_plugin_masssend_nick));
      ((WorkerProfile.26)localObject1).map.put("meishiapp", Integer.valueOf(R.l.hardcode_plugin_meishiapp_nick));
      ((WorkerProfile.26)localObject1).map.put("feedsapp", Integer.valueOf(R.l.hardcode_plugin_feedsapp_nick));
      ((WorkerProfile.26)localObject1).map.put("voipapp", Integer.valueOf(R.l.hardcode_plugin_voip_nick));
      ((WorkerProfile.26)localObject1).map.put("weixin", Integer.valueOf(R.l.official_nick));
      ((WorkerProfile.26)localObject1).map.put("filehelper", Integer.valueOf(R.l.hardcode_file_helper_nick));
      ((WorkerProfile.26)localObject1).map.put("cardpackage", Integer.valueOf(R.l.hardcode_plugin_card_package_nick));
      ((WorkerProfile.26)localObject1).map.put("officialaccounts", Integer.valueOf(R.l.hardcode_plugin_official_accounts_nick));
      ((WorkerProfile.26)localObject1).map.put("voicevoipapp", Integer.valueOf(R.l.hardcode_plugin_voipaudio_nick));
      ((WorkerProfile.26)localObject1).map.put("helper_entry", Integer.valueOf(R.l.hardcode_plugin_helper_entry_nick));
      ((WorkerProfile.26)localObject1).map.put("voiceinputapp", Integer.valueOf(R.l.hardcode_plugin_voiceinput_nick));
      ((WorkerProfile.26)localObject1).map.put("linkedinplugin", Integer.valueOf(R.l.hardcode_plugin_linkedin_nick));
      ((WorkerProfile.26)localObject1).map.put("notifymessage", Integer.valueOf(R.l.hardcode_plugin_notify_message_nick));
      ((WorkerProfile.26)localObject1).map.put("gh_43f2581f6fd6", Integer.valueOf(R.l.hardcode_plugin_sport_nick));
      ((WorkerProfile.26)localObject1).map.put("appbrandcustomerservicemsg", Integer.valueOf(R.l.hardcode_plugin_app_brand_customer_service_message_nick));
      ((WorkerProfile.26)localObject1).bzY.put("weixin", Integer.valueOf(R.l.official_alias));
      com.tencent.mm.l.a.a((com.tencent.mm.l.a.a)localObject1);
      if (!f.zZ())
      {
        localObject1 = com.tencent.mm.plugin.report.service.h.mEJ;
        if (!com.tencent.mm.compatible.util.d.fR(19)) {
          continue;
        }
        l1 = 5L;
        ((com.tencent.mm.plugin.report.service.h)localObject1).a(340L, l1, 1L, false);
        localObject1 = com.tencent.mm.plugin.report.service.h.mEJ;
        if (!com.tencent.mm.compatible.util.d.fR(19)) {
          continue;
        }
        i = 5001;
        ((com.tencent.mm.plugin.report.service.h)localObject1).h(11098, new Object[] { Integer.valueOf(i), String.format("%s;%s;%s", new Object[] { com.tencent.mm.compatible.util.e.bnC, Environment.getExternalStorageDirectory().getAbsolutePath(), com.tencent.mm.compatible.util.h.getExternalStorageDirectory().getAbsolutePath() }) });
      }
      x.i("MicroMsg.WorkerProfile", "start time check WorkerProfile oncreate use time :%d, launcherisFirst :%b channel:%d cv:%d. topActivityName:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l2), Boolean.valueOf(this.bzD), Integer.valueOf(com.tencent.mm.sdk.platformtools.e.bxk), Integer.valueOf(com.tencent.mm.protocal.d.qVN), com.tencent.mm.sdk.platformtools.bi.fX(com.tencent.mm.sdk.platformtools.ad.getContext()) });
      return;
      localObject3 = com.tencent.mm.c.a.a.y(com.tencent.mm.a.e.f((String)localObject1, i - 8, 8));
      if (localObject3 != null) {
        continue;
      }
      x.e("MicroMsg.WorkerProfile", "checkApkExternal, header null");
    }
  }
  
  public final void onReportKVDataReady(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    au.Em().H(new WorkerProfile.28(this, paramInt, paramArrayOfByte2));
  }
  
  public final void onTerminate()
  {
    super.onTerminate();
    com.tencent.mm.h.b localb = this.bzL;
    x.i("MicroMsg.BroadcastController", "summerdiz release oldNoticeInfo[%s], newDisasterNoticeInfoMap[%d]", new Object[] { localb.cZN, Integer.valueOf(localb.cZP.size()) });
    com.tencent.mm.sdk.b.a.sFg.c(localb.cZQ);
    localb.cZN = null;
    localb.cZO.clear();
    localb.cZP.clear();
    this.bzL = null;
  }
  
  public final String toString()
  {
    return byu;
  }
  
  public final az.b vu()
  {
    if (this.bzz == null) {
      this.bzz = new WorkerProfile.27(this);
    }
    return this.bzz;
  }
  
  public final com.tencent.mm.model.ad vv()
  {
    if (this.bzA == null) {
      this.bzA = com.tencent.mm.booter.a.xt();
    }
    return this.bzA;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/app/WorkerProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */