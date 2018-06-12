package com.tencent.mm.plugin.wallet_payu.pwd.a;

import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends a
{
  public String bST;
  public String pFN;
  public String pFO;
  
  public d(String paramString1, String paramString2)
  {
    this.pFN = paramString1;
    this.pFO = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("payu_reference", paramString1);
    localHashMap.put("new_pin", paramString2);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.bST = paramJSONObject.optString("payu_reference");
  }
  
  public final int bOo()
  {
    return 19;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/pwd/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */