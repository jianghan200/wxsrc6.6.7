package com.tencent.mm.plugin.remittance.a;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.mp;
import com.tencent.mm.g.a.tj;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.remittance.model.ab;
import com.tencent.mm.sdk.e.j.a;
import java.util.HashMap;
import java.util.HashSet;

public class b
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private j.a dEC = new b.3(this);
  private bv.a iwx = new b.4(this);
  private ab mtM = null;
  public com.tencent.mm.plugin.remittance.b.b mtN = null;
  private com.tencent.mm.plugin.remittance.b.d mtO = null;
  private com.tencent.mm.sdk.b.c<mp> mtP = new b.5(this);
  private com.tencent.mm.sdk.b.c<tj> mtQ = new b.6(this);
  
  static
  {
    com.tencent.mm.wallet_core.a.i("RemittanceProcess", a.class);
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("DelayTransferRecord".hashCode()), new b.1());
    cVM.put(Integer.valueOf("RemittanceRecord".hashCode()), new b.2());
  }
  
  public static b bqQ()
  {
    return (b)p.v(b.class);
  }
  
  public static com.tencent.mm.plugin.remittance.b.b bqR()
  {
    if (bqQ().mtN == null)
    {
      b localb = bqQ();
      g.Ek();
      localb.mtN = new com.tencent.mm.plugin.remittance.b.b(g.Ei().dqq);
    }
    return bqQ().mtN;
  }
  
  public static com.tencent.mm.plugin.remittance.b.d bqS()
  {
    if (bqQ().mtO == null)
    {
      b localb = bqQ();
      g.Ek();
      localb.mtO = new com.tencent.mm.plugin.remittance.b.d(g.Ei().dqq);
    }
    return bqQ().mtO;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    ab localab;
    if (this.mtM != null) {
      localab = this.mtM;
    }
    synchronized (localab.lock)
    {
      localab.myE = new HashSet();
      localab.myF.clear();
      com.tencent.mm.model.c.c.Jx().c(this.dEC);
      ((o)g.n(o.class)).getSysCmdMsgExtension().a("paymsg", this.iwx, true);
      com.tencent.mm.sdk.b.a.sFg.a(this.mtP);
      com.tencent.mm.sdk.b.a.sFg.a(this.mtQ);
      return;
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final ab bqT()
  {
    if (this.mtM == null) {
      this.mtM = new ab();
    }
    return this.mtM;
  }
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    com.tencent.mm.model.c.c.Jx().d(this.dEC);
    ((o)g.n(o.class)).getSysCmdMsgExtension().b("paymsg", this.iwx, true);
    com.tencent.mm.sdk.b.a.sFg.c(this.mtP);
    com.tencent.mm.sdk.b.a.sFg.c(this.mtQ);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/remittance/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */