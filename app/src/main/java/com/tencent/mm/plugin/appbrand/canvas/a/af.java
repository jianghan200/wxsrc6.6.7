package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import org.json.JSONArray;

public final class af
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() < 2) {
      return false;
    }
    paramCanvas = paramJSONArray.optString(0);
    float f1;
    float f2;
    float f3;
    float[] arrayOfFloat;
    int i;
    JSONArray localJSONArray;
    if ("linear".equalsIgnoreCase(paramCanvas))
    {
      if (paramJSONArray.length() < 3) {
        return false;
      }
      paramCanvas = paramJSONArray.optJSONArray(1);
      if ((paramCanvas == null) || (paramCanvas.length() < 4)) {
        return false;
      }
      f1 = com.tencent.mm.plugin.appbrand.q.f.d(paramCanvas, 0);
      f2 = com.tencent.mm.plugin.appbrand.q.f.d(paramCanvas, 1);
      f3 = com.tencent.mm.plugin.appbrand.q.f.d(paramCanvas, 2);
      float f4 = com.tencent.mm.plugin.appbrand.q.f.d(paramCanvas, 3);
      paramCanvas = paramJSONArray.optJSONArray(2);
      if ((paramCanvas == null) || (paramCanvas.length() == 0)) {
        return false;
      }
      paramJSONArray = new int[paramCanvas.length()];
      arrayOfFloat = new float[paramCanvas.length()];
      i = 0;
      while (i < paramCanvas.length())
      {
        localJSONArray = paramCanvas.optJSONArray(i);
        if (localJSONArray.length() >= 2)
        {
          arrayOfFloat[i] = ((float)localJSONArray.optDouble(0));
          paramJSONArray[i] = com.tencent.mm.plugin.appbrand.q.f.h(localJSONArray.optJSONArray(1));
        }
        i += 1;
      }
      paramCanvas = new LinearGradient(f1, f2, f3, f4, paramJSONArray, arrayOfFloat, Shader.TileMode.CLAMP);
      paramf.fnf.setShader(paramCanvas);
    }
    for (;;)
    {
      return true;
      if ("radial".equalsIgnoreCase(paramCanvas))
      {
        if (paramJSONArray.length() < 3) {
          return false;
        }
        paramCanvas = paramJSONArray.optJSONArray(1);
        if ((paramCanvas == null) || (paramCanvas.length() < 3)) {
          return false;
        }
        f1 = com.tencent.mm.plugin.appbrand.q.f.d(paramCanvas, 1);
        f2 = com.tencent.mm.plugin.appbrand.q.f.d(paramCanvas, 2);
        f3 = com.tencent.mm.plugin.appbrand.q.f.d(paramCanvas, 3);
        paramCanvas = paramJSONArray.optJSONArray(2);
        paramJSONArray = new int[paramCanvas.length()];
        arrayOfFloat = new float[paramCanvas.length()];
        i = 0;
        while (i < paramCanvas.length())
        {
          localJSONArray = paramCanvas.optJSONArray(i);
          if (localJSONArray.length() >= 2)
          {
            arrayOfFloat[i] = ((float)localJSONArray.optDouble(0));
            paramJSONArray[i] = com.tencent.mm.plugin.appbrand.q.f.h(localJSONArray.optJSONArray(1));
          }
          i += 1;
        }
        paramCanvas = new RadialGradient(f1, f2, f3, paramJSONArray, arrayOfFloat, Shader.TileMode.CLAMP);
        paramf.fnf.setShader(paramCanvas);
      }
      else if ("normal".equalsIgnoreCase(paramCanvas))
      {
        paramCanvas = paramJSONArray.optJSONArray(1);
        if ((paramCanvas == null) || (paramCanvas.length() < 4)) {
          return false;
        }
        paramf.fnf.setColor(com.tencent.mm.plugin.appbrand.q.f.h(paramCanvas));
      }
    }
  }
  
  public final String getMethod()
  {
    return "setStrokeStyle";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */