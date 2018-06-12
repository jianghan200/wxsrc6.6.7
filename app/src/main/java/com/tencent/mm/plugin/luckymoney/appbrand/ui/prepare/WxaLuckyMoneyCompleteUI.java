package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.MMActivity;

public class WxaLuckyMoneyCompleteUI
  extends WxaLuckyMoneyBaseUI
  implements b
{
  private Button klJ;
  
  public final void Ga(String paramString) {}
  
  public final MMActivity baA()
  {
    return this;
  }
  
  public final void baB() {}
  
  protected final int getLayoutId()
  {
    return a.g.wxa_lucky_money_complete_ui;
  }
  
  protected final void initView()
  {
    this.klJ = ((Button)findViewById(a.f.wxa_lucky_money_complete_finish_btn));
    this.klJ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        WxaLuckyMoneyCompleteUI.this.setResult(0, null);
        WxaLuckyMoneyCompleteUI.this.finish();
      }
    });
  }
  
  public void onBackPressed()
  {
    setResult(0, null);
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyCompleteUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */