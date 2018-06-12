package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.Paint.Align;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.canvas.f;
import org.json.JSONArray;

public final class ag
  implements d
{
  public final boolean a(f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() <= 0) {
      return false;
    }
    paramCanvas = paramJSONArray.optString(0);
    if ("left".equalsIgnoreCase(paramCanvas))
    {
      paramf.fnf.setTextAlign(Paint.Align.LEFT);
      paramf.fng.setTextAlign(Paint.Align.LEFT);
    }
    for (;;)
    {
      return true;
      if ("right".equalsIgnoreCase(paramCanvas))
      {
        paramf.fnf.setTextAlign(Paint.Align.RIGHT);
        paramf.fng.setTextAlign(Paint.Align.RIGHT);
      }
      else if ("center".equalsIgnoreCase(paramCanvas))
      {
        paramf.fnf.setTextAlign(Paint.Align.CENTER);
        paramf.fng.setTextAlign(Paint.Align.CENTER);
      }
    }
  }
  
  public final String getMethod()
  {
    return "setTextAlign";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */