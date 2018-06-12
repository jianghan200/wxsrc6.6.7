package com.tencent.mm.plugin.offline;

import android.os.Looper;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.tc;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.offline.a.s;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.storage.x;
import java.util.HashMap;
import java.util.Map;

public class k
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private static Map<String, String> dmW;
  public static boolean lJx = false;
  public static int lJy = 10;
  private com.tencent.mm.vending.b.b feT;
  private bv.a hTD = new k.4(this);
  private m lJA;
  private s lJr = null;
  private e lJs = null;
  private i lJt = null;
  private com.tencent.mm.plugin.offline.b.a lJu = null;
  private com.tencent.mm.plugin.offline.ui.d lJv = new com.tencent.mm.plugin.offline.ui.d();
  public f lJw = new f();
  private com.tencent.mm.sdk.b.c<tc> lJz = new com.tencent.mm.sdk.b.c() {};
  private ag mHandler = new ag(Looper.getMainLooper());
  
  static
  {
    dmW = new HashMap();
    cVM = new HashMap();
    com.tencent.mm.wallet_core.a.i("OfflineBindCardRegProcess", d.class);
    com.tencent.mm.wallet_core.a.i("OfflineBindCardProcess", c.class);
    cVM.put(Integer.valueOf("OFFLINE_ORDER_STATUS".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return com.tencent.mm.plugin.offline.b.a.diD;
      }
    });
  }
  
  public static void aw(int paramInt, String paramString)
  {
    if (paramString != null)
    {
      g.Ek();
      g.Ei().DT().set(paramInt, paramString);
      g.Ek();
      g.Ei().DT().lm(true);
    }
  }
  
  public static k bkO()
  {
    return (k)p.v(k.class);
  }
  
  public static s bkP()
  {
    g.Eg().Ds();
    if (bkO().lJr == null) {
      bkO().lJr = new s();
    }
    return bkO().lJr;
  }
  
  public static e bkQ()
  {
    g.Eg().Ds();
    if (bkO().lJs == null) {
      bkO().lJs = new e();
    }
    return bkO().lJs;
  }
  
  public static i bkR()
  {
    g.Eg().Ds();
    if (bkO().lJt == null) {
      bkO().lJt = new i();
    }
    return bkO().lJt;
  }
  
  public static com.tencent.mm.plugin.offline.b.a bkS()
  {
    if (!g.Eg().Dx()) {
      throw new com.tencent.mm.model.b();
    }
    if (bkO().lJu == null)
    {
      k localk = bkO();
      g.Ek();
      localk.lJu = new com.tencent.mm.plugin.offline.b.a(g.Ei().dqq);
    }
    return bkO().lJu;
  }
  
  public static String uk(int paramInt)
  {
    g.Ek();
    return (String)g.Ei().DT().get(paramInt, null);
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    this.feT = ((com.tencent.mm.plugin.auth.a.b)g.n(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(new k.3(this));
    ((o)g.n(o.class)).getSysCmdMsgExtension().a("paymsg", this.hTD, true);
    com.tencent.mm.sdk.b.a.sFg.b(this.lJv);
    com.tencent.mm.sdk.b.a.sFg.b(this.lJz);
    this.lJr = null;
    this.lJs = null;
    this.lJt = null;
    this.lJA = new m();
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    ((o)g.n(o.class)).getSysCmdMsgExtension().b("paymsg", this.hTD, true);
    com.tencent.mm.sdk.b.a.sFg.c(this.lJv);
    com.tencent.mm.sdk.b.a.sFg.c(this.lJz);
    if (this.lJA != null)
    {
      m localm = this.lJA;
      bkO();
      bkP().b(localm);
      com.tencent.mm.sdk.b.a.sFg.c(localm.kRJ);
    }
    this.lJA = null;
    this.feT.dead();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */