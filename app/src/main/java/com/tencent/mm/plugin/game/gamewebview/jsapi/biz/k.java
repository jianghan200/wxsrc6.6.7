package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.d.25;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class k
  extends a
{
  public static final int CTRL_BYTE = 189;
  public static final String NAME = "clearBounceBackground";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiClearBounceBackground", "invoke");
    if (paramd.jIZ != null) {
      paramd.mHandler.post(new d.25(paramd));
    }
    paramd.E(paramInt, a.f("clearBounceBackground:ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */