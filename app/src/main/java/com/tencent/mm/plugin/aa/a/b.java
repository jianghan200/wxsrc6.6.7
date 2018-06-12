package com.tencent.mm.plugin.aa.a;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.aa.a.a.j;
import com.tencent.mm.plugin.aa.a.b.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.v;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vending.g.g;

public final class b
  implements e
{
  com.tencent.mm.vending.g.b eAc;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.AAGetPaylistDetailLogic", "onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((j)paraml).eAZ;
      x.i("MicroMsg.AAGetPaylistDetailLogic", "AAQueryDetailRes, onSceneEnd, retCode: %s", new Object[] { Integer.valueOf(paramString.hUm) });
      if (paramString.hUm == 0)
      {
        g.a(this.eAc, new Object[] { paramString });
        h.mEJ.a(407L, 6L, 1L, false);
        paraml = com.tencent.mm.plugin.aa.b.VQ().pe(paramString.qYc);
        if (paraml != null)
        {
          paraml.field_status = paramString.state;
          com.tencent.mm.plugin.aa.b.VQ().b(paraml);
        }
        return;
      }
      if ((paramString.hUm > 0) && (!bi.oW(paramString.hUn))) {
        this.eAc.ct(paramString.hUn);
      }
      for (;;)
      {
        h.mEJ.a(407L, 8L, 1L, false);
        return;
        this.eAc.ct(Boolean.valueOf(false));
      }
    }
    if (this.eAc != null) {
      this.eAc.ct(Boolean.valueOf(false));
    }
    h.mEJ.a(407L, 7L, 1L, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/aa/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */