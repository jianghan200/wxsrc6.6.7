package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.ab.d.c;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.pluginsdk.model.b;
import java.util.HashMap;

public class ao
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private o qAL;
  private an.a qAM = null;
  private j qAN = new j();
  private b qAO = new b();
  private com.tencent.mm.sdk.b.c qAP = new ao.3(this);
  private com.tencent.mm.sdk.b.c qAQ = new ao.4(this);
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("APPMESSAGE_TABLE".hashCode()), new ao.1());
    cVM.put(Integer.valueOf("APPSORT_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return o.diD;
      }
    });
  }
  
  public static c asF()
  {
    return com.tencent.mm.plugin.ac.a.asF();
  }
  
  public static h bme()
  {
    return com.tencent.mm.plugin.ac.a.bme();
  }
  
  public static i bmf()
  {
    return com.tencent.mm.plugin.ac.a.bmf();
  }
  
  public static m bmh()
  {
    return com.tencent.mm.plugin.ac.a.bmh();
  }
  
  public static d bmi()
  {
    return com.tencent.mm.plugin.ac.a.bmi();
  }
  
  private static ao cbW()
  {
    au.HN();
    ao localao2 = (ao)bs.iK(ao.class.getName());
    ao localao1 = localao2;
    if (localao2 == null) {
      localao1 = new ao();
    }
    return localao1;
  }
  
  public static j cbX()
  {
    return cbW().qAN;
  }
  
  public static k cbY()
  {
    return com.tencent.mm.plugin.ac.a.bmg();
  }
  
  public static o cbZ()
  {
    g.Eg().Ds();
    if (cbW().qAL == null)
    {
      ao localao = cbW();
      au.HU();
      localao.qAL = new o(com.tencent.mm.model.c.FO());
    }
    return cbW().qAL;
  }
  
  public static an.a cca()
  {
    g.Eg().Ds();
    if (cbW().qAM == null) {
      cbW().qAM = new an.a();
    }
    return cbW().qAM;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    com.tencent.mm.model.ac.a.dBp = com.tencent.mm.plugin.ac.a.bme();
    d.c.a(Integer.valueOf(47), this.qAO);
    d.c.a(Integer.valueOf(49), this.qAN);
    com.tencent.mm.sdk.b.a.sFg.b(this.qAP);
    com.tencent.mm.sdk.b.a.sFg.b(this.qAQ);
    SightVideoJNI.registerALL();
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    an.a locala = cbW().qAM;
    if (locala != null) {
      locala.bFj = 0;
    }
    d.c.b(Integer.valueOf(47), this.qAO);
    d.c.b(Integer.valueOf(49), this.qAN);
    com.tencent.mm.sdk.b.a.sFg.c(this.qAP);
    com.tencent.mm.sdk.b.a.sFg.c(this.qAQ);
    com.tencent.mm.pluginsdk.model.j.cbv();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */