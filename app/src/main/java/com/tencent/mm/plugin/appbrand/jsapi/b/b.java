package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.view.View;
import com.tencent.mm.plugin.appbrand.canvas.widget.a;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.base.f;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONObject;

public class b
  extends c
{
  public static final int CTRL_INDEX = 69;
  public static final String NAME = "drawCanvas";
  
  protected final boolean a(p paramp, int paramInt, View paramView, JSONObject paramJSONObject, f paramf)
  {
    if (!(paramView instanceof CoverViewContainer))
    {
      x.i("MicroMsg.JsApiDrawCanvas", "drawCanvas failed, view is not a instance of CoverViewContainer.(%s)", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    Object localObject = ((CoverViewContainer)paramView).A(View.class);
    x.d("MicroMsg.JsApiDrawCanvas", "drawCanvas(id : %s)", new Object[] { Integer.valueOf(paramInt) });
    if (!(localObject instanceof a))
    {
      x.i("MicroMsg.JsApiDrawCanvas", "drawCanvas failed, view is not a instance of AppBrandDrawableView.(%s)", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    long l = System.currentTimeMillis();
    JSONArray localJSONArray = paramJSONObject.optJSONArray("actions");
    boolean bool = paramJSONObject.optBoolean("reserve");
    localObject = (a)localObject;
    if (bool) {
      ((a)localObject).b(localJSONArray, new b.1(this, paramf));
    }
    for (;;)
    {
      ((a)localObject).adk();
      x.v("MicroMsg.JsApiDrawCanvas", "post drawCanvas cost : %sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      return super.a(paramp, paramInt, paramView, paramJSONObject, paramf);
      ((a)localObject).a(localJSONArray, new b.2(this, paramf));
    }
  }
  
  protected final boolean aik()
  {
    return true;
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.getInt("canvasId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */