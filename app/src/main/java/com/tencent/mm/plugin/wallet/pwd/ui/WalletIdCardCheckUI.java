package com.tencent.mm.plugin.wallet.pwd.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.model.q;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import com.tencent.mm.wallet_core.ui.formview.a.a;

@com.tencent.mm.ui.base.a(3)
public class WalletIdCardCheckUI
  extends WalletBaseUI
  implements TextView.OnEditorActionListener, WalletFormView.a
{
  private WalletFormView phM;
  private TextView phN;
  private TextView phO;
  private Button phP;
  private int phQ = 1;
  
  protected final void baT()
  {
    x.d("Micromsg.WalletIdCardCheckUI", "check pwd ");
    this.uYO.baT();
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  public final void fE(boolean paramBoolean)
  {
    this.phO.setVisibility(4);
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_check_id_card;
  }
  
  protected final void initView()
  {
    this.phM = ((WalletFormView)findViewById(a.f.identity_et));
    this.phO = ((TextView)findViewById(a.f.wallet_card_identify_err_hint));
    this.phN = ((TextView)findViewById(a.f.wallet_card_identify_tipmsg));
    this.phM.setOnInputValidChangeListener(this);
    this.phM.setOnEditorActionListener(this);
    this.phO.setVisibility(4);
    this.phP = ((Button)findViewById(a.f.install_query));
    com.tencent.mm.wallet_core.ui.formview.a.d(this.phM);
    d(this.phM, 1, false);
    this.phP.setOnClickListener(new WalletIdCardCheckUI.2(this));
    this.phQ = o.bOW().bPy();
    Object localObject1 = o.bOW();
    if (((ag)localObject1).prA != null)
    {
      localObject1 = ((ag)localObject1).prA.field_cre_name;
      x.i("Micromsg.WalletIdCardCheckUI", "mIdentityType %d %s", new Object[] { Integer.valueOf(this.phQ), localObject1 });
      if (!bi.oW((String)localObject1)) {
        break label300;
      }
      localObject1 = o.bPe().Q(this, this.phQ);
    }
    label300:
    for (;;)
    {
      Object localObject2 = this.phM;
      int i = this.phQ;
      localObject2 = ((WalletFormView)localObject2).getLogicDelegate();
      if ((localObject2 instanceof a.a)) {
        ((a.a)localObject2).Hf(i);
      }
      this.phM.setTitleText((String)localObject1);
      this.phM.bqn();
      if (this.phQ == 1) {
        d(this.phM, 1, false);
      }
      for (;;)
      {
        localObject1 = o.bOW().aCl();
        this.phM.setHint(getString(a.i.wallet_password_setting_digitalcert_hint, new Object[] { e.acc((String)localObject1) }));
        return;
        localObject1 = "";
        break;
        d(this.phM, 1, true);
      }
    }
  }
  
  public final boolean k(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.d("Micromsg.WalletIdCardCheckUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paraml instanceof g))) {
      h.a(this, getString(a.i.wallet_password_setting_digitalcert_install_ok), "", getString(a.i.wallet_i_know_it), false, new WalletIdCardCheckUI.3(this));
    }
    return true;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.i.wallet_password_setting_digitalcert_install_title);
    jr(1580);
    initView();
    setBackBtn(new WalletIdCardCheckUI.1(this));
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(1580);
  }
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((this.kMk != null) && (this.kMk.isShown()))
    {
      this.kMk.setVisibility(8);
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/ui/WalletIdCardCheckUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */