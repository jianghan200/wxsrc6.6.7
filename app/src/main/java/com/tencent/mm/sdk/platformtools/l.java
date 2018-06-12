package com.tencent.mm.sdk.platformtools;

import android.app.ActivityManager;
import android.app.ActivityManager.AppTask;
import android.app.ActivityManager.RecentTaskInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PowerManager;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

public final class l
{
  private static BroadcastReceiver jhC = null;
  private static int sFI = 0;
  private static int sFJ = -1;
  private static b sFK = new a();
  
  public static int a(ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo)
  {
    if (!(sFK instanceof a)) {
      return -1;
    }
    Field localField = ((a)sFK).sFL;
    if ((Build.VERSION.SDK_INT >= 21) && (localField != null)) {
      try
      {
        int i = localField.getInt(paramRunningAppProcessInfo);
        return i;
      }
      catch (Throwable paramRunningAppProcessInfo)
      {
        x.printErrStackTrace("MicroMsg.GreenManUtil", paramRunningAppProcessInfo, "", new Object[0]);
      }
    }
    return -1;
  }
  
  public static String bQ(Context paramContext)
  {
    if (!dE(paramContext)) {
      return "";
    }
    try
    {
      paramContext = (ActivityManager)paramContext.getSystemService("activity");
      if (Build.VERSION.SDK_INT >= 23)
      {
        paramContext = paramContext.getAppTasks();
        if ((paramContext == null) || (paramContext.size() <= 0)) {
          break label144;
        }
        paramContext = paramContext.iterator();
        if (paramContext.hasNext())
        {
          paramContext = ((ActivityManager.AppTask)paramContext.next()).getTaskInfo().topActivity;
          if (paramContext == null) {
            return null;
          }
          return paramContext.getClassName();
        }
      }
      else
      {
        paramContext = ((ActivityManager.RunningTaskInfo)paramContext.getRunningTasks(1).get(0)).topActivity.getClassName();
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      x.e("MicroMsg.GreenManUtil", "getTopActivityName Exception:%s stack:%s", new Object[] { paramContext.getMessage(), bi.i(paramContext) });
    }
    return "";
    label144:
    return "";
  }
  
  public static boolean dE(Context paramContext)
  {
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    if (paramContext == null) {
      return false;
    }
    paramContext = paramContext.iterator();
    while (paramContext.hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
      if ((localRunningAppProcessInfo.importance == 100) && (localRunningAppProcessInfo.processName.startsWith("com.tencent.mm"))) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean fs(Context paramContext)
  {
    try
    {
      paramContext = (PowerManager)paramContext.getSystemService("power");
      if (Build.VERSION.SDK_INT >= 20) {
        return paramContext.isInteractive();
      }
      boolean bool = paramContext.isScreenOn();
      return bool;
    }
    catch (Exception paramContext)
    {
      x.e("MicroMsg.GreenManUtil", "isScreenOn ERROR use isScreenOn e:%s", new Object[] { bi.i(paramContext) });
    }
    return false;
  }
  
  /* Error */
  public static boolean ft(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc 2
    //   4: monitorenter
    //   5: getstatic 23	com/tencent/mm/sdk/platformtools/l:jhC	Landroid/content/BroadcastReceiver;
    //   8: ifnonnull +50 -> 58
    //   11: new 6	com/tencent/mm/sdk/platformtools/l$1
    //   14: dup
    //   15: invokespecial 186	com/tencent/mm/sdk/platformtools/l$1:<init>	()V
    //   18: putstatic 23	com/tencent/mm/sdk/platformtools/l:jhC	Landroid/content/BroadcastReceiver;
    //   21: aload_0
    //   22: getstatic 23	com/tencent/mm/sdk/platformtools/l:jhC	Landroid/content/BroadcastReceiver;
    //   25: new 188	android/content/IntentFilter
    //   28: dup
    //   29: ldc -66
    //   31: invokespecial 193	android/content/IntentFilter:<init>	(Ljava/lang/String;)V
    //   34: invokevirtual 197	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   37: astore_0
    //   38: aload_0
    //   39: ldc -57
    //   41: iconst_m1
    //   42: invokevirtual 205	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   45: putstatic 27	com/tencent/mm/sdk/platformtools/l:sFJ	I
    //   48: aload_0
    //   49: ldc -49
    //   51: iconst_0
    //   52: invokevirtual 205	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   55: putstatic 25	com/tencent/mm/sdk/platformtools/l:sFI	I
    //   58: getstatic 27	com/tencent/mm/sdk/platformtools/l:sFJ	I
    //   61: iconst_2
    //   62: if_icmpeq +38 -> 100
    //   65: getstatic 25	com/tencent/mm/sdk/platformtools/l:sFI	I
    //   68: iconst_1
    //   69: if_icmpeq +31 -> 100
    //   72: getstatic 25	com/tencent/mm/sdk/platformtools/l:sFI	I
    //   75: iconst_2
    //   76: if_icmpeq +24 -> 100
    //   79: iload_3
    //   80: istore_2
    //   81: getstatic 47	android/os/Build$VERSION:SDK_INT	I
    //   84: bipush 17
    //   86: if_icmplt +16 -> 102
    //   89: getstatic 25	com/tencent/mm/sdk/platformtools/l:sFI	I
    //   92: istore_1
    //   93: iload_3
    //   94: istore_2
    //   95: iload_1
    //   96: iconst_4
    //   97: if_icmpne +5 -> 102
    //   100: iconst_1
    //   101: istore_2
    //   102: ldc 2
    //   104: monitorexit
    //   105: iload_2
    //   106: ireturn
    //   107: astore_0
    //   108: ldc 2
    //   110: monitorexit
    //   111: aload_0
    //   112: athrow
    //   113: astore_0
    //   114: goto -56 -> 58
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	paramContext	Context
    //   92	6	1	i	int
    //   80	26	2	bool1	boolean
    //   1	93	3	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   5	21	107	finally
    //   21	58	107	finally
    //   58	79	107	finally
    //   81	93	107	finally
    //   21	58	113	java/lang/Throwable
  }
  
  public static void fu(Context paramContext)
  {
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningServices(10);
    if (paramContext == null) {}
    for (;;)
    {
      return;
      paramContext = paramContext.iterator();
      while (paramContext.hasNext())
      {
        ActivityManager.RunningServiceInfo localRunningServiceInfo = (ActivityManager.RunningServiceInfo)paramContext.next();
        x.i("MicroMsg.GreenManUtil", "dumpRunningServices %s %s", new Object[] { localRunningServiceInfo.service, Boolean.valueOf(localRunningServiceInfo.foreground), Long.valueOf(localRunningServiceInfo.activeSince) });
      }
    }
  }
  
  public static boolean fv(Context paramContext)
  {
    return sFK.fw(paramContext);
  }
  
  private static final class a
    implements l.b
  {
    Field sFL = null;
    
    a()
    {
      if (Build.VERSION.SDK_INT >= 21) {}
      try
      {
        if (this.sFL == null)
        {
          Field localField = ActivityManager.RunningAppProcessInfo.class.getDeclaredField("processState");
          localField.setAccessible(true);
          this.sFL = localField;
        }
        return;
      }
      catch (Throwable localThrowable)
      {
        x.printErrStackTrace("MicroMsg.GreenManUtil", localThrowable, "", new Object[0]);
      }
    }
    
    public final boolean fw(Context paramContext)
    {
      paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
      if (paramContext == null) {
        return false;
      }
      paramContext = paramContext.iterator();
      while (paramContext.hasNext())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
        if (localRunningAppProcessInfo.processName.startsWith("com.tencent.mm"))
        {
          if ((Build.VERSION.SDK_INT >= 21) && (this.sFL != null)) {}
          for (;;)
          {
            try
            {
              i = this.sFL.getInt(localRunningAppProcessInfo);
              x.i("MicroMsg.GreenManUtil", "isAppForeground processState %s", new Object[] { Integer.valueOf(i) });
              if (i <= 2) {
                return true;
              }
              i = 0;
              if ((i == 0) || (localRunningAppProcessInfo.importance != 100)) {
                break;
              }
              return true;
            }
            catch (Throwable localThrowable)
            {
              x.printErrStackTrace("MicroMsg.GreenManUtil", localThrowable, "", new Object[0]);
            }
            int i = 1;
          }
        }
      }
      return false;
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean fw(Context paramContext);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */