package com.tencent.mm.plugin.mmsight.model;

import com.tencent.mm.sdk.platformtools.bi;

public final class b
{
  long etW = 0L;
  long lfj = bi.VG();
  long lfk = bi.VG();
  private String tag = "default";
  long value = 0L;
  
  public b(String paramString)
  {
    this.tag = paramString;
  }
  
  public final String bdJ()
  {
    if (this.etW == 0L) {
      return "";
    }
    double d2 = (this.lfk - this.lfj) / 1000.0D;
    double d1 = d2;
    if (d2 == 0.0D) {
      d1 = 1.0D;
    }
    return 1.0D * this.etW / d1;
  }
  
  public final void ec(long paramLong)
  {
    if (this.etW == 0L) {
      this.lfj = bi.VG();
    }
    this.value += paramLong;
    this.etW += 1L;
    this.lfk = bi.VG();
  }
  
  public final String getValue()
  {
    if (this.etW == 0L) {
      return "";
    }
    double d2 = (this.lfk - this.lfj) / 1000.0D;
    double d1 = d2;
    if (d2 == 0.0D) {
      d1 = 1.0D;
    }
    return String.format("CounterUtil %s tag %s count %s passed %.3f perValue %.3f/count counttime %.3f/s valuetime %.3f/s st:%s ed:%s diff%s", new Object[] { "", this.tag, Long.valueOf(this.etW), Double.valueOf(d1), Double.valueOf(this.value * 1.0D / this.etW), Double.valueOf(this.etW * 1.0D / d1), Double.valueOf(1.0D * this.value / d1), Long.valueOf(this.lfj), Long.valueOf(this.lfk), Long.valueOf(this.lfk - this.lfj) });
  }
  
  public final void reset()
  {
    this.value = 0L;
    this.etW = 0L;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */