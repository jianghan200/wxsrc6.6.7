package com.d.a.a;

import android.os.SystemClock;

class p
{
  final long bjx;
  final long bjy;
  final int what;
  
  p(int paramInt)
  {
    this(paramInt, System.currentTimeMillis(), SystemClock.elapsedRealtime());
  }
  
  private p(int paramInt, long paramLong1, long paramLong2)
  {
    this.what = paramInt;
    this.bjx = paramLong1;
    this.bjy = paramLong2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/d/a/a/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */