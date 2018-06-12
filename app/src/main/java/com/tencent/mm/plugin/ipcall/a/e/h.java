package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.mm.sdk.platformtools.bi;

public final class h
  extends a
{
  private long krK;
  public long krL;
  private long ksg = 0L;
  public long ksh = 0L;
  public long ksi = 0L;
  public long ksj = 0L;
  
  protected final void aXS()
  {
    com.tencent.mm.plugin.report.service.h.mEJ.h(12931, new Object[] { Long.valueOf(this.krK), Long.valueOf(this.krL), Long.valueOf(this.ksg), Long.valueOf(this.ksh), Long.valueOf(this.ksi), Long.valueOf(this.ksj) });
  }
  
  public final void reset()
  {
    this.krK = 0L;
    this.krL = 0L;
    this.ksg = 0L;
    this.ksh = 0L;
    this.ksi = 0L;
    this.ksj = 0L;
  }
  
  public final void start()
  {
    super.start();
    this.krK = bi.VF();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/e/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */