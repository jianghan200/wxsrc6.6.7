package com.tencent.mm.plugin.appbrand.dynamic;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class d
{
  private static volatile d fuD;
  Map<String, c> fuE = new ConcurrentHashMap();
  
  public static d aeQ()
  {
    if (fuD == null) {}
    try
    {
      if (fuD == null) {
        fuD = new d();
      }
      return fuD;
    }
    finally {}
  }
  
  public final c su(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.DynamicPageViewIPCProxyManager", "get IPCProxy from manager failed, key is null or nil.");
      return null;
    }
    return (c)this.fuE.get(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */