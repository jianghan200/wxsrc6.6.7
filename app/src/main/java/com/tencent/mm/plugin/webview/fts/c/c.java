package com.tencent.mm.plugin.webview.fts.c;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.mm.bp.a;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
{
  public static float[] a(JSONObject paramJSONObject, Context paramContext)
  {
    float[] arrayOfFloat = new float[5];
    if (paramJSONObject.has("x"))
    {
      arrayOfFloat[0] = a.fromDPToPix(paramContext, paramJSONObject.optInt("x"));
      if (!paramJSONObject.has("y")) {
        break label110;
      }
      arrayOfFloat[1] = a.fromDPToPix(paramContext, paramJSONObject.optInt("y"));
      label50:
      if (!paramJSONObject.has("width")) {
        break label118;
      }
      arrayOfFloat[2] = a.fromDPToPix(paramContext, paramJSONObject.optInt("width"));
      label73:
      if (!paramJSONObject.has("height")) {
        break label126;
      }
      arrayOfFloat[3] = a.fromDPToPix(paramContext, paramJSONObject.optInt("height"));
    }
    for (;;)
    {
      arrayOfFloat[4] = 0.0F;
      return arrayOfFloat;
      arrayOfFloat[0] = Float.MAX_VALUE;
      break;
      label110:
      arrayOfFloat[1] = Float.MAX_VALUE;
      break label50;
      label118:
      arrayOfFloat[2] = Float.MAX_VALUE;
      break label73;
      label126:
      arrayOfFloat[3] = Float.MAX_VALUE;
    }
  }
  
  public static String an(JSONObject paramJSONObject)
  {
    paramJSONObject = paramJSONObject.optJSONArray("playUrl");
    if ((paramJSONObject != null) && (paramJSONObject.length() > 0)) {
      try
      {
        paramJSONObject = paramJSONObject.getString(0);
        return paramJSONObject;
      }
      catch (JSONException paramJSONObject) {}
    }
    return "";
  }
  
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
  
  public static int m(JSONObject paramJSONObject)
  {
    if (paramJSONObject.has("visible"))
    {
      if (paramJSONObject.optBoolean("visible")) {
        return 0;
      }
      return 1;
    }
    return Integer.MAX_VALUE;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/fts/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */