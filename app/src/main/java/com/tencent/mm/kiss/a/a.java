package com.tencent.mm.kiss.a;

import android.os.Handler;
import android.os.HandlerThread;

public final class a
{
  private static a dtd = new a();
  public HandlerThread dtc = new HandlerThread("InflateThread", 5);
  private Handler mHandler;
  
  private a()
  {
    this.dtc.start();
    this.mHandler = new Handler(this.dtc.getLooper());
  }
  
  public static a EX()
  {
    return dtd;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/kiss/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */