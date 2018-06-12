package com.tencent.matrix.a.b;

import android.app.AlarmManager.OnAlarmListener;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.WorkSource;
import com.tencent.matrix.c.c.a;
import java.util.List;
import java.util.Map;

public final class c
  implements b.c, e.b, c.a
{
  public final com.tencent.matrix.a.a.a boV;
  public final d bpJ;
  private final com.tencent.matrix.a.a bpK;
  public boolean bpL;
  public f bpM;
  public a bpN;
  final Context mContext;
  
  public c(com.tencent.matrix.a.a parama)
  {
    this.boV = parama.boV;
    this.bpJ = new d();
    this.bpK = parama;
    this.mContext = parama.application;
  }
  
  public final void a(final int paramInt1, final long paramLong1, long paramLong2, final long paramLong3, int paramInt2, final PendingIntent paramPendingIntent, AlarmManager.OnAlarmListener paramOnAlarmListener)
  {
    com.tencent.matrix.d.b.d("Matrix.BatteryCanaryCore", "onAlarmSet: type:%d, triggerAtMillis:%d, windowMillis:%d, intervalMillis:%d, flags:%d, operationInfo:%s, onAlarmListener:%s", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong3), Integer.valueOf(paramInt2), paramPendingIntent, paramOnAlarmListener });
    if (this.bpN == null) {
      return;
    }
    paramPendingIntent = new Runnable()
    {
      public final void run()
      {
        a locala = c.this.bpN;
        int k = paramInt1;
        long l1 = paramLong1;
        long l2 = paramLong3;
        long l3 = paramPendingIntent;
        int m = this.oj;
        Object localObject = this.bqb;
        AlarmManager.OnAlarmListener localOnAlarmListener = this.bqc;
        String str1 = this.bpT;
        a.b localb;
        String str2;
        int i;
        if (locala.bpk != null)
        {
          localb = locala.bpk;
          str2 = com.tencent.matrix.d.c.h("yyyy-MM-dd HH:mm", System.currentTimeMillis());
          if (localObject != null) {
            break label242;
          }
          i = -1;
          if (localOnAlarmListener != null) {
            break label251;
          }
        }
        label242:
        label251:
        for (int j = -1;; j = localOnAlarmListener.hashCode())
        {
          localb.bX(String.format("%s onAlarmSet type:%d triggerAtMillis:%d windowMillis:%d intervalMillis:%d flags:%d operationInfo:%s operationHashCode:%d onAlarmListener:%s onAlarmListenerHashCode:%d\n%s\n\n", new Object[] { str2, Integer.valueOf(k), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Integer.valueOf(m), localObject, Integer.valueOf(i), localOnAlarmListener, Integer.valueOf(j), str1 }));
          localObject = new a.a(k, l1, l3, (PendingIntent)localObject, localOnAlarmListener, str1);
          locala.a(((a.a)localObject).bpq, ((a.a)localObject).bpp);
          locala.bpl.add(localObject);
          locala.ti();
          return;
          i = ((PendingIntent)localObject).hashCode();
          break;
        }
      }
    };
    this.bpJ.f(paramPendingIntent);
  }
  
  public final void a(final PendingIntent paramPendingIntent, final AlarmManager.OnAlarmListener paramOnAlarmListener)
  {
    com.tencent.matrix.d.b.d("Matrix.BatteryCanaryCore", "onAlarmRemove: operationInfo:%s, onAlarmListener:%s", new Object[] { paramPendingIntent, paramOnAlarmListener });
    paramPendingIntent = new Runnable()
    {
      public final void run()
      {
        int j = -1;
        a locala = c.this.bpN;
        PendingIntent localPendingIntent = paramPendingIntent;
        AlarmManager.OnAlarmListener localOnAlarmListener = paramOnAlarmListener;
        String str1 = this.bpT;
        a.b localb;
        String str2;
        int i;
        if (locala.bpk != null)
        {
          localb = locala.bpk;
          str2 = com.tencent.matrix.d.c.h("yyyy-MM-dd HH:mm", System.currentTimeMillis());
          if (localPendingIntent != null) {
            break label132;
          }
          i = -1;
          if (localOnAlarmListener != null) {
            break label141;
          }
        }
        for (;;)
        {
          localb.bX(String.format("%s onAlarmRemove operationInfo:%s operationHashCode:%d onAlarmListener:%s onAlarmListenerHashCode:%d\n%s\n\n", new Object[] { str2, localPendingIntent, Integer.valueOf(i), localOnAlarmListener, Integer.valueOf(j), str1 }));
          locala.a(localOnAlarmListener, new a.e(localPendingIntent));
          locala.ti();
          return;
          label132:
          i = localPendingIntent.hashCode();
          break;
          label141:
          j = localOnAlarmListener.hashCode();
        }
      }
    };
    this.bpJ.f(paramPendingIntent);
  }
  
  public final void a(final IBinder paramIBinder, final int paramInt)
  {
    if (this.bpM == null) {
      return;
    }
    paramIBinder = new Runnable()
    {
      public final void run()
      {
        int i = 1;
        f localf = c.this.bpM;
        Object localObject1 = paramIBinder;
        int j = paramInt;
        long l = this.bpW;
        com.tencent.matrix.d.b.i("Matrix.WakeLockDetector", "onReleaseWakeLock token:%s", new Object[] { localObject1 });
        Object localObject2;
        if (localf.bql != null)
        {
          localObject2 = localf.bql;
          String str1 = localObject1.toString();
          String str2 = com.tencent.matrix.d.c.h("yyyy-MM-dd HH:mm", l);
          ((f.e)localObject2).bqy.append(str2).append(" onReleaseWakeLock token:").append(str1).append(" flags:").append(j).append("\n\n");
          ((f.e)localObject2).bqx += 1;
          ((f.e)localObject2).tq();
        }
        localObject1 = localObject1.toString();
        if (localf.bqg.containsKey(localObject1))
        {
          localObject2 = ((f.d)localf.bqg.get(localObject1)).tag;
          if (localf.bqh.containsKey(localObject2))
          {
            localObject2 = (f.c)localf.bqh.get(localObject2);
            ((f.c)localObject2).tp();
            ((f.c)localObject2).bqt.remove(localObject1);
            if (((f.c)localObject2).bqt.isEmpty()) {
              break label261;
            }
            if (i == 0) {
              ((f.c)localObject2).bqu = -1L;
            }
          }
        }
        for (;;)
        {
          localf.tn();
          localf.bqg.remove(localObject1);
          return;
          label261:
          i = 0;
          break;
          com.tencent.matrix.d.b.i("Matrix.WakeLockDetector", "onReleaseWakeLock not in mWakeLockInfoMap: %s", new Object[] { localObject1 });
        }
      }
    };
    this.bpJ.f(paramIBinder);
  }
  
  public final void a(final IBinder paramIBinder, final int paramInt, final String paramString1, final String paramString2, final WorkSource paramWorkSource, final String paramString3)
  {
    if (this.bpM == null) {
      return;
    }
    paramIBinder = new Runnable()
    {
      public final void run()
      {
        f localf = c.this.bpM;
        Object localObject1 = paramIBinder;
        int i = paramInt;
        String str2 = paramString1;
        String str1 = this.bpT;
        long l = this.bpU;
        com.tencent.matrix.d.b.i("Matrix.WakeLockDetector", "onAcquireWakeLock token:%s tag:%s", new Object[] { localObject1, str2 });
        if (localf.bql != null)
        {
          localObject2 = localf.bql;
          String str3 = localObject1.toString();
          String str4 = com.tencent.matrix.d.c.h("yyyy-MM-dd HH:mm", l);
          ((f.e)localObject2).bqy.append(str4).append(" onAcquireWakeLock token:").append(str3).append(" flags:").append(i).append(" tag:").append(str2).append('\n').append(str1).append('\n');
          ((f.e)localObject2).bqx += 1;
          ((f.e)localObject2).tq();
        }
        Object localObject2 = localObject1.toString();
        if (!localf.bqg.containsKey(localObject2))
        {
          localObject1 = new f.d((String)localObject2, str2, i, l);
          localf.bqg.put(localObject2, localObject1);
        }
        for (;;)
        {
          ((f.d)localObject1).bqs.bY(str1);
          if (!localf.bqh.containsKey(str2)) {
            localf.bqh.put(str2, new f.c(str2));
          }
          localObject1 = (f.c)localf.bqh.get(str2);
          boolean bool = localf.bqj.isScreenOn();
          ((f.c)localObject1).bqq += 1;
          if (!bool) {
            ((f.c)localObject1).bqr += 1;
          }
          ((f.c)localObject1).bqt.put(localObject2, Boolean.valueOf(true));
          if (((f.c)localObject1).bqu < 0L) {
            ((f.c)localObject1).bqu = System.currentTimeMillis();
          }
          ((f.c)localObject1).bqs.bY(str1);
          localf.bqj.b(localf.bqk, localf.bqi);
          return;
          localObject1 = (f.d)localf.bqg.get(localObject2);
        }
      }
    };
    this.bpJ.f(paramIBinder);
  }
  
  public final void a(com.tencent.matrix.c.b paramb)
  {
    this.bpK.a(paramb);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/a/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */