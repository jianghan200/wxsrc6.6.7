package com.google.android.gms.analytics.internal;

public abstract class o
  extends n
{
  private boolean aFQ;
  private boolean aFR;
  
  protected o(q paramq)
  {
    super(paramq);
  }
  
  public final boolean isInitialized()
  {
    return (this.aFQ) && (!this.aFR);
  }
  
  protected abstract void mE();
  
  protected final void np()
  {
    if (!isInitialized()) {
      throw new IllegalStateException("Not initialized");
    }
  }
  
  public final void nq()
  {
    mE();
    this.aFQ = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/analytics/internal/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */