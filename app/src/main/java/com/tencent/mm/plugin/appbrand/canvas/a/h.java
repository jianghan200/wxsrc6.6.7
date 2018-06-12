package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import org.json.JSONArray;

public final class h
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() < 4) {
      return false;
    }
    float f1 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 0);
    float f2 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 1);
    paramCanvas.drawRect(f1, f2, f1 + com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 2), com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 3) + f2, paramf.fnf);
    return true;
  }
  
  public final String getMethod()
  {
    return "strokeRect";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */