package com.tencent.mm.plugin.wallet.balance.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.d;
import com.tencent.mm.wallet_core.tenpay.model.ITenpaySave;
import com.tencent.mm.wallet_core.tenpay.model.ITenpaySave.RetryPayInfo;
import com.tencent.mm.wallet_core.tenpay.model.i;
import com.tencent.mm.wallet_core.ui.e;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends i
  implements d, ITenpaySave
{
  public String bQa = null;
  public String ced;
  public String cee;
  public String cef;
  public String ceg;
  public String ceh;
  public String oYA = "";
  public double oYD;
  private ITenpaySave.RetryPayInfo oYE;
  public boolean oYz = false;
  
  public c(double paramDouble, String paramString1, String paramString2, String paramString3)
  {
    HashMap localHashMap = new HashMap();
    this.oYD = Math.round(100.0D * paramDouble);
    localHashMap.put("total_fee", e.c(String.valueOf(paramDouble), "100", RoundingMode.HALF_UP).toString());
    localHashMap.put("fee_type", paramString1);
    localHashMap.put("bind_serial", paramString2);
    localHashMap.put("bank_type", paramString3);
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1502;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("Micromsg.NetSceneTenpayBalanceSave", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0) {
      return;
    }
    this.bQa = paramJSONObject.optString("req_key");
    this.oYz = "1".equals(paramJSONObject.optString("should_alert"));
    this.oYA = paramJSONObject.optString("alert_msg");
    if (paramJSONObject.has("real_name_info"))
    {
      paramString = paramJSONObject.optJSONObject("real_name_info");
      x.i("Micromsg.NetSceneTenpayBalanceSave", "get real_name_info %s", new Object[] { paramString.toString() });
      this.ced = paramString.optString("guide_flag");
      this.cee = paramString.optString("guide_wording");
      this.cef = paramString.optString("left_button_wording");
      this.ceg = paramString.optString("right_button_wording");
      this.ceh = paramString.optString("upload_credit_url");
    }
    this.oYE = new ITenpaySave.RetryPayInfo();
    this.oYE.ag(paramJSONObject);
  }
  
  public final int aBO()
  {
    return 74;
  }
  
  public final ITenpaySave.RetryPayInfo bMO()
  {
    return this.oYE;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/genpresave";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */