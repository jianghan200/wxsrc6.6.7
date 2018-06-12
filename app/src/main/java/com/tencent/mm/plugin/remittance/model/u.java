package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class u
  extends i
{
  public String kRs = "";
  public String mxA = null;
  
  public u(String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, int paramInt2)
  {
    this.mxA = paramString3;
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString2);
    localHashMap.put("transaction_id", paramString1);
    localHashMap.put("op", paramString3);
    localHashMap.put("username", paramString4);
    localHashMap.put("invalid_time", String.valueOf(paramInt2));
    localHashMap.put("total_fee", String.valueOf(paramInt1));
    x.i("Micromsg.NetSceneTenpayRemittanceQuery", "trans_id=" + paramString2 + ";transaction_id=" + paramString1 + ";total_fee=" + paramInt1);
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1691;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("Micromsg.NetSceneTenpayRemittanceQuery", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0) {}
    do
    {
      return;
      paramString = paramJSONObject.optJSONObject("real_name_info");
    } while (paramString == null);
    this.kRs = paramString.optString("guide_flag", "0");
  }
  
  public final int aBO()
  {
    return 0;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/transferoperation";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */