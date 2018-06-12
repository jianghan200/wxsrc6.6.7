package com.tencent.mm.modelstat;

import com.tencent.mm.ab.d.c;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.by.c;
import com.tencent.mm.by.h;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.b;
import com.tencent.mm.model.am.e;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.p;
import com.tencent.mm.network.e;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;

public class q
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private com.tencent.mm.network.n dOT = new q.3(this);
  private l ekX = new l();
  private h<m> ekY = new h(new c() {});
  private com.tencent.mm.network.x ekZ = new com.tencent.mm.network.x();
  private h<g> ela = new h(new q.2(this));
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("NETSTAT_TABLE".hashCode()), new q.4());
  }
  
  public static g Sh()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    return (g)Si().ela.get();
  }
  
  private static q Si()
  {
    return (q)p.v(q.class);
  }
  
  public static m Sj()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    return (m)Si().ekY.get();
  }
  
  public static void e(e parame)
  {
    if (parame == null) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SubCoreStat", "dknetstat setNetworkMoniter  isnull:%b  ,  %s ", new Object[] { Boolean.valueOf(bool), bi.cjd() });
      if (parame != null) {
        parame.a(Si().ekX);
      }
      return;
    }
  }
  
  public static void f(e parame)
  {
    if (parame == null) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SubCoreStat", "setKVReportMonitor  isnull:%b  ,  %s ", new Object[] { Boolean.valueOf(bool), bi.cjd() });
      if (parame != null) {
        parame.a(Si().ekZ);
      }
      return;
    }
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    d.c.a(Integer.valueOf(9998), this.ekX);
    com.tencent.mm.kernel.g.Eh().a(this.dOT);
    com.tencent.mm.model.am.a.dBs = new am.e()
    {
      public final void aY(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SubCoreStat", "ReportDataFlow [%d][%d][%d] : %s ", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(0), bi.cjd() });
        n.aY(paramAnonymousInt1, paramAnonymousInt2);
      }
    };
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    com.tencent.mm.kernel.g.Eh().b(this.dOT);
    d.c.b(Integer.valueOf(9998), this.ekX);
    this.ekX = new l();
    com.tencent.mm.model.am.a.dBs = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/modelstat/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */