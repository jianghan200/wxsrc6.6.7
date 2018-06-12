package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.at;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.platformtools.d;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.i.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;
import java.io.File;

public class MobileLoginOrForceReg
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private String bLe;
  private String bTi;
  private String cbP;
  private ImageView eCl;
  private TextView eGD;
  protected ProgressDialog eHw = null;
  private SecurityImage eIX = null;
  private f eQY = null;
  private com.tencent.mm.sdk.b.c eQf = new MobileLoginOrForceReg.12(this);
  private d eRi;
  private g eSA = null;
  private String eSE;
  private Button eTi;
  private Button eTj;
  private LinearLayout eTk;
  private LinearLayout eTl;
  private TextView eTm;
  private int eTn;
  private String eTo;
  private String eTp;
  private int eTq;
  private String eTr;
  private boolean eTs = true;
  private boolean eTt;
  private String eTu;
  private String eTv;
  private int eTw;
  private int egg;
  private ag handler = new MobileLoginOrForceReg.1(this);
  private String nickname;
  private String username;
  
  private void goBack()
  {
    com.tencent.mm.plugin.c.a.pU("R200_100");
    if (this.eTw == 1) {}
    for (Object localObject = new Intent(this, RegByMobileRegAIOUI.class);; localObject = new Intent(this, MobileInputUI.class))
    {
      ((Intent)localObject).putExtra("mobile_input_purpose", 2);
      ((Intent)localObject).addFlags(67108864);
      startActivity((Intent)localObject);
      com.tencent.mm.plugin.c.a.pT(this.eTr);
      localObject = new StringBuilder();
      com.tencent.mm.kernel.g.Eg();
      localObject = ((StringBuilder)localObject).append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_600,");
      com.tencent.mm.kernel.g.Eg();
      com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R200_600") + ",2");
      finish();
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, l paraml)
  {
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if (this.eQY == null) {
      this.eQY = new f();
    }
    boolean bool;
    if (paraml.getType() == 255) {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        bool = this.eTs;
        paramString = new Intent(this, RegByMobileSetPwdUI.class);
        paramString.putExtra("kintent_hint", getString(a.j.settings_modify_password_tip));
        paramString.putExtra("kintent_cancelable", bool);
        startActivityForResult(paramString, 0);
      }
    }
    do
    {
      return;
      if ((paraml.getType() != 701) || (this.eSA == null)) {
        break;
      }
      if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
      {
        this.eQY.account = this.username;
        this.eQY.eRP = this.eTv;
        this.eQY.eJa = ((q)paraml).Re();
        this.eQY.eIZ = ((q)paraml).Rf();
        this.eQY.eJb = ((q)paraml).Rg();
        this.eQY.eRQ = ((q)paraml).getSecCodeType();
        if (this.eIX == null)
        {
          this.eIX = SecurityImage.a.a(this, a.j.regbyqq_secimg_title, this.eQY.eRQ, this.eQY.eIZ, this.eQY.eJa, this.eQY.eJb, new MobileLoginOrForceReg.17(this), null, new MobileLoginOrForceReg.18(this), this.eQY);
          return;
        }
        this.eIX.a(this.eQY.eRQ, this.eQY.eIZ, this.eQY.eJa, this.eQY.eJb);
        return;
      }
      this.cbP = ((q)paraml).Rd();
      this.eSA.a(this, paramInt1, paramInt2, paramString, paraml);
      if ((paraml instanceof q)) {
        this.eTs = ((q)paraml).Rm();
      }
    } while ((paramInt1 != 0) || (paramInt2 != 0));
    paramString = new r(1);
    com.tencent.mm.kernel.g.DF().a(paramString, 0);
    getString(a.j.app_tip);
    this.eHw = h.a(this, getString(a.j.app_loading), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        com.tencent.mm.kernel.g.DF().c(paramString);
      }
    });
    return;
    Object localObject2;
    if (paraml.getType() == 126)
    {
      if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
      {
        paramString = Boolean.valueOf(this.eTt);
        localObject1 = this.eTv;
        localObject2 = this.eTu;
        if (this.eIX == null)
        {
          this.eIX = SecurityImage.a.a(this, a.j.regbyqq_secimg_title, 0, ((com.tencent.mm.modelsimple.s)paraml).Rf(), ((com.tencent.mm.modelsimple.s)paraml).Re(), "", new MobileLoginOrForceReg.2(this, (String)localObject1, (String)localObject2, paraml, paramString), null, new MobileLoginOrForceReg.3(this), new MobileLoginOrForceReg.4(this, (String)localObject1, (String)localObject2, paraml, paramString));
          return;
        }
        this.eIX.a(0, ((com.tencent.mm.modelsimple.s)paraml).Rf(), ((com.tencent.mm.modelsimple.s)paraml).Re(), "");
        return;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        localObject1 = this.bTi;
        bool = this.eTt;
        com.tencent.mm.kernel.g.Eg();
        com.tencent.mm.kernel.a.unhold();
        com.tencent.mm.kernel.a.bt(true);
        if (!Boolean.valueOf(bool).booleanValue()) {
          break label803;
        }
        localObject2 = com.tencent.mm.compatible.util.e.dgs + "temp.avatar";
        String str = com.tencent.mm.compatible.util.e.dgs + "temp.avatar.hd";
        new File((String)localObject2).renameTo(new File(str));
        com.tencent.mm.a.e.deleteFile((String)localObject2);
        com.tencent.mm.sdk.platformtools.c.c(str, 96, 96, Bitmap.CompressFormat.JPEG, 90, (String)localObject2);
        new com.tencent.mm.aa.o(this, com.tencent.mm.compatible.util.e.dgs + "temp.avatar").a(new MobileLoginOrForceReg.5(this, paraml, (String)localObject1), new MobileLoginOrForceReg.6(this, paraml, (String)localObject1));
      }
      for (;;)
      {
        localObject1 = com.tencent.mm.h.a.eV(paramString);
        if (localObject1 == null) {
          break;
        }
        ((com.tencent.mm.h.a)localObject1).a(this, null, null);
        return;
        label803:
        this.bLe = ((com.tencent.mm.modelsimple.s)paraml).Rn();
        at.dBv.T("login_user_name", (String)localObject1);
        localObject1 = com.tencent.mm.plugin.account.a.a.ezn.be(this);
        ((Intent)localObject1).addFlags(67108864);
        ((Intent)localObject1).putExtra("LauncherUI.enter_from_reg", true);
        startActivity((Intent)localObject1);
        finish();
        com.tencent.mm.plugin.c.a.pU("RE900_100");
        localObject1 = new StringBuilder();
        com.tencent.mm.kernel.g.Eg();
        localObject1 = ((StringBuilder)localObject1).append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_600,");
        com.tencent.mm.kernel.g.Eg();
        com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R200_600") + ",4");
      }
    }
    Object localObject1 = new com.tencent.mm.platformtools.ah(paramInt1, paramInt2, paramString);
    int i;
    if (this.eRi.a(this, (com.tencent.mm.platformtools.ah)localObject1)) {
      i = 1;
    }
    for (;;)
    {
      label972:
      if (i == 0)
      {
        if (paraml.getType() == 701)
        {
          paramString = com.tencent.mm.h.a.eV(paramString);
          if ((paramString != null) && (paramString.a(this.mController.tml, null, null))) {
            break;
          }
        }
        if ((paramInt1 == 0) && (paramInt2 == 0)) {
          break;
        }
        Toast.makeText(this.mController.tml, getString(a.j.bind_mcontact_verify_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        return;
        i = 0;
        switch (paramInt2)
        {
        default: 
          break;
        case -140: 
          if (!bi.oW(this.cbP)) {
            aa.n(this.mController.tml, paramString, this.cbP);
          }
          i = 1;
          break;
        case -34: 
          Toast.makeText(this, a.j.bind_mcontact_err_freq_limit, 0).show();
          i = 1;
          break;
        case -43: 
          Toast.makeText(this, a.j.bind_mcontact_err_binded, 0).show();
          i = 1;
          break;
        case -41: 
          Toast.makeText(this, a.j.bind_mcontact_err_format, 0).show();
          i = 1;
          break;
        case -36: 
          Toast.makeText(this, a.j.bind_mcontact_err_unbinded_notbinded, 0).show();
          i = 1;
          break;
        case -32: 
          h.a(this, getString(a.j.bind_mcontact_verify_error), "", new MobileLoginOrForceReg.7(this));
          i = 1;
          break;
        case -33: 
          h.a(this, a.j.bind_mcontact_verify_err_time_out_content, a.j.bind_mcontact_verify_tip, new MobileLoginOrForceReg.8(this));
          i = 1;
          break;
        case -75: 
          h.i(this, a.j.alpha_version_tip_reg, a.j.reg_username_exist_title);
          i = 1;
          break;
        case -100: 
          com.tencent.mm.kernel.g.Eg();
          com.tencent.mm.kernel.a.hold();
          localObject2 = this.mController.tml;
          com.tencent.mm.kernel.g.Eg();
          if (!TextUtils.isEmpty(com.tencent.mm.kernel.a.Dh())) {
            break label1407;
          }
        }
      }
    }
    for (localObject1 = com.tencent.mm.bp.a.af(this.mController.tml, a.j.main_err_another_place);; localObject1 = com.tencent.mm.kernel.a.Dh())
    {
      h.a((Context)localObject2, (String)localObject1, this.mController.tml.getString(a.j.app_tip), new MobileLoginOrForceReg.9(this), new MobileLoginOrForceReg.10(this));
      i = 1;
      break label972;
      break;
      label1407:
      com.tencent.mm.kernel.g.Eg();
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.mobile_login_or_force_reg;
  }
  
  public final void initView()
  {
    this.eTi = ((Button)findViewById(a.f.continue_login));
    this.eTj = ((Button)findViewById(a.f.force_reg));
    this.eTk = ((LinearLayout)findViewById(a.f.has_avatar));
    this.eTl = ((LinearLayout)findViewById(a.f.no_avatar));
    this.eCl = ((ImageView)findViewById(a.f.avatar_iv));
    this.eTm = ((TextView)findViewById(a.f.nickname_tv));
    this.eGD = ((TextView)findViewById(a.f.bind_mcontact_verify_hint));
    new ap();
    Object localObject;
    if (this.bTi.startsWith("+"))
    {
      localObject = ap.Fp(this.bTi);
      if (!bi.oW((String)localObject))
      {
        String str = this.bTi.substring(((String)localObject).length() + 1);
        localObject = "+" + (String)localObject + " " + ap.formatNumber((String)localObject, str);
      }
    }
    for (;;)
    {
      this.eGD.setText((CharSequence)localObject);
      if ((!bi.oW(this.nickname)) || (!bi.oW(this.eTp))) {
        break;
      }
      this.eTl.setVisibility(0);
      this.eTk.setVisibility(8);
      this.eTi.setOnClickListener(new MobileLoginOrForceReg.14(this));
      this.eTj.setOnClickListener(new MobileLoginOrForceReg.15(this));
      setMMTitle(a.j.mobile_input_already_bind_title_welcome_back);
      setBackBtn(new MobileLoginOrForceReg.16(this));
      return;
      localObject = this.bTi;
      continue;
      localObject = "+86 " + ap.formatNumber("86", this.bTi);
    }
    this.eTl.setVisibility(8);
    this.eTk.setVisibility(0);
    if (bi.oW(this.nickname)) {
      this.eTm.setVisibility(8);
    }
    for (;;)
    {
      localObject = a.b.ccZ().uM();
      if (localObject != null) {
        this.eCl.setImageBitmap((Bitmap)localObject);
      }
      if (bi.oW(this.eTp)) {
        break;
      }
      localObject = this.eTp;
      com.tencent.mm.kernel.g.Em().H(new MobileLoginOrForceReg.13(this, (String)localObject));
      break;
      this.eTm.setText(this.nickname);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eTr = com.tencent.mm.plugin.c.a.Zu();
    com.tencent.mm.kernel.g.DF().a(701, this);
    com.tencent.mm.kernel.g.DF().a(126, this);
    com.tencent.mm.kernel.g.DF().a(255, this);
    this.eTw = getIntent().getIntExtra("key_reg_style", 1);
    this.bLe = getIntent().getStringExtra("ticket");
    this.bTi = getIntent().getStringExtra("moble");
    this.eTn = getIntent().getIntExtra("next_controll", 0);
    this.username = getIntent().getStringExtra("username");
    this.eTo = getIntent().getStringExtra("password");
    this.nickname = getIntent().getStringExtra("nickname");
    this.eTp = getIntent().getStringExtra("avatar_url");
    this.eSE = getIntent().getStringExtra("regsession_id");
    this.eTq = getIntent().getIntExtra("mobile_check_type", 0);
    this.eTt = getIntent().getBooleanExtra("kintent_hasavatar", false);
    this.eTu = getIntent().getStringExtra("kintent_nickname");
    this.eTv = getIntent().getStringExtra("kintent_password");
    if ((this.eTv != null) && (this.eTv.length() >= 8)) {}
    for (this.egg = 1;; this.egg = 4)
    {
      initView();
      this.eRi = new d();
      return;
    }
  }
  
  public void onDestroy()
  {
    com.tencent.mm.kernel.g.DF().b(701, this);
    com.tencent.mm.kernel.g.DF().b(126, this);
    com.tencent.mm.kernel.g.DF().b(255, this);
    if (this.eRi != null) {
      this.eRi.close();
    }
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
    com.tencent.mm.sdk.b.a.sFg.c(this.eQf);
  }
  
  public void onResume()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.eQf);
    super.onResume();
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_600,");
    com.tencent.mm.kernel.g.Eg();
    com.tencent.mm.plugin.c.a.pV(com.tencent.mm.kernel.a.gd("R200_600") + ",1");
    com.tencent.mm.plugin.c.a.pT("R200_600");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */