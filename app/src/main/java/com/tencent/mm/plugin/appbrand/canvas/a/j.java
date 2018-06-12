package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.mm.plugin.appbrand.canvas.c.e;
import com.tencent.mm.plugin.appbrand.canvas.c.e.a;
import com.tencent.mm.plugin.appbrand.canvas.f;
import org.json.JSONArray;

public final class j
  implements d
{
  public final boolean a(f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    paramCanvas.drawPath(e.a.fnC.d(paramJSONArray), paramf.fng);
    return true;
  }
  
  public final String getMethod()
  {
    return "fillPath";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */