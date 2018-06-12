package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.wallet_core.e.a.a
{
  public String bJg;
  public String bOd;
  public String bZR;
  public double mBj;
  public int pDS;
  public int pFR;
  public double pFS;
  public String pFT;
  public String pct;
  public String pin;
  
  public a(String paramString1, String paramString2, double paramDouble, String paramString3, int paramInt, String paramString4, String paramString5, String paramString6)
  {
    this.bOd = paramString1;
    this.pin = paramString2;
    this.mBj = paramDouble;
    this.bJg = paramString3;
    if (paramInt == 2) {}
    for (int i = 0;; i = paramInt)
    {
      this.pFR = i;
      this.bZR = paramString4;
      this.pct = paramString5;
      HashMap localHashMap = new HashMap();
      localHashMap.put("pin", paramString2);
      localHashMap.put("req_key", paramString1);
      localHashMap.put("total_fee", Math.round(100.0D * paramDouble));
      localHashMap.put("fee_type", paramString3);
      localHashMap.put("transfer_type", String.valueOf(paramInt));
      localHashMap.put("target_username", paramString4);
      localHashMap.put("bind_serial", paramString5);
      localHashMap.put("transfer_qrcode_id", paramString6);
      F(localHashMap);
      return;
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.pDS = paramJSONObject.optInt("response_result");
    this.pFS = bi.getDouble(paramJSONObject.optString("total_fee"), 0.0D);
    this.pFT = paramJSONObject.optString("fee_type");
  }
  
  public final int bOo()
  {
    return 14;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/remittance/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */