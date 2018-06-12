package com.tencent.mm.plugin.appbrand.jsapi.i;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends a
{
  public static final int CTRL_INDEX = 285;
  public static final String NAME = "requestVirtualPayment";
  boolean fWQ = false;
  
  public final void a(final l paraml, JSONObject paramJSONObject, final int paramInt)
  {
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    MMActivity localMMActivity = c(paraml);
    if (localMMActivity == null)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    if (this.fWQ)
    {
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(2));
      x.e("MicroMsg.JsApiRequestVirtualPayment", "errCode: %d, errMsg: an order is being paid", new Object[] { Integer.valueOf(2) });
      paraml.E(paramInt, f("fail an order is being paid", paramJSONObject));
      return;
    }
    this.fWQ = true;
    MMActivity.a local1 = new MMActivity.a()
    {
      public final void b(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        if (paramAnonymousInt1 != (g.this.hashCode() & 0xFFFF)) {
          return;
        }
        g.this.fWQ = false;
        if (paramAnonymousInt2 == -1)
        {
          paramAnonymousInt1 = paramAnonymousIntent.getIntExtra("key_err_code", 1);
          if (paramAnonymousInt1 == 0)
          {
            x.e("MicroMsg.JsApiRequestVirtualPayment", "requestIAP ok");
            paraml.E(paramInt, g.this.f("ok", null));
            return;
          }
          HashMap localHashMap = new HashMap();
          paramAnonymousIntent = bi.oV(paramAnonymousIntent.getStringExtra("key_err_msg"));
          localHashMap.put("errCode", Integer.valueOf(paramAnonymousInt1));
          x.e("MicroMsg.JsApiRequestVirtualPayment", "requestVirtualPayment errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramAnonymousInt1), paramAnonymousIntent });
          paraml.E(paramInt, g.this.f("fail " + paramAnonymousIntent, localHashMap));
          return;
        }
        paraml.E(paramInt, g.this.f("cancel", null));
      }
    };
    Object localObject = new Bundle();
    ((Bundle)localObject).putInt("scene", 0);
    p localp = d(paraml);
    if (localp != null) {
      localp.a(2, (Bundle)localObject, new Object[0]);
    }
    for (;;)
    {
      localObject = new Intent();
      x.i("MicroMsg.JsApiRequestVirtualPayment", "iap payment start ... data : " + paramJSONObject);
      ((Intent)localObject).putExtra("key_appid", paraml.mAppId);
      ((Intent)localObject).putExtra("key_product_id", paramJSONObject.optString("priceLevel"));
      ((Intent)localObject).putExtra("key_price", paramJSONObject.optString("priceLevel"));
      ((Intent)localObject).putExtra("key_currency_type", paramJSONObject.optString("currencyType", "CNY"));
      ((Intent)localObject).putExtra("key_desc", paramJSONObject.optString("desc"));
      ((Intent)localObject).putExtra("key_count", paramJSONObject.optInt("count", 1));
      ((Intent)localObject).putExtra("key_is_mini_program", true);
      ((Intent)localObject).putExtra("key_busiid", paramJSONObject.optString("outTradeNo"));
      ((Intent)localObject).putExtra("key_virtual_pay_sign", paramJSONObject.optString("virtualPaySign"));
      ((Intent)localObject).putExtra("key_attach", paramJSONObject.optString("attach"));
      localMMActivity.geJ = local1;
      d.b(localMMActivity, "wallet_index", ".ui.WalletIapUI", (Intent)localObject, hashCode() & 0xFFFF);
      return;
      x.e("MicroMsg.JsApiRequestVirtualPayment", "hy: associated page view is null!!");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/i/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */