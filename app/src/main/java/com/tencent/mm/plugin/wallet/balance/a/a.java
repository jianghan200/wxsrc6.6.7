package com.tencent.mm.plugin.wallet.balance.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends i
{
  public String bQa = null;
  
  public a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("flag", String.valueOf(paramInt1));
    localHashMap.put("passwd", paramString1);
    localHashMap.put("req_key", paramString3);
    localHashMap.put("verify_code", paramString2);
    localHashMap.put("pay_scene", String.valueOf(paramInt2));
    F(localHashMap);
    paramString1 = new HashMap();
    if (p.cDb())
    {
      paramString1.put("uuid_for_bindcard", p.cDd());
      paramString1.put("bindcard_scene", p.cDc());
    }
    aC(paramString1);
  }
  
  public final int If()
  {
    return 1506;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("Micromsg.NetSceneTenpayBalanceSave", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0) {
      return;
    }
    this.bQa = paramJSONObject.optString("req_key");
  }
  
  public final int aBO()
  {
    return 76;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/verifybind";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */