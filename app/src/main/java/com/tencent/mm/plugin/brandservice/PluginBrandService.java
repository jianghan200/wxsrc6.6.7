package com.tencent.mm.plugin.brandservice;

import android.os.Looper;
import com.tencent.mm.ac.z;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.brandservice.a.b;
import com.tencent.mm.plugin.brandservice.ui.timeline.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.r.c;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.t;

public class PluginBrandService
  extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.kernel.api.c, b
{
  private f.a dYI = new PluginBrandService.3(this);
  private r.c hnE = new PluginBrandService.4(this);
  
  private void addBrandServiceEvent()
  {
    a.sFg.b(new PluginBrandService.2(this));
  }
  
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    addBrandServiceEvent();
    if (paramg.ES())
    {
      pin(new p(c.class));
      ((o)com.tencent.mm.kernel.g.n(o.class)).setBizTimeLineCallback(new PluginBrandService.1(this));
    }
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    com.tencent.mm.bg.c.Um("brandservice");
  }
  
  public void installed()
  {
    alias(b.class);
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().a(this.dYI, Looper.getMainLooper());
    z.Ne().a(this.hnE, Looper.getMainLooper());
    z.Nf().a(this.hnE, Looper.getMainLooper());
    new d();
    if (s.auK())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizTimeLineMigrateImp", "migrateMainCell");
      int i = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sZY, Integer.valueOf(0))).intValue();
      if ((i & 0x1) == 0)
      {
        ((i)com.tencent.mm.kernel.g.l(i.class)).FW().Ys("officialaccounts");
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZY, Integer.valueOf(i | 0x1));
      }
    }
  }
  
  public void onAccountRelease()
  {
    ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().a(this.dYI);
    z.Ne().a(this.hnE);
    z.Nf().a(this.hnE);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/brandservice/PluginBrandService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */