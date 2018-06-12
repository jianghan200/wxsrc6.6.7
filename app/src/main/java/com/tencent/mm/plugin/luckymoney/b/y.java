package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class y
  extends ab
{
  public String hUK;
  
  public y(int paramInt1, long paramLong1, long paramLong2, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt3)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("totalNum", String.valueOf(paramInt1));
    localHashMap.put("totalAmount", String.valueOf(paramLong1));
    localHashMap.put("perValue", String.valueOf(paramLong2));
    localHashMap.put("hbType", String.valueOf(paramInt2));
    localHashMap.put("wishing", URLEncoder.encode(bi.oV(paramString1)));
    localHashMap.put("currency", String.valueOf(paramInt3));
    if (!bi.oW(paramString3)) {
      localHashMap.put("headImg", URLEncoder.encode(paramString3));
    }
    localHashMap.put("nickName", URLEncoder.encode(bi.oV(paramString4)));
    if (!bi.oW(paramString2)) {
      localHashMap.put("username", URLEncoder.encode(paramString2));
    }
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.NetSceneLuckyMoneyH5Request", "NetSceneLuckyMoneyH5Request response errCode=" + paramInt);
    if (paramInt == 0) {
      this.hUK = paramJSONObject.optString("payUrl");
    }
  }
  
  public final String aBL()
  {
    return "/cgi-bin/mmpay-bin/h5requestwxhb";
  }
  
  public final int aBM()
  {
    return 0;
  }
  
  public final int getType()
  {
    return 1645;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */