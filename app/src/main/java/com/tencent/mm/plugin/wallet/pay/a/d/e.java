package com.tencent.mm.plugin.wallet.pay.a.d;

import com.tencent.mm.plugin.wallet_core.e.b;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.j;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class e
  extends j
{
  private int myU = -1;
  public Orders pfb = null;
  protected com.tencent.mm.plugin.wallet_core.model.p pfq;
  
  public e(com.tencent.mm.plugin.wallet_core.model.p paramp, Orders paramOrders)
  {
    this.pfb = paramOrders;
    this.pfq = paramp;
    List localList = paramOrders.ppf;
    if (localList.size() > 0) {
      localObject = ((Orders.Commodity)localList.get(0)).bOe;
    }
    if (paramp.mpb == null)
    {
      x.e("MicroMsg.NetSceneTenpayPayVertify", "empty payInfo");
      return;
    }
    this.myU = paramp.mpb.bVY;
    int i = paramp.mpb.bVU;
    a(paramOrders.bOd, (String)localObject, paramp.mpb.bVY, i, paramp.lMV, paramp.lMW);
    paramOrders = new HashMap();
    localObject = new HashMap();
    paramOrders.put("flag", paramp.flag);
    paramOrders.put("passwd", paramp.eJn);
    boolean bool;
    if (!bi.oW(paramp.eJn))
    {
      bool = true;
      x.i("MicroMsg.NetSceneTenpayPayVertify", "hy: has pwd: %b", new Object[] { Boolean.valueOf(bool) });
      a(paramp.mpb, paramOrders, (Map)localObject, bool);
      paramOrders.put("verify_type", paramp.bVC);
      if (paramp.bVC != 0) {
        break label399;
      }
      paramOrders.put("verify_code", paramp.pqM);
    }
    for (;;)
    {
      paramOrders.put("token", paramp.token);
      paramOrders.put("bank_type", paramp.lMV);
      paramOrders.put("bind_serial", paramp.lMW);
      paramOrders.put("arrive_type", paramp.plq);
      paramOrders.put("default_favorcomposedid", paramp.plt);
      paramOrders.put("favorcomposedid", paramp.plu);
      Q(paramOrders);
      if (com.tencent.mm.wallet_core.c.p.cDb())
      {
        ((Map)localObject).put("uuid_for_bindcard", com.tencent.mm.wallet_core.c.p.cDd());
        ((Map)localObject).put("bindcard_scene", com.tencent.mm.wallet_core.c.p.cDc());
      }
      F(paramOrders);
      aC((Map)localObject);
      return;
      bool = false;
      break;
      label399:
      paramOrders.put("cre_tail", paramp.pqO);
      paramOrders.put("cre_type", paramp.pqP);
    }
  }
  
  public int If()
  {
    if (this.myU == 11) {
      return 1607;
    }
    if (this.myU == 21) {
      return 1606;
    }
    return 462;
  }
  
  protected void Q(Map<String, String> paramMap) {}
  
  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    super.a(paramInt, paramString, paramJSONObject);
    if (paramInt != 0) {
      return;
    }
    paramString = paramJSONObject.optString("bind_serial");
    x.d("MicroMsg.NetSceneTenpayPayVertify", "Pay Success! saving bind_serial:" + paramString);
    if ("1".equals(paramJSONObject.optString("pay_flag")))
    {
      this.pgm = true;
      this.pfb = Orders.a(paramJSONObject, this.pfb);
    }
    for (;;)
    {
      x.i("MicroMsg.NetSceneTenpayPayVertify", "mPayScene:" + this.myU);
      if (this.myU != 39) {
        break;
      }
      x.i("MicroMsg.NetSceneTenpayPayVertify", "it's the sns scene, parse the sns pay data");
      b.am(paramJSONObject);
      return;
      this.pgm = false;
    }
    x.i("MicroMsg.NetSceneTenpayPayVertify", "it's not the sns scene");
  }
  
  public int aBO()
  {
    return 1;
  }
  
  public final boolean bNv()
  {
    return (this.myU == 11) || (this.myU == 21);
  }
  
  public String getUri()
  {
    if (this.myU == 11) {
      return "/cgi-bin/mmpay-bin/tenpay/saveverify";
    }
    if (this.myU == 21) {
      return "/cgi-bin/mmpay-bin/tenpay/fetchverify";
    }
    return "/cgi-bin/mmpay-bin/tenpay/verify";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/a/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */