package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h
  extends i
{
  public h(String paramString1, String paramString2, String paramString3, Profession paramProfession)
  {
    x.d("MicroMsg.NetSceneTenpaySetUserExInfo", "country: %s, province: %s, city: %s", new Object[] { paramString1, paramString2, paramString3 });
    HashMap localHashMap = new HashMap();
    if (!bi.oW(paramString1)) {
      localHashMap.put("user_country", paramString1);
    }
    if (!bi.oW(paramString2)) {
      localHashMap.put("user_province", paramString2);
    }
    if (!bi.oW(paramString3)) {
      localHashMap.put("user_city", paramString3);
    }
    if (paramProfession != null)
    {
      x.d("MicroMsg.NetSceneTenpaySetUserExInfo", "name: %s, type: %s", new Object[] { paramProfession.pkT, Integer.valueOf(paramProfession.pkU) });
      localHashMap.put("profession_name", paramProfession.pkT);
      localHashMap.put("profession_type", String.valueOf(paramProfession.pkU));
    }
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1978;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.NetSceneTenpaySetUserExInfo", "errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
  }
  
  public final int aBO()
  {
    return 1978;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/setuserexinfo";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */