package com.tencent.mm.plugin.appbrand.game.d.a;

import android.text.Editable;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.widget.input.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.widget.f;
import org.json.JSONObject;

public final class e
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 1;
  private static final String NAME = "showKeyboard";
  final c fCp = new c();
  final a fCq = new a();
  final b fCr = new b();
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    String str = paramJSONObject.optString("defaultValue");
    int j = paramJSONObject.optInt("maxLength", 140);
    int i = j;
    if (j <= 0) {
      i = Integer.MAX_VALUE;
    }
    ah.A(new e.1(this, paraml, str, i, paramJSONObject.optBoolean("multiple", false), paramJSONObject.optBoolean("confirmHold", false), com.tencent.mm.plugin.appbrand.widget.input.c.b.wj(paramJSONObject.optString("confirmType")), paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/d/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */