package com.tencent.tencentmap.mapsdk.a;

import com.qq.sim.Millis100TimeProvider;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

public class bd
{
  private AtomicBoolean a = new AtomicBoolean();
  private long b = Millis100TimeProvider.INSTANCE.currentTimeMillis();
  private long c = 0L;
  private long d = 0L;
  private long e = 0L;
  private long f = 0L;
  private long g = 0L;
  private boolean h = false;
  private boolean i = true;
  private long j = 0L;
  
  public void a(long paramLong)
  {
    this.j = paramLong;
  }
  
  public void a(be parambe, bb parambb, int paramInt)
  {
    if (paramInt == 0)
    {
      this.c = 0L;
      this.d = 0L;
      this.a.set(true);
      this.h = false;
      this.g += 1L;
      if (this.b + parambe.c().taf_timeout_interval() < Millis100TimeProvider.INSTANCE.currentTimeMillis())
      {
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.b = Millis100TimeProvider.INSTANCE.currentTimeMillis();
      }
      if (!this.i) {
        break label378;
      }
      l1 = this.e;
      l2 = this.f;
      l3 = this.g;
      if ((this.e >= parambe.c().taf_min_timeout_invoke()) && (bw.a(this.e, l1 + l2 + l3, 2) > parambe.c().taf_timeout_radio())) {
        this.i = false;
      }
      if ((this.i) && (this.c >= parambe.c().taf_frequence_fail_invoke()) && (this.d + 5000L > Millis100TimeProvider.INSTANCE.currentTimeMillis())) {
        this.i = false;
      }
      if ((this.i) && (this.h)) {
        this.i = false;
      }
    }
    label378:
    while (paramInt != 0)
    {
      long l1;
      long l2;
      long l3;
      return;
      if (paramInt == 2)
      {
        if (!this.a.get()) {
          this.c += 1L;
        }
        for (;;)
        {
          this.h = false;
          this.e += 1L;
          break;
          this.a.set(false);
          this.c = 1L;
          this.d = Millis100TimeProvider.INSTANCE.currentTimeMillis();
        }
      }
      if (paramInt == 1)
      {
        if (!this.a.get()) {
          this.c += 1L;
        }
        for (;;)
        {
          this.h = false;
          this.f += 1L;
          break;
          this.a.set(false);
          this.c = 1L;
          this.d = Millis100TimeProvider.INSTANCE.currentTimeMillis();
        }
      }
      if (paramInt != 3) {
        break;
      }
      this.h = true;
      break;
    }
    this.i = true;
  }
  
  public boolean a()
  {
    return this.i;
  }
  
  public long b()
  {
    return this.j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("lastCallSucc:").append(this.a.get()).append("|");
    localStringBuilder.append("timeout_startTime:").append(new Date(this.b)).append("|");
    localStringBuilder.append("frequenceFailInvoke:").append(this.c).append("|");
    localStringBuilder.append("timeoutCount:").append(this.e).append("|");
    localStringBuilder.append("failedCount:").append(this.f).append("|");
    localStringBuilder.append("succCount:").append(this.g).append("|");
    localStringBuilder.append("netConnectTimeout:").append(this.h).append("|");
    localStringBuilder.append("active:").append(this.i).append("|");
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */