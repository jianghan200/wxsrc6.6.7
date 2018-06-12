package com.tencent.mm.plugin.account.security.a;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.hp;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.p;
import com.tencent.mm.sdk.b.c;
import java.util.HashMap;

public class g
  implements ar
{
  private static HashMap<Integer, h.d> eOr;
  private e eOq;
  private c eOs = new g.2(this);
  private c eOt = new c() {};
  private c eOu = new g.4(this);
  
  static
  {
    HashMap localHashMap = new HashMap();
    eOr = localHashMap;
    localHashMap.put(Integer.valueOf("SAFE_DEVICE_INFO_TABLE".hashCode()), new g.1());
  }
  
  private static g Yp()
  {
    try
    {
      g localg = (g)p.v(g.class);
      return localg;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static e Yq()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (Yp().eOq == null) {
      Yp().eOq = new e(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return Yp().eOq;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return eOr;
  }
  
  public final void bn(boolean paramBoolean)
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.eOs);
    com.tencent.mm.sdk.b.a.sFg.b(this.eOt);
    com.tencent.mm.sdk.b.a.sFg.b(this.eOu);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.eOs);
    com.tencent.mm.sdk.b.a.sFg.c(this.eOt);
    com.tencent.mm.sdk.b.a.sFg.c(this.eOu);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/security/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */