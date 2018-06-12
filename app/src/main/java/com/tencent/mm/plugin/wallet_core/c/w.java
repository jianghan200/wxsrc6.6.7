package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.wallet_core.tenpay.model.i;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class w
  extends i
{
  public String pjE;
  
  public w(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("check_pwd_scene", String.valueOf(paramInt));
    localHashMap.put("package", URLEncoder.encode(paramString2));
    localHashMap.put("sign", paramString3);
    localHashMap.put("sign_type", paramString4);
    localHashMap.put("busi_id", paramString5);
    F(localHashMap);
  }
  
  public w(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, String paramString6, String paramString7)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("check_pwd_scene", String.valueOf(paramInt1));
    localHashMap.put("package", URLEncoder.encode(paramString2));
    localHashMap.put("sign", paramString3);
    localHashMap.put("sign_type", paramString4);
    localHashMap.put("busi_id", paramString5);
    localHashMap.put("use_touch", String.valueOf(paramInt2));
    F(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("soter_req", paramString6);
    paramString1.put("fingerData", paramString7);
    aC(paramString1);
  }
  
  public final int If()
  {
    return 2704;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.pjE = paramJSONObject.optString("usertoken", "");
  }
  
  public final int aBO()
  {
    return 2704;
  }
  
  public final boolean bOn()
  {
    return true;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/getpaypwdtoken";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */