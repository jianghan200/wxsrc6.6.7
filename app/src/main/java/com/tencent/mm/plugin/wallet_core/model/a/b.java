package com.tencent.mm.plugin.wallet_core.model.a;

import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public boolean iMA;
  public Bankcard psp;
  public String psq;
  public String psr;
  public boolean pss;
  public int pst;
  
  public b(Bankcard paramBankcard)
  {
    this.psp = paramBankcard;
    try
    {
      paramBankcard = new JSONObject(this.psp.field_ext_msg);
      this.psq = paramBankcard.optString("information");
      this.iMA = paramBankcard.optBoolean("verified");
      this.psr = paramBankcard.optString("card_expiry");
      this.pst = paramBankcard.optInt("cvv_length");
      this.pss = paramBankcard.optBoolean("is_credit");
      return;
    }
    catch (JSONException paramBankcard)
    {
      x.printErrStackTrace("MicroMsg.BankcardPayUWrapper", paramBankcard, "", new Object[0]);
    }
  }
  
  public static String al(JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("cvv_length", paramJSONObject.optInt("cvv_length"));
      localJSONObject.put("information", paramJSONObject.optString("information"));
      localJSONObject.put("verified", paramJSONObject.optBoolean("verified"));
      localJSONObject.put("card_expiry", paramJSONObject.optString("card_expiry"));
      localJSONObject.put("is_credit", paramJSONObject.optString("bank_type").equals("CREDITCARD_PAYU"));
      return localJSONObject.toString();
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.BankcardPayUWrapper", paramJSONObject, "", new Object[0]);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */