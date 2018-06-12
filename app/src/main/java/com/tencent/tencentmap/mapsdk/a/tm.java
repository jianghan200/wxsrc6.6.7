package com.tencent.tencentmap.mapsdk.a;

import java.net.MalformedURLException;
import java.net.URL;

public class tm
  extends th
{
  private String[] b = { "https://s0.map.gtimg.com/oversea", "https://s1.map.gtimg.com/oversea", "https://s2.map.gtimg.com/oversea", "https://s3.map.gtimg.com/oversea" };
  
  public tm(int paramInt)
  {
    super(paramInt);
  }
  
  public URL a(int paramInt1, int paramInt2, int paramInt3, Object... paramVarArgs)
  {
    int i = a(paramInt1 + paramInt2, this.b.length);
    paramVarArgs = this.b[i];
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramVarArgs);
    localStringBuilder.append("?");
    localStringBuilder.append("z=").append(paramInt3);
    localStringBuilder.append("&x=").append(paramInt1);
    localStringBuilder.append("&y=").append(paramInt2);
    localStringBuilder.append("&styleid=").append(sn.e());
    localStringBuilder.append("&scene=").append(sn.f());
    localStringBuilder.append("&version=").append(sn.g());
    localStringBuilder.append("&ch=").append(sl.q());
    paramVarArgs = localStringBuilder.toString();
    try
    {
      paramVarArgs = new URL(paramVarArgs);
      return paramVarArgs;
    }
    catch (MalformedURLException paramVarArgs) {}
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/tm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */