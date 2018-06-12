package com.tencent.mm.plugin.appbrand.config;

import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;

public final class c
  extends i<b>
{
  public static final String[] dzV = { i.a(b.dzU, "AppBrandCommonKVData") };
  public final e fgu;
  
  public c(e parame)
  {
    super(parame, b.dzU, "AppBrandCommonKVData", null);
    this.fgu = parame;
  }
  
  public final boolean bd(String paramString1, String paramString2)
  {
    if (bi.oW(paramString1)) {}
    b localb;
    do
    {
      return false;
      localb = new b();
      localb.field_key = paramString1;
      localb.field_value = paramString2;
      if (!bi.oW(localb.field_value)) {
        break;
      }
    } while (super.a(localb, new String[0]));
    return true;
    return super.a(localb);
  }
  
  public final String get(String paramString1, String paramString2)
  {
    if (bi.oW(paramString1)) {}
    b localb;
    do
    {
      return paramString2;
      localb = new b();
      localb.field_key = paramString1;
    } while (!super.b(localb, new String[0]));
    return localb.field_value;
  }
  
  public final void rI(String paramString)
  {
    super.fV("AppBrandCommonKVData", String.format("delete from %s where %s like '%s%%'", new Object[] { "AppBrandCommonKVData", "key", paramString }));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */