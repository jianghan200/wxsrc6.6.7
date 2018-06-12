package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends a
{
  public int bNI;
  public int bWA;
  public double hUL;
  public String lNV;
  private String myq = null;
  public int myr;
  public int pFV;
  public int pFW;
  public int status;
  
  public f(String paramString1, String paramString2, int paramInt)
  {
    this(paramString1, paramString2, paramInt, 0);
  }
  
  public f(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    this.myq = paramString1;
    this.bNI = 1;
    this.bWA = paramInt2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString1);
    localHashMap.put("receiver_name", paramString2);
    localHashMap.put("invalid_time", String.valueOf(paramInt1));
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("MicroMsg.NetScenePayURemittanceQuery", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0) {
      return;
    }
    this.myr = paramJSONObject.optInt("pay_time");
    this.hUL = (paramJSONObject.optDouble("total_fee") / 100.0D);
    this.lNV = paramJSONObject.optString("fee_type");
    this.status = paramJSONObject.optInt("pay_status");
    this.pFV = paramJSONObject.optInt("refund_time");
    this.pFW = paramJSONObject.optInt("receive_time");
  }
  
  public final int bOo()
  {
    return 25;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/remittance/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */