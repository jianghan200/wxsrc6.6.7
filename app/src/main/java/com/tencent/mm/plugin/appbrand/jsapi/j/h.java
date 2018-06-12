package com.tencent.mm.plugin.appbrand.jsapi.j;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONObject;

final class h
  extends c
{
  final void u(JSONObject paramJSONObject)
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray("array");
    int j = paramJSONObject.optInt("current", 0);
    if ((localJSONArray == null) || (localJSONArray.length() <= 0))
    {
      x.i("MicroMsg.AppBrand.JsApi.OptionsPickerHandler", "showPickerView as selector, empty range");
      h("ok", null);
      com.tencent.mm.plugin.appbrand.r.c.runOnUiThread(new h.1(this));
      return;
    }
    paramJSONObject = new String[localJSONArray.length()];
    int i = 0;
    try
    {
      while (i < localJSONArray.length())
      {
        paramJSONObject[i] = localJSONArray.getString(i);
        i += 1;
      }
      com.tencent.mm.plugin.appbrand.r.c.runOnUiThread(new h.2(this, paramJSONObject, j));
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.AppBrand.JsApi.OptionsPickerHandler", "opt data.array, exp = %s", new Object[] { bi.i(paramJSONObject) });
      h("fail", null);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/j/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */