package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.d.h;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.model.z;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends i
{
  public int phg;
  public String phh;
  public int phi;
  public String phj;
  public String phk;
  public String phl;
  
  public c()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("deviceid", q.getDeviceID(ad.getContext()));
    F(localHashMap);
  }
  
  public static boolean bFZ()
  {
    g.Ek();
    long l = ((Long)g.Ei().DT().get(aa.a.sSY, Long.valueOf(0L))).longValue();
    g.Ek();
    int i = ((Integer)g.Ei().DT().get(aa.a.sSZ, Integer.valueOf(0))).intValue();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayPayManager", "check isExpire %s %s %s", new Object[] { Long.valueOf(l), Integer.valueOf(i), Long.valueOf(i + l) });
    if (l > 0L) {
      return Long.valueOf(new Date().getTime() / 1000L).longValue() > l + i;
    }
    return true;
  }
  
  private static boolean xW(String paramString)
  {
    if (bi.oW(paramString)) {
      return false;
    }
    int i = paramString.length();
    int j;
    do
    {
      i -= 1;
      if (i < 0) {
        return true;
      }
      j = paramString.charAt(i);
      if (j < 48) {
        break;
      }
    } while (j <= 57);
    return false;
  }
  
  public final int If()
  {
    return 1654;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayPayManager", "errCode:" + paramInt + ";errMsg:" + paramString);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneTenpayPayManager", "json: %s", new Object[] { paramJSONObject.toString() });
    label107:
    String str1;
    if (paramInt == 0)
    {
      paramString = paramJSONObject.optString("is_show_deduct", "0");
      if (!xW(paramString)) {
        break label538;
      }
      this.phg = Integer.valueOf(paramString).intValue();
      this.phh = paramJSONObject.optString("deduct_show_url", "");
      paramString = paramJSONObject.optString("deduct_cache_time", "");
      if (!xW(paramString)) {
        break label544;
      }
      this.phi = Integer.valueOf(paramString).intValue();
      this.phj = paramJSONObject.optString("deduct_title", "");
      this.phk = paramJSONObject.optString("realname_url", "");
      this.phl = paramJSONObject.optString("forget_pwd_url", "");
      paramString = paramJSONObject.optString("payway_select_wording", "");
      str1 = paramJSONObject.optString("payway_change_wording", "");
      Object localObject = new z();
      ((z)localObject).field_is_show = this.phg;
      ((z)localObject).field_pref_key = "wallet_open_auto_pay";
      ((z)localObject).field_pref_title = this.phj;
      ((z)localObject).field_pref_url = this.phh;
      h localh = o.bOV();
      if (!bi.oW("wallet_open_auto_pay"))
      {
        String str2 = "delete from WalletPrefInfo where pref_key='" + "wallet_open_auto_pay" + "'";
        localh.diF.fV("WalletPrefInfo", str2);
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayPayManager", "deductCacheTime %s forget_pwd_url %s", new Object[] { Integer.valueOf(this.phi), this.phl });
      o.bOV().b((com.tencent.mm.sdk.e.c)localObject);
      localObject = paramJSONObject.optJSONObject("unreg_info");
      if (localObject == null) {
        break label551;
      }
      paramJSONObject = ((JSONObject)localObject).optString("unreg_title", "");
      localObject = ((JSONObject)localObject).optString("unreg_url", "");
      g.Ek();
      g.Ei().DT().a(aa.a.sYH, paramJSONObject);
      g.Ek();
      g.Ei().DT().a(aa.a.sYI, localObject);
    }
    for (;;)
    {
      g.Ek();
      g.Ei().DT().a(aa.a.sSY, Long.valueOf(new Date().getTime() / 1000L));
      g.Ek();
      g.Ei().DT().a(aa.a.sSZ, Integer.valueOf(this.phi));
      g.Ek();
      g.Ei().DT().a(aa.a.sTf, this.phk);
      g.Ek();
      g.Ei().DT().a(aa.a.sTf, this.phl);
      if (!bi.oW(paramString))
      {
        g.Ek();
        g.Ei().DT().a(aa.a.sTm, paramString);
      }
      if (!bi.oW(str1))
      {
        g.Ek();
        g.Ei().DT().a(aa.a.sTn, str1);
      }
      g.Ek();
      g.Ei().DT().lm(true);
      return;
      label538:
      paramString = "0";
      break;
      label544:
      paramString = "84600";
      break label107;
      label551:
      g.Ek();
      g.Ei().DT().a(aa.a.sYH, "");
      g.Ek();
      g.Ei().DT().a(aa.a.sYI, "");
    }
  }
  
  public final int aBO()
  {
    return 0;
  }
  
  public final int bNX()
  {
    return 100000;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/paymanage";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */