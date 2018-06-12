package com.tencent.mm.plugin.wallet_payu.create.a;

import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public String bST;
  public String cbJ;
  public String pEx;
  public String pin;
  
  public b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.pEx = paramString1;
    this.cbJ = paramString2;
    this.pin = paramString3;
    this.bST = paramString4;
    HashMap localHashMap = new HashMap();
    localHashMap.put("dial_code", paramString1);
    localHashMap.put("number", paramString2);
    localHashMap.put("pin", paramString3);
    localHashMap.put("payu_reference", paramString4);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject) {}
  
  public final int bOo()
  {
    return 17;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/create/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */