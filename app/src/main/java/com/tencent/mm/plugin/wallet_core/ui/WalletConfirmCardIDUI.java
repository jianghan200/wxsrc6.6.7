package com.tencent.mm.plugin.wallet_core.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.c.t;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.bankcard.TenpaySegmentEditText;

public class WalletConfirmCardIDUI
  extends WalletBaseUI
{
  private Button jXG;
  private TenpaySegmentEditText pvn;
  private boolean pvo = true;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    paramString = new Bundle();
    boolean bool = this.sy.getBoolean("key_is_reset_with_new_card", false);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paraml instanceof t))
      {
        paraml = (t)paraml;
        paramString.putBoolean("key_need_area", paraml.bOl());
        paramString.putBoolean("key_need_profession", paraml.bOm());
        paramString.putParcelableArray("key_profession_list", paraml.pjD);
        if (paraml.pjz != null)
        {
          if ((paraml.pjz.pnr) && (paraml.pjz.isError()))
          {
            com.tencent.mm.ui.base.h.i(this, a.i.wallet_bank_broken, a.i.app_tip);
            return true;
          }
          paramString.putBoolean("key_is_reset_with_new_card", bool);
          paramString.putString("bank_name", paraml.pjz.knE);
          paramString.putParcelable("elemt_query", paraml.pjz);
          paramString.putString("key_card_id", this.pvn.getEncryptDataWithHash(false));
          a.j(this, paramString);
          return true;
        }
        paramString.putBoolean("key_is_reset_with_new_card", bool);
        paramString.putString("bank_name", "");
        paramString.putParcelable("elemt_query", new ElementQuery());
        paramString.putString("key_card_id", this.pvn.getEncryptDataWithHash(false));
        a.j(this, paramString);
      }
    }
    while ((paramInt2 != 1) || (!(paraml instanceof t))) {
      return false;
    }
    paramString.putString("bank_name", "");
    paramString.putBoolean("key_is_reset_with_new_card", bool);
    paramString.putParcelable("elemt_query", new ElementQuery());
    paramString.putString("key_card_id", this.pvn.getEncryptDataWithHash(false));
    a.j(this, paramString);
    return true;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_confirm_card_id_ui;
  }
  
  protected final void initView()
  {
    final Object localObject = this.sy.getString("key_bankcard_id");
    String str = this.sy.getString("key_bankcard_des");
    Bitmap localBitmap = (Bitmap)this.sy.getParcelable("key_bankcard_cropimg");
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      x.e("MicroMsg.WalletConfirmCardIDUI", "cardID is empty");
      finish();
      return;
    }
    if (localBitmap == null)
    {
      x.e("MicroMsg.WalletConfirmCardIDUI", "cardID bitmap is null");
      finish();
      return;
    }
    setMMTitle(a.i.wallet_confirm_card_id_ui_title);
    this.jXG = ((Button)findViewById(a.f.next_btn));
    this.pvn = ((TenpaySegmentEditText)findViewById(a.f.edit_card_id));
    this.pvn.setText((String)localObject, str);
    this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.tenpay_num_keyboard));
    this.kMk = findViewById(a.f.tenpay_keyboard_layout);
    ((ImageView)findViewById(a.f.card_id_src_bmp)).setImageBitmap(localBitmap);
    this.pvn.setKeyboard(this.mKeyboard);
    this.mKeyboard.setXMode(0);
    ((InputMethodManager)this.mController.tml.getSystemService("input_method")).hideSoftInputFromWindow(this.pvn.getWindowToken(), 0);
    this.kMk.setVisibility(8);
    this.pvn.setOnClickListener(new WalletConfirmCardIDUI.2(this));
    localObject = this.pvn.get3DesEncrptData();
    this.jXG.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = WalletConfirmCardIDUI.f(WalletConfirmCardIDUI.this).get3DesEncrptData();
        if ((paramAnonymousView != null) && (paramAnonymousView.equals(localObject))) {
          com.tencent.mm.plugin.report.service.h.mEJ.h(11353, new Object[] { Integer.valueOf(0), Integer.valueOf(1) });
        }
        for (;;)
        {
          WalletConfirmCardIDUI.g(WalletConfirmCardIDUI.this);
          return;
          com.tencent.mm.plugin.report.service.h.mEJ.h(11353, new Object[] { Integer.valueOf(0), Integer.valueOf(2) });
        }
      }
    });
    this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.tenpay_num_keyboard));
    this.kMk = findViewById(a.f.tenpay_keyboard_layout);
    localObject = findViewById(a.f.tenpay_push_down);
    if ((this.mKeyboard == null) || (this.kMk == null)) {}
    for (;;)
    {
      this.pvn.setFocusable(false);
      this.pvn.setFocusableInTouchMode(true);
      return;
      ((View)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          WalletConfirmCardIDUI.this.Wq();
        }
      });
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    setBackBtn(new WalletConfirmCardIDUI.1(this));
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */