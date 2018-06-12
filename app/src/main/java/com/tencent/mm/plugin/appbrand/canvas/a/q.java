package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.canvas.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;

public final class q
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() < 2) {
      return false;
    }
    Object localObject = paramJSONArray.optString(0);
    paramCanvas = paramf.fng;
    float f1;
    float f2;
    float f3;
    JSONArray localJSONArray;
    if ("linear".equalsIgnoreCase((String)localObject))
    {
      if (paramJSONArray.length() < 3) {
        return false;
      }
      paramf = paramJSONArray.optJSONArray(1);
      if ((paramf == null) || (paramf.length() < 4)) {
        return false;
      }
      f1 = com.tencent.mm.plugin.appbrand.q.f.d(paramf, 0);
      f2 = com.tencent.mm.plugin.appbrand.q.f.d(paramf, 1);
      f3 = com.tencent.mm.plugin.appbrand.q.f.d(paramf, 2);
      float f4 = com.tencent.mm.plugin.appbrand.q.f.d(paramf, 3);
      paramf = paramJSONArray.optJSONArray(2);
      if ((paramf == null) || (paramf.length() == 0)) {
        return false;
      }
      paramJSONArray = new int[paramf.length()];
      localObject = new float[paramf.length()];
      i = 0;
      while (i < paramf.length())
      {
        localJSONArray = paramf.optJSONArray(i);
        if (localJSONArray.length() >= 2)
        {
          localObject[i] = ((float)localJSONArray.optDouble(0));
          paramJSONArray[i] = com.tencent.mm.plugin.appbrand.q.f.h(localJSONArray.optJSONArray(1));
        }
        i += 1;
      }
      paramCanvas.setShader(new LinearGradient(f1, f2, f3, f4, paramJSONArray, (float[])localObject, Shader.TileMode.CLAMP));
    }
    do
    {
      do
      {
        for (;;)
        {
          return true;
          if ("radial".equalsIgnoreCase((String)localObject))
          {
            if (paramJSONArray.length() < 3) {
              return false;
            }
            paramf = paramJSONArray.optJSONArray(1);
            if ((paramf == null) || (paramf.length() < 3)) {
              return false;
            }
            f1 = com.tencent.mm.plugin.appbrand.q.f.d(paramf, 0);
            f2 = com.tencent.mm.plugin.appbrand.q.f.d(paramf, 1);
            f3 = com.tencent.mm.plugin.appbrand.q.f.d(paramf, 2);
            if (f3 <= 0.0F)
            {
              x.i("MicroMsg.Canvas.SetFillStyleAction", "setFillStyle(radial) failed, sr(%s) <= 0.", new Object[] { Float.valueOf(f3) });
              return false;
            }
            paramf = paramJSONArray.optJSONArray(2);
            paramJSONArray = new int[paramf.length()];
            localObject = new float[paramf.length()];
            i = 0;
            while (i < paramf.length())
            {
              localJSONArray = paramf.optJSONArray(i);
              if (localJSONArray.length() >= 2)
              {
                localObject[i] = ((float)localJSONArray.optDouble(0));
                paramJSONArray[i] = com.tencent.mm.plugin.appbrand.q.f.h(localJSONArray.optJSONArray(1));
              }
              i += 1;
            }
            paramCanvas.setShader(new RadialGradient(f1, f2, f3, paramJSONArray, (float[])localObject, Shader.TileMode.CLAMP));
          }
          else
          {
            if (!"normal".equalsIgnoreCase((String)localObject)) {
              break;
            }
            paramf = paramJSONArray.optJSONArray(1);
            if ((paramf == null) || (paramf.length() < 4)) {
              return false;
            }
            paramCanvas.setShader(null);
            paramCanvas.setColor(com.tencent.mm.plugin.appbrand.q.f.h(paramf));
          }
        }
      } while (!"pattern".equalsIgnoreCase((String)localObject));
      localObject = paramJSONArray.optString(1);
      paramJSONArray = paramJSONArray.optString(2);
      if (bi.oW((String)localObject))
      {
        x.w("MicroMsg.Canvas.SetFillStyleAction", "setFillStyle failed, type is pattern but image path is null or nil.");
        return false;
      }
      paramf = paramf.fnl.aY(paramf.doU, (String)localObject);
    } while ((paramf == null) || (paramf.isRecycled()));
    int j = com.tencent.mm.plugin.appbrand.q.f.lP(paramf.getWidth());
    int k = com.tencent.mm.plugin.appbrand.q.f.lP(paramf.getHeight());
    int i = -1;
    switch (paramJSONArray.hashCode())
    {
    default: 
      switch (i)
      {
      default: 
        label596:
        paramf = null;
      }
      break;
    }
    for (;;)
    {
      paramCanvas.setShader(paramf);
      break;
      if (!paramJSONArray.equals("repeat")) {
        break label596;
      }
      i = 0;
      break label596;
      if (!paramJSONArray.equals("repeat-x")) {
        break label596;
      }
      i = 1;
      break label596;
      if (!paramJSONArray.equals("repeat-y")) {
        break label596;
      }
      i = 2;
      break label596;
      if (!paramJSONArray.equals("no-repeat")) {
        break label596;
      }
      i = 3;
      break label596;
      paramf = new BitmapShader(Bitmap.createScaledBitmap(paramf, j, k, false), Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
      continue;
      paramJSONArray = Bitmap.createBitmap(j, k + 1, Bitmap.Config.ARGB_8888);
      new Canvas(paramJSONArray).drawBitmap(paramf, new Rect(0, 0, paramf.getWidth(), paramf.getHeight()), new RectF(0.0F, 0.0F, j, k), null);
      paramf = new BitmapShader(paramJSONArray, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
      continue;
      paramJSONArray = Bitmap.createBitmap(j + 1, k, Bitmap.Config.ARGB_8888);
      new Canvas(paramJSONArray).drawBitmap(paramf, new Rect(0, 0, paramf.getWidth(), paramf.getHeight()), new RectF(0.0F, 0.0F, j, k), null);
      paramf = new BitmapShader(paramJSONArray, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT);
      continue;
      paramJSONArray = Bitmap.createBitmap(j + 1, k + 1, Bitmap.Config.ARGB_8888);
      new Canvas(paramJSONArray).drawBitmap(paramf, new Rect(0, 0, paramf.getWidth(), paramf.getHeight()), new RectF(0.0F, 0.0F, j, k), null);
      paramf = new BitmapShader(paramJSONArray, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    }
  }
  
  public final String getMethod()
  {
    return "setFillStyle";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */