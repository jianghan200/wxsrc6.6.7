package com.tencent.mm.plugin.appbrand.appcache.a;

import com.tencent.mm.plugin.appbrand.appcache.a.b.c;
import com.tencent.mm.plugin.appbrand.appcache.a.b.d;
import com.tencent.mm.plugin.appbrand.appcache.a.b.e;
import com.tencent.mm.plugin.appbrand.appcache.a.b.h;
import com.tencent.mm.protocal.c.bsd;
import com.tencent.mm.protocal.c.chn;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.List;

public final class b
{
  static void aj(List<bsd> paramList)
  {
    if (bi.cX(paramList)) {
      return;
    }
    paramList = paramList.iterator();
    label15:
    bsd localbsd;
    String str1;
    String str2;
    boolean bool1;
    label100:
    boolean bool2;
    label113:
    boolean bool3;
    label126:
    boolean bool4;
    label140:
    boolean bool5;
    while (paramList.hasNext())
    {
      localbsd = (bsd)paramList.next();
      if (localbsd.spM == null)
      {
        x.e("MicroMsg.AppBrand.PredownloadCmdProcessor", "processCmd, username %s, appId %s, nil Cmds", new Object[] { localbsd.spJ, localbsd.rbW });
      }
      else
      {
        str1 = localbsd.spJ;
        str2 = localbsd.rbW;
        if (localbsd.spM.sBy == null) {
          break label551;
        }
        bool1 = true;
        if (localbsd.spM.sBz == null) {
          break label556;
        }
        bool2 = true;
        if (localbsd.spM.sBA == null) {
          break label561;
        }
        bool3 = true;
        if (localbsd.spM.sBB == null) {
          break label566;
        }
        bool4 = true;
        if (localbsd.spM.sBC == null) {
          break label572;
        }
        bool5 = true;
        label154:
        if (localbsd.spM.sBD == null) {
          break label578;
        }
      }
    }
    label551:
    label556:
    label561:
    label566:
    label572:
    label578:
    for (boolean bool6 = true;; bool6 = false)
    {
      x.i("MicroMsg.AppBrand.PredownloadCmdProcessor", "processCmd, username %s appId %s, GetContact(%b), GetCode(%b), IssueContact(%b), IssueLaunch(%b), IssueDecryptKey(%s), UpdateVersion(%b)", new Object[] { str1, str2, Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool5), Boolean.valueOf(bool6) });
      if (localbsd.spM.sBy != null) {
        com.tencent.mm.by.g.b(localbsd.spJ, localbsd.rbW, localbsd.spM.sBy).j(new d());
      }
      if (localbsd.spM.sBz != null) {
        com.tencent.mm.by.g.b(localbsd.spJ, localbsd.rbW, localbsd.spM.sBz).j(new c()).g(new b.1());
      }
      if (localbsd.spM.sBA != null) {
        com.tencent.mm.by.g.b(localbsd.spJ, localbsd.rbW, localbsd.spM.sBA).j(new e());
      }
      if (localbsd.spM.sBB != null) {
        com.tencent.mm.by.g.b(localbsd.spJ, localbsd.rbW, localbsd.spM.sBB).j(new com.tencent.mm.plugin.appbrand.appcache.a.b.g());
      }
      if (localbsd.spM.sBC != null) {
        com.tencent.mm.by.g.b(localbsd.spJ, localbsd.rbW, localbsd.spM.sBC).j(new com.tencent.mm.plugin.appbrand.appcache.a.b.f());
      }
      if (localbsd.spM.sBD != null) {
        com.tencent.mm.by.g.b(localbsd.spJ, localbsd.rbW, localbsd.spM.sBD).j(new h());
      }
      if (localbsd.spM.sBE == null) {
        break label15;
      }
      com.tencent.mm.by.g.b(localbsd.spJ, localbsd.rbW, localbsd.spM.sBE).j(new com.tencent.mm.plugin.appbrand.appcache.a.b.b());
      break label15;
      break;
      bool1 = false;
      break label100;
      bool2 = false;
      break label113;
      bool3 = false;
      break label126;
      bool4 = false;
      break label140;
      bool5 = false;
      break label154;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */