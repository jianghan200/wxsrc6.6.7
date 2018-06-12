package com.tencent.mm.plugin.appbrand.game.d.a;

import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.ah;
import org.json.JSONObject;

public final class f
  extends a
{
  private static final int CTRL_INDEX = 463;
  private static final String NAME = "updateKeyboard";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    ah.A(new f.1(this, paraml, paramJSONObject.optString("value"), paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/d/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */