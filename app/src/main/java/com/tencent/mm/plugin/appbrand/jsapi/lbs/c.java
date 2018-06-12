package com.tencent.mm.plugin.appbrand.jsapi.lbs;

import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class c
  extends a
{
  public static final int CTRL_INDEX = 103;
  public static final String NAME = "chooseLocation";
  int fFw = 0;
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = new Intent();
    paramJSONObject.putExtra("map_view_type", 8);
    MMActivity localMMActivity = c(paraml);
    if (localMMActivity == null)
    {
      paraml.E(paramInt, f("fail", null));
      x.e("MicroMsg.JsApiChooseLocation", "mmActivity is null, invoke fail!");
      return;
    }
    this.fFw = paramInt;
    localMMActivity.geJ = new c.1(this, paraml);
    d.b(localMMActivity, "location", ".ui.RedirectUI", paramJSONObject, 1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/lbs/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */