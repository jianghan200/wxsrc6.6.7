package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.os.Vibrator;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class bx
  extends a
{
  public static final int CTRL_INDEX = 230;
  public static final String NAME = "vibrateShort";
  
  private static void cy(Context paramContext)
  {
    paramContext = (Vibrator)paramContext.getSystemService("vibrator");
    if (paramContext == null) {
      return;
    }
    paramContext.vibrate(15L);
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.d("MicroMsg.JsApiVibrateShort", "JsApiVibrateShort services!");
    cy(paraml.getContext());
    paraml.E(paramInt, f("ok", null));
  }
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    x.d("MicroMsg.JsApiVibrateShort", "JsApiVibrateShort!");
    cy(paramp.mContext);
    paramp.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */