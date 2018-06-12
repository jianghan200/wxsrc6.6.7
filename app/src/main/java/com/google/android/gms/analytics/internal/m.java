package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.c.v;

public final class m
  extends o
{
  final w aFJ;
  
  public m(q paramq, r paramr)
  {
    super(paramq);
    com.google.android.gms.common.internal.w.ah(paramr);
    this.aFJ = paramr.c(paramq);
  }
  
  public final long a(s params)
  {
    np();
    com.google.android.gms.common.internal.w.ah(params);
    q.nx();
    long l = this.aFJ.d(params);
    if (l == 0L) {
      this.aFJ.c(params);
    }
    return l;
  }
  
  public final void a(ah paramah)
  {
    np();
    this.aFn.ns().d(new m.4(this, paramah));
  }
  
  public final void c(final c paramc)
  {
    com.google.android.gms.common.internal.w.ah(paramc);
    np();
    e("Hit delivery requested", paramc);
    this.aFn.ns().d(new Runnable()
    {
      public final void run()
      {
        m.this.aFJ.c(paramc);
      }
    });
  }
  
  protected final void mE()
  {
    this.aFJ.nq();
  }
  
  public final void ni()
  {
    np();
    Context localContext = this.aFn.mContext;
    if ((AnalyticsReceiver.aa(localContext)) && (AnalyticsService.ab(localContext)))
    {
      Intent localIntent = new Intent(localContext, AnalyticsService.class);
      localIntent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
      localContext.startService(localIntent);
      return;
    }
    a(null);
  }
  
  public final void nj()
  {
    np();
    com.google.android.gms.c.ah.nx();
    this.aFJ.nj();
  }
  
  final void nk()
  {
    q.nx();
    w localw = this.aFJ;
    q.nx();
    localw.aGO = localw.aFn.aFC.currentTimeMillis();
  }
  
  final void onServiceConnected()
  {
    q.nx();
    this.aFJ.onServiceConnected();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/gms/analytics/internal/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */