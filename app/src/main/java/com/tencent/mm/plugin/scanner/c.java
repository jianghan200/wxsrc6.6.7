package com.tencent.mm.plugin.scanner;

import android.annotation.SuppressLint;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.platformtools.u;
import com.tencent.mm.platformtools.u.a;
import com.tencent.mm.plugin.scanner.a.j;
import com.tencent.mm.plugin.scanner.a.m;
import com.tencent.mm.plugin.scanner.a.n;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  @SuppressLint({"UseSparseArrays"})
  private static HashMap<Integer, h.d> hsC = new HashMap();
  public String dqp;
  private u.a hsE;
  public com.tencent.mm.plugin.af.a.b mFg = new com.tencent.mm.plugin.af.a.b();
  private j mFh = new j();
  private n mFi = new n();
  private m mFj = new m();
  private com.tencent.mm.plugin.scanner.history.a.b mFk;
  private com.tencent.mm.plugin.scanner.a.b mFl = new com.tencent.mm.plugin.scanner.a.b();
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("SCANHISTORY_TABLE".hashCode()), new c.2());
  }
  
  public static String Gq()
  {
    return brY().dqp;
  }
  
  public static c brY()
  {
    au.HN();
    c localc2 = (c)bs.iK("plugin.scanner");
    c localc1 = localc2;
    if (localc2 == null)
    {
      localc1 = new c();
      au.HN().a("plugin.scanner", localc1);
    }
    return localc1;
  }
  
  public static com.tencent.mm.plugin.scanner.history.a.b brZ()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (brY().mFk == null)
    {
      c localc = brY();
      au.HU();
      localc.mFk = new com.tencent.mm.plugin.scanner.history.a.b(com.tencent.mm.model.c.FO());
    }
    return brY().mFk;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    Object localObject = new StringBuilder();
    au.HU();
    localObject = com.tencent.mm.model.c.Gp() + "CommonOneMicroMsg.db";
    this.hsE = u.a(hashCode(), (String)localObject, hsC, false);
    localObject = this.mFl;
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.scanner.a.b)localObject).mFI);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.scanner.a.b)localObject).mFJ);
    com.tencent.mm.sdk.b.a.sFg.b(this.mFh);
    com.tencent.mm.sdk.b.a.sFg.b(this.mFi.mGl);
    com.tencent.mm.sdk.b.a.sFg.b(this.mFi.mGm);
    com.tencent.mm.sdk.b.a.sFg.a(this.mFj);
    au.Em().H(new Runnable()
    {
      public final void run()
      {
        if (!au.HX()) {
          return;
        }
        if (bi.oW(c.a(c.this)))
        {
          x.e("MicroMsg.scanner.SubCoreScanner", "accPath == null in onAccountPostReset");
          return;
        }
        bi.g(c.a(c.this) + "image/scan/img", "scanbook", 604800000L);
      }
      
      public final String toString()
      {
        return super.toString() + "|onAccountPostReset";
      }
    });
  }
  
  public final void bo(boolean paramBoolean)
  {
    Object localObject1 = new StringBuilder("onSdcardMount ");
    au.HU();
    x.d("MicroMsg.scanner.SubCoreScanner", com.tencent.mm.model.c.Gq());
    Object localObject2 = brY();
    au.HU();
    localObject1 = com.tencent.mm.model.c.Gq();
    x.d("MicroMsg.scanner.SubCoreScanner", "resetAccPath on accPath : " + (String)localObject1);
    ((c)localObject2).dqp = ((String)localObject1);
    localObject2 = new File((String)localObject1);
    if (!((File)localObject2).exists()) {
      ((File)localObject2).mkdirs();
    }
    localObject2 = new File((String)localObject1 + "image/scan/img");
    if (!((File)localObject2).exists()) {
      ((File)localObject2).mkdirs();
    }
    localObject1 = new File((String)localObject1 + "image/scan/music");
    if (!((File)localObject1).exists()) {
      ((File)localObject1).mkdirs();
    }
  }
  
  public final String eq(String paramString1, String paramString2)
  {
    if ((au.HX()) && (!bi.oW(paramString1))) {
      return String.format("%s/scanbook%s_%s", new Object[] { this.dqp + "image/scan/img", paramString2, com.tencent.mm.a.g.u(paramString1.getBytes()) });
    }
    return "";
  }
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.mFh);
    com.tencent.mm.sdk.b.a.sFg.c(this.mFi.mGl);
    com.tencent.mm.sdk.b.a.sFg.c(this.mFi.mGm);
    com.tencent.mm.sdk.b.a.sFg.c(this.mFj);
    Object localObject = this.mFl;
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.scanner.a.b)localObject).mFI);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.scanner.a.b)localObject).mFJ);
    ((com.tencent.mm.plugin.scanner.a.b)localObject).bsa();
    localObject = this.mFg;
    ((com.tencent.mm.plugin.af.a.b)localObject).dWH.clear();
    ((com.tencent.mm.plugin.af.a.b)localObject).miS.clear();
    ((com.tencent.mm.plugin.af.a.b)localObject).miT.clear();
    if (this.hsE != null)
    {
      this.hsE.iQ(hashCode());
      this.hsE = null;
    }
    this.dqp = "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/scanner/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */