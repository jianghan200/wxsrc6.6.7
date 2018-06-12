package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import org.json.JSONObject;

public final class t
  extends a
{
  public static final int CTRL_BYTE = -3;
  public static final String NAME = "getWePkgAuthResult";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiGetWePkgAuthResult", "invoke");
    if (paramd.jJt)
    {
      x.i("MicroMsg.GameJsApiGetWePkgAuthResult", "gettingA8Key");
      paramd.E(paramInt, a.f("getWePkgAuthResult:fail_auth_result_not_return", null));
      return;
    }
    paramJSONObject = paramd.getFullUrl();
    if (bi.oW(paramJSONObject))
    {
      paramd.E(paramInt, a.f("getWePkgAuthResult:fail_full_url_empty", null));
      return;
    }
    HashMap localHashMap = new HashMap();
    if (paramd.jJz) {
      localHashMap.put("set_cookie", Integer.valueOf(1));
    }
    for (;;)
    {
      localHashMap.put("full_url", paramJSONObject);
      paramd.E(paramInt, f("getWePkgAuthResult:ok", localHashMap));
      return;
      localHashMap.put("set_cookie", Integer.valueOf(0));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */