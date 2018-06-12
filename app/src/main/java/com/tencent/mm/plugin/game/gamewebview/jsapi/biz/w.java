package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.model.ae;
import com.tencent.mm.plugin.webview.modeltools.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class w
  extends a
{
  public static final int CTRL_BYTE = 1;
  public static final String NAME = "imagePreview";
  
  public final void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiSendAppMessage", "invoke");
    GameWebViewUI localGameWebViewUI = paramd.getPageActivity();
    if (localGameWebViewUI == null) {
      return;
    }
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.GameJsApiSendAppMessage", "fail, data is null");
      paramd.E(paramInt, a.f("imagePreview:fail_invalid_data", null));
      return;
    }
    Object localObject1 = paramJSONObject.optString("current");
    Object localObject3 = paramJSONObject.optJSONArray("urls");
    ArrayList localArrayList = new ArrayList();
    if ((localObject3 == null) || (((JSONArray)localObject3).length() == 0))
    {
      x.e("MicroMsg.GameJsApiSendAppMessage", "fail, urls is null");
      paramd.E(paramInt, a.f("imagePreview:fail_invalid_url", null));
      return;
    }
    int i = 0;
    if (i < ((JSONArray)localObject3).length())
    {
      localObject2 = ((JSONArray)localObject3).optString(i);
      if ((bi.oW((String)localObject2)) || (((String)localObject2).equalsIgnoreCase("null"))) {
        x.e("MicroMsg.GameJsApiSendAppMessage", "null url, i = %d", new Object[] { Integer.valueOf(i) });
      }
      for (;;)
      {
        i += 1;
        break;
        paramJSONObject = (JSONObject)localObject2;
        if (bi.oV((String)localObject2).startsWith("weixin://resourceid/"))
        {
          paramJSONObject = e.bUX().Qq((String)localObject2);
          if (paramJSONObject != null) {
            paramJSONObject = paramJSONObject.fnM;
          }
        }
        else
        {
          localArrayList.add(paramJSONObject);
        }
      }
    }
    Object localObject2 = (String[])localArrayList.toArray(new String[localArrayList.size()]);
    if (bi.oW((String)localObject1)) {
      paramJSONObject = localObject2[0];
    }
    for (;;)
    {
      localObject1 = new Intent();
      localObject3 = b.cIi().getCookie(paramd.getCurrentURL());
      if (!bi.oW((String)localObject3)) {
        ((Intent)localObject1).putExtra("cookie", (String)localObject3);
      }
      ((Intent)localObject1).putExtra("nowUrl", paramJSONObject);
      ((Intent)localObject1).putExtra("urlList", (String[])localObject2);
      ((Intent)localObject1).putExtra("type", 65281);
      ((Intent)localObject1).putExtra("isFromWebView", true);
      com.tencent.mm.bg.d.b(localGameWebViewUI, "subapp", ".ui.gallery.GestureGalleryUI", (Intent)localObject1);
      paramd.E(paramInt, a.f("imagePreview:ok", null));
      return;
      if (((String)localObject1).startsWith("weixin://resourceid/"))
      {
        paramJSONObject = e.bUX().Qq((String)localObject1);
        if (paramJSONObject != null) {
          paramJSONObject = paramJSONObject.fnM;
        } else {
          paramJSONObject = "";
        }
      }
      else
      {
        paramJSONObject = (JSONObject)localObject1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */