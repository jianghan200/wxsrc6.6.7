package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.b.a.a;
import com.tencent.mm.wallet_core.c.d;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class q
  extends a
  implements d
{
  public String mxv;
  
  public q(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("amount", String.valueOf(paramLong));
    localHashMap.put("recv_username", paramString1);
    localHashMap.put("recv_nickname", paramString2);
    localHashMap.put("qrcodeid", paramString5);
    try
    {
      if (!bi.oW(paramString3)) {
        localHashMap.put("desc", URLEncoder.encode(paramString3, "UTF-8"));
      }
      if (!bi.oW(paramString4)) {
        localHashMap.put("message", URLEncoder.encode(paramString4, "UTF-8"));
      }
    }
    catch (UnsupportedEncodingException paramString5)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferPay", paramString5, "", new Object[0]);
      }
    }
    localHashMap.put("currency", String.valueOf(paramInt1));
    localHashMap.put("set_amount", String.valueOf(paramInt2));
    F(localHashMap);
    x.i("MicroMsg.NetSceneH5F2fTransferPay", "username: %s, nickname: %s, amount: %s, desc: %s, msg: %s, currency: %s", new Object[] { paramString1, paramString2, Long.valueOf(paramLong), paramString3, paramString4, Integer.valueOf(paramInt1) });
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.mxv = paramJSONObject.optString("payurl", "");
    x.i("MicroMsg.NetSceneH5F2fTransferPay", "payurl: %s", new Object[] { this.mxv });
  }
  
  public final String aBL()
  {
    return "/cgi-bin/mmpay-bin/h5f2ftransferpay";
  }
  
  public final int aBM()
  {
    return 1529;
  }
  
  public final int getType()
  {
    return 1529;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */