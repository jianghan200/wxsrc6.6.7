package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class y
  extends i
{
  public y(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString1);
    localHashMap.put("receiver_name", paramString2);
    localHashMap.put("from", String.valueOf(paramInt2));
    localHashMap.put("invalid_time", String.valueOf(paramInt1));
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1545;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("Micromsg.NetSceneTenpayRemittanceResendMsg", "errCode " + paramInt + " errMsg: " + paramString);
  }
  
  public final int aBO()
  {
    return 0;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/transferresendmsg";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */