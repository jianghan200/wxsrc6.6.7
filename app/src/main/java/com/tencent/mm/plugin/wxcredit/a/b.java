package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends i
{
  public String name;
  public String qwk;
  public boolean qwl = true;
  public String token;
  
  public b(String paramString1, int paramInt, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("bank_type", paramString2);
    localHashMap.put("check_pwd_scene", String.valueOf(paramInt));
    F(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("check_pwd_scene", String.valueOf(paramInt));
    aC(paramString1);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0) {
      return;
    }
    this.token = paramJSONObject.optString("session_key");
    if ("1".equals(paramJSONObject.optString("all_info")))
    {
      this.qwl = false;
      return;
    }
    this.qwl = true;
    this.name = paramJSONObject.optString("name");
    this.qwk = paramJSONObject.optString("cre_id");
  }
  
  public final int aBO()
  {
    return 63;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */