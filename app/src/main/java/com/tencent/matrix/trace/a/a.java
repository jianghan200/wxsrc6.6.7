package com.tencent.matrix.trace.a;

import android.content.Context;
import java.util.HashSet;

public final class a
{
  public final boolean bsX;
  public final boolean bsY;
  public final HashSet<String> bsZ;
  public final long bta;
  public final long btb;
  private final long btc;
  public final long btd;
  public final long bte;
  private final float btf;
  private int mDeviceLevel = 0;
  
  private a(boolean paramBoolean1, boolean paramBoolean2, HashSet<String> paramHashSet, long paramLong1, long paramLong2, long paramLong3, long paramLong4, float paramFloat, long paramLong5)
  {
    this.bsX = paramBoolean1;
    this.bsY = paramBoolean2;
    this.bsZ = paramHashSet;
    this.bta = paramLong1;
    this.btd = (1000000L * paramLong2);
    this.btc = paramLong4;
    this.btb = paramLong3;
    this.bte = paramLong5;
    float f = paramFloat;
    if (paramFloat == 0.0F) {
      f = 16.666668F;
    }
    this.btf = f;
  }
  
  public final int aA(Context paramContext)
  {
    if (this.mDeviceLevel == 0)
    {
      int i = com.tencent.matrix.trace.e.a.aB(paramContext).value;
      this.mDeviceLevel = i;
      return i;
    }
    return this.mDeviceLevel;
  }
  
  public final String toString()
  {
    int i = 0;
    boolean bool1 = this.bsX;
    boolean bool2 = this.bsY;
    if (this.bsZ == null) {}
    for (;;)
    {
      return String.format("fpsEnable:%s,methodTraceEnable:%s,sceneSet size:%s,fpsTimeSliceMs:%s,EvilThresholdNano:%sns,frameRefreshRate:%s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Integer.valueOf(i), Long.valueOf(this.bta), Long.valueOf(this.btd), Float.valueOf(this.btf) });
      i = this.bsZ.size();
    }
  }
  
  public static final class a
  {
    public boolean btg = false;
    public boolean bth = false;
    public float bti = 16.666668F;
    public HashSet<String> btj;
    public long btk = 6000L;
    public long btl = 8000L;
    public long btm = 1000L;
    public long bto = 1000L;
    public long btp = 120000L;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/trace/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */