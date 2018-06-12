package c.t.m.g;

import android.location.Location;
import android.os.Bundle;

public final class dd
{
  public static final Location a = new Location("EMPTY");
  
  static
  {
    new Bundle();
  }
  
  public static String a(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    boolean bool = cn.a().d("https");
    StringBuilder localStringBuilder2 = new StringBuilder("http");
    if (bool) {}
    for (String str = "s";; str = "")
    {
      localStringBuilder1.append(str + "://lbs.map.qq.com/loc");
      localStringBuilder1.append("?");
      localStringBuilder1.append("c=1");
      localStringBuilder1.append("&mars=").append(paramInt1);
      localStringBuilder1.append("&obs=").append(paramInt2);
      return localStringBuilder1.toString();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/c/t/m/g/dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */