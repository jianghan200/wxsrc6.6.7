package com.tencent.mm.plugin.account.ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelfriend.a;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;
import com.tencent.mm.ui.base.h;

public class LoginSmsUI
  extends LoginHistoryUI
{
  private static String TAG = "LoginSmsUI";
  
  protected final void Yz()
  {
    super.Yz();
    if ((isFinishing()) || (getWindow() == null)) {
      x.e(TAG, "LoginHistoryUI is finishing");
    }
    while (bi.oW(this.eRa)) {
      return;
    }
    this.eQY.account = this.eRa;
    YC();
    YA();
    a locala = new a(this.eRa, 17, this.eRn.getText().toString().trim(), 0, "");
    g.DF().a(locala, 0);
    getString(a.j.app_tip);
    this.eHw = h.a(this, getString(a.j.login_logining), true, new LoginSmsUI.5(this, locala));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (this.eRq) {
      return;
    }
    this.eLS = 3;
    if ((!bi.Xd(this.eRg).booleanValue()) && (bi.Xd(this.eRa).booleanValue())) {
      this.eQN.setText(pK(this.eRa));
    }
    this.eRn.setVisibility(0);
    this.eRn.setInputType(3);
    this.eRn.setSendSmsBtnClickListener(new LoginSmsUI.1(this));
    this.eRn.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        if (LoginSmsUI.this.eRn.getText().toString().length() > 0)
        {
          LoginSmsUI.this.eQP.setEnabled(true);
          return;
        }
        LoginSmsUI.this.eQP.setEnabled(false);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
    });
    if (this.eRn.getText().toString().length() > 0) {
      this.eQP.setEnabled(true);
    }
    for (;;)
    {
      this.eQP.setVisibility(0);
      this.eQP.setOnClickListener(new LoginSmsUI.3(this));
      return;
      this.eQP.setEnabled(false);
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.eRn.reset();
  }
  
  public void onResume()
  {
    super.onResume();
    g.DF().a(145, this);
  }
  
  protected void onStop()
  {
    super.onStop();
    g.DF().b(145, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/ui/LoginSmsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */