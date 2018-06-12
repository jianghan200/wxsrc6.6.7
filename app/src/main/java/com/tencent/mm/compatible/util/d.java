package com.tencent.mm.compatible.util;

import android.os.Build.VERSION;

public final class d
{
  public static boolean fR(int paramInt)
  {
    return Build.VERSION.SDK_INT >= paramInt;
  }
  
  public static boolean fS(int paramInt)
  {
    return Build.VERSION.SDK_INT < paramInt;
  }
  
  public static boolean fT(int paramInt)
  {
    return Build.VERSION.SDK_INT > paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/util/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */