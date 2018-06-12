package com.tencent.tencentmap.mapsdk.a;

import java.net.MalformedURLException;
import java.net.URL;

public final class tj
  extends th
{
  private String[] b = { "https://p0.map.gtimg.com/sateTiles", "https://p1.map.gtimg.com/sateTiles", "https://p2.map.gtimg.com/sateTiles", "https://p3.map.gtimg.com/sateTiles" };
  
  public tj(int paramInt)
  {
    super(paramInt);
  }
  
  public final URL a(int paramInt1, int paramInt2, int paramInt3, Object... paramVarArgs)
  {
    paramInt2 = (int)(Math.pow(2.0D, paramInt3) - paramInt2 - 1.0D);
    int i = a(paramInt1 + paramInt2, 4);
    paramVarArgs = this.b[i] + '/' + paramInt3 + '/' + (paramInt1 >> 4) + '/' + (paramInt2 >> 4) + '/' + paramInt1 + '_' + paramInt2 + ".jpg";
    try
    {
      paramVarArgs = new URL(paramVarArgs);
      return paramVarArgs;
    }
    catch (MalformedURLException paramVarArgs) {}
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/tj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */