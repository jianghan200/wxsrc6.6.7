package com.tencent.mm.vending.h;

import android.os.Handler;
import android.os.Looper;

public final class h
  extends d
{
  Looper mLooper;
  public String mType;
  public a uRJ;
  
  public h(Handler paramHandler, String paramString)
  {
    this(new b(paramHandler), paramString);
  }
  
  private h(Looper paramLooper, a parama, String paramString)
  {
    this.mLooper = paramLooper;
    this.uRJ = parama;
    this.mType = paramString;
  }
  
  public h(Looper paramLooper, String paramString)
  {
    this(new Handler(paramLooper), paramString);
  }
  
  public h(a parama, String paramString)
  {
    this(parama.getLooper(), parama, paramString);
  }
  
  public final void cancel()
  {
    this.uRJ.cA();
  }
  
  public final void g(Runnable paramRunnable)
  {
    this.uRJ.j(paramRunnable);
  }
  
  public final void g(Runnable paramRunnable, long paramLong)
  {
    if (paramLong >= 0L)
    {
      this.uRJ.k(paramRunnable, paramLong);
      return;
    }
    this.uRJ.j(paramRunnable);
  }
  
  public final String getType()
  {
    return this.mType;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vending/h/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */