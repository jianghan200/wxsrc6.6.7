package com.tencent.tencentmap.mapsdk.a;

import java.net.MalformedURLException;
import java.net.URL;

public final class tl
  extends th
{
  private static final String[] b = { "https://rtt2.map.qq.com", "https://rtt2a.map.qq.com", "https://rtt2b.map.qq.com", "https://rtt2c.map.qq.com" };
  
  public tl(int paramInt)
  {
    super(paramInt);
  }
  
  public final URL a(int paramInt1, int paramInt2, int paramInt3, Object... paramVarArgs)
  {
    if (paramInt3 < 10) {
      return null;
    }
    paramVarArgs = b[((paramInt1 + paramInt2) % b.length)];
    paramInt2 = (int)(Math.pow(2.0D, paramInt3) - paramInt2 - 1.0D);
    paramVarArgs = paramVarArgs + "/rtt/?z=" + paramInt3 + "&x=" + paramInt1 + "&y=" + paramInt2 + "&ref=android2DSdk&timeKey=" + System.currentTimeMillis();
    try
    {
      URL localURL = new URL(paramVarArgs);
      return localURL;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      getClass().getSimpleName();
      new StringBuilder("Can not convert ").append(paramVarArgs).append(" to URL.");
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/tl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */