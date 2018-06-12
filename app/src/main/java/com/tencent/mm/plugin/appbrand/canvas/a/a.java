package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.mm.plugin.appbrand.canvas.h;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;

public final class a
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() < 4) {
      return false;
    }
    float f1 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 0);
    float f2 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 1);
    float f3 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 2);
    float f4 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 3);
    if (paramCanvas.isHardwareAccelerated())
    {
      if ((paramCanvas instanceof h))
      {
        ((h)paramCanvas).e(f1, f2, f1 + f3, f2 + f4);
        x.v("MicroMsg.ClearRectAction", "MCanvas.clearRect(x : %s, y : %s, w : %s, h : %s)", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4) });
        return true;
      }
      if (paramf.fnk != null)
      {
        paramCanvas.drawRect(f1, f2, f1 + f3, f2 + f4, paramf.fnk);
        x.v("MicroMsg.ClearRectAction", "clearRect(x : %s, y : %s, w : %s, h : %s) with custom clearPaint", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4) });
        return true;
      }
      x.v("MicroMsg.ClearRectAction", "clearRect(x : %s, y : %s, w : %s, h : %s) failed", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4) });
      return false;
    }
    if (paramf.fnk != null)
    {
      paramCanvas.drawRect(f1, f2, f1 + f3, f2 + f4, paramf.fnk);
      x.v("MicroMsg.ClearRectAction", "clearRect(x : %s, y : %s, w : %s, h : %s) with custom clearPaint", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4) });
      return true;
    }
    paramCanvas.drawRect(f1, f2, f1 + f3, f2 + f4, paramf.fnj);
    x.v("MicroMsg.ClearRectAction", "clearRect(x : %s, y : %s, w : %s, h : %s) with default clearPaint", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4) });
    return true;
  }
  
  public final String getMethod()
  {
    return "clearRect";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */