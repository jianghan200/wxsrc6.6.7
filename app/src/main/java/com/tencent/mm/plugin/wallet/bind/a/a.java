package com.tencent.mm.plugin.wallet.bind.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends i
{
  public int pcr;
  public String pcs;
  
  public a(String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("bankcard_type", paramString1);
    localHashMap.put("bind_serial", paramString2);
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1540;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramInt == 0)
    {
      if (paramJSONObject != null)
      {
        this.pcr = paramJSONObject.optInt("unbindbannerlevel", 0);
        this.pcs = paramJSONObject.optString("unbindbannerwording");
      }
    }
    else {
      return;
    }
    x.e("MicroMsg.NetSceneGetUnbindInfo", "json is null");
  }
  
  public final int aBO()
  {
    return 1540;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/unbindbanner";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/bind/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */