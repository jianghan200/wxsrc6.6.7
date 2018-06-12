package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends i
{
  public String pkN;
  public String pkO;
  public String pkP;
  public String pkQ;
  public String pkR;
  
  public f(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("channel", "1");
    F(localHashMap);
    this.pkR = paramString;
  }
  
  public final int If()
  {
    return 1630;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if ((paramInt == 0) && (paramJSONObject != null))
    {
      this.pkN = paramJSONObject.optString("guide_flag");
      this.pkO = paramJSONObject.optString("guide_wording");
      this.pkP = paramJSONObject.optString("left_button_wording");
      this.pkQ = paramJSONObject.optString("right_button_wording");
    }
  }
  
  public final int aBO()
  {
    return 1630;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/realnameguidequery";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */