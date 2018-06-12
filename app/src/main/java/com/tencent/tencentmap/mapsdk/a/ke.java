package com.tencent.tencentmap.mapsdk.a;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class ke
  extends mx
  implements kr
{
  private static AtomicInteger a = new AtomicInteger(1);
  private final String b = String.valueOf(a.incrementAndGet());
  
  public abstract void d();
  
  public boolean q()
  {
    return false;
  }
  
  public void u() {}
  
  public final String v()
  {
    return this.b;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */