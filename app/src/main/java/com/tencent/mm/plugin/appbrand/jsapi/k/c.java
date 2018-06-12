package com.tencent.mm.plugin.appbrand.jsapi.k;

import android.app.Activity;
import android.graphics.Color;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.plugin.appbrand.widget.input.m;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class c
  extends a
{
  private static final int CTRL_INDEX = 104;
  private static final String NAME = "showModal";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    Object localObject = d(paraml);
    if (localObject == null)
    {
      x.w("MicroMsg.JsApiShowModal", "invoke JsApi JsApiShowModal failed, current page view is null.");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    m.o((p)localObject);
    localObject = paramJSONObject.optString("title");
    String str1 = paramJSONObject.optString("confirmText", paraml.getContext().getString(s.j.app_ok));
    String str2 = paramJSONObject.optString("cancelText", paraml.getContext().getString(s.j.app_cancel));
    boolean bool = paramJSONObject.optBoolean("showCancel", true);
    int i = f.aQ(paramJSONObject.optString("confirmColor", ""), Color.parseColor("#3CC51F"));
    int j = f.aQ(paramJSONObject.optString("cancelColor", ""), Color.parseColor("#000000"));
    ah.A(new c.1(this, paraml, (String)localObject, paramJSONObject.optString("content"), str1, paramInt, Boolean.valueOf(bool), str2, i, j));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */