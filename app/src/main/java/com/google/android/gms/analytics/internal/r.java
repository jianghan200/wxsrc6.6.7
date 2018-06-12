package com.google.android.gms.analytics.internal;

import android.content.Context;

public final class r
{
  final Context aGi;
  final Context aGj;
  
  public r(Context paramContext)
  {
    com.google.android.gms.common.internal.w.ah(paramContext);
    paramContext = paramContext.getApplicationContext();
    com.google.android.gms.common.internal.w.j(paramContext, "Application context can't be null");
    this.aGi = paramContext;
    this.aGj = paramContext;
  }
  
  protected static y a(q paramq)
  {
    return new y(paramq);
  }
  
  protected static ac b(q paramq)
  {
    return new ac(paramq);
  }
  
  public static t d(q paramq)
  {
    return new t(paramq);
  }
  
  public static ag e(q paramq)
  {
    return new ag(paramq);
  }
  
  public static i f(q paramq)
  {
    return new i(paramq);
  }
  
  final w c(q paramq)
  {
    return new w(paramq, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/analytics/internal/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */