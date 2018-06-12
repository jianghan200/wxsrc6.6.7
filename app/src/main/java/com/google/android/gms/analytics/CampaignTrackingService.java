package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.analytics.internal.f;
import com.google.android.gms.analytics.internal.k;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.common.internal.w;

public class CampaignTrackingService
  extends Service
{
  private static Boolean aEy;
  private Handler mHandler;
  
  public static boolean ab(Context paramContext)
  {
    w.ah(paramContext);
    if (aEy != null) {
      return aEy.booleanValue();
    }
    boolean bool = k.a(paramContext, CampaignTrackingService.class);
    aEy = Boolean.valueOf(bool);
    return bool;
  }
  
  protected final void a(f paramf, Handler paramHandler, int paramInt)
  {
    paramHandler.post(new CampaignTrackingService.3(this, paramInt, paramf));
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    q.ac(this).nr().aO("CampaignTrackingService is starting up");
  }
  
  public void onDestroy()
  {
    q.ac(this).nr().aO("CampaignTrackingService is shutting down");
    super.onDestroy();
  }
  
  /* Error */
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: getstatic 89	com/google/android/gms/analytics/CampaignTrackingReceiver:aEv	Ljava/lang/Object;
    //   3: astore 4
    //   5: aload 4
    //   7: monitorenter
    //   8: getstatic 93	com/google/android/gms/analytics/CampaignTrackingReceiver:aEw	Lcom/google/android/gms/c/as;
    //   11: astore 5
    //   13: aload 5
    //   15: ifnull +19 -> 34
    //   18: aload 5
    //   20: getfield 99	com/google/android/gms/c/as:aZe	Landroid/os/PowerManager$WakeLock;
    //   23: invokevirtual 104	android/os/PowerManager$WakeLock:isHeld	()Z
    //   26: ifeq +8 -> 34
    //   29: aload 5
    //   31: invokevirtual 107	com/google/android/gms/c/as:release	()V
    //   34: aload 4
    //   36: monitorexit
    //   37: aload_0
    //   38: invokestatic 62	com/google/android/gms/analytics/internal/q:ac	(Landroid/content/Context;)Lcom/google/android/gms/analytics/internal/q;
    //   41: astore 7
    //   43: aload 7
    //   45: invokevirtual 66	com/google/android/gms/analytics/internal/q:nr	()Lcom/google/android/gms/analytics/internal/f;
    //   48: astore 6
    //   50: aconst_null
    //   51: astore 4
    //   53: getstatic 113	com/google/android/gms/common/internal/f:aNr	Z
    //   56: ifeq +103 -> 159
    //   59: aload 6
    //   61: ldc 115
    //   63: invokevirtual 118	com/google/android/gms/analytics/internal/f:aS	(Ljava/lang/String;)V
    //   66: aload 4
    //   68: astore_1
    //   69: aload_0
    //   70: getfield 120	com/google/android/gms/analytics/CampaignTrackingService:mHandler	Landroid/os/Handler;
    //   73: astore 5
    //   75: aload 5
    //   77: astore 4
    //   79: aload 5
    //   81: ifnonnull +22 -> 103
    //   84: new 47	android/os/Handler
    //   87: dup
    //   88: aload_0
    //   89: invokevirtual 124	com/google/android/gms/analytics/CampaignTrackingService:getMainLooper	()Landroid/os/Looper;
    //   92: invokespecial 127	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   95: astore 4
    //   97: aload_0
    //   98: aload 4
    //   100: putfield 120	com/google/android/gms/analytics/CampaignTrackingService:mHandler	Landroid/os/Handler;
    //   103: aload_1
    //   104: invokestatic 133	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   107: ifeq +62 -> 169
    //   110: getstatic 113	com/google/android/gms/common/internal/f:aNr	Z
    //   113: ifne +10 -> 123
    //   116: aload 6
    //   118: ldc -121
    //   120: invokevirtual 138	com/google/android/gms/analytics/internal/f:aR	(Ljava/lang/String;)V
    //   123: aload 7
    //   125: invokevirtual 142	com/google/android/gms/analytics/internal/q:ns	()Lcom/google/android/gms/c/ah;
    //   128: new 144	com/google/android/gms/analytics/CampaignTrackingService$1
    //   131: dup
    //   132: aload_0
    //   133: aload 6
    //   135: aload 4
    //   137: iload_3
    //   138: invokespecial 147	com/google/android/gms/analytics/CampaignTrackingService$1:<init>	(Lcom/google/android/gms/analytics/CampaignTrackingService;Lcom/google/android/gms/analytics/internal/f;Landroid/os/Handler;I)V
    //   141: invokevirtual 153	com/google/android/gms/c/ah:d	(Ljava/lang/Runnable;)V
    //   144: iconst_2
    //   145: ireturn
    //   146: astore 5
    //   148: aload 4
    //   150: monitorexit
    //   151: aload 5
    //   153: athrow
    //   154: astore 4
    //   156: goto -119 -> 37
    //   159: aload_1
    //   160: ldc -101
    //   162: invokevirtual 161	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   165: astore_1
    //   166: goto -97 -> 69
    //   169: invokestatic 167	com/google/android/gms/analytics/internal/ac:nV	()I
    //   172: istore_2
    //   173: aload_1
    //   174: astore 5
    //   176: aload_1
    //   177: invokevirtual 172	java/lang/String:length	()I
    //   180: iload_2
    //   181: if_icmple +29 -> 210
    //   184: aload 6
    //   186: ldc -82
    //   188: aload_1
    //   189: invokevirtual 172	java/lang/String:length	()I
    //   192: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   195: iload_2
    //   196: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   199: invokevirtual 183	com/google/android/gms/analytics/internal/f:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   202: aload_1
    //   203: iconst_0
    //   204: iload_2
    //   205: invokevirtual 187	java/lang/String:substring	(II)Ljava/lang/String;
    //   208: astore 5
    //   210: aload 6
    //   212: ldc -67
    //   214: iload_3
    //   215: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   218: aload 5
    //   220: invokevirtual 191	com/google/android/gms/analytics/internal/f:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   223: aload 7
    //   225: invokevirtual 195	com/google/android/gms/analytics/internal/q:nt	()Lcom/google/android/gms/analytics/internal/m;
    //   228: astore_1
    //   229: new 197	com/google/android/gms/analytics/CampaignTrackingService$2
    //   232: dup
    //   233: aload_0
    //   234: aload 6
    //   236: aload 4
    //   238: iload_3
    //   239: invokespecial 198	com/google/android/gms/analytics/CampaignTrackingService$2:<init>	(Lcom/google/android/gms/analytics/CampaignTrackingService;Lcom/google/android/gms/analytics/internal/f;Landroid/os/Handler;I)V
    //   242: astore 4
    //   244: aload 5
    //   246: ldc -56
    //   248: invokestatic 204	com/google/android/gms/common/internal/w:i	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   251: pop
    //   252: aload_1
    //   253: getfield 210	com/google/android/gms/analytics/internal/n:aFn	Lcom/google/android/gms/analytics/internal/q;
    //   256: invokevirtual 142	com/google/android/gms/analytics/internal/q:ns	()Lcom/google/android/gms/c/ah;
    //   259: new 212	com/google/android/gms/analytics/internal/m$2
    //   262: dup
    //   263: aload_1
    //   264: aload 5
    //   266: aload 4
    //   268: invokespecial 215	com/google/android/gms/analytics/internal/m$2:<init>	(Lcom/google/android/gms/analytics/internal/m;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   271: invokevirtual 153	com/google/android/gms/c/ah:d	(Ljava/lang/Runnable;)V
    //   274: iconst_2
    //   275: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	276	0	this	CampaignTrackingService
    //   0	276	1	paramIntent	Intent
    //   0	276	2	paramInt1	int
    //   0	276	3	paramInt2	int
    //   154	83	4	localSecurityException	SecurityException
    //   242	25	4	local2	CampaignTrackingService.2
    //   11	69	5	localObject2	Object
    //   146	6	5	localObject3	Object
    //   174	91	5	localObject4	Object
    //   48	187	6	localf	f
    //   41	183	7	localq	q
    // Exception table:
    //   from	to	target	type
    //   8	13	146	finally
    //   18	34	146	finally
    //   34	37	146	finally
    //   148	151	146	finally
    //   0	8	154	java/lang/SecurityException
    //   151	154	154	java/lang/SecurityException
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/CampaignTrackingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */