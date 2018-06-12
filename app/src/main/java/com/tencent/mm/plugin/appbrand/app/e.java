package com.tencent.mm.plugin.appbrand.app;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.bs;
import com.tencent.mm.g.a.id;
import com.tencent.mm.g.a.is;
import com.tencent.mm.g.a.ja;
import com.tencent.mm.g.a.jo;
import com.tencent.mm.g.a.mo;
import com.tencent.mm.g.a.sl;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.platformtools.u.a;
import com.tencent.mm.plugin.appbrand.appcache.an;
import com.tencent.mm.plugin.appbrand.appcache.ap;
import com.tencent.mm.plugin.appbrand.appcache.aq;
import com.tencent.mm.plugin.appbrand.appusage.j.b;
import com.tencent.mm.plugin.appbrand.appusage.o.a;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.launching.s;
import com.tencent.mm.plugin.appbrand.m.c.a;
import com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI.a;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.b;
import com.tencent.mm.plugin.appbrand.widget.h;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.az.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public final class e
  implements ar
{
  private static volatile com.tencent.mm.plugin.appbrand.appstorage.c feB;
  private static volatile com.tencent.mm.plugin.appbrand.config.c feC;
  private static volatile ap feD;
  private static volatile com.tencent.mm.plugin.appbrand.appusage.p feE;
  private static volatile com.tencent.mm.plugin.appbrand.appusage.l feF;
  private static volatile com.tencent.mm.plugin.appbrand.config.p feG;
  private static volatile s feH;
  private static volatile h feI;
  private static volatile com.tencent.mm.plugin.appbrand.widget.i feJ;
  private static volatile u.a feK;
  private static volatile com.tencent.mm.plugin.appbrand.widget.m feL;
  private static volatile com.tencent.mm.y.a.c feM;
  private static volatile com.tencent.mm.plugin.appbrand.p.a feN;
  private static volatile com.tencent.mm.plugin.appbrand.appcache.u feO;
  private static volatile com.tencent.mm.plugin.appbrand.game.a.a.c feP;
  private static com.tencent.mm.plugin.appbrand.c.c feQ;
  private static com.tencent.mm.plugin.appbrand.c.b feR;
  private j.a dEC = new e.29(this);
  private final com.tencent.mm.network.n dOT = new e.24(this);
  private az.a feS = new com.tencent.mm.plugin.appbrand.o.a();
  private com.tencent.mm.vending.b.b feT = null;
  private final com.tencent.mm.plugin.auth.a.a feU = new e.10(this);
  private final Set<com.tencent.mm.sdk.b.c> feV = new HashSet();
  private final com.tencent.mm.sdk.b.c<ja> feW = new e.11(this);
  private final com.tencent.mm.sdk.b.c<sl> feX = new e.13(this);
  private final com.tencent.mm.sdk.b.c<jo> feY = new com.tencent.mm.sdk.b.c() {};
  private final com.tencent.mm.sdk.b.c<mo> feZ = new e.15(this);
  private final com.tencent.mm.sdk.b.c<com.tencent.mm.g.a.l> ffa = new com.tencent.mm.sdk.b.c() {};
  private final com.tencent.mm.sdk.b.c<com.tencent.mm.g.a.p> ffb = new e.17(this);
  private final com.tencent.mm.sdk.b.c<com.tencent.mm.g.a.o> ffc = new e.18(this);
  private final com.tencent.mm.sdk.b.c<com.tencent.mm.g.a.k> ffd = new e.19(this);
  private final com.tencent.mm.sdk.b.c<com.tencent.mm.g.a.n> ffe = new e.20(this);
  private final com.tencent.mm.sdk.b.c<bs> fff = new e.21(this);
  private final com.tencent.mm.sdk.b.c<is> ffg = new e.22(this);
  private final bv.a ffh = new an();
  private com.tencent.mm.sdk.b.c ffi = new e.25(this);
  private com.tencent.mm.sdk.b.c ffj = new e.26(this);
  private com.tencent.mm.sdk.b.c ffk = new e.27(this);
  private com.tencent.mm.sdk.b.c<id> ffl = new e.28(this);
  private final AppBrandGuideUI.a ffm = new AppBrandGuideUI.a();
  
  public e()
  {
    this.feV.add(this.ffd);
    this.feV.add(new com.tencent.mm.plugin.appbrand.launching.a());
    this.feV.add(this.ffe);
    this.feV.add(this.feY);
    this.feV.add(this.feZ);
    this.feV.add(this.feX);
    this.feV.add(new com.tencent.mm.plugin.appbrand.config.e());
    this.feV.add(this.feW);
    this.feV.add(com.tencent.mm.plugin.appbrand.appusage.b.fkZ);
    this.feV.add(this.ffa);
    this.feV.add(this.ffb);
    this.feV.add(this.ffc);
    this.feV.add(this.ffi);
    this.feV.add(this.fff);
    this.feV.add(this.ffg);
    this.feV.add(this.ffj);
    this.feV.add(this.ffk);
    this.feV.add(this.ffl);
  }
  
  private HashMap<Integer, h.d> aaU()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("AppKVStorageDBCreate".hashCode()), new e.1(this));
    localHashMap.put(Integer.valueOf("AppBrandWxaPkgStorageDBCreate".hashCode()), new e.12(this));
    localHashMap.put(Integer.valueOf("AppBrandCommonConfigStorageCreate".hashCode()), new e.23(this));
    localHashMap.put(Integer.valueOf("AppBrandLayoutStorageCreate".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return com.tencent.mm.plugin.appbrand.appusage.p.dzV;
      }
    });
    localHashMap.put(Integer.valueOf("AppBrandStarAppStorageCreate".hashCode()), new e.31(this));
    localHashMap.put(Integer.valueOf("WxaAttributesTableCreate".hashCode()), new e.32(this));
    localHashMap.put(Integer.valueOf("LaunchWxaAppInfoCreate".hashCode()), new e.33(this));
    localHashMap.put(Integer.valueOf("DynamicMsgCacheDataCreate".hashCode()), new e.34(this));
    localHashMap.put(Integer.valueOf("LaunchWxaWidgetCacheCreate".hashCode()), new e.35(this));
    localHashMap.put(Integer.valueOf("WxaWidgetInfoStorageCreate".hashCode()), new e.2(this));
    localHashMap.put(Integer.valueOf("WxaUpdateableMsgStorageCreate".hashCode()), new e.3(this));
    localHashMap.put(Integer.valueOf("AppBrandCommonKVBinaryDataStorage".hashCode()), new e.4(this));
    localHashMap.put(Integer.valueOf("PkgUpdateStatsStorage".hashCode()), new e.5(this));
    localHashMap.put(Integer.valueOf("MiniGameInfoStorage".hashCode()), new e.6(this));
    Iterator localIterator = a.fep.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      final String[] arrayOfString = (String[])localEntry.getValue();
      localHashMap.put(Integer.valueOf(((a.a)localEntry.getKey()).hashCode()), new h.d()
      {
        public final String[] xb()
        {
          return arrayOfString;
        }
      });
    }
    return localHashMap;
  }
  
  public static u.a aaV()
  {
    return feK;
  }
  
  public static e aaW()
  {
    com.tencent.mm.plugin.appbrand.a.b localb = (com.tencent.mm.plugin.appbrand.a.b)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.appbrand.a.b.class);
    if (localb != null) {
      return ((PluginAppBrand)localb).getCore();
    }
    return null;
  }
  
  public static AppBrandGuideUI.a aaY()
  {
    if (aaW() == null) {
      return null;
    }
    return aaW().ffm;
  }
  
  public static com.tencent.mm.plugin.appbrand.appstorage.c aaZ()
  {
    return feB;
  }
  
  public static com.tencent.mm.plugin.appbrand.config.p aba()
  {
    try
    {
      if (((feG == null) || (!feG.aeh())) && (feK != null) && (!feK.cjr())) {
        feG = new com.tencent.mm.plugin.appbrand.config.p(feK);
      }
      return feG;
    }
    finally {}
  }
  
  public static s abb()
  {
    return feH;
  }
  
  public static com.tencent.mm.plugin.appbrand.widget.i abc()
  {
    return feJ;
  }
  
  public static com.tencent.mm.plugin.appbrand.widget.m abd()
  {
    return feL;
  }
  
  public static com.tencent.mm.y.a.c abe()
  {
    return feM;
  }
  
  public static com.tencent.mm.plugin.appbrand.config.c abf()
  {
    if ((feC == null) && (feK != null) && (!feK.cjr())) {
      feC = new com.tencent.mm.plugin.appbrand.config.c(feK);
    }
    return feC;
  }
  
  public static com.tencent.mm.plugin.appbrand.appusage.p abg()
  {
    return feE;
  }
  
  public static com.tencent.mm.plugin.appbrand.appusage.l abh()
  {
    return feF;
  }
  
  public static ap abi()
  {
    return feD;
  }
  
  public static h abj()
  {
    return feI;
  }
  
  public static com.tencent.mm.plugin.appbrand.c.c abk()
  {
    if (feQ == null) {
      feQ = new com.tencent.mm.plugin.appbrand.c.c();
    }
    return feQ;
  }
  
  public static com.tencent.mm.plugin.appbrand.c.b abl()
  {
    if (feR == null) {
      feR = new com.tencent.mm.plugin.appbrand.c.b();
    }
    return feR;
  }
  
  public static com.tencent.mm.plugin.appbrand.p.a abm()
  {
    return feN;
  }
  
  public static com.tencent.mm.plugin.appbrand.appcache.u abn()
  {
    return feO;
  }
  
  public static com.tencent.mm.plugin.appbrand.game.a.a.c abo()
  {
    return feP;
  }
  
  public static <T> T x(Class<T> paramClass)
  {
    return (T)a.x(paramClass);
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final u.a aaX()
  {
    Object localObject = com.tencent.mm.kernel.g.Ei().cachePath + "AppBrandComm.db";
    if ((feK != null) && (((String)localObject).equals(feK.getPath()))) {
      return feK;
    }
    localObject = com.tencent.mm.platformtools.u.a(hashCode(), (String)localObject, aaU(), true);
    feK = (u.a)localObject;
    return (u.a)localObject;
  }
  
  public final void bn(boolean paramBoolean)
  {
    x.d("MicroMsg.SubCoreAppBrand", "onAccountPostReset updated %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.feT = ((com.tencent.mm.plugin.auth.a.b)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(this.feU);
    Object localObject2 = ad.getContext().getSharedPreferences("app_brand_global_sp", 0);
    if (localObject2 != null)
    {
      localObject1 = ((SharedPreferences)localObject2).getStringSet("uin_set", new HashSet());
      if (localObject1 != null)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        com.tencent.mm.kernel.g.Eg();
        if (((Set)localObject1).add(com.tencent.mm.kernel.a.Df()))
        {
          localObject2 = ((SharedPreferences)localObject2).edit();
          ((SharedPreferences.Editor)localObject2).remove("uin_set");
          ((SharedPreferences.Editor)localObject2).commit();
          ((SharedPreferences.Editor)localObject2).putStringSet("uin_set", (Set)localObject1);
          ((SharedPreferences.Editor)localObject2).commit();
        }
      }
    }
    Object localObject1 = this.feV.iterator();
    while (((Iterator)localObject1).hasNext()) {
      ((com.tencent.mm.sdk.b.c)((Iterator)localObject1).next()).cht();
    }
    localObject1 = an.fhL.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a((String)localObject2, this.ffh, true);
    }
    j.b.adc();
    o.a.adc();
    ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().b(this.feS);
    aaX();
    feB = new com.tencent.mm.plugin.appbrand.appstorage.c(feK);
    feC = new com.tencent.mm.plugin.appbrand.config.c(feK);
    feD = new ap(feK);
    feE = new com.tencent.mm.plugin.appbrand.appusage.p(feK);
    feF = new com.tencent.mm.plugin.appbrand.appusage.l(feK);
    feH = new s(feK);
    feI = new h(feK);
    feJ = new com.tencent.mm.plugin.appbrand.widget.i(feK);
    feL = new com.tencent.mm.plugin.appbrand.widget.m(feK);
    feM = new com.tencent.mm.y.a.c(feK);
    feN = new com.tencent.mm.plugin.appbrand.p.a(feK);
    feO = new com.tencent.mm.plugin.appbrand.appcache.u(feK);
    feP = new com.tencent.mm.plugin.appbrand.game.a.a.c(feK);
    aba();
    a.a(feK);
    com.tencent.mm.plugin.appbrand.f.setup();
    q.aei();
    c.a.gsM.prepare();
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).getFTSTaskDaemon().a(-86016, new com.tencent.mm.plugin.fts.a.a.a()
    {
      public final boolean execute()
      {
        Object localObject = new com.tencent.mm.plugin.appbrand.f.c();
        ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).registerIndexStorage((com.tencent.mm.plugin.fts.a.i)localObject);
        ((com.tencent.mm.plugin.fts.a.i)localObject).create();
        localObject = new com.tencent.mm.plugin.appbrand.f.b();
        ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).registerNativeLogic(7, (com.tencent.mm.plugin.fts.a.k)localObject);
        ((com.tencent.mm.plugin.fts.a.k)localObject).create();
        localObject = new com.tencent.mm.plugin.appbrand.f.g();
        ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
        localObject = new com.tencent.mm.plugin.appbrand.f.e();
        ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
        return true;
      }
      
      public final String getName()
      {
        return "InitFTSWeAppPluginTask";
      }
    });
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).getFTSTaskDaemon().a(-86016, new com.tencent.mm.plugin.fts.a.a.a()
    {
      public final boolean execute()
      {
        Object localObject = new com.tencent.mm.plugin.appbrand.game.a.a();
        ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).registerIndexStorage((com.tencent.mm.plugin.fts.a.i)localObject);
        ((com.tencent.mm.plugin.fts.a.i)localObject).create();
        localObject = new com.tencent.mm.plugin.appbrand.game.a.b();
        ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).registerNativeLogic(10, (com.tencent.mm.plugin.fts.a.k)localObject);
        ((com.tencent.mm.plugin.fts.a.k)localObject).create();
        localObject = new com.tencent.mm.plugin.appbrand.game.a.f();
        ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
        localObject = new com.tencent.mm.plugin.appbrand.game.a.d();
        ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
        return true;
      }
      
      public final String getName()
      {
        return "InitFTSMiniGamePluginTask";
      }
    });
    com.tencent.mm.kernel.g.Eh().a(this.dOT);
    com.tencent.mm.plugin.appbrand.dynamic.g.initialize();
    com.tencent.mm.model.c.c.Jx().c(this.dEC);
    com.tencent.mm.plugin.appbrand.config.f.init();
    localObject1 = this.ffm;
    AppBrandGuideUI.a.ano().registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject1);
    AppBrandStickyBannerLogic.b.d((com.tencent.mm.plugin.appbrand.ui.banner.f)localObject1);
    ((AppBrandGuideUI.a)localObject1).guw = false;
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    x.d("MicroMsg.SubCoreAppBrand", "onAccountRelease");
    if (this.feT != null)
    {
      this.feT.dead();
      this.feT = null;
    }
    Object localObject = this.feV.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((com.tencent.mm.sdk.b.c)((Iterator)localObject).next()).dead();
    }
    com.tencent.mm.plugin.appbrand.f.release();
    localObject = an.fhL.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b(str, this.ffh, true);
    }
    j.b.unregister();
    o.a.unregister();
    ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().c(this.feS);
    aq.shutdown();
    feB = null;
    feG = null;
    feC = null;
    feD = null;
    feE = null;
    feF = null;
    feH = null;
    feI = null;
    feJ = null;
    feL = null;
    feM = null;
    feN = null;
    feO = null;
    feP = null;
    a.aaP();
    if (feR != null)
    {
      localObject = feR;
      ((com.tencent.mm.plugin.appbrand.c.b)localObject).fnS.clear();
      ((com.tencent.mm.plugin.appbrand.c.b)localObject).fnT.clear();
      feR = null;
    }
    feQ = null;
    if (feK != null)
    {
      feK.iQ(hashCode());
      feK = null;
    }
    com.tencent.mm.plugin.appbrand.appusage.c.release();
    q.release();
    localObject = com.tencent.mm.plugin.appbrand.appcache.a.b.i.fiQ;
    if (((com.tencent.mm.plugin.appbrand.appcache.a.b.i)localObject).fiS != null) {
      ((com.tencent.mm.plugin.appbrand.appcache.a.b.i)localObject).fiS.cBH();
    }
    ((com.tencent.mm.plugin.appbrand.appcache.a.b.i)localObject).fiR = false;
    localObject = c.a.gsM;
    x.d("MicroMsg.WxaFTSSearchCore", "reset");
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.appbrand.m.c)localObject).gsI);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.appbrand.m.c)localObject).gsJ);
    ((com.tencent.mm.plugin.appbrand.m.c)localObject).gsK.dead();
    com.tencent.mm.plugin.appbrand.r.c.aox();
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).unregisterIndexStorage(512);
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).unregisterNativeLogic(7);
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).unregisterFTSUILogic(144);
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).unregisterFTSUILogic(4224);
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).unregisterIndexStorage(8);
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).unregisterNativeLogic(10);
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).unregisterFTSUILogic(208);
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).unregisterFTSUILogic(4240);
    com.tencent.mm.kernel.g.Eh().b(this.dOT);
    com.tencent.mm.plugin.appbrand.dynamic.g.release();
    com.tencent.mm.model.c.c.Jx().d(this.dEC);
    com.tencent.mm.plugin.appbrand.config.f.release();
    localObject = this.ffm;
    AppBrandGuideUI.a.ano().unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject);
    AppBrandStickyBannerLogic.b.c((com.tencent.mm.plugin.appbrand.ui.banner.f)localObject);
    ((AppBrandGuideUI.a)localObject).guw = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/app/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */