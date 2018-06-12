package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import com.tencent.mm.plugin.appbrand.canvas.g;
import org.json.JSONArray;

public final class f
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    int i = paramJSONArray.length();
    if (i < 3) {
      return false;
    }
    Object localObject = paramJSONArray.optString(0);
    float f6 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 1);
    float f7 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 2);
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      return false;
    }
    float f5 = 0.0F;
    float f4 = 0.0F;
    float f3 = f6;
    float f8;
    float f2;
    float f1;
    if (i >= 5)
    {
      f3 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 3);
      f8 = com.tencent.mm.plugin.appbrand.q.f.d(paramJSONArray, 4);
      if ((f3 == 0.0F) || (f8 == 0.0F)) {
        return true;
      }
      f2 = f3;
      f1 = f6;
      if (f3 < 0.0F)
      {
        f1 = f6 + f3;
        f2 = -f3;
      }
      f4 = f8;
      f5 = f2;
      f3 = f1;
      if (f8 < 0.0F)
      {
        f3 = f7 + f8;
        f5 = -f8;
        f4 = f2;
        f2 = f1;
        f1 = f3;
      }
    }
    for (;;)
    {
      f3 = f2 + f4;
      f6 = f1 + f5;
      int j;
      int k;
      int m;
      if (i >= 9)
      {
        i = paramJSONArray.optInt(5);
        j = paramJSONArray.optInt(6);
        k = paramJSONArray.optInt(7);
        m = paramJSONArray.optInt(8);
        if ((k == 0) || (m == 0)) {
          return true;
        }
        if (k >= 0) {
          break label660;
        }
        i += k;
        k = -k;
      }
      label362:
      label368:
      label660:
      for (;;)
      {
        if (m < 0)
        {
          j += m;
          m = -m;
        }
        for (;;)
        {
          if ((i + k <= 0) || (j + m <= 0)) {
            return true;
          }
          if (i > 0)
          {
            n = i;
            if (j <= 0) {
              break label362;
            }
          }
          for (int i1 = j;; i1 = 0)
          {
            paramJSONArray = new Rect(n, i1, i + k, j + m);
            paramJSONArray = paramf.fnl.a(paramf.doU, (String)localObject, paramJSONArray, new f.1(this, paramf));
            if ((paramJSONArray != null) && (!paramJSONArray.isRecycled())) {
              break label368;
            }
            return false;
            n = 0;
            break;
          }
          i = com.tencent.mm.plugin.appbrand.q.f.lP(i);
          j = com.tencent.mm.plugin.appbrand.q.f.lP(j);
          k = com.tencent.mm.plugin.appbrand.q.f.lP(k);
          m = com.tencent.mm.plugin.appbrand.q.f.lP(m);
          int n = com.tencent.mm.plugin.appbrand.q.f.lP(n);
          i1 = com.tencent.mm.plugin.appbrand.q.f.lP(i1);
          int i2 = com.tencent.mm.plugin.appbrand.q.f.lP(paramJSONArray.getWidth());
          int i3 = com.tencent.mm.plugin.appbrand.q.f.lP(paramJSONArray.getHeight());
          f3 = f4 / k;
          f4 = f5 / m;
          f6 = f2 + (n - i) * f3;
          f7 = f1 + (i1 - j) * f4;
          f8 = f6 + i2 * f3;
          f4 = i3 * f4 + f7;
          for (;;)
          {
            paramCanvas.drawBitmap(paramJSONArray, new Rect(0, 0, paramJSONArray.getWidth(), paramJSONArray.getHeight()), new RectF(f6, f7, f8, f4), paramf.fng);
            return true;
            localObject = paramf.fnl.a(paramf.doU, (String)localObject, new f.2(this, paramf));
            if ((localObject == null) || (((Bitmap)localObject).isRecycled())) {
              return false;
            }
            if (f4 == 0.0F) {
              f3 = com.tencent.mm.plugin.appbrand.q.f.lP(((Bitmap)localObject).getWidth()) + f2;
            }
            f4 = f6;
            f8 = f3;
            f7 = f1;
            f6 = f2;
            paramJSONArray = (JSONArray)localObject;
            if (f5 == 0.0F)
            {
              f4 = com.tencent.mm.plugin.appbrand.q.f.lP(((Bitmap)localObject).getHeight()) + f1;
              f8 = f3;
              f7 = f1;
              f6 = f2;
              paramJSONArray = (JSONArray)localObject;
            }
          }
        }
      }
      f6 = f5;
      f1 = f7;
      f2 = f3;
      f5 = f4;
      f4 = f6;
    }
  }
  
  public final String getMethod()
  {
    return "drawImage";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */