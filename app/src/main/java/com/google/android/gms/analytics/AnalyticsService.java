package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.analytics.internal.k;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.common.internal.w;

public final class AnalyticsService
  extends Service
{
  private static Boolean aEy;
  private final Handler mHandler = new Handler();
  
  public static boolean ab(Context paramContext)
  {
    w.ah(paramContext);
    if (aEy != null) {
      return aEy.booleanValue();
    }
    boolean bool = k.a(paramContext, AnalyticsService.class);
    aEy = Boolean.valueOf(bool);
    return bool;
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public final void onCreate()
  {
    super.onCreate();
    com.google.android.gms.analytics.internal.f localf = q.ac(this).nr();
    if (com.google.android.gms.common.internal.f.aNr)
    {
      localf.aO("Device AnalyticsService is starting up");
      return;
    }
    localf.aO("Local AnalyticsService is starting up");
  }
  
  public final void onDestroy()
  {
    com.google.android.gms.analytics.internal.f localf = q.ac(this).nr();
    if (com.google.android.gms.common.internal.f.aNr) {
      localf.aO("Device AnalyticsService is shutting down");
    }
    for (;;)
    {
      super.onDestroy();
      return;
      localf.aO("Local AnalyticsService is shutting down");
    }
  }
  
  /* Error */
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: getstatic 93	com/google/android/gms/analytics/AnalyticsReceiver:aEv	Ljava/lang/Object;
    //   3: astore 4
    //   5: aload 4
    //   7: monitorenter
    //   8: getstatic 97	com/google/android/gms/analytics/AnalyticsReceiver:aEw	Lcom/google/android/gms/c/as;
    //   11: astore 5
    //   13: aload 5
    //   15: ifnull +19 -> 34
    //   18: aload 5
    //   20: getfield 103	com/google/android/gms/c/as:aZe	Landroid/os/PowerManager$WakeLock;
    //   23: invokevirtual 108	android/os/PowerManager$WakeLock:isHeld	()Z
    //   26: ifeq +8 -> 34
    //   29: aload 5
    //   31: invokevirtual 111	com/google/android/gms/c/as:release	()V
    //   34: aload 4
    //   36: monitorexit
    //   37: aload_0
    //   38: invokestatic 56	com/google/android/gms/analytics/internal/q:ac	(Landroid/content/Context;)Lcom/google/android/gms/analytics/internal/q;
    //   41: astore 4
    //   43: aload 4
    //   45: invokevirtual 60	com/google/android/gms/analytics/internal/q:nr	()Lcom/google/android/gms/analytics/internal/f;
    //   48: astore 5
    //   50: aload_1
    //   51: invokevirtual 117	android/content/Intent:getAction	()Ljava/lang/String;
    //   54: astore_1
    //   55: getstatic 66	com/google/android/gms/common/internal/f:aNr	Z
    //   58: ifeq +60 -> 118
    //   61: aload 5
    //   63: ldc 119
    //   65: iload_3
    //   66: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   69: aload_1
    //   70: invokevirtual 127	com/google/android/gms/analytics/internal/f:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   73: ldc -127
    //   75: aload_1
    //   76: invokevirtual 135	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   79: ifeq +24 -> 103
    //   82: aload 4
    //   84: invokevirtual 139	com/google/android/gms/analytics/internal/q:nt	()Lcom/google/android/gms/analytics/internal/m;
    //   87: new 141	com/google/android/gms/analytics/AnalyticsService$1
    //   90: dup
    //   91: aload_0
    //   92: iload_3
    //   93: aload 4
    //   95: aload 5
    //   97: invokespecial 144	com/google/android/gms/analytics/AnalyticsService$1:<init>	(Lcom/google/android/gms/analytics/AnalyticsService;ILcom/google/android/gms/analytics/internal/q;Lcom/google/android/gms/analytics/internal/f;)V
    //   100: invokevirtual 149	com/google/android/gms/analytics/internal/m:a	(Lcom/google/android/gms/analytics/internal/ah;)V
    //   103: iconst_2
    //   104: ireturn
    //   105: astore 5
    //   107: aload 4
    //   109: monitorexit
    //   110: aload 5
    //   112: athrow
    //   113: astore 4
    //   115: goto -78 -> 37
    //   118: aload 5
    //   120: ldc -105
    //   122: iload_3
    //   123: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   126: aload_1
    //   127: invokevirtual 127	com/google/android/gms/analytics/internal/f:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   130: goto -57 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	this	AnalyticsService
    //   0	133	1	paramIntent	Intent
    //   0	133	2	paramInt1	int
    //   0	133	3	paramInt2	int
    //   113	1	4	localSecurityException	SecurityException
    //   11	85	5	localObject2	Object
    //   105	14	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   8	13	105	finally
    //   18	34	105	finally
    //   34	37	105	finally
    //   107	110	105	finally
    //   0	8	113	java/lang/SecurityException
    //   110	113	113	java/lang/SecurityException
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/analytics/AnalyticsService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */