package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.e.a.b;
import com.tencent.mm.plugin.e.a.f;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class v
  extends r
{
  public final boolean SK(String paramString)
  {
    return (paramString != null) && ("com.tencent.map".equals(paramString));
  }
  
  public final String Vw()
  {
    return "http://softroute.map.qq.com/downloadfile?cid=00008&referer=wx_client";
  }
  
  public final String a(Context paramContext, ResolveInfo paramResolveInfo)
  {
    if ((paramContext == null) || (paramResolveInfo == null) || (paramResolveInfo.activityInfo == null)) {}
    do
    {
      return null;
      paramContext = paramResolveInfo.activityInfo.loadLabel(paramContext.getPackageManager());
    } while (paramContext == null);
    paramResolveInfo = paramContext.toString();
    paramResolveInfo = Pattern.compile("\\(.*推荐.*\\)", 2).matcher(paramResolveInfo);
    if (paramResolveInfo.find()) {
      return paramResolveInfo.replaceAll("");
    }
    return paramContext.toString();
  }
  
  public final String cbq()
  {
    return "TencentMap.apk";
  }
  
  public final s.a cbr()
  {
    s.a locala = new s.a();
    locala.qzq = a.f.tencent_map_desc;
    String str = g.AT().getValue("QQMapDownloadTips");
    if (!bi.oW(str)) {
      locala.qzr = str;
    }
    locala.qzs = a.f.tencent_map_label;
    locala.qzp = a.b.icon_tencent_map;
    return locala;
  }
  
  public final boolean eM(Context paramContext)
  {
    Object localObject = new Intent("android.intent.action.VIEW", Uri.parse("sosomap://type=nav"));
    paramContext = paramContext.getPackageManager().queryIntentActivities((Intent)localObject, 0);
    if ((paramContext != null) && (paramContext.size() > 0))
    {
      int j = paramContext.size();
      int i = 0;
      while (i < j)
      {
        localObject = (ResolveInfo)paramContext.get(i);
        if ((localObject != null) && (((ResolveInfo)localObject).activityInfo != null) && ("com.tencent.map".equals(((ResolveInfo)localObject).activityInfo.packageName))) {
          return true;
        }
        i += 1;
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/model/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */