package com.tencent.mm.plugin.messenger;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.bv;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.plugin.messenger.a.e;
import com.tencent.mm.plugin.messenger.a.e.a;
import com.tencent.mm.plugin.messenger.a.e.b;
import com.tencent.mm.plugin.messenger.foundation.a.o;

public class PluginMessenger
  extends f
  implements com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.plugin.messenger.a.c
{
  a lbB = new a();
  private com.tencent.mm.plugin.messenger.b.a lbC = new com.tencent.mm.plugin.messenger.b.a();
  private e.b lbD = new PluginMessenger.1(this);
  private e.a lbE = new PluginMessenger.2(this);
  private e.a lbF = new PluginMessenger.3(this);
  private e.a lbG = new PluginMessenger.4(this);
  private e.a lbH = new PluginMessenger.5(this);
  
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES())
    {
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.a(b.class, this.lbB);
      com.tencent.mm.kernel.g.a(e.class, this.lbC);
    }
  }
  
  public void dependency()
  {
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES()) {
      pin(com.tencent.mm.plugin.ag.a.bqO());
    }
  }
  
  public void installed()
  {
    alias(com.tencent.mm.plugin.messenger.a.c.class);
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    paramc = this.lbC;
    ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().a("sysmsgtemplate", paramc.lcM);
    ((e)com.tencent.mm.kernel.g.l(e.class)).a("link_plain", this.lbD);
    ((e)com.tencent.mm.kernel.g.l(e.class)).a("link_plain", this.lbE);
    ((e)com.tencent.mm.kernel.g.l(e.class)).a("link_revoke", this.lbF);
    ((e)com.tencent.mm.kernel.g.l(e.class)).a("link_revoke_qrcode", this.lbG);
    ((e)com.tencent.mm.kernel.g.l(e.class)).a("link_profile", this.lbH);
  }
  
  public void onAccountRelease()
  {
    com.tencent.mm.plugin.messenger.b.a locala = this.lbC;
    ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().b("sysmsgtemplate", locala.lcM);
    ((e)com.tencent.mm.kernel.g.l(e.class)).Gs("link_plain");
    ((e)com.tencent.mm.kernel.g.l(e.class)).Gt("link_plain");
    ((e)com.tencent.mm.kernel.g.l(e.class)).Gt("link_revoke");
    ((e)com.tencent.mm.kernel.g.l(e.class)).Gt("link_revoke_qrcode");
    ((e)com.tencent.mm.kernel.g.l(e.class)).Gt("link_profile");
  }
  
  public String toString()
  {
    return "plugin-messenger";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/messenger/PluginMessenger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */