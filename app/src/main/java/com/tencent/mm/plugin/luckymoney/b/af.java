package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.sdk.platformtools.bi;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class af
  extends ab
{
  public String kLZ;
  public String kRq;
  public String kRr;
  
  public af(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, String paramString6, String paramString7, int paramInt3)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("amount", String.valueOf(paramInt1));
    localHashMap.put("wishing", URLEncoder.encode(bi.oV(paramString1)));
    localHashMap.put("sendUserName", paramString4);
    if (!bi.oW(paramString3)) {
      localHashMap.put("username", paramString3);
    }
    if (!bi.oW(paramString2)) {
      localHashMap.put("headImg", URLEncoder.encode(paramString2));
    }
    if (!bi.oW(paramString5)) {
      localHashMap.put("nickName", URLEncoder.encode(bi.oV(paramString5)));
    }
    localHashMap.put("inWay", String.valueOf(paramInt2));
    localHashMap.put("imageId", paramString6);
    localHashMap.put("imageAesKey", paramString7);
    localHashMap.put("imageLength", String.valueOf(paramInt3));
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.kLZ = paramJSONObject.optString("sendId");
    this.kRq = paramJSONObject.optString("reqkey");
    this.kRr = paramJSONObject.optString("sendMsgXml");
  }
  
  public final String aBL()
  {
    return "/cgi-bin/mmpay-bin/yearrequestwxhb";
  }
  
  public final int getType()
  {
    return 1643;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */