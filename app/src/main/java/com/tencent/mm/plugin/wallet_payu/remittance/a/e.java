package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends a
{
  public String desc;
  public double hUL;
  public String myb;
  public String myc;
  public int scene;
  public int timestamp;
  public String username;
  
  public e(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("transfer_url", paramString);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("MicroMsg.NetScenePayURemittanceGetUsername", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0) {
      return;
    }
    this.username = paramJSONObject.optString("user_name");
    this.myb = paramJSONObject.optString("true_name");
    this.hUL = (paramJSONObject.optDouble("fee") / 100.0D);
    this.desc = paramJSONObject.optString("desc");
    this.scene = paramJSONObject.optInt("scene");
    this.myc = paramJSONObject.optString("transfer_qrcode_id");
    this.timestamp = paramJSONObject.optInt("time_stamp");
  }
  
  public final int bOo()
  {
    return 24;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/remittance/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */