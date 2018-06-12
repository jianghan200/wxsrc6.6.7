package com.tencent.mm.plugin.appbrand.game.d.a;

import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.ah;
import org.json.JSONObject;

public final class d
  extends a
{
  private static final int CTRL_INDEX = 70;
  private static final String NAME = "hideKeyboard";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    ah.A(new d.1(this, paraml));
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/d/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */