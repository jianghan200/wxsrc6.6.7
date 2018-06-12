package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.p;

public final class h
  implements e, MobileInputUI.b
{
  private MobileInputUI eSu;
  private String eSv;
  private String eSw;
  private int eSx = 0;
  
  private void YH()
  {
    Object localObject = this.eSu;
    MobileInputUI localMobileInputUI = this.eSu;
    this.eSu.getString(a.j.app_tip);
    ((MobileInputUI)localObject).eIV = com.tencent.mm.ui.base.h.a(localMobileInputUI, this.eSu.getString(a.j.regbyfacebook_reg_setpwd_exiting), true, new h.4(this));
    localObject = new com.tencent.mm.modelfriend.a(this.eSu.eSZ + this.eSu.eTa, 8, "", 0, "");
    g.DF().a((l)localObject, 0);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.MobileInputForgetPwdLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eSu.eIV != null)
    {
      this.eSu.eIV.dismiss();
      this.eSu.eIV = null;
    }
    if (paramInt2 == -75) {
      com.tencent.mm.ui.base.h.i(this.eSu, a.j.alpha_version_tip_reg, a.j.reg_username_exist_title);
    }
    int i;
    do
    {
      do
      {
        return;
        if ((paramInt2 == -41) || (paramInt2 == -59))
        {
          paramString = com.tencent.mm.h.a.eV(paramString);
          if (paramString != null)
          {
            paramString.a(this.eSu, null, null);
            return;
          }
          com.tencent.mm.ui.base.h.i(this.eSu, a.j.regbymobile_reg_mobile_format_err_msg, a.j.regbymobile_reg_mobile_format_err_title);
          return;
        }
      } while (paraml.getType() != 145);
      i = ((com.tencent.mm.modelfriend.a)paraml).Oh();
      if (i == 12)
      {
        if ((paramInt2 == -36) || (paramInt2 == -35) || (paramInt2 == -3))
        {
          paraml = ((com.tencent.mm.modelfriend.a)paraml).Ol();
          if (!bi.oW(paraml)) {
            this.eSu.eTa = paraml.trim();
          }
          this.eSu.eTa = ap.Ww(this.eSu.eTa);
          this.eSw = (this.eSu.eSZ + this.eSu.eTa);
          paraml = new StringBuilder();
          g.Eg();
          paraml = paraml.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",F200_200,");
          g.Eg();
          com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("F200_200") + ",1");
          paramString = com.tencent.mm.h.a.eV(paramString);
          if (paramString != null)
          {
            paramString.a(this.eSu, new DialogInterface.OnClickListener()new h.3
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                h.a(h.this);
                paramAnonymousDialogInterface = new StringBuilder();
                g.Eg();
                paramAnonymousDialogInterface = paramAnonymousDialogInterface.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",F200_200,");
                g.Eg();
                com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("F200_200") + ",2");
              }
            }, new h.3(this));
            return;
          }
          YH();
          paramString = new StringBuilder();
          g.Eg();
          paramString = paramString.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",F200_200,");
          g.Eg();
          com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("F200_200") + ",2");
          return;
        }
        if (paramInt2 == -34)
        {
          com.tencent.mm.ui.base.h.b(this.eSu, this.eSu.getString(a.j.bind_mcontact_err_freq_limit), "", true);
          return;
        }
        Toast.makeText(this.eSu, this.eSu.getString(a.j.bind_mcontact_verify_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      }
    } while ((i != 8) || (paramInt2 != 0));
    paramString = new Intent();
    paramString.putExtra("bindmcontact_mobile", this.eSu.eSZ + " " + this.eSu.eSM.getText().toString());
    paramString.putExtra("bindmcontact_shortmobile", this.eSu.eTa);
    paramString.putExtra("country_name", this.eSu.dYy);
    paramString.putExtra("couttry_code", this.eSu.countryCode);
    paramString.putExtra("mobileverify_countdownsec", ((com.tencent.mm.modelfriend.a)paraml).Oq());
    paramString.putExtra("mobileverify_countdownstyle", ((com.tencent.mm.modelfriend.a)paraml).Or());
    paramString.putExtra("mobileverify_fb", ((com.tencent.mm.modelfriend.a)paraml).Os());
    paramString.putExtra("mobileverify_reg_qq", ((com.tencent.mm.modelfriend.a)paraml).Ot());
    paramString.putExtra("mobile_verify_purpose", 3);
    paramString.setClass(this.eSu, MobileVerifyUI.class);
    this.eSu.startActivity(paramString);
  }
  
  public final void a(MobileInputUI paramMobileInputUI)
  {
    this.eSu = paramMobileInputUI;
    paramMobileInputUI.eSN.requestFocus();
    paramMobileInputUI.showVKB();
    String str2 = paramMobileInputUI.getString(a.j.regbymoile_reg_title);
    String str1 = str2;
    if (d.qVQ) {
      str1 = str2 + paramMobileInputUI.getString(a.j.alpha_version_alpha);
    }
    paramMobileInputUI.setMMTitle(str1);
    paramMobileInputUI.eGq.setVisibility(0);
    paramMobileInputUI.eSM.setVisibility(0);
    paramMobileInputUI.eSN.requestFocus();
    paramMobileInputUI.eSS.setText(a.j.app_nextstep);
    paramMobileInputUI.eSS.setVisibility(0);
  }
  
  public final void jm(int paramInt)
  {
    switch (5.eSz[(paramInt - 1)])
    {
    default: 
      return;
    }
    this.eSu.eSZ = ap.Wy(this.eSu.countryCode);
    this.eSu.eTa = this.eSu.eSM.getText().toString();
    Object localObject1 = this.eSu.eSZ + this.eSu.eTa;
    if (this.eSu.eIV != null)
    {
      x.d("MicroMsg.MobileInputForgetPwdLogic", "already checking ");
      return;
    }
    Object localObject2 = this.eSu;
    MobileInputUI localMobileInputUI = this.eSu;
    this.eSu.getString(a.j.app_tip);
    ((MobileInputUI)localObject2).eIV = com.tencent.mm.ui.base.h.a(localMobileInputUI, this.eSu.getString(a.j.regbyfacebook_reg_setpwd_exiting), true, new h.1(this));
    localObject2 = this.eSu.eSM.getText().toString();
    if ((this.eSv != null) && (this.eSw != null) && (!((String)localObject2).equals(this.eSv)) && (((String)localObject2).equals(this.eSw))) {
      paramInt = 1;
    }
    for (;;)
    {
      localObject1 = new com.tencent.mm.modelfriend.a((String)localObject1, 12, "", 0, "");
      ((com.tencent.mm.modelfriend.a)localObject1).hG(this.eSx);
      ((com.tencent.mm.modelfriend.a)localObject1).hH(paramInt);
      g.DF().a((l)localObject1, 0);
      this.eSv = this.eSu.eSM.getText().toString();
      this.eSx += 1;
      return;
      if ((this.eSv != null) && (this.eSw != null) && (!this.eSw.equals(this.eSv)) && (!((String)localObject2).equals(this.eSw))) {
        paramInt = 2;
      } else {
        paramInt = 0;
      }
    }
  }
  
  public final void start()
  {
    g.DF().a(145, this);
    StringBuilder localStringBuilder = new StringBuilder();
    g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",F200_100,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("F200_100") + ",1");
    com.tencent.mm.plugin.c.a.pT("F200_100");
    this.eSx = 0;
  }
  
  public final void stop()
  {
    g.DF().b(145, this);
    StringBuilder localStringBuilder = new StringBuilder();
    g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",F200_100,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("F200_100") + ",2");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/ui/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */