package c.t.m.g;

import android.content.Context;

public final class b
{
  public Context a;
  int b;
  public boolean c;
  public String d = "";
  public String e = "";
  String f = "0M100WJ33N1CQ08O";
  private int g = -1;
  
  public b(Context paramContext, String paramString1, String paramString2)
  {
    this.a = paramContext.getApplicationContext();
    this.b = 100;
    this.c = true;
    this.d = paramString1;
    this.e = paramString2;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("[");
    localStringBuilder.append("appid:" + this.b);
    localStringBuilder.append(",uuid:" + this.d);
    localStringBuilder.append(",channelid:" + this.e);
    localStringBuilder.append(",isSDKMode:" + this.c);
    localStringBuilder.append(",isTest:false");
    localStringBuilder.append(",testAppid:" + this.g);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/c/t/m/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */