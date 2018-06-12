package com.google.android.gms.analytics.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.c.v;
import com.google.android.gms.common.internal.w;

public final class ag
  extends o
{
  boolean aHo;
  boolean aHp;
  private AlarmManager aHq = (AlarmManager)this.aFn.mContext.getSystemService("alarm");
  
  protected ag(q paramq)
  {
    super(paramq);
  }
  
  private PendingIntent oi()
  {
    Intent localIntent = new Intent(this.aFn.mContext, AnalyticsReceiver.class);
    localIntent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
    return PendingIntent.getBroadcast(this.aFn.mContext, 0, localIntent, 0);
  }
  
  public final void cancel()
  {
    np();
    this.aHp = false;
    this.aHq.cancel(oi());
  }
  
  protected final void mE()
  {
    try
    {
      this.aHq.cancel(oi());
      if (ac.nX() > 0L)
      {
        ActivityInfo localActivityInfo = this.aFn.mContext.getPackageManager().getReceiverInfo(new ComponentName(this.aFn.mContext, AnalyticsReceiver.class), 2);
        if ((localActivityInfo != null) && (localActivityInfo.enabled))
        {
          aO("Receiver registered. Using alarm for local dispatch.");
          this.aHo = true;
        }
      }
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
  }
  
  public final void oh()
  {
    np();
    w.d(this.aHo, "Receiver not registered");
    long l1 = ac.nX();
    if (l1 > 0L)
    {
      cancel();
      long l2 = this.aFn.aFC.elapsedRealtime();
      this.aHp = true;
      this.aHq.setInexactRepeating(2, l2 + l1, 0L, oi());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/analytics/internal/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */