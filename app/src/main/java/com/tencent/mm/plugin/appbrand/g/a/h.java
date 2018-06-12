package com.tencent.mm.plugin.appbrand.g.a;

import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Locker;
import com.tencent.xweb.d;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class h
{
  public volatile boolean Sx = true;
  public volatile boolean fcO = false;
  public V8 gek;
  public Thread gev;
  final ConcurrentLinkedQueue<Runnable> gew = new ConcurrentLinkedQueue();
  d gex;
  
  public h(V8 paramV8)
  {
    this.gek = paramV8;
    this.gev = new h.1(this);
    paramV8 = this.gek.getLocker();
    if (paramV8.hasLock()) {
      paramV8.release();
    }
    this.gev.start();
  }
  
  public final void r(Runnable paramRunnable)
  {
    this.gew.offer(paramRunnable);
    this.gev.interrupt();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/g/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */