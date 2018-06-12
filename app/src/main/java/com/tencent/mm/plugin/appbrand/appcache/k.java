package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class k
{
  public static boolean abE()
  {
    if (!g.Eg().Dx()) {
      return false;
    }
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.Jx().fJ("100310");
    return (localc.isValid()) && (bi.getInt((String)localc.ckq().get("shouldUsePatch"), 0) == 1);
  }
  
  public static boolean abF()
  {
    if (!g.Eg().Dx()) {
      return false;
    }
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.Jx().fJ("100342");
    return (localc.isValid()) && (bi.getInt((String)localc.ckq().get("shouldUsePatch"), 0) == 1);
  }
  
  public static boolean abG()
  {
    if (!g.Eg().Dx()) {
      return false;
    }
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.Jx().fJ("100320");
    return (localc.isValid()) && (bi.getInt((String)localc.ckq().get("isOpenModule"), 0) > 0);
  }
  
  public static boolean abH()
  {
    if (!g.Eg().Dx()) {
      return false;
    }
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.Jx().fJ("100399");
    return (localc.isValid()) && (bi.getInt((String)localc.ckq().get("isUseNewPackageLogic"), 0) > 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */