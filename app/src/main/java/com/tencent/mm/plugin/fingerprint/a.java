package com.tencent.mm.plugin.fingerprint;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.fingerprint.b.b;
import com.tencent.mm.plugin.fingerprint.b.c;
import com.tencent.mm.plugin.fingerprint.b.d;
import com.tencent.mm.plugin.fingerprint.b.f;
import com.tencent.mm.plugin.fingerprint.b.i;
import com.tencent.mm.plugin.fingerprint.b.j;
import com.tencent.mm.plugin.fingerprint.b.n;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public class a
  implements ar
{
  private n jgf = new n();
  private i jgg = new i();
  private j jgh = new j();
  private b jgi = new b();
  private f jgj = new f();
  private com.tencent.mm.plugin.fingerprint.b.g jgk = new com.tencent.mm.plugin.fingerprint.b.g();
  private c jgl;
  
  static
  {
    com.tencent.mm.wallet_core.a.i("FingerprintAuth", com.tencent.mm.plugin.fingerprint.ui.a.class);
  }
  
  public static a aMW()
  {
    return (a)p.v(a.class);
  }
  
  public static c aMX()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aMW().jgl == null) {
      aMW().jgl = new c();
    }
    return aMW().jgl;
  }
  
  private static void aMY()
  {
    if (com.tencent.d.b.a.cFN()) {}
    for (Object localObject = new com.tencent.mm.plugin.fingerprint.b.k();; localObject = new d())
    {
      ((com.tencent.mm.pluginsdk.k)localObject).aNj();
      com.tencent.mm.kernel.g.a(com.tencent.mm.pluginsdk.k.class, (com.tencent.mm.kernel.c.a)localObject);
      return;
    }
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    x.i("MicroMsg.SubCoreFingerPrint", "alvinluo SoterWrapperApi isInit: %b in SubCoreFingerprint initTA", new Object[] { Boolean.valueOf(com.tencent.d.b.b.a.cFO().isInit()) });
    if (!com.tencent.d.b.b.a.cFO().isInit())
    {
      x.i("MicroMsg.SubCoreFingerPrint", "alvinluo soter is not initialized, do init");
      com.tencent.mm.kernel.g.a(com.tencent.mm.pluginsdk.k.class, new d());
      com.tencent.mm.kernel.g.Em().h(new a.1(this), 1500L);
    }
    for (;;)
    {
      com.tencent.mm.sdk.b.a.sFg.b(this.jgf);
      com.tencent.mm.sdk.b.a.sFg.b(this.jgg);
      com.tencent.mm.sdk.b.a.sFg.b(this.jgh);
      com.tencent.mm.sdk.b.a.sFg.b(this.jgi);
      com.tencent.mm.sdk.b.a.sFg.b(this.jgj);
      com.tencent.mm.sdk.b.a.sFg.b(this.jgk);
      return;
      aMY();
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.jgf);
    this.jgg.release();
    com.tencent.mm.sdk.b.a.sFg.c(this.jgg);
    com.tencent.mm.sdk.b.a.sFg.c(this.jgh);
    com.tencent.mm.sdk.b.a.sFg.c(this.jgi);
    com.tencent.mm.sdk.b.a.sFg.c(this.jgj);
    if (this.jgl != null)
    {
      c.abort();
      c.release();
      this.jgl = null;
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.jgk);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */