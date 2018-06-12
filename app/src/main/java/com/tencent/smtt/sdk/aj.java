package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.j;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

final class aj
  extends Handler
{
  aj(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    boolean bool3 = true;
    int i;
    boolean bool1;
    switch (paramMessage.what)
    {
    case 105: 
    case 106: 
    case 107: 
    default: 
      return;
    case 100: 
      if (paramMessage.arg1 == 1) {}
      for (i = 1;; i = 0)
      {
        bool1 = TbsDownloader.a(true, false);
        if ((paramMessage.obj != null) && ((paramMessage.obj instanceof TbsDownloader.TbsDownloaderCallback)))
        {
          TbsLog.i("TbsDownload", "needDownload-onNeedDownloadFinish needStartDownload=" + bool1);
          if ((!bool1) || (i != 0)) {
            ((TbsDownloader.TbsDownloaderCallback)paramMessage.obj).onNeedDownloadFinish(bool1, TbsDownloadConfig.getInstance(TbsDownloader.a()).mPreferences.getInt("tbs_download_version", 0));
          }
        }
        if ((!TbsShareManager.isThirdPartyApp(TbsDownloader.a())) || (!bool1)) {
          break;
        }
        TbsDownloader.startDownload(TbsDownloader.a());
        return;
      }
    case 101: 
    case 108: 
      Object localObject1 = null;
      Object localObject2 = "tbs_download_lock_file" + TbsDownloadConfig.getInstance(TbsDownloader.a()).mPreferences.getInt("tbs_download_version", 0) + ".txt";
      FileOutputStream localFileOutputStream = j.b(TbsDownloader.a(), false, (String)localObject2);
      if (localFileOutputStream != null)
      {
        localObject2 = j.a(TbsDownloader.a(), localFileOutputStream);
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          TbsLog.i("TbsDownload", "file lock locked,wx or qq is downloading");
          TbsDownloadConfig.getInstance(TbsDownloader.a()).setDownloadInterruptCode(65333);
          TbsLog.i("TbsDownload", "MSG_START_DOWNLOAD_DECOUPLECORE return #1");
        }
      }
      else if (j.a(TbsDownloader.a()))
      {
        TbsDownloadConfig.getInstance(TbsDownloader.a()).setDownloadInterruptCode(65332);
        TbsLog.i("TbsDownload", "MSG_START_DOWNLOAD_DECOUPLECORE return #2");
        return;
      }
      boolean bool2;
      if (paramMessage.arg1 == 1)
      {
        bool1 = true;
        localObject2 = TbsDownloadConfig.getInstance(TbsDownloader.a());
        if (108 != paramMessage.what) {
          break label418;
        }
        bool2 = true;
        if (!TbsDownloader.a(false, bool1, bool2)) {
          break label500;
        }
        if ((!bool1) || (!an.a().a(TbsDownloader.a(), TbsDownloadConfig.getInstance(TbsDownloader.a()).mPreferences.getInt("tbs_download_version", 0)))) {
          break label424;
        }
        QbSdk.m.onDownloadFinish(122);
        ((TbsDownloadConfig)localObject2).setDownloadInterruptCode(65323);
      }
      for (;;)
      {
        TbsLog.i("TbsDownload", "------freeFileLock called :");
        j.a((FileLock)localObject1, localFileOutputStream);
        return;
        bool1 = false;
        break;
        bool2 = false;
        break label337;
        if (((TbsDownloadConfig)localObject2).mPreferences.getBoolean("tbs_needdownload", false))
        {
          TbsDownloadConfig.getInstance(TbsDownloader.a()).setDownloadInterruptCode(65321);
          localObject2 = TbsDownloader.b();
          if (108 == paramMessage.what) {}
          for (bool2 = bool3;; bool2 = false)
          {
            ((ag)localObject2).b(bool1, bool2);
            break;
          }
        }
        QbSdk.m.onDownloadFinish(110);
        continue;
        QbSdk.m.onDownloadFinish(110);
      }
    case 102: 
      TbsLog.i("TbsDownload", "[TbsDownloader.handleMessage] MSG_REPORT_DOWNLOAD_STAT");
      if (TbsShareManager.isThirdPartyApp(TbsDownloader.a())) {}
      for (i = TbsShareManager.a(TbsDownloader.a(), false);; i = an.a().m(TbsDownloader.a()))
      {
        TbsLog.i("TbsDownload", "[TbsDownloader.handleMessage] localTbsVersion=" + i);
        TbsDownloader.b().a(i);
        TbsLogReport.a(TbsDownloader.a()).b();
        return;
      }
    case 104: 
      label337:
      label418:
      label424:
      label500:
      TbsLog.i("TbsDownload", "[TbsDownloader.handleMessage] MSG_UPLOAD_TBSLOG");
      TbsLogReport.a(TbsDownloader.a()).c();
      return;
    }
    TbsLog.i("TbsDownload", "[TbsDownloader.handleMessage] MSG_CONTINUEINSTALL_TBSCORE");
    if (paramMessage.arg1 == 0)
    {
      an.a().a((Context)paramMessage.obj, true);
      return;
    }
    an.a().a((Context)paramMessage.obj, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/smtt/sdk/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */