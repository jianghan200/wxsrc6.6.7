package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class s
  extends i
{
  public String pju;
  public int pjv;
  public String pjw;
  public String pjx;
  
  public s(String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("token", paramString1);
    localHashMap.put("use_touch", "1");
    F(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("soter_req", paramString2);
    aC(paramString1);
  }
  
  public s(String paramString1, String paramString2, byte paramByte)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("token", paramString2);
    F(localHashMap);
    aC(new HashMap());
  }
  
  public s(String paramString1, String paramString2, char paramChar)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("token", paramString2);
    localHashMap.put("resend", "1");
    F(localHashMap);
    aC(new HashMap());
  }
  
  public final int If()
  {
    return 1515;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("Micromsg.NetSceneTenpayCheckPwdByToken", "errCode " + paramInt + " errMsg: " + paramString);
    this.pju = paramJSONObject.optString("usertoken");
    this.pjv = paramJSONObject.optInt("is_free_sms");
    this.pjw = paramJSONObject.optString("mobile_no");
    this.pjx = paramJSONObject.optString("relation_key");
  }
  
  public final int aBO()
  {
    return 100;
  }
  
  public final boolean bOk()
  {
    return this.pjv == 0;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/getusertoken";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */