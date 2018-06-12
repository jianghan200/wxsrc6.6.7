package com.d.a.a;

import android.location.Location;

final class i
{
  static i bho;
  double bhp;
  double bhq;
  float bhr;
  float bhs;
  float bht;
  float bhu;
  float bhv;
  float bhw;
  boolean bhx = false;
  
  final void a(double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float[] arrayOfFloat = new float[1];
    if (paramDouble2 > 179.0D)
    {
      d = -1.0E-5D;
      Location.distanceBetween(paramDouble1, paramDouble2, paramDouble1, paramDouble2 + d, arrayOfFloat);
      this.bhw = arrayOfFloat[0];
      if (paramDouble1 <= 89.0D) {
        break label119;
      }
    }
    label119:
    for (double d = -1.0E-5D;; d = 1.0E-5D)
    {
      Location.distanceBetween(d + paramDouble1, paramDouble2, paramDouble1, paramDouble2, arrayOfFloat);
      this.bhv = arrayOfFloat[0];
      this.bhp = paramDouble1;
      this.bhq = paramDouble2;
      this.bhr = paramFloat2;
      this.bhs = paramFloat3;
      this.bhu = paramFloat1;
      this.bht = paramFloat4;
      this.bhx = true;
      return;
      d = 1.0E-5D;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/d/a/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */