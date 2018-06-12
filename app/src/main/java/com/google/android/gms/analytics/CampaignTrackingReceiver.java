package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.k;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.c.as;
import com.google.android.gms.common.internal.w;

public class CampaignTrackingReceiver
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
    boolean bool = k.a(paramContext, CampaignTrackingReceiver.class, true);
    aEx = Boolean.valueOf(bool);
    return bool;
  }
  
  public void aG(String paramString) {}
  
  public Class<? extends CampaignTrackingService> mC()
  {
    return CampaignTrackingService.class;
  }
  
  public void onReceive(Context paramContext, Intent arg2)
  {
    localf = q.ac(paramContext).nr();
    String str = ???.getStringExtra("referrer");
    ??? = ???.getAction();
    localf.d("CampaignTrackingReceiver received", ???);
    if ((!"com.android.vending.INSTALL_REFERRER".equals(???)) || (TextUtils.isEmpty(str)))
    {
      localf.aR("CampaignTrackingReceiver received unexpected intent without referrer extra");
      return;
    }
    boolean bool = CampaignTrackingService.ab(paramContext);
    if (!bool) {
      localf.aR("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
    }
    aG(str);
    if (com.google.android.gms.common.internal.f.aNr)
    {
      localf.aS("Received unexpected installation campaign on package side");
      return;
    }
    ??? = mC();
    w.ah(???);
    Intent localIntent = new Intent(paramContext, ???);
    localIntent.putExtra("referrer", str);
    synchronized (aEv)
    {
      paramContext.startService(localIntent);
      if (!bool) {
        return;
      }
    }
    try
    {
      if (aEw == null)
      {
        paramContext = new as(paramContext, "Analytics campaign WakeLock", (byte)0);
        aEw = paramContext;
        paramContext.qt();
      }
      aEw.qr();
    }
    catch (SecurityException paramContext)
    {
      for (;;)
      {
        localf.aR("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/analytics/CampaignTrackingReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */