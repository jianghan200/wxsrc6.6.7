package com.tencent.mm.plugin.game.model.a;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader.model.l;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  implements l
{
  private static void DA(String paramString)
  {
    c localc = new c();
    localc.field_appId = paramString;
    x.i("MicroMsg.GameSilentDownloadCallback", "removeSilentDownloadTask, appid:%s, ret:%b", new Object[] { paramString, Boolean.valueOf(((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSl().a(localc, new String[0])) });
  }
  
  private static void c(String paramString, long paramLong, boolean paramBoolean)
  {
    x.i("MicroMsg.GameSilentDownloadCallback", paramString);
    com.tencent.mm.plugin.downloader.c.a locala = com.tencent.mm.plugin.downloader.model.c.cs(paramLong);
    if ((locala != null) && (locala.field_autoDownload))
    {
      paramBoolean = ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSl().ay(locala.field_appId, paramBoolean);
      x.i("MicroMsg.GameSilentDownloadCallback", "%s. appid:%s, ret:%b", new Object[] { paramString, locala.field_appId, Boolean.valueOf(paramBoolean) });
    }
  }
  
  public final void b(long paramLong, int paramInt, boolean paramBoolean)
  {
    x.i("MicroMsg.GameSilentDownloadCallback", "onTaskFailed, errCode:%d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt != com.tencent.mm.plugin.downloader.a.a.ibf)
    {
      com.tencent.mm.plugin.downloader.c.a locala = com.tencent.mm.plugin.downloader.model.c.cs(paramLong);
      if ((locala != null) && (locala.field_autoDownload))
      {
        e.U(locala.field_appId, 1, paramInt);
        DA(locala.field_appId);
      }
    }
  }
  
  public final void b(long paramLong, String paramString, boolean paramBoolean)
  {
    x.i("MicroMsg.GameSilentDownloadCallback", "onTaskFinished");
    paramString = com.tencent.mm.plugin.downloader.model.c.cs(paramLong);
    if ((paramString != null) && (paramString.field_autoDownload))
    {
      e.U(paramString.field_appId, 0, 0);
      DA(paramString.field_appId);
    }
  }
  
  public final void bP(long paramLong)
  {
    x.d("MicroMsg.GameSilentDownloadCallback", "onTaskProgressChanged");
  }
  
  public final void h(long paramLong, String paramString)
  {
    c("onTaskResumed", paramLong, true);
  }
  
  public final void onTaskPaused(long paramLong)
  {
    c("onTaskPaused", paramLong, false);
  }
  
  public final void onTaskRemoved(long paramLong)
  {
    x.i("MicroMsg.GameSilentDownloadCallback", "onTaskRemoved");
    com.tencent.mm.plugin.downloader.c.a locala = com.tencent.mm.plugin.downloader.model.c.cs(paramLong);
    if ((locala != null) && (locala.field_autoDownload))
    {
      e.U(locala.field_appId, 2, 0);
      DA(locala.field_appId);
    }
  }
  
  public final void onTaskStarted(long paramLong, String paramString)
  {
    c("onTaskStarted", paramLong, true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/model/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */