package com.tencent.mm.sdk.f;

import android.os.Debug;
import junit.framework.Assert;

final class g
  implements Comparable<g>, Runnable
{
  private static final String FORMAT;
  private static int sLk = 1000;
  long dFc;
  final String jGC;
  final int priority;
  final Runnable sHb;
  long sHf;
  long sHh;
  final boolean sLl;
  e.b sLm;
  boolean started = false;
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("taskName = %s");
    localStringBuilder.append("|priority = %d");
    localStringBuilder.append("|pooled = %b");
    localStringBuilder.append("|addTime = %d");
    localStringBuilder.append("|usedTime = %d");
    localStringBuilder.append("|cpuTime = %d");
    localStringBuilder.append("|started = %b");
    FORMAT = localStringBuilder.toString();
  }
  
  g(Runnable paramRunnable, String paramString, int paramInt, boolean paramBoolean, e.b paramb)
  {
    Assert.assertNotNull("ThreadTask arg task is null!", paramRunnable);
    Assert.assertNotNull("ThreadTask arg name is null!", paramString);
    this.sHb = paramRunnable;
    this.jGC = paramString;
    this.priority = paramInt;
    this.sLl = paramBoolean;
    this.sHf = System.currentTimeMillis();
    this.sLm = paramb;
  }
  
  public final void run()
  {
    this.dFc = System.currentTimeMillis();
    this.sHh = Debug.threadCpuTimeNanos();
    this.started = true;
    this.sHb.run();
    this.dFc = (System.currentTimeMillis() - this.dFc);
    this.sHh = (Debug.threadCpuTimeNanos() - this.sHh);
  }
  
  public final String toString()
  {
    return String.format(FORMAT, new Object[] { this.jGC, Integer.valueOf(this.priority), Boolean.valueOf(this.sLl), Long.valueOf(this.sHf), Long.valueOf(this.dFc), Long.valueOf(this.sHh), Boolean.valueOf(this.started) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */