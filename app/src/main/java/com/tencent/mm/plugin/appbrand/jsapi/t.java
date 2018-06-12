package com.tencent.mm.plugin.appbrand.jsapi;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q.c;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class t
  extends a
{
  public static final int CTRL_INDEX = 373;
  public static final String NAME = "canvasPutImageData";
  
  private static int[] h(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer = c.k(paramByteBuffer);
    int[] arrayOfInt = new int[paramByteBuffer.length / 4];
    int i = 0;
    int k;
    for (int j = 0; i < arrayOfInt.length; j = k + 1)
    {
      k = j + 1;
      j = paramByteBuffer[j];
      int m = k + 1;
      int n = paramByteBuffer[k];
      k = m + 1;
      m = paramByteBuffer[m];
      arrayOfInt[i] = ((paramByteBuffer[k] & 0xFF) << 24 | m & 0xFF | (n & 0xFF) << 8 | (j & 0xFF) << 16);
      i += 1;
    }
    return arrayOfInt;
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    super.a(paraml, paramJSONObject, paramInt);
    int n;
    try
    {
      n = paramJSONObject.getInt("canvasId");
      localObject1 = d(paraml);
      if (localObject1 == null)
      {
        x.w("MicroMsg.JsApiCanvasPutImageData", "invoke JsApi canvasGetImageData failed, current page view is null.");
        paraml.E(paramInt, f("fail:page is null", null));
        return;
      }
    }
    catch (JSONException paramJSONObject)
    {
      x.i("MicroMsg.JsApiCanvasPutImageData", "get canvas id failed, %s", new Object[] { Log.getStackTraceString(paramJSONObject) });
      paraml.E(paramInt, f("fail:illegal canvasId", null));
      return;
    }
    Object localObject1 = ((p)localObject1).agU().lx(n);
    if (localObject1 == null)
    {
      x.w("MicroMsg.JsApiCanvasPutImageData", "view(%s) is null.", new Object[] { Integer.valueOf(n) });
      paraml.E(paramInt, f("fail:view is null", null));
      return;
    }
    if (!(localObject1 instanceof CoverViewContainer))
    {
      x.w("MicroMsg.JsApiCanvasPutImageData", "the viewId is not a canvas(%s).", new Object[] { Integer.valueOf(n) });
      paraml.E(paramInt, f("fail:illegal view type", null));
      return;
    }
    localObject1 = ((CoverViewContainer)localObject1).A(View.class);
    if (!(localObject1 instanceof com.tencent.mm.plugin.appbrand.canvas.widget.a))
    {
      x.i("MicroMsg.JsApiCanvasPutImageData", "the view is not a instance of CanvasView.(%s)", new Object[] { Integer.valueOf(n) });
      paraml.E(paramInt, f("fail:illegal view type", null));
      return;
    }
    float f = f.aor();
    int j = paramJSONObject.optInt("x");
    int m = paramJSONObject.optInt("y");
    int i = paramJSONObject.optInt("width");
    int k = paramJSONObject.optInt("height");
    Math.round(j * f);
    Math.round(m * f);
    Math.round(i * f);
    Math.round(f * k);
    if ((i == 0) || (k == 0))
    {
      x.i("MicroMsg.JsApiCanvasPutImageData", "width(%s) or height(%s) is 0.(%s)", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(n) });
      paraml.E(paramInt, f("fail:width or height is 0", null));
      return;
    }
    if (i < 0)
    {
      j += i;
      i = -i;
    }
    for (;;)
    {
      if (k < 0)
      {
        m += k;
        k = -k;
      }
      for (;;)
      {
        m.a(paraml, paramJSONObject, this);
        try
        {
          paramJSONObject = paramJSONObject.get("data");
          if (!(paramJSONObject instanceof ByteBuffer))
          {
            x.i("MicroMsg.JsApiCanvasPutImageData", "get data failed, value is not a ByteBuffer");
            paraml.E(paramInt, f("fail:illegal data", null));
            return;
          }
        }
        catch (JSONException paramJSONObject)
        {
          x.i("MicroMsg.JsApiCanvasPutImageData", "get data failed, %s", new Object[] { Log.getStackTraceString(paramJSONObject) });
          paraml.E(paramInt, f("fail:missing data", null));
          return;
        }
        Object localObject2 = (ByteBuffer)paramJSONObject;
        paramJSONObject = new JSONArray();
        localObject2 = h((ByteBuffer)localObject2);
        JSONObject localJSONObject = new JSONObject();
        try
        {
          JSONArray localJSONArray = new JSONArray();
          localJSONArray.put(j);
          localJSONArray.put(m);
          localJSONArray.put(i);
          localJSONArray.put(k);
          localJSONArray.put(Bitmap.createBitmap((int[])localObject2, i, k, Bitmap.Config.ARGB_8888));
          localJSONObject.put("method", "__setPixels");
          localJSONObject.put("data", localJSONArray);
          paramJSONObject.put(localJSONObject);
          localObject1 = (com.tencent.mm.plugin.appbrand.canvas.widget.a)localObject1;
          ((com.tencent.mm.plugin.appbrand.canvas.widget.a)localObject1).b(paramJSONObject, new t.1(this, paraml, paramInt));
          ((com.tencent.mm.plugin.appbrand.canvas.widget.a)localObject1).adk();
          return;
        }
        catch (JSONException paramJSONObject)
        {
          x.w("MicroMsg.JsApiCanvasPutImageData", "put json value error : %s", new Object[] { paramJSONObject });
          paraml.E(paramInt, f("fail:build action JSON error", null));
          return;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */