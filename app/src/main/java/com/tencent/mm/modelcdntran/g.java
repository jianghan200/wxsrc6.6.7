package com.tencent.mm.modelcdntran;

import android.os.Looper;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mm.ab.o;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.p;
import com.tencent.mm.protocal.c.kg;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.aa;
import java.io.File;
import java.util.HashMap;
import java.util.Random;

public class g
  implements ar
{
  private b dPH = null;
  private c dPI = null;
  private com.tencent.mm.ab.c dPJ;
  private long dPK = 0L;
  private ag dPL = new g.2(this, Looper.getMainLooper());
  private com.tencent.mm.ab.e dPM = new g.3(this);
  
  public static g NA()
  {
    return (g)p.v(g.class);
  }
  
  public static String NB()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    return com.tencent.mm.kernel.g.Ei().cachePath + "cdndnsinfo/";
  }
  
  public static com.tencent.mm.ab.c NC()
  {
    return NA().dPJ;
  }
  
  public static c ND()
  {
    if (NA().dPI == null) {}
    try
    {
      if (NA().dPI == null) {
        NA().dPI = new c();
      }
      return NA().dPI;
    }
    finally {}
  }
  
  public static b NE()
  {
    if (NA().dPH == null)
    {
      com.tencent.mm.kernel.g.Eg();
      if (!com.tencent.mm.kernel.a.Dw()) {
        break label48;
      }
    }
    label48:
    String str;
    for (NA().dPH = new b(com.tencent.mm.kernel.g.Ei().cachePath, ND());; NA().dPH = new b(str, ND()))
    {
      return NA().dPH;
      str = com.tencent.mm.a.g.u(("mm" + new Random().nextLong()).getBytes());
      str = aa.duN + str + "/";
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.SubCoreCdnTransport", "hy: cdn temp path: %s", new Object[] { str });
    }
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void NF()
  {
    hB(0);
  }
  
  public final void bn(boolean paramBoolean)
  {
    onAccountRelease();
    com.tencent.mm.kernel.g.Eg().Ds();
    if (NA().dPI == null)
    {
      NA().dPI = new c();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreCdnTransport", "summersafecdn onAccountPostReset new CdnTransportService hash[%s]", new Object[] { Integer.valueOf(NA().dPI.hashCode()) });
    }
    File localFile = new File(NB());
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    this.dPJ = new com.tencent.mm.ab.c()
    {
      public final void a(kg paramAnonymouskg1, kg paramAnonymouskg2, kg paramAnonymouskg3)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SubCoreCdnTransport", "cdntra infoUpdate dns info " + paramAnonymouskg1.toString() + " getCore().engine:" + g.NE());
        if (g.NE() != null)
        {
          g.NE().a(paramAnonymouskg1, paramAnonymouskg2, paramAnonymouskg3, null, null, null);
          com.tencent.mm.kernel.g.Em().H(new g.1.1(this));
        }
      }
    };
    com.tencent.mm.kernel.g.DF().a(379, this.dPM);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void hB(int paramInt)
  {
    this.dPK = 0L;
    this.dPL.removeMessages(1);
    com.tencent.mm.kernel.g.DF().a(new e(paramInt), 0);
  }
  
  public final void onAccountRelease()
  {
    this.dPJ = null;
    Object localObject;
    if (this.dPH != null)
    {
      localObject = this.dPH;
      CdnLogic.setCallBack(null);
      ((b)localObject).dOJ = null;
      this.dPH = null;
    }
    if (this.dPI != null)
    {
      localObject = this.dPI;
      if (com.tencent.mm.kernel.g.Eg().Dx()) {
        com.tencent.mm.kernel.g.Ei().DT().b((m.b)localObject);
      }
      ((c)localObject).dOR.removeCallbacksAndMessages(null);
      com.tencent.mm.kernel.g.Eh().b(((c)localObject).dOT);
      com.tencent.mm.kernel.g.Eh().dpP.b(379, (com.tencent.mm.ab.e)localObject);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).dOS);
      this.dPI = null;
    }
    this.dPK = 0L;
    this.dPL.removeCallbacksAndMessages(null);
    com.tencent.mm.kernel.g.DF().b(379, this.dPM);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelcdntran/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */