package com.tencent.mm.plugin.appbrand;

import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.c;

public abstract interface q
{
  public abstract void a(MiniProgramNavigationBackResult paramMiniProgramNavigationBackResult);
  
  public abstract void a(AppBrandInitConfig paramAppBrandInitConfig, MiniProgramNavigationBackResult paramMiniProgramNavigationBackResult, g paramg);
  
  public abstract void a(g paramg, AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject);
  
  public abstract g aaA();
  
  public abstract int aaB();
  
  public abstract AppBrandRemoteTaskController.c aaC();
  
  public abstract void close();
  
  public abstract g d(g paramg);
  
  public abstract boolean e(g paramg);
  
  public abstract void f(g paramg);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */