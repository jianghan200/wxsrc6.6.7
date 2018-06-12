package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.bg.d;
import com.tencent.mm.model.u;
import com.tencent.mm.model.u.b;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.n;
import com.tencent.mm.plugin.appbrand.page.o;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import org.json.JSONObject;

public final class e
  extends a
{
  public static final int CTRL_INDEX = 74;
  public static final String NAME = "shareTimeline";
  private static boolean fYS = false;
  
  public static void ajC()
  {
    fYS = true;
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    if (!fYS) {
      paraml.E(paramInt, f("fail", null));
    }
    Object localObject1;
    MMActivity localMMActivity;
    String str2;
    String str1;
    do
    {
      return;
      fYS = false;
      if (paramJSONObject == null) {
        break label596;
      }
      localObject1 = paraml.fdO.fcu;
      localMMActivity = c(paraml);
      if (localMMActivity == null)
      {
        paraml.E(paramInt, f("fail", null));
        return;
      }
      String str3;
      try
      {
        Iterator localIterator = paramJSONObject.keys();
        while (localIterator.hasNext())
        {
          str2 = (String)localIterator.next();
          x.i("MicroMsg.JsApiShareTimeline", "%s, %s", new Object[] { str2, paramJSONObject.get(str2) });
        }
        String str4;
        String str5;
        if (!s.fj(paramJSONObject, "https://")) {
          break;
        }
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.JsApiShareTimeline", localException, "", new Object[0]);
        str1 = paramJSONObject.optString("path");
        str2 = paraml.mAppId;
        str4 = paramJSONObject.optString("desc");
        localObject2 = paramJSONObject.optString("title");
        str3 = ((AppBrandSysConfig)localObject1).bGy;
        paramJSONObject = paramJSONObject.optString("imgUrl");
        str5 = n.qz(paraml.mAppId);
        localObject1 = ((AppBrandSysConfig)localObject1).fqJ;
        x.i("MicroMsg.JsApiShareTimeline", "doSendMessage, title = %s, description = %s ,username = %s , path = %s ,thumbIconUrl = %s", new Object[] { localObject2, str4, str3, str1, paramJSONObject });
        x.i("MicroMsg.JsApiShareTimeline", "doTimeline, errorUrl:[%s]", new Object[] { str5 });
        x.i("MicroMsg.JsApiShareTimeline", "doTimeline, init intent");
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("Ksnsupload_link", str5);
        ((Intent)localObject1).putExtra("Ksnsupload_title", (String)localObject2);
        ((Intent)localObject1).putExtra("Ksnsupload_contentattribute", 0);
        if (s.fj(paramJSONObject, "http://")) {}
      }
      ((Intent)localObject1).putExtra("Ksnsupload_imgurl", paramJSONObject);
      ((Intent)localObject1).putExtra("ksnsis_appbrand", true);
      ((Intent)localObject1).putExtra("Ksnsupload_source", 1);
      ((Intent)localObject1).putExtra("Ksnsupload_type", 1);
      ((Intent)localObject1).putExtra("KsnsUpload_BrandUsername", str3);
      ((Intent)localObject1).putExtra("KsnsUpload_BrandPath", str1);
      x.d("MicroMsg.JsApiShareTimeline", "report, appId : %s, path: %s", new Object[] { str2, str1 });
      paramJSONObject = u.ic("wxapp_" + str2 + str1);
      u.Hx().v(paramJSONObject, true).p("prePublishId", "wxapp_" + str2 + str1);
      ((Intent)localObject1).putExtra("reportSessionId", paramJSONObject);
      x.i("MicroMsg.JsApiShareTimeline", "doTimeline, start activity");
    } while (!(localMMActivity instanceof MMActivity));
    ((Intent)localObject1).putExtra("need_result", true);
    localMMActivity.geJ = new e.1(this, localMMActivity, str2, str1, paraml, paramInt);
    d.a(localMMActivity, "sns", ".ui.SnsUploadUI", (Intent)localObject1, 0, false);
    return;
    Object localObject2 = o.j(paraml.fdO, paramJSONObject);
    paramJSONObject = new byte[0];
    if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled()))
    {
      x.i("MicroMsg.JsApiShareTimeline", "thumb image is not null");
      paramJSONObject = new ByteArrayOutputStream();
      ((Bitmap)localObject2).compress(Bitmap.CompressFormat.PNG, 100, paramJSONObject);
      paramJSONObject = paramJSONObject.toByteArray();
    }
    for (;;)
    {
      ((Intent)localObject1).putExtra("Ksnsupload_imgbuf", paramJSONObject);
      break;
      x.e("MicroMsg.JsApiShareTimeline", "thumb image is null");
    }
    label596:
    x.i("MicroMsg.JsApiShareTimeline", "data is null");
    paraml.E(paramInt, f("fail", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/share/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */