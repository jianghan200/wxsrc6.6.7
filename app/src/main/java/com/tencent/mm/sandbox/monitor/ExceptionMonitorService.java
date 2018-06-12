package com.tencent.mm.sandbox.monitor;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import com.tencent.mm.sandbox.c;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class ExceptionMonitorService
  extends Service
{
  public static long dDj = 0L;
  public static int sDa = 0;
  private static ExceptionMonitorService sDe = null;
  private long sDb = 300000L;
  private ag sDc = new ag();
  private Runnable sDd = new ExceptionMonitorService.1(this);
  private long sDf;
  
  public static void fn(Context paramContext)
  {
    Object localObject = new Intent(paramContext, CrashUploadAlarmReceiver.class);
    if (PendingIntent.getBroadcast(paramContext, 0, (Intent)localObject, 536870912) == null)
    {
      localObject = PendingIntent.getBroadcast(paramContext, 0, (Intent)localObject, 0);
      paramContext = (AlarmManager)paramContext.getSystemService("alarm");
      long l = bi.VF() + 1800000L;
      paramContext.set(0, l, (PendingIntent)localObject);
      x.d("MicroMsg.CrashMonitorService", "dkcrash startAlarmMgr pendingIntent:%d %d", new Object[] { Integer.valueOf(((PendingIntent)localObject).hashCode()), Long.valueOf(l) });
    }
  }
  
  private void l(Intent paramIntent)
  {
    if (paramIntent == null) {}
    for (;;)
    {
      return;
      this.sDc.removeCallbacks(this.sDd);
      this.sDc.postDelayed(this.sDd, this.sDb);
      String str3 = paramIntent.getAction();
      x.d("MicroMsg.CrashMonitorService", "dkcrash handleCommand action:" + str3);
      try
      {
        String str2 = paramIntent.getStringExtra("tag");
        String str1 = str2;
        if (str2 == null) {
          str1 = "exception";
        }
        int i = paramIntent.getIntExtra("exceptionPid", 0);
        str1.equals("exception");
        sDa = i;
        dDj = paramIntent.getLongExtra("exceptionTime", SystemClock.elapsedRealtime());
        str2 = paramIntent.getStringExtra("exceptionMsg");
        String str4 = paramIntent.getStringExtra("userName");
        boolean bool = paramIntent.getBooleanExtra("exceptionWriteSdcard", true);
        x.d("MicroMsg.CrashMonitorService", "dkcrash handleCommand. action=" + str3 + " pid:" + i + " tag=" + str1 + ", userName=" + str4 + ", message" + str2);
        if (!bi.oW(str2))
        {
          if (a.a(str4, str1, new b.a(str4, str1, bi.VE(), str2, bool)) == 0) {
            fn(this);
          }
          if (System.currentTimeMillis() - this.sDf > 600000L)
          {
            this.sDf = System.currentTimeMillis();
            e.post(new Runnable()
            {
              public final void run() {}
            }, "RecoveryWriteLogThread");
            return;
          }
        }
      }
      catch (Exception paramIntent)
      {
        x.printErrStackTrace("MicroMsg.CrashMonitorService", paramIntent, "", new Object[0]);
      }
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    sDe = this;
    c.i(hashCode(), this);
    this.sDc.postDelayed(this.sDd, this.sDb);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    sDe = null;
    c.j(hashCode(), this);
    this.sDc.removeCallbacks(this.sDd);
  }
  
  public void onStart(Intent paramIntent, int paramInt)
  {
    super.onStart(paramIntent, paramInt);
    l(paramIntent);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    l(paramIntent);
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/sandbox/monitor/ExceptionMonitorService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */