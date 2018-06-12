package com.d.a.a;

import java.util.TimeZone;

final class aa
{
  static long ai(long paramLong)
  {
    return (TimeZone.getDefault().getOffset(paramLong) + paramLong) / 1000L;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/d/a/a/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */