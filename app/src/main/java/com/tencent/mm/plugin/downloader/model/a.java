package com.tencent.mm.plugin.downloader.model;

import android.content.Context;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.al;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends h
{
  private static final String ibz = com.tencent.mm.loader.stub.b.bnE + "BigFile";
  private byte[] dsN = new byte[0];
  private com.tencent.mm.plugin.cdndownloader.c.b hKd = new a.1(this);
  private HashMap<String, Long> ibA = new HashMap();
  private HashMap<String, Long> ibB = new HashMap();
  private ConcurrentHashMap<String, Integer> ibC = new ConcurrentHashMap();
  private HashMap<String, Long> ibD = new HashMap();
  private HashMap<String, Long> ibE = new HashMap();
  private Context mContext = ad.getContext();
  
  public a(b paramb)
  {
    super(paramb);
    com.tencent.mm.plugin.cdndownloader.c.a.aAk().hKd = this.hKd;
  }
  
  private static CDNTaskInfo b(com.tencent.mm.plugin.downloader.c.a parama)
  {
    CDNTaskInfo localCDNTaskInfo = new CDNTaskInfo();
    localCDNTaskInfo.dQc = true;
    localCDNTaskInfo.mediaId = parama.field_downloadUrl;
    localCDNTaskInfo.downloadUrl = parama.field_downloadUrl;
    localCDNTaskInfo.filePath = parama.field_filePath;
    localCDNTaskInfo.hKj = parama.field_secondaryUrl;
    localCDNTaskInfo.hKl = 15;
    localCDNTaskInfo.hKm = 3600;
    localCDNTaskInfo.hKn = true;
    localCDNTaskInfo.hKo = parama.field_downloadInWifi;
    JSONObject localJSONObject = new JSONObject();
    try
    {
      if (parama.field_fileSize > 0L) {
        localJSONObject.put("Content-Length", parama.field_fileSize);
      }
      localCDNTaskInfo.hKk = localJSONObject.toString();
      return localCDNTaskInfo;
    }
    catch (JSONException parama)
    {
      x.e("MicroMsg.FileCDNDownloader", "addVerifyHeaders: " + parama.getMessage());
    }
    return localCDNTaskInfo;
  }
  
  private void cancelNotification(String paramString)
  {
    synchronized (this.dsN)
    {
      Integer localInteger = (Integer)this.ibC.get(paramString);
      if (localInteger == null)
      {
        x.i("MicroMsg.FileCDNDownloader", "No notification id found");
        return;
      }
      ((com.tencent.mm.plugin.notification.b.a)g.n(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(localInteger.intValue());
      x.i("MicroMsg.FileCDNDownloader", "cancelNotification, id = " + localInteger);
      this.ibC.remove(paramString);
      return;
    }
  }
  
  public final long a(com.tencent.mm.plugin.downloader.c.a parama)
  {
    new Thread(new a.2(this, parama)).start();
    return parama.field_downloadId;
  }
  
  public final long a(e parame)
  {
    if ((parame == null) || (bi.oW(parame.fhq)))
    {
      x.e("MicroMsg.FileCDNDownloader", "Invalid Request");
      return -1L;
    }
    String str = parame.fhq;
    Object localObject3 = c.yN(str);
    Object localObject1 = null;
    if (localObject3 != null)
    {
      localObject2 = cm(((com.tencent.mm.plugin.downloader.c.a)localObject3).field_downloadId);
      x.i("MicroMsg.FileCDNDownloader", "addDownloadTask, status = " + ((FileDownloadTaskInfo)localObject2).status);
      localObject1 = localObject2;
      if (((FileDownloadTaskInfo)localObject2).status == 1) {
        return ((FileDownloadTaskInfo)localObject2).id;
      }
    }
    Object localObject2 = localObject3;
    if (localObject3 == null) {
      localObject2 = c.yK(parame.mAppId);
    }
    localObject3 = new File(ibz);
    File localFile1;
    if (!((File)localObject3).exists())
    {
      if (!((File)localObject3).getParentFile().exists())
      {
        localFile1 = ((File)localObject3).getParentFile();
        File localFile2 = new File(localFile1.getAbsolutePath() + System.currentTimeMillis());
        if (localFile2.mkdirs()) {
          localFile2.renameTo(localFile1);
        }
      }
      else
      {
        x.i("MicroMsg.FileCDNDownloader", "Make download dir result: %b", new Object[] { Boolean.valueOf(((File)localObject3).mkdirs()) });
      }
    }
    else
    {
      c.yL(str);
      c.yM(parame.mAppId);
      localObject3 = f.c(parame);
      if ((!parame.ici) || (localObject2 == null)) {
        break label516;
      }
      ((com.tencent.mm.plugin.downloader.c.a)localObject3).field_downloadId = ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_downloadId;
      label262:
      ((com.tencent.mm.plugin.downloader.c.a)localObject3).field_downloaderType = 3;
      localObject2 = ac.ce(str);
      ((com.tencent.mm.plugin.downloader.c.a)localObject3).field_filePath = (ibz + "/" + (String)localObject2);
      if ((localObject1 == null) || (!((com.tencent.mm.plugin.downloader.c.a)localObject3).field_filePath.equals(((FileDownloadTaskInfo)localObject1).path))) {
        break label557;
      }
      localObject2 = ((com.tencent.mm.plugin.downloader.c.a)localObject3).field_filePath;
      str = ((FileDownloadTaskInfo)localObject1).path;
      if ((localObject2 != null) && (str != null) && (!((String)localObject2).equals(str)))
      {
        localObject2 = new File(str);
        if (((File)localObject2).exists()) {
          x.i("MicroMsg.FileCDNDownloader", "Delete previous file result: %b", new Object[] { Boolean.valueOf(((File)localObject2).delete()) });
        }
      }
      if (((FileDownloadTaskInfo)localObject1).status != 2) {
        break label527;
      }
      ((com.tencent.mm.plugin.downloader.c.a)localObject3).field_startState = com.tencent.mm.plugin.downloader.a.b.ibt;
      label409:
      ((com.tencent.mm.plugin.downloader.c.a)localObject3).field_startSize = ((FileDownloadTaskInfo)localObject1).icq;
      x.d("MicroMsg.FileCDNDownloader", "addDownloadTask, startSize = " + ((FileDownloadTaskInfo)localObject1).icq);
    }
    for (;;)
    {
      ((com.tencent.mm.plugin.downloader.c.a)localObject3).field_startTime = System.currentTimeMillis();
      if ((!parame.fGM) || (ao.isWifi(ad.getContext()))) {
        break label566;
      }
      x.i("MicroMsg.FileCDNDownloader", "downloadInWifi, not in wifi");
      ((com.tencent.mm.plugin.downloader.c.a)localObject3).field_status = 0;
      c.d((com.tencent.mm.plugin.downloader.c.a)localObject3);
      return ((com.tencent.mm.plugin.downloader.c.a)localObject3).field_downloadId;
      x.e("MicroMsg.FileCDNDownloader", "mkdir parent error, %s", new Object[] { localFile1.getAbsolutePath() });
      break;
      label516:
      ((com.tencent.mm.plugin.downloader.c.a)localObject3).field_downloadId = System.currentTimeMillis();
      break label262;
      label527:
      if (((FileDownloadTaskInfo)localObject1).status == 4)
      {
        ((com.tencent.mm.plugin.downloader.c.a)localObject3).field_startState = com.tencent.mm.plugin.downloader.a.b.ibu;
        break label409;
      }
      ((com.tencent.mm.plugin.downloader.c.a)localObject3).field_startState = com.tencent.mm.plugin.downloader.a.b.ibs;
      break label409;
      label557:
      ((com.tencent.mm.plugin.downloader.c.a)localObject3).field_startState = 0;
    }
    label566:
    return a((com.tencent.mm.plugin.downloader.c.a)localObject3);
  }
  
  public final int cl(long paramLong)
  {
    new Thread(new a.3(this, paramLong)).start();
    return 1;
  }
  
  public final FileDownloadTaskInfo cm(long paramLong)
  {
    FileDownloadTaskInfo localFileDownloadTaskInfo = null;
    com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    CDNTaskState localCDNTaskState;
    if (locala != null)
    {
      localFileDownloadTaskInfo = new FileDownloadTaskInfo();
      localCDNTaskState = com.tencent.mm.plugin.cdndownloader.c.a.aAk().yl(locala.field_downloadUrl);
      if (localCDNTaskState == null) {
        break label225;
      }
      switch (localCDNTaskState.taskState)
      {
      default: 
        if (locala.field_status == 1) {
          localFileDownloadTaskInfo.status = 0;
        }
        break;
      }
    }
    for (;;)
    {
      localFileDownloadTaskInfo.icq = localCDNTaskState.completeSize;
      localFileDownloadTaskInfo.gTK = localCDNTaskState.fileTotalSize;
      if ((localFileDownloadTaskInfo.status != 0) && (localFileDownloadTaskInfo.status != 5))
      {
        locala.field_downloadedSize = localFileDownloadTaskInfo.icq;
        locala.field_totalSize = localFileDownloadTaskInfo.gTK;
        c.e(locala);
      }
      localFileDownloadTaskInfo.id = paramLong;
      localFileDownloadTaskInfo.bPG = locala.field_downloaderType;
      localFileDownloadTaskInfo.icr = locala.field_autoDownload;
      localFileDownloadTaskInfo.path = locala.field_filePath;
      localFileDownloadTaskInfo.url = locala.field_downloadUrl;
      localFileDownloadTaskInfo.bKg = locala.field_md5;
      return localFileDownloadTaskInfo;
      localFileDownloadTaskInfo.status = 1;
      continue;
      localFileDownloadTaskInfo.status = 2;
      continue;
      localFileDownloadTaskInfo.status = locala.field_status;
    }
    label225:
    if (locala.field_status == 1) {}
    for (localFileDownloadTaskInfo.status = 0;; localFileDownloadTaskInfo.status = locala.field_status)
    {
      localFileDownloadTaskInfo.icq = locala.field_downloadedSize;
      localFileDownloadTaskInfo.gTK = locala.field_totalSize;
      break;
    }
  }
  
  public final boolean cn(long paramLong)
  {
    new Thread(new a.4(this, paramLong)).start();
    return true;
  }
  
  public final boolean co(long paramLong)
  {
    com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    if (locala != null)
    {
      if ((locala.field_downloadInWifi) && (!ao.isWifi(ad.getContext())))
      {
        x.i("MicroMsg.FileCDNDownloader", "resumeDownloadTask, downloadInWifi, not wifi");
        return true;
      }
      new Thread(new a.5(this, locala, paramLong)).start();
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/downloader/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */