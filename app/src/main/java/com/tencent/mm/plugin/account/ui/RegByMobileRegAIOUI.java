package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.o;
import com.tencent.mm.al.b;
import com.tencent.mm.al.b.a;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.plugin.account.a.c;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.i;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ah.a;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.p;

public class RegByMobileRegAIOUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private String countryCode = null;
  private String dYy = null;
  private ImageView eCl;
  private LinearLayout eGq;
  private TextView eGs;
  private String eGw = null;
  private String eHy;
  private p eIV;
  private int eLS;
  private ProgressBar eNA;
  private ag eNF = new RegByMobileRegAIOUI.13(this);
  private com.tencent.mm.ui.widget.a.c eNq = null;
  private String eQJ = null;
  private com.tencent.mm.sdk.b.c eQf = new RegByMobileRegAIOUI.1(this);
  private ResizeLayout eRf;
  private String eSE;
  private TextView eSQ;
  private Button eSS;
  private boolean eSY = true;
  private final int eSj = 128;
  private String eSv;
  private String eSw;
  private int eSx = 0;
  private String eTa = null;
  private EditText eUI;
  private MMFormInputView eUJ;
  private String eUK = null;
  private MMFormInputView eUL;
  private boolean eUM = false;
  private ImageView eUN;
  private MMFormInputView eUO;
  private boolean eUP;
  private boolean eUQ;
  private ScrollView eUR;
  private boolean eUS = false;
  private boolean eUT = true;
  private s eUU;
  private boolean eUV = false;
  private s.a eUW = new RegByMobileRegAIOUI.14(this);
  private int eUX;
  private int eUY;
  private boolean eUZ;
  private boolean eVa;
  private int progress = 0;
  
  private void WL()
  {
    com.tencent.mm.plugin.c.a.pU(this.eHy);
    StringBuilder localStringBuilder = new StringBuilder();
    g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",RE200_100,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("RE200_100") + ",2");
    finish();
    overridePendingTransition(a.a.anim_not_change, a.a.anim_not_change);
  }
  
  private void YK()
  {
    if ((!bi.oW(this.dYy)) && (!bi.oW(this.countryCode)))
    {
      this.eGs.setText(ap.fP(this.dYy, this.countryCode));
      return;
    }
    this.eGs.setText(getString(a.j.mobile_code_error));
  }
  
  private void YV()
  {
    getString(a.j.app_tip);
    this.eIV = com.tencent.mm.ui.base.h.a(this, getString(a.j.regbyfacebook_reg_setpwd_exiting), true, new RegByMobileRegAIOUI.11(this));
    com.tencent.mm.modelfriend.a locala = new com.tencent.mm.modelfriend.a(this.eUK + this.eTa, 14, "", 0, "");
    locala.lD(this.eSE);
    g.DF().a(locala, 0);
  }
  
  private boolean YW()
  {
    if (bi.oW(this.countryCode)) {}
    for (int i = 0;; i = 1)
    {
      if (this.eUQ) {}
      for (boolean bool = i & a(new Editable[] { this.eUI.getText(), this.eUL.getText(), this.eUO.getText() }); bool; bool = i & a(new Editable[] { this.eUI.getText(), this.eUO.getText() }))
      {
        this.eSS.setEnabled(true);
        return bool;
      }
      this.eSS.setEnabled(false);
      return bool;
    }
  }
  
  private boolean a(Editable... paramVarArgs)
  {
    int j = paramVarArgs.length;
    int i = 0;
    if (i < j)
    {
      Editable localEditable = paramVarArgs[i];
      if ((localEditable != null) && (localEditable.toString().length() != 0)) {}
    }
    for (i = 0;; i = 1)
    {
      if ((i != 0) && (this.eSY))
      {
        return true;
        i += 1;
        break;
      }
      return false;
    }
  }
  
  private void pM(String paramString)
  {
    if ((this.eUQ) && (!com.tencent.mm.platformtools.a.F(this, this.eUL.getText().toString()))) {
      return;
    }
    if (this.eIV != null) {
      this.eIV.dismiss();
    }
    getString(a.j.app_tip);
    this.eIV = com.tencent.mm.ui.base.h.a(this, getString(a.j.regbyfacebook_reg_setpwd_exiting), true, new RegByMobileRegAIOUI.8(this));
    if (this.eLS == 0)
    {
      String str = ap.Ww(this.eUI.getText().toString().trim());
      int i;
      if ((this.eSv != null) && (this.eSw != null) && (!str.equals(this.eSv)) && (str.equals(this.eSw))) {
        i = 1;
      }
      for (;;)
      {
        paramString = new com.tencent.mm.modelfriend.a(paramString, 12, "", 0, "");
        paramString.hG(this.eSx);
        paramString.hH(i);
        g.DF().a(paramString, 0);
        this.eSv = ap.Ww(this.eUI.getText().toString().trim());
        this.eSx += 1;
        return;
        if ((this.eSv != null) && (this.eSw != null) && (!this.eSw.equals(this.eSv)) && (!str.equals(this.eSw))) {
          i = 2;
        } else {
          i = 0;
        }
      }
    }
    throw new IllegalArgumentException("NO IMPLEMENT");
  }
  
  private void pN(String paramString)
  {
    try
    {
      if (this.eUU != null)
      {
        this.eUU.Zs();
        this.eUU = null;
      }
      if (!this.eUV)
      {
        this.eUV = true;
        finish();
        Intent localIntent = new Intent();
        localIntent.putExtra("bindmcontact_mobile", this.eUK + " " + this.eUI.getText().toString());
        localIntent.putExtra("bindmcontact_shortmobile", this.eTa);
        localIntent.putExtra("country_name", this.dYy);
        localIntent.putExtra("couttry_code", this.countryCode);
        localIntent.putExtra("login_type", this.eLS);
        localIntent.putExtra("mobileverify_countdownsec", this.eUX);
        localIntent.putExtra("mobileverify_countdownstyle", this.eUY);
        localIntent.putExtra("mobileverify_fb", this.eUZ);
        localIntent.putExtra("mobileverify_reg_qq", this.eVa);
        localIntent.putExtra("kintent_nickname", this.eUO.getText().toString());
        localIntent.putExtra("kintent_password", this.eUL.getText().toString());
        localIntent.putExtra("kintent_hasavatar", this.eUM);
        localIntent.putExtra("key_reg_style", 1);
        localIntent.putExtra("regsession_id", this.eSE);
        localIntent.putExtra("mobile_verify_purpose", 2);
        if ((paramString != null) && (paramString.length() > 0)) {
          localIntent.putExtra("MicroMsg.MobileVerifyUIIntent_sms_code", paramString);
        }
        a(MobileVerifyUI.class, localIntent);
      }
      return;
    }
    finally {}
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.RegByMobileRegAIOUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eIV != null)
    {
      this.eIV.dismiss();
      this.eIV = null;
    }
    if (paramInt2 == -75) {
      com.tencent.mm.ui.base.h.i(this, a.j.alpha_version_tip_reg, a.j.reg_username_exist_title);
    }
    label656:
    label934:
    label946:
    do
    {
      Object localObject1;
      Object localObject2;
      do
      {
        int i;
        do
        {
          return;
          if (paraml.getType() != 145) {
            break label656;
          }
          i = ((com.tencent.mm.modelfriend.a)paraml).Oh();
          if (i != 12) {
            break;
          }
          if ((paramInt2 == -41) || (paramInt2 == -59))
          {
            paramString = com.tencent.mm.h.a.eV(paramString);
            if (paramString != null)
            {
              paramString.a(this, null, null);
              return;
            }
            com.tencent.mm.ui.base.h.i(this, a.j.regbymobile_reg_mobile_format_err_msg, a.j.regbymobile_reg_mobile_format_err_title);
            return;
          }
          this.eTa = ap.Ww(this.eTa);
          this.eSw = (this.eUK + this.eTa);
          this.eSE = ((com.tencent.mm.modelfriend.a)paraml).Ow();
          if ((paramInt2 == -36) || (paramInt2 == -35) || (paramInt2 == -3))
          {
            paraml = ((com.tencent.mm.modelfriend.a)paraml).Ol();
            if (!bi.oW(paraml)) {
              this.eTa = paraml.trim();
            }
            com.tencent.mm.plugin.c.a.pT("RE200_100");
            paraml = new StringBuilder();
            g.Eg();
            paraml = paraml.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",RE200_200,");
            g.Eg();
            com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("RE200_200") + ",1");
            paramString = com.tencent.mm.h.a.eV(paramString);
            if (paramString != null)
            {
              paramString.a(this, new DialogInterface.OnClickListener()new RegByMobileRegAIOUI.10
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  RegByMobileRegAIOUI.p(RegByMobileRegAIOUI.this);
                  com.tencent.mm.plugin.c.a.pU("RE200_250");
                  RegByMobileRegAIOUI.q(RegByMobileRegAIOUI.this);
                }
              }, new RegByMobileRegAIOUI.10(this));
              return;
            }
            YV();
            com.tencent.mm.plugin.c.a.pU("RE200_250");
            this.eUS = false;
            return;
          }
          if (paramInt2 == 65181)
          {
            aa.e(this, paramString, 30846);
            return;
          }
          if (paramInt2 == -34)
          {
            com.tencent.mm.ui.base.h.b(this, getString(a.j.bind_mcontact_err_freq_limit), "", true);
            return;
          }
        } while (com.tencent.mm.plugin.account.a.a.ezo.a(this, paramInt1, paramInt2, paramString));
        Toast.makeText(this, getString(a.j.bind_mcontact_verify_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        if (i == 14)
        {
          if ((paramInt2 != 0) && (paramString != null)) {
            break label946;
          }
          if (((com.tencent.mm.modelfriend.a)paraml).Om() != 1) {
            break;
          }
          localObject1 = this.eUK + this.eTa;
          localObject2 = ((com.tencent.mm.modelfriend.a)paraml).Oo();
          String str = ((com.tencent.mm.modelfriend.a)paraml).On();
          Intent localIntent = new Intent(this, RegByMobileSendSmsUI.class);
          localIntent.putExtra("regsession_id", this.eSE);
          localIntent.putExtra("key_reg_style", 1);
          localIntent.putExtra("from_mobile", (String)localObject1);
          localIntent.putExtra("to_mobile", (String)localObject2);
          localIntent.putExtra("verify_code", str);
          localIntent.putExtra("kintent_nickname", this.eUO.getText().toString());
          localIntent.putExtra("kintent_password", this.eUL.getText().toString());
          localIntent.putExtra("kintent_hasavatar", this.eUM);
          startActivity(localIntent);
        }
        if ((com.tencent.mm.plugin.account.a.a.ezo.a(this, paramInt1, paramInt2, paramString)) || (paraml.getType() != 701)) {
          break label934;
        }
        paramString = com.tencent.mm.h.a.eV(paramString);
      } while ((paramString == null) || (!paramString.a(this, null, null)));
      return;
      this.eUX = ((com.tencent.mm.modelfriend.a)paraml).Oq();
      this.eUY = ((com.tencent.mm.modelfriend.a)paraml).Or();
      this.eUZ = ((com.tencent.mm.modelfriend.a)paraml).Os();
      this.eVa = ((com.tencent.mm.modelfriend.a)paraml).Ot();
      if (this.eUU == null)
      {
        this.eUU = new s(this, this.eUW);
        this.eUU.Zr();
      }
      if (this.eNq == null)
      {
        localObject1 = ((LayoutInflater)getSystemService("layout_inflater")).inflate(a.g.reg_mobile_verify_progress_dialog_view, null);
        this.eNA = ((ProgressBar)((View)localObject1).findViewById(a.f.progress_dialog_bar));
        localObject2 = (TextView)((View)localObject1).findViewById(a.f.verify_mobile_number);
        this.eNq = com.tencent.mm.ui.base.h.a(this, false, getString(a.j.bind_mcontact_title_bind), (View)localObject1, "", "", null, null);
        this.eUK = ap.Wy(this.countryCode);
        ((TextView)localObject2).setText(this.eUK + " " + this.eUI.getText().toString());
      }
      for (;;)
      {
        this.progress = 0;
        this.eNA.setIndeterminate(false);
        this.eNF.sendEmptyMessage(10);
        break label656;
        break;
        this.eNq.show();
      }
      if (paramInt2 == -41)
      {
        com.tencent.mm.ui.base.h.i(this, a.j.regbymobile_reg_mobile_format_err_msg, a.j.regbymobile_reg_mobile_format_err_title);
        return;
      }
      if (paramInt2 == -34)
      {
        com.tencent.mm.ui.base.h.b(this, getString(a.j.bind_mcontact_err_freq_limit), "", true);
        return;
      }
    } while (com.tencent.mm.plugin.account.a.a.ezo.a(this, paramInt1, paramInt2, paramString));
    Toast.makeText(this, getString(a.j.bind_mcontact_verify_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
  }
  
  protected final int getLayoutId()
  {
    return a.g.regbymobile_reg_aio;
  }
  
  protected final void initView()
  {
    this.eGq = ((LinearLayout)findViewById(a.f.country_code_ll));
    this.eGs = ((TextView)findViewById(a.f.country_name));
    this.eUJ = ((MMFormInputView)findViewById(a.f.regbymobilereg_mobile_input_view));
    this.eUJ.setInputType(3);
    this.eUI = this.eUJ.getContentEditText();
    this.eSQ = ((TextView)findViewById(a.f.agree_text));
    this.eSS = ((Button)findViewById(a.f.reg_next));
    this.eCl = ((ImageView)findViewById(a.f.setinfo_avatar));
    this.eUN = ((ImageView)findViewById(a.f.setinfo_camera));
    this.eUL = ((MMFormInputView)findViewById(a.f.regbymobile_setpassword_container));
    com.tencent.mm.ui.tools.a.c.d(this.eUL.getContentEditText()).Gi(16).a(null);
    this.eUR = ((ScrollView)findViewById(a.f.scrollView));
    this.eRf = ((ResizeLayout)findViewById(a.f.resize_lv));
    this.eUO = ((MMFormInputView)findViewById(a.f.reg_nick_input_view));
    this.eRf.setOnSizeChanged(new RegByMobileRegAIOUI.12(this));
    this.eUQ = true;
    this.eUP = true;
    Object localObject = getString(a.j.license_agree_text);
    String str1;
    String str2;
    String str3;
    Spannable localSpannable;
    if (w.chM())
    {
      str1 = getString(a.j.license_detail);
      str2 = getString(a.j.privacy_detail);
      str3 = getString(a.j.and);
      localSpannable = Spannable.Factory.getInstance().newSpannable((String)localObject + "  " + str1 + str3 + str2);
      localSpannable.setSpan(new RegByMobileRegAIOUI.16(this), ((String)localObject).length() + "  ".length(), ((String)localObject).length() + str1.length() + "  ".length(), 33);
      localSpannable.setSpan(new RegByMobileRegAIOUI.17(this), ((String)localObject).length() + "  ".length() + str1.length() + str3.length(), ((String)localObject).length() + "  ".length() + str1.length() + str3.length() + str2.length(), 33);
      this.eSQ.setText(localSpannable);
      this.eSQ.setMovementMethod(LinkMovementMethod.getInstance());
      this.eUI.addTextChangedListener(new TextWatcher()
      {
        private ap eVd = new ap();
        
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          RegByMobileRegAIOUI.b(RegByMobileRegAIOUI.this);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
      });
      this.eUL.addTextChangedListener(new RegByMobileRegAIOUI.21(this));
      this.eUO.addTextChangedListener(new RegByMobileRegAIOUI.22(this));
      this.eSS.setOnClickListener(new RegByMobileRegAIOUI.2(this));
      this.eSS.setEnabled(false);
      if (!bi.oW(this.countryCode)) {
        break label986;
      }
      this.dYy = getString(a.j.country_normal_name);
      this.countryCode = ap.Wx(getString(a.j.country_normal_code));
      label529:
      if ((bi.oW(this.dYy)) || (bi.oW(this.countryCode)))
      {
        this.eQJ = ((TelephonyManager)getSystemService("phone")).getSimCountryIso();
        x.i("MicroMsg.RegByMobileRegAIOUI", "tm.getSimCountryIso()" + this.eQJ);
        if (!bi.oW(this.eQJ)) {
          break label1008;
        }
        x.e("MicroMsg.RegByMobileRegAIOUI", "getDefaultCountryInfo error");
      }
      label611:
      YK();
      if ((this.eGw == null) || (this.eGw.equals(""))) {
        break label1059;
      }
      this.eUI.setText(this.eGw);
    }
    for (;;)
    {
      this.eGq.setOnClickListener(new RegByMobileRegAIOUI.4(this));
      setBackBtn(new RegByMobileRegAIOUI.5(this), a.i.actionbar_icon_close_black);
      this.eCl.setOnClickListener(new RegByMobileRegAIOUI.6(this));
      g.Em().a(new ah.a()
      {
        Bitmap bitmap;
        String nickname;
        
        public final boolean Kr()
        {
          this.nickname = j.bW(RegByMobileRegAIOUI.this);
          this.bitmap = j.bX(RegByMobileRegAIOUI.this);
          if ((this.bitmap != null) && (!this.bitmap.isRecycled())) {}
          try
          {
            com.tencent.mm.sdk.platformtools.c.a(this.bitmap, 100, Bitmap.CompressFormat.PNG, com.tencent.mm.compatible.util.e.dgs + "temp.avatar", false);
            return true;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              x.e("MicroMsg.RegByMobileRegAIOUI", "save avatar fail." + localException.getMessage());
              x.printErrStackTrace("MicroMsg.RegByMobileRegAIOUI", localException, "", new Object[0]);
            }
          }
        }
        
        public final boolean Ks()
        {
          if ((!bi.oW(this.nickname)) && (bi.oW(RegByMobileRegAIOUI.i(RegByMobileRegAIOUI.this).getText().trim()))) {
            RegByMobileRegAIOUI.i(RegByMobileRegAIOUI.this).setText(this.nickname);
          }
          if (!f.zZ())
          {
            x.e("MicroMsg.RegByMobileRegAIOUI", "SDcard is not available");
            return false;
          }
          if ((this.bitmap != null) && (!this.bitmap.isRecycled()) && (!RegByMobileRegAIOUI.l(RegByMobileRegAIOUI.this)))
          {
            RegByMobileRegAIOUI.m(RegByMobileRegAIOUI.this).setImageBitmap(this.bitmap);
            RegByMobileRegAIOUI.n(RegByMobileRegAIOUI.this).setVisibility(8);
            RegByMobileRegAIOUI.o(RegByMobileRegAIOUI.this);
          }
          return true;
        }
        
        public final String toString()
        {
          return super.toString() + "|initView2";
        }
      });
      localObject = "";
      if (com.tencent.mm.protocal.d.qVQ) {
        localObject = getString(a.j.app_name) + getString(a.j.alpha_version_alpha);
      }
      setMMTitle((String)localObject);
      lF(getResources().getColor(a.c.normal_actionbar_color));
      cqh();
      if (com.tencent.mm.compatible.util.d.fR(23))
      {
        getWindow().setStatusBarColor(getResources().getColor(a.c.navpage));
        cqc();
      }
      return;
      str1 = getString(a.j.license_terms_of_service);
      str2 = getString(a.j.license_privacy_policy);
      str3 = getString(a.j.and);
      localSpannable = Spannable.Factory.getInstance().newSpannable((String)localObject + "  " + str1 + str3 + str2);
      localSpannable.setSpan(new RegByMobileRegAIOUI.18(this), ((String)localObject).length() + "  ".length(), ((String)localObject).length() + "  ".length() + str1.length(), 33);
      localSpannable.setSpan(new RegByMobileRegAIOUI.19(this), ((String)localObject).length() + str1.length() + "  ".length() + str3.length(), ((String)localObject).length() + str1.length() + "  ".length() + str3.length() + str2.length(), 33);
      this.eSQ.setText(localSpannable);
      break;
      label986:
      this.dYy = b.k(this, this.countryCode, getString(a.j.country_code));
      break label529;
      label1008:
      localObject = b.j(this, this.eQJ, getString(a.j.country_code));
      if (localObject == null)
      {
        x.e("MicroMsg.RegByMobileRegAIOUI", "getDefaultCountryInfo error");
        break label611;
      }
      this.dYy = ((b.a)localObject).dYy;
      this.countryCode = ((b.a)localObject).dYx;
      break label611;
      label1059:
      g.Em().a(new RegByMobileRegAIOUI.3(this));
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 30846) {
      if ((paramInt2 == -1) && (YW()))
      {
        YV();
        com.tencent.mm.plugin.c.a.pU("RE200_250");
        this.eUS = false;
      }
    }
    do
    {
      return;
      if (paramInt1 == 30847)
      {
        Bundle localBundle = null;
        if (paramIntent != null) {
          localBundle = paramIntent.getBundleExtra("result_data");
        }
        if ((localBundle != null) && (localBundle.getString("go_next", "").equals("agree_privacy")))
        {
          com.tencent.mm.plugin.report.service.h.mEJ.a(712L, 2L, 1L, false);
          this.eUT = false;
          pM(this.eUK + this.eTa);
          return;
        }
        com.tencent.mm.plugin.report.service.h.mEJ.a(712L, 1L, 1L, false);
        return;
      }
      switch (paramInt2)
      {
      default: 
        paramIntent = com.tencent.mm.plugin.account.a.a.ezo.a(this, paramInt1, paramInt2, paramIntent);
      }
    } while (paramIntent == null);
    this.eCl.setImageBitmap(paramIntent);
    this.eUM = true;
    this.eUN.setVisibility(8);
    return;
    this.dYy = bi.aG(paramIntent.getStringExtra("country_name"), "");
    this.countryCode = bi.aG(paramIntent.getStringExtra("couttry_code"), "");
    this.eQJ = bi.aG(paramIntent.getStringExtra("iso_code"), "");
    if (b.mm(this.countryCode))
    {
      paramIntent = new Intent(this, MobileInputUI.class);
      paramIntent.putExtra("mobile_input_purpose", 2);
      paramIntent.putExtra("couttry_code", this.countryCode);
      paramIntent.putExtra("country_name", this.dYy);
      startActivity(paramIntent);
      finish();
      overridePendingTransition(a.a.anim_not_change, a.a.anim_not_change);
      return;
    }
    YK();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dYy = bi.aG(getIntent().getStringExtra("country_name"), "");
    this.countryCode = ap.Wx(bi.aG(getIntent().getStringExtra("couttry_code"), ""));
    this.eQJ = bi.oV(getIntent().getStringExtra("iso_code"));
    this.eGw = bi.aG(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
    this.eLS = getIntent().getIntExtra("login_type", 0);
    initView();
  }
  
  protected void onDestroy()
  {
    if (this.eUU != null)
    {
      this.eUU.Zs();
      this.eUU = null;
    }
    if (this.eNq != null) {
      this.eNq.dismiss();
    }
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      WL();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
    if (this.eIV != null) {
      this.eIV.dismiss();
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.eQf);
    g.DF().b(701, this);
    g.DF().b(145, this);
    g.DF().b(132, this);
    com.tencent.mm.plugin.c.a.pT("RE200_100");
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i;
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0)) {
      if (paramArrayOfInt == null)
      {
        i = -1;
        x.w("MicroMsg.RegByMobileRegAIOUI", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bi.cjd() });
      }
    }
    do
    {
      return;
      i = paramArrayOfInt.length;
      break;
      x.i("MicroMsg.RegByMobileRegAIOUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
      switch (paramInt)
      {
      default: 
        return;
      }
    } while ((paramArrayOfInt[0] != 0) || (this.eUU == null));
    this.eUU.Yh();
  }
  
  public void onResume()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.eQf);
    super.onResume();
    g.DF().a(701, this);
    g.DF().a(145, this);
    g.DF().a(132, this);
    StringBuilder localStringBuilder = new StringBuilder();
    g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",RE200_100,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("RE200_100") + ",1");
    this.eSx = 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */