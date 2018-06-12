package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;

public final class i
  implements e, MobileInputUI.b
{
  private SecurityImage eIX = null;
  private g eSA = null;
  private MobileInputUI eSu;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.MobileInputLoginLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eSu.eIV != null)
    {
      this.eSu.eIV.dismiss();
      this.eSu.eIV = null;
    }
    if ((paraml.getType() == 701) && (this.eSA != null))
    {
      this.eSA.eSi = this.eSu.eSi;
      this.eSA.a(this.eSu, paramInt1, paramInt2, paramString, paraml);
    }
    while ((paraml.getType() != 145) || (((com.tencent.mm.modelfriend.a)paraml).Oh() != 13)) {
      return;
    }
    if (paramInt2 == -41)
    {
      paramString = com.tencent.mm.h.a.eV(paramString);
      if (paramString != null)
      {
        paramString.a(this.eSu, null, null);
        return;
      }
      h.i(this.eSu, a.j.regbymobile_reg_mobile_format_err_msg, a.j.regbymobile_reg_mobile_format_err_title);
      return;
    }
    if (paramInt2 == -1)
    {
      Toast.makeText(this.eSu, this.eSu.getString(a.j.fmt_auth_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      return;
    }
    if (paramInt2 == -34)
    {
      h.b(this.eSu, this.eSu.getString(a.j.bind_mcontact_err_freq_limit), "", true);
      return;
    }
    this.eSu.YC();
    paramString = new Intent(this.eSu, MobileInputUI.class);
    paramString.putExtra("mobile_input_purpose", -1);
    paramString.putExtra("mobile_auth_type", 7);
    paramString.putExtra("from_switch_account", this.eSu.eSf);
    paramString.putExtra("couttry_code", this.eSu.countryCode);
    paramString.putExtra("input_mobile_number", this.eSu.eTa);
    this.eSu.startActivity(paramString);
  }
  
  public final void a(MobileInputUI paramMobileInputUI)
  {
    this.eSu = paramMobileInputUI;
    paramMobileInputUI.eGq.setVisibility(0);
    paramMobileInputUI.eSM.setVisibility(0);
    paramMobileInputUI.eSN.requestFocus();
    paramMobileInputUI.eSS.setText(a.j.app_nextstep);
    paramMobileInputUI.eSS.setVisibility(0);
    paramMobileInputUI.eSU.setVisibility(0);
    paramMobileInputUI.eSW.setText(a.j.login_by_other_account);
    paramMobileInputUI.eSW.setVisibility(0);
    paramMobileInputUI.eSW.setOnClickListener(new i.1(this, paramMobileInputUI));
  }
  
  public final void jm(int paramInt)
  {
    switch (i.3.eSz[(paramInt - 1)])
    {
    default: 
      return;
    }
    this.eSu.eSZ = ap.Wy(this.eSu.countryCode);
    this.eSu.eTa = this.eSu.eSN.getText().toString();
    Object localObject = ap.Ww(this.eSu.eSZ + this.eSu.eTa);
    MobileInputUI localMobileInputUI1 = this.eSu;
    MobileInputUI localMobileInputUI2 = this.eSu;
    this.eSu.getString(a.j.app_tip);
    localMobileInputUI1.eIV = h.a(localMobileInputUI2, this.eSu.getString(a.j.regbyfacebook_reg_setpwd_exiting), true, new i.2(this));
    localObject = new com.tencent.mm.modelfriend.a((String)localObject, 13, "", 0, "");
    com.tencent.mm.kernel.g.DF().a((l)localObject, 0);
  }
  
  public final void start()
  {
    com.tencent.mm.kernel.g.DF().a(145, this);
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",L200_100,");
    com.tencent.mm.kernel.g.Eg();
    com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("L200_100") + ",1");
    com.tencent.mm.plugin.c.a.pT("L200_100");
  }
  
  public final void stop()
  {
    com.tencent.mm.kernel.g.DF().b(145, this);
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",L200_100,");
    com.tencent.mm.kernel.g.Eg();
    com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("L200_100") + ",2");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */