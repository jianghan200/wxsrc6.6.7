package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import android.net.Uri;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class al
  extends a
{
  public static final int CTRL_INDEX = 102;
  public static final String NAME = "makePhoneCall";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optString("phoneNumber");
    if (bi.oW(paramJSONObject))
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    MMActivity localMMActivity = c(paraml);
    if (localMMActivity == null)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    localMMActivity.geJ = new al.1(this, paraml, paramInt);
    Intent localIntent = new Intent("android.intent.action.DIAL");
    localIntent.setData(Uri.parse("tel:" + Uri.encode(paramJSONObject)));
    try
    {
      localMMActivity.startActivityForResult(localIntent, hashCode() & 0xFFFF);
      return;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.JsApiMakePhoneCall", "startActivity failed");
      paraml.E(paramInt, f("fail", null));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */