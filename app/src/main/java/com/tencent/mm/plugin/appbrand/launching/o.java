package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.base.WxaPkgLoadProgress;
import com.tencent.mm.plugin.appbrand.appcache.r;
import com.tencent.mm.sdk.f.e;

public abstract class o
  implements j
{
  public volatile j.c gfQ;
  private volatile j.b gfR;
  final r gfS;
  
  o(r paramr)
  {
    this.gfS = paramr;
  }
  
  public final void a(j.b paramb)
  {
    this.gfR = paramb;
  }
  
  public final void a(j.c paramc)
  {
    this.gfQ = paramc;
  }
  
  public abstract String akH();
  
  final void d(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    j.c localc = this.gfQ;
    if (localc != null) {
      localc.b(paramWxaPkgWrappingInfo);
    }
  }
  
  final void d(WxaPkgLoadProgress paramWxaPkgLoadProgress)
  {
    j.b localb = this.gfR;
    if (localb != null) {
      localb.b(paramWxaPkgLoadProgress);
    }
  }
  
  public abstract void prepare();
  
  public final void prepareAsync()
  {
    e.post(new o.1(this), "AppBrandLaunchPrepareJob#" + akH());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */