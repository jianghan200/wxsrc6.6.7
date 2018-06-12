package com.tencent.tencentmap.mapsdk.a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ji
{
  private ExecutorService a;
  private ExecutorService b;
  private jg c;
  private jh d;
  
  private void a(String paramString, byte[] paramArrayOfByte)
  {
    if (this.d == null) {
      return;
    }
    if (this.b == null) {
      this.b = Executors.newSingleThreadExecutor();
    }
    this.b.execute(new ji.2(this, paramArrayOfByte, paramString));
  }
  
  private void b(String paramString)
  {
    try
    {
      byte[] arrayOfByte2 = this.c.a(paramString);
      byte[] arrayOfByte1 = arrayOfByte2;
      if (arrayOfByte2 != null)
      {
        arrayOfByte1 = arrayOfByte2;
        if (arrayOfByte2.length == 0) {
          arrayOfByte1 = null;
        }
      }
      a(paramString, arrayOfByte1);
      return;
    }
    catch (Exception localException)
    {
      a(paramString, null);
    }
  }
  
  public void a()
  {
    a(null);
  }
  
  public void a(jg paramjg)
  {
    this.c = paramjg;
  }
  
  public void a(jh paramjh)
  {
    this.d = paramjh;
  }
  
  public void a(Runnable paramRunnable)
  {
    this.c = null;
    if (this.a != null)
    {
      this.a.shutdown();
      this.a = null;
    }
    if (this.b != null)
    {
      this.b.shutdown();
      this.b = null;
    }
    if (paramRunnable != null) {
      paramRunnable.run();
    }
  }
  
  public void a(String paramString)
  {
    if (this.c == null) {
      return;
    }
    if (this.a == null) {
      this.a = Executors.newFixedThreadPool(5);
    }
    try
    {
      this.a.execute(new ji.1(this, paramString));
      return;
    }
    catch (IllegalMonitorStateException paramString) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */