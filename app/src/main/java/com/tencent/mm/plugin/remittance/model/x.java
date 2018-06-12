package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class x
  extends i
{
  public double hUL;
  public boolean klL;
  public String lNV;
  public int lOD;
  public String lOt;
  private String myq = null;
  public int myr;
  private String mys;
  public String myt;
  public int myu;
  public String myv;
  public String myw;
  public int myx;
  public String myy;
  public String myz;
  public int status;
  
  public x(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    this.myq = paramString1;
    this.lOD = paramInt1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("transfer_id", paramString2);
    localHashMap.put("trans_id", paramString1);
    localHashMap.put("invalid_time", String.valueOf(paramInt2));
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1628;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    com.tencent.mm.sdk.platformtools.x.d("Micromsg.NetSceneTenpayRemittanceQuery", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0) {
      return;
    }
    this.myr = paramJSONObject.optInt("pay_time");
    this.hUL = (paramJSONObject.optDouble("fee") / 100.0D);
    this.lNV = paramJSONObject.optString("fee_type");
    this.status = paramJSONObject.optInt("trans_status");
    this.mys = paramJSONObject.optString("trans_status_name");
    this.myu = paramJSONObject.optInt("modify_time");
    this.klL = paramJSONObject.optBoolean("is_payer");
    this.lOt = paramJSONObject.optString("refund_bank_type");
    this.myv = paramJSONObject.optString("status_desc");
    this.myw = paramJSONObject.optString("status_supplementary");
    this.myx = paramJSONObject.optInt("delay_confirm_flag");
    this.myy = paramJSONObject.optString("banner_content");
    this.myz = paramJSONObject.optString("banner_url");
  }
  
  public final int aBO()
  {
    return 0;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/transferquery";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */