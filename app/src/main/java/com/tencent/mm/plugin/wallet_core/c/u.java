package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class u
  extends i
{
  public u(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    HashMap localHashMap = new HashMap();
    try
    {
      localHashMap.put("appid", URLEncoder.encode(paramString1, "UTF-8"));
      localHashMap.put("timestamp", URLEncoder.encode(paramString2, "UTF-8"));
      localHashMap.put("noncestr", URLEncoder.encode(paramString3, "UTF-8"));
      localHashMap.put("package", URLEncoder.encode(paramString4, "UTF-8"));
      localHashMap.put("sign", URLEncoder.encode(paramString5, "UTF-8"));
      F(localHashMap);
      x.d("MicroMsg.NetSceneTenpayF2fJsapiCheck", "package: %s, sign: %s", new Object[] { paramString4, paramString5 });
      return;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      x.printErrStackTrace("MicroMsg.NetSceneTenpayF2fJsapiCheck", paramString1, "", new Object[0]);
    }
  }
  
  public final int If()
  {
    return 1973;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("MicroMsg.NetSceneTenpayF2fJsapiCheck", "errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
  }
  
  public final int aBO()
  {
    return 0;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/f2frcvdlistjsapicheck";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */