package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends a
{
  public String bJg;
  public String bST;
  public double mBj;
  public int pFU;
  public String toUserName;
  
  public d(double paramDouble, String paramString1, String paramString2, int paramInt)
  {
    this.mBj = paramDouble;
    this.bJg = paramString1;
    this.toUserName = paramString2;
    this.pFU = paramInt;
    HashMap localHashMap = new HashMap();
    localHashMap.put("total_fee", Math.round(100.0D * paramDouble));
    localHashMap.put("fee_type", paramString1);
    localHashMap.put("to_customer_name", paramString2);
    localHashMap.put("transfer_type", String.valueOf(paramInt));
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.bST = paramJSONObject.optString("PrepayId");
  }
  
  public final int bOo()
  {
    return 13;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/remittance/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */