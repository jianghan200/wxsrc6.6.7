package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.model.q;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ah
  extends ab
{
  public ah(String paramString1, String paramString2, String paramString3)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("username", paramString1);
    localHashMap.put("sendId", paramString2);
    localHashMap.put("channelId", "1");
    localHashMap.put("ver", paramString3);
    localHashMap.put("sendUserName", q.GF());
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject) {}
  
  public final String aBL()
  {
    return "/cgi-bin/mmpay-bin/sharewxhb";
  }
  
  public final int getType()
  {
    return 1668;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */