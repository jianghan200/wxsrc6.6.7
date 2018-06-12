package com.tencent.mm.plugin.bbom;

import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.app.r;
import com.tencent.mm.app.s;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.plugin.fav.a.ad;
import com.tencent.mm.plugin.fav.a.v;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.welab.a.a.d;
import com.tencent.mm.plugin.welab.b.b;
import com.tencent.mm.pluginsdk.model.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.y.n.a;

public class PluginBigBallOfMudAsync
  extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.plugin.bbom.a.a
{
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    if ((paramg.ES()) && (((h)paramg).mProfileCompat != null)) {
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.notification.b.a.class)).setNotification(((WorkerProfile)((h)paramg).mProfileCompat).getNotification());
    }
    com.tencent.mm.pluginsdk.ui.applet.t.a.qJO = new PluginBigBallOfMudAsync.1(this);
    n.a.a(new PluginBigBallOfMudAsync.2(this));
    com.tencent.mm.pluginsdk.ui.d.c.a.qPG = new PluginBigBallOfMudAsync.3(this);
    com.tencent.mm.plugin.webview.ui.tools.widget.f.a.qkE = new PluginBigBallOfMudAsync.4(this);
    com.tencent.mm.plugin.webview.ui.tools.widget.c.a.qkD = new PluginBigBallOfMudAsync.5(this);
    com.tencent.mm.plugin.webview.ui.tools.widget.a.a.qkC = new PluginBigBallOfMudAsync.6(this);
    com.tencent.mm.kernel.g.a(ad.class, new com.tencent.mm.pluginsdk.model.f());
    com.tencent.mm.kernel.g.a(v.class, new c());
    if ((((h)paramg).mProfileCompat != null) && (paramg.ES()))
    {
      WorkerProfile localWorkerProfile = (WorkerProfile)((h)paramg).mProfileCompat;
      s locals = localWorkerProfile.bzM;
      r localr = localWorkerProfile.bzN;
      com.tencent.mm.bg.c.qUZ = locals;
      com.tencent.mm.bg.c.qVa = localr;
      new com.tencent.mm.plugin.i.e(localWorkerProfile).before(this).after(com.tencent.mm.kernel.g.n(o.class));
    }
    if (paramg.ES()) {
      ((o)com.tencent.mm.kernel.g.n(o.class)).setIDataTransferFactoryDelegate(new PluginBigBallOfMudAsync.7(this));
    }
  }
  
  public void dependency()
  {
    dependsOn(PluginBigBallOfMud.class);
    dependsOn(com.tencent.mm.plugin.notification.b.a.class);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if ((((h)paramg).mProfileCompat != null) && (paramg.ES()))
    {
      x.i("MicroMsg.PluginBigBallOfMudAsync", "before WorkerProfile oncreate.");
      ((h)paramg).mProfileCompat.onCreate();
    }
    if (paramg.ES())
    {
      ((d)com.tencent.mm.kernel.g.l(d.class)).a("labs1de6f3", new b());
      ((d)com.tencent.mm.kernel.g.l(d.class)).a(new com.tencent.mm.plugin.welab.d.a());
      ((d)com.tencent.mm.kernel.g.l(d.class)).a("labs_browse", new com.tencent.mm.plugin.welab.b.a());
    }
  }
  
  public void installed()
  {
    alias(com.tencent.mm.plugin.bbom.a.a.class);
  }
  
  public String toString()
  {
    return "plugin-big-ball-of-mud-async";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/bbom/PluginBigBallOfMudAsync.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */