package com.tencent.mm.plugin.honey_pay.ui;

import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public abstract class HoneyPayBaseUI
  extends WalletBaseUI
{
  protected final String TAG = "MicroMsg." + getClass().getSimpleName();
  protected int kjV = a.c.white;
  
  protected void aWd()
  {
    lF(getResources().getColor(this.kjV));
    cqh();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    aWd();
    setBackBtn(new HoneyPayBaseUI.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/ui/HoneyPayBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */