package com.tencent.mm.plugin.appbrand.dynamic;

import android.os.Parcelable;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetRuntimeConfig;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetSysConfig;

public abstract interface WxaWidgetContext
  extends Parcelable
{
  public abstract WxaPkgWrappingInfo aeW();
  
  public abstract WxaPkgWrappingInfo aeX();
  
  public abstract int aeY();
  
  public abstract int aeZ();
  
  public abstract byte[] afa();
  
  public abstract int afb();
  
  public abstract DebuggerInfo afc();
  
  public abstract WidgetSysConfig afd();
  
  public abstract WidgetRuntimeConfig afe();
  
  public abstract String getAppId();
  
  public abstract String getId();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/WxaWidgetContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */