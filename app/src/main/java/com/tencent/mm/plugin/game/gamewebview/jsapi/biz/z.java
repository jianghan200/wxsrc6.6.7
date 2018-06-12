package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class z
  extends a
{
  public static final int CTRL_BYTE = 277;
  public static final int DO_IN_ENV = 2;
  public static final String NAME = "launchMiniProgram";
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    int j = 1;
    x.i("MicroMsg.GameJsApiLaunchMiniProgram", "invoke");
    JSONObject localJSONObject = com.tencent.mm.plugin.game.gamewebview.a.d.ti(paramString);
    if (localJSONObject == null)
    {
      x.e("MicroMsg.GameJsApiLaunchMiniProgram", "data is null");
      parama.tp(a.f(a.f("launchMiniProgram:fail_null_data", null), null));
      return;
    }
    String str2 = localJSONObject.optString("targetAppId");
    String str3 = localJSONObject.optString("current_url");
    String str1 = localJSONObject.optString("current_appid");
    paramString = str1;
    if (bi.oW(str1)) {
      paramString = localJSONObject.optString("referrerAppId");
    }
    if (bi.oW(str2))
    {
      parama.tp(a.f("launchMiniProgram:fail_invalid_targetAppId", null));
      return;
    }
    if (bi.oW(paramString))
    {
      parama.tp(a.f("launchMiniProgram:fail_invalid_referrerAppId", null));
      return;
    }
    str1 = bi.oV(localJSONObject.optString("envVersion"));
    int i = -1;
    switch (str1.hashCode())
    {
    default: 
      switch (i)
      {
      }
      break;
    }
    for (j = 0;; j = 2)
    {
      str1 = localJSONObject.optString("path");
      ((com.tencent.mm.plugin.appbrand.n.d)g.l(com.tencent.mm.plugin.appbrand.n.d.class)).a(paramContext, str3, paramString, str2, j, str1);
      parama.tp(a.f("launchMiniProgram:ok", null));
      return;
      if (!str1.equals("develop")) {
        break;
      }
      i = 0;
      break;
      if (!str1.equals("trial")) {
        break;
      }
      i = 1;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */