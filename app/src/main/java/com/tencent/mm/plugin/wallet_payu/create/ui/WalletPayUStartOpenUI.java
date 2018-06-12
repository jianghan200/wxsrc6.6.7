package com.tencent.mm.plugin.wallet_payu.create.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_payu.a.c;
import com.tencent.mm.plugin.wallet_payu.create.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.MMFormMobileInputView;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.c.v;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(3)
public class WalletPayUStartOpenUI
  extends WalletBaseUI
{
  private String eTa;
  private WalletPayUOpenIntroView pEK;
  private MMFormMobileInputView pEL;
  private EditText pEM;
  private EditText pEN;
  private Button pEO;
  private TextView pEP;
  private TextView pEQ;
  private String pER;
  
  private String bNr()
  {
    if (this.pEL.getCountryCode().startsWith("+")) {
      return this.pEL.getCountryCode().substring(1);
    }
    return this.pEL.getCountryCode();
  }
  
  private void bRj()
  {
    if (this.pEL.getVisibility() == 0) {
      if ((bi.oW(bNr())) || (bi.oW(this.pEN.getText().toString()))) {
        break label70;
      }
    }
    label70:
    for (int i = 1; i != 0; i = 0)
    {
      this.pER = bNr();
      this.eTa = this.pEL.getMobileNumber();
      this.pEO.setEnabled(true);
      return;
    }
    this.pEO.setEnabled(false);
  }
  
  protected final boolean bND()
  {
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.payu_ui_startopen;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eTa = this.sy.getString("key_mobile");
    this.pER = this.sy.getString("dial_code");
    if (bi.oW(this.pER)) {
      this.pER = "27";
    }
    this.pEK = ((WalletPayUOpenIntroView)findViewById(a.f.intro_view));
    this.pEK.setPagerData(new d[] { new d(a.e.payu_open_logo_1, a.i.wallet_payu_start_tip_1, a.i.wallet_payu_start_hint_1), new d(a.e.payu_open_logo_2, a.i.wallet_payu_start_tip_2, a.i.wallet_payu_start_hint_2), new d(a.e.payu_open_logo_3, a.i.wallet_payu_start_tip_3, a.i.wallet_payu_start_hint_3) });
    this.pEL = ((MMFormMobileInputView)findViewById(a.f.start_mobile_et));
    this.pEO = ((Button)findViewById(a.f.start_btn));
    this.pEM = this.pEL.getCountryCodeEditText();
    this.pEN = this.pEL.getMobileNumberEditText();
    if (!bi.oW(this.eTa)) {
      this.pEN.setText(this.eTa);
    }
    if (!bi.oW(this.pER)) {
      this.pEM.setText(this.pER);
    }
    paramBundle = new WalletPayUStartOpenUI.1(this);
    this.pEN.addTextChangedListener(paramBundle);
    this.pEM.addTextChangedListener(paramBundle);
    this.pEO.setOnClickListener(new WalletPayUStartOpenUI.2(this));
    this.pEP = ((TextView)findViewById(a.f.start_introduction_tv));
    c.a(this, this.pEP);
    this.pEQ = ((TextView)findViewById(a.f.start_power_tv));
    this.pEQ.setText(v.cDl());
  }
  
  public void onResume()
  {
    super.onResume();
    bRj();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/create/ui/WalletPayUStartOpenUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */