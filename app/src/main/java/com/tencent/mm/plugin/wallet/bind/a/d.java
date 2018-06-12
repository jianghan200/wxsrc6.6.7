package com.tencent.mm.plugin.wallet.bind.a;

import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends i
{
  public d(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("bank_type", paramString1);
    localHashMap.put("bind_serial", paramString2);
    localHashMap.put("passwd", paramString3);
    if (paramBoolean) {
      localHashMap.put("unbind_scene", "1");
    }
    F(localHashMap);
  }
  
  public d(String paramString1, String paramString2, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("bank_type", paramString1);
    localHashMap.put("bind_serial", paramString2);
    localHashMap.put("expired_flag", "1");
    if (paramBoolean) {
      localHashMap.put("unbind_scene", "1");
    }
    F(localHashMap);
  }
  
  public final int If()
  {
    return 473;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject) {}
  
  public final int aBO()
  {
    return 14;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/unbind";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/bind/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */