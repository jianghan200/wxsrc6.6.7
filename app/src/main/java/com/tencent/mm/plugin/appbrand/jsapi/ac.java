package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.View;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.plugin.appbrand.widget.actionbar.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import org.json.JSONObject;

public final class ac
  extends n
{
  public static final int CTRL_INDEX = -1;
  public static final String NAME = "getMenuButtonBoundingClientRect";
  
  public final String a(l paraml, JSONObject paramJSONObject)
  {
    paraml = d(paraml);
    if (paraml == null)
    {
      x.w("MicroMsg.JsApiGetMenuButtonBoundingClientRect", "invoke JsApi JsApiGetMenuButtonBoundingClientRect failed, current page view is null.");
      return f("fail", null);
    }
    if ((paraml.gnn != null) && (paraml.gnn.getActionView().getWidth() != 0))
    {
      paramJSONObject = new HashMap();
      paramJSONObject.put("width", Integer.valueOf(f.lO(paraml.gnn.getActionView().getWidth())));
      paramJSONObject.put("height", Integer.valueOf(f.lO(paraml.gnn.getActionView().getHeight())));
      paramJSONObject.put("top", Integer.valueOf(f.lO(paraml.gnn.getActionView().getTop())));
      paramJSONObject.put("right", Integer.valueOf(f.lO(paraml.gnn.getActionView().getRight())));
      paramJSONObject.put("bottom", Integer.valueOf(f.lO(paraml.gnn.getActionView().getBottom())));
      paramJSONObject.put("left", Integer.valueOf(f.lO(paraml.gnn.getActionView().getLeft())));
      x.i("MicroMsg.JsApiGetMenuButtonBoundingClientRect", "getMenuButtonBoundingClientRect : %s", new Object[] { f("ok", paramJSONObject) });
      return f("ok", paramJSONObject);
    }
    x.w("MicroMsg.JsApiGetMenuButtonBoundingClientRect", "invoke JsApi JsApiGetMenuButtonBoundingClientRect failed, actionbar is not ready.");
    return f("fail", null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */