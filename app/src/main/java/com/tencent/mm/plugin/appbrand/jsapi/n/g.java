package com.tencent.mm.plugin.appbrand.jsapi.n;

import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.ah;
import org.json.JSONObject;

public final class g
  extends a
{
  private static final int CTRL_INDEX = 470;
  private static final String NAME = "showStatusBar";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = d(paraml);
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail no page available", null));
      return;
    }
    a(paramJSONObject.gnE, paraml, paramInt);
  }
  
  final void a(com.tencent.mm.plugin.appbrand.page.a.c paramc, com.tencent.mm.plugin.appbrand.jsapi.c paramc1, int paramInt)
  {
    if (!ah.isMainThread())
    {
      ah.A(new g.1(this, paramc, paramc1, paramInt));
      return;
    }
    paramc.ahh();
    paramc1.E(paramInt, f("ok", null));
  }
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    a(paramp.gnE, paramp, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/n/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */