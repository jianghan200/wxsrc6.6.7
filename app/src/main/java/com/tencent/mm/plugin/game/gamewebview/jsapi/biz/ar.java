package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class ar
  extends a
{
  public static final int CTRL_BYTE = 218;
  public static final String NAME = "setBounceBackground";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiSetBounceBackground", "invoke");
    if ((paramJSONObject == null) || (bi.oW(paramJSONObject.optString("backgroundColor"))))
    {
      paramd.E(paramInt, a.f("setBounceBackground:fail_invalid_data", null));
      return;
    }
    paramd.setBounceBackground(paramJSONObject.optString("backgroundColor"));
    paramd.E(paramInt, a.f("setBounceBackground:ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */