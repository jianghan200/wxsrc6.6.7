package com.tencent.mm.plugin.collect.reward.ui;

import android.os.Bundle;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public abstract class QrRewardBaseUI
  extends WalletBaseUI
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    cqh();
    setBackBtn(new QrRewardBaseUI.1(this), a.h.actionbar_icon_dark_back);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/ui/QrRewardBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */