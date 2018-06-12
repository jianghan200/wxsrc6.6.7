package com.tencent.mm.plugin.aa.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.vending.app.c;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tenpay.android.wechat.MyKeyboardWindow;

public abstract class BaseAAPresenterActivity
  extends WalletBaseUI
{
  private static final int eCE = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 300);
  private c dtb = new c();
  protected View eCD;
  
  public final void Wq()
  {
    super.Wq();
    if (this.eCD != null) {
      this.eCD.scrollTo(0, 0);
    }
  }
  
  protected final void a(final View paramView, final int paramInt, final boolean paramBoolean1, final boolean paramBoolean2)
  {
    this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.tenpay_num_keyboard));
    this.kMk = findViewById(a.f.tenpay_keyboard_layout);
    View localView = findViewById(a.f.tenpay_push_down);
    final EditText localEditText = (EditText)paramView.findViewById(a.f.wallet_content);
    if ((this.mKeyboard == null) || (localEditText == null) || (this.kMk == null)) {
      return;
    }
    this.kMk.setVisibility(8);
    e.setNoSystemInputOnEditText(localEditText);
    localEditText.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if ((paramAnonymousView.isFocused()) && (!paramBoolean1))
        {
          ((InputMethodManager)BaseAAPresenterActivity.this.mController.tml.getSystemService("input_method")).hideSoftInputFromWindow(paramAnonymousView.getWindowToken(), 0);
          new ag().postDelayed(new BaseAAPresenterActivity.1.1(this, paramAnonymousView), 300L);
          return;
        }
        new ag().postDelayed(new BaseAAPresenterActivity.1.2(this), 200L);
      }
    });
    localEditText.setOnClickListener(new BaseAAPresenterActivity.2(this, paramBoolean1, localEditText, paramInt));
    localView.setOnClickListener(new BaseAAPresenterActivity.3(this));
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dtb.A(getIntent(), this);
    this.uYS = true;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.dtb.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
    this.dtb.GM(3);
  }
  
  public void onResume()
  {
    super.onResume();
    this.dtb.GM(2);
  }
  
  public final <T extends b<? extends com.tencent.mm.vending.app.a>> T t(Class<? extends b<? extends com.tencent.mm.vending.app.a>> paramClass)
  {
    return this.dtb.a(this, paramClass);
  }
  
  public final <T extends com.tencent.mm.vending.app.a> T w(Class<? extends com.tencent.mm.vending.app.a> paramClass)
  {
    return this.dtb.b(this, paramClass);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/aa/ui/BaseAAPresenterActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */