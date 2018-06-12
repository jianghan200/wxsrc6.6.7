package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.HandlerThread;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vending.h.g;
import com.tencent.mm.vending.h.h;
import java.util.concurrent.atomic.AtomicInteger;

public final class b
{
  private static volatile ah fHR;
  private static String fHS = "app_brand_audio_player";
  private static Object lockObj = new Object();
  private static ag mHandler;
  private static AtomicInteger vLP = new AtomicInteger(0);
  
  public static void Pa(String arg0)
  {
    x.i("MicroMsg.Audio.AudioApiTaskExecutor", "onDestroy:%s", new Object[] { ??? });
    if (vLP.decrementAndGet() == 0) {
      synchronized (lockObj)
      {
        if ((fHR != null) && (fHR != null))
        {
          g.abF(fHS);
          fHR.lnJ.quit();
          fHR = null;
          mHandler = null;
        }
        return;
      }
    }
  }
  
  private static void ahV()
  {
    if (fHR == null)
    {
      fHR = new ah(fHS);
      h localh = new h(fHR.lnJ.getLooper(), fHS);
      g.a(fHS, localh);
    }
    mHandler = new ag(fHR.lnJ.getLooper());
  }
  
  public static void onCreate(String arg0)
  {
    x.i("MicroMsg.Audio.AudioApiTaskExecutor", "onCreate %s", new Object[] { ??? });
    if (vLP.incrementAndGet() == 1) {
      synchronized (lockObj)
      {
        ahV();
        return;
      }
    }
  }
  
  public static void q(Runnable paramRunnable)
  {
    synchronized (lockObj)
    {
      if (mHandler != null)
      {
        mHandler.post(paramRunnable);
        return;
      }
      x.w("MicroMsg.Audio.AudioApiTaskExecutor", "mHandler is null, recreate");
      ahV();
      mHandler.post(paramRunnable);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */