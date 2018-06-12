package com.tencent.mm.plugin.aa.a;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.aa.a.a.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.a;
import com.tencent.mm.protocal.c.o;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vending.g.b;
import com.tencent.mm.vending.g.g;

public final class f
  implements e
{
  b eAc;
  boolean eAq = false;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.AAPayLogic", "AAPayLogic, onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.eAq = false;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((i)paraml).eAX;
      x.i("MicroMsg.AAPayLogic", "AAPayLogic, onSceneEnd, retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(paramString.hUm), paramString.hUn });
      if (paramString.hUm == 0)
      {
        g.a(this.eAc, new Object[] { paramString });
        h.mEJ.a(407L, 9L, 1L, false);
        return;
      }
      if (this.eAc != null)
      {
        if ((paramString.qYw == null) || (paramString.qYw.bWA != 1) || (bi.oW(paramString.qYw.hUt)) || (bi.oW(paramString.qYw.kRu)) || (bi.oW(paramString.qYw.kRv)) || (bi.oW(paramString.qYw.bSc))) {
          break label217;
        }
        this.eAc.ct(paramString.qYw);
      }
      for (;;)
      {
        h.mEJ.a(407L, 11L, 1L, false);
        return;
        label217:
        if ((paramString.hUm > 0) && (!bi.oW(paramString.hUn))) {
          this.eAc.ct(paramString.hUn);
        } else {
          this.eAc.ct(Boolean.valueOf(false));
        }
      }
    }
    if (this.eAc != null) {
      this.eAc.ct(Boolean.valueOf(false));
    }
    h.mEJ.a(407L, 10L, 1L, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */