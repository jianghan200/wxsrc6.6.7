package com.tencent.matrix.a.b;

import android.os.IBinder;
import android.os.WorkSource;
import com.tencent.matrix.a.c.b.b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class e
{
  private static boolean bpC;
  private static b.b bpD = new b.b()
  {
    public final void b(Method paramAnonymousMethod, Object[] paramAnonymousArrayOfObject)
    {
      com.tencent.matrix.d.b.v("Matrix.PowerManagerServiceHooker", "onServiceMethodInvoke: method name %s", new Object[] { paramAnonymousMethod.getName() });
      e.a(paramAnonymousMethod, paramAnonymousArrayOfObject);
    }
  };
  private static com.tencent.matrix.a.c.b bpE = new com.tencent.matrix.a.c.b("power", "android.os.IPowerManager", bpD);
  private static List<b> bpF = new ArrayList();
  
  public static void a(b paramb)
  {
    if (paramb == null) {}
    for (;;)
    {
      return;
      try
      {
        if (bpF.contains(paramb)) {
          continue;
        }
        bpF.add(paramb);
        if ((bpC) || (bpF.isEmpty())) {
          continue;
        }
        com.tencent.matrix.d.b.i("Matrix.PowerManagerServiceHooker", "checkHook hookRet:%b", new Object[] { Boolean.valueOf(bpE.doHook()) });
        bpC = true;
      }
      finally {}
    }
  }
  
  public static void b(b paramb)
  {
    if (paramb == null) {}
    for (;;)
    {
      return;
      try
      {
        bpF.remove(paramb);
        if ((!bpC) || (!bpF.isEmpty())) {
          continue;
        }
        com.tencent.matrix.d.b.i("Matrix.PowerManagerServiceHooker", "checkUnHook unHookRet:%b", new Object[] { Boolean.valueOf(bpE.doUnHook()) });
        bpC = false;
      }
      finally {}
    }
  }
  
  private static final class a
  {
    WorkSource bqe;
    String bqf;
    int flags;
    String packageName;
    String tag;
    IBinder token;
  }
  
  public static abstract interface b
  {
    public abstract void a(IBinder paramIBinder, int paramInt);
    
    public abstract void a(IBinder paramIBinder, int paramInt, String paramString1, String paramString2, WorkSource paramWorkSource, String paramString3);
  }
  
  private static final class c
  {
    int flags;
    IBinder token;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/a/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */