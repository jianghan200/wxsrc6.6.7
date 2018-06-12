package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;

public final class b
  extends a
{
  private long krK;
  public long krL;
  public long krM = 0L;
  public long krN = 0L;
  public long krO = 0L;
  
  protected final void aXS()
  {
    h.mEJ.h(12930, new Object[] { Long.valueOf(this.krK), Long.valueOf(this.krL), Long.valueOf(this.krM), Long.valueOf(this.krN), Long.valueOf(this.krO) });
  }
  
  public final void reset()
  {
    this.krK = 0L;
    this.krL = 0L;
    this.krM = 0L;
    this.krN = 0L;
    this.krO = 0L;
  }
  
  public final void start()
  {
    super.start();
    this.krK = bi.VF();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */