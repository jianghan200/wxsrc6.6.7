package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.storage.bd;
import com.tencent.mm.y.g.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class av
{
  private static final List<b> ufG;
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    ufG = localArrayList;
    localArrayList.add(new ah.b());
    ufG.add(new ah.a());
    ufG.add(new c.e());
    ufG.add(new c.d());
    ufG.add(new j.c());
    ufG.add(new j.b());
    ufG.add(new m.c());
    ufG.add(new m.b());
    ufG.add(new i.d());
    ufG.add(new i.c());
    ufG.add(new ae());
    ufG.add(new z.b());
    ufG.add(new u.b());
    ufG.add(new u.a());
    ufG.add(new aj.a());
    ufG.add(new aj.b());
    ufG.add(new ab.a());
    ufG.add(new q.c());
    ufG.add(new q.b());
    ufG.add(new v.a());
    ufG.add(new ai.b());
    ufG.add(new ai.a());
    ufG.add(new aa.b());
    ufG.add(new aa.a());
    ufG.add(new an.f());
    ufG.add(new an.c());
    ufG.add(new an.g());
    ufG.add(new p.j());
    ufG.add(new an.d());
    ufG.add(new an.e());
    ufG.add(new am());
    ufG.add(new ak());
    ufG.add(new al());
    ufG.add(new ad.a());
    ufG.add(new ad.b());
    ufG.add(new ao.c());
    ufG.add(new ao.b());
    ufG.add(new s());
    ufG.add(new k.b());
    ufG.add(new k.c());
    ufG.add(new w());
    ufG.add(new x());
    ufG.add(new y());
    ufG.add(new l.c());
    ufG.add(new l.b());
    ufG.add(new d.c());
    ufG.add(new d.b());
    ufG.add(new h.c());
    ufG.add(new h.b());
    ufG.add(new f.c());
    ufG.add(new f.b());
    ufG.add(new g.c());
    ufG.add(new g.b());
    ufG.add(new n.b());
    ufG.add(new n.a());
    ufG.add(new o.b());
    ufG.add(new o.a());
    ufG.add(new z.a());
    ufG.add(new e.c());
    ufG.add(new e.b());
    ufG.add(new av.1());
    ufG.add(new av.2());
  }
  
  public static b bE(bd parambd)
  {
    Iterator localIterator = ufG.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      int i = parambd.getType();
      if (parambd.field_isSend == 1) {}
      for (boolean bool = true; localb.aq(i, bool); bool = false) {
        try
        {
          localb = (b)localb.getClass().newInstance();
          return localb;
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Chatting.ItemFactory", localException, "", new Object[0]);
        }
      }
    }
    return new ah.a();
  }
  
  public static int bF(bd parambd)
  {
    if (parambd.getType() == 49)
    {
      i = l.d(g.a.gp(parambd.field_content));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Chatting.ItemFactory", "maybe honeypay need change type: %s", new Object[] { Integer.valueOf(i) });
      if (i != 49)
      {
        parambd.setType(i);
        au.HU();
        c.FT().a(parambd.field_msgId, parambd);
      }
    }
    int i = 0;
    while (i < ufG.size())
    {
      b localb = (b)ufG.get(i);
      int j = parambd.getType();
      if (parambd.field_isSend == 1) {}
      for (boolean bool = true; localb.aq(j, bool); bool = false) {
        return i;
      }
      i += 1;
    }
    return 0;
  }
  
  public static int cxT()
  {
    return ufG.size() + 2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/viewitems/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */