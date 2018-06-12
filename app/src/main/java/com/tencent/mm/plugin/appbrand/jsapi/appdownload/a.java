package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.mm.plugin.appbrand.ipc.d;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader.model.l;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  implements l
{
  public final void b(long paramLong, int paramInt, boolean paramBoolean)
  {
    com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    AppbrandDownloadState localAppbrandDownloadState;
    if (locala != null)
    {
      x.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskFailed, appId: %s, downloadInWifi: %b, isWifi: %b", new Object[] { locala.field_appId, Boolean.valueOf(locala.field_downloadInWifi), Boolean.valueOf(ao.isWifi(ad.getContext())) });
      localAppbrandDownloadState = new AppbrandDownloadState();
      if ((!locala.field_downloadInWifi) || (ao.isWifi(ad.getContext()))) {
        break label122;
      }
    }
    label122:
    for (localAppbrandDownloadState.state = "download_wait_wifi";; localAppbrandDownloadState.state = "download_failed")
    {
      localAppbrandDownloadState.bGm = locala.field_downloadId;
      localAppbrandDownloadState.appId = locala.field_appId;
      localAppbrandDownloadState.fHs = locala.field_totalSize;
      d.c(localAppbrandDownloadState);
      return;
    }
  }
  
  public final void b(long paramLong, String paramString, boolean paramBoolean)
  {
    paramString = c.cs(paramLong);
    if (paramString != null)
    {
      x.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskFinished, appId: " + paramString.field_appId);
      if (paramString.field_downloadInWifi)
      {
        paramString.field_downloadInWifi = false;
        c.e(paramString);
      }
      AppbrandDownloadState localAppbrandDownloadState = new AppbrandDownloadState();
      localAppbrandDownloadState.state = "download_succ";
      localAppbrandDownloadState.bGm = paramString.field_downloadId;
      localAppbrandDownloadState.appId = paramString.field_appId;
      localAppbrandDownloadState.bSP = 100L;
      localAppbrandDownloadState.fHs = paramString.field_totalSize;
      d.c(localAppbrandDownloadState);
    }
  }
  
  public final void bP(long paramLong)
  {
    com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    if (locala != null)
    {
      AppbrandDownloadState localAppbrandDownloadState = new AppbrandDownloadState();
      localAppbrandDownloadState.state = "download_progress_changed";
      localAppbrandDownloadState.bGm = locala.field_downloadId;
      localAppbrandDownloadState.appId = locala.field_appId;
      if (locala.field_totalSize != 0L) {
        localAppbrandDownloadState.bSP = (((float)locala.field_downloadedSize / (float)locala.field_totalSize * 100.0F));
      }
      x.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskProgressChanged, appId: %s, progress: %d", new Object[] { locala.field_appId, Long.valueOf(localAppbrandDownloadState.bSP) });
      localAppbrandDownloadState.fHs = locala.field_totalSize;
      d.c(localAppbrandDownloadState);
    }
  }
  
  public final void h(long paramLong, String paramString) {}
  
  public final void onTaskPaused(long paramLong)
  {
    com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    AppbrandDownloadState localAppbrandDownloadState;
    if (locala != null)
    {
      x.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskPaused, appId: " + locala.field_appId);
      localAppbrandDownloadState = new AppbrandDownloadState();
      if ((!locala.field_downloadInWifi) || (ao.isWifi(ad.getContext()))) {
        break label127;
      }
    }
    label127:
    for (localAppbrandDownloadState.state = "download_wait_wifi";; localAppbrandDownloadState.state = "download_paused")
    {
      localAppbrandDownloadState.bGm = locala.field_downloadId;
      localAppbrandDownloadState.appId = locala.field_appId;
      localAppbrandDownloadState.fHs = locala.field_totalSize;
      if (locala.field_totalSize != 0L) {
        localAppbrandDownloadState.bSP = (((float)locala.field_downloadedSize / (float)locala.field_totalSize * 100.0F));
      }
      d.c(localAppbrandDownloadState);
      return;
    }
  }
  
  public final void onTaskRemoved(long paramLong)
  {
    com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    if (locala != null)
    {
      x.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskRemoved, appId: " + locala.field_appId);
      AppbrandDownloadState localAppbrandDownloadState = new AppbrandDownloadState();
      localAppbrandDownloadState.state = "download_removed";
      localAppbrandDownloadState.bGm = locala.field_downloadId;
      localAppbrandDownloadState.appId = locala.field_appId;
      localAppbrandDownloadState.fHs = locala.field_totalSize;
      d.c(localAppbrandDownloadState);
    }
  }
  
  public final void onTaskStarted(long paramLong, String paramString)
  {
    paramString = c.cs(paramLong);
    if (paramString != null)
    {
      x.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskStarted, appId: " + paramString.field_appId);
      AppbrandDownloadState localAppbrandDownloadState = new AppbrandDownloadState();
      localAppbrandDownloadState.state = "download_started";
      localAppbrandDownloadState.bGm = paramString.field_downloadId;
      localAppbrandDownloadState.appId = paramString.field_appId;
      if (paramString.field_totalSize != 0L) {
        localAppbrandDownloadState.bSP = (((float)paramString.field_downloadedSize / (float)paramString.field_totalSize * 100.0F));
      }
      localAppbrandDownloadState.fHs = paramString.field_totalSize;
      d.c(localAppbrandDownloadState);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/appdownload/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */