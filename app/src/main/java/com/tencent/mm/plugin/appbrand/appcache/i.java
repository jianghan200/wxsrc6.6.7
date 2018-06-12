package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.mm.sdk.platformtools.x;

public final class i
{
  public static boolean a(String paramString1, int paramInt1, int paramInt2, String paramString2, aq.a parama)
  {
    return aq.a(new ae(paramString1, paramInt1, paramInt2, paramString2, parama), parama);
  }
  
  static int z(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      int i = WABSPatch.bspatch(paramString1, paramString2, paramString3);
      return i;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.AppBrand.IncrementalPkgLogic[incremental]", "mergeDiffPkg e = %s, old[%s], new[%s], diff[%s]", new Object[] { localException, paramString1, paramString2, paramString3 });
    }
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */