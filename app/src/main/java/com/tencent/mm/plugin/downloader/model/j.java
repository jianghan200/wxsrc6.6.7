package com.tencent.mm.plugin.downloader.model;

import android.content.Context;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mars.cdn.CdnLogic.CdnTaskStateInfo;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.HashMap;

public final class j
  extends h
{
  private static final String ibz = com.tencent.mm.loader.stub.b.bnE + "WebNetFile";
  private HashMap<String, Long> ibB = new HashMap();
  private i.a icx = new j.4(this);
  private Context mContext = ad.getContext();
  
  public j(b paramb)
  {
    super(paramb);
  }
  
  public final long a(com.tencent.mm.plugin.downloader.c.a parama)
  {
    return 0L;
  }
  
  public final long a(e parame)
  {
    if ((parame == null) || (bi.oW(parame.fhq)))
    {
      x.e("MicroMsg.FileWebNetDownloader", "Invalid Request");
      return -1L;
    }
    x.i("MicroMsg.FileWebNetDownloader", "addDownloadTask: %s", new Object[] { parame.fhq });
    Object localObject3 = parame.fhq;
    Object localObject2 = c.yN((String)localObject3);
    if (localObject2 != null)
    {
      localObject1 = cm(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_downloadId);
      x.i("MicroMsg.FileWebNetDownloader", "addDownloadTask, status = " + ((FileDownloadTaskInfo)localObject1).status);
      if (((FileDownloadTaskInfo)localObject1).status == 1) {
        return ((FileDownloadTaskInfo)localObject1).id;
      }
    }
    c.yL((String)localObject3);
    c.yM(parame.mAppId);
    Object localObject1 = f.c(parame);
    ((com.tencent.mm.plugin.downloader.c.a)localObject1).field_downloadId = System.currentTimeMillis();
    ((com.tencent.mm.plugin.downloader.c.a)localObject1).field_downloaderType = 4;
    localObject3 = ac.ce((String)localObject3);
    ((com.tencent.mm.plugin.downloader.c.a)localObject1).field_filePath = (ibz + "/" + (String)localObject3);
    if (localObject2 != null)
    {
      localObject3 = ((com.tencent.mm.plugin.downloader.c.a)localObject1).field_filePath;
      localObject2 = ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_filePath;
      if ((localObject3 != null) && (localObject2 != null) && (!((String)localObject3).equals(localObject2)))
      {
        localObject2 = new File((String)localObject2);
        if (((File)localObject2).exists()) {
          x.i("MicroMsg.FileWebNetDownloader", "Delete previous file result: %b", new Object[] { Boolean.valueOf(((File)localObject2).delete()) });
        }
      }
    }
    ((com.tencent.mm.plugin.downloader.c.a)localObject1).field_startTime = System.currentTimeMillis();
    localObject2 = new File(ibz);
    if (!((File)localObject2).exists())
    {
      if (!((File)localObject2).getParentFile().exists())
      {
        localObject3 = ((File)localObject2).getParentFile();
        File localFile = new File(((File)localObject3).getAbsolutePath() + System.currentTimeMillis());
        if (localFile.mkdirs()) {
          localFile.renameTo((File)localObject3);
        }
      }
      else
      {
        x.i("MicroMsg.FileWebNetDownloader", "Make download dir result: %b", new Object[] { Boolean.valueOf(((File)localObject2).mkdirs()) });
      }
    }
    else
    {
      localObject2 = new i();
      ((i)localObject2).dPW = parame.fhq;
      ((i)localObject2).field_mediaId = parame.fhq;
      if (parame.icd == 2)
      {
        ((i)localObject2).field_fileType = com.tencent.mm.modelcdntran.b.dOy;
        ((i)localObject2).dPX = 20;
        ((i)localObject2).dPY = 90;
      }
      ((i)localObject2).field_fullpath = ((com.tencent.mm.plugin.downloader.c.a)localObject1).field_filePath;
      ((i)localObject2).dPV = this.icx;
      boolean bool = g.ND().b((i)localObject2, -1);
      x.i("MicroMsg.FileWebNetDownloader", "addDownloadTask: " + bool);
      if (!bool) {
        break label538;
      }
      ((com.tencent.mm.plugin.downloader.c.a)localObject1).field_status = 1;
      c.d((com.tencent.mm.plugin.downloader.c.a)localObject1);
      this.ibT.i(((com.tencent.mm.plugin.downloader.c.a)localObject1).field_downloadId, ((com.tencent.mm.plugin.downloader.c.a)localObject1).field_filePath);
    }
    for (;;)
    {
      return ((com.tencent.mm.plugin.downloader.c.a)localObject1).field_downloadId;
      x.e("MicroMsg.FileWebNetDownloader", "mkdir parent error, %s", new Object[] { ((File)localObject3).getAbsolutePath() });
      break;
      label538:
      ((com.tencent.mm.plugin.downloader.c.a)localObject1).field_status = 4;
      ((com.tencent.mm.plugin.downloader.c.a)localObject1).field_errCode = com.tencent.mm.plugin.downloader.a.a.ibg;
      c.d((com.tencent.mm.plugin.downloader.c.a)localObject1);
      this.ibT.c(((com.tencent.mm.plugin.downloader.c.a)localObject1).field_downloadId, ((com.tencent.mm.plugin.downloader.c.a)localObject1).field_errCode, false);
    }
  }
  
  public final int cl(final long paramLong)
  {
    new Thread(new Runnable()
    {
      public final void run()
      {
        com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
        if (locala == null) {}
        do
        {
          return;
          g.ND().lx(locala.field_downloadUrl);
        } while (locala.field_status == 5);
        c.k(locala.field_downloadId, 5);
        j.this.ibT.cp(paramLong);
      }
    }).start();
    return 1;
  }
  
  public final FileDownloadTaskInfo cm(long paramLong)
  {
    FileDownloadTaskInfo localFileDownloadTaskInfo = new FileDownloadTaskInfo();
    com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    if (locala != null)
    {
      CdnLogic.CdnTaskStateInfo localCdnTaskStateInfo = CdnLogic.httpMultiSocketDownloadTaskState(locala.field_downloadUrl);
      if ((locala.field_status != 1) || ((localCdnTaskStateInfo != null) && ((localCdnTaskStateInfo.taskState == 100) || (localCdnTaskStateInfo.taskState == 101)))) {
        break label138;
      }
    }
    label138:
    for (localFileDownloadTaskInfo.status = 0;; localFileDownloadTaskInfo.status = locala.field_status)
    {
      localFileDownloadTaskInfo.icq = locala.field_downloadedSize;
      localFileDownloadTaskInfo.gTK = locala.field_totalSize;
      localFileDownloadTaskInfo.id = paramLong;
      localFileDownloadTaskInfo.bPG = locala.field_downloaderType;
      localFileDownloadTaskInfo.icr = locala.field_autoDownload;
      localFileDownloadTaskInfo.path = locala.field_filePath;
      localFileDownloadTaskInfo.url = locala.field_downloadUrl;
      localFileDownloadTaskInfo.bKg = locala.field_md5;
      return localFileDownloadTaskInfo;
    }
  }
  
  public final boolean cn(final long paramLong)
  {
    new Thread(new Runnable()
    {
      public final void run()
      {
        x.d("MicroMsg.FileWebNetDownloader", "pauseDownloadTask");
        FileDownloadTaskInfo localFileDownloadTaskInfo = j.this.cm(paramLong);
        if ((localFileDownloadTaskInfo != null) && (localFileDownloadTaskInfo.status == 1))
        {
          CdnLogic.pauseHttpMultiSocketDownloadTask(localFileDownloadTaskInfo.url);
          c.k(localFileDownloadTaskInfo.id, 2);
          j.this.ibT.cq(paramLong);
        }
      }
    }).start();
    return true;
  }
  
  public final boolean co(long paramLong)
  {
    com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    if ((locala != null) && (locala.field_status == 2))
    {
      new Thread(new j.3(this, locala, paramLong)).start();
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/downloader/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */