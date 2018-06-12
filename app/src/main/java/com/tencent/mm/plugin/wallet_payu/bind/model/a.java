package com.tencent.mm.plugin.wallet_payu.bind.model;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.wallet_core.e.a.a
{
  public String cea;
  public String description;
  public String pDO;
  public String pDY;
  public String pDZ;
  public String pEa;
  public String pin;
  public String psq;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    this.pDY = paramString1;
    this.psq = paramString2;
    this.cea = paramString3;
    this.pDZ = paramString4;
    this.pEa = paramString5;
    this.description = paramString6;
    this.pDO = paramString7;
    this.pin = paramString8;
    HashMap localHashMap = new HashMap();
    localHashMap.put("bank_type", paramString1);
    localHashMap.put("information", paramString2);
    localHashMap.put("name_on_card", paramString3);
    localHashMap.put("card_number", paramString4);
    localHashMap.put("card_expiry", paramString5);
    localHashMap.put("description", paramString6);
    localHashMap.put("cvv", paramString7);
    localHashMap.put("pin", paramString8);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject) {}
  
  public final int bOo()
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/bind/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */