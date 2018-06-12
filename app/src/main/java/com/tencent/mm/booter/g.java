package com.tencent.mm.booter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import com.tencent.mm.app.f.a;
import com.tencent.mm.ar.i;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.plugin.webwx.a.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;

public final class g
{
  public static void run()
  {
    Object localObject1 = ad.getContext();
    Object localObject4 = new g.1();
    if (localObject1 != null) {}
    int j;
    label1061:
    label1155:
    label1160:
    label1184:
    label1189:
    for (;;)
    {
      boolean bool;
      try
      {
        localObject1 = ((Context)localObject1).getSharedPreferences("crash_status_file", 4);
        localObject5 = ((SharedPreferences)localObject1).getString("crashlist", "").split(";");
        if (localObject5 != null)
        {
          i = localObject5.length;
          if (i > 0) {
            continue;
          }
        }
      }
      catch (Throwable localThrowable1)
      {
        Object localObject5;
        long l;
        Object localObject2;
        continue;
        try
        {
          Object localObject3 = localThrowable1.getSharedPreferences("crash_status_file", 4);
          if (((SharedPreferences)localObject3).getInt("googleplaysizelimit", 3072) == i) {
            continue;
          }
          localObject3 = ((SharedPreferences)localObject3).edit();
          ((SharedPreferences.Editor)localObject3).putInt("googleplaysizelimit", i);
          ((SharedPreferences.Editor)localObject3).commit();
        }
        catch (Throwable localThrowable2) {}
        continue;
        i = 3;
        continue;
        if (199 != i) {
          continue;
        }
        if (!q.GF().equals(localObject5)) {
          break label1209;
        }
      }
      localObject1 = ad.getContext();
      i = com.tencent.mm.k.g.AT().getInt("AndroidGooglePlayCrashUploadSizeLimit", 3072);
      if ((localObject1 == null) || (i <= 0))
      {
        au.HU();
        if (ai.bH(ai.d((Long)c.DT().get(aa.a.sOt, null))) > 21600000L)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.a(279L, com.tencent.mm.k.g.AT().getInt("AndroidDynamicConfigVer", 0) % 16, 1L, false);
          au.HU();
          c.DT().a(aa.a.sOt, Long.valueOf(ai.VF()));
        }
        au.HU();
        if (ai.bH(ai.d((Long)c.DT().get(aa.a.sOu, null))) > 21600000L)
        {
          au.HU();
          c.DT().a(aa.a.sOu, Long.valueOf(ai.VF()));
          localObject4 = o.Ta();
          localObject1 = new int[6];
          tmp221_219 = localObject1;
          tmp221_219[0] = 0;
          tmp225_221 = tmp221_219;
          tmp225_221[1] = 0;
          tmp229_225 = tmp225_221;
          tmp229_225[2] = 0;
          tmp233_229 = tmp229_225;
          tmp233_229[3] = 0;
          tmp237_233 = tmp233_229;
          tmp237_233[4] = 0;
          tmp241_237 = tmp237_233;
          tmp241_237[5] = 0;
          tmp241_237;
          try
          {
            l = bi.VE();
            localObject5 = "select status, videofuncflag, human from videoinfo2 where lastmodifytime > " + (l - 21600L);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoInfoStorage", "reportVideoMsgCount sql:%s", new Object[] { localObject5 });
            localObject4 = ((s)localObject4).dCZ.b((String)localObject5, null, 2);
            if (!((Cursor)localObject4).moveToNext()) {
              break label1061;
            }
            i = ((Cursor)localObject4).getInt(0);
            j = ((Cursor)localObject4).getInt(1);
            localObject5 = ((Cursor)localObject4).getString(2);
            if (111 != i) {
              continue;
            }
            if (j != 3) {
              continue;
            }
            i = 0;
            localObject1[i] += 1;
            continue;
            l = bi.a((Long)com.tencent.mm.kernel.g.Ei().DT().get(81939, null), 0L);
          }
          catch (Exception localException) {}
        }
        if (bi.VF() - l <= 86400000L) {
          break label1155;
        }
        i = 1;
        if (i != 0) {
          new i();
        }
        l = System.currentTimeMillis();
        au.HU();
        bool = ((Boolean)c.DT().get(233475, Boolean.valueOf(false))).booleanValue();
        au.HU();
        if (c.FR().clo() > 0) {
          break label1160;
        }
        if (!bool)
        {
          au.HU();
          c.FW().Yp("officialaccounts");
          au.HU();
          c.DT().set(233475, Boolean.valueOf(true));
        }
        com.tencent.mm.plugin.webwx.a.g.bYF().bYH().bYD();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PostTaskLightweightJob", "use time %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        return;
        localObject2 = localException.edit();
        ((SharedPreferences.Editor)localObject2).putString("crashlist", "");
        ((SharedPreferences.Editor)localObject2).commit();
        i = 0;
        if (i >= localObject5.length) {
          break label1189;
        }
        if (localObject5[i] == null)
        {
          localObject2 = null;
          if ((localObject2 == null) || (localObject2.length < 2)) {
            break label1184;
          }
          if (localObject2[1].equals("anr"))
          {
            ((f.a)localObject4).et(10);
            break label1184;
          }
        }
        else
        {
          localObject2 = localObject5[i].split(",");
          continue;
        }
        ((f.a)localObject4).et(11);
        if ("com.tencent.mm".equals(localObject2[0])) {
          ((f.a)localObject4).et(14);
        }
        if ("com.tencent.mm:push".equals(localObject2[0])) {
          ((f.a)localObject4).et(17);
        }
        if ("com.tencent.mm:tools".equals(localObject2[0])) {
          ((f.a)localObject4).et(20);
        }
        if (localObject2[1].equals("java"))
        {
          ((f.a)localObject4).et(12);
          if ("com.tencent.mm".equals(localObject2[0])) {
            ((f.a)localObject4).et(15);
          }
          if ("com.tencent.mm:push".equals(localObject2[0])) {
            ((f.a)localObject4).et(18);
          }
          if ("com.tencent.mm:tools".equals(localObject2[0])) {
            ((f.a)localObject4).et(21);
          }
        }
        if (localObject2[1].equals("jni"))
        {
          ((f.a)localObject4).et(13);
          if ("com.tencent.mm".equals(localObject2[0])) {
            ((f.a)localObject4).et(16);
          }
          if ("com.tencent.mm:push".equals(localObject2[0])) {
            ((f.a)localObject4).et(19);
          }
          if ("com.tencent.mm:tools".equals(localObject2[0])) {
            ((f.a)localObject4).et(22);
          }
        }
        if (!localObject2[1].equals("first")) {
          break label1184;
        }
        if ("com.tencent.mm".equals(localObject2[0])) {
          ((f.a)localObject4).et(23);
        }
        if ("com.tencent.mm:push".equals(localObject2[0])) {
          ((f.a)localObject4).et(24);
        }
        if (!"com.tencent.mm:tools".equals(localObject2[0])) {
          break label1184;
        }
        ((f.a)localObject4).et(25);
        break label1184;
      }
      if (j != 3) {
        break label1204;
      }
      i = 1;
      break;
      ((Cursor)localObject4).close();
      com.tencent.mm.plugin.report.service.h.mEJ.h(12696, new Object[] { Integer.valueOf(10010), Integer.valueOf(localThrowable2[0]), Integer.valueOf(localThrowable2[1]), Integer.valueOf(localThrowable2[2]), Integer.valueOf(localThrowable2[3]), Integer.valueOf(localThrowable2[4]), Integer.valueOf(localThrowable2[5]) });
      continue;
      i = 0;
      continue;
      if (bool)
      {
        au.HU();
        c.DT().set(233475, Boolean.valueOf(false));
        continue;
        i += 1;
      }
    }
    for (;;)
    {
      localThrowable2[i] += 1;
      break;
      label1204:
      i = 4;
    }
    label1209:
    if (j == 3) {}
    for (int i = 2;; i = 5)
    {
      localThrowable2[i] += 1;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/booter/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */