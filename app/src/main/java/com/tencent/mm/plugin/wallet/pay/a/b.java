package com.tencent.mm.plugin.wallet.pay.a;

import android.content.Context;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.d;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends i
{
  public String desc;
  public String lNV;
  public double mxP;
  
  public b(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("token", paramString);
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1603;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    com.tencent.mm.plugin.wallet_core.model.ad localad;
    if (paramInt == 0)
    {
      this.lNV = paramJSONObject.optString("fee_type");
      this.mxP = (paramJSONObject.optDouble("total_fee") / 100.0D);
      paramString = paramJSONObject.optJSONArray("Array");
      if ((paramString != null) && (paramString.length() > 0)) {
        this.desc = ((JSONObject)paramString.opt(0)).optString("desc");
      }
      localad = o.bOX();
      paramJSONObject = paramJSONObject.optJSONObject("bindqueryresp");
      localad.prv.clear();
      if (paramJSONObject == null) {
        x.e("MicroMsg.WalletRepaymentBankcardMgr", "parse from json error,json is null");
      }
    }
    else
    {
      return;
    }
    JSONArray localJSONArray = paramJSONObject.optJSONArray("Array");
    if ((localJSONArray == null) || (localJSONArray.length() <= 0))
    {
      x.e("MicroMsg.WalletRepaymentBankcardMgr", "repayment bankcard list is null");
      paramString = paramJSONObject.optJSONObject("user_info");
      if (paramString != null) {
        localad.prw = paramString.optString("last_card_bind_serialno");
      }
    }
    else
    {
      paramInt = 0;
      while (paramInt < localJSONArray.length())
      {
        d locald = d.bOx();
        try
        {
          paramString = (JSONObject)localJSONArray.get(paramInt);
          if (paramString != null)
          {
            paramString = locald.ae(paramString);
            if (paramString.bOs())
            {
              paramString.field_desc = paramString.field_bankName;
              localad.prv.add(paramString);
            }
          }
          else
          {
            paramInt += 1;
          }
        }
        catch (JSONException paramString)
        {
          for (;;)
          {
            x.printErrStackTrace("MicroMsg.WalletRepaymentBankcardMgr", paramString, "", new Object[0]);
            paramString = null;
            continue;
            if (paramString.bOu()) {
              paramString.field_desc = com.tencent.mm.sdk.platformtools.ad.getContext().getString(a.i.wallet_credit_card_desc, new Object[] { paramString.field_bankName, paramString.field_bankcardTail });
            } else if (paramString.bOr()) {
              paramString.field_desc = com.tencent.mm.sdk.platformtools.ad.getContext().getString(a.i.wallet_wxcredit_card_desc, new Object[] { paramString.field_bankName, paramString.field_bankcardTail });
            } else {
              paramString.field_desc = com.tencent.mm.sdk.platformtools.ad.getContext().getString(a.i.wallet_deposit_card_desc, new Object[] { paramString.field_bankName, paramString.field_bankcardTail });
            }
          }
        }
      }
    }
    x.e("MicroMsg.WalletRepaymentBankcardMgr", "user_info is null");
  }
  
  public final int aBO()
  {
    return 123;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/webankloanordershow";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */