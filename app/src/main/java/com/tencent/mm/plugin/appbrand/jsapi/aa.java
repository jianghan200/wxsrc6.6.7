package com.tencent.mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipboardManager;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class aa
  extends a
{
  public static final int CTRL_INDEX = 169;
  public static final String NAME = "getClipboardData";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = (ClipboardManager)paraml.getContext().getSystemService("clipboard");
    if (paramJSONObject == null)
    {
      x.i("MicroMsg.JsApiGetClipboardData", "getSystemService(CLIPBOARD_SERVICE) failed.");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    Object localObject2 = paramJSONObject.getPrimaryClip();
    Object localObject1 = "";
    paramJSONObject = (JSONObject)localObject1;
    if (localObject2 != null)
    {
      paramJSONObject = (JSONObject)localObject1;
      if (((ClipData)localObject2).getItemCount() > 0)
      {
        localObject2 = ((ClipData)localObject2).getItemAt(0);
        paramJSONObject = (JSONObject)localObject1;
        if (((ClipData.Item)localObject2).getText() != null) {
          paramJSONObject = ((ClipData.Item)localObject2).getText().toString();
        }
      }
    }
    x.d("MicroMsg.JsApiGetClipboardData", "stevyang retData %s", new Object[] { paramJSONObject });
    localObject1 = new HashMap();
    ((Map)localObject1).put("data", paramJSONObject);
    paraml.E(paramInt, f("ok", (Map)localObject1));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */