package com.tencent.mm.plugin.downloader.model;

import android.app.DownloadManager;
import android.app.DownloadManager.Query;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import com.tencent.mm.plugin.downloader.c.a;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;

final class g
  extends h
{
  al eOf = new al(new g.2(this), false);
  DownloadManager ict = (DownloadManager)this.mContext.getSystemService("download");
  CopyOnWriteArraySet<Long> icu = new CopyOnWriteArraySet();
  private Context mContext = ad.getContext();
  
  public g(b paramb)
  {
    super(paramb);
  }
  
  private FileDownloadTaskInfo cy(long paramLong)
  {
    FileDownloadTaskInfo localFileDownloadTaskInfo = new FileDownloadTaskInfo();
    Object localObject = new DownloadManager.Query();
    ((DownloadManager.Query)localObject).setFilterById(new long[] { paramLong });
    try
    {
      localObject = this.ict.query((DownloadManager.Query)localObject);
      if (localObject == null)
      {
        x.e("MicroMsg.FileDownloaderImpl23", "query download status failed: cursor is null");
        return localFileDownloadTaskInfo;
      }
    }
    catch (Exception localException1)
    {
      x.e("MicroMsg.FileDownloaderImpl23", "query downloadinfo from downloadmanager failed:%s, sysDownloadId:%d", new Object[] { localException1.toString(), Long.valueOf(paramLong) });
      return localFileDownloadTaskInfo;
    }
    int i;
    int j;
    int k;
    int m;
    int n;
    if (localException1.moveToFirst())
    {
      i = localException1.getColumnIndex("status");
      j = localException1.getColumnIndex("uri");
      k = localException1.getColumnIndex("local_uri");
      m = localException1.getColumnIndex("bytes_so_far");
      n = localException1.getColumnIndex("total_size");
      if (i == -1) {}
    }
    try
    {
      switch (localException1.getInt(i))
      {
      case 1: 
      case 2: 
        for (;;)
        {
          if (j != -1) {
            localFileDownloadTaskInfo.url = localException1.getString(j);
          }
          if (k != -1)
          {
            String str = localException1.getString(k);
            if (bi.oW(str)) {
              break;
            }
            x.i("MicroMsg.FileDownloaderImpl23", "get download uri: [%s]", new Object[] { str });
            localFileDownloadTaskInfo.path = Uri.parse(str).getPath();
            x.i("MicroMsg.FileDownloaderImpl23", "get download path: [%s]", new Object[] { localFileDownloadTaskInfo.path });
          }
          if (m != -1) {
            localFileDownloadTaskInfo.icq = localException1.getLong(m);
          }
          if (n != -1) {
            localFileDownloadTaskInfo.gTK = localException1.getLong(n);
          }
          localException1.close();
          x.i("MicroMsg.FileDownloaderImpl23", "querySysDownloadManager: id: %d, status: %d, url: %s, path: %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(localFileDownloadTaskInfo.status), localFileDownloadTaskInfo.url, localFileDownloadTaskInfo.path });
          return localFileDownloadTaskInfo;
          localFileDownloadTaskInfo.status = 1;
        }
      }
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        x.e("MicroMsg.FileDownloaderImpl23", "query download info failed: [%s]", new Object[] { localException2.toString() });
        localFileDownloadTaskInfo.status = 4;
        continue;
        localFileDownloadTaskInfo.status = 4;
        continue;
        localFileDownloadTaskInfo.status = 2;
        continue;
        localFileDownloadTaskInfo.status = 3;
        continue;
        x.e("MicroMsg.FileDownloaderImpl23", "get download uri failed");
      }
    }
  }
  
  public final long a(a parama)
  {
    return parama.field_downloadId;
  }
  
  public final long a(e parame)
  {
    if ((parame == null) || (bi.oW(parame.fhq)))
    {
      x.e("MicroMsg.FileDownloaderImpl23", "Invalid Request");
      return -1L;
    }
    if (parame.icg)
    {
      x.e("MicroMsg.FileDownloaderImpl23", "autoDownloadTask not use system downloader, appid = %s", new Object[] { parame.mAppId });
      return -1L;
    }
    String str = parame.fhq;
    Object localObject1 = "";
    Object localObject2 = c.yN(str);
    if (localObject2 != null)
    {
      localObject1 = cy(((a)localObject2).field_sysDownloadId);
      if (((FileDownloadTaskInfo)localObject1).status == 1) {
        return ((FileDownloadTaskInfo)localObject1).id;
      }
      localObject1 = ((a)localObject2).field_filePath;
      this.ict.remove(new long[] { ((a)localObject2).field_sysDownloadId });
    }
    localObject2 = com.tencent.mm.compatible.util.h.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
    if (!bi.oW((String)localObject2))
    {
      localObject2 = new File((String)localObject2);
      if (!((File)localObject2).exists()) {
        x.i("MicroMsg.FileDownloaderImpl23", "download folder not exist, make new one : [%b]", new Object[] { Boolean.valueOf(((File)localObject2).mkdir()) });
      }
    }
    if (!bi.oW((String)localObject1))
    {
      localObject1 = new File((String)localObject1);
      if (((File)localObject1).exists()) {
        x.i("MicroMsg.FileDownloaderImplBase", "Delete previous file result: %b", new Object[] { Boolean.valueOf(((File)localObject1).delete()) });
      }
    }
    c.yL(str);
    c.yM(parame.mAppId);
    localObject1 = f.c(parame);
    ((a)localObject1).field_downloadId = System.currentTimeMillis();
    ((a)localObject1).field_status = 0;
    ((a)localObject1).field_downloaderType = 1;
    str = ac.ce(str);
    ((a)localObject1).field_filePath = (com.tencent.mm.compatible.util.h.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + "/" + str);
    ((a)localObject1).field_startTime = System.currentTimeMillis();
    c.d((a)localObject1);
    com.tencent.mm.kernel.g.Em().H(new g.1(this, parame, (a)localObject1));
    return ((a)localObject1).field_downloadId;
  }
  
  public final int cl(long paramLong)
  {
    d.aCU();
    if (d.cu(paramLong))
    {
      d.aCU();
      paramLong = d.cv(paramLong);
      return this.ict.remove(new long[] { paramLong });
    }
    a locala = c.cs(paramLong);
    if (locala == null)
    {
      x.e("MicroMsg.FileDownloaderImpl23", "Invalid id");
      return 0;
    }
    for (;;)
    {
      try
      {
        int i = this.ict.remove(new long[] { locala.field_sysDownloadId });
      }
      catch (Exception localException1)
      {
        try
        {
          x.i("MicroMsg.FileDownloaderImpl23", "removeDownloadTask: id: %d", new Object[] { Long.valueOf(paramLong) });
          com.tencent.mm.a.e.deleteFile(locala.field_filePath);
          x.i("MicroMsg.FileDownloaderImpl23", "removeDownloadTask: path: %s", new Object[] { locala.field_filePath });
          locala.field_status = 5;
          c.e(locala);
          this.ibT.cp(paramLong);
          this.icu.remove(Long.valueOf(paramLong));
          return i;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        localException1 = localException1;
        i = 0;
      }
      tmp170_167[0] = Long.valueOf(paramLong);
      Object[] tmp177_170 = tmp170_167;
      tmp177_170[1] = localException1.toString();
      x.e("MicroMsg.FileDownloaderImpl23", "remove task error:[%d], [%s]", tmp177_170);
    }
  }
  
  public final FileDownloadTaskInfo cm(long paramLong)
  {
    d.aCU();
    if (d.cu(paramLong))
    {
      d.aCU();
      localObject = cy(d.cv(paramLong));
      ((FileDownloadTaskInfo)localObject).id = paramLong;
      ((FileDownloadTaskInfo)localObject).bPG = 1;
      return (FileDownloadTaskInfo)localObject;
    }
    Object localObject = c.cs(paramLong);
    if (localObject == null) {
      return new FileDownloadTaskInfo();
    }
    if ((((a)localObject).field_status == 4) || (((a)localObject).field_status == 2) || (((a)localObject).field_status == 5) || (((a)localObject).field_status == 3)) {
      this.icu.remove(Long.valueOf(paramLong));
    }
    FileDownloadTaskInfo localFileDownloadTaskInfo = new FileDownloadTaskInfo();
    localFileDownloadTaskInfo.id = ((a)localObject).field_downloadId;
    localFileDownloadTaskInfo.url = ((a)localObject).field_downloadUrl;
    localFileDownloadTaskInfo.status = ((a)localObject).field_status;
    localFileDownloadTaskInfo.path = ((a)localObject).field_filePath;
    localFileDownloadTaskInfo.bKg = ((a)localObject).field_md5;
    localFileDownloadTaskInfo.icr = ((a)localObject).field_autoDownload;
    localFileDownloadTaskInfo.bPG = ((a)localObject).field_downloaderType;
    localFileDownloadTaskInfo.icq = ((a)localObject).field_downloadedSize;
    localFileDownloadTaskInfo.gTK = ((a)localObject).field_totalSize;
    return localFileDownloadTaskInfo;
  }
  
  public final boolean cn(long paramLong)
  {
    FileDownloadTaskInfo localFileDownloadTaskInfo = cm(paramLong);
    if (localFileDownloadTaskInfo == null) {
      x.i("MicroMsg.FileDownloaderImpl23", "pauseDownloadTask: %d, record not found", new Object[] { Long.valueOf(paramLong) });
    }
    int i;
    do
    {
      return false;
      this.icu.remove(Long.valueOf(paramLong));
      if (localFileDownloadTaskInfo.status != 1)
      {
        x.i("MicroMsg.FileDownloaderImpl23", "pauseDownloadTask: %d, Task is not running", new Object[] { Long.valueOf(paramLong) });
        return true;
      }
      i = cl(paramLong);
      x.i("MicroMsg.FileDownloaderImpl23", "pauseDownloadTask: %d, Task removed: %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(i) });
    } while (i <= 0);
    return true;
  }
  
  public final boolean co(long paramLong)
  {
    a locala = c.cs(paramLong);
    if (locala == null)
    {
      x.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, record not found", new Object[] { Long.valueOf(paramLong) });
      return false;
    }
    if (locala.field_downloaderType != 1)
    {
      x.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, downloader not matched", new Object[] { Long.valueOf(paramLong) });
      com.tencent.mm.a.e.deleteFile(locala.field_filePath);
      c.ct(paramLong);
      return false;
    }
    if (locala.field_status == 1)
    {
      x.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, not in paused status", new Object[] { Long.valueOf(paramLong) });
      return false;
    }
    this.ict.remove(new long[] { locala.field_sysDownloadId });
    paramLong = g(locala);
    if (paramLong > 0L)
    {
      this.icu.add(Long.valueOf(locala.field_downloadId));
      if (this.eOf.ciq()) {
        this.eOf.J(100L, 100L);
      }
      locala.field_sysDownloadId = paramLong;
      locala.field_status = 1;
      c.e(locala);
      return true;
    }
    x.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, restart failed");
    return false;
  }
  
  final long g(a parama)
  {
    try
    {
      DownloadManager.Request localRequest = new DownloadManager.Request(Uri.parse(parama.field_downloadUrl));
      localRequest.setAllowedNetworkTypes(3);
      localRequest.setShowRunningNotification(parama.field_showNotification);
      localRequest.setVisibleInDownloadsUi(parama.field_showNotification);
      if (!bi.oW(parama.field_fileName)) {
        localRequest.setTitle(parama.field_fileName);
      }
      localRequest.setDestinationUri(Uri.fromFile(new File(parama.field_filePath)));
      long l = this.ict.enqueue(localRequest);
      if (l > 0L) {
        return l;
      }
      x.e("MicroMsg.FileDownloaderImpl23", "addToSysDownloadManager Failed: Invalid downloadId");
      return -1L;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.FileDownloaderImpl23", "Add download task failed: %s, url: %s", new Object[] { localException.toString(), parama.field_downloadUrl });
    }
    return -1L;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/downloader/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */