package com.tencent.c.b;

import android.content.Context;
import android.os.Build;
import com.tencent.c.f.d;
import com.tencent.c.f.d.a;
import com.tencent.c.f.i;
import com.tencent.c.f.l;

public final class c
{
  private Context mContext;
  private String mVersionName = null;
  private int vhU = -1;
  private com.tencent.c.c.a.c vhW = null;
  
  public c(Context paramContext)
  {
    this.mContext = paramContext;
    paramContext = i.bL(paramContext, paramContext.getPackageName());
    this.mVersionName = paramContext.versionName;
    this.vhU = paramContext.versionCode;
  }
  
  private com.tencent.c.c.a.c a(com.tencent.c.e.a.b.a parama)
  {
    if (this.vhW == null)
    {
      this.vhW = new com.tencent.c.c.a.c();
      this.vhW.vii = 82;
      this.vhW.vin = this.vhU;
      this.vhW.vif = parama.bVU;
      this.vhW.vie = parama.vie;
    }
    try
    {
      String[] arrayOfString = this.mVersionName.trim().split("[\\.]");
      if ((arrayOfString == null) || (arrayOfString.length < 3)) {
        break label322;
      }
      k = Integer.parseInt(arrayOfString[0]);
      j = Integer.parseInt(arrayOfString[1]);
      i = Integer.parseInt(arrayOfString[2]);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        continue;
        int i = 0;
        int j = 0;
        int k = 0;
      }
    }
    this.vhW.vij = new com.tencent.c.c.a.b();
    this.vhW.vij.vib = k;
    this.vhW.vij.vic = j;
    this.vhW.vij.vid = i;
    this.vhW.vik = 0;
    this.vhW.vim = d.cFv();
    this.vhW.imei = acn(parama.imei);
    this.vhW.imsi = acn(parama.imsi);
    this.vhW.vig = acn(Build.MODEL);
    this.vhW.nyk = acn(d.hv(this.mContext));
    this.vhW.vit = acn(d.mP(true));
    this.vhW.viu = acn(d.mP(false));
    this.vhW.vil = 0;
    this.vhW.vih = getNetworkType();
    this.vhW.guid = acn(d.hx(this.mContext));
    return this.vhW;
  }
  
  private static String acn(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  private int getNetworkType()
  {
    try
    {
      int i = d.hw(this.mContext);
      int j = d.a.vkG;
      if (i == j) {
        return 2;
      }
      return 1;
    }
    catch (Throwable localThrowable) {}
    return 2;
  }
  
  public final byte[] c(String paramString1, String paramString2, com.tencent.c.e.a.b.a parama)
  {
    try
    {
      l locall = new l();
      locall.cFy();
      locall.acw(paramString1);
      locall.acx(paramString2);
      locall.acv("UTF-8");
      locall.put("userInfo", a(parama));
      locall.put("req", parama);
      paramString1 = com.tencent.c.f.b.r(locall.uu());
      if (paramString1 == null) {
        throw new RuntimeException("compress data fail");
      }
      paramString1 = com.tencent.c.f.c.j(paramString1, com.tencent.c.f.c.k());
      return paramString1;
    }
    catch (Exception paramString1) {}
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/c/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */