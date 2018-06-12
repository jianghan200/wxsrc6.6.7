package com.tencent.mm.plugin.downloader.d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Looper;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.plugin.downloader.model.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bd;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService;
import com.tencent.tmassistantsdk.storage.TMAssistantFile;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a
  extends h
{
  private byte[] dsN = new byte[0];
  HashMap<String, Long> ibD = new HashMap();
  HashMap<String, Long> ibE = new HashMap();
  private HashMap<String, Long> icE = new HashMap();
  HashMap<String, Long> icF = new HashMap();
  private ConcurrentHashMap<String, Integer> icG = new ConcurrentHashMap();
  HashSet<Long> icH = new HashSet();
  Map<String, String> icI = null;
  com.tencent.mm.sdk.platformtools.al icJ = new com.tencent.mm.sdk.platformtools.al(Looper.getMainLooper(), new a.4(this), false);
  private ITMAssistantDownloadSDKClientListener icK = new a.5(this);
  private TMAssistantDownloadSDKClient mClient = null;
  Context mContext = ad.getContext();
  
  public a(com.tencent.mm.plugin.downloader.model.b paramb)
  {
    super(paramb);
    HashMap localHashMap = new HashMap();
    String str = System.getProperty("http.agent");
    x.i("MicroMsg.FileDownloaderImplTMAssistant", str);
    paramb = str;
    if (bi.oW(str)) {
      paramb = "Mozilla/5.0 (Linux; Android) AppleWebkit (KHTML, like Gecko)";
    }
    str = paramb + " MicroMessenger";
    PackageInfo localPackageInfo = getPackageInfo(this.mContext, ad.getPackageName());
    paramb = str;
    if (localPackageInfo != null)
    {
      paramb = str + "/";
      paramb = paramb + localPackageInfo.versionName;
      paramb = paramb + localPackageInfo.versionCode;
    }
    str = ao.getNetTypeString(ad.getContext());
    paramb = paramb + " NetType/" + str;
    x.i("MicroMsg.FileDownloaderImplTMAssistant", "User-Agent: %s", new Object[] { paramb });
    localHashMap.put("User-Agent", paramb);
    this.icI = localHashMap;
  }
  
  private static void aDf()
  {
    File localFile = new File(TMAssistantFile.getSavePathRootDir() + "/.tmp/");
    if (!localFile.exists()) {
      x.i("MicroMsg.FileDownloaderImplTMAssistant", "Make download dir result: %b", new Object[] { Boolean.valueOf(localFile.mkdirs()) });
    }
  }
  
  private static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    if (paramString == null)
    {
      x.e("MicroMsg.FileDownloaderImplTMAssistant", "getPackageInfo fail, packageName is null");
      return null;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      x.printErrStackTrace("MicroMsg.FileDownloaderImplTMAssistant", paramContext, "", new Object[0]);
    }
    return null;
  }
  
  public final long a(com.tencent.mm.plugin.downloader.c.a parama)
  {
    g.Em().H(new a.1(this, parama));
    return parama.field_downloadId;
  }
  
  public final long a(com.tencent.mm.plugin.downloader.model.e parame)
  {
    if ((parame == null) || (bi.oW(parame.fhq)))
    {
      x.e("MicroMsg.FileDownloaderImplTMAssistant", "Invalid Request");
      return -1L;
    }
    String str1 = parame.fhq;
    String str2 = parame.mAppId;
    com.tencent.mm.plugin.downloader.c.a locala = c.yN(str1);
    if (locala != null)
    {
      localObject = cm(locala.field_downloadId);
      if (((FileDownloadTaskInfo)localObject).status == 1) {
        return ((FileDownloadTaskInfo)localObject).id;
      }
    }
    Object localObject = locala;
    if (locala == null) {
      localObject = c.yK(str2);
    }
    aDf();
    c.yL(str1);
    c.yM(str2);
    locala = f.c(parame);
    if ((parame.ici) && (localObject != null))
    {
      locala.field_downloadId = ((com.tencent.mm.plugin.downloader.c.a)localObject).field_downloadId;
      locala.field_status = 0;
      locala.field_downloaderType = 2;
      locala.field_startTime = System.currentTimeMillis();
      if (localObject == null) {
        break label247;
      }
      if (((com.tencent.mm.plugin.downloader.c.a)localObject).field_status != 2) {
        break label219;
      }
      locala.field_startState = com.tencent.mm.plugin.downloader.a.b.ibt;
    }
    for (;;)
    {
      if (parame.icf) {
        locala.field_md5 = f.yV(locala.field_downloadUrl);
      }
      c.d(locala);
      if ((!parame.fGM) || (ao.isWifi(ad.getContext()))) {
        break label255;
      }
      x.i("MicroMsg.FileDownloaderImplTMAssistant", "downloadInWifi, not wifi");
      return locala.field_downloadId;
      locala.field_downloadId = System.currentTimeMillis();
      break;
      label219:
      if (((com.tencent.mm.plugin.downloader.c.a)localObject).field_status == 4)
      {
        locala.field_startState = com.tencent.mm.plugin.downloader.a.b.ibt;
      }
      else
      {
        locala.field_startState = com.tencent.mm.plugin.downloader.a.b.ibs;
        continue;
        label247:
        locala.field_startState = 0;
      }
    }
    label255:
    return a(locala);
  }
  
  final boolean aDe()
  {
    if ((this.icH == null) || (this.icH.size() == 0))
    {
      TMAssistantDownloadSDKManager.getInstance(this.mContext).releaseDownloadSDKClient("WechatDownloadClient");
      if (this.mClient != null) {
        this.mClient.unRegisterDownloadTaskListener(this.icK);
      }
      this.mClient = null;
      TMAssistantDownloadSDKManager.closeAllService(this.mContext);
      try
      {
        Intent localIntent = new Intent(this.mContext, TMAssistantDownloadSDKService.class);
        this.mContext.stopService(localIntent);
        x.i("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistantSDK Client released");
        return true;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.e("MicroMsg.FileDownloaderImplTMAssistant", "Error occurred when stopping TMAssistant Service: " + localException.toString());
        }
      }
    }
    x.i("MicroMsg.FileDownloaderImplTMAssistant", "Still have tasks running");
    return false;
  }
  
  final void cancelNotification(String paramString)
  {
    synchronized (this.dsN)
    {
      Integer localInteger = (Integer)this.icG.get(paramString);
      if (localInteger == null)
      {
        x.i("MicroMsg.FileDownloaderImplTMAssistant", "No notification id found");
        return;
      }
      ((com.tencent.mm.plugin.notification.b.a)g.n(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(localInteger.intValue());
      x.i("MicroMsg.FileDownloaderImplTMAssistant", "cancelNotification, id = " + localInteger);
      this.icG.remove(paramString);
      return;
    }
  }
  
  public final int cl(long paramLong)
  {
    g.Em().H(new a.2(this, paramLong));
    return 1;
  }
  
  public final FileDownloadTaskInfo cm(long paramLong)
  {
    final FileDownloadTaskInfo localFileDownloadTaskInfo = new FileDownloadTaskInfo();
    localFileDownloadTaskInfo.id = paramLong;
    final com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    if ((locala == null) || (bi.oW(locala.field_downloadUrl))) {
      return localFileDownloadTaskInfo;
    }
    localFileDownloadTaskInfo.url = locala.field_downloadUrl;
    localFileDownloadTaskInfo.status = locala.field_status;
    localFileDownloadTaskInfo.path = locala.field_filePath;
    localFileDownloadTaskInfo.icq = locala.field_downloadedSize;
    localFileDownloadTaskInfo.gTK = locala.field_totalSize;
    localFileDownloadTaskInfo.bKg = locala.field_md5;
    (FileDownloadTaskInfo)new bd(localFileDownloadTaskInfo, localFileDownloadTaskInfo, locala)
    {
      private FileDownloadTaskInfo aDg()
      {
        try
        {
          localTMAssistantDownloadTaskInfo = a.a(a.this).getDownloadTaskState(localFileDownloadTaskInfo.url);
          if (localTMAssistantDownloadTaskInfo == null)
          {
            if (localFileDownloadTaskInfo.status == 1) {
              localFileDownloadTaskInfo.status = 0;
            }
            return localFileDownloadTaskInfo;
          }
          switch (localTMAssistantDownloadTaskInfo.mState)
          {
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            TMAssistantDownloadTaskInfo localTMAssistantDownloadTaskInfo;
            x.e("MicroMsg.FileDownloaderImplTMAssistant", "getDownloadTaskState faile: " + localException.toString());
            continue;
            localFileDownloadTaskInfo.status = 2;
          }
        }
        if (localFileDownloadTaskInfo.status == 1) {}
        for (localFileDownloadTaskInfo.status = 0;; localFileDownloadTaskInfo.status = 1)
        {
          localFileDownloadTaskInfo.path = localTMAssistantDownloadTaskInfo.mSavePath;
          localFileDownloadTaskInfo.icq = localTMAssistantDownloadTaskInfo.mReceiveDataLen;
          localFileDownloadTaskInfo.gTK = localTMAssistantDownloadTaskInfo.mTotalDataLen;
          x.i("MicroMsg.FileDownloaderImplTMAssistant", "queryDownloadTask: appId: %s, status: %d, url: %s, path: %s", new Object[] { locala.field_appId, Integer.valueOf(localFileDownloadTaskInfo.status), localFileDownloadTaskInfo.url, localFileDownloadTaskInfo.path });
          return localFileDownloadTaskInfo;
        }
      }
    }.a(g.Em().cil());
  }
  
  public final boolean cn(long paramLong)
  {
    com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    if ((locala == null) || (bi.oW(locala.field_downloadUrl)))
    {
      x.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d, record not found", new Object[] { Long.valueOf(paramLong) });
      return false;
    }
    if (locala.field_downloaderType != 2)
    {
      x.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d, downloader type not matched", new Object[] { Long.valueOf(paramLong) });
      com.tencent.mm.a.e.deleteFile(locala.field_filePath);
      c.ct(paramLong);
      return false;
    }
    g.Em().H(new a.6(this, locala, paramLong));
    return true;
  }
  
  public final boolean co(long paramLong)
  {
    x.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: id = " + paramLong);
    com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    if ((locala == null) || (bi.oW(locala.field_downloadUrl)))
    {
      x.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d, record not found", new Object[] { Long.valueOf(paramLong) });
      return false;
    }
    if (locala.field_downloaderType != 2)
    {
      x.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d, downloader type not matched", new Object[] { Long.valueOf(paramLong) });
      com.tencent.mm.a.e.deleteFile(locala.field_filePath);
      c.ct(paramLong);
      return false;
    }
    locala.field_startTime = System.currentTimeMillis();
    if (locala.field_status == 2) {
      locala.field_startState = com.tencent.mm.plugin.downloader.a.b.ibt;
    }
    for (;;)
    {
      locala.field_startSize = locala.field_downloadedSize;
      locala.field_errCode = 0;
      aDf();
      if ((!locala.field_downloadInWifi) || (ao.isWifi(ad.getContext()))) {
        break;
      }
      x.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask downloadInWifi, not wifi");
      return true;
      if (locala.field_status == 4) {
        locala.field_startState = com.tencent.mm.plugin.downloader.a.b.ibu;
      } else {
        locala.field_startState = com.tencent.mm.plugin.downloader.a.b.ibs;
      }
    }
    g.Em().H(new a.7(this, locala, paramLong));
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/downloader/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */