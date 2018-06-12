package com.tencent.mm.plugin.voip.model;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.bh.d.a;
import com.tencent.mm.g.a.su;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.k.g;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.voip.ui.InviteRemindDialog;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class q
{
  private static boolean oMY = false;
  private static DialogInterface.OnClickListener oMZ = new q.3();
  
  public static long a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3)
  {
    return a(paramString1, paramString2, paramInt1, paramInt2, paramString3, false);
  }
  
  public static long a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, boolean paramBoolean)
  {
    com.tencent.mm.storage.bd localbd = new com.tencent.mm.storage.bd();
    localbd.ay(com.tencent.mm.model.bd.iD(paramString1));
    localbd.eX(paramInt1);
    localbd.setType(50);
    localbd.ep(paramString1);
    localbd.dt(paramString3);
    localbd.setContent(paramString2);
    localbd.setStatus(paramInt2);
    if (paramBoolean) {
      localbd.eC(localbd.cqa | 0x8);
    }
    au.HU();
    long l = com.tencent.mm.model.c.FT().T(localbd);
    if (l < 0L) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VoipPluginManager", "inset voip  failed!");
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VoipPluginManager", "inset voip  msgId " + l);
    return l;
  }
  
  public static void aK(Context paramContext, final String paramString)
  {
    paramContext.getResources().getString(R.l.voip_call);
    oMY = false;
    try
    {
      au.HU();
      com.tencent.mm.storage.bd localbd = com.tencent.mm.model.c.FT().GF(paramString);
      if (localbd != null)
      {
        long l = localbd.field_createTime;
        oMY = com.tencent.mm.plugin.voip.b.d.bLP();
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.VoipPluginManager", localException1, "", new Object[0]);
      }
      int i = au.DF().Lg();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VoipPluginManager", "startVoipVideoCall getNowStatus " + i);
      if ((i == 4) || (i == 6)) {
        break label208;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.a(11518, true, true, new Object[] { Integer.valueOf(i.bJI().oNa.oHa.oJX.kpo), Long.valueOf(i.bJI().bKT()), Long.valueOf(i.bJI().bKU()), Integer.valueOf(4), Integer.valueOf(0) });
      com.tencent.mm.ui.base.h.a(paramContext, R.l.voip_net_unavailable, R.l.voip_not_wifi_warnning_title, oMZ);
      return;
      label208:
      if (oMY) {
        break label657;
      }
      Object localObject3;
      d.a locala;
      try
      {
        au.HU();
        Object localObject1 = d.a.Uv((String)com.tencent.mm.model.c.DT().get(77829, null));
        if (localObject1 != null) {
          if ((localObject1 != null) && (((Map)localObject1).size() > 0))
          {
            if (((Map)localObject1).containsKey(paramString))
            {
              localObject3 = (d.a)((Map)localObject1).get(paramString);
              ((d.a)localObject3).hitCount += 1;
              ((Map)localObject1).put(paramString, localObject3);
            }
          }
          else
          {
            au.HU();
            com.tencent.mm.model.c.DT().set(77829, d.a.at((Map)localObject1));
            localObject1 = ((Map)localObject1).entrySet().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject3 = (Map.Entry)((Iterator)localObject1).next();
              locala = (d.a)((Map.Entry)localObject3).getValue();
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VoipPluginManager", "val1 " + locala.hitCount + " " + locala.ecL + "name " + (String)((Map.Entry)localObject3).getKey());
            }
            InviteRemindDialog.k(paramContext, paramString, 0);
          }
        }
      }
      catch (Exception localException2)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.VoipPluginManager", localException2, "", new Object[0]);
      }
      for (;;)
      {
        bKP();
        return;
        localObject3 = new d.a();
        ((d.a)localObject3).hitCount += 1;
        localException2.put(paramString, localObject3);
        break;
        Object localObject2 = new HashMap();
        localObject3 = new d.a();
        ((d.a)localObject3).hitCount += 1;
        ((Map)localObject2).put(paramString, localObject3);
        au.HU();
        com.tencent.mm.model.c.DT().set(77829, d.a.at((Map)localObject2));
        localObject2 = ((Map)localObject2).entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Map.Entry)((Iterator)localObject2).next();
          locala = (d.a)((Map.Entry)localObject3).getValue();
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VoipPluginManager", "val2 " + locala.hitCount + " " + locala.ecL + "  name " + (String)((Map.Entry)localObject3).getKey());
        }
      }
      label657:
      if (ao.isWap(paramContext)) {
        break label710;
      }
      if ((!ao.isWifi(paramContext)) && (!bKO())) {
        break label686;
      }
      i.bJI().aP(paramContext, paramString);
      return;
      label686:
      com.tencent.mm.ui.base.h.a(paramContext, R.l.voip_not_wifi_warnning_message, R.l.voip_not_wifi_warnning_title, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          q.bKN();
          i.bJI().aP(this.val$context, paramString);
        }
      }, oMZ);
      return;
      label710:
      com.tencent.mm.ui.base.h.a(paramContext, R.l.voip_using_wap_tip, 0, R.l.voip_using_wap_yes, R.l.app_cancel, new q.2(paramContext), oMZ);
    }
    if (bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VoipPluginManager", "talker is null");
      return;
    }
  }
  
  public static void aL(Context paramContext, String paramString)
  {
    g.AU();
    if (com.tencent.mm.k.c.AF() == 2) {}
    for (int i = 1;; i = 0)
    {
      com.tencent.mm.bg.d.cfH();
      if (i == 0) {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VoipPluginManager", "showDouble %b, isLiteVersion: %b", new Object[] { Boolean.valueOf(false), Boolean.valueOf(false) });
      }
      oMY = false;
      try
      {
        au.HU();
        com.tencent.mm.storage.bd localbd = com.tencent.mm.model.c.FT().GF(paramString);
        if (localbd != null)
        {
          long l = localbd.field_createTime;
          oMY = com.tencent.mm.plugin.voip.b.d.bLP();
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.VoipPluginManager", localException, "", new Object[0]);
        }
      }
      aN(paramContext, paramString);
      return;
    }
  }
  
  public static void aM(Context paramContext, String paramString)
  {
    oMY = false;
    try
    {
      au.HU();
      com.tencent.mm.storage.bd localbd = com.tencent.mm.model.c.FT().GF(paramString);
      if (localbd != null)
      {
        long l = localbd.field_createTime;
        oMY = com.tencent.mm.plugin.voip.b.d.bLP();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.VoipPluginManager", localException, "", new Object[0]);
      }
    }
    aN(paramContext, paramString);
  }
  
  private static void aN(Context paramContext, String paramString)
  {
    if (bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VoipPluginManager", "talker is null");
      return;
    }
    int i = au.DF().Lg();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VoipPluginManager", "startVoipVideoCall getNowStatus " + i);
    if ((i != 4) && (i != 6))
    {
      com.tencent.mm.plugin.report.service.h.mEJ.a(11518, true, true, new Object[] { Integer.valueOf(i.bJI().oNa.oHa.oJX.kpo), Long.valueOf(i.bJI().bKT()), Long.valueOf(i.bJI().bKU()), Integer.valueOf(4), Integer.valueOf(0) });
      com.tencent.mm.ui.base.h.a(paramContext, R.l.voip_net_unavailable, R.l.voip_not_wifi_warnning_title, oMZ);
      return;
    }
    if (!oMY)
    {
      Object localObject3;
      d.a locala;
      try
      {
        au.HU();
        Object localObject1 = d.a.Uv((String)com.tencent.mm.model.c.DT().get(77829, null));
        if (localObject1 != null) {
          if ((localObject1 != null) && (((Map)localObject1).size() > 0))
          {
            if (((Map)localObject1).containsKey(paramString))
            {
              localObject3 = (d.a)((Map)localObject1).get(paramString);
              ((d.a)localObject3).hitCount += 1;
              ((Map)localObject1).put(paramString, localObject3);
            }
          }
          else
          {
            au.HU();
            com.tencent.mm.model.c.DT().set(77829, d.a.at((Map)localObject1));
            localObject1 = ((Map)localObject1).entrySet().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject3 = (Map.Entry)((Iterator)localObject1).next();
              locala = (d.a)((Map.Entry)localObject3).getValue();
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VoipPluginManager", "val1 " + locala.hitCount + " " + locala.ecL + "name " + (String)((Map.Entry)localObject3).getKey());
            }
            InviteRemindDialog.k(paramContext, paramString, 1);
          }
        }
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.VoipPluginManager", localException, "", new Object[0]);
      }
      for (;;)
      {
        bKP();
        return;
        localObject3 = new d.a();
        ((d.a)localObject3).hitCount += 1;
        localException.put(paramString, localObject3);
        break;
        Object localObject2 = new HashMap();
        localObject3 = new d.a();
        ((d.a)localObject3).hitCount += 1;
        ((Map)localObject2).put(paramString, localObject3);
        au.HU();
        com.tencent.mm.model.c.DT().set(77829, d.a.at((Map)localObject2));
        localObject2 = ((Map)localObject2).entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Map.Entry)((Iterator)localObject2).next();
          locala = (d.a)((Map.Entry)localObject3).getValue();
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VoipPluginManager", "val2 " + locala.hitCount + " " + locala.ecL + "  name " + (String)((Map.Entry)localObject3).getKey());
        }
      }
    }
    if (!ao.isWap(paramContext))
    {
      if ((ao.isWifi(paramContext)) || (bKO()))
      {
        i.bJI().aO(paramContext, paramString);
        return;
      }
      com.tencent.mm.ui.base.h.a(paramContext, R.l.voip_not_wifi_warnning_message, R.l.voip_not_wifi_warnning_title, new q.4(paramContext, paramString), oMZ);
      return;
    }
    com.tencent.mm.ui.base.h.a(paramContext, R.l.voip_using_wap_tip, 0, R.l.voip_using_wap_yes, R.l.app_cancel, new q.5(paramContext), oMZ);
  }
  
  public static void bKN()
  {
    au.HU();
    com.tencent.mm.model.c.DT().set(20480, Long.valueOf(System.currentTimeMillis()));
  }
  
  public static boolean bKO()
  {
    try
    {
      long l1 = System.currentTimeMillis();
      au.HU();
      long l2 = ((Long)com.tencent.mm.model.c.DT().get(20480, Integer.valueOf(-1))).longValue();
      if (l2 < 0L) {
        return false;
      }
      l1 -= l2;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VoipPluginManager", "diff is" + l1);
      if (l1 < 21600000L) {
        return true;
      }
    }
    catch (Exception localException) {}
    return false;
  }
  
  private static void bKP()
  {
    su localsu = new su();
    localsu.cdE.bOh = 8;
    a.sFg.m(localsu);
  }
  
  public static void ek(Context paramContext)
  {
    try
    {
      Intent localIntent = new Intent("/");
      localIntent.setComponent(new ComponentName("com.android.settings", "com.android.settings.ApnSettings"));
      localIntent.setAction("android.intent.action.VIEW");
      paramContext.startActivity(localIntent);
      return;
    }
    catch (Exception localException)
    {
      searchIntentByClass(paramContext, "ApnSettings");
    }
  }
  
  private static Intent searchIntentByClass(Context paramContext, String paramString)
  {
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      List localList = localPackageManager.getInstalledPackages(0);
      if ((localList != null) && (localList.size() > 0))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VoipPluginManager", "package  size" + localList.size());
        int i = 0;
        for (;;)
        {
          int j = localList.size();
          if (i >= j) {
            break;
          }
          try
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VoipPluginManager", "package " + ((PackageInfo)localList.get(i)).packageName);
            Object localObject1 = new Intent();
            ((Intent)localObject1).setPackage(((PackageInfo)localList.get(i)).packageName);
            Object localObject2 = localPackageManager.queryIntentActivities((Intent)localObject1, 0);
            if (localObject2 != null) {
              j = ((List)localObject2).size();
            }
            for (;;)
            {
              if (j > 0) {
                try
                {
                  com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VoipPluginManager", "activityName count " + j);
                  int k = 0;
                  for (;;)
                  {
                    if (k >= j) {
                      break label305;
                    }
                    localObject1 = ((ResolveInfo)((List)localObject2).get(k)).activityInfo;
                    if (((ActivityInfo)localObject1).name.contains(paramString))
                    {
                      localObject2 = new Intent("/");
                      ((Intent)localObject2).setComponent(new ComponentName(((ActivityInfo)localObject1).packageName, ((ActivityInfo)localObject1).name));
                      ((Intent)localObject2).setAction("android.intent.action.VIEW");
                      paramContext.startActivity((Intent)localObject2);
                      return (Intent)localObject2;
                      j = 0;
                      break;
                    }
                    k += 1;
                  }
                  i += 1;
                }
                catch (Exception localException1)
                {
                  com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.VoipPluginManager", localException1, "", new Object[0]);
                }
              }
            }
          }
          catch (Exception localException2)
          {
            for (;;)
            {
              label305:
              com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.VoipPluginManager", localException2, "", new Object[0]);
            }
          }
        }
      }
      return null;
    }
    catch (Exception paramContext)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.VoipPluginManager", paramContext, "", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/voip/model/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */