package com.google.android.gms.analytics.internal;

import com.google.android.gms.c.ah;
import com.google.android.gms.c.aj;

public final class v
  extends o
{
  private final aj aGF = new aj();
  
  v(q paramq)
  {
    super(paramq);
  }
  
  protected final void mE()
  {
    this.aFn.ns().qp().a(this.aGF);
    Object localObject = this.aFn.nv();
    String str = ((l)localObject).nc();
    if (str != null) {
      this.aGF.aEV = str;
    }
    localObject = ((l)localObject).nb();
    if (localObject != null) {
      this.aGF.aEW = ((String)localObject);
    }
  }
  
  public final aj nG()
  {
    np();
    return this.aGF;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/analytics/internal/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */