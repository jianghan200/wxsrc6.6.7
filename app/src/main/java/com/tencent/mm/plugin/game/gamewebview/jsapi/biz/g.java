package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.e;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g
  extends a
{
  public static final int CTRL_BYTE = 84;
  public static final String NAME = "checkJsApi";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiCheckJsApi", "invoke");
    JSONArray localJSONArray = paramJSONObject.optJSONArray("jsApiList");
    if (localJSONArray == null)
    {
      paramd.E(paramInt, a.f("checkJsApi:param is empty", null));
      return;
    }
    paramJSONObject = new JSONObject();
    int i = 0;
    try
    {
      if (i < localJSONArray.length())
      {
        String str = localJSONArray.optString(i);
        if (e.aSw().containsKey(str)) {}
        for (boolean bool = true;; bool = false)
        {
          paramJSONObject.put(str, bool);
          i += 1;
          break;
        }
      }
      HashMap localHashMap;
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.GameJsApiCheckJsApi", localException, "", new Object[0]);
      localHashMap = new HashMap();
      localHashMap.put("checkResult", paramJSONObject.toString());
      paramd.E(paramInt, f("checkJsApi:ok", localHashMap));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */