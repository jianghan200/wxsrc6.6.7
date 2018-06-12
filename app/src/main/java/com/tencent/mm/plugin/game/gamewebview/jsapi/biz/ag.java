package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.g.a.qu;
import com.tencent.mm.g.a.qu.a;
import com.tencent.mm.g.a.qu.b;
import com.tencent.mm.plugin.game.gamewebview.a.d;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class ag
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 250;
  public static final int DO_IN_ENV = 2;
  public static final String NAME = "openWeApp";
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    x.i("MicroMsg.GameJsApiOpenWeApp", "invoke");
    paramString = d.ti(paramString);
    if (paramString == null)
    {
      x.e("MicroMsg.GameJsApiOpenWeApp", "data is null");
      parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("openWeApp:fail_null_data", null));
      return;
    }
    qu localqu = new qu();
    localqu.cbq.context = paramContext;
    localqu.cbq.userName = paramString.optString("userName");
    localqu.cbq.appId = paramString.optString("appId");
    localqu.cbq.cbs = paramString.optString("relativeURL");
    localqu.cbq.cbu = paramString.optInt("appVersion", 0);
    localqu.cbq.scene = paramString.optInt("scene", 1018);
    localqu.cbq.bGG = paramString.optString("sceneNote");
    if (bi.oW(localqu.cbq.bGG)) {
      localqu.cbq.bGG = p.encode(bi.oV(paramString.optString("current_url")));
    }
    localqu.cbq.cbv = paramString.optString("downloadURL");
    localqu.cbq.cbt = paramString.optInt("openType", 0);
    localqu.cbq.cbw = paramString.optString("checkSumMd5");
    localqu.cbq.cby = false;
    com.tencent.mm.sdk.b.a.sFg.m(localqu);
    if (localqu.cbr.cbD)
    {
      parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("openWeApp:ok", null));
      return;
    }
    parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("openWeApp:fail:" + bi.oV(localqu.cbr.cbE), null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */