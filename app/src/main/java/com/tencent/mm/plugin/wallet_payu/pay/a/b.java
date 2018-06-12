package com.tencent.mm.plugin.wallet_payu.pay.a;

import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public String bOd;
  public String hTI;
  public String pDO;
  public String pDU;
  public String pDV;
  public String pDX;
  public double pFm;
  public String pFn;
  public double pFo;
  public String pFp;
  public boolean pFq;
  public boolean pFr;
  public String pFs;
  public String pFt;
  public String pFu;
  public String pct;
  public String pin;
  public String psA;
  public int timestamp;
  
  public b(String paramString1, double paramDouble, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.bOd = paramString1;
    this.pFm = paramDouble;
    this.pFn = paramString2;
    this.psA = paramString3;
    this.pct = paramString4;
    this.pDO = paramString5;
    this.pin = paramString6;
    HashMap localHashMap = new HashMap();
    localHashMap.put("req_key", paramString1);
    localHashMap.put("total_fee", Math.round(100.0D * paramDouble));
    localHashMap.put("fee_type", paramString2);
    localHashMap.put("bank_type", paramString3);
    localHashMap.put("bind_serial", paramString4);
    if (!paramString3.equals("SVA_PAYU")) {
      localHashMap.put("cvv", paramString5);
    }
    localHashMap.put("pin", paramString6);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject != null)
    {
      this.hTI = paramJSONObject.optString("trans_id");
      this.pFo = (paramJSONObject.optDouble("total_fee") / 100.0D);
      this.pFp = paramJSONObject.optString("fee_type");
      this.pFq = paramJSONObject.optBoolean("redirect");
      this.pDU = paramJSONObject.optString("gateway_reference");
      this.pDV = paramJSONObject.optString("gateway_code");
      this.pFs = paramJSONObject.optString("pay_status");
      this.timestamp = paramJSONObject.optInt("timestamp");
      this.pFt = paramJSONObject.optString("pay_status_name");
      this.pFu = paramJSONObject.optString("bank_type");
      this.pFr = paramJSONObject.optBoolean("is_force_adjust");
      this.pDX = paramJSONObject.optString("force_adjust_code");
    }
  }
  
  public final int bOo()
  {
    return 9;
  }
  
  public final boolean isSuccess()
  {
    return this.pFs.equals("1");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/pay/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */