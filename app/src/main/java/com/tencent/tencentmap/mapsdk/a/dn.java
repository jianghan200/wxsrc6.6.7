package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;

public abstract class dn
{
  protected final int a;
  protected final int b;
  protected Context c;
  protected String d;
  
  public dn(Context paramContext, int paramInt1, int paramInt2)
  {
    this.c = paramContext;
    this.a = paramInt2;
    this.b = paramInt1;
  }
  
  public static cn a(int paramInt, byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = e.a(paramInt, c.m(), paramArrayOfByte, 2, 3);
      return paramArrayOfByte;
    }
    catch (Throwable paramArrayOfByte)
    {
      ct.c("imposiable comStrategy error:%s", new Object[] { paramArrayOfByte.toString() });
      ct.a(paramArrayOfByte);
    }
    return null;
  }
  
  public abstract cn a();
  
  public void b()
  {
    ct.c("encode failed, clear db data", new Object[0]);
  }
  
  public abstract void b(boolean paramBoolean);
  
  public final int c()
  {
    return this.a;
  }
  
  public final String d()
  {
    try
    {
      String str = this.d;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String e()
  {
    try
    {
      if (this.b == 0) {
        return cf.a(this.c).e().b();
      }
      String str = cf.a(this.c).e().b(this.b).b();
      return str;
    }
    catch (Throwable localThrowable)
    {
      ct.c("imposiable comStrategy error:%s", new Object[] { localThrowable.toString() });
      ct.a(localThrowable);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/dn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */