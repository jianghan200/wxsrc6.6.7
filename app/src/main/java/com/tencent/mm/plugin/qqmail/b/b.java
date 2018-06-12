package com.tencent.mm.plugin.qqmail.b;

import com.tencent.mm.aq.l;
import com.tencent.mm.g.a.af;
import com.tencent.mm.g.a.af.a;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;

final class b
  extends com.tencent.mm.sdk.b.c<af>
{
  b()
  {
    this.sFo = af.class.getName().hashCode();
  }
  
  private static boolean a(af paramaf)
  {
    if (!(paramaf instanceof af)) {
      com.tencent.mm.sdk.platformtools.x.f("MicroMsg.QQMail.EventListener", "not bind qq event");
    }
    while (paramaf.bHo.bHq != 0) {
      return false;
    }
    try
    {
      au.HU();
      com.tencent.mm.model.c.DT().set(17, Integer.valueOf(2));
      int i = q.GQ() | 0x1;
      au.HU();
      com.tencent.mm.model.c.DT().set(34, Integer.valueOf(i));
      au.HU();
      com.tencent.mm.model.c.FQ().b(new l("", "", "", "", "", "", "", "", i, "", ""));
      w.boy();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.QQMail.EventListener", "doClearQQMailHelper succ ");
      return false;
    }
    catch (Exception paramaf)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.QQMail.EventListener", paramaf, "", new Object[0]);
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */