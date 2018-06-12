package com.tencent.mm.plugin.appbrand.performance;

import android.annotation.TargetApi;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

@TargetApi(16)
public final class d
  implements Choreographer.FrameCallback
{
  Choreographer btz = Choreographer.getInstance();
  boolean fcO = false;
  long gpM = 0L;
  int gpN = 0;
  a gpx;
  long mInterval = 200L;
  boolean yr = true;
  
  public final void doFrame(long paramLong)
  {
    double d1 = 60.0D;
    double d2;
    if ((this.yr) && (!this.fcO))
    {
      paramLong /= 1000000L;
      if (this.gpM <= 0L) {
        break label128;
      }
      long l = paramLong - this.gpM;
      this.gpN += 1;
      if (l > this.mInterval)
      {
        d2 = this.gpN * 1000 / l;
        if (d2 < 60.0D) {
          break label136;
        }
      }
    }
    for (;;)
    {
      this.gpM = paramLong;
      this.gpN = 0;
      if (this.gpx != null) {
        this.gpx.r(d1);
      }
      for (;;)
      {
        if (this.yr) {
          this.btz.postFrameCallback(this);
        }
        return;
        label128:
        this.gpM = paramLong;
      }
      label136:
      d1 = d2;
    }
  }
  
  public static abstract interface a
  {
    public abstract void r(double paramDouble);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/performance/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */