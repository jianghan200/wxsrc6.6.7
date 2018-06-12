package com.tencent.mm.plugin.appbrand.jsapi.e;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.f;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 424;
  private static final String NAME = "openRedPacket";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    if (paramJSONObject == null)
    {
      x.i("MicroMsg.JsApiOpenRedPacket", "data is null");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(-1));
      paraml.E(paramInt, f("fail:system error {{data is null}}", paramJSONObject));
      return;
    }
    if (bi.oW(paramJSONObject.optString("redPacketId", null)))
    {
      x.i("MicroMsg.JsApiOpenRedPacket", "redPacketId is nil");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(-1));
      paraml.E(paramInt, f("fail:system error {{redPacketId is nil}}", paramJSONObject));
      return;
    }
    p localp = d(paraml);
    if (localp != null)
    {
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("needPortraitSnapshot", true);
      localp.a(2, localBundle, new Object[0]);
      new a(this, paraml, localp, paramJSONObject, paramInt).run();
      return;
    }
    x.i("MicroMsg.JsApiOpenRedPacket", "associated page view is null!!");
    paramJSONObject = new HashMap();
    paramJSONObject.put("errCode", Integer.valueOf(-1));
    paraml.E(paramInt, f("fail:system error {{associated page view is null}}", paramJSONObject));
  }
  
  public static final class a
    extends f
  {
    public a(e parame, l paraml, p paramp, JSONObject paramJSONObject, int paramInt)
    {
      super(paraml, paramp, paramJSONObject, paramInt);
    }
    
    protected final boolean a(MMActivity paramMMActivity, JSONObject paramJSONObject, int paramInt)
    {
      String str = ahK().mAppId;
      paramJSONObject = paramJSONObject.optString("redPacketId", null);
      if ((bi.oW(str)) || (bi.oW(paramJSONObject)))
      {
        x.i("MicroMsg.JsApiOpenRedPacket", "GetLuckMoneyRequest.launch appId = [%s] sendId = [%s]", new Object[] { str, paramJSONObject });
        return false;
      }
      ((com.tencent.mm.plugin.luckymoney.appbrand.a)g.l(com.tencent.mm.plugin.luckymoney.appbrand.a.class)).a(paramMMActivity, paramJSONObject, str, paramInt);
      return true;
    }
    
    protected final void onError(int paramInt, String paramString)
    {
      x.i("MicroMsg.JsApiOpenRedPacket", "onError errCode: %d,errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
      HashMap localHashMap = new HashMap();
      localHashMap.put("errCode", Integer.valueOf(paramInt));
      g(paramString, localHashMap);
    }
    
    protected final void u(Intent paramIntent)
    {
      x.i("MicroMsg.JsApiOpenRedPacket", "GetLuckMoneyRequest.onResult");
      paramIntent = new HashMap();
      paramIntent.put("errCode", Integer.valueOf(0));
      w(paramIntent);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */