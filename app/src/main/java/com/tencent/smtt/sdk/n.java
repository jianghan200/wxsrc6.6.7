package com.tencent.smtt.sdk;

import com.tencent.smtt.utils.TbsLog;

final class n
  implements TbsListener
{
  public final void onDownloadFinish(int paramInt)
  {
    if (TbsDownloader.needDownloadDecoupleCore())
    {
      TbsLog.i("QbSdk", "onDownloadFinish needDownloadDecoupleCore is true", true);
      TbsDownloader.a = true;
    }
    do
    {
      return;
      TbsLog.i("QbSdk", "onDownloadFinish needDownloadDecoupleCore is false", true);
      TbsDownloader.a = false;
      if (QbSdk.c() != null) {
        QbSdk.c().onDownloadFinish(paramInt);
      }
    } while (QbSdk.d() == null);
    QbSdk.d().onDownloadFinish(paramInt);
  }
  
  public final void onDownloadProgress(int paramInt)
  {
    if (QbSdk.d() != null) {
      QbSdk.d().onDownloadProgress(paramInt);
    }
    if (QbSdk.c() != null) {
      QbSdk.c().onDownloadProgress(paramInt);
    }
  }
  
  public final void onInstallFinish(int paramInt)
  {
    QbSdk.setTBSInstallingStatus(false);
    TbsDownloader.a = false;
    if (TbsDownloader.startDecoupleCoreIfNeeded()) {}
    for (TbsDownloader.a = true;; TbsDownloader.a = false)
    {
      if (QbSdk.c() != null) {
        QbSdk.c().onInstallFinish(paramInt);
      }
      if (QbSdk.d() != null) {
        QbSdk.d().onInstallFinish(paramInt);
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/smtt/sdk/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */