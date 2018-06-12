package com.tencent.mm.plugin.luckymoney.b;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class s
  extends r
{
  public s(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("appId", paramString1);
    localHashMap.put("timeStamp", paramString2);
    localHashMap.put("nonceStr", paramString3);
    if (paramString4 != null) {
      localHashMap.put("package", URLEncoder.encode(paramString4));
    }
    localHashMap.put("signType", paramString5);
    if (paramString6 != null) {
      localHashMap.put("paySign", URLEncoder.encode(paramString6));
    }
    localHashMap.put("way", "3");
    if (paramString7 != null) {
      localHashMap.put("jsapiH5Url", URLEncoder.encode(paramString7));
    }
    F(localHashMap);
  }
  
  public s(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("appId", paramString1);
    localHashMap.put("timeStamp", paramString2);
    localHashMap.put("nonceStr", paramString3);
    if (paramString4 != null) {
      localHashMap.put("package", URLEncoder.encode(paramString4));
    }
    localHashMap.put("signType", paramString5);
    if (paramString6 != null) {
      localHashMap.put("paySign", URLEncoder.encode(paramString6));
    }
    localHashMap.put("way", "4");
    if (paramString7 != null) {
      localHashMap.put("androidSign", URLEncoder.encode(paramString7));
    }
    if (paramString8 != null) {
      localHashMap.put("androidPackage", URLEncoder.encode(paramString8));
    }
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject) {}
  
  public final int aBM()
  {
    return 2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */