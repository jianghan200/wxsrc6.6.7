package com.tencent.mm.sdk.platformtools;

import android.os.Debug;
import android.os.Handler;
import android.os.Process;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class am
  implements Runnable
{
  private static final String sHl;
  private static final String sHm;
  long dFc;
  long endTime;
  final Handler handler;
  final String jGC;
  int priority;
  final Runnable sHb;
  final Object sHc;
  long sHd;
  final a sHe;
  long sHf;
  long sHg;
  long sHh;
  long sHi;
  long sHj;
  float sHk = -1.0F;
  boolean started = false;
  final Thread thread;
  String threadName;
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("taskName = %s");
    localStringBuilder.append("|token = %s");
    localStringBuilder.append("|handler = %s");
    localStringBuilder.append("|threadName = %s");
    localStringBuilder.append("|threadId = %d");
    localStringBuilder.append("|priority = %d");
    localStringBuilder.append("|addTime = %d");
    localStringBuilder.append("|delayTime = %d");
    localStringBuilder.append("|usedTime = %d");
    localStringBuilder.append("|cpuTime = %d");
    localStringBuilder.append("|started = %b");
    sHl = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("taskName = %s");
    localStringBuilder.append(" | addTime = %s");
    localStringBuilder.append(" | endTime = %s");
    localStringBuilder.append(" | usedTime = %d");
    localStringBuilder.append(" | cpuTime = %d");
    localStringBuilder.append(" | threadCpuTime = %d");
    localStringBuilder.append(" | totalCpuTime = %d");
    localStringBuilder.append(" | threadCpuRate = %.1f");
    sHm = localStringBuilder.toString();
  }
  
  am(Thread paramThread, Handler paramHandler, Runnable paramRunnable, Object paramObject, a parama)
  {
    this.thread = paramThread;
    if (paramThread != null)
    {
      this.threadName = paramThread.getName();
      this.sHd = paramThread.getId();
      this.priority = paramThread.getPriority();
    }
    this.handler = paramHandler;
    this.sHb = paramRunnable;
    paramHandler = paramRunnable.getClass().getName();
    paramRunnable = paramRunnable.toString();
    paramThread = paramHandler;
    if (!bi.oW(paramRunnable))
    {
      int i = paramRunnable.indexOf('|');
      paramThread = paramHandler;
      if (i > 0) {
        paramThread = paramHandler + "_" + paramRunnable.substring(i + 1);
      }
    }
    this.jGC = paramThread;
    this.sHc = paramObject;
    this.sHe = parama;
    this.sHf = System.currentTimeMillis();
  }
  
  public final String dump(boolean paramBoolean)
  {
    if (paramBoolean) {
      return String.format(sHl, new Object[] { this.jGC, this.sHc, this.handler, this.threadName, Long.valueOf(this.sHd), Integer.valueOf(this.priority), Long.valueOf(this.sHf), Long.valueOf(this.sHg), Long.valueOf(this.dFc), Long.valueOf(this.sHh), Boolean.valueOf(this.started) });
    }
    return String.format(sHm, new Object[] { this.jGC, new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(this.sHf)), new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(this.endTime)), Long.valueOf(this.dFc), Long.valueOf(this.sHh), Long.valueOf(this.sHi), Long.valueOf(this.sHj), Float.valueOf(this.sHk) });
  }
  
  public final void run()
  {
    int i = Process.myTid();
    new StringBuilder("/proc/self/task/").append(i).append("/stat");
    this.dFc = System.currentTimeMillis();
    this.sHh = Debug.threadCpuTimeNanos();
    this.sHi = -1L;
    this.sHj = -1L;
    this.started = true;
    this.sHb.run();
    this.sHi = (-1L - this.sHi);
    this.sHj = (-1L - this.sHj);
    this.endTime = System.currentTimeMillis();
    this.dFc = (this.endTime - this.dFc);
    this.sHh = ((Debug.threadCpuTimeNanos() - this.sHh) / 1000000L);
    if (this.sHj != 0L) {
      this.sHk = ((float)(100L * this.sHi) / (float)this.sHj);
    }
    if (this.sHe != null)
    {
      this.sHe.a(this.sHb, this);
      this.sHe.a(this, this.thread, this.dFc, this.sHh, this.sHk);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(Runnable paramRunnable, am paramam);
    
    public abstract void a(Runnable paramRunnable, Thread paramThread, long paramLong1, long paramLong2, float paramFloat);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */