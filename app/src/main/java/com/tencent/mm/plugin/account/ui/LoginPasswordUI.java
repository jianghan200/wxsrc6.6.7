package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.h;

public class LoginPasswordUI
  extends LoginHistoryUI
{
  private static String TAG = "LoginPasswordUI";
  
  protected final void Yz()
  {
    super.Yz();
    if ((isFinishing()) || (getWindow() == null))
    {
      x.e(TAG, "LoginHistoryUI is finishing");
      return;
    }
    this.eQY.eIY = this.eQO.getText().toString();
    if (this.eQY.account.equals(""))
    {
      h.i(this, a.j.verify_username_null_tip, a.j.login_err_title);
      return;
    }
    if (this.eQY.eIY.equals(""))
    {
      h.i(this, a.j.verify_password_null_tip, a.j.login_err_title);
      return;
    }
    YC();
    YA();
    q localq = new q(this.eQY.account, this.eQY.eIY, this.eOW, 0);
    g.DF().a(localq, 0);
    getString(a.j.app_tip);
    this.eHw = h.a(this, getString(a.j.login_logining), true, new LoginPasswordUI.6(this, localq));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (this.eRq) {
      return;
    }
    this.eLS = 2;
    this.eRm.setVisibility(0);
    this.eQP.setVisibility(0);
    this.eQO.setTypeface(Typeface.DEFAULT);
    this.eQO.setTransformationMethod(new PasswordTransformationMethod());
    this.eQO.setOnEditorActionListener(new LoginPasswordUI.1(this));
    this.eQO.setOnKeyListener(new LoginPasswordUI.2(this));
    this.eQO.addTextChangedListener(new LoginPasswordUI.3(this));
    if (this.eQO.getText().toString().length() > 0) {
      this.eQP.setEnabled(true);
    }
    for (;;)
    {
      this.eQP.setOnClickListener(new LoginPasswordUI.4(this));
      this.eOW = getIntent().getStringExtra("auth_ticket");
      if (bi.oW(this.eOW)) {
        break;
      }
      this.eQN.setText(bi.oV(f.YF()));
      this.eQO.setText(bi.oV(f.YG()));
      new ag().postDelayed(new LoginPasswordUI.5(this), 500L);
      return;
      this.eQP.setEnabled(false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/ui/LoginPasswordUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */