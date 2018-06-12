package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.config.a.e;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.n;
import org.json.JSONObject;

public final class br
  extends a
{
  public static final int CTRL_INDEX = 150;
  public static final String NAME = "switchTab";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optString("url");
    if (!paraml.fdO.fcv.foP.rH(paramJSONObject))
    {
      paraml.E(paramInt, f("fail:can not switch to non-TabBar page", null));
      return;
    }
    paraml.fdO.fcz.uW(paramJSONObject);
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */