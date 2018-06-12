package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import com.tencent.mm.ab.o;
import com.tencent.mm.al.b;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bt;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.plugin.account.a.c;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.i;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.MMClearEditText;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.a.d.a;

public class LoginUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private TextWatcher UE = new LoginUI.1(this);
  private String bLe = null;
  private String cbP = "";
  private ProgressDialog eHw = null;
  private String eHy;
  private SecurityImage eIX = null;
  private String eOW;
  protected Button eQU;
  protected Button eQV;
  private View eQW;
  protected Button eQX;
  private f eQY = new f();
  private com.tencent.mm.sdk.b.c eQf = new LoginUI.12(this);
  private MMClearEditText eRX;
  private MMClearEditText eRY;
  private MMFormInputView eRZ;
  private String eRa;
  private String eRb;
  private ResizeLayout eRf;
  private com.tencent.mm.platformtools.d eRi;
  private Button eRo;
  private MMFormInputView eSa;
  private Button eSb;
  private Button eSc;
  protected View eSd;
  private String eSe;
  private boolean eSf;
  private com.tencent.mm.ui.widget.a.d eSg;
  private MMKeyboardUperView eSh;
  private boolean eSi = false;
  private final int eSj = 128;
  private int sceneType = 0;
  
  private static void P(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("show_bottom", false);
    localIntent.putExtra("needRedirect", false);
    localIntent.putExtra("neverGetA8Key", true);
    localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.qWa);
    localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.qVX);
    com.tencent.mm.bg.d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
  }
  
  private void Yz()
  {
    this.eQY.account = this.eRX.getText().toString().trim();
    this.eQY.eIY = this.eRY.getText().toString();
    if (this.eQY.account.equals(""))
    {
      com.tencent.mm.ui.base.h.i(this, a.j.verify_username_null_tip, a.j.login_err_title);
      return;
    }
    if (this.eQY.eIY.equals(""))
    {
      com.tencent.mm.ui.base.h.i(this, a.j.verify_password_null_tip, a.j.login_err_title);
      return;
    }
    YC();
    com.tencent.mm.kernel.g.DF().a(701, this);
    com.tencent.mm.modelsimple.q localq = new com.tencent.mm.modelsimple.q(this.eQY.account, this.eQY.eIY, this.eOW, 2);
    com.tencent.mm.kernel.g.DF().a(localq, 0);
    getString(a.j.app_tip);
    this.eHw = com.tencent.mm.ui.base.h.a(this, getString(a.j.login_logining), true, new LoginUI.19(this, localq));
  }
  
  private boolean e(int paramInt1, int paramInt2, String paramString)
  {
    boolean bool = false;
    if (com.tencent.mm.plugin.account.a.a.ezo.a(this.mController.tml, paramInt1, paramInt2, paramString)) {
      bool = true;
    }
    do
    {
      return bool;
      if (paramInt1 == 4) {}
      switch (paramInt2)
      {
      default: 
        paramString = new ah(paramInt1, paramInt2, paramString);
        return this.eRi.a(this, paramString);
      }
    } while (com.tencent.mm.kernel.g.DF().Lg() != 5);
    com.tencent.mm.ui.base.h.i(this, a.j.net_warn_server_down_tip, a.j.net_warn_server_down);
    return true;
    com.tencent.mm.ui.base.h.i(this, a.j.errcode_password, a.j.login_err_title);
    return true;
    com.tencent.mm.ui.base.h.i(this, a.j.login_err_mailnotverify, a.j.login_err_title);
    return true;
    com.tencent.mm.ui.base.h.i(this.mController.tml, a.j.regbyqq_auth_err_failed_niceqq, a.j.app_tip);
    return true;
    aa.ch(this.mController.tml);
    return true;
    com.tencent.mm.kernel.g.DF().a(701, this);
    if (this.eIX == null) {
      this.eIX = SecurityImage.a.a(this, a.j.regbyqq_secimg_title, this.eQY.eRQ, this.eQY.eIZ, this.eQY.eJa, this.eQY.eJb, new LoginUI.13(this), null, new LoginUI.14(this), this.eQY);
    }
    for (;;)
    {
      return true;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LoginUI", "imgSid:" + this.eQY.eJa + " img len" + this.eQY.eIZ.length + " " + com.tencent.mm.compatible.util.g.Ac());
      this.eIX.a(this.eQY.eRQ, this.eQY.eIZ, this.eQY.eJa, this.eQY.eJb);
    }
    com.tencent.mm.kernel.a.hold();
    ActionBarActivity localActionBarActivity = this.mController.tml;
    com.tencent.mm.kernel.g.Eg();
    if (TextUtils.isEmpty(com.tencent.mm.kernel.a.Dh())) {}
    for (paramString = com.tencent.mm.bp.a.af(this.mController.tml, a.j.main_err_another_place);; paramString = com.tencent.mm.kernel.a.Dh())
    {
      com.tencent.mm.ui.base.h.a(localActionBarActivity, paramString, this.mController.tml.getString(a.j.app_tip), new DialogInterface.OnClickListener()new LoginUI.16
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          LoginUI.l(LoginUI.this);
        }
      }, new LoginUI.16(this));
      return true;
      com.tencent.mm.kernel.g.Eg();
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LoginUI", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", new Object[] { bi.Xf(this.eOW), this.eRb });
    f.a(this.eQY);
    com.tencent.mm.plugin.c.a.pU("L600_100");
    paramString = new Intent();
    paramString.putExtra("auth_ticket", this.eOW);
    paramString.putExtra("binded_mobile", this.eRa);
    paramString.putExtra("close_safe_device_style", this.eRb);
    paramString.putExtra("from_source", 1);
    com.tencent.mm.plugin.account.a.a.ezn.g(this, paramString);
    return true;
    if (!bi.oW(this.cbP)) {
      aa.n(this, paramString, this.cbP);
    }
    return true;
  }
  
  private void goBack()
  {
    YC();
    com.tencent.mm.plugin.c.a.pU(this.eHy);
    p.cbS();
    finish();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LoginUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if (paraml.getType() != 701) {
      return;
    }
    com.tencent.mm.kernel.g.DF().b(701, this);
    this.cbP = ((com.tencent.mm.modelsimple.q)paraml).Rd();
    this.eQY.eJa = ((com.tencent.mm.modelsimple.q)paraml).Re();
    this.eQY.eIZ = ((com.tencent.mm.modelsimple.q)paraml).Rf();
    this.eQY.eJb = ((com.tencent.mm.modelsimple.q)paraml).Rg();
    this.eQY.eRQ = ((com.tencent.mm.modelsimple.q)paraml).getSecCodeType();
    this.eQY.account = ((com.tencent.mm.modelsimple.q)paraml).account;
    if (paramInt2 == 65331)
    {
      this.eOW = ((com.tencent.mm.modelsimple.q)paraml).Ok();
      this.eRa = ((com.tencent.mm.modelsimple.q)paraml).Rh();
      this.eRb = ((com.tencent.mm.modelsimple.q)paraml).Rk();
    }
    if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17))) {
      com.tencent.mm.kernel.g.DF().a(new bg(new LoginUI.17(this)), 0);
    }
    for (int i = 1;; i = 0)
    {
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        com.tencent.mm.kernel.a.unhold();
        aa.oS(this.eQY.account);
        paramString = at.dBv.I("login_weixin_username", "");
        com.tencent.mm.platformtools.x.bZ(this);
        if (this.eSf)
        {
          bt.dDs.W(this.eSe, paramString);
          bt.dDs.d(com.tencent.mm.model.q.GF(), com.tencent.mm.model.q.Ho());
          com.tencent.mm.plugin.report.service.h.mEJ.h(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(9), bt.dDs.II() });
        }
        aa.showAddrBookUploadConfirm(this, new LoginUI.18(this, paraml), false, 2);
        paramString = new StringBuilder();
        com.tencent.mm.kernel.g.Eg();
        paramString = paramString.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_900_phone,");
        com.tencent.mm.kernel.g.Eg();
        com.tencent.mm.plugin.c.a.pV(com.tencent.mm.kernel.a.gd("R200_900_phone") + ",4");
        if (!this.eSi) {
          break;
        }
        paramString = ad.getContext().getSharedPreferences("randomid_prefs", 4).getString("randomID", "");
        com.tencent.mm.plugin.report.service.h.mEJ.h(11930, new Object[] { paramString, Integer.valueOf(4) });
        return;
      }
      if (paramInt2 == -106)
      {
        aa.e(this, paramString, 32644);
        return;
      }
      if (paramInt2 == 65319)
      {
        aa.a(this, com.tencent.mm.platformtools.f.a((com.tencent.mm.modelsimple.q)paraml), paramInt2);
        return;
      }
      if (e(paramInt1, paramInt2, paramString)) {
        break;
      }
      if (paramInt2 == -5)
      {
        Toast.makeText(this, getString(a.j.loginby_access_denied), 0).show();
        return;
      }
      paramString = com.tencent.mm.h.a.eV(paramString);
      if ((paramString != null) && (paramString.a(this, null, null))) {
        break;
      }
      Toast.makeText(this, getString(a.j.fmt_auth_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      return;
    }
  }
  
  public void finish()
  {
    super.finish();
    overridePendingTransition(a.a.anim_not_change, a.a.anim_not_change);
  }
  
  protected final int getLayoutId()
  {
    return a.g.login;
  }
  
  protected final void initView()
  {
    this.eRZ = ((MMFormInputView)findViewById(a.f.login_account_auto));
    this.eSa = ((MMFormInputView)findViewById(a.f.login_password_et));
    this.eRX = ((MMClearEditText)this.eRZ.getContentEditText());
    this.eRY = ((MMClearEditText)this.eSa.getContentEditText());
    com.tencent.mm.ui.tools.a.c.d(this.eRY).Gi(16).a(null);
    this.eSb = ((Button)findViewById(a.f.login_btn));
    this.eSb.setEnabled(false);
    this.eSc = ((Button)findViewById(a.f.login_by_other));
    this.eRo = ((Button)findViewById(a.f.login_as_other_device_btn));
    this.eSd = findViewById(a.f.login_bottom_container);
    this.eSd.setVisibility(0);
    this.eQU = ((Button)findViewById(a.f.login_find_password_btn));
    this.eQW = findViewById(a.f.free_btn_container);
    this.eQV = ((Button)findViewById(a.f.login_freeze_account_btn));
    this.eQX = ((Button)findViewById(a.f.login_more_btn));
    this.eRf = ((ResizeLayout)findViewById(a.f.resize_lv));
    this.eSh = ((MMKeyboardUperView)findViewById(a.f.scrollView));
    this.eRf.setOnSizeChanged(new LoginUI.20(this));
    boolean bool = b.PA();
    Object localObject = findViewById(a.f.fblogin_tip);
    int i;
    if (!bool)
    {
      i = 8;
      ((View)localObject).setVisibility(i);
      ((View)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          LoginUI.this.startActivity(new Intent(LoginUI.this, FacebookLoginUI.class));
        }
      });
      this.eQU.setOnClickListener(new LoginUI.22(this));
      this.eQV.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = LoginUI.this.getString(a.j.freeze_account_url, new Object[] { w.chP() });
          LoginUI.Q(LoginUI.this, paramAnonymousView);
        }
      });
      this.eSg = new com.tencent.mm.ui.widget.a.d(this, 1, false);
      this.eSg.ofp = new LoginUI.24(this);
      this.eSg.uJQ = new d.a()
      {
        public final void onDismiss()
        {
          LoginUI.c(LoginUI.this).bzW();
        }
      };
      this.eSg.ofq = new LoginUI.26(this);
      if (!w.chM()) {
        break label649;
      }
      this.eQX.setOnClickListener(new LoginUI.2(this));
    }
    for (;;)
    {
      setMMTitle("");
      setBackBtn(new LoginUI.4(this), a.i.actionbar_icon_close_black);
      this.eSb.setOnClickListener(new LoginUI.5(this));
      this.eSc.setOnClickListener(new LoginUI.6(this));
      this.eOW = getIntent().getStringExtra("auth_ticket");
      if (!bi.oW(this.eOW))
      {
        this.eRX.setText(bi.oV(f.YF()));
        this.eRY.setText(bi.oV(f.YG()));
        new ag().postDelayed(new LoginUI.7(this), 500L);
      }
      this.eRX.addTextChangedListener(this.UE);
      this.eRY.addTextChangedListener(this.UE);
      this.eRY.setOnEditorActionListener(new LoginUI.8(this));
      this.eRY.setOnKeyListener(new LoginUI.9(this));
      if (com.tencent.mm.sdk.platformtools.e.sFE) {
        com.tencent.mm.plugin.account.a.a.ezo.g(this);
      }
      localObject = getIntent().getStringExtra("login_username");
      this.eSi = getIntent().getBooleanExtra("from_deep_link", false);
      if (!bi.oW((String)localObject)) {
        this.eRX.setText((CharSequence)localObject);
      }
      if (com.tencent.mm.sdk.platformtools.d.EX_DEVICE_LOGIN)
      {
        this.eRo.setVisibility(0);
        this.eRo.setOnClickListener(new LoginUI.10(this));
      }
      return;
      i = 0;
      break;
      label649:
      this.eQW.setVisibility(8);
      this.eQX.setText(a.j.login_by_more);
      this.eQX.setOnClickListener(new LoginUI.3(this));
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    Object localObject;
    if (paramIntent == null)
    {
      bool = true;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LoginUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if (paramInt2 == -1)
      {
        if ((paramInt1 != 1024) || (paramIntent == null)) {
          break label175;
        }
        localObject = paramIntent.getStringExtra("VoiceLoginAuthPwd");
        paramInt2 = paramIntent.getIntExtra("KVoiceHelpCode", 0);
        bool = bi.oW((String)localObject);
        if (!bi.oW((String)localObject)) {
          break label166;
        }
        paramInt1 = i;
        label104:
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LoginUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        if (paramInt2 == 65319)
        {
          this.eQY.eIY = ((String)localObject);
          Yz();
        }
      }
    }
    label166:
    label175:
    do
    {
      do
      {
        return;
        bool = false;
        break;
        paramInt1 = ((String)localObject).length();
        break label104;
      } while ((paramInt1 != 32644) || (paramIntent == null));
      localObject = paramIntent.getBundleExtra("result_data");
    } while ((localObject == null) || (!((Bundle)localObject).getString("go_next", "").equals("auth_again")));
    if (!bi.oW(((Bundle)localObject).getString("VoiceLoginAuthPwd"))) {
      this.eQY.eIY = paramIntent.getStringExtra("VoiceLoginAuthPwd");
    }
    Yz();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = "";
    if (com.tencent.mm.protocal.d.qVQ) {
      paramBundle = getString(a.j.app_name) + getString(a.j.alpha_version_alpha);
    }
    this.sceneType = getIntent().getIntExtra("login_type", 0);
    setMMTitle(paramBundle);
    lF(getResources().getColor(a.c.normal_actionbar_color));
    cqh();
    com.tencent.mm.plugin.account.a.a.ezo.vo();
    this.eHy = com.tencent.mm.plugin.c.a.Zu();
    initView();
    this.eRi = new com.tencent.mm.platformtools.d();
    this.eSf = getIntent().getBooleanExtra("from_switch_account", false);
    this.eSe = at.dBv.I("login_weixin_username", "");
    paramBundle = getIntent().getIntArrayExtra("kv_report_login_method_data");
    if (paramBundle != null) {
      com.tencent.mm.plugin.report.service.h.mEJ.h(14262, new Object[] { Integer.valueOf(paramBundle[0]), Integer.valueOf(paramBundle[1]), Integer.valueOf(paramBundle[2]), Integer.valueOf(paramBundle[3]), Integer.valueOf(paramBundle[4]) });
    }
  }
  
  public void onDestroy()
  {
    if (this.eRi != null) {
      this.eRi.close();
    }
    com.tencent.mm.kernel.g.DF().b(701, this);
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
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
    if (this.sceneType == 0)
    {
      localStringBuilder = new StringBuilder();
      com.tencent.mm.kernel.g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",L100_100_logout,");
      com.tencent.mm.kernel.g.Eg();
      com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("L100_100_logout") + ",2");
    }
    while (this.sceneType != 1) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",L400_100_login,");
    com.tencent.mm.kernel.g.Eg();
    com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("L400_100_login") + ",2");
  }
  
  public void onResume()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.eQf);
    super.onResume();
    if (this.sceneType == 0)
    {
      localStringBuilder = new StringBuilder();
      com.tencent.mm.kernel.g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",L100_100_logout,");
      com.tencent.mm.kernel.g.Eg();
      com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("L100_100_logout") + ",1");
      com.tencent.mm.plugin.c.a.pT("L100_100_logout");
    }
    while (this.sceneType != 1) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",L400_100_login,");
    com.tencent.mm.kernel.g.Eg();
    com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("L400_100_login") + ",1");
    com.tencent.mm.plugin.c.a.pT("L400_100_login");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/ui/LoginUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */