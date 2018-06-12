package com.tencent.mm.plugin.appbrand.dynamic.k;

import android.os.Looper;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.x;
import java.util.concurrent.CountDownLatch;

public final class a
{
  public static <T extends com.tencent.mm.kernel.c.a> T z(Class<T> paramClass)
  {
    Object localObject = com.tencent.mm.kernel.g.l(paramClass);
    if (localObject != null) {
      return (T)localObject;
    }
    if (Looper.myLooper() == Looper.getMainLooper()) {
      return null;
    }
    if (!com.tencent.mm.kernel.g.Ek().dqL.drf)
    {
      CountDownLatch localCountDownLatch = new CountDownLatch(1);
      localObject = new a.1(localCountDownLatch);
      com.tencent.mm.kernel.g.Ek().a((com.tencent.mm.kernel.api.g)localObject);
      try
      {
        localCountDownLatch.await();
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.SyncGetter", localInterruptedException, "", new Object[0]);
          com.tencent.mm.kernel.g.Ek().b((com.tencent.mm.kernel.api.g)localObject);
        }
      }
      finally
      {
        com.tencent.mm.kernel.g.Ek().b((com.tencent.mm.kernel.api.g)localObject);
      }
      return com.tencent.mm.kernel.g.l(paramClass);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/k/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */