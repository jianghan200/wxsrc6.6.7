package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class u
  extends i<t>
{
  public static final String[] dzV = { i.a(t.fgt, "PkgUpdateStats") };
  
  public u(e parame)
  {
    super(parame, t.fgt, "PkgUpdateStats", t.ciG);
  }
  
  final boolean af(String paramString, int paramInt)
  {
    t localt = new t();
    localt.field_key = paramString;
    localt.field_version = paramInt;
    return super.a(localt, t.fgs);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */