package com.tencent.mm.plugin.offline.a;

import android.text.TextUtils;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class i
  extends com.tencent.mm.wallet_core.tenpay.model.i
{
  public String bTi = "";
  public String lJT = "0";
  private String lJU = "0";
  private boolean lJV = false;
  
  public i(Bankcard paramBankcard, String paramString1, String paramString2, int paramInt, String paramString3)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("oper", paramString2);
    if (paramString2.equals("changeto"))
    {
      if (!TextUtils.isEmpty(paramString3)) {
        break label159;
      }
      localHashMap.put("verify_code", "");
    }
    for (;;)
    {
      localHashMap.put("chg_fee", String.valueOf(paramInt));
      localHashMap.put("bind_serialno", paramBankcard.field_bindSerial);
      localHashMap.put("bank_type", paramBankcard.field_bankcardType);
      localHashMap.put("card_tail", paramBankcard.field_bankcardTail);
      this.bTi = paramBankcard.field_mobile;
      F(localHashMap);
      return;
      label159:
      localHashMap.put("verify_code", paramString3);
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject != null)
    {
      this.lJT = paramJSONObject.optString("verify_flag");
      this.lJU = paramJSONObject.optString("limit_fee");
    }
  }
  
  public final int aBO()
  {
    return 50;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/offline/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */