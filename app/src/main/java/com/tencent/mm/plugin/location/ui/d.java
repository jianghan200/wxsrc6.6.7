package com.tencent.mm.plugin.location.ui;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.model.e;
import com.tencent.mm.plugin.map.a.h;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.net.URISyntaxException;
import java.net.URLEncoder;

public final class d
{
  public Context context;
  public int ecA = -1;
  private ActivityManager iSW;
  public int kEC = 0;
  public int kED = 0;
  public boolean kEE = false;
  
  public d(Context paramContext)
  {
    this.context = paramContext;
    this.iSW = ((ActivityManager)paramContext.getSystemService("activity"));
  }
  
  private static Intent a(Context paramContext, LocationInfo paramLocationInfo1, LocationInfo paramLocationInfo2, boolean paramBoolean)
  {
    if ((paramBoolean) || (!paramLocationInfo2.aYY()))
    {
      paramContext = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.kCw + "," + paramLocationInfo1.kCx + "?z=" + paramLocationInfo1.kCy));
      paramContext.setPackage("com.baidu.BaiduMap");
      return paramContext;
    }
    String str = a(paramContext, paramLocationInfo2);
    if (!bi.oW(str))
    {
      paramLocationInfo2 = String.format("name:%s|latlng:%f,%f", new Object[] { str, Double.valueOf(paramLocationInfo2.kCw), Double.valueOf(paramLocationInfo2.kCx) });
      paramContext = a(paramContext, paramLocationInfo1);
      if (bi.oW(paramContext)) {
        break label293;
      }
    }
    label293:
    for (paramContext = String.format("name:%s|latlng:%f,%f", new Object[] { paramContext, Double.valueOf(paramLocationInfo1.kCw), Double.valueOf(paramLocationInfo1.kCx) });; paramContext = String.format("%f,%f", new Object[] { Double.valueOf(paramLocationInfo1.kCw), Double.valueOf(paramLocationInfo1.kCx) }))
    {
      paramContext = String.format("intent://map/direction?origin=%s&destination=%s&mode=driving&coord_type=gcj02", new Object[] { paramLocationInfo2, paramContext });
      x.d("MicroMsg.MapHelper", "url " + paramContext);
      try
      {
        paramContext = paramContext + "&referer=tencent|weixin#Intent;scheme=bdapp;package=com.baidu.BaiduMap;end";
        x.d("MicroMsg.MapHelper", "all: " + paramContext);
        paramContext = Intent.getIntent(paramContext);
        return paramContext;
      }
      catch (URISyntaxException paramContext)
      {
        x.printErrStackTrace("MicroMsg.MapHelper", paramContext, "", new Object[0]);
      }
      paramLocationInfo2 = String.format("%f,%f", new Object[] { Double.valueOf(paramLocationInfo2.kCw), Double.valueOf(paramLocationInfo2.kCx) });
      break;
    }
    return null;
  }
  
  private static Intent a(Context paramContext, LocationInfo paramLocationInfo1, LocationInfo paramLocationInfo2, boolean paramBoolean, String paramString)
  {
    if ((paramBoolean) || (!paramLocationInfo2.aYY()))
    {
      paramLocationInfo2 = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.kCw + "," + paramLocationInfo1.kCx + "?z=" + paramLocationInfo1.kCy));
      paramLocationInfo2.setPackage(paramString);
    }
    Object localObject;
    do
    {
      return paramLocationInfo2;
      String str = String.format("wechatnav://type=nav&fromcoord=%f,%f&tocoord=%f,%f", new Object[] { Double.valueOf(paramLocationInfo2.kCw), Double.valueOf(paramLocationInfo2.kCx), Double.valueOf(paramLocationInfo1.kCw), Double.valueOf(paramLocationInfo1.kCx) });
      localObject = str;
      if (!bi.oW(paramLocationInfo2.kCz))
      {
        localObject = str;
        if (!bi.oW(paramLocationInfo1.kCz)) {
          localObject = str + String.format("&from=%s&to=%s", new Object[] { paramLocationInfo2.kCz, paramLocationInfo1.kCz });
        }
      }
      localObject = new Intent("android.intent.action.VIEW", Uri.parse((String)localObject));
      ((Intent)localObject).setPackage(paramString);
      paramLocationInfo2 = (LocationInfo)localObject;
    } while (bi.k(paramContext, (Intent)localObject));
    paramContext = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.kCw + "," + paramLocationInfo1.kCx));
    paramContext.setPackage(paramString);
    return paramContext;
  }
  
  private static Intent a(LocationInfo paramLocationInfo1, LocationInfo paramLocationInfo2, boolean paramBoolean)
  {
    if ((paramBoolean) || (!paramLocationInfo2.aYY()))
    {
      paramLocationInfo1 = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.kCw + "," + paramLocationInfo1.kCx + "?z=" + paramLocationInfo1.kCy));
      paramLocationInfo1.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
      return paramLocationInfo1;
    }
    if (bi.oW(paramLocationInfo1.kCA)) {}
    for (String str = "zh-cn";; str = paramLocationInfo1.kCA)
    {
      paramLocationInfo1 = new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://maps.google.com/maps?f=d&saddr=%f,%f&daddr=%f,%f&hl=" + str, new Object[] { Double.valueOf(paramLocationInfo2.kCw), Double.valueOf(paramLocationInfo2.kCx), Double.valueOf(paramLocationInfo1.kCw), Double.valueOf(paramLocationInfo1.kCx) })));
      paramLocationInfo1.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
      return paramLocationInfo1;
    }
  }
  
  private static String a(Context paramContext, LocationInfo paramLocationInfo)
  {
    paramContext = paramContext.getString(a.h.location_conversation);
    if ((!bi.oW(paramLocationInfo.bWB)) && (!paramLocationInfo.bWB.equals(paramContext))) {
      return paramLocationInfo.bWB;
    }
    if (!bi.oW(paramLocationInfo.kCz)) {
      return paramLocationInfo.kCz;
    }
    return "";
  }
  
  public static int aZx()
  {
    x.d("MicroMsg.MapHelper", "getDefaultZoom isGoogle : false");
    return 16;
  }
  
  private static Intent b(Context paramContext, LocationInfo paramLocationInfo1, LocationInfo paramLocationInfo2, boolean paramBoolean)
  {
    if ((paramBoolean) || (!paramLocationInfo2.aYY()))
    {
      paramLocationInfo2 = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.kCw + "," + paramLocationInfo1.kCx + "?z=" + paramLocationInfo1.kCy));
      paramLocationInfo2.setPackage("com.tencent.map");
    }
    Object localObject;
    do
    {
      return paramLocationInfo2;
      localObject = String.format("sosomap://type=nav&fromcoord=%f,%f&tocoord=%f,%f", new Object[] { Double.valueOf(paramLocationInfo2.kCx), Double.valueOf(paramLocationInfo2.kCw), Double.valueOf(paramLocationInfo1.kCx), Double.valueOf(paramLocationInfo1.kCw) });
      paramLocationInfo2 = a(paramContext, paramLocationInfo2);
      paramLocationInfo2 = (String)localObject + String.format("&from=%s", new Object[] { URLEncoder.encode(paramLocationInfo2) });
      localObject = a(paramContext, paramLocationInfo1);
      paramLocationInfo2 = paramLocationInfo2 + String.format("&to=%s", new Object[] { URLEncoder.encode((String)localObject) });
      paramLocationInfo2 = paramLocationInfo2 + "&referer=wx_client";
      x.d("MicroMsg.MapHelper", "tencentluxian, url=%s", new Object[] { paramLocationInfo2 });
      localObject = new Intent("android.intent.action.VIEW", Uri.parse(paramLocationInfo2));
      ((Intent)localObject).setPackage("com.tencent.map");
      paramLocationInfo2 = (LocationInfo)localObject;
    } while (bi.k(paramContext, (Intent)localObject));
    paramContext = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.kCw + "," + paramLocationInfo1.kCx));
    paramContext.setPackage("com.tencent.map");
    return paramContext;
  }
  
  public final void a(LocationInfo paramLocationInfo1, LocationInfo paramLocationInfo2, String paramString, boolean paramBoolean)
  {
    PackageManager localPackageManager;
    if ("com.tencent.map".equals(paramString)) {
      if (paramBoolean)
      {
        h.mEJ.h(11091, new Object[] { Integer.valueOf(4), Integer.valueOf(2) });
        localPackageManager = this.context.getPackageManager();
        if (!"com.google.android.apps.maps".equals(paramString)) {
          break label230;
        }
        localObject = a(paramLocationInfo1, paramLocationInfo2, false);
        paramString = (String)localObject;
        if (!bi.k(this.context, (Intent)localObject)) {
          paramString = a(paramLocationInfo1, paramLocationInfo2, true);
        }
        h.mEJ.h(10997, new Object[] { "4", "", Integer.valueOf(0), Integer.valueOf(0) });
        this.context.startActivity(paramString);
      }
    }
    label230:
    PackageInfo localPackageInfo;
    label570:
    do
    {
      do
      {
        do
        {
          return;
          h.mEJ.h(11091, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
          break;
          if (paramBoolean)
          {
            h.mEJ.h(11091, new Object[] { Integer.valueOf(5), Integer.valueOf(2) });
            break;
          }
          h.mEJ.h(11091, new Object[] { Integer.valueOf(5), Integer.valueOf(1) });
          break;
          if ("com.baidu.BaiduMap".equals(paramString))
          {
            localObject = a(this.context, paramLocationInfo1, paramLocationInfo2, false);
            paramString = (String)localObject;
            if (!bi.k(this.context, (Intent)localObject)) {
              paramString = a(this.context, paramLocationInfo1, paramLocationInfo2, true);
            }
            paramLocationInfo1 = e.aB(this.context, "com.baidu.BaiduMap").applicationInfo.loadLabel(localPackageManager).toString();
            h.mEJ.h(10997, new Object[] { "5", paramLocationInfo1, Integer.valueOf(0), Integer.valueOf(0) });
            this.context.startActivity(paramString);
            return;
          }
          if ("com.tencent.map".equals(paramString))
          {
            localObject = b(this.context, paramLocationInfo1, paramLocationInfo2, false);
            paramString = (String)localObject;
            if (!bi.k(this.context, (Intent)localObject)) {
              paramString = b(this.context, paramLocationInfo1, paramLocationInfo2, true);
            }
            h.mEJ.h(10997, new Object[] { "2", "", Integer.valueOf(0), Integer.valueOf(0) });
            this.context.startActivity(paramString);
            return;
          }
          if (!"com.autonavi.minimap".equals(paramString)) {
            break label570;
          }
          localPackageInfo = e.aB(this.context, paramString);
        } while (localPackageInfo == null);
        localIntent = a(this.context, paramLocationInfo1, paramLocationInfo2, false, paramString);
        localObject = localIntent;
        if (!bi.k(this.context, localIntent)) {
          localObject = a(this.context, paramLocationInfo1, paramLocationInfo2, true, paramString);
        }
        paramLocationInfo1 = localPackageInfo.applicationInfo.loadLabel(localPackageManager).toString();
        h.mEJ.h(10997, new Object[] { "5", paramLocationInfo1, Integer.valueOf(0), Integer.valueOf(0) });
        this.context.startActivity((Intent)localObject);
        return;
      } while (!"com.sogou.map.android.maps".equals(paramString));
      localPackageInfo = e.aB(this.context, paramString);
    } while (localPackageInfo == null);
    Intent localIntent = a(this.context, paramLocationInfo1, paramLocationInfo2, false, paramString);
    Object localObject = localIntent;
    if (!bi.k(this.context, localIntent)) {
      localObject = a(this.context, paramLocationInfo1, paramLocationInfo2, true, paramString);
    }
    paramLocationInfo1 = localPackageInfo.applicationInfo.loadLabel(localPackageManager).toString();
    h.mEJ.h(10997, new Object[] { "5", paramLocationInfo1, Integer.valueOf(0), Integer.valueOf(0) });
    this.context.startActivity((Intent)localObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/location/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */