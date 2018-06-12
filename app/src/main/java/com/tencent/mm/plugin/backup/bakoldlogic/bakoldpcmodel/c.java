package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;

public final class c
{
  public int dBM;
  public int gZt;
  public int gZu;
  private int gZv;
  int gZw;
  int gZx;
  int gZy;
  public int gZz;
  
  private void reset()
  {
    this.gZt = 0;
    this.gZu = 0;
    this.dBM = 0;
    this.gZv = 0;
    this.gZw = 0;
    this.gZx = 0;
    this.gZy = 0;
    this.gZz = 0;
  }
  
  public final void IF()
  {
    if (this.gZt == 0)
    {
      reset();
      return;
    }
    String str = String.format("%d,%d,%d,%d,%d,%d,%d,%d", new Object[] { Integer.valueOf(this.gZt), Integer.valueOf(this.gZu), Integer.valueOf(this.dBM), Integer.valueOf(this.gZv), Integer.valueOf(this.gZw), Integer.valueOf(this.gZx), Integer.valueOf(this.gZy), Integer.valueOf(this.gZz) });
    x.i("MicroMsg.BakPCReportor", "report: %s", new Object[] { str });
    h.mEJ.k(11103, str);
    reset();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */