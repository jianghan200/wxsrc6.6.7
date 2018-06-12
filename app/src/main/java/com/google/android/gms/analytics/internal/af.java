package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.c.ah;
import com.google.android.gms.c.al;
import java.util.Locale;

public final class af
  extends o
{
  af(q paramq)
  {
    super(paramq);
  }
  
  protected final void mE() {}
  
  public final al og()
  {
    np();
    DisplayMetrics localDisplayMetrics = this.aFn.ns().mContext.getResources().getDisplayMetrics();
    al localal = new al();
    localal.aYE = k.c(Locale.getDefault());
    localal.aYG = localDisplayMetrics.widthPixels;
    localal.aYH = localDisplayMetrics.heightPixels;
    return localal;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/gms/analytics/internal/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */