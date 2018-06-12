package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.Paint.Cap;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.canvas.f;
import org.json.JSONArray;

public final class x
  implements d
{
  public final boolean a(f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() <= 0) {
      return false;
    }
    paramCanvas = paramJSONArray.optString(0);
    if ("butt".equalsIgnoreCase(paramCanvas))
    {
      paramf.fng.setStrokeCap(Paint.Cap.BUTT);
      paramf.fnf.setStrokeCap(Paint.Cap.BUTT);
    }
    for (;;)
    {
      return true;
      if ("round".equalsIgnoreCase(paramCanvas))
      {
        paramf.fng.setStrokeCap(Paint.Cap.ROUND);
        paramf.fnf.setStrokeCap(Paint.Cap.ROUND);
      }
      else if ("square".equalsIgnoreCase(paramCanvas))
      {
        paramf.fng.setStrokeCap(Paint.Cap.SQUARE);
        paramf.fnf.setStrokeCap(Paint.Cap.SQUARE);
      }
    }
  }
  
  public final String getMethod()
  {
    return "setLineCap";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */