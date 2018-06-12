package com.tencent.mm.plugin.aa.a;

import com.tencent.mm.ab.l;
import com.tencent.mm.protocal.c.m;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.vending.g.b;

public final class d
  implements com.tencent.mm.ab.e
{
  private static int eAg = 20;
  private static int eAh = 20;
  private static int eAi = 20;
  private static long eAj = 4000000L;
  private static long eAk = 200000L;
  b eAc;
  public String eAl = "";
  public String eAm = "";
  
  public d() {}
  
  private d(String paramString1, String paramString2)
  {
    this.eAl = paramString1;
    this.eAm = paramString2;
  }
  
  public static int VU()
  {
    com.tencent.mm.kernel.g.Ek();
    return ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sUq, Integer.valueOf(eAg))).intValue();
  }
  
  public static int VV()
  {
    com.tencent.mm.kernel.g.Ek();
    return ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sUs, Integer.valueOf(eAi))).intValue();
  }
  
  public static long VW()
  {
    com.tencent.mm.kernel.g.Ek();
    return ((Long)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sUu, Long.valueOf(eAk))).longValue();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AAOperationData", "get AAOperation, onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((com.tencent.mm.plugin.aa.a.a.h)paraml).eAV;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AAOperationData", "get AAOperation data, retCode: %s, retMsg: %s, max_payer_num: %s, max_receiver_num: %s, max_total_num: %s, max_total_amount: %s, max_per_amount: %s, notice: %s, notice_url: %s", new Object[] { Integer.valueOf(paramString.hUm), paramString.hUn, Integer.valueOf(paramString.qYq), Integer.valueOf(paramString.qYr), Integer.valueOf(paramString.qYs), Long.valueOf(paramString.qYt), Long.valueOf(paramString.qYu), paramString.hUy, paramString.hUz });
      if (paramString.hUm == 0)
      {
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sUq, Integer.valueOf(paramString.qYq));
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sUr, Integer.valueOf(paramString.qYr));
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sUs, Integer.valueOf(paramString.qYs));
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sUt, Long.valueOf(paramString.qYt));
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sUu, Long.valueOf(paramString.qYu));
        com.tencent.mm.plugin.report.service.h.mEJ.a(407L, 33L, 1L, false);
        com.tencent.mm.vending.g.g.a(this.eAc, new Object[] { new d(paramString.hUz, paramString.hUy) });
        return;
      }
      com.tencent.mm.vending.g.g.cBF().ct(Boolean.valueOf(false));
      com.tencent.mm.plugin.report.service.h.mEJ.a(407L, 35L, 1L, false);
      return;
    }
    com.tencent.mm.vending.g.g.cBF().ct(Boolean.valueOf(false));
    com.tencent.mm.plugin.report.service.h.mEJ.a(407L, 34L, 1L, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */