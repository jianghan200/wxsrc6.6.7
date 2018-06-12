package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import com.tencent.magicbrush.handler.image.MBCanvasContentHolder;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.jsapi.file.f.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 100;
  public static final String NAME = "canvasToTempFilePath";
  
  public static f.a a(p paramp, JSONObject paramJSONObject, boolean paramBoolean)
  {
    int i;
    Object localObject;
    MBCanvasContentHolder localMBCanvasContentHolder;
    try
    {
      i = paramJSONObject.getInt("canvasId");
      localObject = new Bundle();
      ((Bundle)localObject).putInt("canvasId", i);
      ((Bundle)localObject).putBoolean("sync", paramBoolean);
      localMBCanvasContentHolder = (MBCanvasContentHolder)paramp.a(3, (Bundle)localObject, new Object[0]);
      if ((localMBCanvasContentHolder == null) || (localMBCanvasContentHolder.content == null))
      {
        x.w("MicroMsg.JsApiCanvasToTempFilePath", "get screenBitmap return null.");
        return new f.a("fail:get bitmap failed", new Object[0]);
      }
    }
    catch (JSONException paramp)
    {
      x.w("MicroMsg.JsApiCanvasToTempFilePath", "canvasId do not exist. exception : %s", new Object[] { paramp });
      return new f.a("fail:canvasId do not exist", new Object[0]);
    }
    float f6 = localMBCanvasContentHolder.content.getWidth();
    float f7 = localMBCanvasContentHolder.content.getHeight();
    if ((f6 == 0.0F) || (f7 == 0.0F))
    {
      x.e("MicroMsg.JsApiCanvasToTempFilePath", "illegal bitmap(screenWidth : %f, screenHeight : %f) failed, canvasId(%d).", new Object[] { Float.valueOf(f6), Float.valueOf(f7), Integer.valueOf(i) });
      return new f.a("fail:illegal bitmap", new Object[0]);
    }
    float f4;
    float f5;
    label223:
    float f2;
    float f3;
    float f8;
    float f9;
    float f1;
    if (localMBCanvasContentHolder.width == 0)
    {
      f4 = f6;
      if (localMBCanvasContentHolder.height != 0) {
        break label732;
      }
      f5 = f7;
      x.i("MicroMsg.JsApiCanvasToTempFilePath", "screenWidth:%f,screenHeight:%f,canvasWidth:%f,canvasHeight:%f", new Object[] { Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f4), Float.valueOf(f5) });
      f2 = (float)paramJSONObject.optDouble("x", 0.0D);
      f3 = (float)paramJSONObject.optDouble("y", 0.0D);
      f8 = (float)paramJSONObject.optDouble("width", f4);
      f9 = (float)paramJSONObject.optDouble("height", f5);
      x.i("MicroMsg.JsApiCanvasToTempFilePath", "x:%f,y:%f,width:%f,height:%f", new Object[] { Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f8), Float.valueOf(f9) });
      if ((f4 <= 0.0F) || (f5 <= 0.0F) || ((f6 == f4) && (f7 == f5))) {
        break label1068;
      }
      f1 = f2;
      if (f2 > 0.0F) {
        f1 = f2 / f4 * f6;
      }
      f2 = f3;
      if (f3 > 0.0F) {
        f2 = f3 / f5 * f7;
      }
      f3 = f8 / f4;
      f5 = f9 / f5 * f7;
      f8 = f3 * f6;
      f4 = f1;
      f3 = f2;
      f2 = f8;
      f1 = f5;
    }
    for (;;)
    {
      if (f4 + f2 > f6) {
        f2 = f6 - f4;
      }
      for (;;)
      {
        if (f3 + f1 > f7) {
          f1 = f7 - f3;
        }
        for (;;)
        {
          f5 = (float)paramJSONObject.optDouble("destWidth", f2);
          f8 = (float)paramJSONObject.optDouble("destHeight", f1);
          x.i("MicroMsg.JsApiCanvasToTempFilePath", "x:%f,y:%f,screenWidth:%f,screenHeight:%f,width:%f,height:%f,imgWidth:%f,imgHeight:%f", new Object[] { Float.valueOf(f4), Float.valueOf(f3), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f2), Float.valueOf(f1), Float.valueOf(f5), Float.valueOf(f8) });
          if ((f4 < 0.0F) || (f3 < 0.0F) || (f2 <= 0.0F) || (f1 <= 0.0F) || (f4 + f2 > f6) || (f3 + f1 > f7) || (f5 <= 0.0F) || (f8 <= 0.0F))
          {
            x.e("MicroMsg.JsApiCanvasToTempFilePath", "illegal arguments(x : %s, y : %s, width : %s, height : %s) failed, canvasId(%s).", new Object[] { Float.valueOf(f4), Float.valueOf(f3), Float.valueOf(f2), Float.valueOf(f1), Integer.valueOf(i) });
            return new f.a("fail:illegal arguments", new Object[0]);
            f4 = localMBCanvasContentHolder.width;
            break;
            label732:
            f5 = localMBCanvasContentHolder.height;
            break label223;
          }
          if ((f2 != f6) || (f1 != f7))
          {
            localObject = Bitmap.createBitmap(localMBCanvasContentHolder.content, (int)f4, (int)f3, (int)f2, (int)f1, null, false);
            localMBCanvasContentHolder.content.recycle();
            localMBCanvasContentHolder.content = ((Bitmap)localObject);
          }
          if ((f2 != f5) || (f1 != f8))
          {
            localObject = Bitmap.createScaledBitmap(localMBCanvasContentHolder.content, (int)f5, (int)f8, false);
            localMBCanvasContentHolder.content.recycle();
            localMBCanvasContentHolder.content = ((Bitmap)localObject);
          }
          localObject = AppBrandLocalMediaObjectManager.genMediaFilePath(paramp.mAppId, "canvas_" + i);
          Bitmap.CompressFormat localCompressFormat = p(paramJSONObject);
          for (;;)
          {
            try
            {
              com.tencent.mm.sdk.platformtools.c.a(localMBCanvasContentHolder.content, o(paramJSONObject), localCompressFormat, (String)localObject, true);
              paramJSONObject = paramp.mAppId;
              if (localCompressFormat == Bitmap.CompressFormat.JPEG)
              {
                paramp = "jpg";
                paramp = AppBrandLocalMediaObjectManager.attach(paramJSONObject, (String)localObject, paramp, true);
                if (paramp != null) {
                  break;
                }
                x.w("MicroMsg.JsApiCanvasToTempFilePath", "gen temp file failed, canvasId : %s.", new Object[] { Integer.valueOf(i) });
                return new f.a("fail:gen temp file failed", new Object[0]);
              }
            }
            catch (IOException paramp)
            {
              x.w("MicroMsg.JsApiCanvasToTempFilePath", "save bitmap to file failed, viewId(%s). exception : %s", new Object[] { Integer.valueOf(i), paramp });
              return new f.a("fail:write file failed", new Object[0]);
            }
            paramp = "png";
          }
          paramJSONObject = new HashMap();
          paramJSONObject.put("tempFilePath", paramp.bNH);
          x.v("MicroMsg.JsApiCanvasToTempFilePath", "save file(id : %s) to path : %s", new Object[] { paramp.bNH, paramp.dDG });
          return new f.a("ok", new Object[0]).z(paramJSONObject);
        }
      }
      label1068:
      f1 = f9;
      f5 = f8;
      f4 = f2;
      f2 = f5;
    }
  }
  
  private static int o(JSONObject paramJSONObject)
  {
    float f1 = 0.0F;
    float f2 = (float)paramJSONObject.optDouble("quality", 1.0D);
    if (f2 < 0.0F) {}
    for (;;)
    {
      return (int)f1;
      if (f2 > 1.0F) {
        f1 = 100.0F;
      } else {
        f1 = f2 * 100.0F;
      }
    }
  }
  
  private static Bitmap.CompressFormat p(JSONObject paramJSONObject)
  {
    Bitmap.CompressFormat localCompressFormat = Bitmap.CompressFormat.PNG;
    if ("jpg".equalsIgnoreCase(paramJSONObject.optString("fileType"))) {
      localCompressFormat = Bitmap.CompressFormat.JPEG;
    }
    return localCompressFormat;
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    com.tencent.mm.plugin.appbrand.r.c.Em().H(new a.1(this, paraml, paramInt, paramJSONObject));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */