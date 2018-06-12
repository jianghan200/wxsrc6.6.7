package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import org.json.JSONArray;

public final class s
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() <= 0) {
      return false;
    }
    int i = com.tencent.mm.plugin.appbrand.q.f.a(paramJSONArray, 0);
    paramf.fng.setTextSize(i);
    paramf.fnf.setTextSize(i);
    return true;
  }
  
  public final String getMethod()
  {
    return "setFontSize";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */