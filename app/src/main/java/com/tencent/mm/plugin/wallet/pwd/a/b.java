package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends i
{
  public b(String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("new_passwd", paramString2);
    localHashMap.put("new_rpasswd", paramString2);
    F(localHashMap);
  }
  
  public final int If()
  {
    return 468;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("Micromsg.NetSceneTenpayChangePwd", "errCode " + paramInt + " errMsg: " + paramString);
  }
  
  public final int aBO()
  {
    return 9;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/changepwd";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */