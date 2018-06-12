package c.t.m.g;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class k
{
  protected i a;
  public String b;
  public String c;
  protected AtomicInteger d = new AtomicInteger(0);
  protected ae e;
  private int f;
  private long g;
  private int h = 0;
  
  public k(i parami)
  {
    this.a = parami;
    this.b = parami.a;
    this.c = parami.a;
    this.f = parami.e;
  }
  
  public aj a()
  {
    for (;;)
    {
      try
      {
        this.g = SystemClock.elapsedRealtime();
        w.a("app_http_proxy_timeout", 0, 20000, 5000);
        if (this.f <= 0) {
          this.f = w.a("app_req_timeout", 1000, 1000000, 15000);
        }
        if ((this.a.h > 0) && (this.a.h < this.f)) {
          this.f = this.a.h;
        }
        int i = this.f;
        aj localaj = a(i);
        i = ci.a((int)(this.f - (SystemClock.elapsedRealtime() - this.g)), this.f);
        String str;
        if ((localaj.a == 0) && (localaj.c >= 300) && (localaj.c < 400) && (this.a.d) && (i > 200))
        {
          str = localaj.a("location");
          if (TextUtils.isEmpty(str)) {
            localaj.a = -6;
          }
        }
        else
        {
          boolean bool = this.a.g;
          if (!this.a.k) {
            break label296;
          }
          this.e.j = true;
          this.e.i = true;
          this.e.k = this.a.h;
          this.e.a(false);
          return localaj;
        }
        this.c = str;
        this.h += 1;
        if (this.h > 5)
        {
          localaj.a = -5;
          continue;
        }
        this.e.a(true);
      }
      catch (Throwable localThrowable)
      {
        return new aj(-1, ci.a(localThrowable));
      }
      continue;
      label296:
      this.e.k = (SystemClock.elapsedRealtime() - this.g);
    }
  }
  
  protected abstract aj a(int paramInt);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/c/t/m/g/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */