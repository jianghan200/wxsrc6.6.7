package com.tencent.mm.plugin.appbrand.jsapi.lbs;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.r.c;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

public final class e
  extends a
{
  public static final int CTRL_INDEX = 38;
  public static final String NAME = "openLocation";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    int i = 0;
    try
    {
      f1 = bi.getFloat(paramJSONObject.optString("latitude"), 0.0F);
      f2 = bi.getFloat(paramJSONObject.optString("longitude"), 0.0F);
      localObject = c.vS(paramJSONObject.optString("name"));
      str = c.vS(paramJSONObject.optString("address"));
    }
    catch (Exception paramJSONObject)
    {
      float f1;
      float f2;
      Object localObject;
      String str;
      int j;
      label65:
      paraml.E(paramInt, f("invalid_coordinate", null));
      return;
    }
    try
    {
      j = bi.getInt(paramJSONObject.optString("scale"), 0);
      i = j;
    }
    catch (Exception paramJSONObject)
    {
      break label65;
    }
    paramJSONObject = new Intent();
    paramJSONObject.putExtra("map_view_type", 7);
    paramJSONObject.putExtra("kwebmap_slat", f1);
    paramJSONObject.putExtra("kwebmap_lng", f2);
    if (i > 0) {
      paramJSONObject.putExtra("kwebmap_scale", i);
    }
    paramJSONObject.putExtra("kPoiName", (String)localObject);
    paramJSONObject.putExtra("Kwebmap_locaion", str);
    localObject = c(paraml);
    if (localObject == null)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    d.b((Context)localObject, "location", ".ui.RedirectUI", paramJSONObject);
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/lbs/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */