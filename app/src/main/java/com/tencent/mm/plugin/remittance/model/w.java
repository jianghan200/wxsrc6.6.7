package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class w
  extends i
{
  public String desc;
  public double hUL;
  public String mxM;
  public String myb;
  public String myc;
  public String myd = "";
  public String mye = "";
  public String myf = "";
  public String myg = "";
  public int myh;
  public String myi = "";
  public String myj = "";
  public int myk;
  public String myl;
  public String mym;
  public int myn;
  public String myo;
  public BusiRemittanceResp myp;
  public int scene;
  public String username;
  
  public w(String paramString, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("transfer_url", URLEncoder.encode(paramString));
    F(localHashMap);
    paramString = new HashMap();
    paramString.put("channel", String.valueOf(paramInt));
    aC(paramString);
  }
  
  public final int If()
  {
    return 1515;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    try
    {
      x.d("Micromsg.NetSceneTenpayRemittanceGetUsername", "errCode " + paramInt + " errMsg: " + paramString);
      if (paramInt != 0) {
        return;
      }
      x.d("Micromsg.NetSceneTenpayRemittanceGetUsername", "json %s", new Object[] { paramJSONObject.toString() });
      this.username = paramJSONObject.optString("user_name", "");
      this.myb = paramJSONObject.optString("true_name");
      this.hUL = (paramJSONObject.optDouble("fee") / 100.0D);
      this.desc = paramJSONObject.optString("desc");
      this.scene = paramJSONObject.optInt("scene");
      this.myc = URLEncoder.encode(paramJSONObject.optString("transfer_qrcode_id"));
      this.myd = paramJSONObject.optString("f2f_pay_desc");
      this.mye = paramJSONObject.optString("rcvr_desc");
      this.myf = paramJSONObject.optString("payer_desc");
      this.myg = paramJSONObject.optString("rcvr_ticket");
      this.myh = paramJSONObject.optInt("busi_type", 0);
      this.myi = paramJSONObject.optString("mch_name");
      this.myj = paramJSONObject.optString("mch_photo");
      this.mym = paramJSONObject.optString("mch_type", "");
      this.myk = paramJSONObject.optInt("mch_time", 0);
      this.myl = paramJSONObject.optString("receiver_openid");
      this.myn = paramJSONObject.optInt("get_pay_wifi");
      this.mxM = paramJSONObject.optString("receiver_true_name");
      this.myo = paramJSONObject.optString("mch_info_string");
      this.myp = new BusiRemittanceResp(paramJSONObject);
      return;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("Micromsg.NetSceneTenpayRemittanceGetUsername", paramString, "", new Object[0]);
    }
  }
  
  public final int aBO()
  {
    return 0;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/transferscanqrcode";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */