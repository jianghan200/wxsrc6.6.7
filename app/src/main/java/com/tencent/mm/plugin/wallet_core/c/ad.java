package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import org.json.JSONObject;

public final class ad
  extends i
{
  public double mxI;
  public String mzi;
  public String pjH;
  public double pjI;
  
  public final int If()
  {
    return 1689;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("Micromsg.NetSceneTransferChargeQuery", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      x.i("Micromsg.NetSceneTransferChargeQuery", "NetSceneTransferChargeQuery request error");
      return;
    }
    this.pjH = paramJSONObject.optString("short_desc");
    this.mzi = paramJSONObject.optString("charge_desc");
    this.pjI = paramJSONObject.optDouble("acc_fee");
    this.mxI = (paramJSONObject.optDouble("remain_fee") / 100.0D);
  }
  
  public final int aBO()
  {
    return 0;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/transfergetchargefee";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */