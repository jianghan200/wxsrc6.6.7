package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.content.ContextWrapper;
import android.content.Intent;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;

public final class f
  extends ContextWrapper
  implements h
{
  public f(AppBrandLaunchProxyUI paramAppBrandLaunchProxyUI)
  {
    super(paramAppBrandLaunchProxyUI);
  }
  
  public final void onPause() {}
  
  public final void onResume() {}
  
  public final void w(Intent paramIntent)
  {
    paramIntent = e.up(paramIntent.getStringExtra("extra_entry_token"));
    if (paramIntent == null)
    {
      ((AppBrandLaunchProxyUI)super.getBaseContext()).finish();
      return;
    }
    paramIntent.setBaseContext((AppBrandLaunchProxyUI)super.getBaseContext());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/precondition/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */