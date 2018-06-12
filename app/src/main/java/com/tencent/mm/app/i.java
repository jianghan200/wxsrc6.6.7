package com.tencent.mm.app;

import android.os.HandlerThread;
import android.os.Process;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vending.h.h;

public final class i
{
  static i byx;
  HandlerThread byy;
  com.tencent.mm.vending.h.d byz;
  ag handler;
  
  public i(String paramString)
  {
    this.byy = e.cZ(paramString, 10);
    this.byy.start();
    this.handler = new ag(this.byy.getLooper());
    this.byz = new h(com.tencent.mm.by.d.b(this.handler), paramString);
  }
  
  public final void uW()
  {
    if ((this.byy == null) || (!this.byy.isAlive()))
    {
      x.e("MicroMsg.InitThreadController", "setHighPriority failed thread is dead");
      return;
    }
    int i = this.byy.getThreadId();
    try
    {
      if (-8 == Process.getThreadPriority(i))
      {
        x.w("MicroMsg.InitThreadController", "setHighPriority No Need.");
        return;
      }
    }
    catch (Exception localException)
    {
      x.w("MicroMsg.InitThreadController", "thread:%d setHighPriority failed", new Object[] { Integer.valueOf(i) });
      x.printErrStackTrace("MicroMsg.InitThreadController", localException, "", new Object[0]);
      return;
    }
    Process.setThreadPriority(i, -8);
    x.i("MicroMsg.InitThreadController", "InitThreadController:%d setHighPriority to %d", new Object[] { Integer.valueOf(i), Integer.valueOf(Process.getThreadPriority(i)) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/app/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */