package com.tencent.mm.plugin.appbrand.task;

import com.tencent.mm.plugin.appbrand.ui.AppBrandEmbedUI;
import java.util.Collection;
import java.util.LinkedHashMap;

final class a
  extends f
{
  final long gtc;
  private String gtd;
  
  a(long paramLong)
  {
    super(AppBrandEmbedUI.class, null);
    this.gtc = paramLong;
  }
  
  final void a(String paramString, int paramInt, AppBrandRemoteTaskController paramAppBrandRemoteTaskController)
  {
    if (this.gtS.keySet().isEmpty()) {
      this.gtd = paramString;
    }
    super.a(paramString, paramInt, paramAppBrandRemoteTaskController);
  }
  
  final void vu(String paramString)
  {
    if (this.gtd.equals(paramString))
    {
      this.gtS.clear();
      this.gtT.clear();
      return;
    }
    super.vu(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/task/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */