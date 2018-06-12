package com.tencent.mm.plugin.appbrand.report;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.a;
import com.tencent.mm.plugin.appbrand.dynamic.f;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.UnsupportedEncodingException;

public final class a
{
  public static void G(String paramString, int paramInt1, int paramInt2)
  {
    if ("@LibraryAppId".equals(paramString)) {
      return;
    }
    int i = 1000;
    String str = "";
    int n = 0;
    int m = 0;
    Object localObject;
    label54:
    int j;
    label71:
    int k;
    if (!bi.oW(paramString))
    {
      localObject = com.tencent.mm.plugin.appbrand.a.qb(paramString);
      if (localObject != null) {
        if (((AppBrandStatObject)localObject).scene == 0)
        {
          i = 1000;
          str = bi.oV(((AppBrandStatObject)localObject).bGG);
          j = ((AppBrandStatObject)localObject).gqK;
          localObject = com.tencent.mm.plugin.appbrand.a.qa(paramString);
          k = m;
          if (localObject != null)
          {
            k = m;
            if (((AppBrandSysConfig)localObject).frm != null) {
              k = ((AppBrandSysConfig)localObject).frm.fii;
            }
          }
          m = paramInt2;
          if (paramInt2 == 0)
          {
            m = paramInt2;
            if (localObject != null)
            {
              m = paramInt2;
              if (((AppBrandSysConfig)localObject).frm != null) {
                m = ((AppBrandSysConfig)localObject).frm.fih + 1;
              }
            }
          }
          n = vn(paramString);
          paramInt2 = m;
          m = k;
          k = j;
          j = n;
        }
      }
    }
    for (;;)
    {
      x.d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %s, sceneNote %s, appId %s, appVersion %s, appState %s, usedState %s, pagetype %s, targetAction %s, appType %s", new Object[] { Integer.valueOf(13541), Integer.valueOf(i), str, paramString, Integer.valueOf(m), Integer.valueOf(paramInt2), Integer.valueOf(k), Integer.valueOf(paramInt1), Integer.valueOf(3), Integer.valueOf(j) });
      h.mEJ.h(13541, new Object[] { Integer.valueOf(i), str, paramString, Integer.valueOf(m), Integer.valueOf(paramInt2), Integer.valueOf(k), Integer.valueOf(paramInt1), Integer.valueOf(3), "", Integer.valueOf(j) });
      if ((TextUtils.isEmpty(str)) || (!str.contains("isWidget=1"))) {
        break;
      }
      f.f(paramInt1, paramString, str);
      return;
      i = ((AppBrandStatObject)localObject).scene;
      break label54;
      j = 0;
      break label71;
      j = 1000;
      k = 0;
      m = n;
    }
  }
  
  public static void a(int paramInt1, String paramString1, String paramString2, int paramInt2, String paramString3, String paramString4)
  {
    x.d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %d, appid %s, appversion %d, appidlist %snearbyAppIdCount %s, nearbyAppIdList %s", new Object[] { Integer.valueOf(13533), Integer.valueOf(paramInt1), bi.oV(paramString1), Integer.valueOf(0), paramString2, Integer.valueOf(paramInt2), paramString3 });
    h.mEJ.h(13533, new Object[] { Integer.valueOf(paramInt1), bi.oV(paramString1), Integer.valueOf(0), paramString2, Integer.valueOf(paramInt2), paramString3, Integer.valueOf(0), paramString4 });
  }
  
  public static void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    h.mEJ.h(14369, new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2 + 1), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(1) });
  }
  
  public static void a(String paramString, int paramInt1, int paramInt2, long paramLong, boolean paramBoolean)
  {
    Object localObject2 = cH(ad.getContext());
    Object localObject1 = localObject2;
    if (bi.oW((String)localObject2)) {
      localObject1 = "unknown";
    }
    int j = vn(paramString);
    long l = bi.VE();
    x.d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %d, sceneNote %s, sessionId %s, appid %s, appversion %d, appState %d, usedState %d, pagePath %s, networkType %s, eventId %d,eventRusult %d, eventPercent %d, installCostTime %s, eventTime %s, useModule %b, appType %s", new Object[] { Integer.valueOf(13537), Integer.valueOf(1000), "", "", paramString, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", localObject1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Long.valueOf(paramLong), Long.valueOf(l), Boolean.valueOf(paramBoolean), Integer.valueOf(j) });
    localObject2 = h.mEJ;
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      ((h)localObject2).h(13537, new Object[] { Integer.valueOf(1000), "", "", paramString, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", localObject1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Long.valueOf(paramLong), Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(j) });
      return;
    }
  }
  
  public static void a(String paramString1, String paramString2, int paramInt1, String paramString3, long paramLong, int paramInt2, int paramInt3)
  {
    AppBrandStatObject localAppBrandStatObject = com.tencent.mm.plugin.appbrand.a.qb(paramString1);
    if (localAppBrandStatObject == null)
    {
      x.e("MicroMsg.AppBrandReporterManager", "statObject is Null!");
      return;
    }
    String str2 = "";
    String str1 = str2;
    if (!bi.oW(paramString2))
    {
      str1 = str2;
      if (paramString2.contains(".html")) {
        str1 = paramString2.substring(0, paramString2.lastIndexOf(".html") + 5);
      }
    }
    str2 = "";
    try
    {
      paramString2 = com.tencent.mm.compatible.util.p.encode(bi.oV(str1), "UTF-8");
      str2 = paramString2;
    }
    catch (UnsupportedEncodingException paramString2)
    {
      for (;;)
      {
        String str3;
        x.e("MicroMsg.AppBrandReporterManager", "encode page path error!");
        x.printErrStackTrace("MicroMsg.AppBrandReporterManager", paramString2, "", new Object[0]);
        continue;
        int i = paramString2.frm.fii;
        continue;
        int j = paramString2.frm.fih + 1;
      }
    }
    paramString2 = com.tencent.mm.plugin.appbrand.a.qa(paramString1);
    if (paramString2 == null)
    {
      i = 0;
      if (paramString2 != null) {
        break label535;
      }
      j = 0;
      str3 = bi.oV(paramString3);
      paramString2 = str3;
      if (paramInt1 == 18)
      {
        paramString2 = str3;
        if (!bi.oW(paramString3))
        {
          paramString2 = str3;
          if (paramString3.contains(".html")) {
            paramString2 = paramString3.substring(0, paramString3.lastIndexOf(".html") + 5);
          }
        }
      }
    }
    try
    {
      paramString3 = com.tencent.mm.compatible.util.p.encode(bi.oV(paramString2), "UTF-8");
      paramString2 = paramString3;
    }
    catch (UnsupportedEncodingException paramString3)
    {
      for (;;)
      {
        int k;
        String str4;
        int m;
        x.e("MicroMsg.AppBrandReporterManager", "encode actionNote error!");
        x.printErrStackTrace("MicroMsg.AppBrandReporterManager", paramString3, "", new Object[0]);
      }
    }
    paramString3 = bi.oV(localAppBrandStatObject.bGG);
    str3 = bi.oV(j.qq(paramString1).fdE);
    if (localAppBrandStatObject.scene == 0) {
      localAppBrandStatObject.scene = 1000;
    }
    k = localAppBrandStatObject.cbB;
    str4 = localAppBrandStatObject.cbC;
    m = vn(paramString1);
    x.d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %d, sceneNote : %s, sessionId : %s, appid : %s, appversion : %d, appState : %d, usedState : %d, pagePath : %s, action : %d, actionNote : %s,actionTime : %s, actionResult : %d, actionErrorcode : %d, preScene : %d, preSceneNote : %s, appType : %d", new Object[] { Integer.valueOf(13539), Integer.valueOf(localAppBrandStatObject.scene), paramString3, str3, paramString1, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localAppBrandStatObject.gqK), str1, Integer.valueOf(paramInt1), paramString2, Long.valueOf(paramLong), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(k), str4, Integer.valueOf(m) });
    h.mEJ.h(13539, new Object[] { Integer.valueOf(localAppBrandStatObject.scene), paramString3, str3, paramString1, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localAppBrandStatObject.gqK), str2, Integer.valueOf(paramInt1), paramString2, Long.valueOf(paramLong), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(k), str4, Integer.valueOf(m) });
  }
  
  public static void b(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2)
  {
    int i = vn(paramString1);
    x.d("MicroMsg.AppBrandReporterManager", "stev report(%s), appId %s, appVersion %s, appState : %d, eventId %d, scene %d, sceneId %s, appType %s", new Object[] { Integer.valueOf(13801), paramString1, Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString2, Integer.valueOf(i) });
    h.mEJ.h(13801, new Object[] { paramString1, Integer.valueOf(0), Integer.valueOf(paramInt1), Long.valueOf(bi.VE()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString2, Integer.valueOf(i) });
  }
  
  public static String cH(Context paramContext)
  {
    if (ao.isConnected(paramContext))
    {
      if (ao.isWifi(paramContext)) {
        return "wifi";
      }
      if (ao.is4G(paramContext)) {
        return "4g";
      }
      if (ao.is3G(paramContext)) {
        return "3g";
      }
      if (ao.is2G(paramContext)) {
        return "2g";
      }
      return "unknown";
    }
    return "offline";
  }
  
  public static int vn(String paramString)
  {
    int i = 0;
    if ("@LibraryAppId".equals(paramString)) {
      return 0;
    }
    if (ad.cic())
    {
      paramString = e.aba().f(paramString, new String[] { "appInfo" });
      if (paramString != null) {
        i = paramString.aej().dCn;
      }
    }
    for (;;)
    {
      return i + 1000;
      x.i("MicroMsg.AppBrandReporterManager", "getServiceTypeForReport null = attrs!");
      continue;
      if (!bi.oW(paramString))
      {
        Object localObject = com.tencent.mm.plugin.appbrand.a.pY(paramString);
        if (localObject == null) {}
        for (localObject = null;; localObject = ((g)localObject).fct)
        {
          if (localObject == null) {
            break label103;
          }
          i = ((AppBrandInitConfig)localObject).bGM;
          break;
        }
        label103:
        i = b.vo(paramString);
        x.i("MicroMsg.AppBrandReporterManager", "getServiceTypeForReport null = initConfig! appServiceType:%s", new Object[] { Integer.valueOf(i) });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */