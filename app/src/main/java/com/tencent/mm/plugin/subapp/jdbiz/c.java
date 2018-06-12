package com.tencent.mm.plugin.subapp.jdbiz;

import android.os.Looper;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.k.e;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bv;
import com.tencent.mm.pluginsdk.f.f;
import com.tencent.mm.pluginsdk.f.f.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;
import java.util.Map;

public class c
  implements ar, f.b
{
  private com.tencent.mm.sdk.b.c cXu = new c.1(this);
  private a oqU = null;
  private b oqV = null;
  Map<String, Integer> oqW = new HashMap();
  
  public c()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreJdIP6", "new SubCoreJDBiz this: " + hashCode() + " stack: " + bi.cjd());
  }
  
  public static void b(b paramb)
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    c localc = bGg();
    if (localc.oqV == null) {
      localc.oqV = b.bFY();
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreJdIP6", "updatejdMsgContent old: %s new: %s", new Object[] { localc.oqV.bGa(), paramb.bGa() });
    if (!paramb.a(localc.oqV))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreJdIP6", "fo zu baoyou! the activityid is same");
      return;
    }
    if ((!bi.oW(paramb.oqK)) || (paramb.oqJ))
    {
      au.HU();
      com.tencent.mm.model.c.DT().set(327939, "1");
    }
    if (paramb.oqI)
    {
      au.HU();
      com.tencent.mm.model.c.DT().set(327938, "1");
    }
    for (;;)
    {
      localc.oqV = paramb;
      au.HU();
      com.tencent.mm.model.c.DT().set(327942, paramb.bWW);
      localc.bGm();
      return;
      au.HU();
      com.tencent.mm.model.c.DT().set(327938, "");
    }
  }
  
  public static c bGg()
  {
    c localc2 = (c)f.qBo;
    c localc1 = localc2;
    if (localc2 == null)
    {
      localc1 = new c();
      f.qBo = localc1;
    }
    return localc1;
  }
  
  private void bGm()
  {
    new ag(Looper.getMainLooper()).post(new c.2(this));
  }
  
  public static boolean bGo()
  {
    String str1 = com.tencent.mm.k.g.AT().getValue("JDEntranceConfigName");
    String str2 = com.tencent.mm.k.g.AT().getValue("JDEntranceConfigIconUrl");
    String str3 = com.tencent.mm.k.g.AT().getValue("JDEntranceConfigJumpUrl");
    return (!bi.oW(str1)) && (!bi.oW(str2)) && (!bi.oW(str3));
  }
  
  public static String cl(String paramString, int paramInt)
  {
    String str = paramString;
    if (-1 == paramString.indexOf('#'))
    {
      if (-1 == paramString.indexOf('?')) {
        str = paramString + "?wc_scene=" + paramInt;
      }
    }
    else {
      return str;
    }
    return paramString + "&wc_scene=" + paramInt;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final boolean bGh()
  {
    au.HU();
    return "1".equals((String)com.tencent.mm.model.c.DT().get(327939, ""));
  }
  
  public final boolean bGi()
  {
    au.HU();
    return "1".equals((String)com.tencent.mm.model.c.DT().get(327938, ""));
  }
  
  public final void bGj()
  {
    au.HU();
    com.tencent.mm.model.c.DT().set(327938, "");
  }
  
  public final void bGk()
  {
    au.HU();
    com.tencent.mm.model.c.DT().set(327939, "");
  }
  
  public final b bGl()
  {
    if (this.oqV == null) {
      this.oqV = b.bFY();
    }
    return this.oqV;
  }
  
  public final void bGn()
  {
    if ((au.HX()) && ((bGg().bGh()) || (bGg().bGi())))
    {
      b localb = bGg().bGl();
      if (((!bi.oW(localb.oqK)) || (localb.oqJ)) && (localb.bFZ()))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreJdIP6", "clear red dot/friend dot");
        bGg().bGj();
        bGg().bGk();
        bGg().bGm();
      }
    }
  }
  
  public final String bGp()
  {
    int m = 1;
    String str1 = com.tencent.mm.k.g.AT().getValue("JDEntranceConfigJumpUrl");
    if (bi.oW(str1)) {
      return null;
    }
    b localb = bGl();
    int i;
    if (bGh()) {
      if ((!localb.bFZ()) && ("3".equals(localb.oqG)) && (!bi.oW(localb.jumpUrl)))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreJdIP6", "jumpUrl update %s", new Object[] { localb.jumpUrl });
        str1 = localb.jumpUrl;
        i = 6;
      }
    }
    for (;;)
    {
      int j = i;
      String str2 = str1;
      if ("2".equals(localb.oqG))
      {
        j = i;
        str2 = str1;
        if (!bi.oW(localb.jumpUrl))
        {
          if (localb.oqM >= System.currentTimeMillis() / 1000L) {
            break label232;
          }
          k = 1;
          label154:
          j = i;
          str2 = str1;
          if (k != 0) {
            if ((localb.oqN == 0L) || (localb.oqN >= System.currentTimeMillis() / 1000L)) {
              break label237;
            }
          }
        }
      }
      label232:
      label237:
      for (int k = m;; k = 0)
      {
        j = i;
        str2 = str1;
        if (k == 0)
        {
          str2 = localb.jumpUrl;
          j = 3;
        }
        return cl(str2, j);
        if (!localb.oqJ) {
          break label242;
        }
        i = 2;
        break;
        k = 0;
        break label154;
      }
      label242:
      i = 1;
    }
  }
  
  public final void bn(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreJdIP6", "onAccountPostReset");
    if (this.oqU == null) {
      this.oqU = new a();
    }
    au.getSysCmdMsgExtension().a("jd", this.oqU, true);
    com.tencent.mm.sdk.b.a.sFg.b(this.cXu);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreJdIP6", "onAccountRelease");
    if (this.oqU != null)
    {
      a locala = this.oqU;
      com.tencent.mm.sdk.b.a.sFg.c(locala.oqD);
      au.getSysCmdMsgExtension().b("jd", this.oqU, true);
    }
    this.oqW.clear();
    this.oqU = null;
    com.tencent.mm.sdk.b.a.sFg.c(this.cXu);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/subapp/jdbiz/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */