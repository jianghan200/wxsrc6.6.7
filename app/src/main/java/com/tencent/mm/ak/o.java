package com.tencent.mm.ak;

import android.os.Looper;
import com.tencent.mm.a.f;
import com.tencent.mm.ab.d.c;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.cache.e.a;
import com.tencent.mm.g.a.ov;
import com.tencent.mm.model.ar;
import com.tencent.mm.modelsfs.SFSContext;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class o
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private b dWA = null;
  private p dWB = null;
  private com.tencent.mm.sdk.b.c dWC = new com.tencent.mm.sdk.b.c() {};
  private com.tencent.mm.ak.a.a dWD = null;
  private SFSContext dWE = null;
  private SFSContext dWF = null;
  private g dWu;
  private i dWv;
  private c dWw;
  private j dWx = new j();
  private d dWy = null;
  private h dWz = new h();
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("IMGINFO_TABLE".hashCode()), new o.2());
  }
  
  private static o Pc()
  {
    try
    {
      o localo = (o)com.tencent.mm.model.p.v(o.class);
      return localo;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static i Pd()
  {
    if (Pc().dWv == null) {
      Pc().dWv = new i();
    }
    return Pc().dWv;
  }
  
  public static c Pe()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (Pc().dWw == null) {
      Pc().dWw = new c();
    }
    return Pc().dWw;
  }
  
  public static g Pf()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (Pc().dWu == null) {
      Pc().dWu = new g(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return Pc().dWu;
  }
  
  public static d Pg()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (Pc().dWy == null) {
      Pc().dWy = new d();
    }
    return Pc().dWy;
  }
  
  public static b Ph()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (Pc().dWA == null) {
      Pc().dWA = new b(Looper.getMainLooper());
    }
    return Pc().dWA;
  }
  
  public static p Pi()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (Pc().dWB == null) {
      Pc().dWB = new p();
    }
    return Pc().dWB;
  }
  
  public static com.tencent.mm.ak.a.a Pj()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (Pc().dWD == null) {
      Pc().dWD = com.tencent.mm.ak.a.a.Pq();
    }
    return Pc().dWD;
  }
  
  public static SFSContext Pk()
  {
    return null;
  }
  
  public static void Pl()
  {
    Object localObject = Pc().dWu;
    if (localObject != null)
    {
      x.i("MicroMsg.ImgInfoStorage", "clearCacheMap stack:%s", new Object[] { bi.cjd() });
      ((g)localObject).dUr.a(new g.3((g)localObject));
    }
    localObject = Pc().dWD;
    if (localObject != null) {
      ((com.tencent.mm.ak.a.a)localObject).detach();
    }
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    d.c.a(Integer.valueOf(3), this.dWz);
    d.c.a(Integer.valueOf(23), this.dWz);
    e.a.a("local_cdn_img_cache", this.dWx);
    com.tencent.mm.sdk.b.a.sFg.b(this.dWC);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    o localo = Pc();
    if (localo.dWv != null)
    {
      ??? = localo.dWv;
      ((i)???).bFj = 0;
      com.tencent.mm.kernel.g.Eh().dpP.b(110, (com.tencent.mm.ab.e)???);
    }
    b localb;
    if (localo.dWA != null) {
      localb = localo.dWA;
    }
    synchronized (localb.dTg)
    {
      localb.dTg.clear();
      localb.dTh = 0L;
      Pg().a(localb);
      com.tencent.mm.sdk.b.a.sFg.c(localb.dTs);
      com.tencent.mm.sdk.b.a.sFg.c(localb.dTt);
      if (localo.dWy == null) {
        break label193;
      }
      ??? = localo.dWy;
      x.i("ModelImage.DownloadImgService", "on detach");
      x.i("ModelImage.DownloadImgService", "cancel all net scene");
      ((d)???).dTC = true;
      ((d)???).b(((d)???).dTA);
      if (((d)???).dTy.size() > 0) {
        ((d)???).b((d.b)((d)???).dTy.get(0));
      }
    }
    ((d)???).OL();
    com.tencent.mm.kernel.g.Eh().dpP.b(109, (com.tencent.mm.ab.e)???);
    label193:
    if (((o)localObject1).dWB != null)
    {
      ??? = ((o)localObject1).dWB;
      x.i("MicroMsg.UrlImageCacheService", "detach");
      ((p)???).dWH.clear();
      ((p)???).dWJ = true;
    }
    Pl();
    d.c.b(Integer.valueOf(3), this.dWz);
    d.c.b(Integer.valueOf(23), this.dWz);
    e.a.a("local_cdn_img_cache", null);
    com.tencent.mm.sdk.b.a.sFg.c(this.dWC);
    if (((o)localObject1).dWD != null)
    {
      ((o)localObject1).dWD.detach();
      ((o)localObject1).dWD = null;
    }
    if (((o)localObject1).dWE != null)
    {
      ((o)localObject1).dWE.release();
      ((o)localObject1).dWE = null;
    }
    if (((o)localObject1).dWF != null)
    {
      ((o)localObject1).dWF.release();
      ((o)localObject1).dWF = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ak/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */