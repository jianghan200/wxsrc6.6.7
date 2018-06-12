package c.t.m.g;

import android.os.SystemClock;

final class an
  implements Runnable
{
  an(am paramam, ag paramag, long paramLong) {}
  
  public final void run()
  {
    boolean bool2 = false;
    try
    {
      aj localaj = this.a.a();
      this.a.k = (SystemClock.elapsedRealtime() - this.b);
      this.a.a(false);
      boolean bool1 = bool2;
      if (localaj.a == 0)
      {
        int i = localaj.c;
        bool1 = bool2;
        if (i == 200) {
          bool1 = true;
        }
      }
      return;
    }
    catch (Throwable localThrowable) {}finally
    {
      am.a(this.c, false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/c/t/m/g/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */