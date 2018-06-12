package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;

public final class d
  extends i<a>
{
  public static final String[] dzV = { i.a(a.dzU, "AppBrandAppLaunchUsernameDuplicateRecord") };
  public final e fgu;
  
  public d(e parame)
  {
    super(parame, a.dzU, "AppBrandAppLaunchUsernameDuplicateRecord", a.ciG);
    this.fgu = parame;
  }
  
  public final boolean u(String paramString, long paramLong)
  {
    if (bi.oW(paramString)) {
      return false;
    }
    a locala = new a();
    locala.field_username = paramString;
    boolean bool = b(locala, new String[0]);
    locala.field_updateTime = paramLong;
    if (bool) {
      return c(locala, new String[0]);
    }
    return b(locala);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appusage/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */