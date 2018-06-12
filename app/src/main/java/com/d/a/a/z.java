package com.d.a.a;

import android.os.Handler;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class z
{
  private static z bmX;
  private static final SparseArray<z> bmY = new SparseArray();
  private final ExecutorService bmZ;
  private final Handler handler;
  
  private z(Handler paramHandler)
  {
    if (paramHandler != null) {}
    for (this.bmZ = null;; this.bmZ = Executors.newSingleThreadExecutor())
    {
      this.handler = paramHandler;
      return;
    }
  }
  
  static z a(Handler paramHandler)
  {
    if (paramHandler != null)
    {
      int i = paramHandler.getLooper().hashCode();
      z localz2 = (z)bmY.get(i);
      z localz1 = localz2;
      if (localz2 == null)
      {
        localz1 = new z(paramHandler);
        bmY.put(i, localz1);
      }
      return localz1;
    }
    if (bmX == null) {
      bmX = new z(null);
    }
    return bmX;
  }
  
  final void execute(Runnable paramRunnable)
  {
    if (this.handler != null)
    {
      this.handler.post(paramRunnable);
      return;
    }
    this.bmZ.execute(paramRunnable);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/d/a/a/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */