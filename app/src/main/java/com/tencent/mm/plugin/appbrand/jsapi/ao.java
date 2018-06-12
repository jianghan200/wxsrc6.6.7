package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class ao
  extends a
{
  public static final int CTRL_INDEX = 62;
  public static final String NAME = "openAddress";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = new Intent();
    paramJSONObject.putExtra("req_app_id", paraml.mAppId);
    paramJSONObject.putExtra("launch_from_appbrand", true);
    MMActivity localMMActivity = c(paraml);
    if (localMMActivity == null)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    localMMActivity.geJ = new ao.1(this, paraml, paramInt);
    d.a(localMMActivity, "address", ".ui.WalletSelectAddrUI", paramJSONObject, hashCode() & 0xFFFF, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */