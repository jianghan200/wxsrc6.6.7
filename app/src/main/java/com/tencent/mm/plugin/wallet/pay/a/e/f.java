package com.tencent.mm.plugin.wallet.pay.a.e;

import com.tencent.mm.plugin.wallet_core.e.b;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.j;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class f
  extends j
{
  private int myU = -1;
  public Orders pfb = null;
  
  public f(p paramp, Orders paramOrders)
  {
    this.pfb = paramOrders;
    if (paramp.mpb != null)
    {
      this.myU = paramp.mpb.bVY;
      i = paramp.mpb.bVU;
    }
    List localList = paramOrders.ppf;
    if (localList.size() > 0) {
      localObject = ((Orders.Commodity)localList.get(0)).bOe;
    }
    a(paramOrders.bOd, (String)localObject, this.myU, i, paramp.lMV, paramp.lMW);
    paramOrders = new HashMap();
    localObject = new HashMap();
    if (!bi.oW(paramp.eJn)) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.NetSceneTenpayVertifyReg", "hy: has pwd: %b", new Object[] { Boolean.valueOf(bool) });
      a(paramp.mpb, paramOrders, (Map)localObject, bool);
      paramOrders.put("flag", paramp.flag);
      paramOrders.put("passwd", paramp.eJn);
      paramOrders.put("verify_code", paramp.pqM);
      paramOrders.put("token", paramp.token);
      paramOrders.put("favorcomposedid", paramp.plu);
      paramOrders.put("default_favorcomposedid", paramp.plt);
      F(paramOrders);
      aC((Map)localObject);
      return;
    }
  }
  
  public int If()
  {
    if (this.myU == 11) {
      return 1684;
    }
    if (this.myU == 21) {
      return 1608;
    }
    return 474;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    super.a(paramInt, paramString, paramJSONObject);
    if (paramInt != 0) {
      return;
    }
    paramString = paramJSONObject.optString("bind_serial");
    x.d("MicroMsg.NetSceneTenpayVertifyReg", "Pay Success! saving bind_serial:" + paramString);
    if ("1".equals(paramJSONObject.optString("pay_flag")))
    {
      this.pgm = true;
      this.pfb = Orders.a(paramJSONObject, this.pfb);
    }
    for (;;)
    {
      x.i("MicroMsg.NetSceneTenpayVertifyReg", "mPayScene:" + this.myU);
      if (this.myU != 39) {
        break;
      }
      x.i("MicroMsg.NetSceneTenpayVertifyReg", "it's the sns scene, parse the sns pay data");
      b.am(paramJSONObject);
      return;
      this.pgm = false;
    }
    x.i("MicroMsg.NetSceneTenpayVertifyReg", "it's not the sns scene");
  }
  
  public final int aBO()
  {
    return 16;
  }
  
  public final boolean bNv()
  {
    return (this.myU == 11) || (this.myU == 21);
  }
  
  public String getUri()
  {
    if (this.myU == 11) {
      return "/cgi-bin/mmpay-bin/tenpay/saveverifyreg";
    }
    if (this.myU == 21) {
      return "/cgi-bin/mmpay-bin/tenpay/fetchverifyreg";
    }
    return "/cgi-bin/mmpay-bin/tenpay/verifyreg";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/a/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */