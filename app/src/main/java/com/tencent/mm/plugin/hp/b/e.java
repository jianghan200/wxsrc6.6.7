package com.tencent.mm.plugin.hp.b;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.model.au;
import com.tencent.mm.modelmulti.m;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.downloader.model.l;
import com.tencent.mm.plugin.hp.a.a.1;
import com.tencent.mm.plugin.hp.tinker.g;
import com.tencent.mm.protocal.c.bsx;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import java.io.File;

public final class e
  implements l
{
  final com.tencent.mm.plugin.hp.d.b kmF;
  private long kmG;
  
  public e(com.tencent.mm.plugin.hp.d.b paramb)
  {
    this.kmF = paramb;
    com.tencent.mm.plugin.downloader.model.d.aCU();
    com.tencent.mm.plugin.downloader.model.b.a(this);
  }
  
  final void aWp()
  {
    if (!com.tencent.mm.compatible.util.h.getExternalStorageState().equals("mounted"))
    {
      x.e("Tinker.SyncResponseProcessor", "no sdcard.");
      com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 50L, 1L, false);
    }
    for (;;)
    {
      return;
      if (!f.aM(this.kmF.fileSize))
      {
        x.e("Tinker.SyncResponseProcessor", "sdcard is full.");
        com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 51L, 1L, false);
        if (this.kmF.knf.intValue() == 3) {
          com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 55L, 1L, false);
        }
      }
      else
      {
        if ((this.kmF.knf.intValue() == 3) && (!bi.oW(this.kmF.knk)) && (com.tencent.mm.a.e.cn(com.tencent.mm.pluginsdk.f.i.Tg(this.kmF.knk))) && (com.tencent.mm.c.a.cE(com.tencent.mm.pluginsdk.f.i.Tg(this.kmF.knk))))
        {
          Context localContext = ad.getContext();
          if (bi.oW(this.kmF.aWz())) {}
          for (localObject = localContext.getString(R.l.update_tip_recommended_down);; localObject = this.kmF.aWz())
          {
            bsx localbsx = new bsx();
            localbsx.knj = this.kmF.knj;
            localbsx.title = localContext.getString(R.l.fmt_update);
            localbsx.sqq = localContext.getString(R.l.install_now);
            localbsx.kcL = localContext.getString(R.l.update_cancel);
            localbsx.knk = this.kmF.knk;
            localbsx.knl = this.kmF.knl;
            localbsx.gsu = this.kmF.fileSize;
            localbsx.knh = this.kmF.knh;
            localbsx.bxD = this.kmF.kni;
            localbsx.versionCode = this.kmF.versionCode;
            localbsx.sqp = com.tencent.mm.pluginsdk.f.i.Tg(this.kmF.knk);
            localbsx.bIr = ((String)localObject);
            com.tencent.mm.pluginsdk.f.i.a(localbsx);
            x.i("Tinker.SyncResponseProcessor", "file is exist. need no to download. newApkMd5:%s", new Object[] { this.kmF.knk });
            return;
          }
        }
        this.kmF.knf.intValue();
        com.tencent.mm.pluginsdk.f.i.ccl();
        com.tencent.mm.pluginsdk.f.i.ccm();
        Object localObject = new e.a();
        ((e.a)localObject).yQ(this.kmF.knh);
        ((e.a)localObject).yS(this.kmF.knj);
        ((e.a)localObject).yT(this.kmF.kni);
        ((e.a)localObject).ef(false);
        ((e.a)localObject).aDa();
        ((e.a)localObject).ox(2);
        ((e.a)localObject).eg(false);
        this.kmG = com.tencent.mm.plugin.downloader.model.d.aCU().a(((e.a)localObject).ick);
        x.i("Tinker.SyncResponseProcessor", "Download task id is :%d", new Object[] { Long.valueOf(this.kmG) });
        com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 2L, 1L, false);
        if (ao.isWifi(ad.getContext())) {
          com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 7L, 1L, false);
        }
        while (this.kmF.knf.intValue() == 3)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 56L, 1L, false);
          x.d("Tinker.SyncResponseProcessor", "boots download start silent.");
          return;
          com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 8L, 1L, false);
        }
      }
    }
  }
  
  public final void b(long paramLong, int paramInt, boolean paramBoolean)
  {
    x.w("Tinker.SyncResponseProcessor", "onTaskFailed");
    if (this.kmG != paramLong)
    {
      x.i("Tinker.SyncResponseProcessor", "onTaskFailed ignore. id is no equal. download id :%s callback id:%s", new Object[] { Long.valueOf(this.kmG), Long.valueOf(paramLong) });
      return;
    }
    b.rn(2);
    if (this.kmF.knf.intValue() == 3) {
      com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 51L, 1L, false);
    }
    com.tencent.mm.plugin.downloader.model.d.aCU();
    com.tencent.mm.plugin.downloader.model.b.b(this);
  }
  
  public final void b(long paramLong, String paramString, boolean paramBoolean)
  {
    x.i("Tinker.SyncResponseProcessor", "onTaskFinished id:%d path:%s hasChangeUrl:%s", new Object[] { Long.valueOf(paramLong), paramString, Boolean.valueOf(paramBoolean) });
    if (this.kmG != paramLong)
    {
      x.i("Tinker.SyncResponseProcessor", "onTaskFinished ignore. id is no equal. download id :%s callback id:%s", new Object[] { Long.valueOf(this.kmG), Long.valueOf(paramLong) });
      return;
    }
    b.rm(2);
    Context localContext = ad.getContext();
    Object localObject2 = new File(paramString);
    paramString = new ShareSecurityCheck(localContext);
    if ((this.kmF.knf.intValue() == 2) && (!paramString.an((File)localObject2)))
    {
      com.tencent.tinker.lib.f.a.i("Tinker.SyncResponseProcessor", "verify patch signature failed.", new Object[0]);
      b.rn(2);
      com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 31L, 1L, false);
      if (this.kmF.knf.intValue() == 3)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 54L, 1L, false);
        x.d("Tinker.SyncResponseProcessor", "boots download patch md5 no equal.");
      }
      com.tencent.mm.plugin.downloader.model.d.aCU();
      com.tencent.mm.plugin.downloader.model.b.b(this);
      return;
    }
    paramString = localContext.getApplicationInfo();
    if (paramString == null) {
      paramString = null;
    }
    Object localObject1;
    while (paramString != null)
    {
      paramString = paramString.listFiles();
      if (paramString == null) {
        break;
      }
      localObject1 = ((File)localObject2).getName();
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        File localFile = paramString[i];
        if (!localFile.getName().equals(localObject1)) {
          SharePatchFileUtil.aj(localFile);
        }
        i += 1;
      }
      localObject1 = new File(paramString.dataDir, "tinker_server");
      paramString = (String)localObject1;
      if (!((File)localObject1).exists())
      {
        ((File)localObject1).mkdirs();
        paramString = (String)localObject1;
      }
    }
    switch (this.kmF.knf.intValue())
    {
    default: 
      label352:
      paramString = this.kmF;
      if (!paramString.aWy()) {
        break;
      }
    }
    for (paramString = com.tencent.mm.plugin.hp.d.b.a(paramString.kne, 2);; paramString = "")
    {
      localContext.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_msg_key", paramString).apply();
      break;
      com.tencent.tinker.lib.f.a.i("Tinker.SyncResponseProcessor", "onReceiveUpgradePatch. try to start apply", new Object[0]);
      com.tencent.tinker.lib.e.c.bP(localContext, ((File)localObject2).getAbsolutePath());
      break label352;
      paramString = ((File)localObject2).getAbsolutePath();
      localObject1 = this.kmF;
      x.i("MicroMsg.Tinker.CTinkerInstaller", "onReceiveUpgradeBsDiff bsDiffPath:%s , new apk md5：%s", new Object[] { paramString, ((com.tencent.mm.plugin.hp.d.b)localObject1).knk });
      localObject2 = com.tencent.mm.pluginsdk.f.i.Tg(((com.tencent.mm.plugin.hp.d.b)localObject1).knk);
      au.Em().H(new a.1((String)localObject2, localContext, paramString, (com.tencent.mm.plugin.hp.d.b)localObject1));
      break label352;
      x.i("Tinker.SyncResponseProcessor", "coming soon! now can not support full apk update.");
      break label352;
    }
  }
  
  public final void bP(long paramLong)
  {
    x.d("Tinker.SyncResponseProcessor", "onTaskProgressChanged");
  }
  
  public final boolean fL(boolean paramBoolean)
  {
    com.tencent.tinker.lib.f.a.i("Tinker.SyncResponseProcessor", "process tinker response: %s", new Object[] { this.kmF.toString() });
    Object localObject1 = this.kmF;
    int i;
    if ((((com.tencent.mm.plugin.hp.d.b)localObject1).knd.intValue() > 4) || (((com.tencent.mm.plugin.hp.d.b)localObject1).knd.intValue() <= 0))
    {
      x.e("Tinker.TinkerSyncResponse", "responseState: %d must between %d and %d", new Object[] { ((com.tencent.mm.plugin.hp.d.b)localObject1).knd, Integer.valueOf(1), Integer.valueOf(4) });
      com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 24L, 1L, false);
      i = 0;
    }
    while (i == 0)
    {
      com.tencent.tinker.lib.f.a.i("Tinker.SyncResponseProcessor", "process check response fail, just return", new Object[0]);
      return false;
      if (((com.tencent.mm.plugin.hp.d.b)localObject1).aWx())
      {
        if (TextUtils.isEmpty(((com.tencent.mm.plugin.hp.d.b)localObject1).knj))
        {
          x.e("Tinker.TinkerSyncResponse", "sync response patchId should not be null");
          com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 25L, 1L, false);
          i = 0;
          continue;
        }
        if (TextUtils.isEmpty(((com.tencent.mm.plugin.hp.d.b)localObject1).knh))
        {
          x.e("Tinker.TinkerSyncResponse", "sync response cdnUrl should not be null");
          com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 26L, 1L, false);
          i = 0;
          continue;
        }
        if (TextUtils.isEmpty(((com.tencent.mm.plugin.hp.d.b)localObject1).kni))
        {
          x.e("Tinker.TinkerSyncResponse", "sync response fileMd5 should not be null");
          com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 27L, 1L, false);
          i = 0;
          continue;
        }
      }
      i = 1;
    }
    if (this.kmF.knd.intValue() == 3)
    {
      i = 1;
      if (i == 0) {
        break label375;
      }
      localObject2 = ad.getContext();
      localObject1 = com.tencent.tinker.lib.e.a.hL((Context)localObject2);
      if (((com.tencent.tinker.lib.e.a)localObject1).vsE) {
        break label299;
      }
      com.tencent.tinker.lib.f.a.w("Tinker.SyncResponseProcessor", "SyncResponseProcessor: onPatchRollback, tinker is not loaded, just return", new Object[0]);
    }
    for (;;)
    {
      return true;
      i = 0;
      break;
      label299:
      com.tencent.tinker.lib.f.a.i("Tinker.SyncResponseProcessor", "tinker wait screen to clean patch and kill all process", new Object[0]);
      new m(ad.getContext(), new e.3(this, (Context)localObject2, (com.tencent.tinker.lib.e.a)localObject1));
      localObject2 = new SharePatchInfo(((com.tencent.tinker.lib.e.a)localObject1).vsD.vsI, "00000000000000000000000000000000", Build.FINGERPRINT, "odex");
      SharePatchInfo.a(((com.tencent.tinker.lib.e.a)localObject1).vsA, (SharePatchInfo)localObject2, ((com.tencent.tinker.lib.e.a)localObject1).vsB);
    }
    label375:
    if (!this.kmF.aWx()) {
      return true;
    }
    Object localObject3;
    if ((this.kmF.knf.intValue() == 3) && (!bi.oW(this.kmF.clientVersion)) && (com.tencent.mm.plugin.hp.d.c.EI(this.kmF.clientVersion)))
    {
      com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 77L, 1L, false);
      localObject3 = this.kmF;
      Context localContext = ad.getContext();
      if (bi.oW(((com.tencent.mm.plugin.hp.d.b)localObject3).knm))
      {
        localObject1 = localContext.getString(R.l.app_recommend_update_alpha);
        if (!bi.oW(((com.tencent.mm.plugin.hp.d.b)localObject3).knn)) {
          break label698;
        }
        localObject2 = "";
        label488:
        if (!bi.oW(((com.tencent.mm.plugin.hp.d.b)localObject3).kno)) {
          break label708;
        }
        localObject3 = "http://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/android_exp__index";
        label504:
        Intent localIntent = new Intent("android.intent.action.VIEW");
        localIntent.setClassName(ad.getPackageName(), ad.getPackageName() + ".plugin.webview.ui.tools.WebViewUI");
        localIntent.putExtra("rawUrl", (String)localObject3);
        localIntent.putExtra("useJs", true);
        localIntent.putExtra("vertical_scroll", true);
        localIntent.setFlags(872415232);
        localObject3 = PendingIntent.getActivity(localContext, 0, localIntent, 268435456);
        localObject1 = new Notification.Builder(localContext).setTicker(null).setWhen(System.currentTimeMillis()).setContentTitle((CharSequence)localObject1).setContentText((CharSequence)localObject2).setContentIntent((PendingIntent)localObject3);
        ((Notification.Builder)localObject1).setSmallIcon(com.tencent.mm.bf.a.cbg());
        localObject1 = ((Notification.Builder)localObject1).getNotification();
        ((Notification)localObject1).icon = R.g.update_package_download_anim0;
        ((Notification)localObject1).flags |= 0x10;
        if (!paramBoolean) {
          break label718;
        }
        ((NotificationManager)localContext.getSystemService("notification")).notify(19841110, (Notification)localObject1);
      }
      for (;;)
      {
        return true;
        localObject1 = ((com.tencent.mm.plugin.hp.d.b)localObject3).knm;
        break;
        label698:
        localObject2 = ((com.tencent.mm.plugin.hp.d.b)localObject3).knn;
        break label488;
        label708:
        localObject3 = ((com.tencent.mm.plugin.hp.d.b)localObject3).kno;
        break label504;
        label718:
        x.i("Tinker.SyncResponseProcessor", "ignore action when load from cache,when response is alpha version");
      }
    }
    com.tencent.tinker.lib.f.a.i("Tinker.SyncResponseProcessor", "check need show before download. network type:%d msg:%s", new Object[] { this.kmF.kng, this.kmF.aWz() });
    Object localObject2 = ad.getContext();
    if ((this.kmF.kng.intValue() == 2) && (ao.isMobile(ad.getContext())) && (this.kmF.aWy())) {
      if (!g.ar((Context)localObject2, this.kmF.knj)) {
        if (this.kmF.knf.intValue() == 2)
        {
          localObject1 = ad.getContext().getString(R.l.fmt_update_info, new Object[] { this.kmF.aWz(), ad.getContext().getString(R.l.update_increment_tips), bi.bF(this.kmF.fileSize) });
          i.a(ad.getContext().getString(R.l.fmt_update), (String)localObject1, ad.getContext().getString(R.l.update_now), new e.1(this), ad.getContext().getString(R.l.update_cancel), new e.2(this, (Context)localObject2));
          a.rk(4);
        }
      }
    }
    for (;;)
    {
      return true;
      if (this.kmF.knf.intValue() != 3) {
        break;
      }
      x.d("Tinker.SyncResponseProcessor", "showUpdateDialog ");
      if (bi.oW(this.kmF.aWz())) {}
      for (localObject1 = ((Context)localObject2).getString(R.l.update_tip_recommended_down);; localObject1 = this.kmF.aWz())
      {
        localObject3 = new bsx();
        ((bsx)localObject3).knj = this.kmF.knj;
        ((bsx)localObject3).title = ((Context)localObject2).getString(R.l.fmt_update);
        ((bsx)localObject3).sqq = ((Context)localObject2).getString(R.l.update_now);
        ((bsx)localObject3).kcL = ((Context)localObject2).getString(R.l.update_cancel);
        ((bsx)localObject3).knk = this.kmF.knk;
        ((bsx)localObject3).knl = this.kmF.knl;
        ((bsx)localObject3).gsu = this.kmF.fileSize;
        ((bsx)localObject3).knh = this.kmF.knh;
        ((bsx)localObject3).bxD = this.kmF.kni;
        ((bsx)localObject3).versionCode = this.kmF.versionCode;
        ((bsx)localObject3).sqp = com.tencent.mm.pluginsdk.f.i.Tg(this.kmF.knk);
        ((bsx)localObject3).bIr = ((String)localObject1);
        com.tencent.mm.pluginsdk.f.i.a((bsx)localObject3);
        break;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 44L, 1L, false);
      x.i("Tinker.SyncResponseProcessor", "this patch id :%s show cancel before user, need show again.", new Object[] { this.kmF.knj });
      continue;
      if ((this.kmF.aWw()) && (!g.ar((Context)localObject2, this.kmF.knj))) {
        aWp();
      }
    }
  }
  
  public final void h(long paramLong, String paramString)
  {
    x.d("Tinker.SyncResponseProcessor", "onTaskResumed");
  }
  
  public final void onTaskPaused(long paramLong)
  {
    x.d("Tinker.SyncResponseProcessor", "onTaskPaused");
  }
  
  public final void onTaskRemoved(long paramLong)
  {
    x.i("Tinker.SyncResponseProcessor", "onTaskRemoved");
    com.tencent.mm.plugin.downloader.model.d.aCU();
    com.tencent.mm.plugin.downloader.model.b.b(this);
  }
  
  public final void onTaskStarted(long paramLong, String paramString)
  {
    x.d("Tinker.SyncResponseProcessor", "onTaskStarted");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/hp/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */