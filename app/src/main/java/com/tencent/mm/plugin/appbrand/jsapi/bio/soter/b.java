package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 277;
  public static final String NAME = "startSoterAuthentication";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.JsApiStartSoterAuthentication", "hy: JsApiStartSoterAuthentication");
    super.a(paraml, paramJSONObject, paramInt);
    MMActivity localMMActivity = c(paraml);
    if (localMMActivity == null)
    {
      x.e("MicroMsg.JsApiStartSoterAuthentication", "JsApiStartSoterAuthentication context is null, appId is %s", new Object[] { paraml.mAppId });
      paraml.E(paramInt, f("fail", null));
      return;
    }
    JSONArray localJSONArray = paramJSONObject.optJSONArray("requestAuthModes");
    String str = paramJSONObject.optString("challenge");
    paramJSONObject = paramJSONObject.optString("authContent");
    Intent localIntent = new Intent();
    localIntent.putExtra("auth_mode", a.g(localJSONArray));
    localIntent.putExtra("challenge", str);
    localIntent.putExtra("auth_content", paramJSONObject);
    localIntent.putExtra("key_soter_fp_mp_scene", 0);
    localMMActivity.geJ = new b.1(this, paraml, paramInt);
    d.b(localMMActivity, "soter_mp", ".ui.SoterAuthenticationUI", localIntent, 1000);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bio/soter/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */