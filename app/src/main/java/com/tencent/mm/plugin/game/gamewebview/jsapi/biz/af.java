package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class af
  extends a
{
  public static final int CTRL_BYTE = 173;
  public static final String NAME = "openUrlWithExtraWebview";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GameWebViewUI localGameWebViewUI = paramd.getPageActivity();
    if (localGameWebViewUI == null)
    {
      x.i("MicroMsg.GameJsApiOpenUrlWithExtraWebView", "activity is null");
      return;
    }
    paramJSONObject = paramJSONObject.optString("url");
    if (bi.oW(paramJSONObject))
    {
      paramd.E(paramInt, a.f("openUrlWithExtraWebview:fail_invalid_url", null));
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramJSONObject);
    x.d("MicroMsg.GameJsApiOpenUrlWithExtraWebView", "openUrlWithExtraWebview: " + System.currentTimeMillis());
    localGameWebViewUI.L(localIntent);
    paramd.E(paramInt, a.f("openUrlWithExtraWebview:ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */