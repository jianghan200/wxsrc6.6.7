package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.Promotions;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class z
  extends i
{
  public Orders pjG;
  
  public z(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString);
    F(localHashMap);
  }
  
  public z(String paramString, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString);
    localHashMap.put("pay_type", String.valueOf(paramInt));
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject != null) {}
    try
    {
      this.pjG = new Orders();
      paramString = new Orders.Commodity();
      paramString.lNH = paramJSONObject.getString("buy_uin");
      paramString.lNI = paramJSONObject.getString("buy_name");
      paramString.lNJ = paramJSONObject.optString("sale_uin");
      paramString.lNK = paramJSONObject.optString("sale_name");
      paramString.bOe = paramJSONObject.getString("trans_id");
      paramString.desc = paramJSONObject.optString("goods_name");
      paramString.hUL = (paramJSONObject.optDouble("pay_num") / 100.0D);
      paramString.lNO = paramJSONObject.getString("trade_state");
      paramString.lNP = paramJSONObject.getString("trade_state_name");
      paramString.lNT = paramJSONObject.getString("buy_bank_name");
      paramString.lOa = paramJSONObject.optString("discount", "");
      paramString.lNR = paramJSONObject.optInt("modify_timestamp");
      paramString.lNV = paramJSONObject.optString("fee_type");
      paramString.lNW = paramJSONObject.optString("appusername");
      paramString.lNy = paramJSONObject.optString("app_telephone");
      paramString.ppw = (paramJSONObject.optDouble("original_total_fee", -1.0D) / 100.0D);
      paramString.lNV = paramJSONObject.optString("fee_type", "");
      paramInt = 1;
      Object localObject1 = paramJSONObject.optJSONObject("subscribe_biz_info");
      Object localObject2;
      if (localObject1 != null)
      {
        localObject2 = new Orders.Promotions();
        ((Orders.Promotions)localObject2).type = Orders.ppu;
        ((Orders.Promotions)localObject2).name = ((JSONObject)localObject1).optString("nickname");
        ((Orders.Promotions)localObject2).lNW = ((JSONObject)localObject1).optString("username");
        paramString.ppx = ((Orders.Promotions)localObject2).lNW;
        ((Orders.Promotions)localObject2).lRX = ((JSONObject)localObject1).optString("logo_round_url");
        ((Orders.Promotions)localObject2).url = ((JSONObject)localObject1).optString("subscribe_biz_url");
        i = ((JSONObject)localObject1).optInt("recommend_level");
        paramString.poW = i;
        paramInt = i;
        if (!bi.oW(((Orders.Promotions)localObject2).name))
        {
          paramString.ppF.add(localObject2);
          paramInt = i;
        }
      }
      localObject1 = paramJSONObject.getJSONArray("activity_info");
      int j = ((JSONArray)localObject1).length();
      int i = 0;
      Object localObject3;
      while (i < j)
      {
        localObject2 = ((JSONArray)localObject1).getJSONObject(i);
        localObject3 = new Orders.Promotions();
        ((Orders.Promotions)localObject3).type = Orders.ppv;
        ((Orders.Promotions)localObject3).lRX = ((JSONObject)localObject2).optString("icon");
        ((Orders.Promotions)localObject3).name = ((JSONObject)localObject2).optString("wording");
        ((Orders.Promotions)localObject3).url = ((JSONObject)localObject2).optString("url");
        ((Orders.Promotions)localObject3).poG = ((JSONObject)localObject2).optString("btn_text");
        ((Orders.Promotions)localObject3).ppS = ((JSONObject)localObject2).optInt("type");
        ((Orders.Promotions)localObject3).title = ((JSONObject)localObject2).optString("title");
        ((Orders.Promotions)localObject3).pji = ((JSONObject)localObject2).optLong("activity_id");
        ((Orders.Promotions)localObject3).ppT = ((JSONObject)localObject2).optInt("activity_type", 0);
        ((Orders.Promotions)localObject3).ppU = ((JSONObject)localObject2).optInt("award_id");
        ((Orders.Promotions)localObject3).poD = ((JSONObject)localObject2).optInt("send_record_id");
        ((Orders.Promotions)localObject3).poE = ((JSONObject)localObject2).optInt("user_record_id");
        ((Orders.Promotions)localObject3).ppW = ((JSONObject)localObject2).optString("activity_tinyapp_username");
        ((Orders.Promotions)localObject3).ppX = ((JSONObject)localObject2).optString("activity_tinyapp_path");
        ((Orders.Promotions)localObject3).poF = ((JSONObject)localObject2).optLong("activity_mch_id");
        ((Orders.Promotions)localObject3).ppY = ((JSONObject)localObject2).optInt("activity_tinyapp_version");
        ((Orders.Promotions)localObject3).ppZ = ((JSONObject)localObject2).optString("get_award_params");
        ((Orders.Promotions)localObject3).pqa = ((JSONObject)localObject2).optString("query_award_status_params");
        Orders.a((Orders.Promotions)localObject3, ((JSONObject)localObject2).optJSONObject("exposure_info"));
        paramString.ppF.add(localObject3);
        i += 1;
      }
      localObject1 = paramJSONObject.optJSONArray("discount_array");
      if ((localObject1 != null) && (((JSONArray)localObject1).length() > 0))
      {
        j = ((JSONArray)localObject1).length();
        paramString.ppz = new ArrayList();
        i = 0;
        while (i < j)
        {
          localObject2 = ((JSONArray)localObject1).optJSONObject(i);
          localObject3 = new Orders.DiscountInfo();
          ((Orders.DiscountInfo)localObject3).ppR = ((JSONObject)localObject2).optDouble("payment_amount");
          ((Orders.DiscountInfo)localObject3).mwP = ((JSONObject)localObject2).optString("favor_desc");
          paramString.ppz.add(localObject3);
          i += 1;
        }
      }
      paramString.ppA = paramJSONObject.optString("rateinfo");
      paramString.ppB = paramJSONObject.optString("discount_rateinfo");
      paramString.ppC = paramJSONObject.optString("original_feeinfo");
      this.pjG.ppf = new ArrayList();
      this.pjG.ppf.add(paramString);
      this.pjG.poY = paramJSONObject.optString("trade_state_name");
      this.pjG.poW = paramInt;
      return;
    }
    catch (JSONException paramString)
    {
      x.printErrStackTrace("MicroMsg.NetSceneTenpayQueryOrderInfo", paramString, "", new Object[0]);
      return;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.NetSceneTenpayQueryOrderInfo", paramString, "", new Object[0]);
    }
  }
  
  public final int aBO()
  {
    return 3;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */