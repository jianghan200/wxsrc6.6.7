package com.tencent.tencentmap.mapsdk.a;

import java.util.concurrent.atomic.AtomicInteger;

public class aw
{
  private AtomicInteger a;
  private AtomicInteger b;
  
  public bb a(au paramau, ah paramah)
  {
    Object localObject;
    if (paramah.a(2)) {
      localObject = c(paramau, paramah);
    }
    bb localbb;
    do
    {
      return (bb)localObject;
      localbb = b(paramau, paramah);
      localObject = localbb;
    } while (localbb != null);
    return a(paramau, paramah);
  }
  
  public bb a(mk parammk, ah paramah)
  {
    if (parammk.a(0))
    {
      parammk = parammk.a(0, this.a.incrementAndGet());
      if (parammk != null) {
        return parammk;
      }
    }
    return null;
  }
  
  public bb b(au paramau, ah paramah)
  {
    if (paramah.a(1))
    {
      paramah = paramau.a(0, paramah.b());
      if (paramah != null) {
        return paramah;
      }
      ax.a(paramau.j + " do not have active service in getHashSelect hash invoke");
    }
    return null;
  }
  
  public bb c(au paramau, ah paramah)
  {
    if (paramah.a(2))
    {
      if (!paramau.a(paramah.c())) {
        break label153;
      }
      if (paramah.b() != -1) {
        break label102;
      }
      paramau = paramau.a(paramah.c(), this.b.incrementAndGet());
      if (paramau != null)
      {
        paramah = paramau;
        return paramah;
      }
      ax.a(paramah.a() + " get gridActiveServices " + paramah.c() + " is null");
    }
    label102:
    label153:
    while (!paramau.d()) {
      for (;;)
      {
        return null;
        bb localbb = paramau.a(paramah.c(), paramah.b());
        paramah = localbb;
        if (localbb == null) {
          ax.a(paramau.j + " do not have active service in getGridSelect hash invoke");
        }
      }
    }
    throw new bl("gridValue is " + paramah.c() + ", but no gridService can use");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */