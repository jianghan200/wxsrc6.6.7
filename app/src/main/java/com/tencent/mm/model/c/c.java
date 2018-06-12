package com.tencent.mm.model.c;

import android.annotation.SuppressLint;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.storage.d;
import java.util.HashMap;

public class c
  implements ar
{
  @SuppressLint({"UseSparseArrays"})
  private static HashMap<Integer, h.d> cVM;
  private bv.a dEA = new c.1(this);
  private com.tencent.mm.sdk.b.c dEB = new c.2(this);
  private j.a dEC = new c.3(this);
  private com.tencent.mm.vending.b.b dED = null;
  private final com.tencent.mm.plugin.auth.a.a dEE = new c.4(this);
  private d dEy;
  private com.tencent.mm.storage.b dEz;
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("NEW_ABTEST_TABLE".hashCode()), new c.5());
    cVM.put(Integer.valueOf("NEW_ABTEST_INFO_TABLE".hashCode()), new c.6());
  }
  
  private static c Jw()
  {
    try
    {
      c localc = (c)p.v(c.class);
      return localc;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static d Jx()
  {
    g.Eg().Ds();
    if (Jw().dEy == null) {
      Jw().dEy = new d(g.Ei().dqq);
    }
    return Jw().dEy;
  }
  
  public static com.tencent.mm.storage.b Jy()
  {
    g.Eg().Ds();
    if (Jw().dEz == null) {
      Jw().dEz = new com.tencent.mm.storage.b(g.Ei().dqq);
    }
    return Jw().dEz;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    ((o)g.n(o.class)).getSysCmdMsgExtension().a("newabtest", this.dEA, true);
    ((o)g.n(o.class)).getSysCmdMsgExtension().a("newabtestinfo", this.dEA, true);
    com.tencent.mm.sdk.b.a.sFg.b(this.dEB);
    Jx().c(this.dEC);
    this.dED = ((com.tencent.mm.plugin.auth.a.b)g.n(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(this.dEE);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    ((o)g.n(o.class)).getSysCmdMsgExtension().b("newabtest", this.dEA, true);
    ((o)g.n(o.class)).getSysCmdMsgExtension().b("newabtestinfo", this.dEA, true);
    com.tencent.mm.sdk.b.a.sFg.c(this.dEB);
    Jx().d(this.dEC);
    if (this.dED != null)
    {
      this.dED.dead();
      this.dED = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/model/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */