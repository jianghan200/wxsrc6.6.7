package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import org.json.JSONArray;

public final class ae
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() < 4) {}
    float f1;
    float f2;
    float f3;
    do
    {
      return false;
      f1 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 0);
      f2 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 1);
      f3 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 2);
      paramCanvas = paramJSONArray.optJSONArray(3);
    } while ((paramCanvas == null) || (paramCanvas.length() < 4));
    int i = com.tencent.mm.plugin.appbrand.q.f.h(paramCanvas);
    paramf.fng.setShadowLayer(f3, f1, f2, i);
    paramf.fnf.setShadowLayer(f3, f1, f2, i);
    return true;
  }
  
  public final String getMethod()
  {
    return "setShadow";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */