package com.tencent.mm.by;

import com.tencent.mm.kernel.j;

public final class k
{
  public final byte[] dol = new byte[1];
  
  public final void done()
  {
    synchronized (this.dol)
    {
      if (this.dol[0] == -1)
      {
        this.dol[0] = 1;
        this.dol.notifyAll();
        j.i("MicroMsg.WxWaitingLock", "notify done %s", new Object[] { this });
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/by/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */