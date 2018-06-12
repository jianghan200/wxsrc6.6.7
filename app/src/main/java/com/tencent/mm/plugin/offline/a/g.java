package com.tencent.mm.plugin.offline.a;

import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends h
{
  public g(String paramString1, String paramString2, String paramString3)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("buss_type", paramString1);
    localHashMap.put("method", paramString2);
    if (ao.isWifi(ad.getContext())) {
      paramString1 = "wifi";
    }
    for (;;)
    {
      localHashMap.put("network", paramString1);
      localHashMap.put("transactionid", paramString3);
      F(localHashMap);
      return;
      if (ao.is3G(ad.getContext())) {
        paramString1 = "3g";
      } else if (ao.is2G(ad.getContext())) {
        paramString1 = "2g";
      } else if (ao.isWap(ad.getContext())) {
        paramString1 = "wap";
      } else if (ao.is4G(ad.getContext())) {
        paramString1 = "4g";
      } else {
        paramString1 = "unknown";
      }
    }
  }
  
  public final int If()
  {
    return 1602;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject) {}
  
  public final int aBO()
  {
    return 122;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/datareport";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/offline/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */