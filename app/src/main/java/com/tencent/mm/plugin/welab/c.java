package com.tencent.mm.plugin.welab;

import com.tencent.mm.ab.d.a;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  implements bv.a
{
  public final void a(d.a parama)
  {
    if ((parama == null) || (parama.dIN == null) || (parama.dIN.rcl == null)) {
      x.i("MicroMsg.WelabNewMsgLsn", "recv null msg");
    }
    do
    {
      return;
      parama = ab.a(parama.dIN.rcl);
      x.i("MicroMsg.WelabNewMsgLsn", "recv addMsg " + parama);
      parama = g.RV(parama);
    } while ((parama == null) || (!parama.isValid()));
    if (parama.field_status == 1) {
      b.bYI().qmM.a(parama, new String[] { "expId" });
    }
    for (;;)
    {
      e.n(parama.field_LabsAppId, 6, false);
      return;
      b.bYI().qmM.c(parama);
      com.tencent.mm.plugin.welab.d.b.bYX().f(parama);
      h.mEJ.a(parama.field_idkey, parama.field_idkeyValue, 1L, false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/welab/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */