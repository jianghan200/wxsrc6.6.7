package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends i
{
  public a(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString);
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1321;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.NetSceneCloseWalletLock", "alvinluo close wallet lock errCode: %d, errMsg: %s, json: %s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject });
  }
  
  public final int aBO()
  {
    return 0;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/closewalletlock";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */