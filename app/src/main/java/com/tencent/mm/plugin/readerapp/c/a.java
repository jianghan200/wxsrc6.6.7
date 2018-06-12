package com.tencent.mm.plugin.readerapp.c;

import com.tencent.mm.aq.l;
import com.tencent.mm.g.a.af;
import com.tencent.mm.g.a.af.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.bay;
import com.tencent.mm.sdk.b.c;

final class a
  extends c<af>
{
  a()
  {
    this.sFo = af.class.getName().hashCode();
  }
  
  private boolean a(af paramaf)
  {
    if (!(paramaf instanceof af)) {
      com.tencent.mm.sdk.platformtools.x.f("MicroMsg.ReaderAppBindQQ.EventListener", "not bind qq event");
    }
    while (paramaf.bHo.bHq != 0) {
      return false;
    }
    try
    {
      int i = q.GQ() | 0x40000;
      com.tencent.mm.kernel.g.Ei().DT().set(34, Integer.valueOf(i));
      paramaf = new bay();
      paramaf.raB = 262144;
      paramaf.sdm = 1;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(39, paramaf));
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new l("", "", "", "", "", "", "", "", i, "", ""));
      g.b(new g.a()
      {
        public final void bpQ() {}
      });
      i = q.GL();
      com.tencent.mm.kernel.g.Ei().DT().set(40, Integer.valueOf(i & 0xFFFFFFDF));
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new com.tencent.mm.aq.g(21, 2));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ReaderAppBindQQ.EventListener", "doClearReaderAppWeiboHelper succ ");
      return false;
    }
    catch (Exception paramaf)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ReaderAppBindQQ.EventListener", paramaf, "", new Object[0]);
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/readerapp/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */