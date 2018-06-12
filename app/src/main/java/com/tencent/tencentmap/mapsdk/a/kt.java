package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import com.tencent.map.lib.util.StringUtil;

public class kt
{
  private static boolean a = false;
  
  public static void a(Context paramContext)
  {
    if (paramContext == null) {
      return;
    }
    String str = o.a(paramContext).h();
    r localr = r.a(paramContext);
    if ((a(localr)) || (a))
    {
      p.b(paramContext, str, "mapconfig.dat", "mapconfig.dat");
      p.b(paramContext, str, "poi_icon_file.png", "poi_icon.png");
      p.b(paramContext, str, "poi_icon_file_nav.png", "poi_icon_navi.png");
      p.b(paramContext, str, "poi_icon_file_dark.png", "poi_icon_dark.png");
      p.b(paramContext, str, "poi_icon_file_sat.png", "poi_icon_sat.png");
      p.b(paramContext, str, "rtt_config.json", "rtt_config.json");
      p.b(paramContext, str, "indoormap_config.dat", "indoormap_config.dat");
      p.b(paramContext, str, "poi_icon_file_indoor.png", "indoor_icon.png");
      p.b(paramContext, str, "style_normalmode.xml", "closedroadstyle_normalmode.xml");
      p.b(paramContext, str, "style_trafficmode.xml", "closedroadstyle_trafficmode.xml");
      p.b(paramContext, str, "blockicon.png", "blockicon.png");
      localr.a("4.0.8.1");
      return;
    }
    p.a(paramContext, str, "mapconfig.dat", "mapconfig.dat");
    p.a(paramContext, str, "poi_icon_file.png", "poi_icon.png");
    p.a(paramContext, str, "poi_icon_file_nav.png", "poi_icon_navi.png");
    p.a(paramContext, str, "poi_icon_file_dark.png", "poi_icon_dark.png");
    p.a(paramContext, str, "poi_icon_file_sat.png", "poi_icon_sat.png");
    p.a(paramContext, str, "rtt_config.json", "rtt_config.json");
    p.a(paramContext, str, "indoormap_config.dat", "indoormap_config.dat");
    p.a(paramContext, str, "poi_icon_file_indoor.png", "indoor_icon.png");
    p.a(paramContext, str, "style_normalmode.xml", "closedroadstyle_normalmode.xml");
    p.a(paramContext, str, "style_trafficmode.xml", "closedroadstyle_trafficmode.xml");
    p.a(paramContext, str, "blockicon.png", "blockicon.png");
  }
  
  private static boolean a(r paramr)
  {
    if (StringUtil.isEmpty("4.0.8.1")) {}
    do
    {
      return false;
      paramr = paramr.e();
      if (StringUtil.isEmpty(paramr)) {
        return true;
      }
    } while ("4.0.8.1".compareToIgnoreCase(paramr) <= 0);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/kt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */