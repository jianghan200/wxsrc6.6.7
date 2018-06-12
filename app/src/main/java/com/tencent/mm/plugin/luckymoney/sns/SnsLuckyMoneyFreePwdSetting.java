package com.tencent.mm.plugin.luckymoney.sns;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.qd;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.l;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletPreferenceUI;

public class SnsLuckyMoneyFreePwdSetting
  extends WalletPreferenceUI
{
  protected f gua;
  protected CheckBoxPreference kTl;
  
  private void bbg()
  {
    boolean bool = true;
    if (com.tencent.mm.plugin.luckymoney.sns.b.a.bbi() == 1)
    {
      this.kTl.qpJ = bool;
      this.duR.edit().putBoolean("open_sns_pay_pref", bool).commit();
      if (TextUtils.isEmpty(com.tencent.mm.plugin.luckymoney.sns.b.a.bbj())) {
        break label139;
      }
      x.i("MicroMsg.mmui.MMPreference", "SetSnsPayTitle:" + com.tencent.mm.plugin.luckymoney.sns.b.a.bbj());
      this.kTl.setTitle(com.tencent.mm.plugin.luckymoney.sns.b.a.bbj());
      label82:
      if (TextUtils.isEmpty(com.tencent.mm.plugin.luckymoney.sns.b.a.bbk())) {
        break label159;
      }
      x.i("MicroMsg.mmui.MMPreference", "SetSnsPayWording:" + com.tencent.mm.plugin.luckymoney.sns.b.a.bbk());
      this.kTl.setSummary(com.tencent.mm.plugin.luckymoney.sns.b.a.bbk());
    }
    for (;;)
    {
      this.gua.notifyDataSetChanged();
      return;
      bool = false;
      break;
      label139:
      x.i("MicroMsg.mmui.MMPreference", "SetSnsPayTitle is empty");
      this.kTl.setTitle(a.i.lucky_money_free_pwd_key_title);
      break label82;
      label159:
      x.i("MicroMsg.mmui.MMPreference", "getSetSnsPayWording is empty");
      this.kTl.setSummary(a.i.lucky_money_free_pwd_key_decs);
    }
  }
  
  private void gn(boolean paramBoolean)
  {
    this.duR.edit().putBoolean("open_sns_pay_pref", paramBoolean).commit();
    this.kTl.qpJ = paramBoolean;
    this.gua.notifyDataSetChanged();
  }
  
  private static void sh(int paramInt)
  {
    qd localqd = new qd();
    localqd.caN.key = paramInt;
    localqd.caN.value = 1;
    localqd.caN.caO = true;
    com.tencent.mm.sdk.b.a.sFg.m(localqd);
  }
  
  public final int Ys()
  {
    return a.l.sns_lucky_money_free_pwd_pref;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if ("open_sns_pay_pref".equals(paramPreference.mKey))
    {
      if ((!this.kTl.isChecked()) && (com.tencent.mm.plugin.luckymoney.sns.b.a.bbi() == 1))
      {
        cDP().a(new com.tencent.mm.plugin.luckymoney.sns.a.a(0, "", ""), true, 1);
        sh(117);
      }
    }
    else {
      return false;
    }
    sh(120);
    com.tencent.mm.wallet_core.a.a(this, a.class, null, null);
    return false;
  }
  
  public final boolean h(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.luckymoney.sns.a.a))
    {
      x.i("MicroMsg.mmui.MMPreference", "free pwd setting onWalletSceneEnd, errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label105;
      }
      if (((com.tencent.mm.plugin.luckymoney.sns.a.a)paraml).kTD == 1)
      {
        x.i("MicroMsg.mmui.MMPreference", "onWalletSceneEnd() NetSceneSnsPayManage is success, setIsOpenSnsPay with 1");
        sh(119);
        gn(true);
      }
    }
    else
    {
      return false;
    }
    gn(false);
    sh(118);
    x.i("MicroMsg.mmui.MMPreference", "onWalletSceneEnd() NetSceneSnsPayManage is success, setIsOpenSnsPay with 0");
    return false;
    label105:
    sh(119);
    x.i("MicroMsg.mmui.MMPreference", "onWalletSceneEnd() NetSceneSnsPayManage is failed, do nothing");
    bbg();
    return false;
  }
  
  protected final void initView()
  {
    this.gua = this.tCL;
    setBackBtn(new SnsLuckyMoneyFreePwdSetting.1(this));
    setMMTitle(a.i.lucky_money_free_pwd_setting_title);
    this.kTl = ((CheckBoxPreference)this.gua.ZZ("open_sns_pay_pref"));
    bbg();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    sh(116);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
  }
  
  protected void onResume()
  {
    bbg();
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyFreePwdSetting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */