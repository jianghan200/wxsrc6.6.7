package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.Paint.Join;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.canvas.f;
import org.json.JSONArray;

public final class aa
  implements d
{
  public final boolean a(f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() <= 0) {
      return false;
    }
    paramCanvas = paramJSONArray.optString(0);
    if ("miter".equalsIgnoreCase(paramCanvas))
    {
      paramf.fng.setStrokeJoin(Paint.Join.MITER);
      paramf.fnf.setStrokeJoin(Paint.Join.MITER);
    }
    for (;;)
    {
      return true;
      if ("round".equalsIgnoreCase(paramCanvas))
      {
        paramf.fng.setStrokeJoin(Paint.Join.ROUND);
        paramf.fnf.setStrokeJoin(Paint.Join.ROUND);
      }
      else if ("bevel".equalsIgnoreCase(paramCanvas))
      {
        paramf.fng.setStrokeJoin(Paint.Join.BEVEL);
        paramf.fnf.setStrokeJoin(Paint.Join.BEVEL);
      }
    }
  }
  
  public final String getMethod()
  {
    return "setLineJoin";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */