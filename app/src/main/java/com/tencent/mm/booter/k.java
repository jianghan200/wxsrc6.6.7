package com.tencent.mm.booter;

import android.bluetooth.BluetoothAdapter;
import android.os.Build.VERSION;
import android.os.Looper;
import com.tencent.mm.g.a.dl;
import com.tencent.mm.g.a.dm;
import com.tencent.mm.k.g;
import com.tencent.mm.model.au;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.protocal.c.ane;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class k
{
  private static com.tencent.mm.modelgeo.c cXl;
  private static float cXm = -85.0F;
  private static float cXn = -1000.0F;
  private static boolean cXo = false;
  private static Map<String, ane> cXp = new ConcurrentHashMap();
  private static List<ane> cXq = new CopyOnWriteArrayList();
  private static Boolean cXr = Boolean.valueOf(false);
  private static a.a cXs = new k.1();
  private static al cXt = new al(Looper.getMainLooper(), new k.2(), true);
  private static com.tencent.mm.sdk.b.c cXu = new com.tencent.mm.sdk.b.c() {};
  
  public static void run()
  {
    if ((!au.HX()) || (au.Dr())) {}
    do
    {
      do
      {
        return;
        au.HU();
        localObject = Boolean.valueOf(bi.a((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sRS, null), false));
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PostTaskStartRangeForIBeacon", "the range road status is " + localObject);
      } while (!((Boolean)localObject).booleanValue());
      long l1 = bi.VE();
      au.HU();
      long l2 = bi.a((Long)com.tencent.mm.model.c.DT().get(aa.a.sRT, null), 0L);
      au.HU();
      if (l1 - l2 > bi.a((Long)com.tencent.mm.model.c.DT().get(aa.a.sRN, null), 0L))
      {
        au.HU();
        com.tencent.mm.model.c.DT().a(aa.a.sRS, Boolean.valueOf(false));
        au.HU();
        com.tencent.mm.model.c.DT().a(aa.a.sRR, "");
        au.HU();
        com.tencent.mm.model.c.DT().a(aa.a.sRQ, "");
        au.HU();
        com.tencent.mm.model.c.Dt();
        return;
      }
      localObject = BluetoothAdapter.getDefaultAdapter();
      if ((Build.VERSION.SDK_INT < 18) || (localObject == null) || (((BluetoothAdapter)localObject).getState() != 12)) {
        break;
      }
      localObject = g.AU().AJ();
    } while (localObject == null);
    Object localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PostTaskStartRangeForIBeacon", "op=true,iBeacon = %s", new Object[] { str });
      dl localdl = new dl();
      localdl.bLj.bLl = str;
      localdl.bLj.bLi = true;
      a.sFg.m(localdl);
    }
    cXl = com.tencent.mm.modelgeo.c.OB();
    if (cXt.ciq()) {
      cXt.J(3000L, 3000L);
    }
    if ((!cXo) && (cXl != null)) {
      cXl.b(cXs);
    }
    a.sFg.b(cXu);
    return;
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sRQ, "");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/booter/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */