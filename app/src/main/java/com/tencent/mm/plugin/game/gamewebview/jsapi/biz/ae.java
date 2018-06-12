package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import android.graphics.Color;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class ae
  extends a
{
  public static final int CTRL_BYTE = -2;
  public static final String NAME = "openGameUrlWithExtraWebView";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiOpenGameUrlWithExtraWebView", "invoke");
    String str = paramJSONObject.optString("url");
    if (bi.oW(str))
    {
      x.e("MicroMsg.GameJsApiOpenGameUrlWithExtraWebView", "url is null");
      paramd.E(paramInt, a.f("openGameUrlWithExtraWebView:fail", null));
      return;
    }
    Object localObject = paramJSONObject.optString("statusBarColor");
    int i = 0;
    if (!bi.oW((String)localObject)) {}
    try
    {
      i = Color.parseColor((String)localObject);
      paramJSONObject = paramJSONObject.optString("statusBarStyle");
      localObject = new Intent();
      ((Intent)localObject).putExtra("rawUrl", str);
      ((Intent)localObject).putExtra("customize_status_bar_color", i);
      ((Intent)localObject).putExtra("status_bar_style", paramJSONObject);
      paramd.getPageActivity().L((Intent)localObject);
      paramd.E(paramInt, "openGameUrlWithExtraWebView:ok");
      return;
    }
    catch (IllegalArgumentException paramJSONObject)
    {
      x.e("MicroMsg.GameJsApiOpenGameUrlWithExtraWebView", paramJSONObject.getMessage());
      paramd.E(paramInt, a.f("openGameUrlWithExtraWebView:fail_invalid_color", null));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */