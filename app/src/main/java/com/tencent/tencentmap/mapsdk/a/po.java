package com.tencent.tencentmap.mapsdk.a;

public class po
{
  public byte[] a;
  public String b = "GBK";
  
  public String toString()
  {
    try
    {
      String str = new String(this.a, this.b);
      return str;
    }
    catch (Exception localException) {}
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/po.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */