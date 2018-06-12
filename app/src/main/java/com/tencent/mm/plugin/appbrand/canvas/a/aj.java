package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import org.json.JSONArray;
import org.json.JSONException;

public final class aj
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() < 6) {
      return false;
    }
    try
    {
      float f1 = (float)paramJSONArray.getDouble(0);
      float f2 = (float)paramJSONArray.getDouble(1);
      float f3 = (float)paramJSONArray.getDouble(2);
      float f4 = (float)paramJSONArray.getDouble(3);
      float f5 = com.tencent.mm.plugin.appbrand.q.f.c(paramJSONArray, 4);
      float f6 = com.tencent.mm.plugin.appbrand.q.f.c(paramJSONArray, 5);
      paramf = new Matrix();
      paramf.reset();
      paramf.preSkew(f3, f2);
      paramf.preTranslate(f5, f6);
      paramf.preScale(f1, f4);
      paramCanvas.concat(paramf);
      return true;
    }
    catch (JSONException paramf) {}
    return false;
  }
  
  public final String getMethod()
  {
    return "transform";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */