package com.tencent.mm.plugin.wallet.bind.a;

import android.content.Context;
import com.tencent.mm.a.o;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.d;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  extends i
{
  public boolean cdV = false;
  public ArrayList<Bankcard> oZG = null;
  public boolean pcu = true;
  public String pcv;
  public String pcw;
  private String pcx;
  public String token;
  
  public c(String paramString, PayInfo paramPayInfo)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    a(paramPayInfo, localHashMap1, localHashMap2);
    g.Ek();
    paramPayInfo = new o(bi.a((Integer)g.Ei().DT().get(9, null), 0));
    this.pcx = paramString;
    localHashMap1.put("import_code", paramString);
    localHashMap1.put("qqid", paramPayInfo.toString());
    F(localHashMap1);
    aC(localHashMap2);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramInt != 0) {
      return;
    }
    this.oZG = new ArrayList();
    for (;;)
    {
      try
      {
        this.cdV = "1".equals(paramJSONObject.optString("is_reg", "0"));
        this.token = paramJSONObject.optString("token", "");
        paramString = paramJSONObject.getJSONArray("Array");
        int j = paramString.length();
        paramInt = 0;
        if (paramInt >= j) {
          break label409;
        }
        JSONObject localJSONObject = paramString.getJSONObject(paramInt);
        paramJSONObject = d.bOx().ae(localJSONObject);
        if (paramJSONObject == null) {
          break label452;
        }
        if (2 != localJSONObject.optInt("bank_acc_type", 2)) {
          break label459;
        }
        i = 1;
        if (i != 0) {
          paramJSONObject.field_cardType |= Bankcard.plJ;
        }
        paramJSONObject.field_bankcardTail = localJSONObject.optString("bank_tail");
        paramJSONObject.plR = ("************" + paramJSONObject.field_bankcardTail);
        paramJSONObject.field_trueName = localJSONObject.optString("true_name");
        paramJSONObject.plQ = localJSONObject.optString("cre_id");
        paramJSONObject.pll = localJSONObject.optInt("cre_type", -1);
        paramJSONObject.pmb = this.pcx;
        if (1 != localJSONObject.optInt("samecardexist", 0)) {
          break label465;
        }
        bool = true;
        paramJSONObject.btA = bool;
        if (paramJSONObject.bOs())
        {
          paramJSONObject.field_desc = paramJSONObject.field_bankName;
          localJSONObject = localJSONObject.optJSONObject("bankappservice");
          if (localJSONObject != null)
          {
            this.pcv = localJSONObject.optString("username");
            this.pcw = localJSONObject.optString("app_recommend_desc");
          }
          this.oZG.add(paramJSONObject);
          break label452;
        }
        if (paramJSONObject.bOu())
        {
          paramJSONObject.field_desc = ad.getContext().getString(a.i.wallet_credit_card_desc, new Object[] { paramJSONObject.field_bankName, paramJSONObject.field_bankcardTail });
          continue;
        }
        if (!paramJSONObject.bOr()) {
          break label375;
        }
      }
      catch (JSONException paramString)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneTenpayQueryBindBankcard", paramString, "", new Object[0]);
        return;
      }
      paramJSONObject.field_desc = ad.getContext().getString(a.i.wallet_wxcredit_card_desc, new Object[] { paramJSONObject.field_bankName, paramJSONObject.field_bankcardTail });
      continue;
      label375:
      paramJSONObject.field_desc = ad.getContext().getString(a.i.wallet_deposit_card_desc, new Object[] { paramJSONObject.field_bankName, paramJSONObject.field_bankcardTail });
      continue;
      label409:
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneTenpayQueryBindBankcard", "got data---isReg:" + this.cdV + ",bankcard.size:" + this.oZG.size());
      return;
      label452:
      paramInt += 1;
      continue;
      label459:
      int i = 0;
      continue;
      label465:
      boolean bool = false;
    }
  }
  
  public final int aBO()
  {
    return 37;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/bind/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */