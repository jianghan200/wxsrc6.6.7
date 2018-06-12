package com.tencent.mm.plugin.wallet_core.id_verify;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wallet_core.id_verify.model.d;
import com.tencent.mm.plugin.wallet_core.id_verify.model.g;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import com.tencent.mm.wallet_core.ui.formview.a;
import com.tencent.mm.wallet_core.ui.formview.a.a;
import com.tencent.mm.wallet_core.ui.formview.a.b;

public class WalletRealNameVerifyUI
  extends WalletBaseUI
  implements View.OnClickListener, WalletFormView.a
{
  private String countryCode;
  private String dDe;
  private String dDf;
  private Button eWk;
  private TextView kyF;
  private Profession[] pjD;
  private ElementQuery pkA;
  private Profession pkB;
  private boolean pkC = false;
  private boolean pkD = false;
  private WalletFormView pku;
  private WalletFormView pkv;
  private WalletFormView pkw;
  private WalletFormView pkx;
  private CheckBox pky;
  private TextView pkz;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    boolean bool2 = false;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof d))
      {
        c localc = cDK();
        paramString = null;
        if (localc != null) {
          paramString = localc.jfZ;
        }
        paraml = ((d)paraml).token;
        x.i("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify response succ");
        if (localc != null)
        {
          paramString.putString("key_real_name_token", paraml);
          paramString.putString("key_country_code", this.countryCode);
          paramString.putString("key_province_code", this.dDf);
          paramString.putString("key_city_code", this.dDe);
          paramString.putParcelable("key_profession", this.pkB);
          localc.a(this, 0, paramString);
        }
        return true;
      }
      if ((paraml instanceof g))
      {
        paramString = (g)paraml;
        if (paramString.pjB == 1) {}
        for (boolean bool1 = true;; bool1 = false)
        {
          this.pkC = bool1;
          bool1 = bool2;
          if (paramString.pjC == 1) {
            bool1 = true;
          }
          this.pkD = bool1;
          if (!this.pkD) {
            this.pkw.setVisibility(8);
          }
          if (!this.pkC) {
            this.pkx.setVisibility(8);
          }
          if ((this.pkC) || (this.pkD)) {
            this.pkz.setText(a.i.wallet_real_name_verify_desc2);
          }
          this.pjD = paramString.pkS;
          return true;
        }
      }
    }
    else
    {
      x.e("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify response fail");
    }
    return false;
  }
  
  public final void fE(boolean paramBoolean)
  {
    x.d("MicroMsg.WalletRealNameVerifyUI", "check info");
    String str1 = this.pku.getText();
    String str2 = this.pkv.getText();
    int i;
    if (bi.oW(str1)) {
      i = 0;
    }
    for (;;)
    {
      if (i == 0)
      {
        this.eWk.setEnabled(false);
        this.eWk.setClickable(false);
        return;
        if (bi.oW(str2))
        {
          i = 0;
          continue;
        }
        if (this.pkC)
        {
          if ((!bi.oW(this.countryCode)) || (!bi.oW(this.dDf)) || (!bi.oW(this.dDe))) {}
          for (i = 1;; i = 0)
          {
            if (i != 0) {
              break label120;
            }
            i = 0;
            break;
          }
        }
        label120:
        if ((this.pkD) && (this.pkB == null)) {
          i = 0;
        }
      }
      else
      {
        this.eWk.setEnabled(true);
        this.eWk.setClickable(true);
        return;
      }
      i = 1;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_real_name_verify_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.wallet_real_name_verify_title);
    this.eWk = ((Button)findViewById(a.f.next_btn));
    this.pku = ((WalletFormView)findViewById(a.f.name_et));
    this.pkv = ((WalletFormView)findViewById(a.f.card_num_et));
    this.pkw = ((WalletFormView)findViewById(a.f.private_profession_et));
    this.pkx = ((WalletFormView)findViewById(a.f.private_address_et));
    this.pkz = ((TextView)findViewById(a.f.input_tip));
    this.pku.setOnInputValidChangeListener(this);
    this.pkv.setOnInputValidChangeListener(this);
    this.pkw.setOnInputValidChangeListener(this);
    this.pkx.setOnInputValidChangeListener(this);
    this.pku.setFocusable(true);
    this.pku.getInfoIv().setVisibility(8);
    a.d(this.pkv);
    b localb = this.pkv.getLogicDelegate();
    if ((localb instanceof a.a)) {
      ((a.a)localb).Hf(1);
    }
    this.pkw.setOnClickListener(new WalletRealNameVerifyUI.1(this));
    this.pkx.setOnClickListener(new WalletRealNameVerifyUI.2(this));
    this.eWk.setOnClickListener(new WalletRealNameVerifyUI.3(this));
    d(this.pkv, 1, false);
    setBackBtn(new WalletRealNameVerifyUI.4(this));
    this.pky = ((CheckBox)findViewById(a.f.agree_wx_cb));
    this.kyF = ((TextView)findViewById(a.f.agree_tv));
    this.pky.setChecked(true);
    this.pky.setOnCheckedChangeListener(new WalletRealNameVerifyUI.5(this));
    this.kyF.setOnClickListener(new WalletRealNameVerifyUI.6(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1) {
      if (paramInt2 == -1)
      {
        this.pkB = ((Profession)paramIntent.getParcelableExtra("key_select_profession"));
        this.pkw.setText(this.pkB.pkT);
      }
    }
    while (paramInt1 != 2)
    {
      return;
      x.i("MicroMsg.WalletRealNameVerifyUI", "no choose!");
      return;
    }
    if (paramInt2 == -1)
    {
      String str1 = paramIntent.getStringExtra("CountryName");
      String str2 = paramIntent.getStringExtra("ProviceName");
      String str3 = paramIntent.getStringExtra("CityName");
      this.countryCode = paramIntent.getStringExtra("Country");
      this.dDf = paramIntent.getStringExtra("Contact_Province");
      this.dDe = paramIntent.getStringExtra("Contact_City");
      paramIntent = new StringBuilder();
      if (!bi.oW(str1)) {
        paramIntent.append(str1);
      }
      if (!bi.oW(str2)) {
        paramIntent.append(" ").append(str2);
      }
      if (!bi.oW(str3)) {
        paramIntent.append(" ").append(str3);
      }
      this.pkx.setText(paramIntent.toString());
      return;
    }
    x.i("MicroMsg.WalletRealNameVerifyUI", "no area choose!");
  }
  
  public void onClick(View paramView) {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.uYO.jr(1616);
    this.pkA = ((ElementQuery)this.sy.getParcelable("elemt_query"));
    initView();
    a(new g(), true, false);
  }
  
  public void onDestroy()
  {
    this.uYO.js(1616);
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */