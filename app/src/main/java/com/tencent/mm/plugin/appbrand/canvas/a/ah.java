package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.mm.plugin.appbrand.canvas.b.a.a;
import com.tencent.mm.plugin.appbrand.canvas.f;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;

public final class ah
  implements d
{
  public final boolean a(f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() <= 0) {
      return false;
    }
    paramCanvas = paramJSONArray.optString(0);
    x.i("MicroMsg.SetTextBaselineAction", "SetTextBaselineAction, align:%s", new Object[] { paramCanvas });
    if ("top".equalsIgnoreCase(paramCanvas))
    {
      paramf.fnf.fns = a.a.fnx;
      paramf.fng.fns = a.a.fnx;
    }
    for (;;)
    {
      return true;
      if ("middle".equalsIgnoreCase(paramCanvas))
      {
        paramf.fnf.fns = a.a.fnz;
        paramf.fng.fns = a.a.fnz;
      }
      else if ("bottom".equalsIgnoreCase(paramCanvas))
      {
        paramf.fnf.fns = a.a.fny;
        paramf.fng.fns = a.a.fny;
      }
      else if ("normal".equalsIgnoreCase(paramCanvas))
      {
        paramf.fnf.fns = a.a.fnw;
        paramf.fng.fns = a.a.fnw;
      }
    }
  }
  
  public final String getMethod()
  {
    return "setTextBaseline";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */