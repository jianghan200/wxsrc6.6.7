package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.res.Resources;
import com.tencent.mm.R.e;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.d.23;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class av
  extends a
{
  public static final int CTRL_BYTE = 113;
  public static final String NAME = "setPageTitle";
  
  public final void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiSetPageTitle", "invoke");
    if (paramJSONObject == null)
    {
      x.i("MicroMsg.GameJsApiSetPageTitle", "data is null");
      paramd.E(paramInt, "setPageTitle:fail");
      return;
    }
    GameWebViewUI localGameWebViewUI = paramd.getPageActivity();
    String str = paramJSONObject.optString("title");
    int i = com.tencent.mm.plugin.webview.ui.tools.d.aO(paramJSONObject.optString("color"), localGameWebViewUI.getResources().getColor(R.e.action_bar_tittle_color));
    paramd.mHandler.post(new d.23(paramd, str, i));
    paramd.E(paramInt, a.f("setPageTitle:ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */