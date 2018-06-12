package com.tencent.mm.ao;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.plugin.ab.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.btb;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bh;

public final class c
{
  public static boolean a(bh parambh)
  {
    if (parambh == null)
    {
      x.e("MicroMsg.NewTipsManager", "check time, tipsInfo is null!!!");
      return false;
    }
    long l1 = com.tencent.mm.sdk.platformtools.bi.VE();
    boolean bool2;
    if ((parambh.field_overdueTime == 0L) && (parambh.field_disappearTime == 0L))
    {
      bool2 = true;
      x.i("MicroMsg.NewTipsManager", "timeEffective current: %s, overdueTime: %s, disappearTime: %s, show:%s", new Object[] { Long.valueOf(l1), Long.valueOf(parambh.field_overdueTime), Long.valueOf(parambh.field_disappearTime), Boolean.valueOf(bool2) });
      return bool2;
    }
    Long localLong = Long.valueOf(Math.min(parambh.field_beginShowTime + parambh.field_overdueTime, parambh.field_disappearTime));
    if ((l1 >= parambh.field_beginShowTime) && (l1 <= localLong.longValue())) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      bool2 = bool1;
      if (l1 <= localLong.longValue()) {
        break;
      }
      long l2 = com.tencent.mm.sdk.platformtools.bi.VF();
      ad.getContext().getSharedPreferences(ad.chY() + "_newtips_report", 0).edit().putLong("newtips_makeread_time", l2).commit();
      bool2 = bool1;
      break;
    }
  }
  
  public static boolean b(bh parambh)
  {
    if (parambh == null) {
      x.e("MicroMsg.NewTipsManager", "check path, tipsInfo is null!!!");
    }
    do
    {
      return false;
      localObject = a.bjj().Do(parambh.field_tipId);
    } while ((localObject == null) || (((bh)localObject).field_tipsShowInfo == null) || (parambh.field_tipsShowInfo == null));
    Object localObject = ((bh)localObject).field_tipsShowInfo.path;
    parambh = parambh.field_tipsShowInfo.path;
    if (((localObject == null) && (parambh == null)) || ((localObject != null) && (((String)localObject).equals(parambh)))) {
      return true;
    }
    x.i("MicroMsg.NewTipsManager", "path illegal, localPath:%s, newPath:%s", new Object[] { localObject, parambh });
    return false;
  }
  
  public static boolean c(bh parambh)
  {
    if (parambh == null) {
      x.e("MicroMsg.NewTipsManager", "check version, tipsInfo is null!!!");
    }
    bh localbh;
    do
    {
      return false;
      localbh = a.bjj().Do(parambh.field_tipId);
    } while ((localbh == null) || ((parambh.field_tipVersion <= localbh.field_tipVersion) && ((parambh.field_hadRead) || (parambh.field_tipVersion != localbh.field_tipVersion))));
    return true;
  }
  
  protected static boolean d(bh parambh)
  {
    if (parambh == null)
    {
      x.e("MicroMsg.NewTipsManager", "can not show new  tips！！ tipsInfo is null !!");
      return false;
    }
    if ((parambh.field_isExit) && (!parambh.field_hadRead) && (a(parambh))) {
      return true;
    }
    x.i("MicroMsg.NewTipsManager", "can not show tips, isExit:%s, hadRead:%s, timeEffective:%s", new Object[] { Boolean.valueOf(parambh.field_isExit), Boolean.valueOf(parambh.field_hadRead), Boolean.valueOf(a(parambh)) });
    return false;
  }
  
  public static boolean ig(int paramInt)
  {
    bh localbh = a.bjj().Do(paramInt);
    if (localbh == null)
    {
      x.e("MicroMsg.NewTipsManager", "showDot, newTipsInfo is null !!");
      return false;
    }
    String str3;
    label270:
    Object localObject;
    label288:
    String str1;
    if ((d(a.bjj().Do(paramInt))) && (localbh.field_tipsShowInfo != null) && (localbh.field_tipsShowInfo.showType == b.ebu))
    {
      if (localbh == null) {
        x.e("MicroMsg.NewTipsManager", "reportShowNewTips, newTipsInfo is null !!");
      }
      do
      {
        return true;
        str3 = String.format("newtips_show_%d-%d", new Object[] { Integer.valueOf(localbh.field_tipId), Integer.valueOf(localbh.field_tipVersion) });
      } while (ad.getContext().getSharedPreferences(ad.chY() + "_newtips_report", 0).getBoolean(str3, false));
      i = localbh.field_tipId;
      j = localbh.field_tipVersion;
      k = localbh.field_tipType;
      l1 = ad.getContext().getSharedPreferences(ad.chY() + "_newtips_report", 0).getLong("newtips_gettipstime", 0L);
      l2 = com.tencent.mm.sdk.platformtools.bi.VF();
      ad.getContext().getSharedPreferences(ad.chY() + "_newtips_report", 0).edit().putLong("newtips_realshow_time", l2).commit();
      if (localbh.field_tipsShowInfo != null)
      {
        paramInt = localbh.field_tipsShowInfo.showType;
        if (localbh.field_tipsShowInfo == null) {
          break label513;
        }
        localObject = localbh.field_tipsShowInfo.title;
        if (localbh.field_tipsShowInfo == null) {
          break label520;
        }
        str1 = localbh.field_tipsShowInfo.lMY;
        label306:
        if (localbh.field_tipsShowInfo == null) {
          break label527;
        }
      }
      label513:
      label520:
      label527:
      for (str2 = localbh.field_tipsShowInfo.path;; str2 = "")
      {
        h.mEJ.h(14995, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(l1), "", "", "", Long.valueOf(l2), "", "", "", Integer.valueOf(paramInt), localObject, str1, str2, "", Integer.valueOf(b.ebA), "" });
        ad.getContext().getSharedPreferences(ad.chY() + "_newtips_report", 0).edit().putBoolean(str3, true).commit();
        break;
        paramInt = 0;
        break label270;
        localObject = "";
        break label288;
        str1 = "";
        break label306;
      }
    }
    if (localbh == null) {
      x.e("MicroMsg.NewTipsManager", "reportDismissNewTips, newTipsInfo is null !!");
    }
    do
    {
      return false;
      str3 = String.format("newtips_dismiss_%d-%d", new Object[] { Integer.valueOf(localbh.field_tipId), Integer.valueOf(localbh.field_tipVersion) });
    } while (ad.getContext().getSharedPreferences(ad.chY() + "_newtips_report", 0).getBoolean(str3, false));
    int j = localbh.field_tipId;
    int k = localbh.field_tipVersion;
    int m = localbh.field_tipType;
    long l1 = ad.getContext().getSharedPreferences(ad.chY() + "_newtips_report", 0).getLong("newtips_gettipstime", 0L);
    long l2 = localbh.field_beginShowTime;
    long l3 = localbh.field_overdueTime;
    long l4 = localbh.field_disappearTime;
    long l5 = ad.getContext().getSharedPreferences(ad.chY() + "_newtips_report", 0).getLong("newtips_realshow_time", 0L);
    long l6 = ad.getContext().getSharedPreferences(ad.chY() + "_newtips_report", 0).getLong("newtips_makeread_time", 0L);
    int i = 0;
    long l7 = com.tencent.mm.sdk.platformtools.bi.VE();
    if ((!b(localbh)) || (!c(localbh)))
    {
      paramInt = 1;
      label799:
      if (localbh.field_tipsShowInfo == null) {
        break label1290;
      }
      i = localbh.field_tipsShowInfo.showType;
      label816:
      if (localbh.field_tipsShowInfo == null) {
        break label1295;
      }
      localObject = localbh.field_tipsShowInfo.title;
      label834:
      if (localbh.field_tipsShowInfo == null) {
        break label1302;
      }
      str1 = localbh.field_tipsShowInfo.lMY;
      label852:
      if (localbh.field_tipsShowInfo == null) {
        break label1309;
      }
    }
    label1290:
    label1295:
    label1302:
    label1309:
    for (String str2 = localbh.field_tipsShowInfo.path;; str2 = "")
    {
      l7 = localbh.field_pagestaytime;
      h.mEJ.h(14995, new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), Long.valueOf(l5), Long.valueOf(l6), Long.valueOf(l6 - l5), Integer.valueOf(paramInt), Integer.valueOf(i), localObject, str1, str2, "", Integer.valueOf(b.ebB), Long.valueOf(l7) });
      if (m == b.ebl)
      {
        localObject = a.bjj();
        str1 = "delete from NewTipsInfo where tipId = " + localbh.field_tipId;
        x.i("MicroMsg.NewTipsInfoStorage", "delete sql: " + str1);
        ((com.tencent.mm.storage.bi)localObject).diF.fV("NewTipsInfo", str1);
        ((com.tencent.mm.storage.bi)localObject).b(localbh.field_tipId, 5, Integer.valueOf(localbh.field_tipId));
      }
      ad.getContext().getSharedPreferences(ad.chY() + "_newtips_report", 0).edit().putBoolean(str3, true).commit();
      break;
      if (localbh.field_hadRead)
      {
        paramInt = 4;
        break label799;
      }
      if ((localbh.field_disappearTime != 0L) && (l7 > localbh.field_disappearTime))
      {
        paramInt = 3;
        break label799;
      }
      paramInt = i;
      if (localbh.field_overdueTime == 0L) {
        break label799;
      }
      paramInt = i;
      if (localbh.field_beginShowTime + localbh.field_overdueTime > localbh.field_disappearTime) {
        break label799;
      }
      paramInt = i;
      if (l7 <= localbh.field_beginShowTime + localbh.field_overdueTime) {
        break label799;
      }
      paramInt = 2;
      break label799;
      i = 0;
      break label816;
      localObject = "";
      break label834;
      str1 = "";
      break label852;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ao/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */