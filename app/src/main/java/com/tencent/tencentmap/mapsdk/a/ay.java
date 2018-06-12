package com.tencent.tencentmap.mapsdk.a;

import java.util.concurrent.LinkedBlockingQueue;

public class ay
{
  private LinkedBlockingQueue<am> a;
  private LinkedBlockingQueue<az> b;
  
  public void a(am paramam)
  {
    if (!this.a.offer(paramam)) {
      ax.a("AsyncCall|send queue is full");
    }
  }
  
  public void a(az paramaz)
  {
    if (!this.b.offer(paramaz)) {
      ax.a("AsyncCall|recv queue is full");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */