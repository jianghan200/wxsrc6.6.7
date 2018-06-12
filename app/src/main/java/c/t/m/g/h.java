package c.t.m.g;

import java.util.concurrent.CountDownLatch;

final class h
  implements Runnable
{
  h(k paramk, i parami) {}
  
  public final void run()
  {
    aj localaj = this.a.a();
    this.b.a(localaj);
    this.b.j.countDown();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/c/t/m/g/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */