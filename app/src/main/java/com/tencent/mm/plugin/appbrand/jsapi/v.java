package com.tencent.mm.plugin.appbrand.jsapi;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.magicbrush.handler.image.MBCanvasContentHolder;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class v
  extends a
{
  public static final int CTRL_INDEX = 250;
  public static final String NAME = "captureScreen";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    Object localObject1 = paraml.mAppId;
    x.i("MicroMsg.JsApiCaptureScreen", "captureScreen, appId:%s", new Object[] { localObject1 });
    paramJSONObject = d(paraml);
    if (paramJSONObject != null)
    {
      x.i("MicroMsg.JsApiCaptureScreen", "isGame:%b", new Object[] { Boolean.valueOf(paraml.fdO.aaq()) });
      if (paraml.fdO.aaq())
      {
        paramJSONObject = com.tencent.mm.plugin.appbrand.game.e.a.fDd.ahj();
        if (paramJSONObject != null)
        {
          paramJSONObject = paramJSONObject.content;
          if (paramJSONObject != null) {
            break label128;
          }
          x.e("MicroMsg.JsApiCaptureScreen", "bitmap is null, err return");
          paraml.E(paramInt, f("fail:can't captureScreen", null));
        }
      }
      for (;;)
      {
        return;
        x.e("MicroMsg.JsApiCaptureScreen", "mbCanvasContentHolder is null");
        paramJSONObject = null;
        break;
        paramJSONObject = c.dk(paramJSONObject.aha());
        break;
        label128:
        Object localObject2 = AppBrandLocalMediaObjectManager.genMediaFilePath((String)localObject1, "appbrand_capture_" + System.currentTimeMillis());
        x.i("MicroMsg.JsApiCaptureScreen", "capture bitmap path:%s", new Object[] { localObject2 });
        try
        {
          c.a(paramJSONObject, 100, Bitmap.CompressFormat.PNG, (String)localObject2, true);
          localObject1 = AppBrandLocalMediaObjectManager.attach((String)localObject1, (String)localObject2, "png", true);
          if (localObject1 == null)
          {
            x.w("MicroMsg.JsApiCaptureScreen", "create temp file failed, path:%s", new Object[] { localObject2 });
            paraml.E(paramInt, f("fail:gen temp file failed", null));
            return;
          }
          localObject2 = new HashMap();
          ((HashMap)localObject2).put("tempFilePath", ((AppBrandLocalMediaObject)localObject1).bNH);
          x.i("MicroMsg.JsApiCaptureScreen", "capture bitmap tempFilePath:%s", new Object[] { ((AppBrandLocalMediaObject)localObject1).bNH });
          paraml.E(paramInt, f("ok", (Map)localObject2));
          return;
        }
        catch (IOException localIOException)
        {
          x.w("MicroMsg.JsApiCaptureScreen", "save bitmap to file failed, . exception : %s", new Object[] { localIOException });
          paraml.E(paramInt, f("fail:IOException", null));
          return;
        }
        catch (Exception localException)
        {
          x.w("MicroMsg.JsApiCaptureScreen", "save bitmap to file failed, . exception : %s", new Object[] { localException });
          paraml.E(paramInt, f("fail:Exception", null));
          return;
        }
        finally
        {
          if ((paramJSONObject != null) && (!paramJSONObject.isRecycled())) {
            paramJSONObject.recycle();
          }
        }
      }
    }
    x.e("MicroMsg.JsApiCaptureScreen", "captureScreen, container or page is null");
    paraml.E(paramInt, f("fail:container or page is null", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */