package com.tencent.mm.vending.i;

import android.os.Handler;
import android.os.HandlerThread;

public final class b
{
  private static b uRN = new b();
  private Handler mHandler;
  public HandlerThread uRM = new HandlerThread("Vending-LogicThread");
  
  private b()
  {
    this.uRM.start();
    this.mHandler = new Handler(this.uRM.getLooper());
  }
  
  public static b cBP()
  {
    return uRN;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vending/i/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */