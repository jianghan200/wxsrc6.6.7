package com.tencent.tencentmap.mapsdk.a;

import java.io.Serializable;

public abstract class cx
  implements Serializable
{
  public abstract void a(cv paramcv);
  
  public abstract void a(cw paramcw);
  
  public final byte[] a()
  {
    cw localcw = new cw();
    a(localcw);
    return localcw.b();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */