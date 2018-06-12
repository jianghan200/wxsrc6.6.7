package com.tencent.mm.plugin.offline.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends i
{
  public c(String paramString, int paramInt1, int paramInt2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("req_key", paramString);
    localHashMap.put("pay_scene", String.valueOf(paramInt1));
    localHashMap.put("pay_channel", String.valueOf(paramInt2));
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("NetSceneOfflineCancelPay", "onGYNetEnd errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt), paramString });
  }
  
  public final int aBO()
  {
    return 1385;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/offlinecancelpay";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/offline/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */