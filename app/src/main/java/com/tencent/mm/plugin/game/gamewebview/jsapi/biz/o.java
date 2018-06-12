package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class o
  extends a
{
  public static final int CTRL_BYTE = 28;
  public static final String NAME = "getBrandWCPayRequest";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiGetBrandWCPayRequest", "invoke");
    GameWebViewUI localGameWebViewUI = paramd.getPageActivity();
    if (paramJSONObject == null)
    {
      x.i("MicroMsg.GameJsApiGetBrandWCPayRequest", "data is null");
      paramd.E(paramInt, a.f("get_brand_wcpay_request:fail_invalid_data", null));
      return;
    }
    paramJSONObject = new g(paramJSONObject);
    paramd = new o.1(this, paramd, paramInt);
    h.a(localGameWebViewUI, paramJSONObject, hashCode() & 0xFFFF, paramd);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */