package com.tencent.mm.plugin.appbrand.dynamic.b;

import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class e
{
  private static volatile e fvz;
  private Map<String, SoftReference<WxaPkgWrappingInfo>> dmW = new ConcurrentHashMap();
  
  public static boolean a(String paramString, WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramWxaPkgWrappingInfo == null)) {
      return false;
    }
    afh().dmW.put(paramString, new SoftReference(paramWxaPkgWrappingInfo));
    return true;
  }
  
  private static e afh()
  {
    if (fvz == null) {}
    try
    {
      if (fvz == null) {
        fvz = new e();
      }
      return fvz;
    }
    finally {}
  }
  
  public static void removeAll()
  {
    afh().dmW.clear();
  }
  
  public static WxaPkgWrappingInfo sC(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return null;
    }
    paramString = (SoftReference)afh().dmW.get(paramString);
    if (paramString != null) {
      return (WxaPkgWrappingInfo)paramString.get();
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */