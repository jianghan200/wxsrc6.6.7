package com.tencent.mm.plugin.wallet_payu.bind.model;

import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public String bST;
  public String pEe;
  
  public b(String paramString1, String paramString2)
  {
    this.pEe = paramString1;
    this.bST = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("bind_serial", paramString1);
    localHashMap.put("payu_reference", paramString2);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject) {}
  
  public final int bOo()
  {
    return 6;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/bind/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */