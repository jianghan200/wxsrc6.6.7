package com.tencent.mm.plugin.card.model;

import android.app.Application;
import android.os.Looper;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.card.PluginCard;
import com.tencent.mm.plugin.card.b.d;
import com.tencent.mm.plugin.card.b.n;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class am
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private com.tencent.mm.plugin.card.sharecard.a.a hxA;
  private com.tencent.mm.plugin.card.sharecard.model.k hxB;
  private com.tencent.mm.plugin.card.sharecard.model.o hxC;
  private com.tencent.mm.plugin.card.sharecard.a.c hxD;
  private com.tencent.mm.plugin.card.b.k hxE = null;
  private com.tencent.mm.plugin.card.b.e hxF = null;
  private com.tencent.mm.plugin.card.b.l hxG = null;
  private d hxH = null;
  private com.tencent.mm.plugin.card.b.j hxI = null;
  private com.tencent.mm.plugin.card.b.c hxJ;
  private com.tencent.mm.plugin.card.b.g hxK;
  private l hxL;
  private j hxM;
  private com.tencent.mm.sdk.b.c hxN = new n();
  private com.tencent.mm.sdk.b.c hxO = new com.tencent.mm.plugin.card.b.o();
  private com.tencent.mm.sdk.b.c hxP = new com.tencent.mm.plugin.card.b.a();
  private com.tencent.mm.plugin.card.ui.b hxQ = new com.tencent.mm.plugin.card.ui.b();
  private com.tencent.mm.sdk.b.c hxR = new am.1(this);
  private com.tencent.mm.sdk.b.c hxS = new am.4(this);
  private bv.a hxT = new am.5(this);
  private bv.a hxU = new bv.a()
  {
    public final void a(d.a paramAnonymousa)
    {
      String str = ab.a(paramAnonymousa.dIN.rcl);
      if ((str == null) || (str.length() == 0))
      {
        x.e("MicroMsg.SubCoreCard.notifyShareCardListener", "onReceiveMsg, msgContent is null");
        return;
      }
      am.a(am.this).post(new am.6.1(this, str, paramAnonymousa));
    }
  };
  private com.tencent.mm.plugin.card.b.b hxv;
  private c hxw;
  private al hxx;
  private h hxy;
  private com.tencent.mm.plugin.card.b.m hxz;
  private ag mHandler = new ag(Looper.getMainLooper());
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("USERCARDINFO_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return c.diD;
      }
    });
    cVM.put(Integer.valueOf("PENDINGCARDIDINFO_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return al.diD;
      }
    });
    cVM.put(Integer.valueOf("CARDMSGINFO_TABLE".hashCode()), new am.9());
    cVM.put(Integer.valueOf("SHARECARDINFO_TABLE".hashCode()), new am.10());
    cVM.put(Integer.valueOf("SHARECARDSYNCITEMINFO_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return com.tencent.mm.plugin.card.sharecard.model.o.diD;
      }
    });
    cVM.put(Integer.valueOf("CARDQRCODECONFI_TABLE".hashCode()), new am.2());
    cVM.put(Integer.valueOf("CARDQRCODEDATAINFO_TABLE".hashCode()), new am.3());
  }
  
  public am()
  {
    File localFile = new File(m.hwK);
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    localFile = new File(m.hwL);
    if (!localFile.exists()) {
      localFile.mkdir();
    }
  }
  
  public static com.tencent.mm.plugin.card.b.b axh()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxv == null) {
      getCore().hxv = new com.tencent.mm.plugin.card.b.b();
    }
    return getCore().hxv;
  }
  
  public static c axi()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxw == null) {
      getCore().hxw = new c(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return getCore().hxw;
  }
  
  public static al axj()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxx == null) {
      getCore().hxx = new al(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return getCore().hxx;
  }
  
  public static h axk()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxy == null) {
      getCore().hxy = new h(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return getCore().hxy;
  }
  
  public static com.tencent.mm.plugin.card.b.m axl()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxz == null) {
      getCore().hxz = new com.tencent.mm.plugin.card.b.m();
    }
    return getCore().hxz;
  }
  
  public static com.tencent.mm.plugin.card.b.k axm()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxE == null) {
      getCore().hxE = new com.tencent.mm.plugin.card.b.k();
    }
    return getCore().hxE;
  }
  
  public static com.tencent.mm.plugin.card.b.e axn()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxF == null) {
      getCore().hxF = new com.tencent.mm.plugin.card.b.e();
    }
    return getCore().hxF;
  }
  
  public static com.tencent.mm.plugin.card.b.l axo()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxG == null) {
      getCore().hxG = new com.tencent.mm.plugin.card.b.l();
    }
    return getCore().hxG;
  }
  
  public static com.tencent.mm.plugin.card.sharecard.a.a axp()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxA == null) {
      getCore().hxA = new com.tencent.mm.plugin.card.sharecard.a.a();
    }
    return getCore().hxA;
  }
  
  public static com.tencent.mm.plugin.card.sharecard.model.k axq()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxB == null) {
      getCore().hxB = new com.tencent.mm.plugin.card.sharecard.model.k(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return getCore().hxB;
  }
  
  public static com.tencent.mm.plugin.card.sharecard.model.o axr()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxC == null) {
      getCore().hxC = new com.tencent.mm.plugin.card.sharecard.model.o(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return getCore().hxC;
  }
  
  public static com.tencent.mm.plugin.card.sharecard.a.c axs()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxD == null) {
      getCore().hxD = new com.tencent.mm.plugin.card.sharecard.a.c();
    }
    return getCore().hxD;
  }
  
  public static d axt()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxH == null) {
      getCore().hxH = new d();
    }
    return getCore().hxH;
  }
  
  public static com.tencent.mm.plugin.card.b.j axu()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxI == null) {
      getCore().hxI = new com.tencent.mm.plugin.card.b.j();
    }
    return getCore().hxI;
  }
  
  public static com.tencent.mm.plugin.card.b.c axv()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxJ == null) {
      getCore().hxJ = new com.tencent.mm.plugin.card.b.c();
    }
    return getCore().hxJ;
  }
  
  public static l axw()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxL == null) {
      getCore().hxL = new l(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return getCore().hxL;
  }
  
  public static j axx()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxM == null) {
      getCore().hxM = new j(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return getCore().hxM;
  }
  
  public static com.tencent.mm.plugin.card.b.g axy()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (getCore().hxK == null) {
      getCore().hxK = new com.tencent.mm.plugin.card.b.g();
    }
    return getCore().hxK;
  }
  
  private static am getCore()
  {
    com.tencent.mm.plugin.card.a.a locala = (com.tencent.mm.plugin.card.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.card.a.a.class);
    if (locala != null) {
      return ((PluginCard)locala).getCore();
    }
    return null;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    x.i("MicroMsg.SubCoreCard", "onAccountPostReset, updated = %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.mm.sdk.b.a.sFg.b(this.hxR);
    com.tencent.mm.sdk.b.a.sFg.b(this.hxS);
    com.tencent.mm.sdk.b.a.sFg.b(this.hxN);
    com.tencent.mm.sdk.b.a.sFg.b(this.hxO);
    com.tencent.mm.sdk.b.a.sFg.b(this.hxP);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("carditemmsg", this.hxT, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("notifysharecard", this.hxU, true);
    this.hxE = null;
    if (this.hxF != null)
    {
      this.hxF.htT.clear();
      this.hxF = null;
    }
    if (this.hxz != null) {
      ??? = this.hxz;
    }
    synchronized (((com.tencent.mm.plugin.card.b.m)???).huO)
    {
      ((com.tencent.mm.plugin.card.b.m)???).huO.clear();
      synchronized (((com.tencent.mm.plugin.card.b.m)???).huP)
      {
        ((com.tencent.mm.plugin.card.b.m)???).huP.clear();
        com.tencent.mm.kernel.g.Eh().dpP.b(563, (com.tencent.mm.ab.e)???);
        ??? = com.tencent.mm.modelgeo.c.OB();
        if (??? != null) {
          ((com.tencent.mm.modelgeo.a)???).c((a.a)???);
        }
        if (((com.tencent.mm.plugin.card.b.m)???).huR != null) {
          com.tencent.mm.kernel.g.Eh().dpP.c(((com.tencent.mm.plugin.card.b.m)???).huR);
        }
        this.hxz = null;
        if (this.hxv != null)
        {
          this.hxv.detach();
          this.hxv = null;
        }
        if (this.hxA != null) {
          ??? = this.hxA;
        }
      }
    }
    synchronized (((com.tencent.mm.plugin.card.sharecard.a.a)???).dsN)
    {
      ((com.tencent.mm.plugin.card.sharecard.a.a)???).hty.clear();
      ((com.tencent.mm.plugin.card.sharecard.a.a)???).htz.clear();
      if (((com.tencent.mm.plugin.card.sharecard.a.a)???).hya != null) {
        com.tencent.mm.kernel.g.Eh().dpP.c(((com.tencent.mm.plugin.card.sharecard.a.a)???).hya);
      }
      com.tencent.mm.kernel.g.Eh().dpP.b(903, (com.tencent.mm.ab.e)???);
      this.hxA = null;
      if (this.hxH != null)
      {
        this.hxH.release();
        ??? = this.hxH;
        ((d)???).htB.clear();
        ((d)???).htN.clear();
        ((d)???).htO.clear();
        ((d)???).htP.clear();
        ((d)???).htR = false;
        this.hxH = null;
      }
      if (this.hxI == null) {
        break label538;
      }
      ??? = this.hxI;
      com.tencent.mm.kernel.g.Eh().dpP.b(907, (com.tencent.mm.ab.e)???);
      ??? = ((com.tencent.mm.plugin.card.b.j)???).huA.iterator();
      while (((Iterator)???).hasNext())
      {
        String str = (String)((Iterator)???).next();
        Runnable localRunnable = (Runnable)((com.tencent.mm.plugin.card.b.j)???).huC.get(str);
        ((com.tencent.mm.plugin.card.b.j)???).huC.remove(str);
        ((com.tencent.mm.plugin.card.b.j)???).huB.removeCallbacks(localRunnable);
        continue;
        localObject2 = finally;
        throw ((Throwable)localObject2);
        localObject3 = finally;
        throw ((Throwable)localObject3);
      }
    }
    ((com.tencent.mm.plugin.card.b.j)localObject3).huz.clear();
    ((com.tencent.mm.plugin.card.b.j)localObject3).huA.clear();
    ((com.tencent.mm.plugin.card.b.j)localObject3).huC.clear();
    this.hxI = null;
    label538:
    if (this.hxJ != null)
    {
      this.hxJ.release();
      this.hxJ = null;
    }
    if (this.hxK != null)
    {
      this.hxK.release();
      this.hxK = null;
    }
    this.hxG = null;
    com.tencent.mm.plugin.card.ui.b localb = this.hxQ;
    com.tencent.mm.plugin.card.ui.b.ano().registerActivityLifecycleCallbacks(localb);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    if (getCore().hxv != null) {
      getCore().hxv.detach();
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.hxR);
    com.tencent.mm.sdk.b.a.sFg.c(this.hxS);
    com.tencent.mm.sdk.b.a.sFg.c(this.hxN);
    com.tencent.mm.sdk.b.a.sFg.c(this.hxO);
    com.tencent.mm.sdk.b.a.sFg.c(this.hxP);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("carditemmsg", this.hxT, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("notifysharecard", this.hxU, true);
    com.tencent.mm.plugin.card.ui.b localb = this.hxQ;
    com.tencent.mm.plugin.card.ui.b.ano().unregisterActivityLifecycleCallbacks(localb);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/model/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */