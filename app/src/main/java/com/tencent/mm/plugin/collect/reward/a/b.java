package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.lw;
import com.tencent.mm.protocal.c.lx;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
  extends a
{
  private final String TAG = "MicroMsg.NetSceneQrRewardGetCode";
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public lx hUX;
  public boolean hUY;
  
  public b(boolean paramBoolean)
  {
    b.a locala = new b.a();
    locala.dIG = new lw();
    locala.dIH = new lx();
    locala.dIF = 1323;
    locala.uri = "/cgi-bin/mmpay-bin/getrewardqrcode";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((lw)this.diG.dID.dIL).rpY = paramBoolean;
    this.hUY = paramBoolean;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  protected final boolean aBP()
  {
    return false;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneQrRewardGetCode", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.hUX = ((lx)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneQrRewardGetCode", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.hUX.hUm), this.hUX.hUn });
    if ((!this.hUU) && (this.hUX.hUm != 0)) {
      this.hUV = true;
    }
    if ((!this.hUU) && (!this.hUV))
    {
      g.Ei().DT().a(aa.a.sYN, Integer.valueOf(this.hUX.rqf));
      g.Ei().DT().a(aa.a.sYO, Integer.valueOf(this.hUX.rqb));
      g.Ei().DT().a(aa.a.sYQ, this.hUX.desc);
      g.Ei().DT().a(aa.a.sYP, this.hUX.hqp);
      g.Ei().DT().a(aa.a.sYS, Integer.valueOf(this.hUX.rqe));
      g.Ei().DT().a(aa.a.sYU, this.hUX.hwH);
      g.Ei().DT().a(aa.a.sYV, this.hUX.rqd);
      g.Ei().DT().a(aa.a.sYW, this.hUX.mwO);
      paramq = new ArrayList();
      Iterator localIterator = this.hUX.rqc.iterator();
      while (localIterator.hasNext()) {
        paramq.add(String.valueOf(((Integer)localIterator.next()).intValue()));
      }
      g.Ei().DT().a(aa.a.sYT, bi.c(paramq, ","));
      h.mEJ.a(724L, 2L, 1L, false);
    }
    for (;;)
    {
      if (this.diJ != null) {
        this.diJ.a(paramInt1, paramInt2, paramString, this);
      }
      return;
      if (this.hUU) {
        h.mEJ.a(724L, 4L, 1L, false);
      } else {
        h.mEJ.a(724L, 3L, 1L, false);
      }
    }
  }
  
  public final int getType()
  {
    return 1323;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */