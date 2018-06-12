package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.d.20;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class az
  extends a
{
  public static final int CTRL_BYTE = 187;
  public static final String NAME = "showKeyboard";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiShowKeyBoard", "invoke");
    String str = paramJSONObject.optString("placeholder");
    int i = paramJSONObject.optInt("maxLength");
    paramd.jJs = paramInt;
    if (paramd.jJa != null) {
      paramd.mHandler.post(new d.20(paramd, str, i));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */