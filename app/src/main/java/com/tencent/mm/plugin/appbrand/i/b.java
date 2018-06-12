package com.tencent.mm.plugin.appbrand.i;

import com.tencent.mm.a.e;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.launching.RuntimeLoadModuleTask;
import com.tencent.mm.plugin.appbrand.launching.RuntimeLoadModuleTask.1;
import com.tencent.mm.plugin.appbrand.launching.RuntimeLoadModuleTask.a;
import com.tencent.mm.plugin.appbrand.q.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class b
  implements a
{
  final com.tencent.mm.plugin.appbrand.g fdD;
  private final Set<String> gkm = new HashSet();
  final com.tencent.mm.plugin.appbrand.q.g<String, a> gkn = new com.tencent.mm.plugin.appbrand.q.g();
  private final Map<String, Boolean> gko = new HashMap();
  
  public b(com.tencent.mm.plugin.appbrand.g paramg)
  {
    this.fdD = paramg;
  }
  
  private boolean c(String paramString, h<ModulePkgInfo> paramh)
  {
    if (bi.oW(paramString)) {}
    for (Object localObject = this.fdD.fcu.frm;; localObject = uD(paramString))
    {
      paramh.value = localObject;
      if (bi.oW(((ModulePkgInfo)localObject).ffK)) {
        break;
      }
      long l = bi.VF();
      boolean bool = e.cn(((ModulePkgInfo)localObject).ffK);
      x.d("MicroMsg.AppBrand.RuntimeModularizingHelper", "checkModuleLoaded with path(%s), check file cost %d", new Object[] { paramString, Long.valueOf(bi.VF() - l) });
      if (bool) {
        uC(((ModulePkgInfo)localObject).name);
      }
      return bool;
    }
    return false;
  }
  
  private ModulePkgInfo uD(String paramString)
  {
    WxaPkgWrappingInfo localWxaPkgWrappingInfo = this.fdD.fcu.frm;
    if (bi.oW(paramString)) {
      return localWxaPkgWrappingInfo;
    }
    paramString = com.tencent.mm.plugin.appbrand.appcache.a.qC(paramString);
    Iterator localIterator = localWxaPkgWrappingInfo.fil.iterator();
    while (localIterator.hasNext())
    {
      ModulePkgInfo localModulePkgInfo = (ModulePkgInfo)localIterator.next();
      if (paramString.startsWith(localModulePkgInfo.name)) {
        return localModulePkgInfo;
      }
    }
    return localWxaPkgWrappingInfo;
  }
  
  public final void a(String paramString, boolean paramBoolean, a.b arg3, a.a parama)
  {
    if (this.fdD.mFinished)
    {
      x.e("MicroMsg.AppBrand.RuntimeModularizingHelper", "loadModule with path(%s), but runtime(%s) finished", new Object[] { paramString, this.fdD.mAppId });
      ???.a(a.d.gkj);
    }
    for (;;)
    {
      return;
      if (!this.fdD.dti)
      {
        ah.A(new b.1(this, paramString, paramBoolean, ???, parama));
        return;
      }
      h localh = new h();
      if ((c(paramString, localh)) && (??? != null))
      {
        ???.a(a.d.gki);
        return;
      }
      paramString = ((ModulePkgInfo)localh.value).name;
      if (??? != null)
      {
        ??? = new a(???, parama);
        this.gkn.o(paramString, ???);
      }
      synchronized (this.gkm)
      {
        boolean bool = this.gkm.contains(paramString);
        if (!bool) {
          this.gkm.add(paramString);
        }
        if (bool) {
          continue;
        }
        ??? = new h();
        if (paramBoolean) {
          ah.A(new b.2(this, paramString, ???));
        }
        parama = (String)this.fdD.fcu.frm.fim.get(paramString);
        paramString = new b.3(this, this.fdD.mAppId, this.fdD.fcu.frm.fih, this.fdD.fcu.frm.fii, parama, paramString, ???);
        XIPCInvoker.a("com.tencent.mm", paramString.ggL, RuntimeLoadModuleTask.a.class, new RuntimeLoadModuleTask.1(paramString));
        return;
      }
    }
  }
  
  public final boolean alp()
  {
    return true;
  }
  
  public final String uB(String paramString)
  {
    return uD(paramString).name;
  }
  
  final void uC(String paramString)
  {
    if ("__APP__".equals(paramString)) {
      return;
    }
    synchronized (this.gko)
    {
      if (this.gko.containsKey(paramString)) {
        return;
      }
    }
    this.fdD.fcy.qw(paramString);
    this.gko.put(paramString, Boolean.valueOf(true));
    x.i("MicroMsg.AppBrand.RuntimeModularizingHelper", "module (%s) injected", new Object[] { paramString });
  }
  
  private static final class a
  {
    a.b gkx;
    a.a gky;
    
    public a(a.b paramb, a.a parama)
    {
      this.gkx = paramb;
      this.gky = parama;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/i/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */