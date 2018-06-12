package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class i
  extends com.tencent.mm.wallet_core.tenpay.model.i
{
  public i(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString);
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1304;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return super.a(parame, parame1);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject != null) {}
    for (paramJSONObject = paramJSONObject.toString();; paramJSONObject = "null")
    {
      x.v("MicroMsg.NetSceneTouchLockVerifyByPwd", "alvinluo errCode: %d, errMsg: %s, json: %s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject });
      return;
    }
  }
  
  public final int aBO()
  {
    return 0;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/touchlockauthen";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */