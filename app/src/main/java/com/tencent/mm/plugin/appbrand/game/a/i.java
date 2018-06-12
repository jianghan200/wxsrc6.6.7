package com.tencent.mm.plugin.appbrand.game.a;

import android.os.HandlerThread;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appusage.k;
import com.tencent.mm.plugin.appbrand.appusage.p;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.game.a.a.a;
import com.tencent.mm.plugin.appbrand.game.a.a.b;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

 enum i
{
  private static j.a fAN = new i.1();
  private static j.a fAO = new i.2();
  
  private static a a(k paramk)
  {
    if (paramk == null) {
      return null;
    }
    a locala = new a();
    locala.dfX = paramk.dfX;
    locala.jQb = paramk.appId;
    locala.jSv = paramk.appName;
    locala.jPG = paramk.fmb;
    locala.hbL = paramk.bGy;
    locala.fig = paramk.fig;
    return locala;
  }
  
  public static List<b> agp()
  {
    if (e.abo() == null) {
      return null;
    }
    Object localObject1 = new LinkedList();
    if (e.abg() != null)
    {
      localObject2 = e.abg().adf();
      if (!bi.cX((List)localObject2)) {
        ((List)localObject1).addAll((Collection)localObject2);
      }
    }
    Object localObject2 = ((List)localObject1).iterator();
    while (((Iterator)localObject2).hasNext()) {
      if (!((k)((Iterator)localObject2).next()).aaq()) {
        ((Iterator)localObject2).remove();
      }
    }
    if (!bi.cX((List)localObject1))
    {
      localObject2 = new ArrayList();
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((List)localObject2).add(a((k)((Iterator)localObject1).next()));
      }
      e.abo().d((List)localObject2, false);
      x.i("MicroMsg.SearchMiniGameQueryLogic", "AppBrandRecentTaskInfo convert to MiniGameStorage, size:%d", new Object[] { Integer.valueOf(((List)localObject2).size()) });
    }
    x.i("MicroMsg.SearchMiniGameQueryLogic", "updateMiniGameList");
    return e.abo().agq();
  }
  
  public static void e(j.a parama)
  {
    if (e.abo() != null) {
      e.abo().c(parama);
    }
  }
  
  public static void f(j.a parama)
  {
    if (e.abo() != null) {
      e.abo().d(parama);
    }
  }
  
  public static void onCreate()
  {
    q.aei().a(fAN, com.tencent.mm.plugin.appbrand.r.c.Em().lnJ.getLooper());
    if (e.abg() != null) {
      e.abg().c(fAO);
    }
  }
  
  public static void onDestroy()
  {
    q.aei().d(fAN);
    if (e.abg() != null) {
      e.abg().d(fAO);
    }
  }
  
  public static b sO(String paramString)
  {
    if (e.abo() != null) {
      return e.abo().sO(paramString);
    }
    return null;
  }
  
  public static k sP(String paramString)
  {
    if (e.abg() == null) {
      return null;
    }
    return e.abg().rn(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */