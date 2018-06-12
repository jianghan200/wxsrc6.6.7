package com.tencent.mm.plugin.appbrand.dynamic;

import com.tencent.mm.sdk.platformtools.bi;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class k
{
  private static final Map<String, WxaWidgetContext> fuR = new ConcurrentHashMap();
  
  public static boolean a(String paramString, WxaWidgetContext paramWxaWidgetContext)
  {
    if ((bi.oW(paramString)) || (paramWxaWidgetContext == null)) {
      return false;
    }
    fuR.put(paramString, paramWxaWidgetContext);
    return true;
  }
  
  public static WxaWidgetContext sA(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    return (WxaWidgetContext)fuR.get(paramString);
  }
  
  public static WxaWidgetContext sB(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    return (WxaWidgetContext)fuR.remove(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */