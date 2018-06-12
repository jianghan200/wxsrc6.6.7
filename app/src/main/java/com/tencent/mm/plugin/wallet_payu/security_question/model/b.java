package com.tencent.mm.plugin.wallet_payu.security_question.model;

import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public String bST;
  public boolean iMA;
  public String id;
  public String kQE;
  public String pGi;
  
  public b(String paramString1, String paramString2, String paramString3)
  {
    this.id = paramString2;
    this.kQE = paramString3;
    this.bST = paramString1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("id", paramString2);
    localHashMap.put("answer", paramString3);
    localHashMap.put("payu_reference", paramString1);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.iMA = paramJSONObject.optBoolean("verified");
    this.pGi = paramJSONObject.optString("payu_reference");
  }
  
  public final int bOo()
  {
    return 18;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/security_question/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */