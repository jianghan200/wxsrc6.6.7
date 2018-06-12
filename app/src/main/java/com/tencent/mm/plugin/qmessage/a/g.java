package com.tencent.mm.plugin.qmessage.a;

import com.tencent.mm.ab.d.c;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.qmessage.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;
import java.util.HashMap;

public final class g
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private e mbC;
  private f mbD = new f();
  private a mbE = new a();
  private b mbF = new b();
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("QCONTACT_TABLE".hashCode()), new g.1());
  }
  
  private static g bob()
  {
    au.HN();
    g localg2 = (g)bs.iK("plugin.qmessage");
    g localg1 = localg2;
    if (localg2 == null)
    {
      localg1 = new g();
      au.HN().a("plugin.qmessage", localg1);
    }
    return localg1;
  }
  
  public static e boc()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bob().mbC == null)
    {
      g localg = bob();
      au.HU();
      localg.mbC = new e(c.FO());
    }
    return bob().mbC;
  }
  
  public static void bod()
  {
    au.HU();
    if (c.FW().Yq("qmessage") == null)
    {
      localObject = new ai();
      ((ai)localObject).setUsername("qmessage");
      ((ai)localObject).setContent("");
      ((ai)localObject).as(bi.VF());
      ((ai)localObject).eX(0);
      ((ai)localObject).eV(0);
      au.HU();
      c.FW().d((ai)localObject);
      return;
    }
    au.HU();
    Object localObject = c.FT().GE("qmessage");
    ai localai = new ai();
    localai.setUsername("qmessage");
    if (localObject == null) {}
    for (localObject = "";; localObject = ((cm)localObject).field_content)
    {
      localai.setContent((String)localObject);
      localai.as(bi.VF());
      localai.eX(0);
      localai.eV(0);
      au.HU();
      c.FW().a(localai, "qmessage");
      return;
    }
  }
  
  public static void boe()
  {
    bd.Im();
    au.HU();
    c.FW().GL("@qqim");
    au.HU();
    c.FW().Yp("qmessage");
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    d.c.a(Integer.valueOf(36), this.mbD);
    d.c.a(Integer.valueOf(39), this.mbD);
    com.tencent.mm.sdk.b.a.sFg.b(this.mbE);
    com.tencent.mm.sdk.b.a.sFg.b(this.mbF);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt)
  {
    x.d("MicroMsg.SubCoreQMsg", "clear plugin");
    if ((paramInt & 0x20) != 0) {
      boe();
    }
  }
  
  public final void onAccountRelease()
  {
    d.c.b(Integer.valueOf(36), this.mbD);
    d.c.b(Integer.valueOf(39), this.mbD);
    com.tencent.mm.sdk.b.a.sFg.c(this.mbE);
    com.tencent.mm.sdk.b.a.sFg.c(this.mbF);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/qmessage/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */