package com.tencent.mm.plugin.game.wepkg.downloader;

import com.tencent.mm.pluginsdk.g.a.c.u;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class b
{
  private static volatile b kdW;
  public static Object lock = new Object();
  h kdX = new h(TimeUnit.MILLISECONDS, new LinkedBlockingQueue(24), new u("WepkgDownloaderPool", "WepkgDownloaderThread"));
  
  public static b aVq()
  {
    if (kdW == null) {}
    synchronized (lock)
    {
      if (kdW == null) {
        kdW = new b();
      }
      return kdW;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/downloader/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */