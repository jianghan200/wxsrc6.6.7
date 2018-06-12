package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.plugin.wallet_core.d.f;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class l
  extends i
{
  public l()
  {
    F(new HashMap());
  }
  
  public final int If()
  {
    return 1631;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneQueryUserWallet", "errCode is : " + paramInt);
    if (paramInt == 0)
    {
      o.bOZ().diF.fV("WalletKindInfo", "delete from WalletKindInfo");
      if (paramJSONObject != null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneQueryUserWallet", "resp json " + paramJSONObject.toString());
        paramString = paramJSONObject.optJSONArray("UserWalletInfoList");
        if (paramString != null)
        {
          int i = paramString.length();
          paramInt = 0;
          while (paramInt < i)
          {
            paramJSONObject = com.tencent.mm.plugin.wallet_core.model.x.ak(paramString.optJSONObject(paramInt));
            if (paramJSONObject != null) {
              o.bOZ().b(paramJSONObject);
            }
            paramInt += 1;
          }
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneQueryUserWallet", "wallet array is null");
      }
    }
    else
    {
      return;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneQueryUserWallet", "response json is null");
  }
  
  public final int aBO()
  {
    return 1631;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/queryuserwallet";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */