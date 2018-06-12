package com.tencent.mm.plugin.hp.b;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.aw;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.g.a.cm;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bv;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.storage.aa.a;
import java.util.HashMap;

public final class d
  implements ar
{
  private final com.tencent.mm.sdk.b.c<aw> ijI = new d.1(this);
  private final h kmA = new h();
  private final com.tencent.mm.sdk.b.c<cm> kmB = new d.2(this);
  private final f kmC = new f();
  private final com.tencent.mm.sdk.b.c<bf> kmD = new d.3(this);
  boolean kmz = true;
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    b.a(new g(), new String[] { "//tinker" });
    au.getSysCmdMsgExtension().a("checktinkerupdate", this.kmA, true);
    com.tencent.mm.sdk.b.a.sFg.b(this.ijI);
    this.kmB.cht();
    com.tencent.mm.sdk.b.a.sFg.b(this.kmC);
    com.tencent.mm.sdk.b.a.sFg.b(this.kmD);
    com.tencent.mm.sdk.platformtools.x.d("Tinker.SubCoreHotpatch", "onAccountPostReset");
    com.tencent.mm.plugin.hp.tinker.g.dI(ad.getContext());
    try
    {
      au.HU();
      long l1 = ((Long)com.tencent.mm.model.c.DT().get(aa.a.sXW, Long.valueOf(0L))).longValue();
      long l2 = System.currentTimeMillis();
      if (l2 - l1 >= 3600000L)
      {
        com.tinkerboots.sdk.a.cJC().na(true);
        au.HU();
        com.tencent.mm.model.c.DT().a(aa.a.sXW, Long.valueOf(l2));
        com.tencent.mm.sdk.platformtools.x.i("Tinker.SubCoreHotpatch", "try to fetch patch update true when onAccountPostReset. current:%d lastUpdate:%d", new Object[] { Long.valueOf(System.currentTimeMillis()), Long.valueOf(l1) });
      }
      for (;;)
      {
        f.dM(l2);
        return;
        com.tinkerboots.sdk.a.cJC().na(false);
        com.tencent.mm.sdk.platformtools.x.i("Tinker.SubCoreHotpatch", "try to fetch patch update false when onAccountPostReset.");
      }
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("Tinker.SubCoreHotpatch", localException, "", new Object[0]);
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    b.D(new String[] { "//tinker" });
    au.getSysCmdMsgExtension().b("checktinkerupdate", this.kmA, true);
    com.tencent.mm.sdk.b.a.sFg.c(this.ijI);
    this.kmB.dead();
    com.tencent.mm.sdk.b.a.sFg.c(this.kmC);
    com.tencent.mm.sdk.b.a.sFg.c(this.kmD);
    com.tencent.mm.sdk.platformtools.x.d("Tinker.SubCoreHotpatch", "onAccountRelease");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/hp/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */