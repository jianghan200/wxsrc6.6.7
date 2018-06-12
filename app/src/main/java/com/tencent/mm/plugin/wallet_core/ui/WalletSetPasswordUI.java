package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;

@com.tencent.mm.ui.base.a(19)
public class WalletSetPasswordUI
  extends WalletBaseUI
{
  private TextView gsY;
  private TextView hBv;
  public EditHintPasswdView kkY;
  
  protected final boolean bND()
  {
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_set_pwd;
  }
  
  protected final void initView()
  {
    this.gsY = ((TextView)findViewById(a.f.wallet_pwd_title));
    this.hBv = ((TextView)findViewById(a.f.wallet_pwd_content));
    if ((cDK() != null) && ("ModifyPwdProcess".equals(cDK().aNK()))) {
      this.gsY.setText(a.i.wallet_modify_password_title);
    }
    TextView localTextView;
    if (this.sy.getInt("key_err_code", 0) == 64534)
    {
      localTextView = (TextView)findViewById(a.f.input_err);
      localTextView.setVisibility(0);
      if (!q.GS()) {
        break label180;
      }
    }
    label180:
    for (String str = getString(a.i.wallet_set_password_no_same_payu);; str = getString(a.i.wallet_set_password_no_same))
    {
      localTextView.setText(str);
      this.sy.putInt("key_err_code", 0);
      this.kkY = ((EditHintPasswdView)findViewById(a.f.input_et));
      com.tencent.mm.wallet_core.ui.formview.a.a(this.kkY);
      findViewById(a.f.bind_wallet_verify_hint).setVisibility(8);
      this.kkY.setOnInputValidListener(new WalletSetPasswordUI.2(this));
      d(this.kkY, 0, false);
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    initView();
    com.tencent.mm.plugin.wallet_core.e.c.b(this, this.sy, 5);
    findViewById(a.f.close_button).setOnClickListener(new WalletSetPasswordUI.1(this));
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.setStatusBarColor(getResources().getColor(a.c.white));
      if (Build.VERSION.SDK_INT >= 23) {
        paramBundle.getDecorView().setSystemUiVisibility(8192);
      }
    }
    this.mController.contentView.setFitsSystemWindows(true);
  }
  
  public void onResume()
  {
    this.kkY.requestFocus();
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletSetPasswordUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */