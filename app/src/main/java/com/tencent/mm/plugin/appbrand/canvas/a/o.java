package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.canvas.f;
import java.util.Stack;
import org.json.JSONArray;

public final class o
  implements d
{
  public final boolean a(f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    paramCanvas.save();
    paramCanvas = paramf.fnf;
    paramf.fnh.push(paramf.fnf);
    paramf.fnf = paramf.fnf.adp();
    if (paramf.fnf == null) {
      paramf.fnf = paramCanvas;
    }
    paramCanvas = paramf.fng;
    paramf.fni.push(paramf.fng);
    paramf.fng = paramf.fng.adp();
    if (paramf.fng == null) {
      paramf.fng = paramCanvas;
    }
    return true;
  }
  
  public final String getMethod()
  {
    return "save";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */