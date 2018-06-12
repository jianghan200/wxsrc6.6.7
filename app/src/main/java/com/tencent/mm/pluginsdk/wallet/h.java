package com.tencent.mm.pluginsdk.wallet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.bg.d;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.wallet.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;

public final class h
{
  public static PayInfo I(String paramString1, String paramString2, int paramInt)
  {
    PayInfo localPayInfo = new PayInfo();
    localPayInfo.bOd = paramString1;
    localPayInfo.appId = paramString2;
    localPayInfo.pCO = null;
    localPayInfo.bVY = paramInt;
    localPayInfo.Yy = null;
    localPayInfo.bVU = 0;
    return localPayInfo;
  }
  
  public static void Z(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("key_from_scene", paramInt);
    d.b(paramContext, "collect", ".ui.CollectAdapterUI", localIntent);
  }
  
  public static void a(Context paramContext, String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("key_qrcode_url", paramString1);
    localIntent.putExtra("key_channel", paramInt1);
    localIntent.putExtra("key_web_url", paramString2);
    localIntent.putExtra("key_scene", paramInt2);
    d.b(paramContext, "collect", ".reward.ui.QrRewardSelectMoneyUI", localIntent);
  }
  
  public static boolean a(Context paramContext, int paramInt1, String paramString, int paramInt2, a parama)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("scene", paramInt1);
    localIntent.putExtra("receiver_name", paramString);
    if (paramInt2 > 0) {
      localIntent.putExtra("pay_channel", paramInt2);
    }
    a.a(parama, localIntent);
    if (q.GS())
    {
      d.b(paramContext, "wallet_payu", ".remittance.ui.PayURemittanceAdapterUI", localIntent);
      return true;
    }
    if (q.GT())
    {
      d.b(paramContext, "remittance", ".ui.RemittanceAdapterUI", localIntent);
      com.tencent.mm.plugin.report.service.h.mEJ.h(12097, new Object[] { Integer.valueOf(12), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
      com.tencent.mm.plugin.report.service.h.mEJ.h(11850, new Object[] { Integer.valueOf(7), Integer.valueOf(1) });
      return true;
    }
    d.b(paramContext, "remittance", ".ui.RemittanceAdapterUI", localIntent);
    com.tencent.mm.plugin.report.service.h.mEJ.h(12097, new Object[] { Integer.valueOf(12), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
    com.tencent.mm.plugin.report.service.h.mEJ.h(11850, new Object[] { Integer.valueOf(3), Integer.valueOf(1) });
    return true;
  }
  
  public static boolean a(Context paramContext, Bundle paramBundle, boolean paramBoolean, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("orderhandlerui_checkapp_result", paramBoolean);
    if (!bi.oW(paramString)) {
      localIntent.putExtra("_mmessage_appPackage", paramString);
    }
    if (paramBundle != null) {
      localIntent.putExtras(paramBundle);
    }
    d.b(paramContext, "wallet_index", ".ui.OrderHandlerUI", localIntent);
    return true;
  }
  
  public static boolean a(Context paramContext, PayInfo paramPayInfo, int paramInt)
  {
    return a(paramContext, false, "", paramPayInfo, paramInt);
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    if (bi.oW(paramString1)) {
      return false;
    }
    return a(paramContext, I(paramString1, paramString2, paramInt1), paramInt2);
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    if (bi.oW(paramString2)) {
      return false;
    }
    return a(paramContext, true, paramString1, I(paramString2, paramString3, paramInt1), paramInt2);
  }
  
  public static boolean a(Context paramContext, boolean paramBoolean, String paramString, PayInfo paramPayInfo, int paramInt)
  {
    return a(paramContext, paramBoolean, paramString, paramPayInfo, null, new Intent(), paramInt);
  }
  
  public static boolean a(Context paramContext, boolean paramBoolean, String paramString1, PayInfo paramPayInfo, String paramString2, Intent paramIntent, int paramInt)
  {
    return a(paramContext, paramBoolean, paramString1, "", paramPayInfo, paramString2, paramIntent, paramInt);
  }
  
  public static boolean a(Context paramContext, boolean paramBoolean, String paramString1, String paramString2, PayInfo paramPayInfo, String paramString3, Intent paramIntent, int paramInt)
  {
    if ((2 == paramPayInfo.bVY) || (1 == paramPayInfo.bVY) || (4 == paramPayInfo.bVY) || (36 == paramPayInfo.bVY))
    {
      paramPayInfo.jNf = false;
      if ((paramPayInfo.bVY != 4) && (paramPayInfo.bVY != 1) && (36 != paramPayInfo.bVY) && (8 != paramPayInfo.bVY)) {
        break label173;
      }
    }
    label173:
    for (paramPayInfo.qUJ = true;; paramPayInfo.qUJ = false)
    {
      paramIntent.putExtra("key_pay_info", paramPayInfo);
      paramIntent.putExtra("key_force_use_bind_serail", bi.oV(paramString1));
      paramIntent.putExtra("key_is_force_use_given_card", paramBoolean);
      if (!bi.oW(paramString2)) {
        paramIntent.putExtra("key_is_use_default_card", paramString2);
      }
      paramIntent.putExtra("key_receiver_true_name", paramString3);
      if (!q.GS()) {
        break label182;
      }
      d.b(paramContext, "wallet_payu", ".pay.ui.WalletPayUPayUI", paramIntent, paramInt);
      return true;
      paramPayInfo.jNf = true;
      break;
    }
    label182:
    d.b(paramContext, "wallet", ".pay.ui.WalletPayUI", paramIntent, paramInt);
    return true;
  }
  
  public static boolean a(MMActivity paramMMActivity, g paramg, int paramInt, MMActivity.a parama)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("appId", paramg.appId);
    localIntent.putExtra("timeStamp", paramg.timeStamp);
    localIntent.putExtra("nonceStr", paramg.nonceStr);
    localIntent.putExtra("packageExt", paramg.packageExt);
    localIntent.putExtra("signtype", paramg.signType);
    localIntent.putExtra("paySignature", paramg.bVW);
    localIntent.putExtra("cookie", paramg.dBl);
    localIntent.putExtra("url", paramg.url);
    localIntent.putExtra("bizUsername", paramg.bVX);
    localIntent.putExtra("pay_channel", paramg.bJY);
    localIntent.putExtra("pay_for_wallet_type", paramg.qUW);
    localIntent.putExtra("pay_scene", paramg.bVY);
    localIntent.putExtra("result_jump_mode", paramg.qUY);
    localIntent.putExtra("ext_info", paramg.extInfo);
    localIntent.putExtra("key_wx_app_scene", paramg.qUV);
    if (parama != null) {
      paramMMActivity.geJ = parama;
    }
    d.a(paramMMActivity, "wallet_index", ".ui.WalletBrandUI", localIntent, paramInt, false);
    return true;
  }
  
  public static boolean aa(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("key_bind_scene", 5);
    localIntent.putExtra("key_offline_add_fee", paramInt);
    d.b(paramContext, "wallet", ".bind.ui.WalletBindUI", localIntent);
    return true;
  }
  
  public static boolean ab(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("key_scene_balance_manager", paramInt);
    if (q.GS()) {
      d.b(paramContext, "wallet_payu", ".balance.ui.WalletPayUBalanceManagerUI", localIntent);
    }
    for (;;)
    {
      return true;
      d.b(paramContext, "wallet", ".balance.ui.WalletBalanceManagerUI", localIntent);
    }
  }
  
  public static boolean b(MMActivity paramMMActivity, g paramg, int paramInt, MMActivity.a parama)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("appId", paramg.appId);
    localIntent.putExtra("timeStamp", paramg.timeStamp);
    localIntent.putExtra("nonceStr", paramg.nonceStr);
    localIntent.putExtra("packageExt", paramg.packageExt);
    localIntent.putExtra("signtype", paramg.signType);
    localIntent.putExtra("paySignature", paramg.bVW);
    localIntent.putExtra("url", paramg.url);
    localIntent.putExtra("key_bind_scene", paramg.bVZ);
    localIntent.putExtra("pay_channel", paramg.bJY);
    paramMMActivity.geJ = parama;
    d.a(paramMMActivity, "wallet", ".bind.ui.WalletBindUI", localIntent, paramInt, false);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/wallet/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */