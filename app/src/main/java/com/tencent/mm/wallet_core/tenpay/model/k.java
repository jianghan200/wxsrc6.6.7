package com.tencent.mm.wallet_core.tenpay.model;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.d;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class k
  extends i
  implements d
{
  public String appId;
  public String bKk;
  public String bOd;
  public int bVU;
  public String fFG;
  public String pCO;
  public int scene;
  public String uYk;
  
  public k(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString2)
  {
    this.scene = paramInt1;
    this.bVU = paramInt3;
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", URLEncoder.encode(paramString1));
    localHashMap.put("scene", String.valueOf(paramInt2));
    localHashMap.put("a8key_scene", String.valueOf(paramInt1));
    localHashMap.put("channel", String.valueOf(paramInt3));
    x.d("MicroMsg.NetSceneTenpayNativeAuthen", "sourceType: %d, source: %s", new Object[] { Integer.valueOf(paramInt4), paramString2 });
    if (paramInt4 < 0)
    {
      x.e("MicroMsg.NetSceneTenpayNativeAuthen", "illegal sourceType: %d, source: %s", new Object[] { Integer.valueOf(paramInt4), paramString2 });
      localHashMap.put("source_type", "0");
      localHashMap.put("source", "");
    }
    for (;;)
    {
      F(localHashMap);
      return;
      localHashMap.put("source_type", String.valueOf(paramInt4));
      localHashMap.put("source", paramString2);
    }
  }
  
  public final int If()
  {
    return 1694;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.NetSceneTenpayNativeAuthen", "errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    x.d("MicroMsg.NetSceneTenpayNativeAuthen", "json: %s", new Object[] { paramJSONObject.toString() });
    this.bOd = paramJSONObject.optString("reqkey");
    this.appId = paramJSONObject.optString("appid");
    this.pCO = paramJSONObject.optString("appsource");
    this.bKk = paramJSONObject.optString("productid");
    this.uYk = paramJSONObject.optString("retcode");
    this.fFG = paramJSONObject.optString("retmsg");
  }
  
  public final int aBO()
  {
    return 127;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/payauthnative";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/wallet_core/tenpay/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */