package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.mn;
import com.tencent.mm.protocal.c.mo;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
  extends a
{
  private final String TAG = "MicroMsg.NetSceneQrRewardSetCode";
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public mo hVd;
  
  public g(LinkedList<Integer> paramLinkedList, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new mn();
    ((b.a)localObject).dIH = new mo();
    ((b.a)localObject).dIF = 1562;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/setrewardqrcode";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (mn)this.diG.dID.dIL;
    ((mn)localObject).rqc = paramLinkedList;
    ((mn)localObject).desc = paramString;
    ((mn)localObject).rqC = paramBoolean1;
    ((mn)localObject).rqD = paramBoolean2;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneQrRewardSetCode", "desc: %s, flag: %s, default: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneQrRewardSetCode", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.hVd = ((mo)((b)paramq).dIE.dIL);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneQrRewardSetCode", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.hVd.hUm), this.hVd.hUn });
    if ((!this.hUU) && (this.hVd.hUm != 0)) {
      this.hUV = true;
    }
    if ((!this.hUU) && (!this.hUV))
    {
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sYN, Integer.valueOf(this.hVd.rqf));
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sYO, Integer.valueOf(this.hVd.rqb));
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sYQ, this.hVd.desc);
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sYW, this.hVd.mwO);
      paramq = new ArrayList();
      Iterator localIterator = this.hVd.rqc.iterator();
      while (localIterator.hasNext()) {
        paramq.add(String.valueOf(((Integer)localIterator.next()).intValue()));
      }
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sYT, bi.c(paramq, ","));
      h.mEJ.a(724L, 5L, 1L, false);
    }
    for (;;)
    {
      if (this.diJ != null) {
        this.diJ.a(paramInt1, paramInt2, paramString, this);
      }
      return;
      if (this.hUU) {
        h.mEJ.a(724L, 7L, 1L, false);
      } else {
        h.mEJ.a(724L, 6L, 1L, false);
      }
    }
  }
  
  public final int getType()
  {
    return 1562;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */