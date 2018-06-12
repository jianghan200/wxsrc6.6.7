package com.tencent.mm.plugin.appbrand.jsapi.i;

import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public enum a
  implements b
{
  private a() {}
  
  public final void a(MMActivity paramMMActivity, JSONObject paramJSONObject, b.b paramb)
  {
    paramb = new a.5(this, paramb);
    paramJSONObject = new g(paramJSONObject);
    Intent localIntent = new Intent();
    localIntent.putExtra("appId", paramJSONObject.appId);
    localIntent.putExtra("timeStamp", paramJSONObject.timeStamp);
    localIntent.putExtra("nonceStr", paramJSONObject.nonceStr);
    localIntent.putExtra("packageExt", paramJSONObject.packageExt);
    localIntent.putExtra("signtype", paramJSONObject.signType);
    localIntent.putExtra("paySignature", paramJSONObject.bVW);
    localIntent.putExtra("url", paramJSONObject.url);
    localIntent.putExtra("scene", 1);
    paramMMActivity.geJ = paramb;
    d.a(paramMMActivity, "wallet_core", ".ui.WalletCheckPwdUI", localIntent, 0xFFFF & hashCode(), false);
  }
  
  public final boolean a(MMActivity paramMMActivity, AppBrandStatObject paramAppBrandStatObject, JSONObject paramJSONObject, b.a parama, PString paramPString)
  {
    paramJSONObject = new g(paramJSONObject);
    if (paramAppBrandStatObject != null)
    {
      paramJSONObject.bJY = g.eD(paramAppBrandStatObject.scene, paramAppBrandStatObject.cbA);
      paramJSONObject.qUV = g.eC(paramAppBrandStatObject.scene, paramAppBrandStatObject.cbA);
    }
    paramJSONObject.bVY = 46;
    paramPString.value = paramJSONObject.packageExt;
    paramAppBrandStatObject = new a.1(this, parama);
    return h.a(paramMMActivity, paramJSONObject, hashCode() & 0xFFFF, paramAppBrandStatObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */