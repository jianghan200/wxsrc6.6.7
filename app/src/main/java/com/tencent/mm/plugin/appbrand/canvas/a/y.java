package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import org.json.JSONArray;
import org.json.JSONException;

public final class y
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() < 2) {}
    for (;;)
    {
      return false;
      try
      {
        paramCanvas = paramJSONArray.getJSONArray(0);
        if (paramCanvas != null)
        {
          float[] arrayOfFloat = new float[paramCanvas.length()];
          int i = 0;
          while (i < arrayOfFloat.length)
          {
            arrayOfFloat[i] = com.tencent.mm.plugin.appbrand.q.f.d(paramCanvas, i);
            i += 1;
          }
          float f = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 1);
          paramf.fnf.setPathEffect(new DashPathEffect(arrayOfFloat, f));
          return true;
        }
      }
      catch (JSONException paramf) {}
    }
    return false;
  }
  
  public final String getMethod()
  {
    return "setLineDash";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */