package com.tencent.mm.plugin.wallet_core.c.b;

import android.content.Context;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.wallet_core.e.a.a
{
  private boolean pjS;
  
  public a()
  {
    this("");
  }
  
  public a(String paramString)
  {
    this(paramString, true);
  }
  
  public a(String paramString, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("req_key", paramString);
    F(localHashMap);
    this.pjS = paramBoolean;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    return super.a(parame, parame1);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.NetScenePayUQueryBoundBankcard", "hy: payu query bind on gy net end. errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramInt != 0) {
      return;
    }
    for (;;)
    {
      Object localObject1;
      Object localObject2;
      try
      {
        long l = paramJSONObject.optLong("time_stamp");
        if (l > 0L)
        {
          com.tencent.mm.wallet_core.c.o.setTimeStamp(String.valueOf(l));
          localObject1 = paramJSONObject.getJSONObject("user_info");
          paramString = new af();
          if ((localObject1 == null) || (((JSONObject)localObject1).length() <= 0)) {
            break label304;
          }
          paramString.field_is_reg = bi.getInt(((JSONObject)localObject1).optString("is_reg"), 0);
          paramString.field_true_name = ((JSONObject)localObject1).optString("true_name");
          paramString.field_main_card_bind_serialno = ((JSONObject)localObject1).optString("main_card_bind_serialno");
          paramString.field_ftf_pay_url = ((JSONObject)localObject1).optString("transfer_url");
          com.tencent.mm.plugin.wallet_core.model.o.bOW();
          ag.Pc(paramString.field_main_card_bind_serialno);
          paramString.field_switchConfig = paramJSONObject.getJSONObject("switch_info").getInt("switch_bit");
          localObject2 = paramJSONObject.optJSONArray("Array");
          localObject1 = new ArrayList();
          if ((localObject2 == null) || (((JSONArray)localObject2).length() <= 0)) {
            break label309;
          }
          int i = ((JSONArray)localObject2).length();
          paramInt = 0;
          if (paramInt >= i) {
            break label309;
          }
          Object localObject3 = ((JSONArray)localObject2).getJSONObject(paramInt);
          ((JSONObject)localObject3).put("extra_bind_flag", "NORMAL");
          localObject3 = com.tencent.mm.plugin.wallet_core.model.a.a.bPP().ae((JSONObject)localObject3);
          if (localObject3 == null) {
            break label455;
          }
          ((ArrayList)localObject1).add(localObject3);
          break label455;
        }
        x.w("MicroMsg.NetScenePayUQueryBoundBankcard", "no time_stamp in bindquerynew.");
        continue;
        if (!this.pjS) {
          break;
        }
      }
      catch (Exception paramString)
      {
        x.printErrStackTrace("MicroMsg.NetScenePayUQueryBoundBankcard", paramString, "", new Object[0]);
      }
      label265:
      if (!com.tencent.mm.plugin.wallet_core.model.o.bOW().bPs())
      {
        this.diJ.a(1000, -100869, "", this);
        this.uXk = true;
        return;
        label304:
        paramString = null;
        continue;
        label309:
        localObject2 = paramJSONObject.optJSONObject("balance_info");
        if ((localObject2 == null) || (((JSONObject)localObject2).length() <= 0)) {
          break label450;
        }
        paramJSONObject = new Bankcard((byte)0);
        paramJSONObject.plV = (((JSONObject)localObject2).optInt("avail_balance") / 100.0D);
        paramJSONObject.plX = (((JSONObject)localObject2).optInt("fetch_balance") / 100.0D);
        paramJSONObject.field_bankcardType = ((JSONObject)localObject2).optString("balance_bank_type");
        paramJSONObject.field_bindSerial = ((JSONObject)localObject2).optString("balance_bind_serial");
        paramJSONObject.field_forbidWord = ((JSONObject)localObject2).optString("balance_forbid_word");
        paramJSONObject.field_desc = ad.getContext().getString(a.i.wallet_harcode_balance_desc);
        paramJSONObject.field_cardType |= Bankcard.plL;
      }
      for (;;)
      {
        com.tencent.mm.plugin.wallet_core.model.o.bOW().a(paramString, (ArrayList)localObject1, null, paramJSONObject, null, null, null, null, 0, 0, null);
        break label265;
        break;
        label450:
        paramJSONObject = null;
      }
      label455:
      paramInt += 1;
    }
  }
  
  public final int bOo()
  {
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */