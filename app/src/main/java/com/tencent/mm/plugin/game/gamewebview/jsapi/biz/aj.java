package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.net.Uri;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class aj
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = -2;
  public static final String NAME = "preRequestData";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiPreRequestData", "invoke");
    if (!Uri.parse(paramd.getCurrentURL()).getHost().equals("game.weixin.qq.com"))
    {
      x.i("MicroMsg.GameJsApiPreRequestData", "host is not game");
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("preRequestData:fail", null));
      return;
    }
    String str1 = paramJSONObject.optString("url");
    String str2 = paramJSONObject.optString("method");
    paramJSONObject = paramJSONObject.optJSONObject("data");
    x.i("MicroMsg.GameJsApiPreRequestData", "reqUrl = %s, method = %s", new Object[] { str1, str2 });
    if ((bi.oW(str1)) || (bi.oW(str2)))
    {
      x.i("MicroMsg.GameJsApiPreRequestData", "reqUrl or method is null");
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("preRequestData:fail", null));
      return;
    }
    com.tencent.mm.plugin.game.gamewebview.c.a.c(str1, str2, paramJSONObject);
    paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("preRequestData:ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */