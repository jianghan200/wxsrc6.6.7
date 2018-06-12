package com.tencent.mm.vending.i;

import android.os.Handler;
import android.os.HandlerThread;

public final class a
{
  private static a uRL = new a();
  private Handler mHandler;
  public HandlerThread uRK = new HandlerThread("Vending-HeavyWorkThread", 10);
  
  private a()
  {
    this.uRK.start();
    this.mHandler = new Handler(this.uRK.getLooper());
  }
  
  public static a cBO()
  {
    return uRL;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vending/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */