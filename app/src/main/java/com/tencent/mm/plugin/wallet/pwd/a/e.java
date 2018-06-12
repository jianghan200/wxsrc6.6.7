package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.wallet_core.c.d;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends i
  implements d
{
  public e(p paramp)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("flag", paramp.flag);
    localHashMap1.put("passwd", paramp.eJn);
    localHashMap1.put("rpasswd", paramp.eJn);
    localHashMap1.put("verify_code", paramp.pqM);
    localHashMap1.put("token", paramp.token);
    a(paramp.mpb, localHashMap1, localHashMap2);
    F(localHashMap1);
    aC(localHashMap2);
  }
  
  public final int If()
  {
    return 478;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject) {}
  
  public final int aBO()
  {
    return 20;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/resetpwd";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */