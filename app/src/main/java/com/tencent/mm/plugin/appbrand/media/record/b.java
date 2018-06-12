package com.tencent.mm.plugin.appbrand.media.record;

public enum b
{
  public int gih;
  
  private b(int paramInt)
  {
    this.gih = paramInt;
  }
  
  public static b a(String paramString, b paramb)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {}
    do
    {
      return paramb;
      paramString = valueOf(paramString);
    } while (paramString == null);
    return paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/record/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */