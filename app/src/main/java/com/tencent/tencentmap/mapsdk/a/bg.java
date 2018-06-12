package com.tencent.tencentmap.mapsdk.a;

import com.qq.sim.Millis100TimeProvider;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class bg
{
  private static Map<bb, bd> a = new ConcurrentHashMap();
  
  public static bd a(bb parambb)
  {
    bd localbd2 = (bd)a.get(parambb);
    bd localbd1 = localbd2;
    if (localbd2 == null)
    {
      localbd1 = new bd();
      a.put(parambb, localbd1);
    }
    return localbd1;
  }
  
  public static void a(be parambe, bb parambb, int paramInt)
  {
    a(parambb).a(parambe, parambb, paramInt);
  }
  
  public static boolean a(bb parambb, be parambe)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    parambb = a(parambb);
    if (!parambb.a())
    {
      if (parambb.b() + parambe.c().taf_try_time_interval() * 1000 >= Millis100TimeProvider.INSTANCE.currentTimeMillis()) {
        break label62;
      }
      parambb.a(Millis100TimeProvider.INSTANCE.currentTimeMillis());
    }
    label62:
    for (bool1 = bool2;; bool1 = false)
    {
      parambe.c();
      return bool1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */