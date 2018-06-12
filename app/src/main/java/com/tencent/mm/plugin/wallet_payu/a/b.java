package com.tencent.mm.plugin.wallet_payu.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public String bST;
  public boolean pEV;
  public String pEx;
  public String pEy;
  
  public b(String paramString1, String paramString2)
  {
    this.pEx = paramString1;
    this.pEy = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("dial_code", paramString1);
    localHashMap.put("number", paramString2);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("MicroMsg.NetScenePayUGenerateOtp", "hy: get NetScenePayUGenerateOtp info. errCode: %d, errMsg:%s, json:%s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject.toString() });
    this.pEV = paramJSONObject.optBoolean("has_mobile");
    this.bST = paramJSONObject.optString("payu_reference");
  }
  
  public final int bOo()
  {
    return 12;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */