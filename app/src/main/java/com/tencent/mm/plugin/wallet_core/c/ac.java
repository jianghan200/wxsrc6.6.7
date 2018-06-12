package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ac
  extends i
{
  public String pjE;
  public String pjt;
  
  public ac(p paramp, String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("verify_code", paramp.pqM);
    localHashMap.put("token", paramp.token);
    localHashMap.put("passwd", paramp.eJn);
    localHashMap.put("relation_key", paramString);
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1604;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if ((paramJSONObject != null) && (paramInt == 0))
    {
      this.pjt = paramJSONObject.optString("token_type");
      this.pjE = paramJSONObject.optString("usertoken");
    }
  }
  
  public final int aBO()
  {
    return 124;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/webankverifysms";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */