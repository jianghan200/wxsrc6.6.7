package com.tencent.mm.plugin.wallet_core.b.a;

import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.d;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends i
  implements d
{
  public BindCardOrder piW;
  
  public b(com.tencent.mm.plugin.wallet_core.model.p paramp)
  {
    this(paramp, -1);
  }
  
  public b(com.tencent.mm.plugin.wallet_core.model.p paramp, int paramInt)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("flag", paramp.flag);
    localHashMap1.put("passwd", paramp.eJn);
    localHashMap1.put("verify_code", paramp.pqM);
    localHashMap1.put("token", paramp.token);
    if (paramp.pqN) {}
    for (String str = "1";; str = "0")
    {
      localHashMap1.put("bind_flag", str);
      if (paramInt > 0)
      {
        localHashMap1.put("realname_scene", String.valueOf(paramInt));
        x.i("MicroMsg.NetSenceTenPayBase", "realname_scene=%d", new Object[] { Integer.valueOf(paramInt) });
      }
      if (!bi.oW(paramp.lMV)) {
        localHashMap1.put("bank_type", paramp.lMV);
      }
      if (com.tencent.mm.wallet_core.c.p.cDb())
      {
        localHashMap2.put("uuid_for_bindcard", com.tencent.mm.wallet_core.c.p.cDd());
        localHashMap2.put("bindcard_scene", com.tencent.mm.wallet_core.c.p.cDc());
      }
      a(paramp.mpb, localHashMap1, localHashMap2);
      F(localHashMap1);
      aC(localHashMap2);
      return;
    }
  }
  
  public final int If()
  {
    return 475;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.piW = new BindCardOrder();
    this.piW.af(paramJSONObject);
  }
  
  public final int aBO()
  {
    return 17;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/bindverifyreg";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */