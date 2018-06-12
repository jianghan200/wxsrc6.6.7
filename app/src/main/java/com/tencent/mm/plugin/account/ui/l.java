package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bt;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.account.a.c;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.applet.SecurityImage.b;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;
import com.tencent.mm.ui.base.p;

public final class l
  implements e, MobileInputUI.b
{
  String account;
  private String cbP;
  SecurityImage eIX = null;
  private String eOW;
  private boolean eRr = true;
  String eSH;
  private String eSe;
  MobileInputUI eSu;
  
  private void YI()
  {
    if (this.eSu.dBM == 6)
    {
      this.eSu.eSO.reset();
      this.eSu.eSW.setText(a.j.login_login_by_password);
      this.eSu.eSa.setVisibility(8);
      this.eSu.eSO.setVisibility(0);
      this.eSu.eSO.getContentEditText().requestFocus();
      this.eSu.eSO.setSendSmsBtnClickListener(new l.9(this));
      this.eSu.eSW.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          l.this.eSu.eRw[1] = 2;
          l.this.eSu.dBM = 7;
          l.this.eSu.eSO.reset();
          com.tencent.mm.kernel.g.DF().b(145, l.this);
          l.a(l.this);
        }
      });
    }
    while (this.eSu.dBM != 7) {
      return;
    }
    this.eSu.eSW.setText(a.j.login_login_by_sms);
    this.eSu.eSa.setVisibility(0);
    this.eSu.eQO.requestFocus();
    this.eSu.eSO.setVisibility(8);
    this.eSu.eSW.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        l.this.eSu.eRw[1] = 1;
        l.this.eSu.dBM = 6;
        com.tencent.mm.kernel.g.DF().a(145, l.this);
        l.a(l.this);
      }
    });
  }
  
  private void aN(String paramString1, String paramString2)
  {
    if (bi.oW(paramString1))
    {
      com.tencent.mm.ui.base.h.i(this.eSu, a.j.verify_username_null_tip, a.j.login_err_title);
      return;
    }
    if (bi.oW(paramString2))
    {
      com.tencent.mm.ui.base.h.i(this.eSu, a.j.verify_password_null_tip, a.j.login_err_title);
      return;
    }
    this.eSu.eQO.setText(paramString2);
    this.eSu.YC();
    paramString1 = new com.tencent.mm.modelsimple.q(paramString1, paramString2, null, 1);
    com.tencent.mm.kernel.g.DF().a(paramString1, 0);
    paramString2 = this.eSu;
    MobileInputUI localMobileInputUI = this.eSu;
    this.eSu.getString(a.j.app_tip);
    paramString2.eIV = com.tencent.mm.ui.base.h.a(localMobileInputUI, this.eSu.getString(a.j.login_logining), true, new l.14(this, paramString1));
  }
  
  private boolean e(int paramInt1, int paramInt2, String paramString)
  {
    boolean bool2 = false;
    boolean bool1;
    if (com.tencent.mm.plugin.account.a.a.ezo.a(this.eSu, paramInt1, paramInt2, paramString)) {
      bool1 = true;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramInt1 != 4);
      switch (paramInt2)
      {
      default: 
        return false;
      case -140: 
        if (!bi.oW(this.cbP)) {
          aa.n(this.eSu, paramString, this.cbP);
        }
        return true;
      case -1: 
        bool1 = bool2;
      }
    } while (com.tencent.mm.kernel.g.DF().Lg() != 5);
    com.tencent.mm.ui.base.h.i(this.eSu, a.j.net_warn_server_down_tip, a.j.net_warn_server_down);
    return true;
    com.tencent.mm.ui.base.h.i(this.eSu, a.j.errcode_password, a.j.login_err_title);
    return true;
    com.tencent.mm.ui.base.h.i(this.eSu, a.j.login_err_mailnotverify, a.j.login_err_title);
    return true;
    com.tencent.mm.kernel.g.Eg();
    com.tencent.mm.kernel.a.hold();
    MobileInputUI localMobileInputUI = this.eSu;
    com.tencent.mm.kernel.g.Eg();
    if (TextUtils.isEmpty(com.tencent.mm.kernel.a.Dh())) {}
    for (paramString = com.tencent.mm.bp.a.af(this.eSu, a.j.main_err_another_place);; paramString = com.tencent.mm.kernel.a.Dh())
    {
      com.tencent.mm.ui.base.h.a(localMobileInputUI, paramString, this.eSu.getString(a.j.app_tip), new l.6(this), new l.7(this));
      return true;
      com.tencent.mm.kernel.g.Eg();
    }
    Toast.makeText(this.eSu, a.j.bind_mcontact_err_freq_limit, 0).show();
    return true;
    com.tencent.mm.ui.base.h.a(this.eSu, a.j.bind_mcontact_verify_error, a.j.bind_mcontact_verify_tip, null);
    return true;
    com.tencent.mm.ui.base.h.a(this.eSu, a.j.bind_mcontact_verify_err_time_out_content, a.j.bind_mcontact_verify_tip, null);
    return true;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MobileInputIndepPassLoginLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eSu.eIV != null)
    {
      this.eSu.eIV.dismiss();
      this.eSu.eIV = null;
    }
    if (paraml.getType() == 145)
    {
      i = ((com.tencent.mm.modelfriend.a)paraml).Oh();
      if (i == 16) {
        if (paramInt2 == -41)
        {
          this.eSu.eSO.reset();
          com.tencent.mm.ui.base.h.i(this.eSu, a.j.regbymobile_reg_mobile_format_err_msg, a.j.regbymobile_reg_mobile_format_err_title);
        }
      }
    }
    label259:
    Object localObject;
    do
    {
      do
      {
        do
        {
          return;
          if (paramInt2 != -75) {
            break;
          }
          this.eSu.eSO.reset();
          com.tencent.mm.ui.base.h.b(this.eSu, this.eSu.getString(a.j.alpha_version_tip_login), "", true);
          return;
          if (i != 17) {
            break;
          }
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            new g(new l.15(this), ((com.tencent.mm.modelfriend.a)paraml).getUsername(), ((com.tencent.mm.modelfriend.a)paraml).Oi(), this.account).a(this.eSu);
            return;
          }
        } while (e(paramInt1, paramInt2, paramString));
        paraml = com.tencent.mm.h.a.eV(paramString);
        if (paraml != null) {
          paraml.a(this.eSu, null, null);
        }
        paramString = com.tencent.mm.h.a.eV(paramString);
      } while ((paramString == null) || (this.eSu == null) || (!paramString.a(this.eSu, null, null)));
      return;
      if (paraml.getType() != 701) {
        break label1159;
      }
      this.cbP = ((com.tencent.mm.modelsimple.q)paraml).Rd();
      localObject = new f();
      ((f)localObject).eJa = ((com.tencent.mm.modelsimple.q)paraml).Re();
      ((f)localObject).eIZ = ((com.tencent.mm.modelsimple.q)paraml).Rf();
      ((f)localObject).eJb = ((com.tencent.mm.modelsimple.q)paraml).Rg();
      ((f)localObject).eRQ = ((com.tencent.mm.modelsimple.q)paraml).getSecCodeType();
      ((f)localObject).account = ((com.tencent.mm.modelsimple.q)paraml).account;
      ((f)localObject).eIY = this.eSu.eQO.getText().toString();
      if (paramInt2 == -75)
      {
        aa.ch(this.eSu);
        return;
      }
      if (paramInt2 == -106)
      {
        aa.e(this.eSu, paramString, 32045);
        return;
      }
      if (paramInt2 == 65319)
      {
        aa.a(this.eSu, com.tencent.mm.platformtools.f.a((com.tencent.mm.modelsimple.q)paraml), paramInt2);
        return;
      }
      if (paramInt2 == 65331)
      {
        this.eOW = ((com.tencent.mm.modelsimple.q)paraml).Ok();
        paramString = ((com.tencent.mm.modelsimple.q)paraml).Rh();
        paraml = ((com.tencent.mm.modelsimple.q)paraml).Rk();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MobileInputIndepPassLoginLogic", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", new Object[] { bi.Xf(this.eOW), paraml });
        f.a((f)localObject);
        localObject = new Intent();
        ((Intent)localObject).putExtra("auth_ticket", this.eOW);
        ((Intent)localObject).putExtra("binded_mobile", paramString);
        ((Intent)localObject).putExtra("close_safe_device_style", paraml);
        ((Intent)localObject).putExtra("from_source", 6);
        com.tencent.mm.plugin.account.a.a.ezn.g(this.eSu, (Intent)localObject);
        return;
      }
      if (paramInt2 != 65396) {
        break;
      }
    } while (bi.oW(this.cbP));
    aa.n(this.eSu, paramString, this.cbP);
    return;
    if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17))) {
      com.tencent.mm.kernel.g.DF().a(new bg(new l.16(this)), 0);
    }
    for (int i = 1;; i = 0)
    {
      if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
      {
        if (this.eIX == null)
        {
          this.eIX = SecurityImage.a.a(this.eSu, a.j.regbyqq_secimg_title, ((f)localObject).eRQ, ((f)localObject).eIZ, ((f)localObject).eJa, ((f)localObject).eJb, new l.2(this, (f)localObject), null, new l.3(this), (SecurityImage.b)localObject);
          return;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MobileInputIndepPassLoginLogic", "imgSid:" + ((f)localObject).eJa + " img len" + ((f)localObject).eIZ.length + " " + com.tencent.mm.compatible.util.g.Ac());
        this.eIX.a(((f)localObject).eRQ, ((f)localObject).eIZ, ((f)localObject).eJa, ((f)localObject).eJb);
        return;
      }
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        com.tencent.mm.kernel.g.Eg();
        com.tencent.mm.kernel.a.unhold();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MobileInputIndepPassLoginLogic", "login username %s", new Object[] { ((f)localObject).account });
        aa.oS(((f)localObject).account);
        paramString = at.dBv.I("login_weixin_username", "");
        com.tencent.mm.platformtools.x.bZ(this.eSu);
        if (this.eSu.eSf)
        {
          bt.dDs.W(this.eSe, paramString);
          bt.dDs.d(com.tencent.mm.model.q.GF(), com.tencent.mm.model.q.Ho());
          com.tencent.mm.plugin.report.service.h.mEJ.h(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(9), bt.dDs.II() });
        }
        aa.showAddrBookUploadConfirm(this.eSu, new l.4(this), false, 2);
        if (this.eSu.dBM != 6) {
          break;
        }
        this.eRr = ((com.tencent.mm.modelsimple.q)paraml).Rm();
        com.tencent.mm.kernel.g.DF().a(255, this);
        paramString = new r(1);
        com.tencent.mm.kernel.g.DF().a(paramString, 0);
        paraml = this.eSu;
        localObject = this.eSu;
        this.eSu.getString(a.j.app_tip);
        paraml.eIV = com.tencent.mm.ui.base.h.a((Context)localObject, this.eSu.getString(a.j.app_loading), true, new l.5(this, paramString));
        return;
      }
      if (e(paramInt1, paramInt2, paramString)) {
        break;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        break label259;
      }
      Toast.makeText(this.eSu, this.eSu.getString(a.j.fmt_auth_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      break label259;
      label1159:
      if (paraml.getType() != 255) {
        break label259;
      }
      com.tencent.mm.kernel.g.DF().b(255, this);
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        break;
      }
      paramString = this.eSu;
      boolean bool = this.eRr;
      paraml = new Intent(paramString, RegByMobileSetPwdUI.class);
      paraml.putExtra("kintent_hint", paramString.getString(a.j.settings_modify_password_tip));
      paraml.putExtra("kintent_cancelable", bool);
      paramString.startActivity(paraml);
      return;
    }
  }
  
  public final void a(MobileInputUI paramMobileInputUI)
  {
    this.eSu = paramMobileInputUI;
    paramMobileInputUI.eSU.setVisibility(0);
    this.account = paramMobileInputUI.getIntent().getStringExtra("binded_mobile");
    if (bi.oW(this.account)) {
      this.account = ap.Ww(paramMobileInputUI.eSZ + paramMobileInputUI.eTa);
    }
    paramMobileInputUI.eSN.setTextColor(paramMobileInputUI.getResources().getColor(a.c.hint_text_color));
    paramMobileInputUI.eSN.setEnabled(false);
    paramMobileInputUI.eSN.setFocusable(false);
    paramMobileInputUI.eSM.setFocusable(false);
    paramMobileInputUI.eSM.setText(ap.Ww(this.account));
    paramMobileInputUI.eSM.setVisibility(0);
    YI();
    paramMobileInputUI.eSW.setVisibility(0);
    paramMobileInputUI.eSS.setText(a.j.login_login);
    paramMobileInputUI.eSS.setVisibility(0);
    paramMobileInputUI.eSS.setEnabled(true);
    this.eSe = at.dBv.I("login_weixin_username", "");
    this.eOW = paramMobileInputUI.getIntent().getStringExtra("auth_ticket");
    if (!bi.oW(this.eOW)) {
      new ag().postDelayed(new l.1(this), 500L);
    }
  }
  
  public final void jm(int paramInt)
  {
    switch (l.8.eSz[(paramInt - 1)])
    {
    }
    do
    {
      do
      {
        return;
        this.eSu.YC();
        this.eSu.eSZ = ap.Wy(this.eSu.countryCode);
        this.eSu.eTa = this.eSu.eSN.getText().toString();
      } while ((bi.oW(this.eSu.eSZ)) || (bi.oW(this.eSu.eTa)));
      if (this.eSu.dBM == 7)
      {
        if (!bi.oW(this.eSH))
        {
          aN(this.account, this.eSH);
          return;
        }
        aN(this.account, this.eSu.eQO.getText().toString());
        return;
      }
    } while (this.eSu.dBM != 6);
    final Object localObject = this.eSu.eSO.getText().toString().trim();
    if (bi.oW((String)localObject))
    {
      com.tencent.mm.ui.base.h.i(this.eSu, a.j.verify_seccode_tip, a.j.login_err_title);
      return;
    }
    this.eSu.YC();
    localObject = new com.tencent.mm.modelfriend.a(this.account, 17, (String)localObject, 0, "");
    com.tencent.mm.kernel.g.DF().a((com.tencent.mm.ab.l)localObject, 0);
    MobileInputUI localMobileInputUI1 = this.eSu;
    MobileInputUI localMobileInputUI2 = this.eSu;
    this.eSu.getString(a.j.app_tip);
    localMobileInputUI1.eIV = com.tencent.mm.ui.base.h.a(localMobileInputUI2, this.eSu.getString(a.j.bind_mcontact_verifing), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        com.tencent.mm.kernel.g.DF().c(localObject);
      }
    });
  }
  
  public final void start()
  {
    com.tencent.mm.kernel.g.DF().a(701, this);
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
    com.tencent.mm.kernel.g.DF().b(701, this);
    com.tencent.mm.kernel.g.DF().b(145, this);
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",L200_100,");
    com.tencent.mm.kernel.g.Eg();
    com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("L200_100") + ",2");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/ui/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */