package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends i
{
  public g(String paramString1, String paramString2)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("resetpwd_token", paramString2);
    localHashMap1.put("passwd", paramString1);
    F(localHashMap1);
    aC(localHashMap2);
  }
  
  public final int If()
  {
    return 1371;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("MicroMsg.NetSceneTenpayResetPwdByToken", " json %s", new Object[] { paramJSONObject.toString() });
  }
  
  public final int aBO()
  {
    return 1371;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/resetpwdbytoken";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */