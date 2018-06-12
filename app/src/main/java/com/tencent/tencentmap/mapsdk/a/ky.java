package com.tencent.tencentmap.mapsdk.a;

public class ky
  implements nj
{
  private r a;
  
  public ky(r paramr)
  {
    this.a = paramr;
  }
  
  public String a(int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt2 = (int)(Math.pow(2.0D, paramInt3) - 1.0D - paramInt2);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("http://p0.map.gtimg.com/scenic/");
    localStringBuffer.append("?z=");
    localStringBuffer.append(paramInt3);
    localStringBuffer.append("&y=");
    localStringBuffer.append(paramInt2);
    localStringBuffer.append("&x=");
    localStringBuffer.append(paramInt1);
    localStringBuffer.append("&styleid=");
    localStringBuffer.append(7);
    localStringBuffer.append("&version=");
    localStringBuffer.append(kv.a());
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */