package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.mm.plugin.appbrand.canvas.f;
import org.json.JSONArray;

public final class n
  implements d
{
  public final boolean a(f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() <= 0) {
      return false;
    }
    paramCanvas.rotate((float)((float)paramJSONArray.optDouble(0) / 3.141592653589793D * 180.0D));
    return true;
  }
  
  public final String getMethod()
  {
    return "rotate";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */