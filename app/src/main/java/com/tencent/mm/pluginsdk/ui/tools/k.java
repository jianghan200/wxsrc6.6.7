package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.WebView;

public final class k
{
  private static String qTu = null;
  private static final String[] qTv = { "", "dynamic_config_recv", "trigger_download", "start_download", "stop_download", "download_finish", "install_finish", "use" };
  
  public static void eA(int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= 0) || (paramInt1 > 7))
    {
      x.e("MicroMsg.TBSReporter", "report invalid scene = %d", new Object[] { Integer.valueOf(paramInt1) });
      return;
    }
    x.i("MicroMsg.TBSReporter", "logSceneDetail, scene = %d_%s, errcode = %d", new Object[] { Integer.valueOf(paramInt1), qTv[paramInt1], Integer.valueOf(paramInt2) });
    Object localObject = ad.getContext();
    int i = WebView.getInstalledTbsCoreVersion((Context)localObject);
    int j = WebView.getTbsSDKVersion((Context)localObject);
    localObject = fa((Context)localObject);
    h.mEJ.a(11633, false, true, new Object[] { Integer.valueOf(paramInt1), Long.valueOf(System.currentTimeMillis() / 1000L), Integer.valueOf(i), Integer.valueOf(j), localObject, Integer.valueOf(paramInt2) });
  }
  
  private static String fa(Context paramContext)
  {
    if (qTu != null) {
      return qTu;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(ad.getPackageName(), 128);
      if ((paramContext != null) && (paramContext.metaData != null))
      {
        paramContext = paramContext.metaData.getString("com.tencent.mtt.TBS_CODE");
        if (!bi.oW(paramContext))
        {
          qTu = paramContext;
          return paramContext;
        }
      }
    }
    catch (Exception paramContext)
    {
      x.e("MicroMsg.TBSReporter", "getMetaTbsCode, ex = %s", new Object[] { paramContext.getMessage() });
    }
    return null;
  }
  
  public static void kB(int paramInt)
  {
    eA(paramInt, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/tools/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */