package com.tencent.mm.plugin.ab;

import com.tencent.mm.ab.l;
import com.tencent.mm.ao.b;
import com.tencent.mm.ao.d;
import com.tencent.mm.ao.f;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.p;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bi;
import java.util.HashMap;

public final class a
  extends p
  implements com.tencent.mm.kernel.api.bucket.a, com.tencent.mm.kernel.api.bucket.c
{
  private static HashMap<Integer, h.d> cVM;
  private static a lEC;
  private d lED = null;
  private bi lEE = null;
  private com.tencent.mm.ao.c lEF = null;
  private com.tencent.mm.ao.e lEG = new com.tencent.mm.ao.e();
  private final com.tencent.mm.ab.e lEH = new com.tencent.mm.ab.e()
  {
    public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl) {}
  };
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("NEWTIPS_TABLE".hashCode()), new a.2());
  }
  
  private a()
  {
    super(f.class);
  }
  
  public static a bjh()
  {
    try
    {
      if (lEC == null) {
        lEC = new a();
      }
      a locala = lEC;
      return locala;
    }
    finally {}
  }
  
  public static d bji()
  {
    g.Eg().Ds();
    if (bjh().lED == null) {
      bjh().lED = new d();
    }
    return bjh().lED;
  }
  
  public static bi bjj()
  {
    g.Eg().Ds();
    if (bjh().lEE == null)
    {
      a locala = bjh();
      g.Ek();
      locala.lEE = new bi(g.Ei().dqq);
    }
    return bjh().lEE;
  }
  
  public static com.tencent.mm.ao.c bjk()
  {
    g.Eg().Ds();
    if (bjh().lEF == null) {
      bjh().lEF = new com.tencent.mm.ao.c();
    }
    return bjh().lEF;
  }
  
  public final HashMap<Integer, h.d> collectDatabaseFactory()
  {
    return cVM;
  }
  
  public final void onAccountInitialized(e.c paramc)
  {
    super.onAccountInitialized(paramc);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("newtips", this.lEG);
    g.DF().a(597, this.lEH);
    bji();
    int i = b.ebm;
    paramc = b.ebt;
    d.b(i, b.ebl, "", paramc);
    x.i("MicroMsg.NewTipsManager", "dancy register dynamic newtips, tipsId:%s, path:%s", new Object[] { Integer.valueOf(i), paramc });
  }
  
  public final void onAccountRelease()
  {
    super.onAccountRelease();
    ((com.tencent.mm.plugin.messenger.foundation.a.o)g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("newtips", this.lEG);
    g.DF().b(597, this.lEH);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/ab/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */