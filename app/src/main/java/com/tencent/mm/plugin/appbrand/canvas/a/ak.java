package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import org.json.JSONArray;

public final class ak
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() < 2) {
      return false;
    }
    paramCanvas.translate(com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 0), com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 1));
    return true;
  }
  
  public final String getMethod()
  {
    return "translate";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */