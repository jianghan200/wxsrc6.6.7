package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends i
{
  public String bVX = null;
  
  public g(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("verify_code", paramString1);
    localHashMap.put("session_key", paramString2);
    localHashMap.put("passwd", paramString3);
    localHashMap.put("bind_serialno", paramString4);
    localHashMap.put("bank_type", paramString5);
    F(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("banktype", paramString5);
    aC(paramString1);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0) {
      return;
    }
    this.bVX = paramJSONObject.optString("app_username");
  }
  
  public final int aBO()
  {
    return 65;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */