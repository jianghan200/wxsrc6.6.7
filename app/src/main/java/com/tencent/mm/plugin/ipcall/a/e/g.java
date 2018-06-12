package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;

public final class g
  extends a
{
  private long krK;
  public long krL;
  public long krZ = 0L;
  public String ksa = "";
  public String ksb = "";
  public long ksc = 0L;
  public long ksd = 0L;
  public long kse = 0L;
  public String ksf = "";
  
  protected final void aXS()
  {
    h.mEJ.h(12933, new Object[] { Long.valueOf(this.krK), Long.valueOf(this.krL), Long.valueOf(this.krZ), this.ksa, this.ksb, Long.valueOf(this.ksc), Long.valueOf(this.ksd), Long.valueOf(this.kse), this.ksf });
  }
  
  public final void reset()
  {
    this.krK = 0L;
    this.krL = 0L;
    this.krZ = 0L;
    this.ksa = "";
    this.ksb = "";
    this.ksc = 0L;
    this.ksd = 0L;
    this.kse = 0L;
    this.ksf = "";
  }
  
  public final void start()
  {
    super.start();
    this.krK = bi.VF();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */