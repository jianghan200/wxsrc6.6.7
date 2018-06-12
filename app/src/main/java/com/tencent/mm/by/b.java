package com.tencent.mm.by;

import com.tencent.mm.kernel.j;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  private final byte[] dol = new byte[1];
  private long uZL = -1L;
  
  public final void cDY()
  {
    for (;;)
    {
      synchronized (this.dol)
      {
        if (this.dol[0] == 0)
        {
          this.dol[0] = 1;
          this.uZL = Thread.currentThread().getId();
          j.i("MicroMsg.WxConsumedLock", "lock %s", new Object[] { this });
          return;
        }
        try
        {
          if (this.uZL != Thread.currentThread().getId())
          {
            j.i("MicroMsg.WxConsumedLock", "lock waiting %s", new Object[] { this });
            this.dol.wait();
            j.d("MicroMsg.WxConsumedLock", "unlock waiting %s", new Object[] { this });
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          x.printErrStackTrace("MicroMsg.WxConsumedLock", localInterruptedException, "", new Object[0]);
        }
      }
      j.d("MicroMsg.WxConsumedLock", "reenter lock not need waiting %s", new Object[] { this });
    }
  }
  
  public final void done()
  {
    synchronized (this.dol)
    {
      if (this.dol[0] != 0)
      {
        this.dol[0] = 0;
        this.uZL = -1L;
        this.dol.notifyAll();
        j.i("MicroMsg.WxConsumedLock", "notify done %s", new Object[] { this });
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/by/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */