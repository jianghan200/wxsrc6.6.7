package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class p
  extends i
{
  public p(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("wallet_tpa_country", paramString);
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1663;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject) {}
  
  public final int aBO()
  {
    return 1663;
  }
  
  public final int getType()
  {
    return super.getType();
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/setuserwallet";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */