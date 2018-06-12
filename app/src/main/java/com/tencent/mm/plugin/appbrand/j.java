package com.tencent.mm.plugin.appbrand;

import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.WeakHashMap;

public class j
{
  private static final WeakHashMap<g, j> fdB = new WeakHashMap();
  private static final j fdC = new j.1();
  private final g fdD;
  public volatile String fdE = "";
  
  private j(g paramg)
  {
    this.fdD = paramg;
  }
  
  public static j g(g paramg)
  {
    if ((paramg == null) || (bi.oW(paramg.mAppId))) {
      return fdC;
    }
    synchronized (fdB)
    {
      j localj2 = (j)fdB.get(paramg);
      j localj1 = localj2;
      if (localj2 == null)
      {
        localj1 = new j(paramg);
        fdB.put(paramg, localj1);
      }
      return localj1;
    }
  }
  
  public static j qq(String paramString)
  {
    if (bi.oW(paramString)) {
      return fdC;
    }
    return g(a.pY(paramString));
  }
  
  public AppBrandLaunchReferrer aaD()
  {
    return this.fdD.fct.fqA;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */