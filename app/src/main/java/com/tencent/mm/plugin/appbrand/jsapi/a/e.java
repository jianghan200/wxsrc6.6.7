package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.content.Intent;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends a
{
  public static final int CTRL_INDEX = 402;
  public static final String NAME = "openRealnameAuth";
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiOpenRealnameAuth", "getIDCardInfo data is null");
      paramp.E(paramInt, f("fail:data is null", null));
      return;
    }
    MMActivity localMMActivity = (MMActivity)paramp.mContext;
    if (localMMActivity == null)
    {
      paramp.E(paramInt, f("fail", null));
      x.e("MicroMsg.JsApiOpenRealnameAuth", "mmActivity is null, invoke fail!");
      return;
    }
    String str1 = paramJSONObject.optString("categoryId", "");
    if (bi.oW(str1))
    {
      x.e("MicroMsg.JsApiOpenRealnameAuth", "category_id is null");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(40003));
      paramp.E(paramInt, f("fail:category_id is empty", paramJSONObject));
      return;
    }
    String str2 = paramp.mAppId;
    int i = paramJSONObject.optInt("authType", 1);
    x.i("MicroMsg.JsApiOpenRealnameAuth", "getIDCardInfo category_id:%s, appId:%s, authType:%d", new Object[] { str1, str2, Integer.valueOf(i) });
    paramJSONObject = new Intent(localMMActivity, AppBrandIDCardUI.class);
    paramJSONObject.putExtra("intent_appid", str2);
    paramJSONObject.putExtra("intent_category_id", str1);
    paramJSONObject.putExtra("intent_auth_type", i);
    localMMActivity.geJ = new e.1(this, paramp, paramInt);
    localMMActivity.startActivityForResult(paramJSONObject, 1);
    h.mEJ.h(14943, new Object[] { str2, Integer.valueOf(1), "" });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */