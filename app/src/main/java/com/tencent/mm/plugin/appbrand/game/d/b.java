package com.tencent.mm.plugin.appbrand.game.d;

import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.game.k;
import com.tencent.mm.plugin.appbrand.game.page.d;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.n
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "setPreferredFramesPerSecond";
  
  public final String a(com.tencent.mm.plugin.appbrand.l paraml, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {}
    for (;;)
    {
      return null;
      if (paraml == null) {
        paraml = null;
      }
      while (paraml != null)
      {
        int i = paramJSONObject.optInt("fps", 60);
        x.i("MicroMsg.JsApiSetPreferredFramesPerSecond", "GameRenderer.setFPS %d", new Object[] { Integer.valueOf(i) });
        paraml.setFps(Math.max(10, Math.min(60, i)));
        return null;
        if ((paraml.fdO == null) || (paraml.fdO.fcz == null) || (paraml.fdO.fcz.getCurrentPage() == null) || (paraml.fdO.fcz.getCurrentPage().getCurrentPageView() == null))
        {
          paraml = null;
        }
        else
        {
          paraml = paraml.fdO.fcz.getCurrentPage().getCurrentPageView();
          if ((paraml == null) || (!(paraml instanceof d))) {
            paraml = null;
          } else {
            paraml = ((d)paraml).fCI;
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */