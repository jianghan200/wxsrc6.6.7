package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.mm.plugin.game.gamewebview.a.d;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.webview.b.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONObject;

public final class l
  extends a
{
  public static final int CTRL_BYTE = 300;
  public static final int DO_IN_ENV = 1;
  public static final String NAME = "clearGameData";
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    x.i("MicroMsg.GameJsApiSetGameData", "invoke");
    paramContext = d.ti(paramString);
    if (paramContext == null)
    {
      x.e("MicroMsg.GameJsApiSetGameData", "data is null");
      parama.tp(a.f("clearGameData:fail_null_data", null));
      return;
    }
    paramString = paramContext.optString("current_appid");
    if (bi.oW(paramString))
    {
      x.i("MicroMsg.GameJsApiSetGameData", "appId is null");
      parama.tp(a.f("clearGameData:fail_appid_null", null));
      return;
    }
    JSONArray localJSONArray = paramContext.optJSONArray("keys");
    boolean bool = paramContext.optBoolean("clearAllData", false);
    if ((localJSONArray != null) && (localJSONArray.length() > 0))
    {
      b.bTB().b(paramString, localJSONArray);
      parama.tp(a.f("clearGameData:ok", null));
      return;
    }
    if (bool)
    {
      b.bTB().Qc(paramString);
      parama.tp(a.f("clearGameData:ok", null));
      return;
    }
    x.i("MicroMsg.GameJsApiSetGameData", "keys is null");
    parama.tp(a.f("clearGameData:fail", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */