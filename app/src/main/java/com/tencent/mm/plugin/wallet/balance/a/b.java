package com.tencent.mm.plugin.wallet.balance.a;

import com.tencent.mm.plugin.wallet_core.model.ab;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.d;
import com.tencent.mm.wallet_core.tenpay.model.i;
import com.tencent.mm.wallet_core.ui.e;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends i
  implements d
{
  public int bIH = 0;
  public String bQa = null;
  public String ced;
  public String cee;
  public String cef;
  public String ceg;
  public String ceh;
  public double mxE = 0.0D;
  public double mxP = 0.0D;
  public String oYA = "";
  public com.tencent.mm.plugin.wallet_core.model.b oYB;
  public com.tencent.mm.plugin.wallet_core.model.b oYC;
  public double oYD;
  public boolean oYz = false;
  
  public b(double paramDouble, String paramString1, String paramString2, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    this.oYD = Math.round(100.0D * paramDouble);
    localHashMap.put("total_fee", e.c(String.valueOf(paramDouble), "100", RoundingMode.HALF_UP).toString());
    localHashMap.put("fee_type", paramString1);
    localHashMap.put("bank_type", paramString2);
    localHashMap.put("operation", String.valueOf(paramInt));
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1503;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("Micromsg.NetSceneTenpayBalanceFetch", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0) {
      return;
    }
    this.bQa = paramJSONObject.optString("req_key");
    this.oYz = "1".equals(paramJSONObject.optString("should_alert"));
    this.oYA = paramJSONObject.optString("alert_msg");
    this.mxE = (paramJSONObject.optDouble("charge_fee", 0.0D) / 100.0D);
    this.mxP = (paramJSONObject.optDouble("total_fee", 0.0D) / 100.0D);
    paramString = paramJSONObject.optJSONObject("first_fetch_info");
    if (paramString != null)
    {
      x.i("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), first_fetch_info is valid");
      this.oYB = ab.a(paramString, false);
      label127:
      paramString = paramJSONObject.optJSONObject("need_charge_fee_info");
      if (paramString == null) {
        break label308;
      }
      x.i("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), need_charge_fee_info is valid");
      this.oYC = ab.a(paramString, false);
    }
    for (;;)
    {
      this.bIH = paramJSONObject.optInt("operation", 0);
      x.i("Micromsg.NetSceneTenpayBalanceFetch", "charge_fee:" + this.mxE + " total_fee:" + this.mxP + " operation:" + this.bIH);
      if (!paramJSONObject.has("real_name_info")) {
        break;
      }
      paramString = paramJSONObject.optJSONObject("real_name_info");
      x.i("Micromsg.NetSceneTenpayBalanceFetch", "get real_name_info %s", new Object[] { paramString.toString() });
      this.ced = paramString.optString("guide_flag");
      this.cee = paramString.optString("guide_wording");
      this.cef = paramString.optString("left_button_wording");
      this.ceg = paramString.optString("right_button_wording");
      this.ceh = paramString.optString("upload_credit_url");
      return;
      x.e("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), first_fetch_info is null");
      break label127;
      label308:
      x.e("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), need_charge_fee_info is null");
    }
  }
  
  public final int aBO()
  {
    return 75;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/genprefetch";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */