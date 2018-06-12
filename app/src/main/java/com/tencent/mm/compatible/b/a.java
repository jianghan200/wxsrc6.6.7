package com.tencent.mm.compatible.b;

import java.util.concurrent.locks.Lock;

public final class a
{
  public int daE = 0;
  public int daF = 0;
  public byte[] daG = null;
  public int daH = 0;
  public int daI = 0;
  public boolean daJ = false;
  public Lock daK = null;
  
  public final int yx()
  {
    if (this.daJ) {
      this.daK.lock();
    }
    if (this.daH == this.daI) {
      return 0;
    }
    if (this.daH < this.daI) {
      this.daF = (this.daI - this.daH);
    }
    for (;;)
    {
      if (this.daJ) {
        this.daK.unlock();
      }
      return this.daF;
      if (this.daH > this.daI) {
        this.daF = (this.daI + this.daE - this.daH);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/compatible/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */