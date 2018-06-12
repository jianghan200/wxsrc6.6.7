package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;

public class pn
{
  private static pn c;
  private pm a = new pq();
  private boolean b = false;
  
  public static pn a()
  {
    try
    {
      if (c == null) {
        c = new pn();
      }
      pn localpn = c;
      return localpn;
    }
    finally {}
  }
  
  public po a(String paramString)
  {
    if (this.a == null) {
      return null;
    }
    return this.a.a(paramString);
  }
  
  public po a(String paramString1, String paramString2)
  {
    if (this.a == null) {
      return null;
    }
    return this.a.a(paramString1, paramString2);
  }
  
  public po a(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    if (this.a == null) {
      return null;
    }
    return this.a.a(paramString1, paramString2, paramArrayOfByte);
  }
  
  public void a(Context paramContext)
  {
    if (this.b) {}
    while (this.a == null) {
      return;
    }
    this.a.a(paramContext.getApplicationContext());
    this.b = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/pn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */