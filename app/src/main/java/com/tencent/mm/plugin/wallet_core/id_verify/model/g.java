package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g
  extends i
{
  public int pjB;
  public int pjC;
  public Profession[] pkS = null;
  
  public g()
  {
    HashMap localHashMap = new HashMap();
    if (!bi.oW(null)) {
      localHashMap.put("scene", null);
    }
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1976;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    int i = 0;
    x.i("MicroMsg.NetSceneTenpayGetUserExInfo", "errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    x.d("MicroMsg.NetSceneTenpayGetUserExInfo", "json: %s", new Object[] { paramJSONObject.toString() });
    this.pjB = paramJSONObject.optInt("need_area");
    this.pjC = paramJSONObject.optInt("need_profession");
    paramString = paramJSONObject.optJSONArray("array");
    if (paramString != null)
    {
      this.pkS = new Profession[paramString.length()];
      paramInt = i;
      if (paramInt < paramString.length())
      {
        paramJSONObject = paramString.optJSONObject(paramInt);
        if (paramJSONObject != null)
        {
          String str = paramJSONObject.optString("profession_name");
          i = paramJSONObject.optInt("profession_type");
          if (bi.oW(str)) {
            break label156;
          }
          paramJSONObject = new Profession(str, i);
          this.pkS[paramInt] = paramJSONObject;
        }
        for (;;)
        {
          paramInt += 1;
          break;
          label156:
          x.i("MicroMsg.NetSceneTenpayGetUserExInfo", "empty profession_name!");
        }
      }
    }
  }
  
  public final int aBO()
  {
    return 1976;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/getuserexinfo";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */