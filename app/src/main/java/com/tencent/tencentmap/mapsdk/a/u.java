package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class u
{
  public static boolean a(Context paramContext)
  {
    paramContext = b(paramContext);
    return (paramContext != null) && (paramContext.getType() == 1);
  }
  
  public static NetworkInfo b(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((paramContext != null) && (paramContext.isConnected())) {
      return paramContext;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */