package com.tencent.tencentmap.mapsdk.a;

import android.text.TextUtils;

public class ep
{
  private String a = "";
  private int b = -1;
  
  public ep() {}
  
  public ep(String paramString, int paramInt)
  {
    this.a = paramString;
    this.b = paramInt;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public boolean a(ep paramep)
  {
    return (paramep != null) && (this.a.equals(paramep.a)) && (this.b == paramep.b);
  }
  
  public boolean a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    do
    {
      return false;
      paramString = paramString.split(":");
    } while (paramString.length != 2);
    this.a = paramString[0];
    try
    {
      this.b = Integer.parseInt(paramString[1]);
      return true;
    }
    catch (NumberFormatException paramString) {}
    return false;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.a + ":" + this.b;
  }
  
  public String d()
  {
    if (this.b == -1) {
      return this.a;
    }
    return c();
  }
  
  public String toString()
  {
    return d();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */