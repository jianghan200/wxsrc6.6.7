package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;

public final class dp
  extends dn
{
  public dp(Context paramContext)
  {
    super(paramContext, 0, 100);
  }
  
  public final cn a()
  {
    Object localObject = c.m();
    byte[] arrayOfByte = "".getBytes();
    try
    {
      localObject = e.a(c(), (c)localObject, arrayOfByte, -1, -1);
      if (localObject != null) {
        return (cn)localObject;
      }
      return null;
    }
    catch (Throwable localThrowable)
    {
      ct.a(localThrowable);
      ct.d("encode2RequestPackage failed", new Object[0]);
    }
    return null;
  }
  
  public final void b(boolean paramBoolean) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/dp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */