package com.tencent.mm.plugin.appbrand.report;

import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class b
{
  private static HashMap<String, Integer> gqJ = new HashMap();
  
  public static void aL(String paramString, int paramInt)
  {
    x.d("MicroMsg.AppBrandServiceTypeCache", "addServiceTypeMap appId: %s,serviceType:%d", new Object[] { paramString, Integer.valueOf(paramInt) });
    gqJ.put(paramString, Integer.valueOf(paramInt));
  }
  
  public static int vo(String paramString)
  {
    if (gqJ.containsKey(paramString))
    {
      x.d("MicroMsg.AppBrandServiceTypeCache", "getServiceTypeMap appId: %s");
      return ((Integer)gqJ.get(paramString)).intValue();
    }
    x.d("MicroMsg.AppBrandServiceTypeCache", "getServiceTypeMap default appId: %s");
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */