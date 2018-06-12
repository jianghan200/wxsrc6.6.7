package com.tencent.matrix.iocanary;

import android.app.Application;
import com.tencent.matrix.b.c;
import com.tencent.matrix.iocanary.core.IOCanaryJniBridge;

public final class a
  extends com.tencent.matrix.b.b
{
  public final com.tencent.matrix.iocanary.a.a bqJ = com.tencent.matrix.iocanary.a.a.bqL;
  private com.tencent.matrix.iocanary.core.a bqK;
  
  public final void a(Application paramApplication, c paramc)
  {
    super.a(paramApplication, paramc);
    com.tencent.matrix.iocanary.c.a.ay(paramApplication);
    this.bqK = new com.tencent.matrix.iocanary.core.a(this);
  }
  
  public final String getTag()
  {
    return "io";
  }
  
  public final void start()
  {
    super.start();
    com.tencent.matrix.iocanary.core.a locala = this.bqK;
    Object localObject1 = locala.bqJ;
    if ((!com.tencent.matrix.iocanary.core.a.$assertionsDisabled) && (localObject1 == null)) {
      throw new AssertionError();
    }
    if ((((com.tencent.matrix.iocanary.a.a)localObject1).el(1)) || (((com.tencent.matrix.iocanary.a.a)localObject1).el(4)) || (((com.tencent.matrix.iocanary.a.a)localObject1).el(2))) {
      IOCanaryJniBridge.a((com.tencent.matrix.iocanary.a.a)localObject1, locala);
    }
    if (((com.tencent.matrix.iocanary.a.a)localObject1).el(8))
    {
      locala.bqV = new com.tencent.matrix.iocanary.b.a(locala);
      localObject1 = locala.bqV;
      com.tencent.matrix.d.b.i("Matrix.CloseGuardHooker", "hook sIsTryHook=%b", new Object[] { Boolean.valueOf(((com.tencent.matrix.iocanary.b.a)localObject1).bqZ) });
      if (!((com.tencent.matrix.iocanary.b.a)localObject1).bqZ)
      {
        com.tencent.matrix.d.b.i("Matrix.CloseGuardHooker", "hook hookRet=%b", new Object[] { Boolean.valueOf(((com.tencent.matrix.iocanary.b.a)localObject1).tu()) });
        ((com.tencent.matrix.iocanary.b.a)localObject1).bqZ = true;
      }
    }
    try
    {
      locala.bpL = true;
      return;
    }
    finally {}
  }
  
  public final void stop()
  {
    super.stop();
    synchronized (this.bqK)
    {
      ((com.tencent.matrix.iocanary.core.a)???).bpL = false;
      if (((com.tencent.matrix.iocanary.core.a)???).bqV != null)
      {
        ??? = ((com.tencent.matrix.iocanary.core.a)???).bqV;
        com.tencent.matrix.d.b.i("Matrix.CloseGuardHooker", "unHook unHookRet=%b", new Object[] { Boolean.valueOf(com.tencent.matrix.iocanary.b.a.tv()) });
        ((com.tencent.matrix.iocanary.b.a)???).bqZ = false;
      }
      IOCanaryJniBridge.ts();
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/iocanary/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */