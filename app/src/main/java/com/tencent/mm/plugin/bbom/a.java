package com.tencent.mm.plugin.bbom;

import com.tencent.mm.g.a.gz;
import com.tencent.mm.g.a.ri;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.protocal.c.ar;
import com.tencent.mm.protocal.c.awb;
import com.tencent.mm.protocal.c.bup;
import com.tencent.mm.protocal.i.f;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.u.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.aa.a;

public final class a
  implements com.tencent.mm.plugin.auth.a.a
{
  public final void a(i.f paramf, i.g paramg, boolean paramBoolean)
  {
    if ((paramg.qWn.srM & 0x2) != 0)
    {
      paramf = paramg.qWn.srO;
      if (!paramBoolean)
      {
        au.HU();
        com.tencent.mm.model.c.gi(paramf.raB);
      }
      paramg = com.tencent.mm.aa.c.A(q.GF(), true);
      at.dBv.iy(paramg);
      g.Ei().DT().a(aa.a.sZO, paramg);
      if (paramf.ray != 0)
      {
        au.HU();
        com.tencent.mm.model.c.FZ().bJ(paramf.ray + "@qqim", 3);
      }
      com.tencent.mm.aa.c.d(paramf.ray, 3);
    }
    for (;;)
    {
      o.iw(1);
      if (!paramBoolean) {
        break;
      }
      paramf = new gz();
      paramf.bQj.bQk = false;
      com.tencent.mm.sdk.b.a.sFg.m(paramf);
      paramf = new ri();
      paramf.ccb.ccc = true;
      com.tencent.mm.sdk.b.a.sFg.m(paramf);
      return;
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BigBallAuthHandle", "summerauth updateProfile acctsect not set!");
    }
    au.Em().H(new a.1(this));
  }
  
  public final void a(u.b paramb, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    paramString1 = com.tencent.mm.aa.c.A(q.GF(), true);
    at.dBv.iy(paramString1);
    g.Ei().DT().a(aa.a.sZO, paramString1);
    com.tencent.mm.aa.c.d(paramInt1, 3);
    au.HU();
    com.tencent.mm.model.c.FZ().bJ(paramb.qWZ.rZg, 2);
    if (paramInt1 != 0)
    {
      au.HU();
      com.tencent.mm.model.c.FZ().bJ(paramInt1 + "@qqim", 3);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/bbom/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */