package com.tencent.mm.plugin.appbrand.jsapi.k;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.widget.input.l.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class d
  extends a
{
  private static final int CTRL_INDEX = 105;
  private static final String NAME = "showToast";
  al eVk;
  View fXP;
  l.a fXQ = null;
  
  private void kQ(int paramInt)
  {
    LinearLayout localLinearLayout = (LinearLayout)this.fXP.findViewById(s.g.show_toast_view_container);
    LinearLayout.LayoutParams localLayoutParams2 = (LinearLayout.LayoutParams)localLinearLayout.getLayoutParams();
    LinearLayout.LayoutParams localLayoutParams1 = localLayoutParams2;
    if (localLayoutParams2 == null)
    {
      x.w("MicroMsg.JsApiShowToast", "layoutParams is null");
      localLayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
    }
    localLayoutParams1.bottomMargin = paramInt;
    localLinearLayout.setLayoutParams(localLayoutParams1);
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    boolean bool1 = true;
    p localp = d(paraml);
    if (localp == null)
    {
      x.w("MicroMsg.JsApiShowToast", "invoke JsApi JsApiShowToast failed, current page view is null.");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    x.i("MicroMsg.JsApiShowToast", "showToast:%s", new Object[] { paramJSONObject });
    int i = paramJSONObject.optInt("duration", 1500);
    String str1 = paramJSONObject.optString("title");
    String str2 = paramJSONObject.optString("icon", "success");
    String str3 = paramJSONObject.optString("image");
    boolean bool2 = paramJSONObject.optBoolean("mask");
    if ((bi.oW(str2)) && (bi.oW(str3))) {}
    for (;;)
    {
      if (this.fXQ == null) {
        this.fXQ = new d.1(this, paraml);
      }
      ah.A(new d.2(this, bool1, localp, paraml, i, paramInt, bool2, str2, str3, str1));
      return;
      bool1 = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/k/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */