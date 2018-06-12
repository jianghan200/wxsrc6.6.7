package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class r
  extends i
{
  public String pjt;
  private int scene;
  public String token;
  
  public r(String paramString1, int paramInt, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("req_key", paramString2);
    if (paramInt == 6) {
      localHashMap.put("time_stamp", System.currentTimeMillis());
    }
    F(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("check_pwd_scene", String.valueOf(paramInt));
    if (p.cDb())
    {
      paramString1.put("uuid_for_bindcard", p.cDd());
      paramString1.put("bindcard_scene", p.cDc());
    }
    aC(paramString1);
    this.scene = paramInt;
  }
  
  public final int If()
  {
    return 476;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if ((this.scene == 6) || (this.scene == 8) || (this.scene == 18))
    {
      this.token = paramJSONObject.optString("usertoken");
      this.pjt = paramJSONObject.optString("token_type");
    }
  }
  
  public final int aBO()
  {
    return 18;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/checkpwd";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */