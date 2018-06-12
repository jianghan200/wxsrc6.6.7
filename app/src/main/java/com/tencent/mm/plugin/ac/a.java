package com.tencent.mm.plugin.ac;

import com.tencent.mm.a.f;
import com.tencent.mm.ab.o;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.ac.a.a.a;
import com.tencent.mm.pluginsdk.model.app.d;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class a
  implements com.tencent.mm.kernel.api.bucket.a, com.tencent.mm.kernel.api.bucket.b, com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.kernel.api.e, com.tencent.mm.kernel.b.c
{
  private static HashMap<Integer, h.d> cVM;
  private static volatile a lMZ;
  private com.tencent.mm.pluginsdk.model.app.c lNa;
  private com.tencent.mm.pluginsdk.model.app.e lNb;
  private com.tencent.mm.pluginsdk.model.app.h lNc;
  private i lNd;
  private k lNe;
  private m lNf;
  private d lNg;
  private com.tencent.mm.sdk.b.c lNh = new a.4(this);
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("APPATTACHINFO_TABLE".hashCode()), new a.2());
    cVM.put(Integer.valueOf("APPINFO_TABLE".hashCode()), new a.3());
  }
  
  private a()
  {
    a.a.a(new a.1(this));
  }
  
  public static com.tencent.mm.pluginsdk.model.app.c asF()
  {
    g.Eg().Ds();
    if (bmb().lNa == null) {
      bmb().lNa = new com.tencent.mm.pluginsdk.model.app.c(g.Ei().dqq);
    }
    return bmb().lNa;
  }
  
  public static a bmb()
  {
    if (lMZ == null) {}
    try
    {
      if (lMZ == null) {
        lMZ = new a();
      }
      return lMZ;
    }
    finally {}
  }
  
  public static String bmc()
  {
    return g.Ei().dqp + "openapi/";
  }
  
  public static com.tencent.mm.pluginsdk.model.app.e bmd()
  {
    g.Eg().Ds();
    if (bmb().lNb == null) {
      bmb().lNb = new com.tencent.mm.pluginsdk.model.app.e();
    }
    return bmb().lNb;
  }
  
  public static com.tencent.mm.pluginsdk.model.app.h bme()
  {
    g.Eg().Ds();
    if (bmb().lNc == null) {
      bmb().lNc = new com.tencent.mm.pluginsdk.model.app.h();
    }
    return bmb().lNc;
  }
  
  public static i bmf()
  {
    g.Eg().Ds();
    if (bmb().lNd == null) {
      bmb().lNd = new i(g.Ei().dqq);
    }
    return bmb().lNd;
  }
  
  public static k bmg()
  {
    g.Eg().Ds();
    if (bmb().lNe == null) {
      bmb().lNe = new k(g.Ei().dqq);
    }
    return bmb().lNe;
  }
  
  public static m bmh()
  {
    g.Eg().Ds();
    if (bmb().lNf == null) {
      bmb().lNf = new m();
    }
    return bmb().lNf;
  }
  
  public static d bmi()
  {
    g.Eg().Ds();
    if (bmb().lNg == null) {
      bmb().lNg = new d();
    }
    return bmb().lNg;
  }
  
  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    return cVM;
  }
  
  public List<String> collectStoragePaths()
  {
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "openapi/" });
    return localLinkedList;
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    com.tencent.mm.model.ac.a.dBp = bme();
    com.tencent.mm.sdk.b.a.sFg.b(this.lNh);
  }
  
  public void onAccountRelease()
  {
    Object localObject = bmb().lNc;
    if (localObject != null)
    {
      g.Eh().dpP.b(231, (com.tencent.mm.ab.e)localObject);
      bmi().b(7, (t)localObject);
    }
    localObject = bmb().lNb;
    if (localObject != null)
    {
      ((com.tencent.mm.pluginsdk.model.app.e)localObject).qzB.clear();
      ((com.tencent.mm.pluginsdk.model.app.e)localObject).mTQ.clear();
      ((com.tencent.mm.pluginsdk.model.app.e)localObject).fxF.clear();
    }
    localObject = bmb().lNf;
    if (localObject != null)
    {
      x.d("MicroMsg.AppSettingService", "stop service");
      ((m)localObject).qzY.clear();
      bmi().b(1, (t)localObject);
    }
    if (this.lNg != null)
    {
      localObject = this.lNg;
      g.Eh().dpP.b(452, (com.tencent.mm.ab.e)localObject);
      ((d)localObject).dJw.clear();
    }
    if (bmb().lNd != null) {
      bmb().lNd.qzQ.clear();
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.lNh);
    x.i("XPinOpenApi", "onAccountRelease");
  }
  
  public void onDataBaseClosed(com.tencent.mm.bt.h paramh1, com.tencent.mm.bt.h paramh2)
  {
    this.lNa = null;
    this.lNd = null;
    x.i("XPinOpenApi", "onDataBaseClosed");
  }
  
  public void onDataBaseOpened(com.tencent.mm.bt.h paramh1, com.tencent.mm.bt.h paramh2) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/ac/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */