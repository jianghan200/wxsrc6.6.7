package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.r.m;
import org.json.JSONObject;

public class a
  extends e
{
  public void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    if ((paramc instanceof l)) {
      if (!m.a((l)paramc, paramJSONObject, this)) {
        paramc.E(paramInt, f(this.fEX, null));
      }
    }
    while (!(paramc instanceof p))
    {
      return;
      a((l)paramc, paramJSONObject, paramInt);
      return;
    }
    a((p)paramc, paramJSONObject, paramInt);
  }
  
  public void a(l paraml, JSONObject paramJSONObject, int paramInt) {}
  
  public void a(p paramp, JSONObject paramJSONObject, int paramInt) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */