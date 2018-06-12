package com.tencent.mm.plugin.wallet_core.b.a;

import com.tencent.mm.a.o;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends i
{
  private Map<String, String> lKr = new HashMap();
  private Map<String, String> peZ = new HashMap();
  public String pfn = null;
  public String token = null;
  
  public a(Authen paramAuthen)
  {
    a(paramAuthen.mpb, this.lKr, this.peZ);
    this.lKr.put("flag", paramAuthen.bWA);
    this.lKr.put("bank_type", paramAuthen.lMV);
    this.lKr.put("mobile_area", paramAuthen.plz);
    if (!bi.oW(paramAuthen.pli)) {
      this.lKr.put("passwd", paramAuthen.pli);
    }
    if (!bi.oW(paramAuthen.token)) {
      this.lKr.put("token", paramAuthen.token);
    }
    if (!bi.oW(paramAuthen.pcx))
    {
      g.Ek();
      o localo = new o(bi.a((Integer)g.Ei().DT().get(9, null), 0));
      this.lKr.put("import_code", paramAuthen.pcx);
      this.lKr.put("qqid", localo.toString());
      if (paramAuthen.pll > 0) {
        this.lKr.put("cre_type", paramAuthen.pll);
      }
      this.lKr.put("bind_serailno", paramAuthen.lMW);
    }
    if (!bi.oW(paramAuthen.plr))
    {
      this.lKr.put("first_name", paramAuthen.plr);
      this.lKr.put("last_name", paramAuthen.pls);
      this.lKr.put("country", paramAuthen.country);
      this.lKr.put("area", paramAuthen.csK);
      this.lKr.put("city", paramAuthen.csL);
      this.lKr.put("address", paramAuthen.dRH);
      this.lKr.put("phone_number", paramAuthen.knG);
      this.lKr.put("zip_code", paramAuthen.eXM);
      this.lKr.put("email", paramAuthen.csD);
      this.lKr.put("language", w.chP());
    }
    if (!bi.oW(paramAuthen.plj)) {
      this.lKr.put("true_name", paramAuthen.plj);
    }
    if (!bi.oW(paramAuthen.plk)) {
      this.lKr.put("identify_card", paramAuthen.plk);
    }
    if (paramAuthen.pll > 0) {
      this.lKr.put("cre_type", paramAuthen.pll);
    }
    if (!bi.oW(paramAuthen.pjw)) {
      this.lKr.put("mobile_no", paramAuthen.pjw);
    }
    this.lKr.put("bank_card_id", paramAuthen.plm);
    if (!bi.oW(paramAuthen.pln)) {
      this.lKr.put("cvv2", paramAuthen.pln);
    }
    if (!bi.oW(paramAuthen.plo)) {
      this.lKr.put("valid_thru", paramAuthen.plo);
    }
    if (p.cDb())
    {
      this.peZ.put("uuid_for_bindcard", p.cDd());
      this.peZ.put("bindcard_scene", p.cDc());
    }
    F(this.lKr);
    aC(this.peZ);
  }
  
  public final int If()
  {
    return 471;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject != null)
    {
      this.pfn = paramJSONObject.optString("req_key");
      this.token = paramJSONObject.optString("token");
    }
  }
  
  public final int aBO()
  {
    return 12;
  }
  
  public final boolean bkT()
  {
    super.bkT();
    this.lKr.put("is_repeat_send", "1");
    F(this.lKr);
    return true;
  }
  
  public final String blM()
  {
    return this.token;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/bindauthen";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */