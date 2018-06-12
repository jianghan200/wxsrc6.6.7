package com.tencent.mm.plugin.wallet_core.e;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.aa.a;
import org.json.JSONObject;

public final class b
{
  public static void am(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletNetSceneUtil", "parseLuckyMoneySnsPayData() json is null");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletNetSceneUtil", "parseLuckyMoneySnsPayData()");
    String str2 = "";
    String str1 = "";
    int i = paramJSONObject.optInt("is_open_sns_pay", 0);
    int j = paramJSONObject.optInt("can_open_sns_pay", 0);
    int k = paramJSONObject.optInt("is_white_user", 0);
    if (j == 1)
    {
      str2 = paramJSONObject.optString("open_sns_pay_title");
      str1 = paramJSONObject.optString("open_sns_pay_wording");
      g.Ek();
      g.Ei().DT().a(aa.a.sSJ, str2);
      g.Ek();
      g.Ei().DT().a(aa.a.sSK, str1);
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletNetSceneUtil", "is_open_sns_pay:" + i + ", can_open_sns_pay:" + j + ", is_white_user:" + k);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletNetSceneUtil", "open_sns_pay_title:" + str2 + ", open_sns_pay_wording:" + str1);
    g.Ek();
    g.Ei().DT().a(aa.a.sSG, Integer.valueOf(i));
    g.Ek();
    g.Ei().DT().a(aa.a.sSH, Integer.valueOf(j));
    g.Ek();
    g.Ei().DT().a(aa.a.sSI, Integer.valueOf(k));
    if (k == 1)
    {
      str1 = paramJSONObject.optString("set_sns_pay_title");
      paramJSONObject = paramJSONObject.optString("set_sns_pay_wording");
      g.Ek();
      g.Ei().DT().a(aa.a.sSL, str1);
      g.Ek();
      g.Ei().DT().a(aa.a.sSM, paramJSONObject);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletNetSceneUtil", "set_sns_pay_title:" + str1 + ", set_sns_pay_wording:" + paramJSONObject);
      g.Ek();
      g.Ei().DT().lm(true);
      return;
      paramJSONObject = "";
      str1 = "";
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */