package com.d.a.a;

import java.util.Arrays;

final class l
{
  float biG;
  long biK;
  private final float[] biL = new float[3];
  private int biM;
  private long biN;
  long biO;
  
  final void a(float paramFloat, int paramInt, long paramLong)
  {
    long l = paramLong - this.biN;
    if (l > this.biK)
    {
      Arrays.fill(this.biL, 0.0F);
      this.biM = 0;
      this.biN = 0L;
      this.biO = 0L;
      this.biG = 0.0F;
      this.biL[0] = this.biL[1];
      this.biL[1] = this.biL[2];
      this.biL[2] = paramFloat;
      if (this.biL[2] != 0.0F)
      {
        if (this.biL[0] == 0.0F) {
          break label196;
        }
        paramFloat = (this.biL[0] + this.biL[1] + this.biL[2]) / 3.0F;
      }
    }
    for (;;)
    {
      float f = y.bmN;
      this.biG = (paramInt / (paramFloat + this.biL[2] * 3.0F) * f + y.bmO * (paramInt - this.biM) / (this.biM + paramInt + 1));
      this.biM = paramInt;
      this.biN = paramLong;
      return;
      this.biO = (l + this.biO);
      break;
      label196:
      if (this.biL[1] != 0.0F) {
        paramFloat = (this.biL[1] + this.biL[2]) / 2.0F;
      } else {
        paramFloat = this.biL[2];
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/d/a/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */