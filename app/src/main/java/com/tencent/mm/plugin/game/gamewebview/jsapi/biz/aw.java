package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.b;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class aw
  extends a
{
  public static final int CTRL_BYTE = 270;
  public static final String NAME = "setScreenOrientation";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    int i = 0;
    x.i("MicroMsg.GameJsApiSetScreenOrientation", "invoke");
    if (paramJSONObject != null)
    {
      paramJSONObject = paramJSONObject.optString("orientation");
      if (!bi.oW(paramJSONObject)) {}
    }
    else
    {
      x.e("MicroMsg.GameJsApiSetScreenOrientation", "data is null");
      paramd.E(paramInt, a.f("setScreenOrientation:fail_invalid_data", null));
      return;
    }
    if (paramJSONObject.equals("horizontal")) {}
    for (;;)
    {
      paramd.getWebPage().setPageOrientation(i);
      paramd.E(paramInt, a.f("setScreenOrientation:ok", null));
      return;
      if (paramJSONObject.equals("vertical")) {
        i = 1;
      } else if (paramJSONObject.equals("sensor")) {
        i = 4;
      } else if (!paramJSONObject.equals("horizontal_unforced")) {
        if (paramJSONObject.equals("vertical_unforced")) {
          i = 1;
        } else {
          i = -1;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */