package com.tencent.mm.vending.h;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.mm.vending.i.a;
import com.tencent.mm.vending.i.b;

public abstract class d
{
  public static final h uRC = new h(Looper.getMainLooper(), "Vending.UI");
  public static final h uRD = new h(b.cBP().uRM.getLooper(), "Vending.LOGIC");
  public static final h uRE = new h(a.cBO().uRK.getLooper(), "Vending.HEAVY_WORK");
  
  static
  {
    g.cBN();
  }
  
  public static d cBM()
  {
    try
    {
      d locald = g.cBM();
      return locald;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public abstract void cancel();
  
  public abstract void g(Runnable paramRunnable);
  
  public abstract void g(Runnable paramRunnable, long paramLong);
  
  public abstract String getType();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vending/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */