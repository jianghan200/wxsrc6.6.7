package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.wallet_core.tenpay.model.i;
import org.json.JSONObject;

public final class e
  extends i
{
  public String pkH;
  public String pkI;
  public String pkJ;
  public String pkK;
  public int pkL;
  public long pkM;
  public String title;
  
  public final int If()
  {
    return 1614;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneRealnameGetDuty", "errCode=" + paramInt + ";errMsg=" + paramString);
    if ((paramInt == 0) && (paramJSONObject != null))
    {
      this.pkH = paramJSONObject.optString("agreed_flag", "0");
      this.title = paramJSONObject.optString("title", "");
      this.pkI = paramJSONObject.optString("service_protocol_wording", "");
      this.pkJ = paramJSONObject.optString("service_protocol_url", "");
      this.pkK = paramJSONObject.optString("button_wording", "");
      this.pkM = paramJSONObject.optLong("delay_expired_time", 0L);
      if (this.pkM > 0L)
      {
        g.Ek();
        g.Ei().DT().a(aa.a.sTd, Long.valueOf(System.currentTimeMillis() + this.pkM * 1000L));
      }
    }
  }
  
  public final int aBO()
  {
    return 1614;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/realnamegetduty";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */