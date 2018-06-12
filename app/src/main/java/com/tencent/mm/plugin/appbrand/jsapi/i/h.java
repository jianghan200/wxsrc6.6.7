package com.tencent.mm.plugin.appbrand.jsapi.i;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class h
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 218;
  public static final String NAME = "sendBizRedPacket";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    MMActivity localMMActivity = c(paraml);
    if (localMMActivity == null)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    try
    {
      paramJSONObject.put("appId", paraml.mAppId);
      Object localObject1 = d(paraml);
      if ((localObject1 != null) && ((localObject1 instanceof com.tencent.mm.plugin.appbrand.game.page.d)))
      {
        localObject2 = new Bundle();
        ((Bundle)localObject2).putBoolean("needPortraitSnapshot", true);
        ((p)localObject1).a(2, (Bundle)localObject2, new Object[0]);
      }
      localObject1 = a.fWH;
      Object localObject2 = new h.1(this, paraml, paramInt);
      paraml = new g(paramJSONObject);
      paraml.bJY = 16;
      paramJSONObject = new a.4((a)localObject1, (b.a)localObject2);
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("key_way", 3);
      ((Intent)localObject2).putExtra("appId", paraml.appId);
      ((Intent)localObject2).putExtra("timeStamp", paraml.timeStamp);
      ((Intent)localObject2).putExtra("nonceStr", paraml.nonceStr);
      ((Intent)localObject2).putExtra("packageExt", paraml.packageExt);
      ((Intent)localObject2).putExtra("signtype", paraml.signType);
      ((Intent)localObject2).putExtra("paySignature", paraml.bVW);
      ((Intent)localObject2).putExtra("key_static_from_scene", 100004);
      ((Intent)localObject2).putExtra("url", paraml.url);
      localMMActivity.geJ = paramJSONObject;
      com.tencent.mm.bg.d.a(localMMActivity, "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", (Intent)localObject2, ((a)localObject1).hashCode() & 0xFFFF, false);
      return;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.JsApiSendBizRedPacket", paramJSONObject.getMessage());
      paraml.E(paramInt, f("fail", null));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/i/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */