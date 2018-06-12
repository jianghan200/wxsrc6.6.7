package com.tencent.mm.pluginsdk.f;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Base64;
import com.tencent.mm.a.g;
import com.tencent.mm.c.a;
import com.tencent.mm.c.b;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.model.au;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.protocal.c.bsx;
import com.tencent.mm.protocal.n;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.List;

public final class i
{
  private static final long[] qBt = { 0L, 259200000L, 604800000L };
  private static String qBu = "tinker-boots-install-info";
  private static String qBv = "tinker-boots-last-show";
  private static String qBw = "tinker-boots-show-time";
  private static String qBx = "";
  
  public static String Tg(String paramString)
  {
    return ccn() + paramString + ".apk";
  }
  
  public static void a(bsx parambsx)
  {
    try
    {
      ad.getContext().getSharedPreferences("tinker_patch_share_config", 4).edit().putString(qBu, Base64.encodeToString(parambsx.toByteArray(), 0)).apply();
      x.d("MicroMsg.UpdateUtil", "save tinker install update info.");
      return;
    }
    catch (Exception parambsx)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.UpdateUtil", parambsx, "", new Object[0]);
      }
    }
  }
  
  public static void bk(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.addFlags(268435456);
    localIntent.setDataAndType(Uri.fromFile(new File(paramString)), "application/vnd.android.package-archive");
    paramContext.startActivity(localIntent);
  }
  
  public static String cce()
  {
    return ad.getContext().getSharedPreferences("update_config_prefs", 4).getString("update_downloaded_pack_md5_key", null);
  }
  
  public static int ccf()
  {
    return ad.getContext().getSharedPreferences("update_config_prefs", 4).getInt("update_downloaded_pack_update_type", 3);
  }
  
  public static boolean ccg()
  {
    SharedPreferences localSharedPreferences = ad.getContext().getSharedPreferences("update_config_prefs", 4);
    long l1 = localSharedPreferences.getLong("update_downloaded_cancel_ts", 0L);
    int i = localSharedPreferences.getInt("update_downloaded_cancel_times", 0);
    x.i("MicroMsg.UpdateUtil", "checkIgnoreDownloadedPack last: %s times: %s", new Object[] { Long.valueOf(l1), Integer.valueOf(i) });
    if (i > qBt.length - 1) {}
    do
    {
      return true;
      long l2 = qBt[i];
      if (System.currentTimeMillis() - l1 > l2) {
        return false;
      }
    } while (System.currentTimeMillis() - l1 >= 0L);
    x.e("MicroMsg.UpdateUtil", "user modify mobile time. we just remove the config.");
    ad.getContext().getSharedPreferences("update_config_prefs", 4).edit().clear().commit();
    x.i("MicroMsg.UpdateUtil", "clearUpdateConfigPrefs");
    return true;
  }
  
  public static boolean cch()
  {
    boolean bool2 = false;
    SharedPreferences localSharedPreferences = ad.getContext().getSharedPreferences("update_config_prefs", 4);
    long l = localSharedPreferences.getLong("update_downloading_in_silence", 0L);
    boolean bool1 = localSharedPreferences.getBoolean("update_download_start_one_immediate", false);
    x.i("MicroMsg.UpdateUtil", "hasUnfinishDownloadingInSilence unfinish %s", new Object[] { Long.valueOf(l) });
    if (!bool1)
    {
      bool1 = bool2;
      if (l != 0L)
      {
        bool1 = bool2;
        if (System.currentTimeMillis() - l <= 3600000L) {}
      }
    }
    else
    {
      bool1 = true;
    }
    return bool1;
  }
  
  public static bsx cci()
  {
    Object localObject2 = ad.getContext().getSharedPreferences("tinker_patch_share_config", 4).getString(qBu, "");
    if (!bi.oW((String)localObject2)) {}
    for (;;)
    {
      try
      {
        localObject1 = new bsx();
        x.printErrStackTrace("MicroMsg.UpdateUtil", localException1, "parse tinker install failed.", new Object[0]);
      }
      catch (Exception localException1)
      {
        try
        {
          localObject2 = (bsx)((bsx)localObject1).aG(Base64.decode((String)localObject2, 0));
          localObject1 = localObject2;
          if (localObject1 == null) {
            break label74;
          }
          return (bsx)localObject1;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        localException1 = localException1;
        localObject1 = null;
      }
      continue;
      label74:
      x.i("MicroMsg.UpdateUtil", "update info is null.");
      return null;
      Object localObject1 = null;
    }
  }
  
  public static boolean ccj()
  {
    SharedPreferences localSharedPreferences = ad.getContext().getSharedPreferences("tinker_patch_share_config", 4);
    long l1 = localSharedPreferences.getLong(qBv, 0L);
    int i = localSharedPreferences.getInt(qBw, 0);
    long l2 = System.currentTimeMillis();
    x.d("MicroMsg.UpdateUtil", "isNeedShowTinkerDialog now:%d last:%d time:%d", new Object[] { Long.valueOf(l2), Long.valueOf(l1), Integer.valueOf(i) });
    return (l2 - l1 > 21600000L) && (i < 3);
  }
  
  public static void cck()
  {
    SharedPreferences localSharedPreferences = ad.getContext().getSharedPreferences("tinker_patch_share_config", 4);
    localSharedPreferences.edit().putLong(qBv, System.currentTimeMillis()).apply();
    int i = localSharedPreferences.getInt(qBw, 0);
    localSharedPreferences.edit().putInt(qBw, i + 1).apply();
  }
  
  public static void ccl()
  {
    x.i("MicroMsg.UpdateUtil", "clearInstallUpdateInfo.");
    SharedPreferences localSharedPreferences = ad.getContext().getSharedPreferences("tinker_patch_share_config", 4);
    localSharedPreferences.edit().putString(qBu, "").apply();
    localSharedPreferences.edit().putLong(qBv, 0L).apply();
    localSharedPreferences.edit().putInt(qBw, 0).apply();
  }
  
  public static void ccm()
  {
    au.Em().H(new i.1());
  }
  
  public static String ccn()
  {
    if (bi.oW(qBx)) {
      qBx = e.dgj + "bsdiff/";
    }
    return qBx;
  }
  
  public static String eU(Context paramContext)
  {
    paramContext = eV(paramContext);
    if ((paramContext == null) || (!new File(paramContext).exists())) {
      return null;
    }
    a locala = a.cD(paramContext);
    if ((locala != null) && (locala.bxh != null)) {
      return locala.bxh.apkMd5;
    }
    return g.cu(paramContext);
  }
  
  public static String eV(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).applicationInfo.sourceDir;
      return paramContext;
    }
    catch (Exception paramContext)
    {
      x.printErrStackTrace("MicroMsg.UpdateUtil", paramContext, "", new Object[0]);
    }
    return null;
  }
  
  public static String[] getShortIps()
  {
    int i = 0;
    if ((af.ewV != null) && (af.ewV.length() > 0)) {
      return new String[] { af.ewV };
    }
    Object localObject = ad.getContext().getSharedPreferences("system_config_prefs", 0).getString("builtin_short_ips", "");
    if ((localObject != null) && (((String)localObject).length() > 0)) {}
    String[] arrayOfString;
    for (;;)
    {
      localObject = n.Uz((String)localObject);
      arrayOfString = new String[((List)localObject).size()];
      while (i < ((List)localObject).size())
      {
        arrayOfString[i] = ((n)((List)localObject).get(i)).kCs;
        i += 1;
      }
      localObject = "0,112.64.200.240,80|0,180.153.82.27,80|0,117.135.130.177,80";
    }
    return arrayOfString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */