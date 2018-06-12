package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class q
  extends a
{
  public static final int CTRL_INDEX = 58;
  public static final String NAME = "addCard";
  int fFw;
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    Intent localIntent = new Intent();
    MMActivity localMMActivity = c(paraml);
    if (localMMActivity == null)
    {
      paraml.E(paramInt, f("fail", null));
      x.e("MicroMsg.JsApiAddCard", "mmActivity is null, invoke fail!");
      return;
    }
    paramJSONObject = paramJSONObject.optString("cardList");
    if (bi.oW(paramJSONObject))
    {
      paraml.E(paramInt, f("fail", null));
      x.e("MicroMsg.JsApiAddCard", "cardList is null, invoke fail!");
      return;
    }
    this.fFw = paramInt;
    localMMActivity.geJ = new q.1(this, paraml);
    localIntent.putExtra("key_in_card_list", paramJSONObject);
    localIntent.putExtra("key_from_scene", 26);
    paraml = paraml.fdO.fcu;
    if ((paraml != null) && (paraml.frm != null)) {
      localIntent.putExtra("key_from_appbrand_type", paraml.frm.fih);
    }
    d.b(localMMActivity, "card", ".ui.CardAddEntranceUI", localIntent, 1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */