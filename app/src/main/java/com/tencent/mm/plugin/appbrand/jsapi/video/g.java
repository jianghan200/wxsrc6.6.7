package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public final class g
{
  public static String bx(long paramLong)
  {
    if (paramLong < 3600000L) {}
    for (Object localObject = "mm:ss";; localObject = "HH:mm:ss")
    {
      localObject = new SimpleDateFormat((String)localObject);
      ((SimpleDateFormat)localObject).setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
      return ((SimpleDateFormat)localObject).format(Long.valueOf(paramLong));
    }
  }
  
  public static float cA(Context paramContext)
  {
    WindowManager.LayoutParams localLayoutParams = ((Activity)paramContext).getWindow().getAttributes();
    if (localLayoutParams.screenBrightness < 0.0F) {
      return cx(paramContext);
    }
    return localLayoutParams.screenBrightness;
  }
  
  private static float cx(Context paramContext)
  {
    paramContext = paramContext.getContentResolver();
    try
    {
      int i = Settings.System.getInt(paramContext, "screen_brightness");
      return i / 255.0F;
    }
    catch (Settings.SettingNotFoundException paramContext) {}
    return 0.0F;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */