package com.tencent.mm.aa;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import com.tencent.mm.ab.o;
import com.tencent.mm.bs.b.b;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.p;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.SFSContext.Builder;
import com.tencent.mm.plugin.p.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;

public class q
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private k dIl;
  private f dIm;
  private e dIn;
  private i dIo;
  private String dIp;
  private al dIq = new al(com.tencent.mm.kernel.g.Em().lnJ.getLooper(), new al.a()
  {
    public final String toString()
    {
      return super.toString() + "|upAssetsHandler";
    }
    
    public final boolean vD()
    {
      if ((!com.tencent.mm.kernel.g.Eg().Dx()) || (q.Kp() == null))
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.SubCoreAvatar", "upAssetsHandler onTimerExpired acc:%b astg:%s ", new Object[] { Boolean.valueOf(com.tencent.mm.kernel.g.Eg().Dx()), q.Kp() });
        return false;
      }
      if (((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(90113, Boolean.valueOf(false))).booleanValue())
      {
        q.KL();
        q.KK();
      }
      com.tencent.mm.kernel.g.Ei().DT().set(90113, Boolean.valueOf(false));
      return false;
    }
  }, false);
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("IMG_FLAG_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return k.diD;
      }
    });
    cVM.put(Integer.valueOf("HDHEADIMGINFO_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return i.diD;
      }
    });
  }
  
  public static q KG()
  {
    return (q)p.v(q.class);
  }
  
  public static k KH()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (KG().dIl == null) {
      KG().dIl = new k(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return KG().dIl;
  }
  
  public static i KI()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (KG().dIo == null) {
      KG().dIo = new i(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return KG().dIo;
  }
  
  public static e KJ()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (KG().dIn == null) {
      KG().dIn = new e();
    }
    return KG().dIn;
  }
  
  public static boolean KK()
  {
    if (bi.a((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(59, null), false)) {
      return true;
    }
    String str = Kp().c(com.tencent.mm.model.q.GF(), false, false);
    if ((FileOp.cn(str)) || (FileOp.cn(str + ".bm"))) {}
    for (int i = 1; i != 0; i = 0) {
      return true;
    }
    str = com.tencent.mm.model.q.GF();
    if (bi.oW(str)) {
      return false;
    }
    Bitmap localBitmap = f.d.jZ(c.Gb() + "user_" + com.tencent.mm.a.g.u(str.getBytes()) + ".png");
    if ((localBitmap == null) || (localBitmap.isRecycled())) {
      return false;
    }
    return Kp().f(str, localBitmap);
  }
  
  public static f Kp()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (KG().dIm == null) {
      KG().dIm = new f();
    }
    return KG().dIm;
  }
  
  static Context getContext()
  {
    return ad.getContext();
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    FileOp.mL(com.tencent.mm.kernel.g.Ei().dqp + "sfs");
    this.dIp = com.tencent.mm.plugin.g.a.aqI();
    FileOp.a(this.dIp, new SFSContext.Builder().setDBDirectory(com.tencent.mm.kernel.g.Ei().cachePath + "sfs").setStoragePath(c.aWD()).setName("avatar"));
    Kp().Kt();
    if (paramBoolean)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SubCoreAvatar", "update all plugin avatars");
      com.tencent.mm.kernel.g.Ei().DT().set(90113, Boolean.valueOf(true));
    }
    try
    {
      String str = com.tencent.mm.model.q.GF();
      f localf = Kp();
      localf.Kt();
      f.B(str, false);
      f.B(str, true);
      localf.e(str, null);
      this.dIq.J(10000L, 10000L);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.SubCoreAvatar", localException, "Failed to refresh avatar.", new Object[0]);
      }
    }
  }
  
  public final void bo(boolean paramBoolean)
  {
    if (this.dIp != null)
    {
      FileOp.mC(this.dIp);
      this.dIp = com.tencent.mm.plugin.g.a.aqI();
      FileOp.a(this.dIp, new SFSContext.Builder().setDBDirectory(com.tencent.mm.kernel.g.Ei().cachePath + "sfs").setStoragePath(c.aWD()).setName("avatar"));
    }
  }
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    this.dIq.SO();
    Object localObject = KG().dIm;
    if (localObject != null)
    {
      f.reset();
      ((f)localObject).dHl.removeAllListeners();
    }
    localObject = KG().dIn;
    if (localObject != null) {
      com.tencent.mm.kernel.g.DF().b(123, (com.tencent.mm.ab.e)localObject);
    }
    localObject = KG().dIl;
    if (localObject != null) {
      ((k)localObject).dHU.clear();
    }
    if (this.dIp != null)
    {
      FileOp.mC(this.dIp);
      this.dIp = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/aa/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */