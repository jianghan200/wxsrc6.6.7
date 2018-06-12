package com.tencent.mm.plugin.sns;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.sns.a.a.d;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.plugin.sns.b.m;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.platformtools.x;

public class PluginSns
  extends f
  implements com.tencent.mm.plugin.sns.b.b
{
  l nhh = new l();
  a nhi = new a();
  o nhj = new o();
  com.tencent.mm.plugin.sns.a.a nhk = new com.tencent.mm.plugin.sns.a.a();
  
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.a(i.class, this.nhh);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.sns.b.c.class, this.nhk);
    com.tencent.mm.plugin.sns.a.a locala = this.nhk;
    locala.a(new com.tencent.mm.plugin.sns.a.a.e());
    locala.a(new d());
    locala.a(new com.tencent.mm.plugin.sns.a.a.b());
    locala.a(new com.tencent.mm.plugin.sns.a.a.c());
    if (paramg.ES())
    {
      x.i("MicroMsg.PluginSns", "PluginSns configure");
      pin(new p(af.class));
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.sns.b.a.class, this.nhi);
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.a(m.class, this.nhj);
    }
  }
  
  public void dependency()
  {
    dependsOn(com.tencent.mm.plugin.emoji.b.c.class);
    dependsOn(com.tencent.mm.plugin.normsg.a.class);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    com.tencent.mm.bg.c.Um("sns");
  }
  
  public String getAccSnsPath()
  {
    return com.tencent.mm.kernel.g.Ei().dqp + "sns/";
  }
  
  public String getAccSnsTmpPath()
  {
    return com.tencent.mm.kernel.g.Ei().dqp + "sns/temp/";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/PluginSns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */