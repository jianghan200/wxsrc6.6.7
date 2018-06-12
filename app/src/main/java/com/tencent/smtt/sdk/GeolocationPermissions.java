package com.tencent.smtt.sdk;

import java.util.Set;

public class GeolocationPermissions
{
  private static GeolocationPermissions a;
  
  private static GeolocationPermissions a()
  {
    try
    {
      if (a == null) {
        a = new GeolocationPermissions();
      }
      GeolocationPermissions localGeolocationPermissions = a;
      return localGeolocationPermissions;
    }
    finally {}
  }
  
  public static GeolocationPermissions getInstance()
  {
    return a();
  }
  
  public void allow(String paramString)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().g(paramString);
      return;
    }
    android.webkit.GeolocationPermissions.getInstance().allow(paramString);
  }
  
  public void clear(String paramString)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().f(paramString);
      return;
    }
    android.webkit.GeolocationPermissions.getInstance().clear(paramString);
  }
  
  public void clearAll()
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().o();
      return;
    }
    android.webkit.GeolocationPermissions.getInstance().clearAll();
  }
  
  public void getAllowed(String paramString, ValueCallback<Boolean> paramValueCallback)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().c(paramString, paramValueCallback);
      return;
    }
    android.webkit.GeolocationPermissions.getInstance().getAllowed(paramString, paramValueCallback);
  }
  
  public void getOrigins(ValueCallback<Set<String>> paramValueCallback)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().b(paramValueCallback);
      return;
    }
    android.webkit.GeolocationPermissions.getInstance().getOrigins(paramValueCallback);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/smtt/sdk/GeolocationPermissions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */