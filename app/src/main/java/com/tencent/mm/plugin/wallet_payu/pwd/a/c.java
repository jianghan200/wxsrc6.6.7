package com.tencent.mm.plugin.wallet_payu.pwd.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends a
{
  public String token = "";
  
  public c(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("pin", paramString);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("MicroMsg.NetScenePayUCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    this.token = paramJSONObject.optString("payu_reference");
  }
  
  public final int bOo()
  {
    return 3;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/pwd/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */