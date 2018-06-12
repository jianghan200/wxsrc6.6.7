package com.tencent.mm.plugin.appbrand.game.d;

import com.tencent.mm.plugin.appbrand.config.d;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 395;
  public static final String NAME = "setDeviceOrientation";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    paramJSONObject = d.rJ(paramJSONObject.optString("value", null));
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    if ((paraml.fdO == null) || (paraml.fdO.fcq == null))
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    d.b(paraml.fdO.fcq).a(paraml.fdO.fcq, paramJSONObject, new a.1(this, paraml, paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */