package com.tencent.mm.plugin.appbrand.performance;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.RandomAccessFile;

public final class c
{
  private final int gpG;
  private volatile RandomAccessFile gpH;
  private volatile RandomAccessFile gpI;
  private long gpJ;
  private long gpK;
  private long gpL;
  
  public c(int paramInt)
  {
    this.gpG = paramInt;
  }
  
  public final double ami()
  {
    double d3 = 0.0D;
    double d2 = d3;
    for (;;)
    {
      long l1;
      long l2;
      long l3;
      try
      {
        if (this.gpI == null)
        {
          d2 = d3;
          this.gpI = new RandomAccessFile("/proc/" + this.gpG + "/stat", "r");
        }
        d2 = d3;
        this.gpI.seek(0L);
        d2 = d3;
        Object localObject1 = this.gpI.readLine();
        d2 = d3;
        if (bi.oW((String)localObject1)) {
          return 0.0D;
        }
        d2 = d3;
        localObject1 = ((String)localObject1).split(" ");
        d2 = d3;
        if (localObject1.length < 17) {
          return 0.0D;
        }
        d2 = d3;
        if (this.gpH == null)
        {
          d2 = d3;
          this.gpH = new RandomAccessFile("/proc/stat", "r");
        }
        d2 = d3;
        this.gpH.seek(0L);
        d2 = d3;
        localObject2 = this.gpH.readLine();
        d2 = d3;
        if (bi.oW((String)localObject2))
        {
          l1 = 0L;
          d2 = d3;
          l2 = Long.parseLong(localObject1[13]);
          d2 = d3;
          l3 = Long.parseLong(localObject1[14]);
          double d1 = d3;
          d2 = d3;
          if (this.gpJ != 0L)
          {
            d2 = d3;
            double d4 = (l2 - this.gpK) * 100L / (l1 - this.gpJ);
            d2 = d3;
            d1 = (l3 - this.gpL) * 100L / (l1 - this.gpJ);
            d2 = d3;
            d4 = Math.max(0.0D, d4);
            d2 = d3;
            d1 = Math.max(0.0D, d1) + d4;
          }
          d2 = d1;
          this.gpJ = l1;
          d2 = d1;
          this.gpK = l2;
          d2 = d1;
          this.gpL = l3;
          return d1;
        }
      }
      catch (Exception localException)
      {
        x.e(" MicroMsg.CpuSampler", "read pid stat file error: " + localException);
        return d2;
      }
      d2 = d3;
      Object localObject2 = ((String)localObject2).split(" ");
      d2 = d3;
      if (localObject2.length < 9)
      {
        l1 = 0L;
      }
      else
      {
        d2 = d3;
        l1 = Long.parseLong(localObject2[2]);
        d2 = d3;
        l2 = Long.parseLong(localObject2[3]);
        d2 = d3;
        l3 = Long.parseLong(localObject2[4]);
        d2 = d3;
        long l4 = Long.parseLong(localObject2[5]);
        d2 = d3;
        long l5 = Long.parseLong(localObject2[6]);
        d2 = d3;
        long l6 = Long.parseLong(localObject2[7]);
        d2 = d3;
        long l7 = Long.parseLong(localObject2[8]);
        d2 = d3;
        long l8 = Long.parseLong(localObject2[9]);
        l1 = l8 + (l1 + l2 + l3 + l4 + l5 + l6 + l7);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/performance/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */