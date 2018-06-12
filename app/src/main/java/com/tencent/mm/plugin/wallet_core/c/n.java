package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.plugin.wallet_core.model.Orders.Promotions;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class n
  extends i
{
  public String hKX;
  public String pjp;
  public String pjq;
  public Orders.Promotions pjs;
  
  public n(Orders.Promotions paramPromotions, String paramString1, String paramString2, long paramLong)
  {
    this.pjs = paramPromotions;
    HashMap localHashMap = new HashMap();
    localHashMap.put("activity_id", paramPromotions.pji);
    localHashMap.put("award_id", paramPromotions.ppU);
    localHashMap.put("send_record_id", paramPromotions.poD);
    localHashMap.put("user_record_id", paramPromotions.poE);
    localHashMap.put("req_key", paramString1);
    localHashMap.put("transaction_id", paramString2);
    localHashMap.put("activity_mch_id", String.valueOf(paramLong));
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1589;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.NetSenceTenPayBase", "onGYNetEnd, errCode: %s, errMsg: %s, json: %s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject });
    if ((paramJSONObject != null) && (paramInt == 0))
    {
      this.pjp = paramJSONObject.optString("result_code");
      this.hKX = paramJSONObject.optString("result_msg");
      this.pjq = paramJSONObject.optString("alert_wording");
    }
  }
  
  public final int aBO()
  {
    return 1589;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/sendpayaward";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */