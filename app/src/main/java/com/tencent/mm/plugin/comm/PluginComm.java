package com.tencent.mm.plugin.comm;

import com.tencent.mm.ipcinvoker.wx_extension.e.a;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.r.h;

public class PluginComm
  extends f
  implements com.tencent.mm.plugin.comm.a.a
{
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES())
    {
      paramg = (com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class);
      new com.tencent.mm.plugin.zero.tasks.c().after(paramg).before(this);
    }
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES())
    {
      pin(com.tencent.mm.plugin.g.a.aqH());
      pin(com.tencent.mm.plugin.a.VO());
      pin(com.tencent.mm.plugin.k.a.aAf());
      pin(com.tencent.mm.plugin.m.a.aCO());
      pin(com.tencent.mm.plugin.b.a.WB());
      pin(com.tencent.mm.plugin.b.b.WC());
      pin(com.tencent.mm.plugin.p.c.aWC());
      pin(com.tencent.mm.plugin.p.b.aWB());
      pin(h.Ce());
      pin(com.tencent.mm.plugin.ad.a.bmE());
      pin(com.tencent.mm.plugin.t.b.bcR());
      pin(com.tencent.mm.plugin.d.a.ZN());
      pin(com.tencent.mm.plugin.ac.a.bmb());
      pin(com.tencent.mm.plugin.ab.a.bjh());
      pin(com.tencent.mm.pluginsdk.g.a.c.o.qDq);
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.t.a.a.class, new com.tencent.mm.plugin.t.a());
      ((com.tencent.mm.plugin.auth.a.b)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(com.tencent.mm.plugin.k.a.aAf());
      com.tencent.mm.ui.e.a.a.a(new PluginComm.1(this));
    }
    pin(e.a.CB());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/comm/PluginComm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */