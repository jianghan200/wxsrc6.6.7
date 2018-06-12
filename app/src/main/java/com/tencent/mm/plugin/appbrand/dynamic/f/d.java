package com.tencent.mm.plugin.appbrand.dynamic.f;

import android.content.Context;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.u.b.c;
import java.util.HashMap;
import org.json.JSONObject;

public final class d
  extends c
{
  public d()
  {
    super("onNetworkStatusChange");
  }
  
  d(int paramInt)
  {
    super("onNetworkStatusChange", paramInt);
  }
  
  public final JSONObject tR()
  {
    HashMap localHashMap = new HashMap();
    Context localContext = ad.getContext();
    boolean bool = ao.isConnected(localContext);
    localHashMap.put("isConnected", Boolean.valueOf(bool));
    if (!bool) {
      localHashMap.put("networkType", "none");
    }
    for (;;)
    {
      return new JSONObject(localHashMap);
      if (ao.is2G(localContext)) {
        localHashMap.put("networkType", "2g");
      } else if (ao.is3G(localContext)) {
        localHashMap.put("networkType", "3g");
      } else if (ao.is4G(localContext)) {
        localHashMap.put("networkType", "4g");
      } else if (ao.isWifi(localContext)) {
        localHashMap.put("networkType", "wifi");
      } else {
        localHashMap.put("networkType", "unknown");
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */