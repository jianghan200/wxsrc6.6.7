package com.tencent.xweb;

import android.content.Context;
import com.tencent.xweb.c.b.b;

public final class c
{
  private static c vzW;
  static b.b vzX;
  
  private c(Context paramContext)
  {
    if (vzX != null) {
      vzX.init(paramContext);
    }
  }
  
  public static c cIk()
  {
    try
    {
      if (vzW == null) {
        throw new IllegalStateException("CookieSyncManager::createInstance() needs to be called before CookieSyncManager::getInstance()");
      }
    }
    finally {}
    c localc = vzW;
    return localc;
  }
  
  public static c ij(Context paramContext)
  {
    try
    {
      if (vzW == null) {
        vzW = new c(paramContext.getApplicationContext());
      }
      paramContext = vzW;
      return paramContext;
    }
    finally {}
  }
  
  public static void sync()
  {
    if (vzX != null) {
      vzX.sync();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/xweb/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */