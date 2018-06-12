package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.b.a.a;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class aa
  extends a
{
  public int hUw = 0;
  public int mxB;
  public String mxv = "";
  public String myC = "";
  public int myD;
  
  public aa(double paramDouble, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    x.i("MicroMsg.NetSceneTenpayh5Pay", "NetSceneTenpayh5Pay create");
    HashMap localHashMap = new HashMap();
    try
    {
      localHashMap.put("transfer_amount", Math.round(100.0D * paramDouble));
      localHashMap.put("pay_nickname", URLEncoder.encode(paramString1, "utf-8"));
      localHashMap.put("rcvd_username", paramString2);
      localHashMap.put("rcvd_nickname", URLEncoder.encode(paramString3, "utf-8"));
      localHashMap.put("reason", URLEncoder.encode(bi.aG(paramString4, ""), "utf-8"));
      localHashMap.put("currency", String.valueOf(paramInt));
      F(localHashMap);
      return;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        x.e("MicroMsg.NetSceneTenpayh5Pay", "error " + paramString1.getMessage());
      }
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.NetSceneTenpayh5Pay", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      x.i("MicroMsg.NetSceneTenpayh5Pay", "NetSceneTenpayh5Pay request error");
      return;
    }
    paramString = new StringBuffer();
    this.mxv = paramJSONObject.optString("payurl");
    this.myC = paramJSONObject.optString("tradeurl");
    this.mxB = paramJSONObject.optInt("transfering_num");
    this.myD = paramJSONObject.optInt("transfering_type");
    paramString.append("payurl:" + this.mxv);
    paramString.append(" tradeurl:" + this.myC);
    paramString.append(" transfering_num:" + this.mxB);
    paramString.append(" transfering_type:" + this.myD);
    x.i("MicroMsg.NetSceneTenpayh5Pay", "resp " + paramString.toString());
  }
  
  public final String aBL()
  {
    return "/cgi-bin/mmpay-bin/h5requesttransfer";
  }
  
  public final int aBM()
  {
    return 1;
  }
  
  public final int getType()
  {
    return 1622;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */