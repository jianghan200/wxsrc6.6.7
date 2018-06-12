package com.tencent.mm.plugin.wallet_payu.a;

import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.wallet_core.e.a.a
{
  public String bST;
  public boolean mSN;
  public String pET;
  public String pEU;
  
  public a(String paramString1, String paramString2)
  {
    this.pET = paramString1;
    this.bST = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("otp", paramString1);
    localHashMap.put("payu_reference", paramString2);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("MicroMsg.NetScenePayUComfirmOtp", "hy: get NetScenePayUCreateUser info. errCode: %d, errMsg:%s, json:%s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject.toString() });
    this.mSN = paramJSONObject.optBoolean("verified");
    this.pEU = paramJSONObject.optString("payu_reference");
  }
  
  public final int bOo()
  {
    return 4;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */