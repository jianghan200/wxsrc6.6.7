package com.tencent.mm.ai;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public class d
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private b dTb;
  private c dTc;
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("GETCONTACTINFO_TABLE".hashCode()), new d.1());
  }
  
  private static d OJ()
  {
    au.HN();
    com.tencent.mm.plugin.subapp.a locala = (com.tencent.mm.plugin.subapp.a)bs.iK("plugin.subapp");
    if (locala == null) {}
    for (d locald = null; locald == null; locald = (d)locala.Oi(d.class.getName()))
    {
      locald = new d();
      locala.b(d.class.getName(), locald);
      return locald;
    }
    return locald;
  }
  
  public static b OK()
  {
    g.Eg().Ds();
    if (OJ().dTb == null)
    {
      d locald = OJ();
      au.HU();
      locald.dTb = new b(com.tencent.mm.model.c.FO());
    }
    return OJ().dTb;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    if (this.dTc == null) {
      this.dTc = new c();
    }
    com.tencent.mm.model.am.a.dBr = this.dTc;
    x.i("SubCoreGetContact", "summergetcontac onAccountPostReset setGetContact[%s]", new Object[] { this.dTc });
    g.a(f.class, new com.tencent.mm.pluginsdk.ui.applet.c());
    g.a(com.tencent.mm.pluginsdk.h.class, new com.tencent.mm.pluginsdk.ui.applet.h());
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ai/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */