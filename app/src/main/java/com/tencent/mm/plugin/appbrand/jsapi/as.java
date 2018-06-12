package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class as
  extends a
{
  public static final int CTRL_INDEX = 403;
  public static final String NAME = "openOfflinePayView";
  private int fFw;
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    MMActivity localMMActivity = c(paraml);
    if (localMMActivity == null)
    {
      paraml.E(paramInt, f("fail", null));
      x.e("MicroMsg.JsApiOpenOfflinePayView", "mmActivity is null, invoke fail!");
      return;
    }
    localMMActivity.geJ = new as.1(this, paraml, paramInt);
    this.fFw = paramInt;
    x.d("MicroMsg.JsApiOpenOfflinePayView", "json: %s", new Object[] { paramJSONObject.toString() });
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.qa(paraml.mAppId);
    if (localAppBrandSysConfig == null)
    {
      paraml.E(paramInt, f("fail", null));
      x.e("MicroMsg.JsApiOpenOfflinePayView", "sysConfig is null, invoke fail!");
      return;
    }
    Object localObject = com.tencent.mm.plugin.appbrand.a.pY(paraml.mAppId);
    if (localObject == null)
    {
      paraml.E(paramInt, f("fail", null));
      x.e("MicroMsg.JsApiOpenOfflinePayView", "runtime is null, invoke fail!");
      return;
    }
    localObject = ((g)localObject).fcz.getCurrentUrl();
    Intent localIntent = new Intent();
    localIntent.putExtra("appId", paraml.mAppId);
    localIntent.putExtra("timeStamp", paramJSONObject.optString("timeStamp"));
    localIntent.putExtra("nonceStr", paramJSONObject.optString("nonceStr"));
    localIntent.putExtra("packageExt", paramJSONObject.optString("package"));
    localIntent.putExtra("signtype", paramJSONObject.optString("signType"));
    localIntent.putExtra("paySignature", paramJSONObject.optString("paySign"));
    localIntent.putExtra("wxapp_username", localAppBrandSysConfig.bKC);
    localIntent.putExtra("wxapp_path", (String)localObject);
    paramInt = hashCode();
    localIntent.putExtra("key_from_scene", 7);
    d.b(localMMActivity, "offline", ".ui.WalletOfflineEntranceUI", localIntent, paramInt & 0xFFFF);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */