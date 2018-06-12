package com.tencent.mm.plugin.wallet_core.model.a;

import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.d;
import org.json.JSONObject;

public final class a
  extends d
{
  private static a pso = null;
  
  public static a bPP()
  {
    if (pso == null) {
      pso = new a();
    }
    return pso;
  }
  
  public final Bankcard ae(JSONObject paramJSONObject)
  {
    Bankcard localBankcard = super.ae(paramJSONObject);
    localBankcard.field_ext_msg = b.al(paramJSONObject);
    localBankcard.field_bankcardClientType = 1;
    localBankcard.field_desc = paramJSONObject.optString("description");
    localBankcard.field_trueName = paramJSONObject.optString("name_on_card");
    if ("CREDITCARD_PAYU".equals(paramJSONObject.optString("bank_type")))
    {
      localBankcard.field_cardType |= Bankcard.plJ;
      return localBankcard;
    }
    localBankcard.field_cardType |= Bankcard.plL;
    return localBankcard;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */