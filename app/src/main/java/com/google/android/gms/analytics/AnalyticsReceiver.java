package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.internal.k;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.c.as;
import com.google.android.gms.common.internal.w;

public final class AnalyticsReceiver
  extends BroadcastReceiver
{
  static Object aEv = new Object();
  static as aEw;
  static Boolean aEx;
  
  public static boolean aa(Context paramContext)
  {
    w.ah(paramContext);
    if (aEx != null) {
      return aEx.booleanValue();
    }
    boolean bool = k.a(paramContext, AnalyticsReceiver.class, false);
    aEx = Boolean.valueOf(bool);
    return bool;
  }
  
  public final void onReceive(Context paramContext, Intent arg2)
  {
    localf = q.ac(paramContext).nr();
    ??? = ???.getAction();
    if (com.google.android.gms.common.internal.f.aNr) {
      localf.d("Device AnalyticsReceiver got", ???);
    }
    for (;;)
    {
      boolean bool;
      Intent localIntent;
      if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(???))
      {
        bool = AnalyticsService.ab(paramContext);
        localIntent = new Intent(paramContext, AnalyticsService.class);
        localIntent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
      }
      synchronized (aEv)
      {
        paramContext.startService(localIntent);
        if (!bool)
        {
          return;
          localf.d("Local AnalyticsReceiver got", ???);
          continue;
        }
        try
        {
          if (aEw == null)
          {
            paramContext = new as(paramContext, "Analytics WakeLock", (byte)0);
            aEw = paramContext;
            paramContext.qt();
          }
          aEw.qr();
        }
        catch (SecurityException paramContext)
        {
          for (;;)
          {
            localf.aR("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          }
        }
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/analytics/AnalyticsReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */