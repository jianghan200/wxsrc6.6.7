package com.tinkerboots.sdk.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class a
{
  private static ConnectivityManager vGk = null;
  
  public static boolean isConnected(Context paramContext)
  {
    if (vGk == null) {
      vGk = (ConnectivityManager)paramContext.getSystemService("connectivity");
    }
    if (vGk == null) {
      return false;
    }
    paramContext = vGk.getActiveNetworkInfo();
    if (paramContext != null) {}
    try
    {
      boolean bool = paramContext.isConnected();
      if (bool) {}
      for (bool = true;; bool = false) {
        return bool;
      }
      return false;
    }
    catch (Exception paramContext) {}
  }
  
  public static boolean isWifi(Context paramContext)
  {
    if (vGk == null) {
      vGk = (ConnectivityManager)paramContext.getSystemService("connectivity");
    }
    if (vGk == null) {
      return false;
    }
    paramContext = vGk.getActiveNetworkInfo();
    return (paramContext != null) && (paramContext.getType() == 1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tinkerboots/sdk/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */