package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends i
{
  public String bTi;
  public boolean cdW = true;
  private Map<String, String> lKr = new HashMap();
  public boolean qwj = false;
  public String token;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.lKr.put("session_key", paramString3);
    this.lKr.put("bank_type", paramString4);
    this.lKr.put("name", paramString1);
    this.lKr.put("cre_id", paramString2);
    F(this.lKr);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0) {
      return;
    }
    try
    {
      this.token = paramJSONObject.optString("session_key");
      this.cdW = "1".equals(paramJSONObject.getString("need_bind"));
      this.qwj = "1".equals(paramJSONObject.getString("bank_user"));
      this.bTi = paramJSONObject.optString("mobile_no");
      return;
    }
    catch (JSONException paramString)
    {
      x.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", paramString, "", new Object[0]);
    }
  }
  
  public final int aBO()
  {
    return 64;
  }
  
  public final boolean bkT()
  {
    super.bkT();
    this.lKr.put("retry", "1");
    F(this.lKr);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */