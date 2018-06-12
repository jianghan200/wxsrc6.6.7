package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.b.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class z
  extends a
{
  public int hUw = 0;
  public String hUy;
  public String hUz;
  public String myA = "";
  public String myB = "";
  
  public z(int paramInt)
  {
    x.i("MicroMsg.NetSceneTenpayh5Index", "NetSceneTenpayh5Index create");
    HashMap localHashMap = new HashMap();
    localHashMap.put("wallet_type", String.valueOf(paramInt));
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.NetSceneTenpayh5Index", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      x.i("MicroMsg.NetSceneTenpayh5Index", "NetSceneTransferChargeQuery request error");
      return;
    }
    paramString = new StringBuffer();
    this.hUw = paramJSONObject.optInt("currency");
    this.myA = paramJSONObject.optString("currencyUint");
    this.myB = paramJSONObject.optString("currencyWording");
    this.hUy = paramJSONObject.optString("notice");
    this.hUz = paramJSONObject.optString("notice_url");
    paramString.append("currency:" + this.hUw);
    paramString.append(" currencyuint:" + this.myA);
    paramString.append(" currencywording:" + this.myB);
    paramString.append(" notice:" + this.hUy);
    paramString.append(" notice_url:" + this.hUz);
    x.i("MicroMsg.NetSceneTenpayh5Index", "resp " + paramString.toString());
  }
  
  public final String aBL()
  {
    return "/cgi-bin/mmpay-bin/h5transferoperate";
  }
  
  public final int aBM()
  {
    return 0;
  }
  
  public final int getType()
  {
    return 1574;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */