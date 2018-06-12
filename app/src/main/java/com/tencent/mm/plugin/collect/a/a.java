package com.tencent.mm.plugin.collect.a;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.model.p;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.collect.b.d;
import com.tencent.mm.plugin.collect.b.u;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.aup;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class a
  implements ar
{
  private bv.a hTD = new a.1(this);
  private com.tencent.mm.plugin.collect.b.g hTE = new com.tencent.mm.plugin.collect.b.g();
  private u hTF = new u();
  
  public static a aBC()
  {
    return (a)p.v(a.class);
  }
  
  public static d aBD()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    return d.hTL;
  }
  
  public static boolean aBE()
  {
    Object localObject = (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sVy, "");
    long l = q.GK();
    if ((!bi.oW((String)localObject)) && (!((String)localObject).equals("in.caf")))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreCollect", "old version switch is open, sync to new version");
      com.tencent.mm.kernel.g.Ei().DT().set(147457, Long.valueOf(l | 0x8000));
      localObject = new aup();
      ((aup)localObject).mEc = 1;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(209, (com.tencent.mm.bk.a)localObject));
      return true;
    }
    return (l & 0x8000) != 0L;
  }
  
  private void yC(String paramString)
  {
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(304, new a.2(this));
    paramString = new com.tencent.mm.plugin.collect.b.o(bi.aG(paramString, ""));
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(paramString, 0);
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void aBF()
  {
    yC("cash.caf");
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sVy, "cash.caf");
  }
  
  public final void aBG()
  {
    yC("in.caf");
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sVy, "in.caf");
  }
  
  public final void bn(boolean paramBoolean)
  {
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("paymsg", this.hTD, true);
    com.tencent.mm.plugin.collect.b.g localg = this.hTE;
    localg.cht();
    localg.hTS = new ConcurrentLinkedQueue();
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(1384, localg);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(1317, localg);
    this.hTF.cht();
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("paymsg", this.hTD, true);
    com.tencent.mm.plugin.collect.b.g localg = this.hTE;
    localg.dead();
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(1384, localg);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(1317, localg);
    com.tencent.mm.plugin.collect.b.g.aBI();
    this.hTF.dead();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/collect/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */