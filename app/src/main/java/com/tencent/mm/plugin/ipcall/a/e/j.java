package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;

public final class j
  extends a
{
  private long krK;
  public long krL;
  public long ksk = 0L;
  public long ksl = 0L;
  public long ksm = 0L;
  
  protected final void aXS()
  {
    h.mEJ.h(12934, new Object[] { Long.valueOf(this.krK), Long.valueOf(this.krL), Long.valueOf(this.ksk), Long.valueOf(this.ksl), Long.valueOf(this.ksm) });
  }
  
  public final void reset()
  {
    this.krK = 0L;
    this.krL = 0L;
    this.ksk = 0L;
    this.ksl = 0L;
    this.ksm = 0L;
  }
  
  public final void start()
  {
    super.start();
    this.krK = bi.VF();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/e/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */