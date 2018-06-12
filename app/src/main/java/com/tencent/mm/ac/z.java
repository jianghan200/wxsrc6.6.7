package com.tencent.mm.ac;

import com.tencent.mm.ab.d.c;
import com.tencent.mm.ac.a.d;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.model.p;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.az.a;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.t;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class z
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private static long dMF = 0L;
  private com.tencent.mm.model.e dBE = new com.tencent.mm.model.e();
  private e dMG;
  private m.a dMH = null;
  private k dMI = null;
  private i dMJ;
  private h dMK = null;
  private d dML = null;
  private com.tencent.mm.ac.a.b dMM = null;
  private com.tencent.mm.ac.a.k dMN = null;
  private com.tencent.mm.ac.a.g dMO = null;
  private com.tencent.mm.ac.a.i dMP = null;
  private com.tencent.mm.ac.a.h dMQ = null;
  private c dMR = null;
  private r dMS = null;
  private t dMT = null;
  private a dMU;
  private bv.a dMV = new z.9(this);
  private az.a dMW = new z.10(this);
  private e.a dMX = new z.2(this);
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("BIZINFO_TABLE".hashCode()), new z.1());
    cVM.put(Integer.valueOf("BIZKF_TABLE".hashCode()), new z.3());
    cVM.put(Integer.valueOf("BIZCHAT_TABLE".hashCode()), new z.4());
    cVM.put(Integer.valueOf("BIZCHATUSER_TABLE".hashCode()), new z.5());
    cVM.put(Integer.valueOf("BIZCONVERSATION_TABLE".hashCode()), new z.6());
    cVM.put(Integer.valueOf("BIZCHAMYUSERINFO_TABLE".hashCode()), new z.7());
    cVM.put(Integer.valueOf("BIZENTERPRISE_TABLE".hashCode()), new z.8());
  }
  
  private static z MW()
  {
    try
    {
      z localz = (z)p.v(z.class);
      return localz;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static i MX()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (MW().dMJ == null) {
      MW().dMJ = new i(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return MW().dMJ;
  }
  
  public static e MY()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (MW().dMG == null) {
      MW().dMG = new e(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return MW().dMG;
  }
  
  public static h MZ()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    h localh;
    if (MW().dMK == null)
    {
      MW().dMK = new h();
      localh = MW().dMK;
      com.tencent.mm.kernel.g.Eh().dpP.a(675, localh);
      com.tencent.mm.kernel.g.Eh().dpP.a(672, localh);
      com.tencent.mm.kernel.g.Eh().dpP.a(674, localh);
    }
    synchronized (localh.dMd)
    {
      localh.dMf.clear();
      return MW().dMK;
    }
  }
  
  public static d Na()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (MW().dML == null) {
      MW().dML = new d(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return MW().dML;
  }
  
  public static com.tencent.mm.ac.a.b Nb()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (MW().dMM == null) {
      MW().dMM = new com.tencent.mm.ac.a.b(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return MW().dMM;
  }
  
  public static com.tencent.mm.ac.a.k Nc()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (MW().dMN == null) {
      MW().dMN = new com.tencent.mm.ac.a.k(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return MW().dMN;
  }
  
  public static com.tencent.mm.ac.a.g Nd()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (MW().dMO == null) {
      MW().dMO = new com.tencent.mm.ac.a.g(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return MW().dMO;
  }
  
  public static r Ne()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (MW().dMS == null) {
      MW().dMS = new r(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return MW().dMS;
  }
  
  public static t Nf()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (MW().dMT == null) {
      MW().dMT = new t(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return MW().dMT;
  }
  
  public static com.tencent.mm.ac.a.h Ng()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (MW().dMQ == null) {
      MW().dMQ = new com.tencent.mm.ac.a.h();
    }
    return MW().dMQ;
  }
  
  public static c Nh()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (MW().dMR == null) {
      MW().dMR = new c(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return MW().dMR;
  }
  
  public static m.a Ni()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (MW().dMH == null) {
      MW().dMH = new m.a();
    }
    return MW().dMH;
  }
  
  public static k Nj()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (MW().dMI == null) {
      MW().dMI = new k();
    }
    return MW().dMI;
  }
  
  public static a Nk()
  {
    if (MW().dMU == null) {
      MW().dMU = new a();
    }
    return MW().dMU;
  }
  
  public static com.tencent.mm.ac.a.i Nl()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (MW().dMP == null) {
      MW().dMP = new com.tencent.mm.ac.a.i();
    }
    return MW().dMP;
  }
  
  public static long Nm()
  {
    if (dMF == 0L)
    {
      Object localObject = com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sPA, null);
      if ((localObject != null) && ((localObject instanceof Long)))
      {
        dMF = ((Long)localObject).longValue();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBiz", "temp session needUpdateTime : %d.(get from ConfigStorage)", new Object[] { Long.valueOf(dMF) });
      }
    }
    if (dMF == 0L)
    {
      dMF = System.currentTimeMillis();
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sPA, Long.valueOf(dMF));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBiz", "temp session needUpdateTime is 0, so get current time : %d.", new Object[] { Long.valueOf(dMF) });
    }
    return dMF;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    d.c.a(Integer.valueOf(55), this.dBE);
    d.c.a(Integer.valueOf(57), this.dBE);
    ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().b(this.dMW);
    MY().a(this.dMX, null);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("mmbizattrappsvr_BizAttrSync", this.dMV, true);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    d.c.b(Integer.valueOf(55), this.dBE);
    d.c.b(Integer.valueOf(57), this.dBE);
    h localh;
    if (MW().dMK != null)
    {
      localh = MW().dMK;
      com.tencent.mm.kernel.g.Eh().dpP.b(675, localh);
      com.tencent.mm.kernel.g.Eh().dpP.b(672, localh);
      com.tencent.mm.kernel.g.Eh().dpP.b(674, localh);
    }
    synchronized (localh.dMd)
    {
      localh.dMf.clear();
      localh.dMe.clear();
      if (com.tencent.mm.kernel.g.Eg().Dx())
      {
        ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().c(this.dMW);
        MY().a(this.dMX);
      }
      ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("mmbizattrappsvr_BizAttrSync", this.dMV, true);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ac/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */