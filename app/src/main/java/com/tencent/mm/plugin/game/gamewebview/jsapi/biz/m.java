package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class m
  extends a
{
  public static final int CTRL_BYTE = 17;
  public static final String NAME = "closeWindow";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiCloseWindow", "invoke");
    if ((paramd == null) || (paramd.getPageActivity() == null))
    {
      x.e("MicroMsg.GameJsApiCloseWindow", "page or activity is null");
      return;
    }
    paramd.fr(false);
    paramd.E(paramInt, a.f("close_window:ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */