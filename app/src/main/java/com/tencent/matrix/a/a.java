package com.tencent.matrix.a;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.a.b.b.c;
import com.tencent.matrix.a.b.c.3;
import com.tencent.matrix.a.b.c.4;
import com.tencent.matrix.a.b.d;
import com.tencent.matrix.a.b.e;
import com.tencent.matrix.a.b.e.b;
import com.tencent.matrix.a.b.f;

public final class a
  extends com.tencent.matrix.b.b
{
  public final com.tencent.matrix.a.a.a boV;
  private com.tencent.matrix.a.b.c boW;
  
  public a()
  {
    this.boV = com.tencent.matrix.a.a.a.boX;
  }
  
  public a(com.tencent.matrix.a.a.a parama)
  {
    this.boV = parama;
  }
  
  public final void a(Application paramApplication, com.tencent.matrix.b.c paramc)
  {
    super.a(paramApplication, paramc);
    com.tencent.matrix.a.c.a.ay(paramApplication);
    com.tencent.matrix.a.c.a.bZ(com.tencent.matrix.d.c.aC(paramApplication));
    this.boW = new com.tencent.matrix.a.b.c(this);
  }
  
  public final String getTag()
  {
    return "battery";
  }
  
  public final void start()
  {
    super.start();
    com.tencent.matrix.a.b.c localc = this.boW;
    Object localObject1 = localc.bpJ;
    if (!((d)localObject1).started)
    {
      ((d)localObject1).bqd = new Handler(com.tencent.matrix.d.a.tJ().getLooper());
      ((d)localObject1).started = true;
    }
    localObject1 = localc.boV;
    if (localObject1 == null) {
      throw new RuntimeException("batteryConfig is null");
    }
    if (((com.tencent.matrix.a.a.a)localObject1).el(1))
    {
      localc.bpM = new f(localc, (com.tencent.matrix.a.a.a)localObject1, new c.3(localc));
      e.a(localc);
    }
    if (((com.tencent.matrix.a.a.a)localObject1).el(4))
    {
      localc.bpN = new com.tencent.matrix.a.b.a(localc, localc.boV);
      localc.bpJ.f(new c.4(localc));
      com.tencent.matrix.a.b.b.a(localc);
    }
    try
    {
      localc.bpL = true;
      return;
    }
    finally {}
  }
  
  public final void stop()
  {
    super.stop();
    synchronized (this.boW)
    {
      ((com.tencent.matrix.a.b.c)???).bpL = false;
      e.b((e.b)???);
      com.tencent.matrix.a.b.b.b((b.c)???);
      ??? = ((com.tencent.matrix.a.b.c)???).bpJ;
      if (((d)???).started)
      {
        ((d)???).bqd.removeCallbacksAndMessages(null);
        ((d)???).started = false;
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */