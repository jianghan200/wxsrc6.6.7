package com.tencent.mm.plugin.location.model;

import com.tencent.mm.pluginsdk.q;

public final class f
{
  private static double fTY = -85.0D;
  private static double fTZ = -1000.0D;
  private static double fUa = -85.0D;
  private static double fUb = -1000.0D;
  
  public static boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt, double paramDouble5)
  {
    if (paramInt == 0)
    {
      if (paramDouble5 == 0.0D) {}
      while (paramDouble5 <= 0.0D) {
        return false;
      }
    }
    for (;;)
    {
      return true;
      if (paramInt != 1) {
        break;
      }
      if ((paramDouble2 == -85.0D) || (paramDouble1 == -1000.0D)) {
        paramInt = 0;
      }
      while (paramInt == 0)
      {
        return false;
        if ((paramDouble3 == -1000.0D) || (paramDouble4 == -85.0D)) {
          paramInt = 0;
        } else if (q.c(paramDouble2, paramDouble1, paramDouble4, paramDouble3) >= 5.0D) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
      }
    }
  }
  
  public static double i(double paramDouble1, double paramDouble2)
  {
    fUa = paramDouble1;
    fUb = paramDouble2;
    if ((fTY == -85.0D) || (fTZ == -1000.0D)) {}
    for (paramDouble1 = 0.0D;; paramDouble1 = Math.atan2(fUb - fTZ, fUa - fTY) * 180.0D / 3.141592D)
    {
      fTY = fUa;
      fTZ = fUb;
      return paramDouble1;
    }
  }
  
  public static double o(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return Math.sqrt((paramInt1 - paramInt3) * (paramInt1 - paramInt3) + (paramInt2 - paramInt4) * (paramInt2 - paramInt4));
  }
  
  public static boolean t(double paramDouble)
  {
    return paramDouble >= 4.0D;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/location/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */