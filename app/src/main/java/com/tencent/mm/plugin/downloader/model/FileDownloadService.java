package com.tencent.mm.plugin.downloader.model;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.downloader.b.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public class FileDownloadService
  extends IntentService
{
  public static final String EXTRA_ID;
  public static final String EXTRA_PACKAGE_NAME = icl + "package_name";
  private static final String icl = FileDownloadService.class.getSimpleName() + "_extra_";
  public static final String icm;
  public static final String icn = icl + "file_path";
  public static final String ico = icl + "md5";
  public static final String icp = icl + "change_url";
  
  static
  {
    EXTRA_ID = icl + "id";
    icm = icl + "action_type";
  }
  
  public FileDownloadService()
  {
    super("FileDownloadService");
  }
  
  private static boolean co(String paramString1, String paramString2)
  {
    File localFile = new File(paramString1);
    x.i("MicroMsg.FileDownloadService", "MD5 Check: %s, File Exists: %b", new Object[] { paramString1, Boolean.valueOf(localFile.exists()) });
    long l = System.currentTimeMillis();
    paramString1 = com.tencent.mm.a.g.m(localFile);
    x.i("MicroMsg.FileDownloadService", "MD5 Check Time: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    x.i("MicroMsg.FileDownloadService", "Original MD5: %s, Calculated MD5: %s", new Object[] { paramString2, paramString1 });
    if (bi.oW(paramString2)) {
      return localFile.exists();
    }
    if (bi.oW(paramString1))
    {
      x.i("MicroMsg.FileDownloadService", "check from file failed, may caused by low memory while checking md5");
      return localFile.exists();
    }
    return paramString2.equalsIgnoreCase(paramString1);
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    if (paramIntent == null) {}
    Object localObject2;
    Object localObject1;
    do
    {
      do
      {
        long l;
        boolean bool2;
        do
        {
          int i;
          do
          {
            return;
            i = paramIntent.getIntExtra(icm, 0);
            x.i("MicroMsg.FileDownloadService", "handle intent type : %d", new Object[] { Integer.valueOf(i) });
            switch (i)
            {
            case 2: 
            default: 
              return;
            case 1: 
              l = paramIntent.getLongExtra(EXTRA_ID, -1L);
              bool2 = paramIntent.getBooleanExtra(icp, false);
              if (l < 0L)
              {
                x.e("MicroMsg.FileDownloadService", "Invalid id");
                return;
              }
              if (com.tencent.mm.kernel.g.Eg().Dx())
              {
                com.tencent.mm.kernel.g.Eg();
                if (!com.tencent.mm.kernel.a.Dr()) {}
              }
              else
              {
                x.d("MicroMsg.FileDownloadService", "no user login");
                return;
              }
              localObject2 = c.cs(l);
            }
          } while (localObject2 == null);
          x.i("MicroMsg.FileDownloadService", "filePath = " + ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_filePath);
          if ((bi.oW(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_filePath)) || (!e.cn(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_filePath)))
          {
            h.mEJ.a(710L, 5L, 1L, false);
            ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_status = 4;
            ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_errCode = com.tencent.mm.plugin.downloader.a.a.ibq;
            c.e((com.tencent.mm.plugin.downloader.c.a)localObject2);
            paramIntent = d.aCU();
            i = com.tencent.mm.plugin.downloader.a.a.ibq;
            x.i("MicroMsg.FileDownloadManager", "onDownloadFailed, id = %d, errCode = %d", new Object[] { Long.valueOf(l), Integer.valueOf(i) });
            if (paramIntent.ibT != null) {
              paramIntent.ibT.c(l, i, bool2);
            }
            x.i("MicroMsg.FileDownloadService", "file not exists, appid = " + ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_appId);
            return;
          }
          if (bi.oW(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_md5))
          {
            x.i("MicroMsg.FileDownloadService", "Invalid original md5, abort checking");
            ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_status = 3;
            c.e((com.tencent.mm.plugin.downloader.c.a)localObject2);
            d.aCU().k(l, bool2);
            return;
          }
          paramIntent = "";
          try
          {
            String str1 = k.E(new File(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_filePath));
            paramIntent = str1;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              x.e("MicroMsg.FileDownloadService", "readChannelId exception : " + localException.getMessage());
            }
            if (((com.tencent.mm.plugin.downloader.c.a)localObject2).field_downloaderType != 3) {
              continue;
            }
            if (!((com.tencent.mm.plugin.downloader.c.a)localObject2).field_downloadUrl.startsWith("https")) {
              continue;
            }
            h.mEJ.a(710L, 10L, 1L, false);
            ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_status = 4;
            ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_channelId = paramIntent;
            ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_errCode = com.tencent.mm.plugin.downloader.a.a.ibm;
            ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_downloadedSize = e.cm(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_filePath);
            c.e((com.tencent.mm.plugin.downloader.c.a)localObject2);
            x.i("MicroMsg.FileDownloadService", "ChannelId = %s, receivedSize = %d, fileSize = %d", new Object[] { paramIntent, Long.valueOf(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_downloadedSize), Integer.valueOf(e.cm(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_filePath)) });
            e.deleteFile(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_filePath);
            boolean bool3 = ao.isWifi(this);
            if (bi.oW(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_secondaryUrl)) {
              continue;
            }
            boolean bool1 = true;
            x.i("MicroMsg.FileDownloadService", "checkMd5, isWifi: %b, hasChangeUrl: %b, hasHttpsUrl: %b", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
            if ((!ao.isWifi(this)) || (bool2) || (bi.oW(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_secondaryUrl))) {
              continue;
            }
            paramIntent = new e.a();
            paramIntent.yQ(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_secondaryUrl);
            paramIntent.cx(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_fileSize);
            paramIntent.yS(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_fileName);
            paramIntent.setAppId(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_appId);
            paramIntent.yT(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_md5);
            paramIntent.ick.ici = true;
            paramIntent.ef(true);
            paramIntent.ox(1);
            paramIntent.cQ(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_packageName);
            if (((com.tencent.mm.plugin.downloader.c.a)localObject2).field_downloaderType == 3) {
              continue;
            }
            l = d.aCU().a(paramIntent.ick);
            h.mEJ.a(710L, 8L, 1L, false);
            x.i("MicroMsg.FileDownloadService", "MD5 check failed, restart download, id = " + l);
            return;
            h.mEJ.a(710L, 9L, 1L, false);
            continue;
            if (!((com.tencent.mm.plugin.downloader.c.a)localObject2).field_downloadUrl.startsWith("https")) {
              continue;
            }
            h.mEJ.a(710L, 7L, 1L, false);
            continue;
            h.mEJ.a(710L, 6L, 1L, false);
            continue;
            bool1 = false;
            continue;
            l = d.aCU().b(paramIntent.ick);
            h.mEJ.a(710L, 11L, 1L, false);
            continue;
            paramIntent = d.aCU();
            localObject2 = c.cs(l);
          }
          if (co(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_filePath, ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_md5))
          {
            ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_status = 3;
            ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_channelId = paramIntent;
            c.e((com.tencent.mm.plugin.downloader.c.a)localObject2);
            d.aCU().k(l, bool2);
            return;
          }
        } while (localObject2 == null);
        localObject1 = ad.getContext();
        if ((((com.tencent.mm.plugin.downloader.c.a)localObject2).field_showNotification) && (bi.oW(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_fileName)))
        {
          localObject2 = ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_downloadUrl;
          d.a(((Context)localObject1).getString(b.c.file_downloader_md5check_failed), "", null);
        }
        for (;;)
        {
          paramIntent.ibT.c(l, com.tencent.mm.plugin.downloader.a.a.ibm, bool2);
          return;
          if ((((com.tencent.mm.plugin.downloader.c.a)localObject2).field_showNotification) && (!bi.oW(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_fileName)))
          {
            String str2 = ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_downloadUrl;
            d.a(((com.tencent.mm.plugin.downloader.c.a)localObject2).field_fileName, ((Context)localObject1).getString(b.c.file_downloader_md5check_failed), null);
          }
        }
        localObject1 = paramIntent.getStringExtra(icn);
        localObject2 = paramIntent.getStringExtra(ico);
        paramIntent = paramIntent.getStringExtra("appId");
        if ((bi.oW((String)localObject1)) || (!e.cn((String)localObject1)))
        {
          x.i("MicroMsg.FileDownloadService", "Invalid file path, ignored");
          return;
        }
      } while ((!bi.oW((String)localObject2)) && (!co((String)localObject1, (String)localObject2)));
      localObject2 = c.yK(paramIntent);
      if (localObject2 == null) {
        break;
      }
    } while (!com.tencent.mm.plugin.downloader.e.a.yW((String)localObject1));
    com.tencent.mm.plugin.downloader.e.a.a(paramIntent, ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_scene, ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_downloadId, ((com.tencent.mm.plugin.downloader.c.a)localObject2).field_channelId);
    return;
    com.tencent.mm.plugin.downloader.e.a.yW((String)localObject1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/downloader/model/FileDownloadService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */