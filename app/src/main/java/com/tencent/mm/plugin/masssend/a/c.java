package com.tencent.mm.plugin.masssend.a;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import com.tencent.mm.R.l;
import com.tencent.mm.a.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class c
{
  private LinkedList<d> lap;
  
  private static String bcl()
  {
    if (au.HX())
    {
      au.HU();
      String str = String.format("%s/masssend_%s.ini", new Object[] { com.tencent.mm.model.c.Gp(), w.chP() });
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MassSendService", "config file path is %s", new Object[] { str });
      return str;
    }
    return "";
  }
  
  private boolean bcm()
  {
    byte[] arrayOfByte;
    if (this.lap == null)
    {
      localObject = bcl();
      arrayOfByte = com.tencent.mm.a.e.f((String)localObject, 0, -1);
      if (arrayOfByte == null) {
        return false;
      }
    }
    try
    {
      this.lap = ((e)new e().aG(arrayOfByte)).laq;
      if (this.lap == null)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MassSendService", "info list is empty");
        return false;
      }
    }
    catch (Exception localException)
    {
      com.tencent.mm.a.e.deleteFile((String)localObject);
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MassSendService", "info list[%s]", new Object[] { this.lap.toString() });
    long l = bi.VE();
    Object localObject = this.lap.iterator();
    while (((Iterator)localObject).hasNext())
    {
      d locald = (d)((Iterator)localObject).next();
      if ((locald.bwe <= l) && (l <= locald.end)) {
        return true;
      }
    }
    return false;
  }
  
  public static void dV(long paramLong)
  {
    au.HU();
    com.tencent.mm.model.c.DT().set(102409, Long.valueOf(paramLong));
  }
  
  public final void Gj(String paramString)
  {
    if (bi.oW(paramString)) {}
    Object localObject1;
    do
    {
      return;
      localObject1 = bl.z(paramString, "Festivals");
    } while (localObject1 == null);
    e locale = new e();
    int i = 0;
    Object localObject2 = new StringBuilder(".Festivals.Festival");
    if (i == 0) {}
    for (paramString = "";; paramString = String.valueOf(i))
    {
      paramString = paramString;
      if (!((Map)localObject1).containsKey(paramString)) {
        break label181;
      }
      localObject2 = new d();
      ((d)localObject2).bwe = bi.WL((String)((Map)localObject1).get(paramString + ".StartTime"));
      ((d)localObject2).end = (bi.WL((String)((Map)localObject1).get(paramString + ".EndTime")) + 86400000);
      locale.laq.add(localObject2);
      i += 1;
      break;
    }
    label181:
    locale.count = locale.laq.size();
    this.lap = locale.laq;
    try
    {
      paramString = locale.toByteArray();
      localObject1 = bcl();
      if (bi.oW((String)localObject1))
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MassSendService", "mass send config file path is null, return");
        return;
      }
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.MassSendService", paramString, "", new Object[0]);
      return;
    }
    localObject2 = new File((String)localObject1);
    if (!((File)localObject2).exists())
    {
      au.HU();
      com.tencent.mm.model.c.DT().set(102408, Boolean.valueOf(false));
    }
    label346:
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MassSendService", "save to config file : %s", new Object[] { locale.toString() });
      com.tencent.mm.a.e.b((String)localObject1, paramString, paramString.length);
      return;
      if (!g.m((File)localObject2).equals(g.u(paramString))) {}
      for (i = 1;; i = 0)
      {
        if (i == 0) {
          break label346;
        }
        au.HU();
        com.tencent.mm.model.c.DT().set(102408, Boolean.valueOf(false));
        break;
      }
    }
  }
  
  public final void bck()
  {
    Object localObject1 = null;
    boolean bool1 = bcm();
    au.HU();
    boolean bool2 = ((Boolean)com.tencent.mm.model.c.DT().get(102408, Boolean.valueOf(false))).booleanValue();
    int i;
    if ((q.GQ() & 0x10000) == 0)
    {
      i = 1;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MassSendService", "hadSetTop is %B", new Object[] { Boolean.valueOf(bool2) });
      if ((i == 0) || (bool2) || (!bool1)) {
        break label401;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MassSendService", "set top conversation");
      au.HU();
      if (com.tencent.mm.model.c.FW().Yq("masssendapp") != null) {
        break label242;
      }
      au.HU();
      if (com.tencent.mm.model.c.FW().Yq("masssendapp") == null)
      {
        localObject1 = new ai();
        ((ai)localObject1).setUsername("masssendapp");
        ((ai)localObject1).setContent(ad.getContext().getResources().getString(R.l.contact_info_masssend_tip));
        ((ai)localObject1).as(bi.VF() + 2000L);
        ((ai)localObject1).eX(0);
        ((ai)localObject1).eV(0);
        au.HU();
        com.tencent.mm.model.c.FW().d((ai)localObject1);
      }
    }
    label242:
    Object localObject2;
    for (;;)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.k(10425, "");
      au.HU();
      com.tencent.mm.model.c.DT().set(102409, Long.valueOf(bi.VF()));
      au.HU();
      com.tencent.mm.model.c.DT().set(102408, Boolean.valueOf(true));
      return;
      i = 0;
      break;
      localObject2 = h.bco().dCZ.b("select * from massendinfo ORDER BY createtime DESC  limit 1", null, 2);
      if (localObject2 != null) {
        break label351;
      }
      label263:
      if (localObject1 != null) {
        break label387;
      }
      localObject1 = ad.getContext().getResources().getString(R.l.contact_info_masssend_tip);
      label282:
      localObject2 = new ai();
      ((ai)localObject2).setUsername("masssendapp");
      ((ai)localObject2).setContent((String)localObject1);
      ((ai)localObject2).as(bi.VF() + 2000L);
      ((ai)localObject2).eX(0);
      ((ai)localObject2).eV(0);
      au.HU();
      com.tencent.mm.model.c.FW().a((ai)localObject2, "masssendapp");
    }
    label351:
    if (((Cursor)localObject2).moveToFirst())
    {
      localObject1 = new a();
      ((a)localObject1).d((Cursor)localObject2);
    }
    for (;;)
    {
      ((Cursor)localObject2).close();
      break label263;
      label387:
      h.bco();
      localObject1 = b.a((a)localObject1);
      break label282;
      label401:
      if (bool1) {
        break;
      }
      au.HU();
      com.tencent.mm.model.c.DT().set(102408, Boolean.valueOf(false));
      return;
      localObject1 = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/masssend/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */