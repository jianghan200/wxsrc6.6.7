package com.tencent.mm.plugin.label;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.af;
import com.tencent.mm.storage.ag;
import java.util.HashMap;

public class e
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private ag kAB;
  private d kAC = new d();
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("CONTACT_LABEL_TABLE".hashCode()), new e.1());
    cVM.put(Integer.valueOf("CONTACT_LABEL_CACHE_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return af.diD;
      }
    });
  }
  
  private static e aYI()
  {
    au.HN();
    e locale2 = (e)bs.iK("plugin.label");
    if (locale2 == null)
    {
      e locale1 = locale2;
      if (locale2 == null) {}
      try
      {
        locale1 = new e();
        au.HN().a("plugin.label", locale1);
        return locale1;
      }
      finally {}
    }
    return locale2;
  }
  
  public static ag aYJ()
  {
    g.Eg().Ds();
    if (aYI().kAB == null)
    {
      e locale = aYI();
      au.HU();
      locale.kAB = new ag(c.FO());
    }
    return aYI().kAB;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    b localb = new b();
    com.tencent.mm.plugin.label.a.a.kAD = localb;
    com.tencent.mm.am.b.dYB = localb;
    com.tencent.mm.sdk.b.a.sFg.b(this.kAC);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    com.tencent.mm.plugin.label.a.a.kAD = null;
    com.tencent.mm.sdk.b.a.sFg.c(this.kAC);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/label/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */