package com.tencent.liteav.basic.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public class b
{
  private Handler a;
  private Looper b;
  private boolean c;
  private Thread d;
  
  public b(String paramString)
  {
    paramString = new HandlerThread(paramString);
    this.c = true;
    paramString.start();
    this.b = paramString.getLooper();
    this.a = new Handler(this.b);
    this.d = paramString;
  }
  
  public Handler a()
  {
    return this.a;
  }
  
  public void a(Runnable paramRunnable)
  {
    boolean[] arrayOfBoolean = new boolean[1];
    if (Thread.currentThread().equals(this.d))
    {
      paramRunnable.run();
      return;
    }
    Handler localHandler = this.a;
    arrayOfBoolean[0] = false;
    try
    {
      this.a.post(new b.1(this, paramRunnable, arrayOfBoolean));
      for (;;)
      {
        int i = arrayOfBoolean[0];
        if (i != 0) {
          break;
        }
        try
        {
          this.a.wait();
        }
        catch (Exception paramRunnable) {}
      }
      return;
    }
    finally {}
  }
  
  public void b(Runnable paramRunnable)
  {
    this.a.post(paramRunnable);
  }
  
  protected void finalize()
  {
    if (this.c) {
      this.a.getLooper().quit();
    }
    super.finalize();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/liteav/basic/util/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */