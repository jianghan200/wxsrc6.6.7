package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.canvas.f;
import java.util.Stack;
import org.json.JSONArray;

public final class m
  implements d
{
  public final boolean a(f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    paramCanvas.restore();
    if (!paramf.fnh.isEmpty())
    {
      paramf.fnf = ((a)paramf.fnh.pop());
      paramf.fng = ((a)paramf.fni.pop());
    }
    return true;
  }
  
  public final String getMethod()
  {
    return "restore";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */