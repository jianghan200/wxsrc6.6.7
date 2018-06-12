package com.tencent.mm.plugin.appbrand.jsapi.i;

import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class f
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 149;
  public static final String NAME = "requestPaymentToBank";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    MMActivity localMMActivity = c(paraml);
    if (localMMActivity == null)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    try
    {
      paramJSONObject.put("appId", paraml.mAppId);
      a locala = a.fWH;
      Object localObject = paraml.fdO.fcE;
      f.1 local1 = new f.1(this, paraml, paramInt);
      paraml = new com.tencent.mm.pluginsdk.wallet.g(paramJSONObject);
      if (localObject != null)
      {
        paraml.bJY = com.tencent.mm.pluginsdk.wallet.g.eD(((AppBrandStatObject)localObject).scene, ((AppBrandStatObject)localObject).cbA);
        paraml.qUV = com.tencent.mm.pluginsdk.wallet.g.eC(((AppBrandStatObject)localObject).scene, ((AppBrandStatObject)localObject).cbA);
      }
      paraml.bVY = 46;
      paramJSONObject = new a.2(locala, local1);
      localObject = new Intent();
      ((Intent)localObject).putExtra("appId", paraml.appId);
      ((Intent)localObject).putExtra("timeStamp", paraml.timeStamp);
      ((Intent)localObject).putExtra("nonceStr", paraml.nonceStr);
      ((Intent)localObject).putExtra("packageExt", paraml.packageExt);
      ((Intent)localObject).putExtra("signtype", paraml.signType);
      ((Intent)localObject).putExtra("paySignature", paraml.bVW);
      ((Intent)localObject).putExtra("url", paraml.url);
      ((Intent)localObject).putExtra("pay_scene", paraml.bVZ);
      localMMActivity.geJ = paramJSONObject;
      d.a(localMMActivity, "wallet", ".pay.ui.WalletLoanRepaymentUI", (Intent)localObject, locala.hashCode() & 0xFFFF, false);
      return;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.JsApiRequestPaymentToBank", paramJSONObject.getMessage());
      paraml.E(paramInt, f("fail", null));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/i/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */