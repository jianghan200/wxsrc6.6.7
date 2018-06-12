package com.tencent.mm.plugin.game.e;

import com.tencent.mm.g.c.p;
import com.tencent.mm.plugin.ac.a.a.a;
import com.tencent.mm.pluginsdk.model.app.e;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class d
{
  public static void S(LinkedList<? extends f> paramLinkedList)
  {
    if (paramLinkedList == null) {
      x.e("MicroMsg.GameDataUtil", "Null appInfos");
    }
    for (;;)
    {
      return;
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext()) {
        a((f)paramLinkedList.next());
      }
    }
  }
  
  public static void a(f paramf)
  {
    if (paramf == null)
    {
      x.e("MicroMsg.GameDataUtil", "Null appInfo");
      return;
    }
    if (bi.oW(paramf.field_appId))
    {
      x.e("MicroMsg.GameDataUtil", "Invalid appId");
      return;
    }
    String str1 = paramf.field_appId;
    f localf = g.bl(str1, true);
    if (localf == null)
    {
      localf = new f();
      localf.field_appId = str1;
    }
    for (boolean bool2 = true;; bool2 = false)
    {
      String str2 = w.chP();
      boolean bool1;
      if (str2.equals("zh_CN"))
      {
        localf.field_appName = paramf.field_appName;
        localf.field_appType = paramf.field_appType;
        localf.field_packageName = paramf.field_packageName;
        localf.di(paramf.cmE);
        localf.dl(paramf.cmJ);
        localf.eA(paramf.cmN);
        localf.dm(paramf.cmK);
        localf.dr(paramf.cmQ);
        localf.ds(paramf.cmR);
        localf.dp(paramf.cmO);
        localf.dq(paramf.cmP);
        localf.eB(paramf.cmT);
        if (!bi.oW(paramf.cmH)) {
          localf.dj(paramf.cmH);
        }
        if (!bool2) {
          break label307;
        }
        bool1 = com.tencent.mm.plugin.ac.a.bmf().l(localf);
        a.a.bmm().Jp(str1);
      }
      for (;;)
      {
        x.i("MicroMsg.GameDataUtil", "Saving AppInfo, appId: %s, insert?: %s, return: %s", new Object[] { str1, Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
        return;
        if ((str2.equals("zh_TW")) || (str2.equals("zh_HK")))
        {
          localf.field_appName_tw = paramf.field_appName;
          break;
        }
        localf.field_appName_en = paramf.field_appName;
        break;
        label307:
        if (localf.field_appVersion < paramf.field_appVersion)
        {
          x.i("MicroMsg.GameDataUtil", "oldVersion = %s, newVersion = %s", new Object[] { Integer.valueOf(localf.field_appVersion), Integer.valueOf(paramf.field_appVersion) });
          bool1 = com.tencent.mm.plugin.ac.a.bmf().a(localf, new String[0]);
          a.a.bmm().Jp(str1);
        }
        else
        {
          int i;
          if ((localf == null) || (bi.oW(localf.field_appIconUrl))) {
            i = 1;
          }
          for (;;)
          {
            if (i == 0) {
              break label539;
            }
            x.i("MicroMsg.GameDataUtil", "oldIcon = %s, newIcon = %s", new Object[] { localf.field_appIconUrl, paramf.field_appIconUrl });
            localf.field_appIconUrl = paramf.field_appIconUrl;
            bool1 = com.tencent.mm.plugin.ac.a.bmf().a(localf, new String[0]);
            com.tencent.mm.plugin.ac.a.bmd().cO(str1, 1);
            com.tencent.mm.plugin.ac.a.bmd().cO(str1, 2);
            com.tencent.mm.plugin.ac.a.bmd().cO(str1, 3);
            com.tencent.mm.plugin.ac.a.bmd().cO(str1, 4);
            com.tencent.mm.plugin.ac.a.bmd().cO(str1, 5);
            break;
            if ((paramf == null) || (bi.oW(paramf.field_appIconUrl))) {
              i = 0;
            } else if (!localf.field_appIconUrl.equals(paramf.field_appIconUrl)) {
              i = 1;
            } else {
              i = 0;
            }
          }
          label539:
          bool1 = com.tencent.mm.plugin.ac.a.bmf().a(localf, new String[0]);
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/game/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */