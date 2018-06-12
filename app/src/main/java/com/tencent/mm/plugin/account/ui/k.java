package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.al.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.account.a.c;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.model.i;
import com.tencent.mm.plugin.account.model.i.a;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;

public final class k
  implements e, MobileInputUI.b
{
  private String eSE;
  int eSF = 1;
  private MobileInputUI eSu;
  private String eSv;
  private String eSw;
  private int eSx = 0;
  
  private void YH()
  {
    Object localObject = this.eSu;
    MobileInputUI localMobileInputUI = this.eSu;
    this.eSu.getString(a.j.app_tip);
    ((MobileInputUI)localObject).eIV = h.a(localMobileInputUI, this.eSu.getString(a.j.regbyfacebook_reg_setpwd_exiting), true, new k.10(this));
    localObject = new com.tencent.mm.modelfriend.a(this.eSu.eSZ + this.eSu.eTa, 14, "", 0, "");
    ((com.tencent.mm.modelfriend.a)localObject).lD(this.eSE);
    g.DF().a((com.tencent.mm.ab.l)localObject, 0);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.MobileInputRegLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eSu.eIV != null)
    {
      this.eSu.eIV.dismiss();
      this.eSu.eIV = null;
    }
    if (paramInt2 == -75) {
      h.i(this.eSu, a.j.alpha_version_tip_reg, a.j.reg_username_exist_title);
    }
    while (paraml.getType() != 145) {
      return;
    }
    if ((paramInt2 == -41) || (paramInt2 == -59))
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
    int i = ((com.tencent.mm.modelfriend.a)paraml).Oh();
    if (i == 12)
    {
      this.eSu.eTa = ap.Ww(this.eSu.eTa);
      this.eSw = (this.eSu.eSZ + this.eSu.eTa);
      this.eSE = ((com.tencent.mm.modelfriend.a)paraml).Ow();
      if ((paramInt2 == -36) || (paramInt2 == -35) || (paramInt2 == -3))
      {
        paraml = ((com.tencent.mm.modelfriend.a)paraml).Ol();
        if (!bi.oW(paraml)) {
          this.eSu.eTa = paraml.trim();
        }
        paraml = new StringBuilder();
        g.Eg();
        paraml = paraml.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_200,");
        g.Eg();
        com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("R200_200") + ",1");
        paramString = com.tencent.mm.h.a.eV(paramString);
        if (paramString != null)
        {
          paramString.a(this.eSu, new k.8(this), new k.9(this));
          return;
        }
        YH();
        paramString = new StringBuilder();
        g.Eg();
        paramString = paramString.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_200,");
        g.Eg();
        com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("R200_200") + ",2");
        return;
      }
      if (paramInt2 == 65181)
      {
        aa.e(this.eSu, paramString, 32046);
        return;
      }
      if (paramInt2 == -34)
      {
        h.b(this.eSu, this.eSu.getString(a.j.bind_mcontact_err_freq_limit), "", true);
        return;
      }
    }
    Object localObject;
    if (i == 14)
    {
      if ((paramInt2 != 0) && (paramString != null)) {
        break label976;
      }
      if (((com.tencent.mm.modelfriend.a)paraml).Om() != 1) {
        break label708;
      }
      localObject = this.eSu.eSZ + this.eSu.eTa;
      String str = ((com.tencent.mm.modelfriend.a)paraml).Oo();
      paraml = ((com.tencent.mm.modelfriend.a)paraml).On();
      Intent localIntent = new Intent(this.eSu, RegByMobileSendSmsUI.class);
      localIntent.putExtra("from_mobile", (String)localObject);
      localIntent.putExtra("to_mobile", str);
      localIntent.putExtra("verify_code", paraml);
      localIntent.putExtra("key_reg_style", 2);
      localIntent.putExtra("kintent_password", this.eSu.eQO.getText().toString());
      localIntent.putExtra("regsession_id", this.eSE);
      this.eSu.startActivity(localIntent);
    }
    label708:
    label976:
    do
    {
      for (;;)
      {
        paramString = com.tencent.mm.h.a.eV(paramString);
        if ((paramString == null) || (this.eSu == null) || (!paramString.a(this.eSu, null, null))) {
          break;
        }
        return;
        com.tencent.mm.plugin.c.a.pU("R200_300");
        localObject = new Intent();
        ((Intent)localObject).putExtra("bindmcontact_mobile", this.eSu.eSZ + " " + this.eSu.eSM.getText().toString());
        ((Intent)localObject).putExtra("bindmcontact_shortmobile", this.eSu.eTa);
        ((Intent)localObject).putExtra("country_name", this.eSu.dYy);
        ((Intent)localObject).putExtra("couttry_code", this.eSu.countryCode);
        ((Intent)localObject).putExtra("mobileverify_countdownsec", ((com.tencent.mm.modelfriend.a)paraml).Oq());
        ((Intent)localObject).putExtra("mobileverify_countdownstyle", ((com.tencent.mm.modelfriend.a)paraml).Or());
        ((Intent)localObject).putExtra("mobileverify_fb", ((com.tencent.mm.modelfriend.a)paraml).Os());
        ((Intent)localObject).putExtra("mobileverify_reg_qq", ((com.tencent.mm.modelfriend.a)paraml).Ot());
        ((Intent)localObject).putExtra("key_reg_style", 2);
        ((Intent)localObject).putExtra("kintent_password", this.eSu.eQO.getText().toString());
        ((Intent)localObject).putExtra("mobile_verify_purpose", 2);
        ((Intent)localObject).putExtra("regsession_id", this.eSE);
        ((Intent)localObject).setClass(this.eSu, MobileVerifyUI.class);
        this.eSu.startActivity((Intent)localObject);
        i.jj(i.a.eOl);
      }
      if (paramInt2 == -34)
      {
        h.b(this.eSu, this.eSu.getString(a.j.bind_mcontact_err_freq_limit), "", true);
        return;
      }
    } while (!com.tencent.mm.plugin.account.a.a.ezo.a(this.eSu, paramInt1, paramInt2, paramString));
  }
  
  public final void a(final MobileInputUI paramMobileInputUI)
  {
    this.eSu = paramMobileInputUI;
    String str1 = "";
    if (d.qVQ) {
      str1 = "" + paramMobileInputUI.getString(a.j.alpha_version_alpha);
    }
    paramMobileInputUI.setMMTitle(str1);
    paramMobileInputUI.showOptionMenu(false);
    paramMobileInputUI.eST.setVisibility(0);
    paramMobileInputUI.eST.setVisibility(0);
    paramMobileInputUI.eGq.setVisibility(0);
    paramMobileInputUI.eSM.setVisibility(0);
    paramMobileInputUI.eSN.requestFocus();
    paramMobileInputUI.eSP.setVisibility(0);
    paramMobileInputUI.eSa.setVisibility(0);
    paramMobileInputUI.eSX.setVisibility(8);
    paramMobileInputUI.eSS.setVisibility(0);
    paramMobileInputUI.eSS.setText(a.j.loginby_new_mobile_reg_ok);
    if (paramMobileInputUI.eSR != null) {
      paramMobileInputUI.eSR.setOnClickListener(new k.1(this, paramMobileInputUI));
    }
    str1 = paramMobileInputUI.getString(a.j.license_agree_text);
    String str2;
    String str3;
    String str4;
    Spannable localSpannable;
    if (w.chM())
    {
      str2 = paramMobileInputUI.getString(a.j.license_detail);
      str3 = paramMobileInputUI.getString(a.j.privacy_detail);
      str4 = paramMobileInputUI.getString(a.j.and);
      localSpannable = Spannable.Factory.getInstance().newSpannable(str1 + "  " + str2 + str4 + str3);
      localSpannable.setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          bi.L(paramMobileInputUI.mController.tml, paramMobileInputUI.getString(a.j.url_agreement));
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          paramAnonymousTextPaint.setColor(paramMobileInputUI.getResources().getColor(a.c.link_color));
          paramAnonymousTextPaint.setUnderlineText(true);
        }
      }, str1.length() + "  ".length(), str1.length() + str2.length() + "  ".length(), 33);
      localSpannable.setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          bi.L(paramMobileInputUI, ad.getResources().getString(a.j.license_read_url, new Object[] { w.fD(paramMobileInputUI), w.chO(), "setting", Integer.valueOf(1), Integer.valueOf(0) }));
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          paramAnonymousTextPaint.setColor(paramMobileInputUI.getResources().getColor(a.c.link_color));
          paramAnonymousTextPaint.setUnderlineText(true);
        }
      }, str1.length() + "  ".length() + str2.length() + str4.length(), str1.length() + str2.length() + "  ".length() + str4.length() + str3.length(), 33);
      paramMobileInputUI.eSQ.setText(localSpannable);
    }
    for (;;)
    {
      paramMobileInputUI.eSQ.setMovementMethod(LinkMovementMethod.getInstance());
      return;
      str2 = paramMobileInputUI.getString(a.j.license_terms_of_service);
      str3 = paramMobileInputUI.getString(a.j.license_privacy_policy);
      str4 = paramMobileInputUI.getString(a.j.and);
      localSpannable = Spannable.Factory.getInstance().newSpannable(str1 + "  " + str2 + str4 + str3);
      localSpannable.setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          bi.L(paramMobileInputUI.mController.tml, paramMobileInputUI.getString(a.j.url_terms_of_service));
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          paramAnonymousTextPaint.setColor(paramMobileInputUI.getResources().getColor(a.c.link_color));
          paramAnonymousTextPaint.setUnderlineText(true);
        }
      }, str1.length() + "  ".length(), str1.length() + "  ".length() + str2.length(), 33);
      localSpannable.setSpan(new k.6(this, paramMobileInputUI), str1.length() + str2.length() + "  ".length() + str4.length(), str1.length() + str2.length() + "  ".length() + str4.length() + str3.length(), 33);
      paramMobileInputUI.eSQ.setText(localSpannable);
    }
  }
  
  public final void jm(int paramInt)
  {
    switch (k.2.eSz[(paramInt - 1)])
    {
    default: 
      return;
    }
    this.eSu.YC();
    Object localObject1;
    switch (this.eSF)
    {
    default: 
      this.eSu.eSZ = ap.Wy(this.eSu.countryCode);
      this.eSu.eTa = this.eSu.eSM.getText().toString();
      localObject1 = this.eSu.eSZ + this.eSu.eTa;
      if (com.tencent.mm.platformtools.a.F(this.eSu, this.eSu.eQO.getText().toString()))
      {
        if (this.eSu.eIV == null) {
          break label265;
        }
        x.d("MicroMsg.MobileInputRegLogic", "already checking ");
      }
      break;
    }
    for (;;)
    {
      this.eSF = 0;
      return;
      YH();
      continue;
      localObject1 = this.eSu.getString(a.j.license_read_url, new Object[] { w.chP(), b.l(this.eSu, this.eSu.countryCode, this.eSu.getString(a.j.country_code)), "reg", Integer.valueOf(1), Integer.valueOf(0) });
      com.tencent.mm.platformtools.a.b(this.eSu, (String)localObject1, 32047, false);
    }
    label265:
    Object localObject2 = this.eSu;
    MobileInputUI localMobileInputUI = this.eSu;
    this.eSu.getString(a.j.app_tip);
    ((MobileInputUI)localObject2).eIV = h.a(localMobileInputUI, this.eSu.getString(a.j.regbyfacebook_reg_setpwd_exiting), true, new k.7(this));
    localObject2 = this.eSu.eSM.getText().toString();
    if ((this.eSv != null) && (this.eSw != null) && (!((String)localObject2).equals(this.eSv)) && (((String)localObject2).equals(this.eSw))) {
      paramInt = 1;
    }
    for (;;)
    {
      localObject1 = new com.tencent.mm.modelfriend.a((String)localObject1, 12, "", 0, "");
      ((com.tencent.mm.modelfriend.a)localObject1).hG(this.eSx);
      ((com.tencent.mm.modelfriend.a)localObject1).hH(paramInt);
      g.DF().a((com.tencent.mm.ab.l)localObject1, 0);
      this.eSv = this.eSu.eSM.getText().toString();
      this.eSx += 1;
      break;
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
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_100,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("R200_100") + ",1");
    com.tencent.mm.plugin.c.a.pT("R200_100");
    this.eSx = 0;
  }
  
  public final void stop()
  {
    g.DF().b(145, this);
    StringBuilder localStringBuilder = new StringBuilder();
    g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_100,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R200_100") + ",2");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/ui/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */