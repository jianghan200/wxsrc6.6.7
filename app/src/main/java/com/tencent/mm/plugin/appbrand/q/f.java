package com.tencent.mm.plugin.appbrand.q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;
import com.tencent.mm.sdk.platformtools.ad;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f
{
  private static DisplayMetrics gBr = ad.getContext().getResources().getDisplayMetrics();
  
  public static float a(JSONObject paramJSONObject, String paramString, float paramFloat)
  {
    if (paramJSONObject == null) {
      return paramFloat;
    }
    double d = paramFloat;
    try
    {
      float f = ae((float)paramJSONObject.optDouble(paramString, d));
      return f;
    }
    catch (Exception paramJSONObject) {}
    return paramFloat;
  }
  
  public static int a(JSONArray paramJSONArray, int paramInt)
  {
    return b(paramJSONArray, paramInt);
  }
  
  public static int a(JSONObject paramJSONObject, String paramString, int paramInt)
  {
    if (paramJSONObject == null) {
      return paramInt;
    }
    try
    {
      int i = Math.round(ae((float)paramJSONObject.getDouble(paramString)));
      return i;
    }
    catch (Exception paramJSONObject) {}
    return paramInt;
  }
  
  public static int aQ(String paramString, int paramInt)
  {
    try
    {
      int i = vO(paramString);
      return i;
    }
    catch (Exception paramString) {}
    return paramInt;
  }
  
  public static float ad(float paramFloat)
  {
    if (gBr == null) {
      return paramFloat;
    }
    return paramFloat / gBr.density;
  }
  
  public static float ae(float paramFloat)
  {
    if (gBr == null) {
      return paramFloat;
    }
    return paramFloat * gBr.density;
  }
  
  public static float aor()
  {
    if (gBr == null) {
      return 1.0F;
    }
    return gBr.density;
  }
  
  private static int b(JSONArray paramJSONArray, int paramInt)
  {
    if (paramJSONArray == null) {
      return 0;
    }
    try
    {
      paramInt = Math.round(ae((float)paramJSONArray.getDouble(paramInt)));
      return paramInt;
    }
    catch (Exception paramJSONArray) {}
    return 0;
  }
  
  public static float c(JSONArray paramJSONArray, int paramInt)
  {
    return ae((float)paramJSONArray.getDouble(paramInt));
  }
  
  public static float d(JSONArray paramJSONArray, int paramInt)
  {
    return e(paramJSONArray, paramInt);
  }
  
  private static float e(JSONArray paramJSONArray, int paramInt)
  {
    if (paramJSONArray == null) {
      return 0.0F;
    }
    try
    {
      float f = ae((float)paramJSONArray.getDouble(paramInt));
      return f;
    }
    catch (Exception paramJSONArray) {}
    return 0.0F;
  }
  
  public static int e(JSONObject paramJSONObject, String paramString)
  {
    return a(paramJSONObject, paramString, 0);
  }
  
  public static int f(JSONObject paramJSONObject, String paramString)
  {
    return Math.round(ae((float)paramJSONObject.getDouble(paramString)));
  }
  
  public static float g(JSONObject paramJSONObject, String paramString)
  {
    return a(paramJSONObject, paramString, 0.0F);
  }
  
  public static float h(JSONObject paramJSONObject, String paramString)
  {
    return ae((float)paramJSONObject.getDouble(paramString));
  }
  
  public static int h(JSONArray paramJSONArray)
  {
    if ((paramJSONArray == null) || (paramJSONArray.length() < 3)) {
      return 0;
    }
    if (paramJSONArray.length() == 3) {
      return Color.rgb(paramJSONArray.optInt(0) & 0xFF, paramJSONArray.optInt(1) & 0xFF, paramJSONArray.optInt(2) & 0xFF);
    }
    return Color.argb(paramJSONArray.optInt(3) & 0xFF, paramJSONArray.optInt(0) & 0xFF, paramJSONArray.optInt(1) & 0xFF, paramJSONArray.optInt(2) & 0xFF);
  }
  
  public static int i(JSONArray paramJSONArray)
  {
    return Math.round(ae((float)paramJSONArray.getDouble(0)));
  }
  
  public static int lO(int paramInt)
  {
    if (gBr == null) {
      return paramInt;
    }
    return (int)(paramInt / gBr.density);
  }
  
  public static int lP(int paramInt)
  {
    if (gBr == null) {
      return paramInt;
    }
    return (int)(gBr.density * paramInt);
  }
  
  public static int vO(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return 0;
    }
    if (paramString.charAt(0) == '#')
    {
      if (paramString.length() == 7) {}
      for (long l = Long.parseLong(paramString.substring(1), 16) | 0xFFFFFFFFFF000000;; l = Long.parseLong(paramString.substring(1, 7), 16) | Long.parseLong(paramString.substring(7, 9), 16) << 24)
      {
        return (int)l;
        if (paramString.length() != 9) {
          throw new IllegalArgumentException("Unknown color");
        }
      }
    }
    try
    {
      int i = Color.parseColor(paramString);
      return i;
    }
    catch (IllegalArgumentException paramString) {}
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/q/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */