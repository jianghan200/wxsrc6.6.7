package com.tencent.mm.ao;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.plugin.ab.a;
import com.tencent.mm.plugin.messenger.foundation.a.m;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.btb;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bh;
import java.util.Map;

public final class e
  implements m
{
  public final d.b a(String paramString, Map<String, String> paramMap, com.tencent.mm.ab.d.a parama)
  {
    x.d("dancy", "dancy consumeNewXml， subType:%s", new Object[] { paramString });
    int k;
    int m;
    int n;
    long l;
    int j;
    label139:
    label154:
    label169:
    String str;
    label185:
    int i;
    if ((com.tencent.mm.sdk.platformtools.bi.oV(paramString).equals("newtips")) && (paramMap != null))
    {
      a.bji();
      if (paramMap != null) {
        break label397;
      }
      x.e("MicroMsg.NewTipsManager", "parse newtips map fail! map is null!!");
      paramString = null;
      if (paramString != null)
      {
        k = paramString.field_tipId;
        m = paramString.field_tipVersion;
        n = paramString.field_tipType;
        l = com.tencent.mm.sdk.platformtools.bi.VF();
        ad.getContext().getSharedPreferences(ad.chY() + "_newtips_report", 0).edit().putLong("newtips_gettipstime", l).commit();
        if (paramString.field_tipsShowInfo == null) {
          break label719;
        }
        j = paramString.field_tipsShowInfo.showType;
        if (paramString.field_tipsShowInfo == null) {
          break label725;
        }
        paramMap = paramString.field_tipsShowInfo.title;
        if (paramString.field_tipsShowInfo == null) {
          break label731;
        }
        parama = paramString.field_tipsShowInfo.lMY;
        if (paramString.field_tipsShowInfo == null) {
          break label737;
        }
        str = paramString.field_tipsShowInfo.path;
        a.bjk();
        if (c.b(paramString)) {
          break label744;
        }
        i = 2;
      }
    }
    for (;;)
    {
      h.mEJ.h(14995, new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Long.valueOf(l), "", "", "", "", "", "", "", Integer.valueOf(j), paramMap, parama, str, Integer.valueOf(i), Integer.valueOf(b.ebz), "" });
      paramMap = a.bji().ebC;
      if (paramMap != null)
      {
        a.bjk();
        if (c.d(paramString))
        {
          x.d("dancy", "dancy consumeNewXml notifyShowNewTips isExit: %s, begintime: %s", new Object[] { Boolean.valueOf(paramString.field_isExit), Long.valueOf(paramString.field_beginShowTime) });
          paramMap.e(paramString);
        }
      }
      return null;
      label397:
      l = com.tencent.mm.sdk.platformtools.bi.VE();
      paramString = new bh();
      paramString.field_tipId = com.tencent.mm.sdk.platformtools.bi.getInt((String)paramMap.get(".sysmsg.newtips.control.tips_id"), 0);
      paramString.field_tipVersion = com.tencent.mm.sdk.platformtools.bi.getInt((String)paramMap.get(".sysmsg.newtips.control.tips_version"), 0);
      paramString.field_tipType = com.tencent.mm.sdk.platformtools.bi.getInt((String)paramMap.get(".sysmsg.newtips.control.tips_type"), 0);
      paramString.field_beginShowTime = Math.max(com.tencent.mm.sdk.platformtools.bi.getLong((String)paramMap.get(".sysmsg.newtips.control.begin_time"), 0L), l);
      paramString.field_overdueTime = com.tencent.mm.sdk.platformtools.bi.getLong((String)paramMap.get(".sysmsg.newtips.control.overdue_time"), 0L);
      paramString.field_disappearTime = com.tencent.mm.sdk.platformtools.bi.getLong((String)paramMap.get(".sysmsg.newtips.control.disappear_time"), 0L);
      if (paramMap.get(".sysmsg.newtips.control.tips_showInfo") != null)
      {
        paramString.field_tipsShowInfo = new btb();
        paramString.field_tipsShowInfo.showType = com.tencent.mm.sdk.platformtools.bi.getInt((String)paramMap.get(".sysmsg.newtips.control.tips_showInfo.show_type"), 0);
        paramString.field_tipsShowInfo.title = ((String)paramMap.get(".sysmsg.newtips.control.tips_showInfo.title"));
        paramString.field_tipsShowInfo.lMY = ((String)paramMap.get(".sysmsg.newtips.control.tips_showInfo.icon_url"));
        paramString.field_tipsShowInfo.path = ((String)paramMap.get(".sysmsg.newtips.control.tips_showInfo.path"));
      }
      paramString.field_extInfo = ((String)paramMap.get(".sysmsg.newtips.control.tips_showInfo."));
      a.bjj().Do(paramString.field_tipId);
      a.bjk();
      if ((c.a(paramString)) && (c.b(paramString)) && (c.c(paramString)) && (!paramString.field_isReject)) {}
      for (i = 1;; i = 0)
      {
        if (i != 0)
        {
          paramString.field_isExit = true;
          a.bjj().a(paramString, new String[0]);
        }
        break;
      }
      label719:
      j = 0;
      break label139;
      label725:
      paramMap = "";
      break label154;
      label731:
      parama = "";
      break label169;
      label737:
      str = "";
      break label185;
      label744:
      if (!c.c(paramString))
      {
        i = 3;
      }
      else if (!c.a(paramString))
      {
        i = 4;
      }
      else
      {
        bh localbh = a.bjj().Do(paramString.field_tipId);
        if ((localbh != null) && (paramString.field_tipType == localbh.field_tipType)) {}
        for (i = 1;; i = 0)
        {
          if (i != 0) {
            break label819;
          }
          i = 5;
          break;
        }
        label819:
        if (a.bjj().Do(paramString.field_tipId) != null) {}
        for (i = 1;; i = 0)
        {
          if (i != 0) {
            break label853;
          }
          i = 6;
          break;
        }
        label853:
        if (paramString.field_isReject) {
          i = 7;
        } else {
          i = 0;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ao/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */