package com.tencent.mm.plugin.aa.a;

import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  implements com.tencent.mm.ab.e
{
  long bJC = -1L;
  com.tencent.mm.vending.g.b dIz;
  
  public final void Wa()
  {
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(1530, this);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.CloseAALogic", "onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((com.tencent.mm.plugin.aa.a.a.e)paraml).eAP;
      x.i("MicroMsg.CloseAALogic", "closeAA, response.retcode: %s", new Object[] { Integer.valueOf(paramString.hUm) });
      x.d("MicroMsg.CloseAALogic", "closeAA, response.msgxml: %s", new Object[] { paramString.qYe });
      if (paramString.hUm == 0)
      {
        com.tencent.mm.vending.g.g.a(this.dIz, new Object[] { Boolean.valueOf(true) });
        if ((!bi.oW(paramString.qYe)) && (this.bJC > 0L) && (((com.tencent.mm.plugin.aa.a.a.e)paraml).scene == a.ezY)) {
          h.g(this.bJC, paramString.qYe);
        }
        com.tencent.mm.plugin.report.service.h.mEJ.a(407L, 21L, 1L, false);
        return;
      }
      if ((paramString.hUm > 0) && (!bi.oW(paramString.hUn)))
      {
        this.dIz.ct(paramString.hUn);
        com.tencent.mm.plugin.report.service.h.mEJ.a(407L, 11L, 1L, false);
        return;
      }
      this.dIz.ct(Boolean.valueOf(false));
      com.tencent.mm.plugin.report.service.h.mEJ.a(407L, 23L, 1L, false);
      return;
    }
    this.dIz.ct(Boolean.valueOf(false));
    com.tencent.mm.plugin.report.service.h.mEJ.a(407L, 22L, 1L, false);
  }
  
  public final void init()
  {
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(1530, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/aa/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */