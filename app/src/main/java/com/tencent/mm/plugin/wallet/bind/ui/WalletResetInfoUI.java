package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet.pay.a.a.b;
import com.tencent.mm.plugin.wallet.pay.a.a.c;
import com.tencent.mm.plugin.wallet_core.c.t;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.model.q;
import com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.j;
import com.tencent.mm.wallet_core.ui.MMScrollView;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;

@com.tencent.mm.ui.base.a(19)
public class WalletResetInfoUI
  extends WalletBaseUI
  implements WalletFormView.a
{
  private Button eUb;
  private TextView gmo;
  private Orders mCZ;
  private Bankcard paI;
  private WalletFormView pdA;
  private WalletFormView pdB;
  private WalletFormView pdC;
  private WalletFormView pdD;
  private WalletPhoneInputView pdE;
  private Authen pdF;
  private ElementQuery pdG;
  
  private boolean ZB()
  {
    if (!this.pdB.dX(null)) {}
    for (boolean bool1 = false;; bool1 = true)
    {
      boolean bool2 = bool1;
      if (this.pdE.getVisibility() == 0)
      {
        bool2 = bool1;
        if (this.pdE.bQM())
        {
          bool2 = bool1;
          if (!this.pdD.dX(null)) {
            bool2 = false;
          }
        }
      }
      if (!this.pdC.dX(null)) {
        bool2 = false;
      }
      if ((this.mCZ == null) || (this.pdF == null)) {
        bool2 = false;
      }
      if (bool2)
      {
        this.eUb.setEnabled(true);
        this.eUb.setClickable(true);
        return bool2;
      }
      this.eUb.setEnabled(false);
      this.eUb.setClickable(false);
      return bool2;
    }
  }
  
  private boolean bNn()
  {
    return (this.sy.getInt("key_err_code", 408) == 408) && (this.pdG == null);
  }
  
  private void bNo()
  {
    switch (this.sy.getInt("key_err_code", 408))
    {
    default: 
      if (this.sy.getBoolean("key_balance_change_phone_need_confirm_phone", true))
      {
        setMMTitle(a.i.wallet_reset_mobile_title);
        this.pdE.setVisibility(0);
      }
      break;
    }
    for (;;)
    {
      if (this.paI != null)
      {
        x.d("Micromsg.WalletResetInfoUI", "bankPhone: %s", new Object[] { this.paI.field_bankPhone });
        this.gmo.setText(String.format(getString(a.i.wallet_reset_mobile_tips), new Object[] { this.paI.field_bankPhone }));
      }
      if ((this.pdG == null) && (this.paI != null)) {
        this.pdG = o.bPe().OW(this.paI.field_bankcardType);
      }
      if ((this.pdG != null) && (this.pdG.pno)) {
        this.pdC.setVisibility(0);
      }
      if ((this.pdG != null) && (this.pdG.pnp)) {
        this.pdB.setVisibility(0);
      }
      for (;;)
      {
        this.eUb = ((Button)findViewById(a.f.next_btn));
        this.eUb.setOnClickListener(new WalletResetInfoUI.1(this));
        ZB();
        if (!bNn()) {
          break;
        }
        ux(4);
        return;
        setMMTitle(a.i.wallet_reset_cvv_title);
        this.pdC.setVisibility(0);
        this.gmo.setText(a.i.wallet_reset_cvv_tips);
        continue;
        setMMTitle(a.i.wallet_reset_valid_date_title);
        this.pdB.setVisibility(0);
        this.gmo.setText(a.i.wallet_reset_valid_date_tips);
      }
      setMMTitle(a.i.wallet_reset_mobile_info_tips);
    }
    ux(0);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.d("Micromsg.WalletResetInfoUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = this.sy;
      if (((paraml instanceof b)) || ((paraml instanceof c)))
      {
        paraml = (b)paraml;
        if (!paraml.pfa) {}
        for (boolean bool = true;; bool = false)
        {
          paramString.putBoolean("key_need_verify_sms", bool);
          paramString.putString("kreq_token", paraml.token);
          if (paraml.pgm) {
            paramString.putParcelable("key_orders", paraml.pfb);
          }
          paraml = paraml.lJN;
          if (paraml != null) {
            paramString.putParcelable("key_realname_guide_helper", paraml);
          }
          paramString.putInt("key_err_code", 0);
          com.tencent.mm.wallet_core.a.j(this, paramString);
          return true;
        }
      }
      if (((paraml instanceof t)) && (this.paI != null))
      {
        this.pdG = o.bPe().OX(this.paI.field_bindSerial);
        bNo();
      }
    }
    return false;
  }
  
  public final void fE(boolean paramBoolean)
  {
    ZB();
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_reset_info_ui;
  }
  
  protected final void initView()
  {
    this.gmo = ((TextView)findViewById(a.f.wallet_reset_info_tips));
    Bankcard localBankcard = (Bankcard)this.sy.getParcelable("key_switch_phone_reset_bank_card");
    Object localObject = localBankcard;
    if (localBankcard == null) {
      localObject = (Bankcard)this.sy.getParcelable("key_bankcard");
    }
    this.paI = ((Bankcard)localObject);
    this.mCZ = ((Orders)this.sy.getParcelable("key_orders"));
    this.pdF = ((Authen)this.sy.getParcelable("key_authen"));
    if (TextUtils.isEmpty(this.sy.getString("key_pwd1", "")))
    {
      this.sy.putString("key_pwd1", this.pdF.pli);
      x.e("Micromsg.WalletResetInfoUI", "pwd is empty, reset it to input");
    }
    this.pdG = ((ElementQuery)this.sy.getParcelable("elemt_query"));
    this.pdE = ((WalletPhoneInputView)findViewById(a.f.mobile_new_et));
    this.pdD = this.pdE.getPhoneNumberEt();
    if (this.paI.pml == 1)
    {
      this.pdE.bQO();
      localObject = (EditText)this.pdE.findViewById(a.f.prefix_input_et);
      d(this.pdE.getPhoneNumberEt(), 0, false);
      a(this.pdE.getPhoneNumberEt(), (EditText)localObject, 0, false, false, true);
      this.pdA = ((WalletFormView)findViewById(a.f.bankcard_et));
      this.pdB = ((WalletFormView)findViewById(a.f.date_et));
      com.tencent.mm.wallet_core.ui.formview.a.a(this, this.pdB);
      this.pdC = ((WalletFormView)findViewById(a.f.cvv_et));
      com.tencent.mm.wallet_core.ui.formview.a.b(this, this.pdC);
      this.pdB.setOnInputValidChangeListener(this);
      this.pdC.setOnInputValidChangeListener(this);
      this.pdD.setOnInputValidChangeListener(this);
      localObject = (MMScrollView)findViewById(a.f.wallet_sv);
      ((MMScrollView)localObject).a((ViewGroup)localObject, (View.OnFocusChangeListener)localObject);
      if (this.paI == null) {
        break label396;
      }
      this.pdA.setText(this.paI.field_desc);
    }
    for (;;)
    {
      bNo();
      if (bNn()) {
        a(new t("", "", null), true, false);
      }
      return;
      this.pdE.bQN();
      break;
      label396:
      this.pdA.setVisibility(8);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.pdE.d(paramInt1, paramInt2, paramIntent)) {
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet/bind/ui/WalletResetInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */