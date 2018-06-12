package com.tencent.matrix.a.b;

import android.app.AlarmManager.OnAlarmListener;
import android.app.PendingIntent;
import android.os.Build.VERSION;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class b
{
  private static boolean bpC;
  private static com.tencent.matrix.a.c.b.b bpD = new com.tencent.matrix.a.c.b.b()
  {
    public final void b(Method paramAnonymousMethod, Object[] paramAnonymousArrayOfObject)
    {
      com.tencent.matrix.d.b.v("Matrix.AlarmManagerServiceHooker", "onServiceMethodInvoke: method name %s", new Object[] { paramAnonymousMethod.getName() });
      b.a(paramAnonymousMethod, paramAnonymousArrayOfObject);
    }
  };
  private static com.tencent.matrix.a.c.b bpE = new com.tencent.matrix.a.c.b("alarm", "android.app.IAlarmManager", bpD);
  private static List<c> bpF = new ArrayList();
  private static Class bpG;
  private static Field bpH;
  
  static
  {
    try
    {
      Object localObject = Class.forName("android.app.AlarmManager$ListenerWrapper");
      bpG = (Class)localObject;
      localObject = ((Class)localObject).getDeclaredField("mListener");
      bpH = (Field)localObject;
      ((Field)localObject).setAccessible(true);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "static init exp:%s", new Object[] { localClassNotFoundException });
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "static init exp:%s", new Object[] { localNoSuchFieldException });
    }
  }
  
  public static void a(c paramc)
  {
    if (paramc == null) {}
    for (;;)
    {
      return;
      try
      {
        if (bpF.contains(paramc)) {
          continue;
        }
        bpF.add(paramc);
        if ((bpC) || (bpF.isEmpty())) {
          continue;
        }
        com.tencent.matrix.d.b.i("Matrix.AlarmManagerServiceHooker", "checkHook hookRet:%b", new Object[] { Boolean.valueOf(bpE.doHook()) });
        bpC = true;
      }
      finally {}
    }
  }
  
  public static void b(c paramc)
  {
    if (paramc == null) {}
    for (;;)
    {
      return;
      try
      {
        bpF.remove(paramc);
        if ((!bpC) || (!bpF.isEmpty())) {
          continue;
        }
        com.tencent.matrix.d.b.i("Matrix.AlarmManagerServiceHooker", "checkUnHook unHookRet:%b", new Object[] { Boolean.valueOf(bpE.doUnHook()) });
        bpC = false;
      }
      finally {}
    }
  }
  
  private static final class a
  {
    AlarmManager.OnAlarmListener bpq;
    PendingIntent bpy;
  }
  
  private static final class b
  {
    static b.a d(Object[] paramArrayOfObject)
    {
      if (paramArrayOfObject.length != 2)
      {
        com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "createCancelArgs2 args length invalid : %d", new Object[] { Integer.valueOf(paramArrayOfObject.length) });
        return null;
      }
      b.a locala = new b.a((byte)0);
      if ((paramArrayOfObject[0] != null) && (!(paramArrayOfObject[0] instanceof PendingIntent)))
      {
        com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "createCancelArgs2 args idx 0 not PendingIntent, %s", new Object[] { paramArrayOfObject[0] });
        return null;
      }
      locala.bpy = ((PendingIntent)paramArrayOfObject[0]);
      if ((b.tl() == null) || (b.tm() == null))
      {
        com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "createSetArgs sListenerWrapperCls sListenerField null", new Object[0]);
        return null;
      }
      if ((paramArrayOfObject[1] != null) && (!b.tl().isInstance(paramArrayOfObject[1])))
      {
        com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 1 not ListenerWrapper, %s", new Object[] { paramArrayOfObject[1] });
        return null;
      }
      if (paramArrayOfObject[1] != null) {}
      try
      {
        locala.bpq = ((AlarmManager.OnAlarmListener)b.tm().get(paramArrayOfObject[1]));
        return locala;
      }
      catch (IllegalAccessException paramArrayOfObject)
      {
        com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 1 init exp:%s", new Object[] { paramArrayOfObject.getLocalizedMessage() });
      }
      return null;
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(int paramInt1, long paramLong1, long paramLong2, long paramLong3, int paramInt2, PendingIntent paramPendingIntent, AlarmManager.OnAlarmListener paramOnAlarmListener);
    
    public abstract void a(PendingIntent paramPendingIntent, AlarmManager.OnAlarmListener paramOnAlarmListener);
  }
  
  private static final class d
  {
    long bpI;
    long bpn;
    long bpo;
    AlarmManager.OnAlarmListener bpq;
    PendingIntent bpy;
    int flags;
    int type;
  }
  
  private static final class e
  {
    static b.d e(Object[] paramArrayOfObject)
    {
      if (paramArrayOfObject.length != 11)
      {
        com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args length invalid : %d", new Object[] { Integer.valueOf(paramArrayOfObject.length) });
        return null;
      }
      b.d locald = new b.d((byte)0);
      if (!(paramArrayOfObject[1] instanceof Integer))
      {
        com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 1 not Integer, %s", new Object[] { paramArrayOfObject[1] });
        return null;
      }
      locald.type = ((Integer)paramArrayOfObject[1]).intValue();
      if (!(paramArrayOfObject[2] instanceof Long))
      {
        com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 2 not Long, %s", new Object[] { paramArrayOfObject[2] });
        return null;
      }
      locald.bpn = ((Long)paramArrayOfObject[2]).longValue();
      if (!(paramArrayOfObject[3] instanceof Long))
      {
        com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 3 not Long, %s", new Object[] { paramArrayOfObject[3] });
        return null;
      }
      locald.bpI = ((Long)paramArrayOfObject[3]).longValue();
      if (!(paramArrayOfObject[4] instanceof Long))
      {
        com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 4 not Long, %s", new Object[] { paramArrayOfObject[4] });
        return null;
      }
      locald.bpo = ((Long)paramArrayOfObject[4]).longValue();
      if (!(paramArrayOfObject[5] instanceof Integer))
      {
        com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 5 not Integer, %s", new Object[] { paramArrayOfObject[5] });
        return null;
      }
      locald.flags = ((Integer)paramArrayOfObject[5]).intValue();
      if ((paramArrayOfObject[6] != null) && (!(paramArrayOfObject[6] instanceof PendingIntent)))
      {
        com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 6 not PendingIntent, %s", new Object[] { paramArrayOfObject[6] });
        return null;
      }
      locald.bpy = ((PendingIntent)paramArrayOfObject[6]);
      if ((b.tl() == null) || (b.tm() == null))
      {
        com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "createSetArgs sListenerWrapperCls sListenerField null", new Object[0]);
        return null;
      }
      if (Build.VERSION.SDK_INT >= 24)
      {
        if ((paramArrayOfObject[7] != null) && (!b.tl().isInstance(paramArrayOfObject[7])))
        {
          com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 7 not ListenerWrapper, %s", new Object[] { paramArrayOfObject[7] });
          return null;
        }
        if (paramArrayOfObject[7] == null) {}
      }
      try
      {
        locald.bpq = ((AlarmManager.OnAlarmListener)b.tm().get(paramArrayOfObject[7]));
        return locald;
      }
      catch (IllegalAccessException paramArrayOfObject)
      {
        com.tencent.matrix.d.b.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 7 init exp:%s", new Object[] { paramArrayOfObject.getLocalizedMessage() });
      }
      return null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */