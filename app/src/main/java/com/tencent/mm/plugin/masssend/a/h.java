package com.tencent.mm.plugin.masssend.a;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import java.util.HashMap;

public final class h
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private bv.a kYi = new h.2(this);
  private b las;
  private c lau;
  private i lav = new i();
  private g law = new g();
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("MASSENDINFO_TABLE".hashCode()), new h.1());
  }
  
  private static h bcn()
  {
    au.HN();
    h localh2 = (h)bs.iK("plugin.masssend");
    h localh1 = localh2;
    if (localh2 == null)
    {
      localh1 = new h();
      au.HN().a("plugin.favorite", localh1);
    }
    return localh1;
  }
  
  public static b bco()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bcn().las == null)
    {
      h localh = bcn();
      au.HU();
      localh.las = new b(com.tencent.mm.model.c.FO());
    }
    return bcn().las;
  }
  
  public static c bcp()
  {
    if (bcn().lau == null) {
      bcn().lau = new c();
    }
    return bcn().lau;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    au.getSysCmdMsgExtension().a("masssendapp", this.kYi, false);
    com.tencent.mm.sdk.b.a.sFg.b(this.lav);
    com.tencent.mm.sdk.b.a.sFg.b(this.law);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    au.getSysCmdMsgExtension().b("masssendapp", this.kYi, false);
    com.tencent.mm.sdk.b.a.sFg.c(this.lav);
    com.tencent.mm.sdk.b.a.sFg.c(this.law);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/masssend/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */