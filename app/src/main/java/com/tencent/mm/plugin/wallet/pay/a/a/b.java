package com.tencent.mm.plugin.wallet.pay.a.a;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.tenpay.model.j;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class b
  extends j
{
  private Map<String, String> lKr;
  private Map<String, String> peZ;
  public boolean pfa = false;
  public Orders pfb = null;
  public Authen pfc;
  public String pfd = null;
  public String pfe = null;
  private String pff = null;
  public int pfg = 0;
  public String pfh;
  public int pfi = 0;
  public String token = null;
  
  public b(Authen paramAuthen, Orders paramOrders)
  {
    this(paramAuthen, paramOrders, false);
  }
  
  public b(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    this(paramAuthen, paramOrders, paramBoolean, (byte)0);
  }
  
  private b(Authen paramAuthen, Orders paramOrders, boolean paramBoolean, byte paramByte)
  {
    this.pfc = paramAuthen;
    this.pfb = paramOrders;
    if (paramAuthen == null) {
      throw new IllegalArgumentException("authen == null");
    }
    List localList = paramOrders.ppf;
    if (localList.size() > 0) {
      str = ((Orders.Commodity)localList.get(0)).bOe;
    }
    a(paramOrders.bOd, str, paramAuthen.mpb.bVY, paramAuthen.mpb.bVU, paramAuthen.lMV, paramAuthen.lMW);
    if (paramAuthen.mpb == null) {
      throw new IllegalArgumentException("authen.payInfo == null");
    }
    x.i("MicroMsg.NetSceneTenpayAuthen", "pay channel :" + paramAuthen.mpb.bVU);
    this.lKr = new HashMap();
    this.peZ = new HashMap();
    boolean bool;
    if ((!paramBoolean) && (!bi.oW(this.pfc.pli)))
    {
      bool = true;
      x.i("MicroMsg.NetSceneTenpayAuthen", "hy: has pwd: %b", new Object[] { Boolean.valueOf(bool) });
      a(paramAuthen.mpb, this.lKr, this.peZ, bool);
      if (!paramBoolean) {
        break label638;
      }
      this.lKr.put("brief_reg", "1");
      label276:
      this.ppo = paramOrders.ppo;
      this.lKr.put("default_favorcomposedid", paramAuthen.plt);
      this.lKr.put("favorcomposedid", paramAuthen.plu);
      this.lKr.put("arrive_type", paramAuthen.plq);
      this.lKr.put("sms_flag", paramAuthen.plv);
      this.lKr.put("ban_sms_bind_serial", paramAuthen.plw);
      this.lKr.put("ban_sms_bank_type", paramAuthen.plx);
      this.lKr.put("busi_sms_flag", paramAuthen.ply);
      this.lKr.put("buttontype", paramAuthen.mpb.qUR);
      this.lKr.put("mobile_area", paramAuthen.plz);
      x.i("MicroMsg.NetSceneTenpayAuthen", "buttontype %s not_support_retry %s, mobile area: %s", new Object[] { Integer.valueOf(paramAuthen.mpb.qUR), Integer.valueOf(this.ppo), paramAuthen.plz });
      switch (paramAuthen.bWA)
      {
      }
    }
    for (;;)
    {
      Q(this.lKr);
      F(this.lKr);
      paramAuthen = ((k)g.l(k.class)).aNs();
      if (paramAuthen != null) {
        this.peZ.putAll(paramAuthen);
      }
      if (p.cDb())
      {
        this.peZ.put("uuid_for_bindcard", p.cDd());
        this.peZ.put("bindcard_scene", p.cDc());
      }
      aC(this.peZ);
      return;
      bool = false;
      break;
      label638:
      this.lKr.put("passwd", paramAuthen.pli);
      break label276;
      this.lKr.put("flag", "1");
      this.lKr.put("bank_type", paramAuthen.lMV);
      this.lKr.put("true_name", paramAuthen.plj);
      this.lKr.put("identify_card", paramAuthen.plk);
      if (paramAuthen.pll > 0) {
        this.lKr.put("cre_type", paramAuthen.pll);
      }
      this.lKr.put("mobile_no", paramAuthen.pjw);
      this.lKr.put("bank_card_id", paramAuthen.plm);
      if (!bi.oW(paramAuthen.pln)) {
        this.lKr.put("cvv2", paramAuthen.pln);
      }
      if (!bi.oW(paramAuthen.plo))
      {
        this.lKr.put("valid_thru", paramAuthen.plo);
        continue;
        this.lKr.put("flag", "2");
        this.lKr.put("bank_type", paramAuthen.lMV);
        this.lKr.put("h_bind_serial", paramAuthen.lMW);
        this.lKr.put("card_tail", paramAuthen.plp);
        if (!bi.oW(paramAuthen.plj)) {
          this.lKr.put("true_name", paramAuthen.plj);
        }
        if (!bi.oW(paramAuthen.plk)) {
          this.lKr.put("identify_card", paramAuthen.plk);
        }
        this.lKr.put("cre_type", paramAuthen.pll);
        this.lKr.put("mobile_no", paramAuthen.pjw);
        this.lKr.put("bank_card_id", paramAuthen.plm);
        if (!bi.oW(paramAuthen.pln)) {
          this.lKr.put("cvv2", paramAuthen.pln);
        }
        if (!bi.oW(paramAuthen.plo))
        {
          this.lKr.put("valid_thru", paramAuthen.plo);
          continue;
          if (paramAuthen.plh == 1)
          {
            this.lKr.put("reset_flag", "1");
            if (!bi.oW(paramAuthen.pjw)) {
              this.lKr.put("mobile_no", paramAuthen.pjw);
            }
            if (!bi.oW(paramAuthen.pln)) {
              this.lKr.put("cvv2", paramAuthen.pln);
            }
            if (!bi.oW(paramAuthen.plo)) {
              this.lKr.put("valid_thru", paramAuthen.plo);
            }
          }
          this.lKr.put("flag", "3");
          this.lKr.put("bank_type", paramAuthen.lMV);
          this.lKr.put("bind_serial", paramAuthen.lMW);
          continue;
          this.lKr.put("flag", "4");
          this.lKr.put("bank_type", paramAuthen.lMV);
          this.lKr.put("first_name", paramAuthen.plr);
          this.lKr.put("last_name", paramAuthen.pls);
          this.lKr.put("country", paramAuthen.country);
          this.lKr.put("area", paramAuthen.csK);
          this.lKr.put("city", paramAuthen.csL);
          this.lKr.put("address", paramAuthen.dRH);
          this.lKr.put("phone_number", paramAuthen.knG);
          this.lKr.put("zip_code", paramAuthen.eXM);
          this.lKr.put("email", paramAuthen.csD);
          this.lKr.put("bank_card_id", paramAuthen.plm);
          if (!bi.oW(paramAuthen.pln)) {
            this.lKr.put("cvv2", paramAuthen.pln);
          }
          if (!bi.oW(paramAuthen.plo))
          {
            this.lKr.put("valid_thru", paramAuthen.plo);
            continue;
            this.lKr.put("flag", "5");
            this.lKr.put("bank_type", paramAuthen.lMV);
            this.lKr.put("first_name", paramAuthen.plr);
            this.lKr.put("last_name", paramAuthen.pls);
            this.lKr.put("country", paramAuthen.country);
            this.lKr.put("area", paramAuthen.csK);
            this.lKr.put("city", paramAuthen.csL);
            this.lKr.put("address", paramAuthen.dRH);
            this.lKr.put("phone_number", paramAuthen.knG);
            this.lKr.put("zip_code", paramAuthen.eXM);
            this.lKr.put("email", paramAuthen.csD);
            this.lKr.put("bank_card_id", paramAuthen.plm);
            if (!bi.oW(paramAuthen.pln)) {
              this.lKr.put("cvv2", paramAuthen.pln);
            }
            if (!bi.oW(paramAuthen.plo)) {
              this.lKr.put("valid_thru", paramAuthen.plo);
            }
            this.lKr.put("h_bind_serial", paramAuthen.lMW);
            this.lKr.put("card_tail", paramAuthen.plp);
            continue;
            if (paramAuthen.plh == 1)
            {
              this.lKr.put("reset_flag", "1");
              if (!bi.oW(paramAuthen.pln)) {
                this.lKr.put("cvv2", paramAuthen.pln);
              }
              if (!bi.oW(paramAuthen.plo)) {
                this.lKr.put("valid_thru", paramAuthen.plo);
              }
            }
            this.lKr.put("phone_number", paramAuthen.pjw);
            this.lKr.put("flag", "6");
            this.lKr.put("bank_type", paramAuthen.lMV);
            this.lKr.put("bind_serial", paramAuthen.lMW);
          }
        }
      }
    }
  }
  
  public int If()
  {
    if (this.pfc.mpb.bVY == 11) {
      return 1610;
    }
    if (this.pfc.mpb.bVY == 21) {
      return 1605;
    }
    return 461;
  }
  
  protected void Q(Map<String, String> paramMap) {}
  
  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    super.a(paramInt, paramString, paramJSONObject);
    x.i("MicroMsg.NetSceneTenpayAuthen", " errCode: " + paramInt + " errMsg :" + paramString);
    x.d("MicroMsg.NetSceneTenpayAuthen", "banlance_mobile: %s", new Object[] { this.pfd });
    this.pfa = "1".equals(paramJSONObject.optString("is_free_sms"));
    this.token = paramJSONObject.optString("token");
    this.pfd = paramJSONObject.optString("balance_mobile");
    this.pfe = paramJSONObject.optString("balance_help_url");
    this.pff = paramJSONObject.optString("modify_mobile_url");
    paramString = paramJSONObject.optString("bind_serial");
    if (!bi.oW(paramString)) {
      x.i("MicroMsg.NetSceneTenpayAuthen", "Pay Success! saving bind_serial:" + paramString);
    }
    if ("1".equals(paramJSONObject.optString("pay_flag")))
    {
      this.pgm = true;
      this.pfb = Orders.a(paramJSONObject, this.pfb);
    }
    for (;;)
    {
      paramString = paramJSONObject.optJSONObject("verify_cre_tail_info");
      if (paramString != null)
      {
        this.pfg = paramString.optInt("is_can_verify_tail", 0);
        this.pfh = paramString.optString("verify_tail_wording");
      }
      this.pfi = paramJSONObject.optInt("no_reset_mobile", 0);
      x.i("MicroMsg.NetSceneTenpayAuthen", "pay_scene:" + this.pfc.mpb.bVY);
      if ((paramInt != 0) || (this.pfc.mpb.bVY != 39)) {
        break;
      }
      x.i("MicroMsg.NetSceneTenpayAuthen", "it's the sns scene, parse the sns pay data");
      com.tencent.mm.plugin.wallet_core.e.b.am(paramJSONObject);
      return;
      this.pgm = false;
    }
    x.i("MicroMsg.NetSceneTenpayAuthen", "it's not the sns scene or occurs error,  errCode:" + paramInt);
  }
  
  public int aBO()
  {
    return 0;
  }
  
  public final boolean bNu()
  {
    return this.pfc.mpb.pxN == 1;
  }
  
  public final boolean bNv()
  {
    return (this.pfc.mpb.bVY == 11) || (this.pfc.mpb.bVY == 21);
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
  
  public String getUri()
  {
    if (this.pfc.mpb.bVY == 11) {
      return "/cgi-bin/mmpay-bin/tenpay/saveauthen";
    }
    if (this.pfc.mpb.bVY == 21) {
      return "/cgi-bin/mmpay-bin/tenpay/fetchauthen";
    }
    return "/cgi-bin/mmpay-bin/tenpay/authen";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */