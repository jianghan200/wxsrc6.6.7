package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.o.a;
import com.tencent.mm.plugin.appbrand.jsapi.o.d;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.widget.b;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class i
  extends c
{
  private static final int CTRL_INDEX = 254;
  public static final String NAME = "updateImageView";
  
  protected final boolean c(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    x.d("MicroMsg.JsApiUpdateImageView", "onUpdateView(viewId : %s, %s)", new Object[] { Integer.valueOf(paramInt), paramJSONObject });
    if (!(paramView instanceof CoverViewContainer))
    {
      x.w("MicroMsg.JsApiUpdateImageView", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    b localb = (b)((CoverViewContainer)paramView).A(b.class);
    if (localb == null)
    {
      x.w("MicroMsg.JsApiUpdateImageView", "the target view(%s) is null", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    d.a(paramView, paramJSONObject.optJSONObject("style"));
    a.a(paramp, localb, paramJSONObject);
    return super.c(paramp, paramInt, paramView, paramJSONObject);
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.getInt("viewId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/coverview/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */