package com.tencent.mm.plugin.bbom;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.mars.BaseEvent;
import com.tencent.mars.app.AppLogic;
import com.tencent.mars.mm.AppCallBack;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.mm.R.l;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.booter.MMReceivers.ExdeviceProcessReceiver;
import com.tencent.mm.booter.MMReceivers.SandBoxProcessReceiver;
import com.tencent.mm.booter.MMReceivers.ToolsProcessReceiver;
import com.tencent.mm.booter.d.a;
import com.tencent.mm.booter.d.b;
import com.tencent.mm.booter.d.c;
import com.tencent.mm.compatible.loader.f.1;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.hardcoder.HardCoderJNI;
import com.tencent.mm.kernel.api.bucket.ApplicationLifeCycleBucket;
import com.tencent.mm.model.l.1;
import com.tencent.mm.model.l.2;
import com.tencent.mm.model.l.3;
import com.tencent.mm.model.l.4;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.messenger.foundation.a.q.a;
import com.tencent.mm.plugin.report.service.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.MMAppMgr.Receiver;
import com.tencent.mm.ui.chatting.f.b.1;
import com.tencent.mm.y.g.b;

public class PluginBigBallOfMud
  extends com.tencent.mm.kernel.b.f
  implements ApplicationLifeCycleBucket
{
  private static final String TAG = "MicroMsg.PluginBigBallOfMud";
  public Application app;
  private final MMAppMgr appMgr = new MMAppMgr();
  private com.tencent.mm.compatible.loader.e mProfileCompat;
  
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    com.tencent.mm.ui.d.a(new PluginBigBallOfMud.1(this));
    MMReceivers.ToolsProcessReceiver.a(new d.c());
    MMReceivers.SandBoxProcessReceiver.a(new d.b());
    MMReceivers.ExdeviceProcessReceiver.a(new d.a());
    Object localObject1 = (com.tencent.mm.plugin.zero.a.d)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.zero.a.d.class);
    ((com.tencent.mm.plugin.zero.a.d)localObject1).setILightPushDelegate(new j());
    ((com.tencent.mm.plugin.zero.a.d)localObject1).addNotifyReceiverCallback(new o());
    ((com.tencent.mm.plugin.zero.a.d)localObject1).addICoreServiceLifecycleCallback(new g());
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PluginBigBallOfMud", "zero %s", new Object[] { localObject1 });
    this.app = paramg.dsQ;
    com.tencent.mm.modelstat.d.c(this.app);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PluginBigBallOfMud", "app.getResources() is:" + paramg.dsQ.getResources());
    ad.a(com.tencent.mm.bq.a.a(paramg.dsQ.getResources(), paramg.dsQ));
    long l1 = System.currentTimeMillis();
    com.tencent.mm.compatible.loader.f localf = new com.tencent.mm.compatible.loader.f();
    localObject1 = this.app;
    Object localObject2 = paramg.dox;
    if ((localObject2 == null) || (((String)localObject2).length() <= 0))
    {
      HandlerThread localHandlerThread = com.tencent.mm.sdk.f.e.Xs("ProfileFactoryImp_handlerThread");
      localHandlerThread.start();
      localObject2 = (String)new f.1(localf).a(new ag(localHandlerThread.getLooper()));
      localHandlerThread.getLooper().quit();
    }
    for (;;)
    {
      if (localObject2 == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ProfileFactoryImpl", "get process name failed, retry later");
        localObject1 = null;
      }
      for (;;)
      {
        this.mProfileCompat = ((com.tencent.mm.compatible.loader.e)localObject1);
        if ((this.mProfileCompat != null) && (!paramg.ES()))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PluginBigBallOfMud", "before profile oncreate.");
          this.mProfileCompat.onCreate();
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PluginBigBallOfMud", "after profile oncreate.");
        com.tencent.mm.app.d.aT(this.app.getApplicationContext());
        localObject1 = com.tencent.mm.booter.c.bj(this.app);
        if ((localObject1 != null) && (((com.tencent.mm.booter.c)localObject1).cWO != -1)) {
          com.tencent.mm.sdk.platformtools.e.bxk = ((com.tencent.mm.booter.c)localObject1).cWO;
        }
        ((com.tencent.mm.kernel.b.h)paramg).mProfileCompat = this.mProfileCompat;
        int i = 0;
        localObject1 = paramg.dsQ.getSharedPreferences("system_config_prefs", 0);
        if (localObject1 != null) {
          i = ((SharedPreferences)localObject1).getInt("default_uin", 0);
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PluginBigBallOfMud", "APPonCreate proc:%s time:%d (loader:%d) ueh:%d data[%s] sdcard[%s]", new Object[] { paramg.dox, Long.valueOf(bi.bH(com.tencent.mm.app.b.bya)), Long.valueOf(bi.bH(l1)), Integer.valueOf(i), aa.duN, com.tencent.mm.compatible.util.e.bnC });
        com.tencent.mm.j.a.a.a(new PluginBigBallOfMud.7(this));
        com.tencent.mm.compatible.d.a.a(new com.tencent.mm.compatible.d.a.a()
        {
          public final void aL(long paramAnonymousLong)
          {
            com.tencent.mm.plugin.report.service.h.mEJ.a(853L, paramAnonymousLong, 1L, false);
          }
        });
        if (paramg.ES())
        {
          l1 = SystemClock.elapsedRealtime();
          com.tencent.mm.compatible.util.k.b("hardcoder", getClass().getClassLoader());
          HardCoderJNI.initReporter(new com.tencent.mm.hardcoder.e());
          long l2 = SystemClock.elapsedRealtime();
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PluginBigBallOfMud", "summerhardcoder initHardCoder[%d %d %d %d] take[%d]ms", new Object[] { Long.valueOf(com.tencent.mm.kernel.a.a.drq), Long.valueOf(com.tencent.mm.kernel.a.a.drr), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l2 - com.tencent.mm.kernel.a.a.drq) });
          HardCoderJNI.initHardCoder();
          com.tencent.mm.modelfriend.a.dRB = new com.tencent.mm.modelfriend.a.a()
          {
            public final String Ox()
            {
              if (com.tencent.mm.sdk.platformtools.e.sFF) {
                return ad.getContext().getString(R.l.safe_device_android_device_nm);
              }
              return ad.getContext().getString(R.l.safe_device_android_device);
            }
          };
          com.tencent.mm.bt.f.a(new PluginBigBallOfMud.10(this));
          com.tencent.mm.storage.e.sNP = new com.tencent.mm.plugin.messenger.foundation.a.k()
          {
            public final String I(bd paramAnonymousbd)
            {
              if ((paramAnonymousbd.field_bizChatId != -1L) && (com.tencent.mm.ac.f.eZ(paramAnonymousbd.field_talker))) {}
              for (int i = 1; i != 0; i = 0)
              {
                paramAnonymousbd = paramAnonymousbd.field_talker + ":" + paramAnonymousbd.field_bizChatId;
                com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PluginBigBallOfMud", "mapNotifyInfo key:%s", new Object[] { paramAnonymousbd });
                return paramAnonymousbd;
              }
              return paramAnonymousbd.field_talker;
            }
          };
          com.tencent.mm.model.t.a(new PluginBigBallOfMud.12(this));
          com.tencent.mm.plugin.messenger.foundation.a.t.b(new PluginBigBallOfMud.13(this));
          paramg = new com.tencent.mm.modelmulti.a();
          q.a.a(69, paramg);
          q.a.a(68, paramg);
          q.a.a(22, paramg);
          q.a.a(13, paramg);
          q.a.a(15, paramg);
          q.a.a(23, paramg);
          q.a.a(25, paramg);
          q.a.a(24, paramg);
          q.a.a(33, paramg);
          q.a.a(35, paramg);
          q.a.a(44, paramg);
          q.a.a(999999, paramg);
          q.a.a(53, paramg);
          q.a.a(204, paramg);
          paramg = new c();
          ((com.tencent.mm.plugin.messenger.foundation.a.d)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.d.class)).a(paramg);
          com.tencent.mm.kernel.g.DF().a(681, paramg);
          com.tencent.mm.plugin.messenger.foundation.a.t.a(5, new l());
          com.tencent.mm.plugin.messenger.foundation.a.t.a(1, new s());
          com.tencent.mm.plugin.messenger.foundation.a.t.a(4, new h());
          ((com.tencent.mm.plugin.auth.a.b)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(new a());
          paramg = new m();
          ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.p.class)).a(paramg);
          ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.p.class)).a(paramg);
          com.tencent.mm.model.e.a(new b());
          new com.tencent.mm.permission.b();
          new q().cht();
          com.tencent.mm.kernel.g.DF().b(138, n.hex);
          com.tencent.mm.kernel.g.DF().b(39, n.hex);
          com.tencent.mm.kernel.g.DF().b(268369922, n.hex);
          if (n.hex == null) {
            n.hex = new n();
          }
          com.tencent.mm.kernel.g.DF().a(138, n.hex);
          com.tencent.mm.kernel.g.DF().a(39, n.hex);
          com.tencent.mm.kernel.g.DF().a(268369922, n.hex);
          p.cF(this.app);
          com.tencent.mm.ap.a.a.a("delchatroommember", new l.1());
          com.tencent.mm.ap.a.a.a("NewXmlChatRoomAccessVerifyApplication", new l.2());
          com.tencent.mm.ap.a.a.a("NewXmlChatRoomAccessVerifyApproval", new l.3());
          com.tencent.mm.ap.a.a.a("chatroommuteexpt", new l.4());
          com.tencent.mm.ap.a.a.a("invokeMessage", new b.1());
          paramg = this.appMgr;
          localObject1 = this.app;
          if (paramg.tnk == null) {
            paramg.tnk = new MMAppMgr.Receiver(paramg);
          }
          MMActivity.cqb();
          localObject2 = new IntentFilter();
          ((IntentFilter)localObject2).addAction("com.tencent.mm.ui.ACTION_ACTIVE");
          ((IntentFilter)localObject2).addAction("com.tencent.mm.ui.ACTION_DEACTIVE");
          ((IntentFilter)localObject2).addAction("com.tencent.mm.sandbox.updater.intent.ACTION_EXIT_APP");
          ((IntentFilter)localObject2).addAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
          ((IntentFilter)localObject2).addAction("MINIQB_OPEN_RET");
          ((Context)localObject1).registerReceiver(paramg.tnk, (IntentFilter)localObject2, "com.tencent.mm.permission.MM_MESSAGE", null);
          paramg = new com.tencent.mm.booter.x(com.tencent.mm.booter.c.bj(this.app));
          paramg.ez("MM");
          af.exs = bi.a(paramg.eA(".com.tencent.mm.debug.test.use_cdn_down_thumb"), false);
          af.ewA = bi.a(paramg.eA(".com.tencent.mm.debug.test.display_errcode"), false);
          af.ewB = bi.a(paramg.eA(".com.tencent.mm.debug.test.display_msgstate"), false);
          af.ewC = bi.a(paramg.eA(".com.tencent.mm.debug.test.network.simulate_fault"), false);
          af.ewD = bi.a(paramg.eA(".com.tencent.mm.debug.test.network.force_touch"), false);
          af.ewE = bi.a(paramg.eA(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
          af.ewF = bi.a(paramg.eA(".com.tencent.mm.debug.test.crashIsExit"), false);
          af.exe = bi.getInt(bi.aG(paramg.getString(".com.tencent.mm.debug.datatransfer.times"), "0"), 0);
          af.exf = bi.getInt(bi.aG(paramg.getString(".com.tencent.mm.debug.datatransfer.duration"), "0"), 0);
          af.ewH = bi.a(paramg.eA(".com.tencent.mm.debug.test.album_drop_table"), false);
          af.ewI = bi.a(paramg.eA(".com.tencent.mm.debug.test.album_dle_file"), false);
          af.ewJ = bi.a(paramg.eA(".com.tencent.mm.debug.test.album_show_info"), false);
          af.ewK = bi.a(paramg.eA(".com.tencent.mm.debug.test.location_help"), false);
          af.ewN = bi.a(paramg.eA(".com.tencent.mm.debug.test.force_soso"), false);
          af.ewO = bi.a(paramg.eA(".com.tencent.mm.debug.test.simulatePostServerError"), false);
          af.ewP = bi.a(paramg.eA(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
          af.ewQ = bi.a(paramg.eA(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
          af.ewT = bi.a(paramg.eA(".com.tencent.mm.debug.test.filterfpnp"), false);
          af.ewU = bi.a(paramg.eA(".com.tencent.mm.debug.test.testForPull"), false);
          i = bi.a(paramg.getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
          af.ewR = i;
          if ((i != 4) && (af.ewR > 0))
          {
            com.tencent.mm.storage.z.sOq = af.ewR;
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WorkerDebugger", "cdn thread num " + af.ewR);
          }
          af.ewS = bi.a(paramg.eA(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
          af.ewV = bi.aG(paramg.getString(".com.tencent.mm.debug.server.host.http"), "");
          af.ewW = bi.aG(paramg.getString(".com.tencent.mm.debug.server.host.socket"), "");
          if (bi.a(paramg.eA(".com.tencent.mm.debug.test.show_full_version"), false)) {
            com.tencent.mm.sdk.platformtools.e.sFC = true;
          }
        }
        try
        {
          i = Integer.decode(paramg.getString(".com.tencent.mm.debug.log.setversion")).intValue();
          com.tencent.mm.protocal.d.CA(i);
          new StringBuilder("set up test protocal version = ").append(Integer.toHexString(i));
        }
        catch (Exception localException5)
        {
          try
          {
            localObject1 = paramg.getString(".com.tencent.mm.debug.log.setapilevel");
            if (!bi.oW((String)localObject1))
            {
              com.tencent.mm.protocal.d.DEVICE_TYPE = "android-" + (String)localObject1;
              com.tencent.mm.protocal.d.qVJ = "android-" + (String)localObject1;
              com.tencent.mm.protocal.d.qVL = (String)localObject1;
              com.tencent.mm.sdk.a.b.VW((String)localObject1);
              new StringBuilder("set up test protocal apilevel = ").append(com.tencent.mm.protocal.d.DEVICE_TYPE).append(" ").append(com.tencent.mm.sdk.a.b.chq());
            }
          }
          catch (Exception localException5)
          {
            try
            {
              l1 = Long.decode(paramg.getString(".com.tencent.mm.debug.log.setuin")).longValue();
              new StringBuilder("set up test protocal uin old: ").append(com.tencent.mm.protocal.d.qVM).append(" new: ").append(l1);
              com.tencent.mm.protocal.d.qVM = l1;
            }
            catch (Exception localException5)
            {
              try
              {
                i = Integer.decode(paramg.getString(".com.tencent.mm.debug.log.setchannel")).intValue();
                paramg.cXF.cWO = i;
              }
              catch (Exception localException5)
              {
                try
                {
                  boolean bool1 = bi.a(paramg.eA(".com.tencent.mm.debug.report.debugmodel"), false);
                  boolean bool2 = bi.a(paramg.eA(".com.tencent.mm.debug.report.kvstat"), false);
                  boolean bool3 = bi.a(paramg.eA(".com.tencent.mm.debug.report.clientpref"), false);
                  boolean bool4 = bi.a(paramg.eA(".com.tencent.mm.debug.report.useraction"), false);
                  com.tencent.mm.plugin.report.a.c.a(bool1, bool2, bool3, bool4);
                  new StringBuilder("try control report : debugModel[").append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
                  af.ewZ = bi.a(paramg.eA(".com.tencent.mm.debug.test.update_test"), false);
                  af.exa = bi.a(paramg.eA(".com.tencent.mm.debug.test.scan_save_image"), false);
                  af.exc = bi.a(paramg.eA(".com.tencent.mm.debug.test.shake_get_config_list"), false);
                  af.exd = bi.a(paramg.eA(".com.tencent.mm.debug.test.shake_show_shaketv"), false);
                  af.exh = bi.aG(paramg.getString(".com.tencent.mm.debug.jsapi.permission"), "");
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WorkerDebugger", "Test.jsapiPermission = " + af.exh);
                  af.exw = bi.aG(paramg.getString(".com.tencent.mm.debug.cdn.front"), "");
                  af.exx = bi.aG(paramg.getString(".com.tencent.mm.debug.cdn.zone"), "");
                  af.exy = bi.aG(paramg.getString(".com.tencent.mm.debug.cdn.wifi_elt"), "");
                  af.exz = bi.aG(paramg.getString(".com.tencent.mm.debug.cdn.nowifi_elt"), "");
                  af.exA = bi.aG(paramg.getString(".com.tencent.mm.debug.cdn.ptl"), "");
                  af.exB = bi.a(paramg.eA(".com.tencent.mm.debug.cdn.usestream"), false);
                  af.exC = bi.a(paramg.eA(".com.tencent.mm.debug.cdn.onlysendetl"), false);
                  af.exD = bi.a(paramg.eA(".com.tencent.mm.debug.cdn.onlysendptl"), false);
                  af.exF = bi.a(paramg.eA(".com.tencent.mm.debug.cdn.enable_debug"), false);
                  af.exG = bi.a(paramg.eA(".com.tencent.mm.debug.cdn.enable_conn_verify"), false);
                  af.exH = bi.a(paramg.eA(".com.tencent.mm.debug.cdn.enable_video_redirect_oc"), false);
                  af.exN = bi.a(paramg.eA(".com.tencent.mm.debug.bakmove_hardcode"), false);
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WorkerDebugger", "Test.bakmove_hardcode = " + af.exN);
                  af.exO = bi.aG(paramg.getString(".com.tencent.mm.debug.bakmove_ip"), "");
                  af.exP = bi.getInt(bi.aG(paramg.getString(".com.tencent.mm.debug.bakmove_port"), "0"), 0);
                  af.exK = bi.a(paramg.eA(".com.tencent.mm.debug.cursormode_enabled"), true);
                  af.eym = bi.a(paramg.eA(".com.tencent.mm.debug.disaster_ignore_interval"), false);
                  af.eyn = bi.a(paramg.eA(".com.tencent.mm.debug.disaster_ignore_expire"), false);
                  af.eyo = bi.a(paramg.eA(".com.tencent.mm.debug.disaster_ignore_remove"), false);
                  af.eya = bi.a(paramg.eA(".com.tencent.mm.debug.netscene_sniffer.enable_snapshot"), false);
                  af.eyc = bi.aG(paramg.getString(".com.tencent.mm.debug.netscene_sniffer.snapshot_protocal"), "");
                  af.eyb = bi.a(paramg.eA(".com.tencent.mm.debug.netscene_sniffer.enable_inject"), false);
                  af.eyd = bi.aG(paramg.getString(".com.tencent.mm.debug.netscene_sniffer.inject_protocal"), "");
                  af.eyj = bi.a(paramg.eA(".com.tencent.mm.debug.netmock"), false);
                  paramg = bi.fW(ad.getContext());
                  if ((paramg != null) && (paramg.getPackageName().equals(ad.getPackageName())) && (paramg.getClassName().equals(ad.chW())))
                  {
                    WorkerProfile.vt().bzD = true;
                    WorkerProfile.vt().bzE = true;
                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PluginBigBallOfMud", "start time check currentActivity.getPackageName() :%s, currentActivity.getClassName(): %s", new Object[] { paramg.getPackageName(), paramg.getClassName() });
                    com.tencent.mm.model.d.b.JG();
                    com.tencent.mm.model.d.b.setup();
                    AppLogic.setCallBack(new AppCallBack(ad.getContext()));
                    SmcLogic.setCallBack(new i());
                    i.mEZ = (WorkerProfile)this.mProfileCompat;
                    com.tencent.mm.compatible.util.k.b(com.tencent.mm.sdk.a.sFa, getClass().getClassLoader());
                    BaseEvent.onCreate();
                    SmcLogic.SetDebugFlag(com.tencent.mm.plugin.report.a.c.mDC);
                    if (getClass().getClassLoader() != null) {
                      break label3318;
                    }
                    i = -1;
                    if (Thread.currentThread().getContextClassLoader() != null) {
                      break label3332;
                    }
                    j = -1;
                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PluginBigBallOfMud", "SmcLogic, class loader %s, %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
                  }
                }
                catch (Exception localException5)
                {
                  try
                  {
                    for (;;)
                    {
                      if (com.tencent.mm.compatible.util.d.fS(20))
                      {
                        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PluginBigBallOfMud", "weird");
                        SmcLogic.setUin(0L);
                      }
                      paramg = (com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class);
                      localObject1 = (com.tencent.mm.plugin.zero.a.d)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.zero.a.d.class);
                      new com.tencent.mm.plugin.i.d().after(paramg).before(this);
                      localObject2 = (com.tencent.mm.plugin.i.b)new com.tencent.mm.plugin.i.b().after(paramg).before(this);
                      new com.tencent.mm.plugin.i.f().after((com.tencent.mm.kernel.b.a)localObject2).before(this);
                      new com.tencent.mm.plugin.i.c().after(paramg).before(this);
                      new com.tencent.mm.plugin.i.a().after((com.tencent.mm.kernel.b.a)localObject1);
                      com.tencent.mm.pluginsdk.g.a.a.m.a(new PluginBigBallOfMud.14(this));
                      g.b.a(new PluginBigBallOfMud.2(this));
                      g.b.a(new com.tencent.mm.by.c() {});
                      g.b.a(new PluginBigBallOfMud.4(this));
                      g.b.a(new com.tencent.mm.by.c() {});
                      g.b.a(new com.tencent.mm.by.c() {});
                      return;
                      ad.bZ((String)localObject2);
                      if (((String)localObject2).equals(ad.getPackageName())) {
                        localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.WorkerProfile");
                      }
                      for (;;)
                      {
                        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ProfileFactoryImpl", "application started, profile = %s", new Object[] { localObject2 });
                        break;
                        if (((String)localObject2).equals(ad.getPackageName() + ":push"))
                        {
                          localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.PusherProfile");
                        }
                        else if (((String)localObject2).equals(ad.getPackageName() + ":tools"))
                        {
                          localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.ToolsProfile");
                        }
                        else if (((String)localObject2).equals(ad.getPackageName() + ":sandbox"))
                        {
                          localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.SandBoxProfile");
                        }
                        else if (((String)localObject2).equals(ad.getPackageName() + ":exdevice"))
                        {
                          localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.ExDeviceProfile");
                        }
                        else if (((String)localObject2).equals(ad.getPackageName() + ":TMAssistantDownloadSDKService"))
                        {
                          localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.TMAssistantProfile");
                        }
                        else if (((String)localObject2).equals(ad.getPackageName() + ":nospace"))
                        {
                          localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.NoSpaceProfile");
                        }
                        else if (((String)localObject2).equals(ad.getPackageName() + ":patch"))
                        {
                          localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.PatchProfile");
                        }
                        else if (((String)localObject2).startsWith(ad.getPackageName() + ":appbrand"))
                        {
                          localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.AppBrandProfile");
                        }
                        else
                        {
                          if (!((String)localObject2).startsWith(ad.getPackageName() + ":support")) {
                            break label3165;
                          }
                          localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.SupportProfile");
                        }
                      }
                      label3165:
                      com.tencent.mm.sdk.a.b.A("MMApplication onCreate profile == null", "profile is null and initMMcore failed");
                      localObject1 = null;
                      break;
                      localException1 = localException1;
                      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WorkerDebugger", "no debugger was got");
                      continue;
                      localException2 = localException2;
                      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WorkerDebugger", "no debugger was got");
                      continue;
                      localException3 = localException3;
                      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WorkerDebugger", "no debugger was got");
                      continue;
                      localException4 = localException4;
                      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WorkerDebugger", "no debugger was got");
                      continue;
                      localException5 = localException5;
                      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WorkerDebugger", "no debugger was got");
                      continue;
                      if (paramg != null) {
                        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PluginBigBallOfMud", "start time check onCreate appOnCreate currentActivity.getPackageName() :%s, currentActivity.getClassName(): %s", new Object[] { paramg.getPackageName(), paramg.getClassName() });
                      }
                      while ((paramg != null) && (!paramg.getPackageName().equals(ad.getPackageName())))
                      {
                        WorkerProfile.vt().bzD = true;
                        break;
                        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PluginBigBallOfMud", "start time check onCreate appOnCreate currentActivity == null");
                      }
                      label3318:
                      i = getClass().getClassLoader().hashCode();
                    }
                    label3332:
                    int j = Thread.currentThread().getContextClassLoader().hashCode();
                  }
                  catch (Throwable paramg)
                  {
                    for (;;)
                    {
                      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.PluginBigBallOfMud", paramg, "", new Object[0]);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public void dependency()
  {
    dependsOn(com.tencent.mm.plugin.auth.a.b.class);
    dependsOn(com.tencent.mm.plugin.messenger.foundation.a.o.class);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg) {}
  
  public void installed() {}
  
  public void onBaseContextAttached(Context paramContext) {}
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    Resources localResources = ad.getResources();
    if ((localResources instanceof com.tencent.mm.bq.a)) {
      ((com.tencent.mm.bq.a)localResources).onConfigurationChanged(paramConfiguration);
    }
    if (this.mProfileCompat != null) {
      this.mProfileCompat.onConfigurationChanged(paramConfiguration);
    }
  }
  
  public void onCreate() {}
  
  public void onLowMemory() {}
  
  public void onTerminate()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PluginBigBallOfMud", "onTerminate(%s)", new Object[] { ad.getProcessName() });
    if (this.mProfileCompat != null) {
      this.mProfileCompat.onTerminate();
    }
    MMAppMgr localMMAppMgr = this.appMgr;
    Application localApplication = this.app;
    if (localMMAppMgr.tnk != null) {
      localApplication.unregisterReceiver(localMMAppMgr.tnk);
    }
  }
  
  public void onTrimMemory(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PluginBigBallOfMud", "onTrimMemory, level = %d, process = %s", new Object[] { Integer.valueOf(paramInt), ad.getProcessName() });
    if (this.mProfileCompat != null) {
      this.mProfileCompat.onTrimMemory(paramInt);
    }
  }
  
  public String toString()
  {
    return "plugin-big-ball-of-mud";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/bbom/PluginBigBallOfMud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */