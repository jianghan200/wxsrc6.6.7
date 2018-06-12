package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.ll;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.ui.e;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.json.JSONException;
import org.json.JSONObject;

public class d
{
  private static d pmm = null;
  
  public static Bankcard a(ll paramll)
  {
    boolean bool = true;
    x.i("MicroMsg.BankcardParser", "parseFromBindQueryRecord %s", new Object[] { paramll });
    Bankcard localBankcard = new Bankcard();
    for (;;)
    {
      try
      {
        localBankcard.field_bankName = paramll.knE;
        localBankcard.field_bankcardTypeName = paramll.rfZ;
        localBankcard.field_bankcardType = paramll.lMV;
        localBankcard.field_bindSerial = paramll.lMW;
        x.d("MicroMsg.BankcardParser", "bind_serial: %s", new Object[] { localBankcard.field_bindSerial });
        if (2 != bi.getInt(paramll.rfX, 2)) {
          break label666;
        }
        i = 1;
        if (i != 0) {
          localBankcard.field_cardType |= Bankcard.plJ;
        }
        if ("NORMAL".equals(paramll.rpc)) {
          break label671;
        }
        i = 1;
        if (i != 0) {
          localBankcard.field_cardType |= Bankcard.plK;
        }
        if (!bi.oW(paramll.bTi)) {
          localBankcard.field_mobile = URLDecoder.decode(paramll.bTi.replaceAll("x", "%"), "utf-8");
        }
        localBankcard.field_onceQuotaKind = (bi.getDouble(paramll.roY, 0.0D) / 100.0D);
        localBankcard.field_onceQuotaVirtual = (bi.getDouble(paramll.roW, 0.0D) / 100.0D);
        localBankcard.field_dayQuotaKind = (bi.getDouble(paramll.roU, 0.0D) / 100.0D);
        localBankcard.field_dayQuotaVirtual = (bi.getDouble(paramll.roS, 0.0D) / 100.0D);
        localBankcard.field_bankcardTail = paramll.rfY;
        localBankcard.field_forbidWord = paramll.lMX;
        localBankcard.field_repay_url = paramll.qwz;
        localBankcard.field_wxcreditState = 2;
        if (!bi.oW(localBankcard.field_forbidWord))
        {
          localBankcard.field_bankcardState = 8;
          localBankcard.field_bankPhone = paramll.pnw;
          localBankcard.field_fetchArriveTime = (bi.getLong(paramll.rph, 0L) * 1000L);
          localBankcard.field_fetchArriveTimeWording = paramll.rpt;
          localBankcard.field_bankcardTag = bi.getInt(paramll.roZ, 1);
          if (localBankcard.field_bankcardTag != 2) {
            break label656;
          }
          i = 1;
          if (i != 0) {
            localBankcard.field_cardType |= Bankcard.plI;
          }
          if (paramll.rpe != 1) {
            break label661;
          }
          localBankcard.field_support_micropay = bool;
          x.i("MicroMsg.BankcardParser", "getBalance() support_micropay:" + paramll.rpe);
          localBankcard.field_arrive_type = paramll.rpn;
          localBankcard.field_avail_save_wording = paramll.rpp;
          i = paramll.rpu;
          x.i("MicroMsg.BankcardParser", "fetch_charge_rate:" + i);
          localBankcard.field_fetch_charge_rate = (i / 10000.0D);
          x.i("MicroMsg.BankcardParser", "field_fetch_charge_rate:" + localBankcard.field_fetch_charge_rate);
          i = paramll.rpv;
          x.i("MicroMsg.BankcardParser", "full_fetch_charge_fee:" + localBankcard.field_full_fetch_charge_fee);
          localBankcard.field_full_fetch_charge_fee = (i / 100.0D);
          localBankcard.field_fetch_charge_info = paramll.rpw;
          localBankcard.field_tips = paramll.hyz;
          localBankcard.field_forbid_title = paramll.rfQ;
          localBankcard.field_forbid_url = paramll.rfR;
          localBankcard.field_no_micro_word = paramll.rpo;
          localBankcard.field_card_bottom_wording = paramll.rpC;
          localBankcard.field_support_lqt_turn_in = paramll.rpF;
          localBankcard.field_support_lqt_turn_out = paramll.rpG;
          localBankcard.field_is_hightlight_pre_arrive_time_wording = paramll.rpE;
          d(localBankcard);
          return localBankcard;
        }
        if (1 == bi.getInt(paramll.roV, 0))
        {
          localBankcard.field_bankcardState = 1;
          continue;
        }
        if (bi.getInt(paramll.pnv, 1) != 0) {
          break label648;
        }
      }
      catch (Exception paramll)
      {
        x.printErrStackTrace("MicroMsg.BankcardParser", paramll, "parseFromBindQueryRecord() error:" + paramll.getMessage(), new Object[0]);
        return null;
      }
      localBankcard.field_bankcardState = 2;
      continue;
      label648:
      localBankcard.field_bankcardState = 0;
      continue;
      label656:
      int i = 0;
      continue;
      label661:
      bool = false;
      continue;
      label666:
      i = 0;
      continue;
      label671:
      i = 0;
    }
  }
  
  public static d bOx()
  {
    if (pmm == null) {
      pmm = new d();
    }
    return pmm;
  }
  
  public static void d(Bankcard paramBankcard)
  {
    if (paramBankcard == null) {
      return;
    }
    if (paramBankcard.bOs())
    {
      paramBankcard.field_desc = paramBankcard.field_bankName;
      return;
    }
    if (paramBankcard.bOw())
    {
      paramBankcard.field_desc = ad.getContext().getString(a.i.wallet_honeypay_card_desc, new Object[] { paramBankcard.pmj, e.dy(paramBankcard.pmg, 8) });
      return;
    }
    if (paramBankcard.bOu())
    {
      paramBankcard.field_desc = ad.getContext().getString(a.i.wallet_credit_card_desc, new Object[] { paramBankcard.field_bankName, paramBankcard.field_bankcardTail });
      return;
    }
    if (paramBankcard.bOr())
    {
      paramBankcard.field_desc = ad.getContext().getString(a.i.wallet_wxcredit_card_desc, new Object[] { paramBankcard.field_bankName, paramBankcard.field_bankcardTail });
      return;
    }
    paramBankcard.field_desc = ad.getContext().getString(a.i.wallet_deposit_card_desc, new Object[] { paramBankcard.field_bankName, paramBankcard.field_bankcardTail });
  }
  
  public Bankcard ae(JSONObject paramJSONObject)
  {
    int j = 1;
    Object localObject1;
    if (paramJSONObject == null)
    {
      localObject1 = "";
      x.i("MicroMsg.BankcardParser", "parseJson jsonBankcard %s", new Object[] { localObject1 });
      localObject1 = new Bankcard();
    }
    for (;;)
    {
      Object localObject2;
      try
      {
        ((Bankcard)localObject1).field_bankName = paramJSONObject.getString("bank_name");
        ((Bankcard)localObject1).field_bankcardTypeName = paramJSONObject.optString("bankacc_type_name");
        ((Bankcard)localObject1).field_bankcardType = paramJSONObject.getString("bank_type");
        ((Bankcard)localObject1).field_bindSerial = paramJSONObject.optString("bind_serial");
        x.d("MicroMsg.BankcardParser", "bind_serial: %s", new Object[] { ((Bankcard)localObject1).field_bindSerial });
        ((Bankcard)localObject1).plT = paramJSONObject.optString("h_bind_serialno");
        if (2 != paramJSONObject.optInt("bankacc_type", 0)) {
          break label1171;
        }
        i = 1;
        if (i != 0) {
          ((Bankcard)localObject1).field_cardType |= Bankcard.plJ;
        }
        if ("NORMAL".equals(paramJSONObject.optString("extra_bind_flag"))) {
          break label1176;
        }
        i = 1;
        if (i != 0) {
          ((Bankcard)localObject1).field_cardType |= Bankcard.plK;
        }
        if ("QMF".equals(((Bankcard)localObject1).field_bankcardType))
        {
          ((Bankcard)localObject1).field_cardType |= Bankcard.plP;
          localObject2 = paramJSONObject.optJSONObject("qmfCardInfo");
          if (localObject2 != null)
          {
            ((Bankcard)localObject1).pmd = ((JSONObject)localObject2).optLong("total_credit_line", 0L);
            ((Bankcard)localObject1).pme = ((JSONObject)localObject2).optLong("use_credit_line", 0L);
            ((Bankcard)localObject1).pmf = ((JSONObject)localObject2).optLong("unuse_credit_line", 0L);
            ((Bankcard)localObject1).pmg = ((JSONObject)localObject2).optString("payer_username", "");
            ((Bankcard)localObject1).pmh = ((JSONObject)localObject2).optInt("hide_credit_line", 0);
            ((Bankcard)localObject1).pmi = ((JSONObject)localObject2).optInt("card_type", 0);
            ((Bankcard)localObject1).pmj = ((JSONObject)localObject2).optString("card_type_name", "");
            ((Bankcard)localObject1).pmk = ((JSONObject)localObject2).optString("icon_url", "");
          }
        }
        ((Bankcard)localObject1).field_mobile = URLDecoder.decode(paramJSONObject.optString("mobile").replaceAll("x", "%"), "utf-8");
        if (bi.oW(((Bankcard)localObject1).field_mobile)) {
          ((Bankcard)localObject1).field_mobile = paramJSONObject.optString("mobile_mask");
        }
        ((Bankcard)localObject1).field_onceQuotaKind = (paramJSONObject.optDouble("once_quota_3") / 100.0D);
        ((Bankcard)localObject1).field_onceQuotaVirtual = (paramJSONObject.optDouble("once_quota_1") / 100.0D);
        ((Bankcard)localObject1).field_dayQuotaKind = (paramJSONObject.optDouble("day_quota_3") / 100.0D);
        ((Bankcard)localObject1).field_dayQuotaVirtual = (paramJSONObject.optDouble("day_quota_1") / 100.0D);
        ((Bankcard)localObject1).field_bankcardTail = paramJSONObject.optString("bind_tail");
        if (bi.oW(((Bankcard)localObject1).field_bankcardTail)) {
          ((Bankcard)localObject1).field_bankcardTail = paramJSONObject.optString("card_tail");
        }
        ((Bankcard)localObject1).plR = paramJSONObject.optString("card_mask");
        ((Bankcard)localObject1).field_forbidWord = paramJSONObject.optString("forbid_word");
        ((Bankcard)localObject1).field_repay_url = paramJSONObject.optString("repay_url");
        ((Bankcard)localObject1).field_wxcreditState = 2;
        if (bi.oW(((Bankcard)localObject1).field_forbidWord)) {
          continue;
        }
        ((Bankcard)localObject1).field_bankcardState = 8;
      }
      catch (JSONException paramJSONObject)
      {
        x.i("MicroMsg.BankcardParser", "parseJson() JSONException:" + paramJSONObject.getMessage());
        x.printErrStackTrace("MicroMsg.BankcardParser", paramJSONObject, "", new Object[0]);
        return null;
        if (paramJSONObject.optInt("bank_flag", 1) != 0) {
          continue;
        }
        ((Bankcard)localObject1).field_bankcardState = 2;
        continue;
      }
      catch (UnsupportedEncodingException paramJSONObject)
      {
        x.i("MicroMsg.BankcardParser", "parseJson() UnsupportedEncodingException :" + paramJSONObject.getMessage());
        x.printErrStackTrace("MicroMsg.BankcardParser", paramJSONObject, "", new Object[0]);
        return null;
        ((Bankcard)localObject1).field_bankcardState = 0;
        continue;
      }
      catch (Exception paramJSONObject)
      {
        x.i("MicroMsg.BankcardParser", "parseJson() Exception:" + paramJSONObject.getMessage());
        x.printErrStackTrace("MicroMsg.BankcardParser", paramJSONObject, "", new Object[0]);
        return null;
      }
      ((Bankcard)localObject1).field_bankPhone = paramJSONObject.optString("bank_phone");
      ((Bankcard)localObject1).field_fetchArriveTime = (paramJSONObject.optLong("fetch_pre_arrive_time") * 1000L);
      ((Bankcard)localObject1).field_fetchArriveTimeWording = paramJSONObject.optString("fetch_pre_arrive_time_wording");
      ((Bankcard)localObject1).field_bankcardTag = paramJSONObject.optInt("bank_card_tag", 1);
      if (((Bankcard)localObject1).field_bankcardTag == 2)
      {
        i = j;
        if (i != 0) {
          ((Bankcard)localObject1).field_cardType |= Bankcard.plI;
        }
        localObject2 = paramJSONObject.optString("support_micropay");
        if (TextUtils.isEmpty((CharSequence)localObject2)) {
          ((Bankcard)localObject1).field_support_micropay = true;
        }
        if (!"1".equals(localObject2)) {
          break label1145;
        }
        ((Bankcard)localObject1).field_support_micropay = true;
        ((Bankcard)localObject1).field_arrive_type = paramJSONObject.optString("arrive_type");
        ((Bankcard)localObject1).field_avail_save_wording = paramJSONObject.optString("avail_save_wording");
        x.i("MicroMsg.BankcardParser", "getBalance() support_micropay:" + paramJSONObject.optString("support_micropay"));
        i = paramJSONObject.optInt("fetch_charge_rate", 0);
        x.i("MicroMsg.BankcardParser", "fetch_charge_rate:" + i);
        ((Bankcard)localObject1).field_fetch_charge_rate = (i / 10000.0D);
        x.i("MicroMsg.BankcardParser", "field_fetch_charge_rate:" + ((Bankcard)localObject1).field_fetch_charge_rate);
        i = paramJSONObject.optInt("full_fetch_charge_fee", 0);
        x.i("MicroMsg.BankcardParser", "full_fetch_charge_fee:" + ((Bankcard)localObject1).field_full_fetch_charge_fee);
        ((Bankcard)localObject1).field_full_fetch_charge_fee = (i / 100.0D);
        ((Bankcard)localObject1).field_fetch_charge_info = paramJSONObject.optString("fetch_charge_info");
        ((Bankcard)localObject1).field_tips = paramJSONObject.optString("tips");
        ((Bankcard)localObject1).field_forbid_title = paramJSONObject.optString("forbid_title");
        ((Bankcard)localObject1).field_forbid_url = paramJSONObject.optString("forbid_url");
        ((Bankcard)localObject1).field_no_micro_word = paramJSONObject.optString("no_micro_word");
        ((Bankcard)localObject1).field_card_bottom_wording = paramJSONObject.optString("card_bottom_wording");
        ((Bankcard)localObject1).field_support_lqt_turn_in = paramJSONObject.optInt("support_lqt_turn_in", 0);
        ((Bankcard)localObject1).field_support_lqt_turn_out = paramJSONObject.optInt("support_lqt_turn_out", 0);
        ((Bankcard)localObject1).field_is_hightlight_pre_arrive_time_wording = paramJSONObject.optInt("is_hightlight_pre_arrive_time_wording", 0);
        ((Bankcard)localObject1).pml = paramJSONObject.optInt("support_foreign_mobile", 0);
        d((Bankcard)localObject1);
        return (Bankcard)localObject1;
        if (1 == paramJSONObject.optInt("expired_flag", 0))
        {
          ((Bankcard)localObject1).field_bankcardState = 1;
          continue;
        }
      }
      int i = 0;
      continue;
      label1145:
      if ("0".equals(localObject2))
      {
        ((Bankcard)localObject1).field_support_micropay = false;
        continue;
        localObject1 = paramJSONObject;
        break;
        label1171:
        i = 0;
        continue;
        label1176:
        i = 0;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */