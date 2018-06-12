package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.mm.sdk.platformtools.x;

public class p
  implements f
{
  volatile int frameCount = 0;
  long hng = 0L;
  int kGn;
  int kGo;
  boolean lgJ;
  long lhs = 0L;
  int ljv = -1;
  int ljw = -1;
  int ljx = -1;
  int ljy = -1;
  int ljz = -1;
  
  public p(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    this.lgJ = paramBoolean;
    this.ljw = paramInt1;
    this.kGn = paramInt2;
    this.kGo = paramInt3;
    x.i("MicroMsg.MMSightX264YUVRecorder", "create MMSightX264YUVRecorder, needRotateEachFrame: %s, initRotate: %s, targetWidth: %s, targetHeight: %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(this.ljw), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  public final long beD()
  {
    if (0L == this.hng)
    {
      x.w("MicroMsg.MMSightX264YUVRecorder", "do not start record");
      return 0L;
    }
    return System.currentTimeMillis() - this.hng;
  }
  
  public final int sT(int paramInt)
  {
    if (paramInt < 0)
    {
      x.e("MicroMsg.MMSightX264YUVRecorder", "init error, yuv buffer id error");
      return -1;
    }
    this.ljv = paramInt;
    try
    {
      this.frameCount = 0;
      this.hng = 0L;
      return 0;
    }
    finally {}
  }
  
  public final void stop()
  {
    try
    {
      this.frameCount = 0;
      this.hng = 0L;
      return;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/a/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */