package com.tencent.mm.plugin.luckymoney.sns.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends i
{
  public int kTD = 0;
  
  public a(int paramInt, String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("flag", String.valueOf(paramInt));
    localHashMap.put("passwd", paramString1);
    localHashMap.put("req_key", paramString2);
    this.kTD = paramInt;
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1697;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.NetSceneSnsPayManage", " errCode: " + paramInt + " errMsg :" + paramString);
    if (paramInt == 0)
    {
      if (this.kTD == 1)
      {
        com.tencent.mm.plugin.luckymoney.sns.b.a.si(1);
        x.i("MicroMsg.NetSceneSnsPayManage", "onGYNetEnd() setIsOpenSnsPay with 1");
        return;
      }
      com.tencent.mm.plugin.luckymoney.sns.b.a.si(0);
      x.i("MicroMsg.NetSceneSnsPayManage", "onGYNetEnd() setIsOpenSnsPay with 0");
      return;
    }
    x.e("MicroMsg.NetSceneSnsPayManage", "onGYNetEnd() NetSceneSnsPayManage is false!");
  }
  
  public final int aBO()
  {
    return 1697;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/snspaymanage";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/sns/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */