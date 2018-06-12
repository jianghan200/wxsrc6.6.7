package com.tencent.mm.plugin.webwx.a;

import com.tencent.mm.ab.d.c;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.al;
import com.tencent.mm.model.aq;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.messenger.foundation.a.r;
import com.tencent.mm.plugin.messenger.foundation.a.t;
import java.util.HashMap;

public final class g
  implements ar
{
  private bv.a hdi = new g.1(this);
  private f qmb = new f();
  private a qmc;
  private aq qmd = new g.2(this);
  private com.tencent.mm.sdk.b.c qme = new g.3(this);
  private r qmf = new g.4(this);
  
  public static g bYF()
  {
    au.HN();
    g localg2 = (g)bs.iK("plugin.webwx");
    g localg1 = localg2;
    if (localg2 == null)
    {
      localg1 = new g();
      au.HN().a("plugin.webwx", localg1);
    }
    return localg1;
  }
  
  static void bYG()
  {
    au.getNotification().cancel(38);
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final a bYH()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (this.qmc == null) {
      this.qmc = new a();
    }
    return this.qmc;
  }
  
  public final void bn(boolean paramBoolean)
  {
    d.c.a(Integer.valueOf(51), this.qmb);
    au.getSysCmdMsgExtension().a("pushloginurl", this.hdi, true);
    au.HU();
    com.tencent.mm.model.c.a(this.qmd);
    com.tencent.mm.sdk.b.a.sFg.b(this.qme);
    this.qmc = null;
    t.a(5, this.qmf);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    d.c.b(Integer.valueOf(51), this.qmb);
    au.getSysCmdMsgExtension().b("pushloginurl", this.hdi, true);
    au.HU();
    com.tencent.mm.model.c.b(this.qmd);
    com.tencent.mm.sdk.b.a.sFg.c(this.qme);
    bYG();
    if (this.qmc != null)
    {
      a locala = this.qmc;
      com.tencent.mm.modelvideo.o.Ta().a(locala);
      com.tencent.mm.kernel.g.DF().b(221, locala);
    }
    t.a(this.qmf);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webwx/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */