package com.tencent.mm.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.tencent.mm.boot.a.a;
import com.tencent.mm.kernel.j;
import com.tencent.mm.loader.stub.BaseBuildInfo;
import com.tencent.mm.modelrecovery.PluginRecovery;
import com.tencent.mm.plugin.auth.PluginAuth;
import com.tencent.mm.plugin.bbom.PluginBigBallOfMud;
import com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.mm.plugin.report.PluginReport;
import com.tencent.mm.plugin.zero.PluginZero;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bd;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Map;

public final class g
  extends com.tencent.mm.kernel.a.d
{
  private static boolean byr = true;
  private com.tencent.mm.by.k byp = new com.tencent.mm.by.k();
  private volatile boolean byq = false;
  
  private static void uS()
  {
    long l = System.currentTimeMillis();
    o.ve();
    l = System.currentTimeMillis() - l;
    com.tencent.mm.blink.a.j(4L, l);
    com.tencent.mm.blink.a.j(5L, 1L);
    x.i("MicroMsg.DefaultBootStep", "SVG newInstance done, spent %s", new Object[] { Long.valueOf(l) });
  }
  
  public final void a(com.tencent.mm.kernel.b.g paramg)
  {
    
    if (((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).ES()) {
      new ah("Startup-SideWork").H(new g.1(this, paramg));
    }
    super.a(paramg);
  }
  
  public final void b(com.tencent.mm.kernel.b.g paramg)
  {
    com.tencent.mm.by.k localk;
    if (((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).ES()) {
      localk = this.byp;
    }
    synchronized (localk.dol)
    {
      try
      {
        if (localk.dol[0] == -1)
        {
          j.i("MicroMsg.WxWaitingLock", "waiting %s", new Object[] { localk });
          localk.dol.wait();
          j.i("MicroMsg.WxWaitingLock", "after waiting %s", new Object[] { localk });
        }
        if (this.byq) {
          x.e("MicroMsg.DefaultBootStep", "SVG still failed!");
        }
        super.b(paramg);
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.WxWaitingLock", localInterruptedException, "", new Object[0]);
        }
      }
    }
  }
  
  public final void uQ()
  {
    super.uQ();
    com.tencent.mm.kernel.a.a.j("Hello WeChat, DefaultBootStep load debugger and newInstance xlog...", new Object[0]);
    ad.getContext().getSystemService("audio");
    k.cN(((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).dox);
    o.h(a.a.class);
    o.cQ("com.tencent.mm.boot");
    o.a(((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).dsQ, ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).dsQ.getResources());
  }
  
  public final void uR()
  {
    com.tencent.mm.kernel.g.Ee().dqg = com.tencent.mm.plugin.zero.a.d.class;
    r(PluginZero.class);
    r(PluginMessengerFoundation.class);
    r(PluginReport.class);
    r(PluginAuth.class);
    r(PluginBigBallOfMud.class);
    r(PluginRecovery.class);
    gl("com.tencent.mm.plugin.bbom.PluginCompatOldStructure");
    gl("com.tencent.mm.plugin.bbom.PluginBigBallOfMudAsync");
    gl("com.tencent.mm.plugin.comm.PluginComm");
    gl("com.tencent.mm.plugin.audio.PluginVoice");
    gl("com.tencent.mm.plugin.biz.PluginBiz");
    gm("com.tencent.mm.plugin.bizui.PluginBIZUI");
    gl("com.tencent.mm.plugin.brandservice.PluginBrandService");
    gl("com.tencent.mm.plugin.readerapp.PluginReaderApp");
    gl("com.tencent.mm.plugin.notification.PluginNotification");
    gl("com.tencent.mm.plugin.messenger.PluginMessenger");
    gl("com.tencent.mm.plugin.welab.PluginWelab");
    gl("com.tencent.mm.plugin.sport.PluginSport");
    gl("com.tencent.mm.plugin.fts.PluginFTS");
    gl("com.tencent.mm.openim.PluginOpenIM");
    gm("com.tencent.mm.plugin.performance.PluginPerformance");
    gm("com.tencent.mm.plugin.chatroom.PluginChatroom");
    gm("com.tencent.mm.insane_statistic.PluginInsaneStatistic");
    gm("com.tencent.mm.plugin.appbrand.app.PluginAppBrand");
    gm("com.tencent.mm.plugin.appbrand.compat.PluginAppBrandCompat");
    gm("com.tencent.mm.plugin.uishow.PluginUIShow");
    gm("com.tencent.mm.plugin.emoji.PluginEmoji");
    gm("com.tencent.mm.plugin.game.PluginGame");
    gm("com.tencent.mm.plugin.video.PluginVideo");
    gm("com.tencent.mm.plugin.hardwareopt.PluginHardwareOpt");
    gm("com.tencent.mm.plugin.sns.PluginSns");
    gm("com.tencent.mm.plugin.downloader.PluginDownloader");
    gm("com.tencent.mm.plugin.fav.PluginFav");
    gm("com.tencent.mm.plugin.fav.ui.PluginFavUI");
    gm("com.tencent.mm.plugin.record.PluginRecord");
    gm("com.tencent.mm.plugin.music.PluginMusic");
    gm("com.tencent.mm.plugin.MMPhotoEditPlugin");
    gm("com.tencent.mm.plugin.account.PluginAccount");
    gm("com.tencent.mm.plugin.facedetect.PluginFace");
    gm("com.tencent.mm.plugin.soter.PluginSoter");
    gm("com.tencent.mm.plugin.walletlock.PluginWalletLock");
    gm("com.tencent.mm.plugin.wxpay.PluginWxPay");
    gm("com.tencent.mm.plugin.wxpaysdk.PluginWxPaySdk");
    gm("com.tencent.mm.plugin.wxpayapi.PluginWxPayApi");
    gm("com.tencent.mm.plugin.radar.PluginRadar");
    gm("com.tencent.mm.plugin.topstory.PluginTopStory");
    gm("com.tencent.mm.plugin.topstory.ui.PluginTopStoryUI");
    gm("com.tencent.mm.plugin.websearch.PluginWebSearch");
    gm("com.tencent.mm.plugin.fts.ui.PluginFTSUI");
    gm("com.tencent.mm.plugin.card.PluginCard");
    gm("com.tencent.mm.plugin.card.compat.PluginCardCompat");
    gm("com.tencent.mm.plugin.kitchen.PluginKitchen");
    gm("com.tencent.mm.plugin.expt.PluginExpt");
    gm("com.tencent.mm.plugin.monitor.PluginMonitor");
    gm("com.tencent.mm.plugin.mmsight.PluginMMSight");
    gm("com.tencent.mm.plugin.secinforeport.PluginSecInfoReport");
    gm("com.tencent.mm.plugin.normsg.PluginNormsg");
    gm("com.tencent.mm.plugin.netmock.PluginNetMock");
    if (BaseBuildInfo.ENABLE_STETHO) {
      gm("com.tencent.mm.plugin.stetho.PluginStetho");
    }
    gm("com.tencent.mm.plugin.boots.PluginBoots");
    com.tencent.mm.kernel.a.b.g localg = com.tencent.mm.kernel.a.c.Et().drv;
    com.tencent.mm.kernel.b.a locala = com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class);
    localg.dsJ.put(com.tencent.mm.kernel.api.c.class, locala);
  }
  
  public final boolean uT()
  {
    if (byr) {
      return true;
    }
    if (!((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).ES()) {
      return true;
    }
    com.tencent.mm.kernel.g.Eg();
    if ((!com.tencent.mm.kernel.a.Dw()) || (!com.tencent.mm.kernel.g.Eg().Dx())) {
      return true;
    }
    if (com.tencent.mm.splash.h.sMv.size() == 1)
    {
      Activity localActivity = (Activity)com.tencent.mm.splash.h.sMv.get(0);
      if (ad.chW().equals(com.tencent.mm.splash.h.T(localActivity)))
      {
        x.i("MicroMsg.DefaultBootStep", "Found LauncherUI only.");
        return false;
      }
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/app/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */