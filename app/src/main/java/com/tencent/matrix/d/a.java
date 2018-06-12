package com.tencent.matrix.d;

import android.os.HandlerThread;
import java.util.HashSet;
import java.util.Iterator;

public class a
{
  private static HandlerThread buT;
  private static HashSet<HandlerThread> buU = new HashSet();
  
  public static HandlerThread cd(String paramString)
  {
    Object localObject = buU.iterator();
    while (((Iterator)localObject).hasNext()) {
      if (!((HandlerThread)((Iterator)localObject).next()).isAlive())
      {
        ((Iterator)localObject).remove();
        b.w("Matrix.HandlerThread", "warning: remove dead handler thread with name %s", new Object[] { paramString });
      }
    }
    localObject = new HandlerThread(paramString);
    ((HandlerThread)localObject).start();
    buU.add(localObject);
    b.w("Matrix.HandlerThread", "warning: create new handler thread with name %s, alive thread size:%d", new Object[] { paramString, Integer.valueOf(buU.size()) });
    return (HandlerThread)localObject;
  }
  
  public static HandlerThread tJ()
  {
    if (buT != null) {
      return buT;
    }
    try
    {
      if (buT == null)
      {
        HandlerThread localHandlerThread = new HandlerThread("default_matrix_thread");
        buT = localHandlerThread;
        localHandlerThread.start();
        b.w("Matrix.HandlerThread", "create default handler thread, we should use these thread normal", new Object[0]);
      }
      return buT;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */