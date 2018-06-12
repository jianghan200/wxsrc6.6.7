package c.t.m.g;

import android.os.Process;
import java.util.Map;

final class cf
  implements Runnable
{
  cf(String paramString1, int paramInt1, int paramInt2, String paramString2, Map paramMap1, Map paramMap2, boolean paramBoolean) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    ce.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/c/t/m/g/cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */