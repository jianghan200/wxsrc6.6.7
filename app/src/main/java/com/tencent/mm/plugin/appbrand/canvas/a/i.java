package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.canvas.b.a.a;
import org.json.JSONArray;

public final class i
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() < 3) {
      return false;
    }
    String str = paramJSONArray.optString(0);
    float f3 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 1);
    float f2 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 2);
    float f4 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 3);
    paramJSONArray = paramf.fnf.getFontMetrics();
    float f1;
    if (paramf.fnf.fns == a.a.fnx)
    {
      f1 = f2 + Math.abs(paramJSONArray.ascent);
      paramf = paramf.fnf;
      f2 = paramf.measureText(str);
      if ((f4 <= 0.0F) || (f4 >= f2)) {
        break label214;
      }
      paramCanvas.save();
      f2 = f4 / f2;
      paramCanvas.translate(f3, f1);
      paramCanvas.scale(f2, 1.0F);
      paramCanvas.drawText(str, 0.0F, 0.0F, paramf);
      paramCanvas.restore();
    }
    for (;;)
    {
      return true;
      if (paramf.fnf.fns == a.a.fnz)
      {
        f1 = f2 + Math.abs((-paramJSONArray.ascent + paramJSONArray.descent) / 2.0F - paramJSONArray.descent);
        break;
      }
      f1 = f2;
      if (paramf.fnf.fns != a.a.fny) {
        break;
      }
      f1 = f2 - Math.abs(paramJSONArray.descent);
      break;
      label214:
      paramCanvas.drawText(str, f3, f1, paramf);
    }
  }
  
  public final String getMethod()
  {
    return "strokeText";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */