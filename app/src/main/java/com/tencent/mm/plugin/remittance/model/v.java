package com.tencent.mm.plugin.remittance.model;

import android.text.TextUtils;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.g.a.fo;
import com.tencent.mm.g.a.fo.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.wallet_core.c.d;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class v
  extends i
  implements d
{
  public int amount;
  public String bOe;
  public String bQa = null;
  public String bXz;
  public a cao;
  public String hTI;
  public String hVy;
  private int lNG;
  public int mxB = 0;
  public String mxC;
  public String mxD;
  public double mxE;
  public double mxF;
  public String mxG;
  public boolean mxH;
  public double mxI;
  public String mxJ;
  public double mxK;
  public double mxL;
  public String mxM;
  public String mxN;
  public String mxO;
  public double mxP = 0.0D;
  public String mxQ = "";
  public String mxR = "";
  public String mxS;
  public int mxT;
  public String mxU;
  public String mxV;
  public int mxW;
  public String mxX;
  public String mxY;
  public String mxZ;
  public String mxk = "";
  public fo mxl = null;
  public String mya;
  
  public v(double paramDouble, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, String paramString5, String paramString6, int paramInt3, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, fo paramfo)
  {
    com.tencent.mm.sdk.platformtools.x.i("Micromsg.NetSceneTenpayRemittanceGen", "payScene: %s, channel: %s dynamicCodeUrl: %s mch_name: %s nickname: %s receiver_true_name %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), paramString8, paramString9, paramString10, paramString11 });
    this.mxP = paramDouble;
    this.lNG = paramInt1;
    this.mxk = paramString8;
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", String.valueOf(paramInt1));
    localHashMap.put("transfer_scene", String.valueOf(paramInt2));
    localHashMap.put("fee", Math.round(100.0D * paramDouble));
    localHashMap.put("fee_type", paramString1);
    localHashMap.put("receiver_name", paramString2);
    localHashMap.put("receiver_openid", paramString7);
    localHashMap.put("mask_truename", paramString3);
    localHashMap.put("mch_name", paramString9);
    localHashMap.put("nickname", paramString10);
    localHashMap.put("receiver_true_name", paramString11);
    if ((paramfo != null) && (paramfo.bNX.bOa == 1))
    {
      paramString1 = "1";
      localHashMap.put("dynamic_code_source", paramString1);
      this.mxl = paramfo;
    }
    for (;;)
    {
      try
      {
        if ((this.lNG != 33) && (this.lNG != 32)) {
          continue;
        }
        com.tencent.mm.sdk.platformtools.x.d("Micromsg.NetSceneTenpayRemittanceGen", "f2f desc: %s, recvDesc: %s", new Object[] { paramString4, paramString5 });
        if (!bi.oW(paramString4)) {
          localHashMap.put("f2f_payer_desc", p.encode(paramString4, "UTF-8"));
        }
        if (!bi.oW(paramString5)) {
          localHashMap.put("desc", p.encode(paramString5, "UTF-8"));
        }
        if (!bi.oW(paramString8)) {
          localHashMap.put("dynamic_code_url", p.encode(paramString8, "UTF-8"));
        }
      }
      catch (UnsupportedEncodingException paramString1)
      {
        long l;
        com.tencent.mm.sdk.platformtools.x.e("Micromsg.NetSceneTenpayRemittanceGen", paramString1.getMessage(), new Object[] { paramString1 });
        continue;
        if ((l & 0x20) == 0L) {
          continue;
        }
        paramInt1 = 1;
        continue;
      }
      localHashMap.put("transfer_qrcode_id", paramString6);
      if ((paramInt2 == 0) || (paramInt2 == 2))
      {
        g.Ek();
        l = ((Long)g.Ei().DT().get(147457, Long.valueOf(0L))).longValue();
        paramInt1 = 0;
        if ((0x10 & l) == 0L) {
          continue;
        }
        paramInt1 = 2;
        localHashMap.put("delay_confirm_flag", String.valueOf(paramInt1));
        com.tencent.mm.sdk.platformtools.x.d("Micromsg.NetSceneTenpayRemittanceGen", "delay flag: %d", new Object[] { Integer.valueOf(paramInt1) });
      }
      F(localHashMap);
      if ((this.lNG == 32) || (this.lNG == 33))
      {
        paramString1 = new HashMap();
        paramString1.put("channel", String.valueOf(paramInt3));
        aC(paramString1);
      }
      return;
      paramString1 = "0";
      break;
      if (!bi.oW(paramString4)) {
        localHashMap.put("desc", p.encode(paramString4, "UTF-8"));
      }
    }
  }
  
  public final int If()
  {
    if ((this.lNG == 32) || (this.lNG == 33)) {
      return 1582;
    }
    return 1544;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    boolean bool = true;
    com.tencent.mm.sdk.platformtools.x.d("Micromsg.NetSceneTenpayRemittanceGen", "errCode " + paramInt + " errMsg: " + paramString);
    if ((paramInt != 0) && (paramInt != 2)) {
      return;
    }
    if (paramJSONObject.has("used_fee"))
    {
      this.mxL = paramJSONObject.optDouble("used_fee");
      this.bQa = paramJSONObject.optString("req_key");
      this.mxB = paramJSONObject.optInt("tansfering_num", 0);
      this.mxC = paramJSONObject.optString("transfer_interrupt_desc");
      this.mxD = paramJSONObject.optString("appmsgcontent");
      this.mxG = paramJSONObject.optString("transfer_interrupt_charge_desc");
      if (paramJSONObject.optInt("is_show_charge") != 1) {
        break label617;
      }
      label132:
      this.mxH = bool;
      this.mxM = paramJSONObject.optString("receiver_true_name");
      this.mxN = paramJSONObject.optString("f2f_id", "");
      this.hTI = paramJSONObject.optString("trans_id", "");
      this.hVy = paramJSONObject.optString("extend_str", "");
      this.mxO = paramJSONObject.optString("receiver_open_id", "");
      this.amount = paramJSONObject.optInt("amount", 0);
      this.bXz = paramJSONObject.optString("transfer_id", "");
      this.bOe = paramJSONObject.optString("transaction_id", "");
      this.mxS = paramJSONObject.optString("receiver_openid", "");
      if (bi.oW(this.mxM)) {
        com.tencent.mm.sdk.platformtools.x.e("Micromsg.NetSceneTenpayRemittanceGen", "receiver_true_name is null");
      }
      if (!paramJSONObject.has("remain_fee")) {
        break label623;
      }
      this.mxI = paramJSONObject.optDouble("remain_fee");
      label289:
      if (!paramJSONObject.has("exceed_fee")) {
        break label634;
      }
      this.mxK = paramJSONObject.optDouble("exceed_fee");
      label310:
      if (!paramJSONObject.has("charge_fee")) {
        break label645;
      }
      this.mxE = paramJSONObject.optDouble("charge_fee");
      label331:
      if (!paramJSONObject.has("free_limit")) {
        break label656;
      }
      this.mxF = paramJSONObject.optDouble("free_limit");
    }
    for (;;)
    {
      if (paramJSONObject.has("showmessage"))
      {
        com.tencent.mm.sdk.platformtools.x.i("Micromsg.NetSceneTenpayRemittanceGen", "has alert item");
        a locala = new a();
        JSONObject localJSONObject = paramJSONObject.optJSONObject("showmessage");
        locala.kRu = localJSONObject.optString("left_button_wording");
        locala.kRv = localJSONObject.optString("right_button_wording");
        locala.hUt = localJSONObject.optString("right_button_url");
        this.cao = locala;
        this.cao.bSc = paramString;
      }
      if (paramJSONObject.has("fee")) {
        this.mxQ = paramJSONObject.optString("fee");
      }
      if (paramJSONObject.has("double_check_wording"))
      {
        com.tencent.mm.sdk.platformtools.x.i("Micromsg.NetSceneTenpayRemittanceGen", "has fee, show alert");
        this.mxR = paramJSONObject.optString("double_check_wording");
      }
      this.mxT = paramJSONObject.optInt("scan_scene", 0);
      this.mxU = paramJSONObject.optString("placeorder_suc_sign");
      this.mxV = paramJSONObject.optString("pay_suc_extend");
      if (TextUtils.isEmpty(this.mxD)) {
        com.tencent.mm.sdk.platformtools.x.e("Micromsg.NetSceneTenpayRemittanceGen", "appmsgcontent is null");
      }
      this.mxW = paramJSONObject.optInt("get_dynamic_code_flag", 0);
      this.mxX = paramJSONObject.optString("get_dynamic_code_sign", "");
      this.mxY = paramJSONObject.optString("get_dynamic_code_extend", "");
      this.mxZ = paramJSONObject.optString("show_paying_wording", "");
      this.mya = paramJSONObject.optString("dynamic_code_spam_wording", "");
      return;
      com.tencent.mm.sdk.platformtools.x.e("Micromsg.NetSceneTenpayRemittanceGen", "remain_fee is null");
      break;
      label617:
      bool = false;
      break label132;
      label623:
      com.tencent.mm.sdk.platformtools.x.e("Micromsg.NetSceneTenpayRemittanceGen", "remain_fee is null");
      break label289;
      label634:
      com.tencent.mm.sdk.platformtools.x.e("Micromsg.NetSceneTenpayRemittanceGen", "exceed_fee is null");
      break label310;
      label645:
      com.tencent.mm.sdk.platformtools.x.e("Micromsg.NetSceneTenpayRemittanceGen", "charge_fee is null");
      break label331;
      label656:
      com.tencent.mm.sdk.platformtools.x.e("Micromsg.NetSceneTenpayRemittanceGen", "free_limit is null");
    }
  }
  
  public final int aBO()
  {
    return 0;
  }
  
  public final boolean brf()
  {
    return true;
  }
  
  public final String getUri()
  {
    if ((this.lNG == 32) || (this.lNG == 33)) {
      return "/cgi-bin/mmpay-bin/f2fplaceorder";
    }
    return "/cgi-bin/mmpay-bin/transferplaceorder";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */