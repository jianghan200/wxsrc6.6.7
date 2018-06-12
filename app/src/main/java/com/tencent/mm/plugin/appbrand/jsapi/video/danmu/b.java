package com.tencent.mm.plugin.appbrand.jsapi.video.danmu;

import android.content.Context;
import com.tencent.mm.bp.a;

public final class b
{
  public static int gbS = 18;
  public static int gbT = 10;
  private static int gbU = 3;
  
  public static int akf()
  {
    return gbU;
  }
  
  public static float cB(Context paramContext)
  {
    return a.fromDPToPix(paramContext, gbS) * 2.0F;
  }
  
  public static int y(Context paramContext, int paramInt)
  {
    return a.fromDPToPix(paramContext, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/danmu/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */