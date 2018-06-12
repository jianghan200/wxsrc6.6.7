package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.mm.plugin.game.gamewebview.a.d;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.plugin.webview.b.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class p
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 299;
  public static final int DO_IN_ENV = 1;
  public static final String NAME = "getGameData";
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    x.i("MicroMsg.GameJsApiSetGameData", "invoke");
    paramString = d.ti(paramString);
    if (paramString == null)
    {
      x.e("MicroMsg.GameJsApiSetGameData", "data is null");
      parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("getGameData:fail_null_data", null));
      return;
    }
    paramContext = paramString.optString("current_appid");
    if (bi.oW(paramContext))
    {
      x.i("MicroMsg.GameJsApiSetGameData", "appId is null");
      parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("getGameData:fail_appid_null", null));
      return;
    }
    paramString = paramString.optString("key");
    if (bi.oW(paramString))
    {
      x.i("MicroMsg.GameJsApiSetGameData", "key is null");
      parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("getGameData:fail_null_key", null));
      return;
    }
    paramContext = b.bTB().fk(paramContext, paramString);
    if (!bi.oW(paramContext.field_value))
    {
      paramString = new HashMap();
      paramString.put("value", paramContext.field_value);
      paramString.put("weight", paramContext.field_weight);
      paramString.put("expireTime", Long.valueOf(paramContext.field_expireTime - System.currentTimeMillis() / 1000L));
      parama.tp(f("getGameData:ok", paramString));
      return;
    }
    parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("getGameData:ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */