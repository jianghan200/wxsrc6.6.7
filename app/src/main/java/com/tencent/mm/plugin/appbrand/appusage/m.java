package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.bt.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.c.akt;
import com.tencent.mm.protocal.c.aku;
import com.tencent.mm.protocal.c.cgr;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;
import java.util.Iterator;
import java.util.List;

public enum m
{
  public static Integer fmn = null;
  
  static void a(int paramInt1, int paramInt2, int paramInt3, b paramb)
  {
    if (paramb == null) {}
    do
    {
      do
      {
        return;
      } while ((((akt)paramb.dID.dIL).condition & 0x2) == 0);
      paramb = (aku)paramb.dIE.dIL;
    } while ((paramInt2 != 0) || (paramInt3 != 0) || (paramb == null));
    if (com.tencent.mm.plugin.appbrand.app.e.abh() != null)
    {
      localObject1 = com.tencent.mm.plugin.appbrand.app.e.abh();
      localObject2 = paramb.rNI;
      long l = ((l)localObject1).fhY.dO(Thread.currentThread().getId());
      ((l)localObject1).fhY.delete("AppBrandStarApp", "", null);
      l.a locala = new l.a();
      Iterator localIterator = ((List)localObject2).iterator();
      while (localIterator.hasNext())
      {
        cgr localcgr = (cgr)localIterator.next();
        if (!bi.oW(localcgr.username))
        {
          locala.field_username = localcgr.username;
          locala.field_versionType = localcgr.rka;
          locala.field_updateTime = localcgr.rqg;
          ((l)localObject1).fhY.insert("AppBrandStarApp", null, locala.wH());
        }
      }
      ((l)localObject1).fhY.gp(l);
      ((l)localObject1).b("batch", 3, localObject2);
      n.a(paramInt1, null, paramb.rNI);
    }
    Object localObject1 = g.Ei().DT();
    Object localObject2 = aa.a.sTz;
    if ((paramb.status & 0x1) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      ((x)localObject1).a((aa.a)localObject2, Boolean.valueOf(bool));
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appusage/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */