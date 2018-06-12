package org.xwalk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkUtil
{
  private static final int NON_NETWORK = 0;
  private static final int OTHER = 4;
  private static final int WIFI = 1;
  private static final int _3G = 2;
  private static final int _4G = 3;
  
  public static int getCurrentNetWorkStatus(Context paramContext)
  {
    if (paramContext.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
      return 0;
    }
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext == null) {
      return 0;
    }
    paramContext = paramContext.getActiveNetworkInfo();
    if (paramContext == null) {
      return 0;
    }
    if (!paramContext.isConnected()) {
      return 0;
    }
    if (paramContext.getType() == 1) {
      return 1;
    }
    if (paramContext.getSubtype() >= 13) {
      return 3;
    }
    if ((paramContext.getSubtype() >= 5) && (paramContext.getSubtype() < 13)) {
      return 2;
    }
    return 4;
  }
  
  public static boolean isNetworkAvailable()
  {
    if (Integer.valueOf(getCurrentNetWorkStatus(XWalkEnvironment.getApplicationContext())).intValue() == 0)
    {
      XWalkInitializer.addXWalkInitializeLog("no network");
      return false;
    }
    return true;
  }
  
  public static boolean isWifiAvailable()
  {
    switch (Integer.valueOf(getCurrentNetWorkStatus(XWalkEnvironment.getApplicationContext())).intValue())
    {
    default: 
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/org/xwalk/core/NetworkUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */