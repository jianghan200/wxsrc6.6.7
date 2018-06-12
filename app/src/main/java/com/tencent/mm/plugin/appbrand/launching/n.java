package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.aq.a;
import com.tencent.mm.plugin.appbrand.appcache.base.WxaPkgLoadProgress;

abstract class n
  implements aq.a
{
  final int fmv;
  
  n(int paramInt)
  {
    this.fmv = paramInt;
  }
  
  abstract String akG();
  
  abstract void c(WxaPkgWrappingInfo paramWxaPkgWrappingInfo);
  
  protected void c(WxaPkgLoadProgress paramWxaPkgLoadProgress) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */