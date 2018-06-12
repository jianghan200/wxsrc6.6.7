package com.tencent.mm.plugin.wallet_payu.create.a;

import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.wallet_core.e.a.a
{
  public String bST;
  public String pEA;
  public String pEB;
  public String pEx;
  public String pEy;
  public String pEz;
  public String pin;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.pEx = paramString1;
    this.pEy = paramString2;
    this.pin = paramString3;
    this.pEA = paramString4;
    this.pEz = paramString4;
    this.pEB = paramString6;
    HashMap localHashMap = new HashMap();
    localHashMap.put("dial_code", paramString1);
    localHashMap.put("number", paramString2);
    localHashMap.put("pin", paramString3);
    localHashMap.put("secret_question_id", paramString4);
    localHashMap.put("secret_question_answer", paramString5);
    localHashMap.put("payu_reference", paramString6);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("MicroMsg.NetScenePayUCreateUser", "hy: get NetScenePayUCreateUser info. errCode: %d, errMsg:%s, json:%s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject.toString() });
    this.bST = paramJSONObject.optString("payu_reference");
  }
  
  public final int bOo()
  {
    return 5;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/create/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */