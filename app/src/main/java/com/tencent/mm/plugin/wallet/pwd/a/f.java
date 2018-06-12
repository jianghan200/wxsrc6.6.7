package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends i
{
  private Map<String, String> lKr = new HashMap();
  public String token = null;
  
  public f(Authen paramAuthen, boolean paramBoolean, int paramInt)
  {
    this.lKr.put("flag", paramAuthen.bWA);
    if (!bi.oW(paramAuthen.plr))
    {
      this.lKr.put("first_name", paramAuthen.plr);
      this.lKr.put("last_name", paramAuthen.pls);
      this.lKr.put("country", paramAuthen.country);
      this.lKr.put("area", paramAuthen.csK);
      this.lKr.put("city", paramAuthen.csL);
      this.lKr.put("address", paramAuthen.dRH);
      this.lKr.put("phone_number", paramAuthen.knG);
      this.lKr.put("zip_code", paramAuthen.eXM);
      this.lKr.put("email", paramAuthen.csD);
    }
    this.lKr.put("business_source", String.valueOf(paramInt));
    this.lKr.put("bank_type", paramAuthen.lMV);
    if (paramAuthen.pll > 0) {
      this.lKr.put("cre_type", paramAuthen.pll);
    }
    if (!bi.oW(paramAuthen.plj)) {
      this.lKr.put("true_name", paramAuthen.plj);
    }
    if (!bi.oW(paramAuthen.plk)) {
      this.lKr.put("identify_card", paramAuthen.plk);
    }
    this.lKr.put("mobile_no", paramAuthen.pjw);
    this.lKr.put("bank_card_id", paramAuthen.plm);
    if (!bi.oW(paramAuthen.pln)) {
      this.lKr.put("cvv2", paramAuthen.pln);
    }
    if (!bi.oW(paramAuthen.plo)) {
      this.lKr.put("valid_thru", paramAuthen.plo);
    }
    Map localMap = this.lKr;
    if (paramBoolean) {}
    for (paramAuthen = "1";; paramAuthen = "0")
    {
      localMap.put("new_card_reset_pwd", paramAuthen);
      F(this.lKr);
      return;
    }
  }
  
  public final int If()
  {
    return 469;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject != null) {
      this.token = paramJSONObject.optString("token");
    }
  }
  
  public final int aBO()
  {
    return 10;
  }
  
  public final boolean bkT()
  {
    super.bkT();
    this.lKr.put("is_repeat_send", "1");
    F(this.lKr);
    return true;
  }
  
  public final String blM()
  {
    return this.token;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/resetpwdauthen";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */