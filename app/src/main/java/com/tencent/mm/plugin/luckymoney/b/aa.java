package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class aa
  extends ab
{
  public aa(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("sendId", paramString1);
    localHashMap.put("offset", String.valueOf(paramInt2));
    localHashMap.put("type", String.valueOf(paramInt1));
    localHashMap.put("receiveId", paramString2);
    localHashMap.put("ver", paramString3);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("NetSceneLuckyMoneyMyRecordDelete", "onGYNetEnd");
  }
  
  public final String aBL()
  {
    return "/cgi-bin/mmpay-bin/deletelistwxhb";
  }
  
  public final int getType()
  {
    return 1612;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */