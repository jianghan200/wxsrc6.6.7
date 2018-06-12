package com.tencent.mm.plugin.appbrand;

import android.support.v4.app.a.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.b;
import com.tencent.mm.plugin.appbrand.ui.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static final Map<String, g> fbM = new HashMap();
  private static Map<String, a.a> fbN = new HashMap();
  private static Map<String, h> fbO = new HashMap();
  
  public static void a(g paramg)
  {
    if (bi.oW(paramg.mAppId))
    {
      x.e("MicroMsg.AppBrandBridge", "clearRuntime with nil appId");
      return;
    }
    for (;;)
    {
      synchronized (fbM)
      {
        g localg = (g)fbM.get(paramg.mAppId);
        if ((localg == null) || (localg == paramg))
        {
          fbM.put(paramg.mAppId, null);
          return;
        }
      }
      x.e("MicroMsg.AppBrandBridge", "clearRuntime with mismatch instance, stack %s", new Object[] { bi.i(new Throwable()) });
    }
  }
  
  public static void a(String paramString, int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (!fbN.containsKey(paramString)) {
      return;
    }
    ((a.a)fbN.remove(paramString)).onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
  }
  
  public static void a(String paramString, a.a parama)
  {
    fbN.put(paramString, parama);
  }
  
  public static void a(String paramString, h paramh)
  {
    fbO.put(paramString, paramh);
  }
  
  public static void b(g paramg)
  {
    if (bi.oW(paramg.mAppId)) {
      x.e("MicroMsg.AppBrandBridge", "setRuntime with nil appId");
    }
    for (;;)
    {
      return;
      synchronized (fbM)
      {
        fbM.put(paramg.mAppId, paramg);
        if (paramg.fct == null) {
          continue;
        }
        b.aL(paramg.mAppId, paramg.fct.bGM);
        return;
      }
    }
  }
  
  public static g pY(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    synchronized (fbM)
    {
      paramString = (g)fbM.get(paramString);
      return paramString;
    }
  }
  
  public static void pZ(String paramString)
  {
    fbN.remove(paramString);
  }
  
  public static AppBrandSysConfig qa(String paramString)
  {
    paramString = pY(paramString);
    if (paramString == null) {
      return null;
    }
    return paramString.fcu;
  }
  
  public static AppBrandStatObject qb(String paramString)
  {
    paramString = pY(paramString);
    if (paramString == null) {
      return null;
    }
    return paramString.fcE;
  }
  
  public static h qc(String paramString)
  {
    return (h)fbO.get(paramString);
  }
  
  public static void qd(String paramString)
  {
    fbO.remove(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */