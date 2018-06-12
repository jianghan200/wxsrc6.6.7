package com.tencent.mm.plugin.appbrand.game.e;

import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  private static final long fDi = 100000000L;
  private static final long fDj = 16666666L;
  public long fDk = 16666666L;
  private long fDl = -1L;
  private boolean fDm = false;
  
  public static long kv(int paramInt)
  {
    return 1000000000L / paramInt;
  }
  
  public final void ahm()
  {
    if (this.fDl == -1L) {
      this.fDl = System.nanoTime();
    }
  }
  
  public final void cH(boolean paramBoolean)
  {
    long l;
    if ((this.fDk > fDj) || (!paramBoolean) || (this.fDm))
    {
      this.fDm = true;
      if (this.fDl != -1L)
      {
        l = System.nanoTime() - this.fDl;
        if (l < this.fDk) {
          l = this.fDk - l;
        }
      }
    }
    try
    {
      Thread.sleep(l / 1000000L, (int)(l % 1000000L));
      this.fDl = System.nanoTime();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        x.e("MicroMsg.WAGameFrameRateController", "Sleep unsuccessfully.");
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */