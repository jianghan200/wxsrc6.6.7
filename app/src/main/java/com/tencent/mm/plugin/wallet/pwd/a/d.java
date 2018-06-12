package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.mm.network.k;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.s;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends i
  implements k
{
  public JSONObject phm;
  
  public d(boolean paramBoolean, String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    x.d("MicroMsg.NetSceneTenpayQueryBasicSecurityInfo", "cpuId: %s, uid: %s", new Object[] { paramString1, paramString2 });
    localHashMap.put("is_root", "0");
    if (paramBoolean) {}
    for (String str = "1";; str = "0")
    {
      localHashMap.put("is_device_open_touch", str);
      localHashMap.put("cpu_id", paramString1);
      localHashMap.put("app_uid", paramString2);
      F(localHashMap);
      return;
    }
  }
  
  public final int If()
  {
    return 1669;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return super.a(parame, parame1);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.NetSceneTenpayQueryBasicSecurityInfo", "alvinluo errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if ((paramInt == 0) && (paramJSONObject != null))
    {
      x.v("MicroMsg.NetSceneTenpayQueryBasicSecurityInfo", "alvinluo json: %s", new Object[] { paramJSONObject.toString() });
      this.phm = paramJSONObject;
      s.cDi().aq(this.phm);
    }
  }
  
  public final int aBO()
  {
    return 0;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/paysecurity";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */