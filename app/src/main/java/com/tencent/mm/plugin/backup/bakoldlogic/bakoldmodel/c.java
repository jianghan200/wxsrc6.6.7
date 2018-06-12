package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel;

import com.tencent.mm.bt.h;
import com.tencent.mm.plugin.backup.bakoldlogic.d.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class c
{
  public long dDj = 0L;
  private long gTh = -1L;
  boolean gTi = false;
  
  public final void begin()
  {
    x.d("MicroMsg.Recoverfaster", "begin");
    if (b.atl().atm().dqq != null)
    {
      this.gTh = b.atl().atm().dqq.dO(Thread.currentThread().getId());
      this.gTi = true;
    }
    this.dDj = bi.VF();
  }
  
  public final void end()
  {
    if ((this.gTi) && (b.atl().atm().dqq != null))
    {
      b.atl().atm().dqq.gp(this.gTh);
      this.gTi = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldmodel/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */