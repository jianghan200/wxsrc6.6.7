package com.tencent.mm.plugin.appbrand;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.ActivityManager.TaskDescription;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.mm.modelappbrand.b.b.b;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.a.b;
import com.tencent.mm.plugin.appbrand.config.d.b;
import com.tencent.mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService.a;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask;
import com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder.LaunchCheckParams;
import com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder.UpdateTask;
import com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify.a.1;
import com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify.a.2;
import com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService;
import com.tencent.mm.plugin.appbrand.page.n.a;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.a.g.a;
import com.tencent.mm.plugin.appbrand.report.a.m;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.a;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.b;
import com.tencent.mm.plugin.appbrand.ui.AppBrandEmbedUI;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.plugin.appbrand.ui.l.a;
import com.tencent.mm.pluginsdk.model.u;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aw;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class g
{
  public volatile boolean dti;
  public FrameLayout fcA;
  public com.tencent.mm.plugin.appbrand.ui.l fcB;
  com.tencent.mm.plugin.appbrand.ui.h fcC;
  public com.tencent.mm.plugin.appbrand.widget.c.e fcD;
  public AppBrandStatObject fcE;
  AppBrandRemoteTaskController fcF;
  private com.tencent.mm.plugin.appbrand.page.g fcG;
  private com.tencent.mm.plugin.appbrand.page.f fcH;
  private com.tencent.mm.plugin.appbrand.r.b fcI;
  public i fcJ;
  public com.tencent.mm.plugin.appbrand.page.k fcK;
  public volatile com.tencent.mm.plugin.appbrand.b.b fcL;
  public com.tencent.mm.plugin.appbrand.i.a fcM;
  private int fcN = 0;
  private boolean fcO;
  boolean fcP;
  boolean fcQ;
  public boolean fcR;
  boolean fcS;
  private int fcT;
  boolean fcU;
  boolean fcV;
  boolean fcW;
  boolean fcX;
  boolean fcY;
  m fcZ;
  public MMActivity fcq;
  public q fcr;
  g fcs;
  public volatile AppBrandInitConfig fct;
  public volatile AppBrandSysConfig fcu;
  public volatile com.tencent.mm.plugin.appbrand.config.a fcv;
  public volatile com.tencent.mm.plugin.appbrand.jsapi.file.a fcw;
  final Deque<Runnable> fcx = new LinkedBlockingDeque();
  public l fcy;
  public com.tencent.mm.plugin.appbrand.page.n fcz;
  private AppBrandRemoteTaskController.b fda = new g.8(this);
  private AppBrandMainProcessService.a fdb = new g.9(this);
  Runnable fdc = new g.10(this);
  public volatile String mAppId;
  public boolean mFinished;
  Handler mHandler;
  
  public g(MMActivity paramMMActivity, q paramq)
  {
    this.fcq = paramMMActivity;
    this.fcr = paramq;
    this.mHandler = new Handler();
    this.fcA = new com.tencent.mm.plugin.appbrand.widget.e(paramMMActivity);
    this.fcA.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.fcF = new AppBrandRemoteTaskController();
    AppBrandRemoteTaskController localAppBrandRemoteTaskController = this.fcF;
    paramq = paramq.aaC();
    AppBrandRemoteTaskController.b localb = this.fda;
    localAppBrandRemoteTaskController.fex = paramMMActivity.getClass().getName();
    if ((paramMMActivity instanceof AppBrandEmbedUI)) {
      localAppBrandRemoteTaskController.gtr = ((AppBrandEmbedUI)paramMMActivity).gul;
    }
    localAppBrandRemoteTaskController.fdp = paramq;
    localAppBrandRemoteTaskController.fda = localb;
    this.fcG = new com.tencent.mm.plugin.appbrand.page.g();
    this.fcH = new com.tencent.mm.plugin.appbrand.page.f();
    this.fcI = new com.tencent.mm.plugin.appbrand.r.b();
    this.fcJ = new i();
    this.fcK = new com.tencent.mm.plugin.appbrand.page.k();
  }
  
  final void a(AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject)
  {
    if ((paramAppBrandInitConfig == null) || (paramAppBrandStatObject == null))
    {
      x.i("MicroMsg.AppBrandRuntime", "null current config, ignored");
      return;
    }
    this.fct = paramAppBrandInitConfig;
    this.fcE = paramAppBrandStatObject;
    this.mAppId = paramAppBrandInitConfig.appId;
    x.i("MicroMsg.AppBrandRuntime", "init %s, isGame %b, scene %d", new Object[] { this.mAppId, Boolean.valueOf(paramAppBrandInitConfig.aaq()), Integer.valueOf(aan()) });
    this.fcL = new com.tencent.mm.plugin.appbrand.b.b(this);
    paramAppBrandStatObject = this.fcL;
    com.tencent.mm.ipcinvoker.g.fD("com.tencent.mm");
    ad.getContext().registerComponentCallbacks(paramAppBrandStatObject.fjl);
    paramAppBrandStatObject.fjj.start();
    this.fcL.a(new g.1(this));
    if (!this.mFinished)
    {
      paramAppBrandStatObject = new ILaunchWxaAppInfoNotify.a.1(this);
      MMToClientEvent.a(paramAppBrandStatObject);
      this.fcL.a(new ILaunchWxaAppInfoNotify.a.2(paramAppBrandStatObject));
    }
    x.i("MicroMsg.AppBrandRuntime", "init %s, config %s, stat %s", new Object[] { this.mAppId, this.fct, this.fcE });
    this.dti = false;
    this.fcO = false;
    this.mFinished = false;
    this.fcP = false;
    this.fcQ = false;
    this.fcR = false;
    this.fcU = false;
    this.fcV = false;
    this.fcX = false;
    this.fcY = false;
    this.fcW = false;
    this.fcT = 0;
    u.v("weapp_id", this.fct.appId);
    u.v("weapp_name", this.fct.bKC);
    u.v("use_private_classloader", Boolean.valueOf(false));
    a.b(this);
    k.qr(this.mAppId);
    this.fcJ.o(0, System.currentTimeMillis() - paramAppBrandInitConfig.startTime);
    jy(1);
    com.tencent.mm.plugin.appbrand.performance.a.a(this.mAppId, "ActivityCreate", this.fct.startTime, System.currentTimeMillis());
  }
  
  @TargetApi(21)
  final void a(final AppBrandSysConfig paramAppBrandSysConfig)
  {
    if (Build.VERSION.SDK_INT < 21) {}
    while (aap()) {
      return;
    }
    final int i = com.tencent.mm.plugin.appbrand.ui.j.aO(this.fcv.foN.fpj, -16777216);
    this.fcq.setTaskDescription(new ActivityManager.TaskDescription(paramAppBrandSysConfig.bKC, null, i));
    com.tencent.mm.modelappbrand.b.b.Ka().a(new b.b()
    {
      public final void n(Bitmap paramAnonymousBitmap)
      {
        g.this.fcq.setTaskDescription(new ActivityManager.TaskDescription(paramAppBrandSysConfig.bKC, paramAnonymousBitmap, i));
      }
    }, paramAppBrandSysConfig.fqJ, null);
  }
  
  final void a(com.tencent.mm.plugin.appbrand.config.d.a parama)
  {
    if (this.mFinished)
    {
      x.i("MicroMsg.AppBrandRuntime", "mFinished is true return,mAppId:%s", new Object[] { this.mAppId });
      return;
    }
    x.i("MicroMsg.AppBrandRuntime", "AppBrandRuntime.mayRequestOrientation %s,mAppId:%s", new Object[] { this.fcv.adT(), this.mAppId });
    d.b localb = com.tencent.mm.plugin.appbrand.config.d.a(this.fct, this.fcv);
    com.tencent.mm.plugin.appbrand.config.d.b(this.fcq).a(this.fcq, localb, parama);
  }
  
  final void a(AppBrandStatObject paramAppBrandStatObject)
  {
    if (paramAppBrandStatObject == null)
    {
      x.e("MicroMsg.AppBrandRuntime", "statObject is null!");
      return;
    }
    String str = this.mAppId;
    int i = aan();
    AppBrandIDKeyBatchReport.amv().gqy = 1;
    AppBrandIDKeyBatchReport.amv().gqA = str;
    AppBrandIDKeyBatchReport.amv().gqB = i;
    AppBrandMainProcessService.a(AppBrandIDKeyBatchReport.amv());
    j.g(this).fdE = this.fct.fdE;
    this.fcE = paramAppBrandStatObject;
    if (this.fcz != null) {
      this.fcz.getReporter().aea();
    }
    x.i("MicroMsg.AppBrandRuntime", "updateStat %s, scene %d", new Object[] { this.mAppId, Integer.valueOf(aan()) });
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.widget.c.h paramh)
  {
    if (!ah.isMainThread()) {
      ah.A(new g.12(this, paramh));
    }
    do
    {
      return;
      this.fcq.YC();
    } while ((paramh == null) || (this.mFinished) || (this.fcD == null));
    com.tencent.mm.plugin.appbrand.widget.c.e locale = this.fcD;
    Object localObject = locale.gFU;
    if ((((com.tencent.mm.plugin.appbrand.widget.c.g)localObject).gGc != null) && (((com.tencent.mm.plugin.appbrand.widget.c.g)localObject).gGc.isRunning())) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        localObject = locale.gFU;
        if (((com.tencent.mm.plugin.appbrand.widget.c.g)localObject).gGc != null) {
          ((com.tencent.mm.plugin.appbrand.widget.c.g)localObject).gGc.cancel();
        }
      }
      localObject = paramh.getContentView();
      if (((View)localObject).getParent() != locale)
      {
        com.tencent.mm.plugin.appbrand.widget.c.e.bT((View)localObject);
        locale.addView((View)localObject, new FrameLayout.LayoutParams(-2, -2, 17));
        if (locale.gFY != paramh)
        {
          ((View)localObject).clearAnimation();
          ((View)localObject).startAnimation(AnimationUtils.loadAnimation(locale.getContext(), s.a.appbrand_dialog_enter));
        }
        locale.gFY = paramh;
      }
      ((View)localObject).setOnClickListener(locale.mOnClickListener);
      locale.gFV.add(paramh);
      paramh.a(locale);
      locale.setVisibility(0);
      locale.gFU.c(Color.argb(127, 0, 0, 0), null);
      return;
    }
  }
  
  final void aak()
  {
    this.fcZ = new m(this);
    this.fcZ.gsj = bi.VF();
    if (this.fcB != null) {
      aam();
    }
    Object localObject = this.fct.iconUrl;
    String str = this.fct.bKC;
    com.tencent.mm.plugin.appbrand.ui.l locall = l.a.b(this.fcq, this);
    locall.bL((String)localObject, str);
    int i;
    if (aan() == 1023)
    {
      i = 1;
      if (i != 0) {
        locall.ann();
      }
      this.fcA.addView(locall.getView(), -1, -1);
      locall.getView().setClickable(true);
      this.fcB = locall;
      if (!aaq()) {
        break label385;
      }
      this.fcV = true;
    }
    for (;;)
    {
      aas();
      AppBrandMainProcessService.a(new AppBrandMainProcessPrepareTask(new g.16(this)));
      x.i("MicroMsg.AppBrandRuntime", "appOnCreate: %s, %s", new Object[] { this.fct.bKC, this.fct.appId });
      AppBrandMainProcessService.a(this.fdb);
      localObject = a.pY(this.mAppId);
      if ((localObject != null) && (this != localObject)) {
        ((g)localObject).finish();
      }
      localObject = this.fcF;
      str = this.mAppId;
      ((AppBrandRemoteTaskController)localObject).gts = AppBrandRemoteTaskController.a.gtH;
      ((AppBrandRemoteTaskController)localObject).mAppId = str;
      AppBrandMainProcessService.a((MainProcessTask)localObject);
      this.fcF.aM(this.mAppId, this.fct.fig);
      this.fcL.fjj.jG(3);
      MMToClientEvent.tg(this.mAppId);
      e.qm(this.mAppId);
      e.qg(this.mAppId);
      e.a(this.mAppId, e.a.fbZ);
      AppBrandStickyBannerLogic.a.ac(this.mAppId, this.fct.fqy);
      localObject = this.fcI;
      ((com.tencent.mm.plugin.appbrand.r.b)localObject).appId = this.mAppId;
      x.i("MicroMsg.AppBrandUserCaptureScreenMonitor", "init");
      aw.a(ad.getContext(), ((com.tencent.mm.plugin.appbrand.r.b)localObject).gBu);
      com.tencent.mm.plugin.appbrand.media.a.a.onCreate(this.mAppId);
      com.tencent.mm.plugin.appbrand.media.record.c.onCreate();
      aat();
      this.mHandler.postDelayed(this.fdc, 10000L);
      return;
      i = 0;
      break;
      label385:
      com.tencent.mm.plugin.appbrand.task.d.a(new com.tencent.mm.plugin.appbrand.task.d.a()
      {
        public final void onReady()
        {
          g.this.fcV = true;
          g.this.fcJ.o(2, System.currentTimeMillis() - this.dUQ);
          com.tencent.mm.plugin.appbrand.performance.a.a(g.this.mAppId, "X5Prepare", this.dUQ, System.currentTimeMillis());
          g.this.aat();
        }
      }, false);
    }
  }
  
  public final g aal()
  {
    return this.fcr.d(this);
  }
  
  final void aam()
  {
    if (this.fcB == null)
    {
      x.e("MicroMsg.AppBrandRuntime", "hideSplash, splash view null");
      return;
    }
    com.tencent.mm.plugin.appbrand.page.l locall = this.fcz.getCurrentPage();
    if (locall == null) {
      x.e("MicroMsg.AppBrandRuntime", "hideSplash, null currentPage, appId %s", new Object[] { this.mAppId });
    }
    for (;;)
    {
      this.fcB.anm();
      this.fcB = null;
      return;
      this.fcB.a(locall.getPageConfig());
    }
  }
  
  public final int aan()
  {
    if (this.fcE == null) {
      return 0;
    }
    return this.fcE.scene;
  }
  
  public final String aao()
  {
    if (this.fct == null) {
      return "";
    }
    if (bi.oW(this.fct.fqx))
    {
      if (this.fcv == null) {
        return "";
      }
      return this.fcv.adU();
    }
    return this.fct.fqx;
  }
  
  public final boolean aap()
  {
    return (this.fct == null) || (this.fct.fqr);
  }
  
  public final boolean aaq()
  {
    return (this.fct == null) || (this.fct.aaq());
  }
  
  public final boolean aar()
  {
    if ((this.fcy instanceof com.tencent.mm.plugin.appbrand.debugger.n)) {}
    while ((this.fct != null) && (this.fct.fqw) && ((this.fcE.scene == 1011) || (this.fcE.scene == 1012) || (this.fcE.scene == 1013))) {
      return true;
    }
    return false;
  }
  
  final void aas()
  {
    if ((!com.tencent.mm.plugin.appbrand.task.d.ana()) && (!aaq()))
    {
      com.tencent.mm.plugin.appbrand.task.d.a(new g.14(this), false);
      return;
    }
    long l = System.currentTimeMillis();
    AppBrandPrepareTask localAppBrandPrepareTask = new AppBrandPrepareTask(this.fcq, this);
    localAppBrandPrepareTask.geT = new g.15(this, l);
    localAppBrandPrepareTask.akB();
  }
  
  final void aat()
  {
    x.i("MicroMsg.AppBrandRuntime", "initRuntime, mFinished: %b, ResourceReady: %b, WebViewReady: %b,isOrientationReady: %b, MainProcessReady: %b", new Object[] { Boolean.valueOf(this.mFinished), Boolean.valueOf(this.fcU), Boolean.valueOf(this.fcV), Boolean.valueOf(this.fcW), Boolean.valueOf(this.fcX) });
    if ((this.mFinished) || (!this.fcU) || (!this.fcV) || (!this.fcW) || (!this.fcX)) {
      return;
    }
    if (this.dti)
    {
      x.e("MicroMsg.AppBrandRuntime", "initRuntime, mInitialized TRUE !!!  go check callee");
      return;
    }
    g.18 local18 = new g.18(this);
    int i = this.fcN + 1;
    this.fcN = i;
    if (i > 1)
    {
      local18.run();
      return;
    }
    Looper.myQueue().addIdleHandler(new g.19(this, local18));
  }
  
  public final void aau()
  {
    this.fcT += 1;
  }
  
  public final void aav()
  {
    if (this.fcT == 0) {
      return;
    }
    this.fcT -= 1;
  }
  
  public final boolean aaw()
  {
    if ((this.fcO) && (this.fcT == 0))
    {
      cleanup();
      return true;
    }
    return false;
  }
  
  public final void cleanup()
  {
    if (this.mFinished) {
      return;
    }
    this.mFinished = true;
    x.i("MicroMsg.AppBrandRuntime", "onDestroy: %s", new Object[] { this.mAppId });
    Object localObject1 = this.mAppId;
    if (DebuggerShell.aeq()) {
      com.tencent.mm.plugin.appbrand.r.c.Em().H(new g.4(this, (String)localObject1));
    }
    localObject1 = this.fcF;
    ??? = this.mAppId;
    ((AppBrandRemoteTaskController)localObject1).gts = AppBrandRemoteTaskController.a.gtB;
    ((AppBrandRemoteTaskController)localObject1).mAppId = ((String)???);
    AppBrandMainProcessService.a((MainProcessTask)localObject1);
    AppBrandMainProcessService.b(this.fdb);
    MMToClientEvent.th(this.mAppId);
    e.qh(this.mAppId);
    e.a(this.mAppId, e.a.fcd);
    com.tencent.mm.plugin.appbrand.jsapi.l.tl(this.mAppId);
    AppBrandStickyBannerLogic.a.vK(this.mAppId);
    a.qd(this.mAppId);
    localObject1 = AppBrandMusicClientService.ghS;
    ((AppBrandMusicClientService)localObject1).ghR.clear();
    ((AppBrandMusicClientService)localObject1).ghT = "";
    com.tencent.mm.plugin.appbrand.media.a.a.Pa(this.mAppId);
    com.tencent.mm.plugin.appbrand.media.record.c.onDestroy();
    com.tencent.mm.plugin.appbrand.permission.b.vm(this.mAppId);
    this.fcq.YC();
    localObject1 = this.fcL;
    ??? = ((com.tencent.mm.plugin.appbrand.b.b)localObject1).fjj;
    ((com.tencent.mm.plugin.appbrand.b.c)???).fjt.set(true);
    ((com.tencent.mm.plugin.appbrand.b.c)???).quit();
    ((com.tencent.mm.plugin.appbrand.b.c)???).b(com.tencent.mm.plugin.appbrand.b.a.fjh);
    ad.getContext().unregisterComponentCallbacks(((com.tencent.mm.plugin.appbrand.b.b)localObject1).fjl);
    for (;;)
    {
      synchronized (((com.tencent.mm.plugin.appbrand.b.b)localObject1).fjk)
      {
        ((com.tencent.mm.plugin.appbrand.b.b)localObject1).fjk.clear();
        if (this.fcD != null) {
          this.fcA.removeView(this.fcD);
        }
        localObject1 = this.fcw;
        if (localObject1 != null)
        {
          ((com.tencent.mm.plugin.appbrand.jsapi.file.a)localObject1).release();
          this.fcw = null;
        }
        if (this.fcZ != null) {
          localObject1 = this.fcZ;
        }
        try
        {
          ??? = k.qu(((m)localObject1).fdD.mAppId);
          ((m)localObject1).grI = com.tencent.mm.plugin.appbrand.report.a.cH(ad.getContext());
          ((m)localObject1).appId = ((m)localObject1).fdD.mAppId;
          if (((m)localObject1).fdD.fcu != null) {
            break label630;
          }
          i = 0;
          ((m)localObject1).cbu = i;
          ((m)localObject1).bGF = (((m)localObject1).fdD.fct.fig + 1);
          ((m)localObject1).scene = ((m)localObject1).fdD.aan();
          if (!((m)localObject1).gsk) {
            break label647;
          }
          i = 1;
          ((m)localObject1).gsl = i;
          if (!((k)???).fdI.get()) {
            break label652;
          }
          i = 1;
          ((m)localObject1).gsm = i;
          ((m)localObject1).gsn = (bi.VF() - ((m)localObject1).gsj);
          ((m)localObject1).gso = bi.VF();
          x.i("MicroMsg.AppBrand.Report.kv_14576", "report|" + ((m)localObject1).toString());
          com.tencent.mm.plugin.report.f.mDy.h(14576, new Object[] { ((m)localObject1).grI, ((m)localObject1).appId, Integer.valueOf(((m)localObject1).cbu), Integer.valueOf(((m)localObject1).bGF), Integer.valueOf(((m)localObject1).scene), ((m)localObject1).bJK, Integer.valueOf(((m)localObject1).gsl), Integer.valueOf(((m)localObject1).gsm), Long.valueOf(((m)localObject1).gsn), Long.valueOf(((m)localObject1).gso) });
        }
        catch (Exception localException)
        {
          int i;
          x.e("MicroMsg.AppBrand.Report.kv_14576", "report exp %s", new Object[] { localException });
          continue;
        }
        this.fcZ = null;
        e.ql(this.mAppId);
        if (this.fcy != null) {
          this.fcy.cleanup();
        }
        if (this.fcz != null)
        {
          this.fcz.cleanup();
          this.fcA.removeView(this.fcz);
        }
        a.a(this);
        k.remove(this.mAppId);
        this.fcx.clear();
        this.fct.startTime = System.currentTimeMillis();
        return;
      }
      label630:
      i = ((m)localObject2).fdD.fcu.frm.fii;
      continue;
      label647:
      i = 0;
      continue;
      label652:
      i = 0;
    }
  }
  
  public final void close()
  {
    if (this.fcr.aaB() == 1)
    {
      if (aap())
      {
        this.fcr.a(null);
        return;
      }
      this.fcr.close();
      return;
    }
    finish();
  }
  
  public final void finish()
  {
    this.fcq.runOnUiThread(new g.5(this));
  }
  
  final void jy(int paramInt)
  {
    int i = 369;
    if (aaq()) {
      i = 777;
    }
    com.tencent.mm.plugin.report.service.h.mEJ.a(i, paramInt, 1L, false);
  }
  
  public final void onPause()
  {
    if (!this.dti) {
      return;
    }
    x.i("MicroMsg.AppBrandRuntime", "onPause: %s", new Object[] { this.mAppId });
    this.fcO = true;
    this.fcL.fjj.jG(1);
    com.tencent.mm.plugin.appbrand.page.f localf = this.fcH;
    Object localObject2 = new HashMap(1);
    e.c localc = e.qn(this.mAppId);
    Object localObject1 = "hide";
    switch (com.tencent.mm.plugin.appbrand.page.f.1.fjK[localc.ordinal()])
    {
    }
    for (;;)
    {
      ((HashMap)localObject2).put("mode", localObject1);
      localObject1 = new JSONObject((Map)localObject2);
      localObject2 = com.tencent.mm.plugin.appbrand.report.a.e.h(this.fcz.getCurrentPage().getCurrentPageView());
      int i = ((Integer)((Pair)localObject2).first).intValue();
      localObject2 = (String)((Pair)localObject2).second;
      try
      {
        ((JSONObject)localObject1).put("targetAction", i);
        ((JSONObject)localObject1).put("targetPagePath", localObject2);
        localf.mData = ((JSONObject)localObject1).toString();
        localf.a(this.fcy).ahM();
        this.fcz.agK();
        e.qi(this.mAppId);
        e.a(this.mAppId, e.a.fcb);
        x.i("MicroMsg.AppBrandUserCaptureScreenMonitor", "onPause");
        aw.a(ad.getContext(), null);
        return;
        localObject1 = "close";
        continue;
        localObject1 = "back";
        continue;
        localObject1 = "hide";
        continue;
        localObject1 = "hang";
        continue;
        localObject1 = "launchMiniProgram";
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.e("MicroMsg.AppBrandPageVisitStatisticsHelper", "fillEventOnAppEnterBackground ex = %s", new Object[] { localException });
        }
      }
    }
  }
  
  public final void onResume()
  {
    if (!this.dti) {
      return;
    }
    x.i("MicroMsg.AppBrandRuntime", "onResume: %s", new Object[] { this.mAppId });
    if ((this.mFinished) || (this.fcP))
    {
      reload();
      return;
    }
    this.fcO = false;
    e.qm(this.mAppId);
    e.qj(this.mAppId);
    e.a(this.mAppId, e.a.fca);
    Object localObject1 = this.fcF;
    Object localObject2 = this.mAppId;
    int i = this.fct.fig;
    ((AppBrandRemoteTaskController)localObject1).gts = AppBrandRemoteTaskController.a.gtA;
    ((AppBrandRemoteTaskController)localObject1).mAppId = ((String)localObject2);
    ((AppBrandRemoteTaskController)localObject1).gfg = i;
    AppBrandMainProcessService.a((MainProcessTask)localObject1);
    if (this.fcQ) {
      this.fcz.getReporter().gqV = true;
    }
    this.fcz.agL();
    this.fcL.fjj.jG(3);
    this.fcy.onResume();
    localObject2 = this.fcG;
    boolean bool = this.fcQ;
    Object localObject3 = new HashMap();
    localObject1 = this.fcE;
    if (localObject1 != null) {
      ((HashMap)localObject3).put("scene", Integer.valueOf(((AppBrandStatObject)localObject1).scene));
    }
    localObject1 = this.fct.fqA.aef();
    if (localObject1 != null) {
      ((HashMap)localObject3).put("referrerInfo", localObject1);
    }
    localObject1 = this.fct.aec();
    if (localObject1 != null) {
      ((HashMap)localObject3).put("shareInfo", localObject1);
    }
    ((HashMap)localObject3).put("relaunch", Boolean.valueOf(bool));
    ((HashMap)localObject3).put("reLaunch", Boolean.valueOf(bool));
    if (bool)
    {
      localObject1 = aao();
      ((HashMap)localObject3).put("path", com.tencent.mm.plugin.appbrand.q.l.vP((String)localObject1));
      ((HashMap)localObject3).put("query", com.tencent.mm.plugin.appbrand.q.l.vQ((String)localObject1));
      x.i("MicroMsg.AppBrandOnAppEnterForegroundEvent", "path: %s, query: %s, relaunch: %s, url: %s", new Object[] { ((HashMap)localObject3).get("path"), ((HashMap)localObject3).get("query"), ((HashMap)localObject3).get("relaunch"), localObject1 });
      com.tencent.mm.plugin.appbrand.r.c.m((Map)localObject3);
      localObject1 = new JSONObject((Map)localObject3);
      if (!bool) {
        break label543;
      }
      com.tencent.mm.plugin.appbrand.report.a.e.a(this, (JSONObject)localObject1);
      label386:
      ((com.tencent.mm.plugin.appbrand.jsapi.h)localObject2).mData = ((JSONObject)localObject1).toString();
      ((com.tencent.mm.plugin.appbrand.jsapi.h)localObject2).a(this.fcy).ahM();
      if (this.fcQ) {
        this.fcz.V(aao(), true);
      }
      localObject1 = this.fct;
      if (!bi.oW(((AppBrandInitConfig)localObject1).appId))
      {
        localObject2 = a.qa(((AppBrandInitConfig)localObject1).appId);
        if (localObject2 != null)
        {
          localObject3 = a.qb(((AppBrandInitConfig)localObject1).appId);
          if (localObject3 != null) {
            break label624;
          }
        }
      }
    }
    for (;;)
    {
      localObject1 = this.fcI;
      x.i("MicroMsg.AppBrandUserCaptureScreenMonitor", "onResume");
      aw.a(ad.getContext(), ((com.tencent.mm.plugin.appbrand.r.b)localObject1).gBu);
      a(this.fcu);
      com.tencent.mm.plugin.appbrand.task.d.vv(this.mAppId);
      this.fcP = false;
      this.fcQ = false;
      a(new g.3(this));
      return;
      localObject1 = this.fcz.getCurrentUrl();
      break;
      try
      {
        label543:
        com.tencent.mm.plugin.appbrand.report.a.e.b(this, (JSONObject)localObject1);
        ((JSONObject)localObject1).put("referpagepath", this.fcz.getReporter().gqZ.amJ().grt);
        ((JSONObject)localObject1).put("clickTimestamp", this.fcz.getCurrentPage().getCurrentPageView().gnC.grg);
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.AppBrandPageVisitStatisticsHelper", "fillEventOnAppEnterForeground ex = %s", new Object[] { localException });
      }
      break label386;
      label624:
      x.i("MicroMsg.AppBrandTaskUsageRecorder", "updateUsage, appId %s, type %d", new Object[] { ((AppBrandInitConfig)localObject1).appId, Integer.valueOf(((AppBrandInitConfig)localObject1).fig) });
      String str = j.qq(((AppBrandInitConfig)localObject1).appId).fdE;
      AppBrandMainProcessService.a(new AppBrandTaskUsageRecorder.UpdateTask(new AppBrandTaskUsageRecorder.LaunchCheckParams((AppBrandInitConfig)localObject1, localException, ((AppBrandSysConfig)localObject2).frm.fii, WxaCommLibRuntimeReader.abP().fii, str)));
    }
  }
  
  final void reload()
  {
    this.fcy.fEH = true;
    cleanup();
    a(this.fct, this.fcE);
    aak();
    x.i("MicroMsg.AppBrandRuntime", "reload: %s", new Object[] { this.mAppId });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */