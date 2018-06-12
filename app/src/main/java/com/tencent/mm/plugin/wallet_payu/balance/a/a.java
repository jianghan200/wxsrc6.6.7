package com.tencent.mm.plugin.wallet_payu.balance.a;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.wallet_core.e.a.a
{
  public String bJg;
  public String bOd;
  public double mBj;
  
  public a(double paramDouble, String paramString)
  {
    this.mBj = paramDouble;
    this.bJg = paramString;
    HashMap localHashMap = new HashMap();
    localHashMap.put("total_fee", Math.round(100.0D * paramDouble));
    localHashMap.put("fee_type", paramString);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.bOd = paramJSONObject.optString("prepayid");
  }
  
  public final int bOo()
  {
    return 20;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/balance/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */