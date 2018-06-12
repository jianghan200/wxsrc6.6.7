package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.mm.plugin.game.gamewebview.a.d;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.webview.b.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class at
  extends a
{
  public static final int CTRL_BYTE = 298;
  public static final int DO_IN_ENV = 1;
  public static final String NAME = "setGameData";
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    x.i("MicroMsg.GameJsApiSetGameData", "invoke");
    paramContext = d.ti(paramString);
    if (paramContext == null)
    {
      x.e("MicroMsg.GameJsApiSetGameData", "data is null");
      parama.tp(a.f("setGameData:fail_null_data", null));
      return;
    }
    paramString = paramContext.optString("current_appid");
    if (bi.oW(paramString))
    {
      x.i("MicroMsg.GameJsApiSetGameData", "appId is null");
      parama.tp(a.f("setGameData:fail_appid_null", null));
      return;
    }
    String str1 = paramContext.optString("key");
    String str2 = paramContext.optString("value");
    String str3 = paramContext.optString("weight", "1");
    String str4 = paramContext.optString("expireTime");
    boolean bool = paramContext.optBoolean("autoClean", true);
    if ((bi.oW(str1)) || (bi.oW(str2)))
    {
      x.i("MicroMsg.GameJsApiSetGameData", "key or value is null");
      parama.tp(a.f("setGameData:fail_null_key", null));
      return;
    }
    if (b.bTB().a(paramString, str1, str2, str3, str4, bool))
    {
      parama.tp(a.f("setGameData:ok", null));
      return;
    }
    parama.tp(a.f("setGameData:fail_exceed_size", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */