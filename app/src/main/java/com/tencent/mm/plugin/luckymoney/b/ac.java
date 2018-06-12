package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.sdk.platformtools.bi;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ac
  extends ab
{
  public String kLf;
  public String kPS;
  
  public ac(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.kPS = paramString3;
    this.kLf = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("sendId", paramString1);
    localHashMap.put("receiveId", paramString3);
    localHashMap.put("wishing", URLEncoder.encode(bi.oV(paramString2)));
    localHashMap.put("ver", paramString4);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject) {}
  
  public final String aBL()
  {
    return "/cgi-bin/mmpay-bin/wishwxhb";
  }
  
  public final int getType()
  {
    return 1682;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */