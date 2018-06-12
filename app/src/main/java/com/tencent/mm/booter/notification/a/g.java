package com.tencent.mm.booter.notification.a;

import android.content.Context;

public final class g
{
  public int cZA;
  public boolean cZB;
  private int cZC = -1;
  private int cZD = -1;
  public boolean cZE;
  public boolean cZF;
  public b cZr;
  public c cZs;
  public d cZt;
  public h cZu;
  private f cZv;
  public a cZw;
  public int cZx;
  public int cZy;
  public int cZz;
  public Context mContext;
  
  public g(Context paramContext)
  {
    this.mContext = paramContext;
    this.cZr = new b();
    this.cZs = new c();
    this.cZt = new d();
    this.cZu = new h();
    this.cZw = new a();
    this.cZv = f.a.yl();
  }
  
  public static String c(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null) {
      paramArrayOfLong = null;
    }
    String str;
    do
    {
      return paramArrayOfLong;
      str = "";
      int j = paramArrayOfLong.length;
      int i = 0;
      while (i < j)
      {
        long l = paramArrayOfLong[i];
        str = str + String.valueOf(l) + ",";
        i += 1;
      }
      paramArrayOfLong = str;
    } while (str.isEmpty());
    return str.substring(0, str.length() - 1);
  }
  
  public final void eR(String paramString)
  {
    this.cZv.eQ(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/booter/notification/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */