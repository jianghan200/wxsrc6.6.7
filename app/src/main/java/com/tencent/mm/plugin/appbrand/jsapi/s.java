package com.tencent.mm.plugin.appbrand.jsapi;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import com.tencent.mm.plugin.appbrand.canvas.h;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class s
  extends a
{
  public static final int CTRL_INDEX = 372;
  public static final String NAME = "canvasGetImageData";
  
  private static Map<String, Object> b(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    Object localObject = new byte[paramArrayOfInt.length * 4];
    int i = 0;
    int k;
    for (int j = 0; i < paramArrayOfInt.length; j = k + 1)
    {
      k = j + 1;
      localObject[j] = ((byte)(paramArrayOfInt[i] >> 16 & 0xFF));
      j = k + 1;
      localObject[k] = ((byte)(paramArrayOfInt[i] >> 8 & 0xFF));
      k = j + 1;
      localObject[j] = ((byte)(paramArrayOfInt[i] & 0xFF));
      localObject[k] = ((byte)(paramArrayOfInt[i] >> 24 & 0xFF));
      i += 1;
    }
    paramArrayOfInt = ByteBuffer.wrap((byte[])localObject);
    localObject = new HashMap();
    ((Map)localObject).put("data", paramArrayOfInt);
    ((Map)localObject).put("width", Integer.valueOf(paramInt1));
    ((Map)localObject).put("height", Integer.valueOf(paramInt2));
    return (Map<String, Object>)localObject;
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    super.a(paraml, paramJSONObject, paramInt);
    int i7;
    try
    {
      i7 = paramJSONObject.getInt("canvasId");
      localObject = d(paraml);
      if (localObject == null)
      {
        x.w("MicroMsg.JsApiCanvasGetImageData", "invoke JsApi canvasGetImageData failed, current page view is null.");
        paraml.E(paramInt, f("fail:page is null", null));
        return;
      }
    }
    catch (JSONException paramJSONObject)
    {
      x.i("MicroMsg.JsApiCanvasGetImageData", "get canvas id failed, %s", new Object[] { Log.getStackTraceString(paramJSONObject) });
      paraml.E(paramInt, f("fail:illegal canvasId", null));
      return;
    }
    Object localObject = ((p)localObject).agU().lx(i7);
    if (localObject == null)
    {
      x.w("MicroMsg.JsApiCanvasGetImageData", "view(%s) is null.", new Object[] { Integer.valueOf(i7) });
      paraml.E(paramInt, f("fail:view is null", null));
      return;
    }
    if (!(localObject instanceof CoverViewContainer))
    {
      x.w("MicroMsg.JsApiCanvasGetImageData", "the viewId is not a canvas(%s).", new Object[] { Integer.valueOf(i7) });
      paraml.E(paramInt, f("fail:illegal view type", null));
      return;
    }
    localObject = ((CoverViewContainer)localObject).A(View.class);
    if (!(localObject instanceof com.tencent.mm.plugin.appbrand.canvas.widget.a))
    {
      x.i("MicroMsg.JsApiCanvasGetImageData", "the view is not a instance of CanvasView.(%s)", new Object[] { Integer.valueOf(i7) });
      paraml.E(paramInt, f("fail:illegal view type", null));
      return;
    }
    float f = f.aor();
    int m = paramJSONObject.optInt("x");
    int n = paramJSONObject.optInt("y");
    int i = paramJSONObject.optInt("width");
    int i1 = paramJSONObject.optInt("height");
    if ((i == 0) || (i1 == 0))
    {
      x.i("MicroMsg.JsApiCanvasGetImageData", "width(%s) or height(%s) is 0.(%s)", new Object[] { Integer.valueOf(i), Integer.valueOf(i1), Integer.valueOf(i7) });
      paraml.E(paramInt, f("fail:width or height is 0", null));
      return;
    }
    int k;
    if (i < 0)
    {
      k = -i;
      m += i;
    }
    for (;;)
    {
      if (i1 < 0)
      {
        i = -i1;
        n += i1;
        i1 = i;
      }
      for (;;)
      {
        int j = Math.round(m * f);
        int i4 = Math.round(n * f);
        int i6 = Math.round(k * f);
        int i5 = Math.round(i1 * f);
        i = ((View)localObject).getMeasuredWidth();
        int i8 = ((View)localObject).getMeasuredHeight();
        if (j < 0) {}
        label753:
        label844:
        label851:
        for (int i2 = 0;; i2 = j)
        {
          if (i4 < 0) {}
          for (int i3 = 0;; i3 = i4)
          {
            if (j + i6 > i)
            {
              i -= i2;
              if (i4 + i5 <= i8) {
                break label753;
              }
              j = i8 - i3;
            }
            for (;;)
            {
              i4 = Math.round(i2 / f);
              i5 = Math.round(i3 / f);
              i6 = Math.round(i / f);
              i8 = Math.round(j / f);
              try
              {
                paramJSONObject = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
                h localh = new h(paramJSONObject);
                localh.save();
                localh.translate(-i2, -i3);
                ((com.tencent.mm.plugin.appbrand.canvas.widget.a)localObject).d(localh);
                localh.restore();
                paramJSONObject = Bitmap.createScaledBitmap(paramJSONObject, i6, i8, false);
                localObject = new int[k * i1];
                paramJSONObject.getPixels((int[])localObject, (i5 - n) * k + (i4 - m), k, 0, 0, i6, i8);
                paraml.E(paramInt, a(paraml, "ok", b((int[])localObject, k, i1)));
                return;
              }
              catch (Exception paramJSONObject)
              {
                x.w("MicroMsg.JsApiCanvasGetImageData", "create bitmap failed, viewId(%s). Exception : %s", new Object[] { Integer.valueOf(i7), paramJSONObject });
                paraml.E(paramInt, f("fail:create bitmap failed", null));
                return;
              }
              if (j < i) {
                break label851;
              }
              paraml.E(paramInt, a(paraml, "ok", b(new int[k * i1], k, i1)));
              return;
              if (i4 < i8) {
                break label844;
              }
              paraml.E(paramInt, a(paraml, "ok", b(new int[k * i1], k, i1)));
              return;
              if (j + i6 <= 0)
              {
                paraml.E(paramInt, a(paraml, "ok", b(new int[k * i1], k, i1)));
                return;
              }
              i = i6;
              if (j >= 0) {
                break;
              }
              i = i6 + j;
              break;
              if (i4 + i5 <= 0)
              {
                paraml.E(paramInt, a(paraml, "ok", b(new int[k * i1], k, i1)));
                return;
              }
              j = i5;
              if (i4 < 0) {
                j = i5 + i4;
              }
            }
          }
        }
      }
      k = i;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */