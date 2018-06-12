package com.tencent.mm.plugin.address.a;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.address.model.j;
import com.tencent.mm.plugin.address.model.k;
import com.tencent.mm.plugin.address.model.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class a
  implements ar
{
  private com.tencent.mm.plugin.address.b.a.a eXA = null;
  private j eXB = new j();
  private k eXC = new k();
  private l eXz = null;
  
  public static a Zv()
  {
    au.HN();
    a locala2 = (a)bs.iK("plugin.address");
    a locala1 = locala2;
    if (locala2 == null)
    {
      x.w("MicroMsg.SubCoreAddress", "not found in MMCore, new one");
      locala1 = new a();
      au.HN().a("plugin.address", locala1);
    }
    return locala1;
  }
  
  public static com.tencent.mm.plugin.address.b.a.a Zw()
  {
    g.Eg().Ds();
    if (Zv().eXA == null) {
      Zv().eXA = new com.tencent.mm.plugin.address.b.a.a();
    }
    return Zv().eXA;
  }
  
  public static l Zx()
  {
    g.Eg().Ds();
    if (Zv().eXz == null) {
      Zv().eXz = new l();
    }
    return Zv().eXz;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.eXB);
    com.tencent.mm.sdk.b.a.sFg.b(this.eXC);
    l locall = Zx();
    au.HU();
    String str = c.Gq();
    locall.path = (str + "addrmgr");
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.eXB);
    com.tencent.mm.sdk.b.a.sFg.c(this.eXC);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/address/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */