package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.b.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class p
  extends a
{
  public p(String paramString1, String paramString2, int paramInt1, long paramLong, int paramInt2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("recv_username", paramString1);
    localHashMap.put("qrcodeid", paramString2);
    localHashMap.put("currency", String.valueOf(paramInt1));
    localHashMap.put("amount", String.valueOf(paramLong));
    localHashMap.put("set_amount", String.valueOf(paramInt2));
    F(localHashMap);
    x.i("MicroMsg.NetSceneH5F2fTransferCancelPay", "qrcodeId: %s, currency: %s", new Object[] { paramString2, Integer.valueOf(paramInt1) });
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("MicroMsg.NetSceneH5F2fTransferCancelPay", "json: %s", new Object[] { paramJSONObject.toString() });
    x.i("MicroMsg.NetSceneH5F2fTransferCancelPay", "errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
  }
  
  public final String aBL()
  {
    return "/cgi-bin/mmpay-bin/h5f2ftransfercancelpay";
  }
  
  public final int aBM()
  {
    return 1257;
  }
  
  public final int getType()
  {
    return 1257;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */