package com.tencent.tencentmap.mapsdk.a;

import com.tencent.map.lib.b;

public abstract class ko
  implements b
{
  public static final String b(String paramString)
  {
    String str;
    if (paramString.equals("poi_icon.png")) {
      str = "poi_icon_file.png";
    }
    do
    {
      return str;
      if (paramString.equals("poi_icon_navi.png")) {
        return "poi_icon_file_nav.png";
      }
      if (paramString.equals("poi_icon_sat.png")) {
        return "poi_icon_file_sat.png";
      }
      if (paramString.equals("poi_icon_dark.png")) {
        return "poi_icon_file_dark.png";
      }
      if (paramString.equals("color_texture_flat_style.png")) {
        return "color_texture_flat_style.png";
      }
      if (paramString.equals("color_arrow_texture.png")) {
        return "color_arrow_texture";
      }
      if (paramString.equals("color_point_texture.png")) {
        return "color_point_texture.png";
      }
      if (paramString.equals("color_texture_flat_style_cap.png")) {
        return "color_texture_cap.png";
      }
      if (paramString.equals("route_arrow_texture.png")) {
        return "route_arrow_texture";
      }
      str = paramString;
    } while (!paramString.equals("poi_icon_indoor.png"));
    return "indoor_icon.png";
  }
  
  public static final int c(String paramString)
  {
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ko.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */