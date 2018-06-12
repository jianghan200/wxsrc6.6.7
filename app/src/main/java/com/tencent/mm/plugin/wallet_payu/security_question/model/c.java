package com.tencent.mm.plugin.wallet_payu.security_question.model;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends a
{
  public String bST;
  public String id;
  public String pGj;
  
  public c()
  {
    this("");
  }
  
  public c(String paramString)
  {
    this.bST = paramString;
    HashMap localHashMap = new HashMap();
    localHashMap.put("payu_reference", bi.aG(paramString, ""));
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.id = paramJSONObject.optString("id");
    this.pGj = paramJSONObject.optString("description");
  }
  
  public final int bOo()
  {
    return 23;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/security_question/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */