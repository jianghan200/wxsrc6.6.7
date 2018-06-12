package com.tencent.tencentmap.mapsdk.a;

import java.util.Map;
import java.util.WeakHashMap;

public final class ti
{
  private static Map<tc.a, rh> a = new WeakHashMap();
  
  public static rh a(sl paramsl, tc.a parama)
  {
    if (paramsl.f().a() > 1) {}
    for (int i = 2;; i = 1)
    {
      paramsl = (rh)a.get(parama);
      if (paramsl == null) {
        break;
      }
      return paramsl;
    }
    switch (ti.1.a[parama.ordinal()])
    {
    default: 
      return null;
    case 1: 
      paramsl = new tk(i);
    }
    for (;;)
    {
      a.put(parama, paramsl);
      return paramsl;
      paramsl = new tm(i);
      continue;
      paramsl = new tj(i);
      continue;
      paramsl = new tl(i);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */