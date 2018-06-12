package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.b;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class ab
  extends a
{
  public static final int CTRL_BYTE = 256;
  public static final String NAME = "openCustomWebview";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GameWebViewUI localGameWebViewUI = paramd.getPageActivity();
    if (localGameWebViewUI == null)
    {
      x.i("MicroMsg.GameJsApiOpenCustomWebView", "activity is null");
      return;
    }
    String str1 = paramJSONObject.optString("url");
    if (bi.oW(str1))
    {
      paramd.E(paramInt, a.f("openCunstonWebview:fail_invalid_url", null));
      return;
    }
    paramd.getRawUrl().startsWith("http://game.weixin.qq.com/cgi-bin/h5/static/gameloading/index.html?appid=");
    String str2 = paramJSONObject.optString("orientation");
    int j = -1;
    int i = j;
    if (!bi.oW(str2))
    {
      if (!str2.equals("horizontal")) {
        break label316;
      }
      i = 0;
    }
    for (;;)
    {
      boolean bool1 = paramJSONObject.optBoolean("fullscreen");
      str2 = paramJSONObject.optString("top_title");
      String str3 = paramJSONObject.optString("top_url");
      boolean bool2 = paramJSONObject.optString("finish_recent_webview").equals("1");
      boolean bool3 = paramJSONObject.optString("disable_swipe_back").equals("1");
      String str4 = paramJSONObject.optString("username");
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", str1);
      localIntent.putExtra("screen_orientation", i);
      localIntent.putExtra("show_full_screen", bool1);
      localIntent.putExtra("disable_swipe_back", bool3);
      localIntent.putExtra("shortcut_user_name", str4);
      localIntent.putExtra("finish_recent_page", bool2);
      if ((!bi.oW(str3)) && (!bi.oW(str2)))
      {
        localIntent.putExtra("custom_keep_top_url", str3);
        localIntent.putExtra("custom_keep_top_title", str2);
      }
      if ((bool2) && (paramd.jIT.aSG())) {
        localIntent.putExtra("is_from_keep_top", true);
      }
      localIntent.putExtra("game_hv_menu_appid", bi.oV(paramJSONObject.optString("gameAppid")));
      localGameWebViewUI.L(localIntent);
      paramd.E(paramInt, a.f("openCunstonWebview:ok", null));
      return;
      label316:
      i = j;
      if (str2.equals("vertical")) {
        i = 1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */