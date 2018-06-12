package com.tencent.mm.plugin.wallet_payu.balance.a;

import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public String bJg;
  public String bOd;
  public String hTI;
  public double mBj;
  public String pDO;
  public String pDP;
  public String pDQ;
  public String pDR;
  public int pDS;
  public boolean pDT;
  public String pDU;
  public String pDV;
  public boolean pDW;
  public String pDX;
  public String pin;
  
  public b(String paramString1, String paramString2, String paramString3, double paramDouble, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this.pin = paramString1;
    this.pDO = paramString2;
    this.bOd = paramString3;
    this.mBj = paramDouble;
    this.bJg = paramString4;
    this.pDP = paramString5;
    this.pDQ = paramString6;
    this.pDR = paramString7;
    HashMap localHashMap = new HashMap();
    localHashMap.put("pin", paramString1);
    localHashMap.put("bind_serial", paramString5);
    localHashMap.put("req_key", paramString3);
    localHashMap.put("fee_type", paramString4);
    localHashMap.put("total_fee", Math.round(100.0D * paramDouble));
    localHashMap.put("bank_type", paramString6);
    localHashMap.put("cvv", paramString2);
    localHashMap.put("dest_bind_serial", paramString7);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.hTI = paramJSONObject.optString("trans_id");
    this.pDS = paramJSONObject.optInt("response_result");
    this.pDT = paramJSONObject.optBoolean("redirect");
    this.pDU = paramJSONObject.optString("gateway_reference");
    this.pDV = paramJSONObject.optString("gateway_code");
    this.pDW = paramJSONObject.optBoolean("is_force_adjust");
    this.pDX = paramJSONObject.optString("force_adjust_code");
  }
  
  public final int bOo()
  {
    return 10;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/balance/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */