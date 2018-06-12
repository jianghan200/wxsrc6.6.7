package com.tencent.mm.pluginsdk.d.a;

import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class b
{
  private CountDownLatch qyz = null;
  
  public final void b(long paramLong, Runnable paramRunnable)
  {
    x.i("MicroMsg.SyncJob", "doAsSyncJob");
    if (this.qyz == null) {
      this.qyz = new CountDownLatch(1);
    }
    ah.A(paramRunnable);
    x.i("MicroMsg.SyncJob", "doAsSyncJob postToMainThread");
    if (this.qyz != null) {}
    try
    {
      this.qyz.await(paramLong, TimeUnit.MILLISECONDS);
      return;
    }
    catch (InterruptedException paramRunnable)
    {
      x.w("MicroMsg.SyncJob", paramRunnable.getMessage());
      x.printErrStackTrace("MicroMsg.SyncJob", paramRunnable, "", new Object[0]);
    }
  }
  
  public final void countDown()
  {
    if (this.qyz != null)
    {
      this.qyz.countDown();
      this.qyz = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/pluginsdk/d/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */