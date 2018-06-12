package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.net.Uri;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class ap
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = -2;
  public static final String NAME = "requestData";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiRequestData", "invoke");
    if (!Uri.parse(paramd.getCurrentURL()).getHost().equals("game.weixin.qq.com"))
    {
      x.i("MicroMsg.GameJsApiRequestData", "host is not game");
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("requestData:fail", null));
      return;
    }
    Object localObject = paramJSONObject.optString("url");
    String str = paramJSONObject.optString("method");
    paramJSONObject = paramJSONObject.optJSONObject("data");
    x.i("MicroMsg.GameJsApiRequestData", "reqUrl = %s, method = %s", new Object[] { localObject, str });
    if ((bi.oW((String)localObject)) || (bi.oW(str)))
    {
      x.i("MicroMsg.GameJsApiRequestData", "reqUrl or method is null");
      return;
    }
    paramJSONObject = com.tencent.mm.plugin.game.gamewebview.c.a.b((String)localObject, str, paramJSONObject);
    if (paramJSONObject == null)
    {
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("requestData:fail", null));
      return;
    }
    try
    {
      paramJSONObject = new JSONObject(paramJSONObject);
      localObject = new HashMap();
      ((Map)localObject).put("respData", paramJSONObject);
      paramd.E(paramInt, f("requestData:ok", (Map)localObject));
      return;
    }
    catch (JSONException paramJSONObject)
    {
      x.e("MicroMsg.GameJsApiRequestData", paramJSONObject.getMessage());
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("requestData:fail_parse_json_fail", null));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */