package c.t.m.g;

import android.content.Context;
import android.content.IntentFilter;

final class v
  implements Runnable
{
  public final void run()
  {
    try
    {
      p.e();
      IntentFilter localIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
      m.a().registerReceiver(p.m(), localIntentFilter);
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/c/t/m/g/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */