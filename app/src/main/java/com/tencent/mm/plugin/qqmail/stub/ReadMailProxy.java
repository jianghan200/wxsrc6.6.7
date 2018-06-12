package com.tencent.mm.plugin.qqmail.stub;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.mm.a.o;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.k.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.b;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.downloader.model.l;
import com.tencent.mm.plugin.qqmail.b.p;
import com.tencent.mm.plugin.qqmail.b.p.a;
import com.tencent.mm.plugin.qqmail.b.p.c;
import com.tencent.mm.plugin.qqmail.b.w;
import com.tencent.mm.plugin.qqmail.ui.ReadMailUI;
import com.tencent.mm.plugin.qqmail.ui.ReadMailUI.b;
import com.tencent.mm.plugin.qqmail.ui.ReadMailUI.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.tools.i;
import com.tencent.mm.pluginsdk.ui.tools.i.a;
import com.tencent.mm.remoteservice.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.net.URI;
import java.net.URL;
import java.util.Map;

public class ReadMailProxy
  extends a
{
  private p.a mdr;
  private p.a mee;
  private ReadMailUI.b mef;
  private ReadMailUI.c meg;
  private l meh = new ReadMailProxy.1(this);
  private i.a mei = new ReadMailProxy.2(this);
  
  public ReadMailProxy(com.tencent.mm.remoteservice.d paramd, p.a parama)
  {
    super(paramd);
    this.mdr = parama;
    this.mee = new ReadMailProxy.3(this);
  }
  
  public ReadMailProxy(com.tencent.mm.remoteservice.d paramd, p.a parama, ReadMailUI.b paramb, ReadMailUI.c paramc)
  {
    super(paramd);
    this.mdr = parama;
    this.mef = paramb;
    this.meg = paramc;
    this.mee = new ReadMailProxy.4(this);
  }
  
  @com.tencent.mm.remoteservice.f
  public void addDownloadCallback()
  {
    com.tencent.mm.plugin.downloader.model.d.aCU();
    b.c(this.meh);
  }
  
  @com.tencent.mm.remoteservice.f
  public void cancel(long paramLong)
  {
    new ag().post(new ReadMailProxy.5(this, paramLong));
  }
  
  @com.tencent.mm.remoteservice.f
  public void deleteMsgById(long paramLong)
  {
    au.HU();
    com.tencent.mm.model.c.FT().dX(paramLong);
  }
  
  @com.tencent.mm.remoteservice.f
  public long downloadQQMailApp(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = new URL(paramString1);
      paramString1 = new URI(paramString1.getProtocol(), paramString1.getUserInfo(), paramString1.getHost(), paramString1.getPort(), paramString1.getPath(), paramString1.getQuery(), paramString1.getRef()).toURL();
      e.a locala = new e.a();
      locala.yQ(paramString1.toString());
      locala.yS("qqmail.apk");
      locala.yT(paramString2);
      locala.ef(true);
      locala.ox(1);
      long l = com.tencent.mm.plugin.downloader.model.d.aCU().a(locala.ick);
      return l;
    }
    catch (Exception paramString1)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ReadMailProxy", "dz[download qq mail error:%s]", new Object[] { paramString1.toString() });
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ReadMailProxy", paramString1, "", new Object[0]);
    }
    return -1L;
  }
  
  @com.tencent.mm.remoteservice.f
  public long get(String paramString, Map paramMap, Bundle paramBundle)
  {
    p.c localc = new p.c();
    localc.fromBundle(paramBundle);
    return w.bow().b(paramString, paramMap, localc, this.mee);
  }
  
  @com.tencent.mm.remoteservice.f
  public String getBindUin()
  {
    au.HU();
    return new o(bi.f((Integer)com.tencent.mm.model.c.DT().get(9, null))).toString();
  }
  
  @com.tencent.mm.remoteservice.f
  public Map getCookie()
  {
    return w.bow().getCookie();
  }
  
  @com.tencent.mm.remoteservice.f
  public double getMailAppDownloadProgress(long paramLong)
  {
    FileDownloadTaskInfo localFileDownloadTaskInfo = com.tencent.mm.plugin.downloader.model.d.aCU().cm(paramLong);
    if (localFileDownloadTaskInfo.gTK <= 0L) {
      return 0.0D;
    }
    return 1.0D * localFileDownloadTaskInfo.icq / localFileDownloadTaskInfo.gTK;
  }
  
  @com.tencent.mm.remoteservice.f
  public Integer getMailAppDownloadStatus(long paramLong)
  {
    return Integer.valueOf(com.tencent.mm.plugin.downloader.model.d.aCU().cm(paramLong).status);
  }
  
  @com.tencent.mm.remoteservice.f
  public String getMailAppEnterUlAndroid()
  {
    return g.AU().getMailAppEnterUlAndroid();
  }
  
  @com.tencent.mm.remoteservice.f
  public String getMailAppRedirectUrlAndroid()
  {
    return g.AU().AK();
  }
  
  @com.tencent.mm.remoteservice.f
  public String getMsgContent(long paramLong)
  {
    au.HU();
    return com.tencent.mm.model.c.FT().dW(paramLong).field_content;
  }
  
  @com.tencent.mm.remoteservice.f
  public Object getUneradMailCountFromConfig()
  {
    au.HU();
    return com.tencent.mm.model.c.DT().get(aa.a.sPF, Integer.valueOf(-1));
  }
  
  @com.tencent.mm.remoteservice.f
  public void getUnreadMailCount()
  {
    i.a(this.mei);
  }
  
  @com.tencent.mm.remoteservice.f
  public String getUserBindEmail()
  {
    return q.getUserBindEmail();
  }
  
  @com.tencent.mm.remoteservice.f
  public boolean isSDCardAvailable()
  {
    au.HU();
    return com.tencent.mm.model.c.isSDCardAvailable();
  }
  
  @com.tencent.mm.remoteservice.e
  public void onComplete()
  {
    if (this.mdr != null) {
      this.mdr.onComplete();
    }
  }
  
  @com.tencent.mm.remoteservice.e
  public void onError(int paramInt, String paramString)
  {
    if (this.mdr != null) {
      this.mdr.onError(paramInt, paramString);
    }
  }
  
  @com.tencent.mm.remoteservice.e
  public boolean onReady()
  {
    if (this.mdr == null) {
      return true;
    }
    return this.mdr.onReady();
  }
  
  @com.tencent.mm.remoteservice.e
  public void onSuccess(String paramString, Map<String, String> paramMap)
  {
    if (this.mdr != null) {
      this.mdr.onSuccess(paramString, paramMap);
    }
  }
  
  @com.tencent.mm.remoteservice.e
  public void onTaskFailed(long paramLong)
  {
    if (this.mef != null) {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ReadMailUI", "onTaskFailed id:%d", new Object[] { Long.valueOf(paramLong) });
    }
  }
  
  @com.tencent.mm.remoteservice.e
  public void onTaskFinished(long paramLong)
  {
    if (this.mef != null) {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ReadMailUI", "onTaskFinished id:%d", new Object[] { Long.valueOf(paramLong) });
    }
  }
  
  @com.tencent.mm.remoteservice.e
  public void onTaskPaused(long paramLong)
  {
    if (this.mef != null) {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ReadMailUI", "onTaskPaused id:%d", new Object[] { Long.valueOf(paramLong) });
    }
  }
  
  @com.tencent.mm.remoteservice.e
  public void onTaskRemoved(long paramLong)
  {
    if (this.mef != null) {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ReadMailUI", "onTaskRemoved id:%d", new Object[] { Long.valueOf(paramLong) });
    }
  }
  
  @com.tencent.mm.remoteservice.e
  public void onTaskStarted(long paramLong, String paramString)
  {
    if (this.mef != null)
    {
      ReadMailUI.b localb = this.mef;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ReadMailUI", "onTaskStarted id:%d, saveFilePath:%s", new Object[] { Long.valueOf(paramLong), paramString });
      ReadMailUI.a(localb.miD, ad.getContext().getSharedPreferences("QQMAIL", 4));
      if (ReadMailUI.o(localb.miD) != null) {
        ReadMailUI.o(localb.miD).edit().putString("qqmail_downloadpath", paramString).commit();
      }
    }
  }
  
  @com.tencent.mm.remoteservice.f
  public long post(String paramString, Map paramMap, Bundle paramBundle)
  {
    p.c localc = new p.c();
    localc.fromBundle(paramBundle);
    return w.bow().a(paramString, paramMap, localc, this.mee);
  }
  
  @com.tencent.mm.remoteservice.f
  public void removeDownloadCallback()
  {
    com.tencent.mm.plugin.downloader.model.d.aCU();
    b.aCP();
  }
  
  @com.tencent.mm.remoteservice.f
  public int removeDownloadQQMailAppTask(long paramLong)
  {
    return com.tencent.mm.plugin.downloader.model.d.aCU().cl(paramLong);
  }
  
  @com.tencent.mm.remoteservice.f
  public void replaceMsgContent(long paramLong, String paramString)
  {
    new ag().post(new ReadMailProxy.6(this, paramLong, paramString));
  }
  
  @com.tencent.mm.remoteservice.f
  public void reportKvState(int paramInt1, int paramInt2)
  {
    h.mEJ.h(paramInt1, new Object[] { Integer.valueOf(paramInt2) });
  }
  
  @com.tencent.mm.remoteservice.f
  public void reportKvStates(int paramInt1, int paramInt2, int paramInt3)
  {
    h.mEJ.h(paramInt1, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  @com.tencent.mm.remoteservice.f
  public Integer showMailAppRecommend()
  {
    if (com.tencent.mm.sdk.platformtools.e.bxk == 1) {
      return Integer.valueOf(0);
    }
    return Integer.valueOf(bi.getInt(g.AU().G("MailApp", "ShowMailAppRecommend"), 0));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/qqmail/stub/ReadMailProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */