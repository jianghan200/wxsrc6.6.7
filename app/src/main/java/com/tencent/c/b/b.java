package com.tencent.c.b;

import android.content.Context;
import android.os.Build;
import com.tencent.c.f.d;
import com.tencent.c.f.d.a;
import com.tencent.c.f.l;

public final class b
{
  private String mChannelId = null;
  private Context mContext = null;
  private String mVersionName = null;
  private int vhT = -1;
  private int vhU = -1;
  private String vhV = null;
  private com.tencent.c.c.a.c vhW = null;
  private com.tencent.c.c.a.a vhX = null;
  
  public b(Context paramContext)
  {
    this.mContext = paramContext;
    paramContext = com.tencent.c.f.a.bK(paramContext, paramContext.getPackageName());
    this.mVersionName = paramContext.versionName;
    this.vhU = paramContext.versionCode;
    this.vhT = 82;
    this.mChannelId = "105901";
    this.vhV = "7AD75E27CD5842F6";
  }
  
  private static String acn(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  private com.tencent.c.c.a.c cFd()
  {
    int m = 2;
    if (this.vhW == null)
    {
      this.vhW = new com.tencent.c.c.a.c();
      this.vhW.vii = this.vhT;
      this.vhW.vin = this.vhU;
      this.vhW.vif = this.mChannelId;
      this.vhW.vie = this.vhV;
    }
    try
    {
      localObject = this.mVersionName.trim().split("[\\.]");
      if ((localObject == null) || (localObject.length < 3)) {
        break label331;
      }
      k = Integer.parseInt(localObject[0]);
      j = Integer.parseInt(localObject[1]);
      i = Integer.parseInt(localObject[2]);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject;
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
    this.vhW.imei = acn(d.ht(this.mContext));
    this.vhW.imsi = acn(d.hu(this.mContext));
    this.vhW.vig = acn(Build.MODEL);
    this.vhW.nyk = acn(d.hv(this.mContext));
    this.vhW.vit = acn(d.mP(true));
    this.vhW.viu = acn(d.mP(false));
    this.vhW.guid = null;
    this.vhW.vil = 0;
    localObject = this.vhW;
    if (d.hw(this.mContext) == d.a.vkG) {}
    for (i = m;; i = 1)
    {
      ((com.tencent.c.c.a.c)localObject).vih = i;
      return this.vhW;
    }
  }
  
  public final byte[] a(com.tencent.c.c.b.a parama)
  {
    try
    {
      l locall = new l();
      locall.cFy();
      locall.acw("viruscheck");
      locall.acx("RiskCheck");
      locall.acv("UTF-8");
      if (this.vhX == null)
      {
        this.vhX = new com.tencent.c.c.a.a();
        this.vhX.vhY = 2;
        this.vhX.vhZ = 201;
      }
      locall.put("phonetype", this.vhX);
      locall.put("userinfo", cFd());
      locall.put("req", parama);
      parama = com.tencent.c.f.b.r(locall.uu());
      if (parama == null) {
        throw new RuntimeException("compress data fail");
      }
      parama = com.tencent.c.f.c.j(parama, com.tencent.c.f.c.k());
      return parama;
    }
    catch (Exception parama) {}
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/c/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */