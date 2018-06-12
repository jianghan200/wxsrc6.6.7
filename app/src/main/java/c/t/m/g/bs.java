package c.t.m.g;

import android.os.Handler;

final class bs
  implements Runnable
{
  bs(bp parambp) {}
  
  public final void run()
  {
    try
    {
      p.e();
      bp.a(this.a, p.b());
      bp.b(this.a).removeCallbacks(bp.a(this.a));
      bp.b(this.a).post(bp.a(this.a));
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/c/t/m/g/bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */