package com.tencent.mm.plugin.appbrand.jsapi.base;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b
  extends d
{
  private void a(c paramc, int paramInt, p paramp, JSONObject paramJSONObject)
  {
    for (;;)
    {
      try
      {
        int i = k(paramJSONObject);
        View localView = paramp.agU().lx(i);
        if (!paramp.agU().lw(i)) {
          break label175;
        }
        boolean bool2 = paramp.agU().lt(i);
        bool1 = bool2;
        if (bool2) {
          bool1 = b(paramp, i, localView, paramJSONObject);
        }
        if (bool1) {
          paramp.agU().ly(i);
        }
        x.i("MicroMsg.BaseRemoveViewJsApi", "remove view(parentId : %s, viewId : %s, r : %s)", new Object[] { Integer.valueOf(paramJSONObject.optInt("parentId", 0)), Integer.valueOf(i), Boolean.valueOf(bool1) });
        if (bool1)
        {
          paramp = "ok";
          paramc.E(paramInt, f(paramp, null));
          return;
        }
      }
      catch (JSONException paramp)
      {
        x.e("MicroMsg.BaseRemoveViewJsApi", "get viewId error. exception : %s", new Object[] { paramp });
        paramc.E(paramInt, f("fail:view id do not exist", null));
        return;
      }
      paramp = "fail";
      continue;
      label175:
      boolean bool1 = false;
    }
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    super.a(paraml, paramJSONObject, paramInt);
    p localp = d(paraml);
    if (localp == null)
    {
      x.w("MicroMsg.BaseRemoveViewJsApi", "Remove view failed, AppBrandPageView is null.");
      paraml.E(paramInt, f("fail:page is null", null));
      return;
    }
    a(paraml, paramInt, localp, paramJSONObject);
  }
  
  public void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    super.a(paramp, paramJSONObject, paramInt);
    a(paramp, paramInt, paramp, paramJSONObject);
  }
  
  public boolean b(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/base/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */