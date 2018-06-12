package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.d.24;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n
  extends a
{
  public static final int CTRL_BYTE = 188;
  public static final String NAME = "disableBounceScroll";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiDisableBounceScroll", "invoke");
    paramJSONObject = paramJSONObject.optJSONArray("place");
    if (paramJSONObject == null)
    {
      x.i("MicroMsg.GameJsApiDisableBounceScroll", "placeArray is null");
      paramd.E(paramInt, a.f("disableBounceScroll:fail", null));
      return;
    }
    int j = 0;
    int i = 0;
    if (j < paramJSONObject.length())
    {
      if (!"top".equalsIgnoreCase(paramJSONObject.optString(j))) {
        break label123;
      }
      i = 1;
    }
    label123:
    for (;;)
    {
      j += 1;
      break;
      if (i == 0)
      {
        paramd.E(paramInt, a.f("disableBounceScroll:ok", null));
        return;
      }
      paramd.mHandler.post(new d.24(paramd));
      paramd.E(paramInt, a.f("disableBounceScroll:ok", null));
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */