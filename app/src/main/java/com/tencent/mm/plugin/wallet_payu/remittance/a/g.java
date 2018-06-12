package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends a
{
  public g(String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("receiver_user_name", paramString1);
    localHashMap.put("transfer_qrcode_id", paramString2);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("MicroMsg.NetScenePayURemittanceSendCancelMsg", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0) {}
  }
  
  public final int bOo()
  {
    return 27;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/remittance/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */