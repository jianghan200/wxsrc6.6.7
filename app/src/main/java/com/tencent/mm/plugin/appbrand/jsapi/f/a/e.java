package com.tencent.mm.plugin.appbrand.jsapi.f.a;

import com.tencent.mm.plugin.appbrand.r.b.b.a;
import com.tencent.mm.pluginsdk.q;

public final class e
{
  private static double fTY = -85.0D;
  private static double fTZ = -1000.0D;
  private static double fUa = -85.0D;
  private static double fUb = -1000.0D;
  
  public static boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, b.a parama, double paramDouble5)
  {
    if (parama == b.a.gCw)
    {
      if (paramDouble5 == 0.0D) {}
      while (paramDouble5 <= 0.0D) {
        return false;
      }
    }
    for (;;)
    {
      return true;
      if (parama != b.a.gCx) {
        break;
      }
      int i;
      if ((paramDouble2 == -85.0D) || (paramDouble1 == -1000.0D)) {
        i = 0;
      }
      while (i == 0)
      {
        return false;
        if ((paramDouble3 == -1000.0D) || (paramDouble4 == -85.0D)) {
          i = 0;
        } else if (q.c(paramDouble2, paramDouble1, paramDouble4, paramDouble3) >= 5.0D) {
          i = 1;
        } else {
          i = 0;
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
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */