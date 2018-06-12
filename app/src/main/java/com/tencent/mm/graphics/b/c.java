package com.tencent.mm.graphics.b;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import java.util.concurrent.TimeUnit;

public enum c
  implements Choreographer.FrameCallback
{
  public Choreographer aDX = Choreographer.getInstance();
  public long dji = 0L;
  public int djj = 0;
  double djk = 0.0D;
  private int djl = 500;
  public boolean djm = false;
  
  private c() {}
  
  public final void doFrame(long paramLong)
  {
    paramLong = TimeUnit.NANOSECONDS.toMillis(paramLong);
    if (this.dji > 0L)
    {
      long l = paramLong - this.dji;
      this.djj += 1;
      if (l > this.djl)
      {
        this.djk = (this.djj * 1000 / l);
        this.dji = paramLong;
        this.djj = 0;
      }
    }
    for (;;)
    {
      this.aDX.postFrameCallback(this);
      return;
      this.dji = paramLong;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/graphics/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */