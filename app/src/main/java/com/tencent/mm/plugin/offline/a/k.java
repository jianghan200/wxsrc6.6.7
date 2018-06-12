package com.tencent.mm.plugin.offline.a;

import com.tencent.mars.smc.IDKey;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.c.c;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class k
  extends i
{
  public static String lKb = "3";
  public String lJW = "";
  public String lJX = "";
  public String lJY = "";
  public String lJZ = "";
  public String lKa = "";
  public String lKc = "";
  public int lKd = 0;
  public String lKe = "";
  public String lKf = "";
  public String lKg = "";
  public int lKh = 20000;
  public String token = "";
  
  public k(Bankcard paramBankcard, String paramString, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString);
    localHashMap.put("device_id", com.tencent.mm.compatible.e.q.zz());
    localHashMap.put("weixin_ver", "0x" + Integer.toHexString(d.qVN));
    localHashMap.put("bind_serialno", paramBankcard.field_bindSerial);
    localHashMap.put("bank_type", paramBankcard.field_bankcardType);
    localHashMap.put("card_tail", paramBankcard.field_bankcardTail);
    localHashMap.put("open_limitfee", String.valueOf(paramInt));
    this.lKh = paramInt;
    paramBankcard = com.tencent.mm.wallet_core.ui.e.getUsername();
    paramBankcard = ac.ce(ac.ce(paramBankcard) + ac.ce(com.tencent.mm.compatible.e.q.zz()));
    localHashMap.put("user_id", paramBankcard);
    paramString = com.tencent.mm.wallet_core.c.a.cCW();
    b.cCO();
    if (b.cCQ()) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramBankcard = paramString.dw(paramBankcard, paramInt);
      b.cCO();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "crt_csr %s %s", new Object[] { paramBankcard, Boolean.valueOf(b.cCQ()) });
      localHashMap.put("crt_csr", paramBankcard);
      localHashMap.put("type", lKb);
      localHashMap.put("version_number", lKb);
      F(localHashMap);
      return;
    }
  }
  
  public final int If()
  {
    return 565;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.plugin.offline.k.bkO();
      com.tencent.mm.plugin.offline.k.aw(196630, "0");
    }
    paramString = new ArrayList();
    paramq = new IDKey();
    paramq.SetID(135);
    paramq.SetValue(1L);
    paramq.SetKey(11);
    paramArrayOfByte = new IDKey();
    paramArrayOfByte.SetID(135);
    paramArrayOfByte.SetValue(1L);
    if ((paramInt3 == 0) && (paramInt3 == 0)) {
      paramArrayOfByte.SetKey(9);
    }
    for (;;)
    {
      paramString.add(paramq);
      paramString.add(paramArrayOfByte);
      h.mEJ.b(paramString, true);
      return;
      paramArrayOfByte.SetKey(10);
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    boolean bool;
    if (paramJSONObject != null)
    {
      this.lJX = paramJSONObject.optString("crt_crt");
      this.lJW = paramJSONObject.optString("cn");
      this.token = paramJSONObject.optString("token");
      this.lJY = paramJSONObject.optString("valid_end");
      this.lJZ = paramJSONObject.optString("encrypt_str");
      this.lKa = paramJSONObject.optString("deviceid");
      if (!com.tencent.mm.wallet_core.c.a.cCW().importCert(this.lJW, this.lJX)) {
        break label512;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "importCert crt_crt success");
      this.lKc = paramJSONObject.optString("token_v2");
      this.lKd = paramJSONObject.optInt("algorithm_type");
      this.lKe = paramJSONObject.optString("card_list");
      this.lKf = paramJSONObject.optString("key_list");
      this.lKg = paramJSONObject.optString("token_pin");
      String str2 = paramJSONObject.optString("notice_url");
      String str1 = paramJSONObject.optString("auth_codes");
      paramInt = paramJSONObject.optInt("update_interval");
      paramString = paramJSONObject.optString("code_ver");
      int i = paramJSONObject.optInt("cipher_type", 0);
      com.tencent.mm.plugin.offline.k.bkO();
      com.tencent.mm.plugin.offline.k.aw(196617, this.lJW);
      com.tencent.mm.plugin.offline.k.bkO();
      com.tencent.mm.plugin.offline.k.aw(196626, this.lJY);
      com.tencent.mm.plugin.offline.k.bkO();
      com.tencent.mm.plugin.offline.k.aw(196627, this.lJZ);
      com.tencent.mm.plugin.offline.k.bkO();
      com.tencent.mm.plugin.offline.k.aw(196628, this.lKa);
      com.tencent.mm.plugin.offline.k.bkO();
      com.tencent.mm.plugin.offline.k.aw(196630, "1");
      com.tencent.mm.plugin.offline.k.bkO();
      com.tencent.mm.plugin.offline.k.aw(196632, System.currentTimeMillis() / 1000L);
      com.tencent.mm.plugin.offline.c.a.n(this.token, this.lKc, this.lKe, this.lKf);
      com.tencent.mm.plugin.offline.c.a.uq(this.lKd);
      com.tencent.mm.plugin.offline.k.bkO();
      com.tencent.mm.plugin.offline.k.aw(196647, this.lKg);
      com.tencent.mm.plugin.offline.c.a.Jd(str2);
      com.tencent.mm.plugin.offline.k.bkO();
      paramJSONObject = com.tencent.mm.plugin.offline.k.uk(196617);
      com.tencent.mm.wallet_core.c.a.cCW();
      com.tencent.mm.wallet_core.c.a.clearToken(paramJSONObject);
      com.tencent.mm.wallet_core.c.a.cCW();
      paramJSONObject = this.lJW;
      if (i != 1) {
        break label523;
      }
      bool = true;
      label368:
      bool = com.tencent.mm.wallet_core.c.a.t(paramJSONObject, str1, bool);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "offlinecreate isOk %s cn: %s", new Object[] { Boolean.valueOf(bool), this.lJW });
      if (bool) {
        break label529;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneTenpayWxOfflineCreate", "CertUtil.getInstance().setTokens failed!");
      paramJSONObject = new StringBuilder("WalletOfflineEntranceUI CertUtil.getInstance().getLastError():");
      com.tencent.mm.wallet_core.c.a.cCW();
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneTenpayWxOfflineCreate", com.tencent.mm.wallet_core.c.a.getLastError());
    }
    for (;;)
    {
      com.tencent.mm.plugin.offline.k.bkO();
      com.tencent.mm.plugin.offline.k.aw(196649, String.valueOf(paramInt));
      g.Ek();
      g.Ei().DT().a(aa.a.sOy, com.tencent.mm.compatible.e.q.zy());
      g.Ek();
      g.Ei().DT().a(aa.a.sOz, paramString);
      return;
      label512:
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneTenpayWxOfflineCreate", "importCert crt_crt fail");
      break;
      label523:
      bool = false;
      break label368;
      label529:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "CertUtil.getInstance().setTokens success!");
    }
  }
  
  public final void a(c paramc, JSONObject paramJSONObject)
  {
    com.tencent.mm.wallet_core.c.a.cCW().cCX();
  }
  
  public final int aBO()
  {
    return 46;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/offlinecreate";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/offline/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */