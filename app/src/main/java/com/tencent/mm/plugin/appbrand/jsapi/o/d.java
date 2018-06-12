package com.tencent.mm.plugin.appbrand.jsapi.o;

import android.view.View;
import com.tencent.mm.plugin.appbrand.q.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
{
  public static void a(View paramView, JSONObject paramJSONObject)
  {
    int k = 1;
    if ((paramView == null) || (paramJSONObject == null)) {
      return;
    }
    int i = f.vO(paramJSONObject.optString("bgColor"));
    int j = f.vO(paramJSONObject.optString("borderColor"));
    float f1 = f.a(paramJSONObject, "borderRadius", 0.0F);
    float f2 = f.a(paramJSONObject, "borderWidth", 0.0F);
    Object localObject;
    if ((paramView instanceof e))
    {
      localObject = (e)paramView;
      ((e)localObject).setBgColor(i);
      ((e)localObject).setBorderColor(j);
      ((e)localObject).setBorderRadius(f1);
      ((e)localObject).setBorderWidth(f2);
    }
    for (j = 1;; j = 0)
    {
      try
      {
        f1 = (float)paramJSONObject.getDouble("opacity");
        i = j;
        if (f1 >= 0.0F)
        {
          i = j;
          if (f1 <= 1.0F)
          {
            paramView.setAlpha(f1);
            i = 1;
          }
        }
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          int m;
          int n;
          float f3;
          i = j;
        }
      }
      localObject = paramJSONObject.optJSONArray("padding");
      if ((localObject != null) && (((JSONArray)localObject).length() == 4))
      {
        j = f.a((JSONArray)localObject, 0);
        m = f.a((JSONArray)localObject, 1);
        n = f.a((JSONArray)localObject, 2);
        paramView.setPadding(f.a((JSONArray)localObject, 3), j, m, n);
      }
      f1 = (float)paramJSONObject.optDouble("rotate", 0.0D);
      f2 = (float)paramJSONObject.optDouble("scaleX", 1.0D);
      f3 = (float)paramJSONObject.optDouble("scaleY", 1.0D);
      if (paramJSONObject.has("rotate"))
      {
        paramView.setRotation(f1);
        i = 1;
      }
      if (paramJSONObject.has("scaleX"))
      {
        paramView.setScaleX(f2);
        i = 1;
      }
      if (paramJSONObject.has("scaleY"))
      {
        paramView.setScaleY(f3);
        i = k;
        if (i == 0) {
          break;
        }
        paramView.invalidate();
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/o/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */