package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.json.JSONArray;

public final class e
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() < 5) {
      return false;
    }
    float f1 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 0);
    float f2 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 1);
    float f3 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 2);
    float f4 = (float)paramJSONArray.optDouble(3);
    float f5 = (float)paramJSONArray.optDouble(4);
    paramCanvas.drawArc(new RectF(f1 - f3, f2 - f3, f1 + f3, f3 + f2), (float)(f4 / 3.141592653589793D * 180.0D), (float)(f5 / 3.141592653589793D * 180.0D), true, paramf.fnf);
    return true;
  }
  
  public final String getMethod()
  {
    return "arc";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */