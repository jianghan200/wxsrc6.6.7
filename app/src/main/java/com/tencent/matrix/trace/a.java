package com.tencent.matrix.trace;

import android.app.Application;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.tencent.matrix.trace.d.d;
import java.util.LinkedList;

public class a
  extends com.tencent.matrix.b.b
{
  private final com.tencent.matrix.trace.a.a bsS;
  private com.tencent.matrix.trace.d.c bsT;
  private com.tencent.matrix.trace.d.b bsU;
  public d bsV;
  
  public a(com.tencent.matrix.trace.a.a parama)
  {
    this.bsS = parama;
  }
  
  public final void a(Application paramApplication, com.tencent.matrix.b.c paramc)
  {
    super.a(paramApplication, paramc);
    com.tencent.matrix.d.b.i("Matrix.TracePlugin", "trace plugin init, trace config: %s", new Object[] { this.bsS.toString() });
    if (Build.VERSION.SDK_INT < 16)
    {
      com.tencent.matrix.d.b.e("Matrix.TracePlugin", "[FrameBeat] API is low Build.VERSION_CODES.JELLY_BEAN(16), TracePlugin is not supported", new Object[0]);
      this.brg = false;
    }
    do
    {
      return;
      com.tencent.matrix.trace.core.a.b(paramApplication);
      this.bsV = new d(this);
      if (this.bsS.bsX) {
        this.bsT = new com.tencent.matrix.trace.d.c(this, this.bsS);
      }
    } while (!this.bsS.bsY);
    this.bsU = new com.tencent.matrix.trace.d.b(this, this.bsS);
  }
  
  public final String getTag()
  {
    return "Trace";
  }
  
  public final void start()
  {
    super.start();
    if (!this.brg) {
      return;
    }
    if (this.bsT != null) {
      this.bsT.onCreate();
    }
    if (this.bsU != null) {
      this.bsU.onCreate();
    }
    if (this.bsV != null) {
      this.bsV.onCreate();
    }
    new Handler(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        com.tencent.matrix.trace.core.b localb = com.tencent.matrix.trace.core.b.tF();
        if (!com.tencent.matrix.d.c.aj(Thread.currentThread().getId()))
        {
          com.tencent.matrix.d.b.e("Matrix.FrameBeat", "[onCreate] FrameBeat must create on main thread", new Object[0]);
          return;
        }
        com.tencent.matrix.d.b.i("Matrix.FrameBeat", "[onCreate] FrameBeat real onCreate!", new Object[0]);
        if (!localb.btA)
        {
          localb.btA = true;
          localb.btB = System.nanoTime();
          com.tencent.matrix.trace.core.a.tE().a(localb);
          localb.btz = Choreographer.getInstance();
          return;
        }
        com.tencent.matrix.d.b.w("Matrix.FrameBeat", "[onCreate] FrameBeat is created!", new Object[0]);
      }
    });
  }
  
  public final void stop()
  {
    super.stop();
    if (!this.brg) {
      return;
    }
    com.tencent.matrix.trace.core.b localb = com.tencent.matrix.trace.core.b.tF();
    if (localb.btA)
    {
      localb.btA = false;
      localb.btz.removeFrameCallback(localb);
      localb.btz = null;
      if (localb.bty != null) {
        localb.bty.clear();
      }
      com.tencent.matrix.trace.core.a.tE().b(localb);
    }
    for (;;)
    {
      if (this.bsT != null) {
        this.bsT.onDestroy();
      }
      if (this.bsU != null) {
        this.bsU.onDestroy();
      }
      if (this.bsV == null) {
        break;
      }
      this.bsV.onDestroy();
      return;
      com.tencent.matrix.d.b.w("Matrix.FrameBeat", "[onDestroy] FrameBeat is not created!", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/trace/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */