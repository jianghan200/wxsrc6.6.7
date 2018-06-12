package com.tencent.mm.plugin.appbrand.jsapi.base;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public abstract class c
  extends d
{
  private void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, int paramInt, p paramp, JSONObject paramJSONObject)
  {
    ah.A(new c.1(this, paramp, paramc, paramInt, paramJSONObject));
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    super.a(paraml, paramJSONObject, paramInt);
    p localp = d(paraml);
    if (localp == null)
    {
      x.w("MicroMsg.BaseUpdateViewJsApi", "invoke JsApi updateView failed, current page view is null.");
      paraml.E(paramInt, f("fail:page is null", null));
      return;
    }
    a(paraml, paramInt, localp, paramJSONObject);
  }
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    super.a(paramp, paramJSONObject, paramInt);
    a(paramp, paramInt, paramp, paramJSONObject);
  }
  
  public boolean a(p paramp, int paramInt, View paramView, JSONObject paramJSONObject, f paramf)
  {
    return true;
  }
  
  public boolean aii()
  {
    return false;
  }
  
  public boolean aik()
  {
    return false;
  }
  
  public boolean c(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/base/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */