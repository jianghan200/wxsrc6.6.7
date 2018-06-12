package com.tencent.mm.plugin.qmessage.a;

import com.tencent.mm.aq.l;
import com.tencent.mm.g.a.af;
import com.tencent.mm.g.a.af.a;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;

final class a
  extends com.tencent.mm.sdk.b.c<af>
{
  a()
  {
    this.sFo = af.class.getName().hashCode();
  }
  
  private static boolean a(af paramaf)
  {
    if (!(paramaf instanceof af)) {
      com.tencent.mm.sdk.platformtools.x.f("MicroMsg.QMsg.EventListener", "not bind qq event");
    }
    while (paramaf.bHo.bHq != 0) {
      return false;
    }
    try
    {
      int i = q.GQ() | 0x20;
      au.HU();
      com.tencent.mm.model.c.DT().set(34, Integer.valueOf(i));
      au.HU();
      com.tencent.mm.model.c.FQ().b(new l("", "", "", "", "", "", "", "", i, "", ""));
      g.boe();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.QMsg.EventListener", "doClearQQOffLineMessageHelper succ ");
      return false;
    }
    catch (Exception paramaf)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.QMsg.EventListener", paramaf, "", new Object[0]);
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/qmessage/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */