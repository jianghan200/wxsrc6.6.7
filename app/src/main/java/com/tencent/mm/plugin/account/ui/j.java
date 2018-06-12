package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;

public final class j
  implements e, MobileInputUI.b
{
  protected String eHp = null;
  protected String eHq = "";
  protected int eHr = 2;
  private MobileInputUI eSu;
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MobileInputRegLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eSu.eIV != null)
    {
      this.eSu.eIV.dismiss();
      this.eSu.eIV = null;
    }
    if (paraml.getType() == 132)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label270;
      }
      if (((com.tencent.mm.plugin.account.friend.a.x)paraml).Oh() == 1)
      {
        paramString = new Intent();
        paramString.putExtra("bindmcontact_mobile", this.eSu.eSZ + " " + this.eSu.eSM.getText().toString());
        paramString.putExtra("bindmcontact_shortmobile", this.eSu.eSM.getText().toString());
        paramString.putExtra("country_name", this.eSu.dYy);
        paramString.putExtra("couttry_code", this.eSu.countryCode);
        paramString.putExtra("mobile_verify_purpose", 4);
        paramString.putExtra("regsetinfo_ticket", this.eHp);
        paramString.putExtra("regsetinfo_NextStep", this.eHq);
        paramString.putExtra("regsetinfo_NextStyle", this.eHr);
        paramString.setClass(this.eSu, MobileVerifyUI.class);
        this.eSu.startActivity(paramString);
        this.eSu.finish();
      }
    }
    label270:
    while (a.ezo.a(this.eSu, paramInt1, paramInt2, paramString)) {
      return;
    }
    Toast.makeText(this.eSu, this.eSu.getString(a.j.bind_mcontact_verify_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
  }
  
  public final void a(MobileInputUI paramMobileInputUI)
  {
    this.eSu = paramMobileInputUI;
    paramMobileInputUI.eSN.requestFocus();
    paramMobileInputUI.showVKB();
    this.eHp = paramMobileInputUI.getIntent().getStringExtra("regsetinfo_ticket");
    this.eHq = paramMobileInputUI.getIntent().getStringExtra("regsetinfo_NextStep");
    this.eHr = paramMobileInputUI.getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    String str2 = paramMobileInputUI.getString(a.j.regbymoile_reg_title);
    String str1 = str2;
    if (d.qVQ) {
      str1 = str2 + paramMobileInputUI.getString(a.j.alpha_version_alpha);
    }
    paramMobileInputUI.setMMTitle(str1);
    paramMobileInputUI.eGq.setVisibility(0);
    paramMobileInputUI.eSM.setVisibility(0);
    paramMobileInputUI.eSN.requestFocus();
    paramMobileInputUI.eSP.setVisibility(0);
    paramMobileInputUI.eSS.setVisibility(0);
    paramMobileInputUI.eSS.setText(a.j.loginby_new_mobile_reg_ok);
  }
  
  public final void jm(int paramInt)
  {
    switch (j.2.eSz[(paramInt - 1)])
    {
    default: 
      return;
    }
    this.eSu.eSZ = ap.Wy(this.eSu.countryCode);
    this.eSu.eTa = this.eSu.eSM.getText().toString();
    Object localObject = this.eSu.eSZ + this.eSu.eTa;
    if (this.eSu.eIV != null)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MobileInputRegLogic", "already checking ");
      return;
    }
    MobileInputUI localMobileInputUI1 = this.eSu;
    MobileInputUI localMobileInputUI2 = this.eSu;
    this.eSu.getString(a.j.app_tip);
    localMobileInputUI1.eIV = h.a(localMobileInputUI2, this.eSu.getString(a.j.regbyfacebook_reg_setpwd_exiting), true, new j.1(this));
    localObject = new com.tencent.mm.plugin.account.friend.a.x((String)localObject, 1, "", 0, "");
    g.DF().a((com.tencent.mm.ab.l)localObject, 0);
  }
  
  public final void start()
  {
    g.DF().a(132, this);
  }
  
  public final void stop()
  {
    g.DF().b(132, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */