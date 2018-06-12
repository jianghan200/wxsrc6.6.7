package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h
  extends i
{
  public h(p paramp)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("verify_code", paramp.pqM);
    localHashMap1.put("token", paramp.token);
    a(paramp.mpb, localHashMap1, localHashMap2);
    F(localHashMap1);
    aC(localHashMap2);
  }
  
  public final int If()
  {
    return 470;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject) {}
  
  public final int aBO()
  {
    return 11;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/resetpwdverify";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */