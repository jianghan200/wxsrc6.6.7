package com.tencent.mm.plugin.offline.a;

import android.text.TextUtils;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class m
  extends h
{
  public String lJY = "";
  public String lJZ = "";
  public String lKa = "";
  public String lKc = "";
  public int lKd = 0;
  public String lKe = "";
  public String lKf = "";
  public String lKg = "";
  private String lKi;
  private int lKj;
  public String lKk;
  public int lKl = 0;
  int lKm = 0;
  public String token = "";
  
  public m(String paramString, int paramInt)
  {
    this(paramString, paramInt, paramInt);
  }
  
  public m(String paramString, int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneTenpayWxOfflineGetToken", "scene %s stack %s ", new Object[] { Integer.valueOf(paramInt1), bi.cjd().toString() });
    String str2 = com.tencent.mm.plugin.offline.c.a.blM();
    com.tencent.mm.plugin.offline.k.bkO();
    String str1 = com.tencent.mm.plugin.offline.k.uk(196628);
    Object localObject = str1;
    if (TextUtils.isEmpty(str1)) {
      localObject = q.zz();
    }
    if (TextUtils.isEmpty(str2))
    {
      paramString = (String)localObject + "&" + paramString + "&" + ((int)(Math.random() * 1000000.0D) + 1000000);
      localObject = new HashMap();
      ((Map)localObject).put("token_src", paramString);
      com.tencent.mm.plugin.offline.k.bkO();
      str1 = com.tencent.mm.plugin.offline.k.uk(196617);
      switch (paramInt2)
      {
      default: 
        paramInt2 = 12;
        label271:
        com.tencent.mm.plugin.report.service.h.mEJ.a(135L, paramInt2, 1L, true);
        com.tencent.mm.wallet_core.c.a.cCW();
        if (com.tencent.mm.wallet_core.c.a.isCertExist(str1))
        {
          com.tencent.mm.wallet_core.c.a.cCW();
          paramString = com.tencent.mm.wallet_core.c.a.genUserSig(str1, paramString);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().isCertExist(cn) true");
          if (!TextUtils.isEmpty(paramString)) {
            break label744;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken sign is empty!");
          com.tencent.mm.plugin.report.service.h.mEJ.a(135L, 4L, 1L, true);
          label342:
          ((Map)localObject).put("sign", paramString);
          ((Map)localObject).put("cert_no", str1);
          ((Map)localObject).put("type", k.lKb);
          ((Map)localObject).put("version_number", k.lKb);
          if (com.tencent.mm.plugin.offline.c.a.blL() != 2) {
            break label755;
          }
          ((Map)localObject).put("last_token", com.tencent.mm.plugin.offline.c.a.blN());
          label411:
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "inOfflineUI: %B", new Object[] { Boolean.valueOf(com.tencent.mm.plugin.offline.k.lJx) });
          if (paramInt1 != 65281) {
            break label771;
          }
          ((Map)localObject).put("fetch_tag", "2");
        }
        break;
      }
    }
    for (;;)
    {
      paramInt2 = paramInt1;
      if (paramInt1 == 65281) {
        paramInt2 = 3;
      }
      ((Map)localObject).put("scene", String.valueOf(paramInt2));
      F((Map)localObject);
      return;
      paramString = (String)localObject + "&" + paramString + "&" + ((int)(Math.random() * 1000000.0D) + 1000000) + "&" + str2;
      break;
      paramInt2 = 12;
      break label271;
      paramInt2 = 13;
      break label271;
      paramInt2 = 14;
      break label271;
      paramInt2 = 15;
      break label271;
      paramInt2 = 16;
      break label271;
      paramInt2 = 17;
      break label271;
      paramInt2 = 18;
      break label271;
      paramInt2 = 19;
      break label271;
      paramInt2 = 20;
      break label271;
      paramInt2 = 24;
      break label271;
      paramInt2 = 72;
      break label271;
      paramString = new StringBuilder("NetSceneTenpayWxOfflineGetToken CertUtil.getInstance().getLastError():");
      com.tencent.mm.wallet_core.c.a.cCW();
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", com.tencent.mm.wallet_core.c.a.getLastError());
      com.tencent.mm.plugin.report.service.h.mEJ.a(135L, 6L, 1L, true);
      g.Ek();
      paramString = (String)g.Ei().DT().get(aa.a.sOy, "");
      if ((paramString != null) && (paramString.equals(q.zy()))) {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken iemi is same between create and getToken");
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken CertUtil.getInstance().isCertExist return false! cn: " + str1);
        paramString = "";
        break;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken iemi is diff between create and getToken");
        com.tencent.mm.plugin.report.service.h.mEJ.a(135L, 5L, 1L, true);
      }
      label744:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "sign is valid");
      break label342;
      label755:
      ((Map)localObject).put("last_token", com.tencent.mm.plugin.offline.c.a.blM());
      break label411;
      label771:
      if (com.tencent.mm.plugin.offline.k.lJx) {
        ((Map)localObject).put("fetch_tag", "1");
      } else {
        ((Map)localObject).put("fetch_tag", "0");
      }
    }
  }
  
  public final int If()
  {
    if (com.tencent.mm.plugin.offline.k.lJx) {
      return 571;
    }
    return 1725;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneTenpayWxOfflineGetToken", "errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramInt == 0)
    {
      this.token = paramJSONObject.optString("token");
      this.lJY = paramJSONObject.optString("valid_end");
      this.lJZ = paramJSONObject.optString("encrypt_str");
      this.lKa = paramJSONObject.optString("deviceid");
      this.lKc = paramJSONObject.optString("token_v2");
      this.lKd = paramJSONObject.optInt("algorithm_type");
      this.lKe = paramJSONObject.optString("card_list");
      this.lKf = paramJSONObject.optString("key_list");
      this.lKg = paramJSONObject.optString("token_pin");
      this.lKi = paramJSONObject.optString("auth_codes");
      this.lKj = paramJSONObject.optInt("update_interval");
      this.lKk = paramJSONObject.optString("code_ver");
      this.lKl = paramJSONObject.optInt("reget_token_num", 0);
      this.lKm = paramJSONObject.optInt("cipher_type", 0);
      if (this.lKl <= 0) {
        break label217;
      }
    }
    label217:
    for (com.tencent.mm.plugin.offline.k.lJy = this.lKl;; com.tencent.mm.plugin.offline.k.lJy = 10)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneTenpayWxOfflineGetToken", "json: %s", new Object[] { paramJSONObject.toString() });
      return;
    }
  }
  
  public final int aBO()
  {
    if (com.tencent.mm.plugin.offline.k.lJx) {
      return 52;
    }
    return 1725;
  }
  
  public final boolean bkV()
  {
    boolean bool = true;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "do save token");
    com.tencent.mm.plugin.offline.k.bkO();
    com.tencent.mm.plugin.offline.k.aw(196626, this.lJY);
    com.tencent.mm.plugin.offline.k.bkO();
    com.tencent.mm.plugin.offline.k.aw(196627, this.lJZ);
    com.tencent.mm.plugin.offline.k.bkO();
    com.tencent.mm.plugin.offline.k.aw(196628, this.lKa);
    com.tencent.mm.plugin.offline.k.bkO();
    com.tencent.mm.plugin.offline.k.aw(196632, System.currentTimeMillis() / 1000L);
    com.tencent.mm.plugin.offline.c.a.n(this.token, this.lKc, this.lKe, this.lKf);
    com.tencent.mm.plugin.offline.c.a.uq(this.lKd);
    com.tencent.mm.plugin.offline.k.bkO();
    com.tencent.mm.plugin.offline.k.aw(196647, this.lKg);
    com.tencent.mm.plugin.offline.k.bkO();
    Object localObject = com.tencent.mm.plugin.offline.k.uk(196617);
    com.tencent.mm.wallet_core.c.a.cCW();
    com.tencent.mm.wallet_core.c.a.clearToken((String)localObject);
    com.tencent.mm.wallet_core.c.a.cCW();
    String str = this.lKi;
    if (this.lKm == 1)
    {
      bool = com.tencent.mm.wallet_core.c.a.t((String)localObject, str, bool);
      if (bool) {
        break label259;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().setTokens failed!");
      localObject = new StringBuilder("WalletOfflineEntranceUI CertUtil.getInstance().getLastError():");
      com.tencent.mm.wallet_core.c.a.cCW();
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", com.tencent.mm.wallet_core.c.a.getLastError());
    }
    for (;;)
    {
      com.tencent.mm.plugin.offline.k.bkO();
      com.tencent.mm.plugin.offline.k.aw(196649, this.lKj);
      g.Ek();
      g.Ei().DT().a(aa.a.sOz, this.lKk);
      return bool;
      bool = false;
      break;
      label259:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().setTokens success!");
    }
  }
  
  public final String getUri()
  {
    if (com.tencent.mm.plugin.offline.k.lJx) {
      return "/cgi-bin/mmpay-bin/tenpay/offlinegettoken";
    }
    return "/cgi-bin/mmpay-bin/tenpay/offlinegettokenbackground";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/offline/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */