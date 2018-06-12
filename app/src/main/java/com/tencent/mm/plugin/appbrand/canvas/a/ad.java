package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.tencent.mm.plugin.appbrand.canvas.h;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;

public final class ad
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    int i = com.tencent.mm.plugin.appbrand.q.f.a(paramJSONArray, 0);
    int j = com.tencent.mm.plugin.appbrand.q.f.a(paramJSONArray, 1);
    int k = com.tencent.mm.plugin.appbrand.q.f.a(paramJSONArray, 2);
    int m = com.tencent.mm.plugin.appbrand.q.f.a(paramJSONArray, 3);
    if (paramCanvas.isHardwareAccelerated()) {
      if ((paramCanvas instanceof h))
      {
        ((h)paramCanvas).e(i, j, i + k, j + m);
        x.v("MicroMsg.SetPixelsAction", "MCanvas.clearRect(x : %s, y : %s, w : %s, h : %s)", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
      }
    }
    for (;;)
    {
      try
      {
        paramJSONArray = (Bitmap)paramJSONArray.get(4);
        if ((paramJSONArray != null) && (!paramJSONArray.isRecycled())) {
          break;
        }
        return false;
      }
      catch (Exception paramf)
      {
        x.w("MicroMsg.SetPixelsAction", "get bitmap data error, %s", new Object[] { Log.getStackTraceString(paramf) });
        return false;
      }
      if (paramf.fnk != null)
      {
        paramCanvas.drawRect(i, j, i + k, j + m, paramf.fnk);
        x.v("MicroMsg.SetPixelsAction", "clearRect(x : %s, y : %s, w : %s, h : %s) with custom clearPaint", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
      }
      else
      {
        x.v("MicroMsg.SetPixelsAction", "clearRect(x : %s, y : %s, w : %s, h : %s) failed", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
        continue;
        if (paramf.fnk != null)
        {
          paramCanvas.drawRect(i, j, i + k, j + m, paramf.fnk);
          x.v("MicroMsg.SetPixelsAction", "clearRect(x : %s, y : %s, w : %s, h : %s) with custom clearPaint", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
        }
        else
        {
          paramCanvas.drawRect(i, j, i + k, j + m, paramf.fnj);
          x.v("MicroMsg.SetPixelsAction", "clearRect(x : %s, y : %s, w : %s, h : %s) with default clearPaint", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
        }
      }
    }
    paramCanvas.drawBitmap(paramJSONArray, new Rect(0, 0, paramJSONArray.getWidth(), paramJSONArray.getHeight()), new RectF(i, j, i + k, j + m), paramf.fnf);
    return true;
  }
  
  public final String getMethod()
  {
    return "__setPixels";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */