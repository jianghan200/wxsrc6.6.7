package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bt;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.account.a.c;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.i;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class LoginHistoryUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private String cbP = "";
  private SharedPreferences duR;
  protected ProgressDialog eHw = null;
  private SecurityImage eIX = null;
  protected int eLS;
  protected String eOW;
  protected TextView eQN;
  protected EditText eQO;
  protected Button eQP;
  protected Button eQQ;
  protected View eQR;
  protected View eQS;
  protected View eQT;
  protected Button eQU;
  protected Button eQV;
  private View eQW;
  protected Button eQX;
  protected f eQY = new f();
  protected String eQZ;
  private com.tencent.mm.sdk.b.c eQf = new LoginHistoryUI.1(this);
  protected String eRa;
  private String eRb;
  private String eRc;
  private ImageView eRd;
  private MMKeyboardUperView eRe;
  private ResizeLayout eRf;
  protected String eRg;
  private String eRh;
  private com.tencent.mm.platformtools.d eRi;
  protected LinearLayout eRj;
  protected LinearLayout eRk;
  protected LinearLayout eRl;
  protected MMFormInputView eRm;
  protected MMFormVerifyCodeInputView eRn;
  private Button eRo;
  protected String eRp = "";
  protected boolean eRq = false;
  protected boolean eRr;
  private int eRs;
  private int eRt;
  private boolean eRu = false;
  private String eRv;
  protected int[] eRw = new int[5];
  private int eRx;
  private String eRy;
  private int eRz = 0;
  
  public static void P(Context paramContext, String paramString)
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
  
  private void b(q paramq)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LoginHistoryUI", "checktask LoginHistoryUI startLauncher 0x%x, stack: %s", new Object[] { Integer.valueOf(hashCode()), bi.cjd() });
    Intent localIntent = com.tencent.mm.plugin.account.a.a.ezn.be(this);
    localIntent.addFlags(67108864);
    if (paramq != null)
    {
      localIntent.putExtra("kstyle_show_bind_mobile_afterauth", paramq.Ri());
      localIntent.putExtra("kstyle_bind_recommend_show", paramq.Rl());
      localIntent.putExtra("kstyle_bind_wording", paramq.Rj());
    }
    startActivity(localIntent);
    finish();
  }
  
  private boolean e(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt1 == 4) {}
    switch (paramInt2)
    {
    default: 
      if (!com.tencent.mm.plugin.account.a.a.ezo.a(this, paramInt1, paramInt2, paramString)) {
        break label698;
      }
      if (this.eIX != null) {
        this.eIX.dismiss();
      }
      return true;
    case -3: 
      if (this.eRz <= 0)
      {
        com.tencent.mm.ui.base.h.i(this, a.j.errcode_password, a.j.login_err_title);
        this.eRz += 1;
      }
      for (;;)
      {
        return true;
        com.tencent.mm.ui.base.h.a(this, getString(a.j.errcode_password_ask_if_forgot_pwd), getString(a.j.login_err_title), getString(a.j.errcode_password_go_forgot_pwd), getString(a.j.app_cancel), new LoginHistoryUI.11(this), new LoginHistoryUI.12(this));
      }
    case -1: 
      if (com.tencent.mm.kernel.g.DF().Lg() == 5)
      {
        com.tencent.mm.ui.base.h.i(this, a.j.net_warn_server_down_tip, a.j.net_warn_server_down);
        return true;
      }
    case -9: 
      com.tencent.mm.ui.base.h.i(this, a.j.login_err_mailnotverify, a.j.login_err_title);
      return true;
    case -72: 
      com.tencent.mm.ui.base.h.i(this, a.j.regbyqq_auth_err_failed_niceqq, a.j.app_tip);
      return true;
    case -75: 
      aa.ch(this);
      return true;
    case -32: 
      com.tencent.mm.ui.base.h.a(this, getString(a.j.bind_mcontact_verify_error), "", new LoginHistoryUI.13(this));
      return true;
    case -33: 
      com.tencent.mm.ui.base.h.a(this, a.j.bind_mcontact_verify_err_time_out_content, a.j.bind_mcontact_verify_tip, new LoginHistoryUI.14(this));
      return true;
    case -311: 
    case -310: 
    case -6: 
      com.tencent.mm.kernel.g.DF().a(701, this);
      if (this.eIX == null) {
        this.eIX = SecurityImage.a.a(this, a.j.regbyqq_secimg_title, this.eQY.eRQ, this.eQY.eIZ, this.eQY.eJa, this.eQY.eJb, new LoginHistoryUI.15(this, paramInt1), null, new LoginHistoryUI.16(this), this.eQY);
      }
      for (;;)
      {
        return true;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LoginHistoryUI", "imgSid:" + this.eQY.eJa + " img len" + this.eQY.eIZ.length + " " + com.tencent.mm.compatible.util.g.Ac());
        this.eIX.a(this.eQY.eRQ, this.eQY.eIZ, this.eQY.eJa, this.eQY.eJb);
      }
    case -100: 
      com.tencent.mm.kernel.a.hold();
      com.tencent.mm.kernel.g.Eg();
      if (TextUtils.isEmpty(com.tencent.mm.kernel.a.Dh())) {}
      for (paramString = com.tencent.mm.bp.a.af(this, a.j.main_err_another_place);; paramString = com.tencent.mm.kernel.a.Dh())
      {
        com.tencent.mm.ui.base.h.a(this, paramString, getString(a.j.app_tip), new DialogInterface.OnClickListener()new LoginHistoryUI.18
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
        }, new LoginHistoryUI.18(this));
        return true;
        com.tencent.mm.kernel.g.Eg();
      }
    case -205: 
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LoginHistoryUI", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", new Object[] { bi.Xf(this.eOW), this.eRb });
      f.a(this.eQY);
      paramString = new Intent();
      paramString.putExtra("auth_ticket", this.eOW);
      paramString.putExtra("binded_mobile", this.eRa);
      paramString.putExtra("close_safe_device_style", this.eRb);
      paramString.putExtra("from_source", 2);
      com.tencent.mm.plugin.account.a.a.ezn.g(this, paramString);
      return true;
    }
    if (!bi.oW(this.cbP)) {
      aa.n(this, paramString, this.cbP);
    }
    return true;
    label698:
    paramString = new ah(paramInt1, paramInt2, paramString);
    return this.eRi.a(this, paramString);
  }
  
  private void goBack()
  {
    Intent localIntent = com.tencent.mm.plugin.account.a.a.ezn.be(this);
    localIntent.addFlags(67108864);
    if (bi.oW(this.eRc)) {
      localIntent.putExtra("can_finish", true);
    }
    startActivity(localIntent);
    finish();
    b.gF(this);
  }
  
  private void pL(String paramString)
  {
    this.eRp = paramString;
    Yz();
  }
  
  protected final void YA()
  {
    com.tencent.mm.kernel.g.DF().a(701, this);
  }
  
  protected final void YB()
  {
    com.tencent.mm.kernel.g.DF().b(701, this);
  }
  
  public final void YC()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (localInputMethodManager == null) {}
    Object localObject;
    do
    {
      do
      {
        return;
        localObject = getCurrentFocus();
      } while (localObject == null);
      localObject = ((View)localObject).getWindowToken();
    } while (localObject == null);
    localInputMethodManager.hideSoftInputFromWindow((IBinder)localObject, 0);
  }
  
  public boolean YD()
  {
    return true;
  }
  
  protected void Yz()
  {
    this.eQY.account = this.eRg.trim();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LoginHistoryUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LoginHistoryUI", "Scene Type " + paraml.getType());
    if (paraml.getType() == 145)
    {
      if ((this.eHw != null) && (this.eHw.isShowing()))
      {
        this.eHw.dismiss();
        this.eHw = null;
      }
      i = ((com.tencent.mm.modelfriend.a)paraml).Oh();
      if (i == 16) {
        if (paramInt2 == -41)
        {
          com.tencent.mm.ui.base.h.i(this, a.j.regbymobile_reg_mobile_format_err_msg, a.j.regbymobile_reg_mobile_format_err_title);
          this.eRn.reset();
          return;
          break label276;
        }
      }
      label151:
      while (paramInt2 == -75)
      {
        com.tencent.mm.ui.base.h.b(this, getString(a.j.alpha_version_tip_login), "", true);
        this.eRn.reset();
        return;
        if (i == 17)
        {
          this.eRx = paramInt2;
          this.eRy = paramString;
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            new g(new LoginHistoryUI.8(this), ((com.tencent.mm.modelfriend.a)paraml).getUsername(), ((com.tencent.mm.modelfriend.a)paraml).Oi(), this.eRa).a(this);
            return;
          }
          if (!e(paramInt1, paramInt2, paramString))
          {
            paraml = com.tencent.mm.h.a.eV(paramString);
            if (paraml != null) {
              paraml.a(this, null, null);
            }
          }
        }
      }
      label276:
      if (!e(paramInt1, paramInt2, paramString)) {}
    }
    else
    {
      if (paraml.getType() != 701) {
        break label777;
      }
      this.cbP = ((q)paraml).Rd();
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LoginHistoryUI", "url " + this.cbP);
      com.tencent.mm.kernel.g.DF().b(701, this);
      this.eQY.eRQ = ((q)paraml).getSecCodeType();
      this.eQY.eJa = ((q)paraml).Re();
      this.eQY.eIZ = ((q)paraml).Rf();
      this.eQY.eJb = ((q)paraml).Rg();
      if (paramInt2 == 65331)
      {
        this.eOW = ((q)paraml).Ok();
        this.eRa = ((q)paraml).Rh();
        this.eRb = ((q)paraml).Rk();
      }
      if ((paramInt1 != 4) || ((paramInt2 != -16) && (paramInt2 != -17))) {
        break label884;
      }
      com.tencent.mm.kernel.g.DF().a(new bg(new LoginHistoryUI.9(this)), 0);
    }
    label777:
    label884:
    for (int i = 1;; i = 0)
    {
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        com.tencent.mm.kernel.a.unhold();
        com.tencent.mm.platformtools.x.bZ(this);
        aa.oS(this.eQY.account);
        if ((this.eHw != null) && (this.eHw.isShowing())) {
          this.eHw.setMessage(getString(a.j.app_loading));
        }
        b((q)paraml);
        if (this.eLS != 3) {
          break label151;
        }
        this.eRr = ((q)paraml).Rm();
        com.tencent.mm.kernel.g.DF().a(255, this);
        paramString = new r(1);
        com.tencent.mm.kernel.g.DF().a(paramString, 0);
        getString(a.j.app_tip);
        this.eHw = com.tencent.mm.ui.base.h.a(this, getString(a.j.app_loading), true, new LoginHistoryUI.10(this, paramString));
        return;
      }
      if ((this.eHw != null) && (this.eHw.isShowing()))
      {
        this.eHw.dismiss();
        this.eHw = null;
      }
      if (paramInt2 == -106)
      {
        aa.e(this, paramString, 31685);
        return;
      }
      if (paramInt2 == 65319)
      {
        aa.a(this, com.tencent.mm.platformtools.f.a((q)paraml), paramInt2);
        return;
      }
      if (e(paramInt1, paramInt2, paramString)) {
        break label151;
      }
      paraml = com.tencent.mm.h.a.eV(paramString);
      if ((paraml != null) && (paraml.a(this, null, null))) {
        break label151;
      }
      Toast.makeText(this, getString(a.j.fmt_auth_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      break label276;
      break label151;
      if (paraml.getType() != 255) {
        break;
      }
      if ((this.eHw != null) && (this.eHw.isShowing()))
      {
        this.eHw.dismiss();
        this.eHw = null;
      }
      com.tencent.mm.kernel.g.DF().b(255, this);
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        break label151;
      }
      boolean bool = this.eRr;
      paramString = new Intent(this, RegByMobileSetPwdUI.class);
      paramString.putExtra("kintent_hint", getString(a.j.settings_modify_password_tip));
      paramString.putExtra("kintent_cancelable", bool);
      startActivity(paramString);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.login_history;
  }
  
  protected final void initView()
  {
    this.eRj = ((LinearLayout)findViewById(a.f.voice_print_ll));
    this.eRl = ((LinearLayout)findViewById(a.f.face_print_ll));
    this.eRk = ((LinearLayout)findViewById(a.f.finger_print_ll));
    this.eRm = ((MMFormInputView)findViewById(a.f.login_password_input));
    this.eRn = ((MMFormVerifyCodeInputView)findViewById(a.f.sms_verify_container));
    this.eRc = getIntent().getStringExtra("switch_login_wx_id");
    if (!bi.oW(this.eRc))
    {
      this.eRg = bt.dDs.getString(this.eRc, "login_user_name");
      this.eRh = bt.dDs.getString(this.eRc, "last_avatar_path");
      this.eRt = bi.WU(bt.dDs.getString(this.eRc, "last_bind_info"));
      if ((this.eRt & 0x1) != 0) {
        this.eQZ = bt.dDs.getString(this.eRc, "last_login_bind_qq");
      }
      if ((this.eRt & 0x4) != 0) {
        this.eRa = bt.dDs.getString(this.eRc, "last_login_bind_mobile");
      }
      this.eRs = bi.WU(bt.dDs.getString(this.eRc, "last_login_use_voice"));
      setBackBtn(new LoginHistoryUI.25(this), a.i.actionbar_icon_close_black);
    }
    Object localObject;
    for (;;)
    {
      localObject = getIntent().getStringExtra("email_address");
      if ((!bi.oW((String)localObject)) && (!((String)localObject).equalsIgnoreCase(this.eRg))) {
        this.eRg = ((String)localObject);
      }
      this.eRd = ((ImageView)findViewById(a.f.last_avatar));
      if (!bi.oW(this.eRh))
      {
        localObject = com.tencent.mm.aa.f.jW(this.eRh);
        if ((localObject != null) && (((Bitmap)localObject).getWidth() > 10)) {
          this.eRd.setImageBitmap(Bitmap.createBitmap((Bitmap)localObject, 5, 5, ((Bitmap)localObject).getWidth() - 10, ((Bitmap)localObject).getHeight() - 10, null, false));
        }
      }
      com.tencent.mm.kernel.g.Eg();
      if ((!com.tencent.mm.kernel.a.Dw()) || (this.eRg.equals(""))) {
        break;
      }
      this.eRq = true;
      b(null);
      return;
      this.eRg = at.dBv.I("login_user_name", "");
      this.eRh = at.dBv.HL();
      this.eRt = bi.WU(at.dBv.I("last_bind_info", ""));
      if ((this.eRt & 0x1) != 0) {
        this.eQZ = at.dBv.I("last_login_bind_qq", "");
      }
      if ((this.eRt & 0x4) != 0) {
        this.eRa = at.dBv.I("last_login_bind_mobile", "");
      }
      this.eRs = bi.WU(at.dBv.I("last_login_use_voice", ""));
    }
    this.eRe = ((MMKeyboardUperView)findViewById(a.f.scrollView));
    this.eQN = ((TextView)findViewById(a.f.login_account_auto));
    this.eQO = this.eRm.getContentEditText();
    this.eQP = ((Button)findViewById(a.f.login_btn));
    this.eQR = findViewById(a.f.login_voice_btn);
    this.eQS = findViewById(a.f.login_face_btn);
    this.eQT = ((Button)findViewById(a.f.shua_fingerprint_btn));
    this.eQQ = ((Button)findViewById(a.f.login_change_btn));
    this.eRo = ((Button)findViewById(a.f.login_as_other_device_btn));
    this.eQU = ((Button)findViewById(a.f.login_find_password_btn));
    this.eQV = ((Button)findViewById(a.f.login_freeze_account_btn));
    this.eQW = findViewById(a.f.free_btn_container);
    this.eQX = ((Button)findViewById(a.f.login_more_btn));
    this.eQU.setOnClickListener(new LoginHistoryUI.26(this));
    this.eQV.setOnClickListener(new LoginHistoryUI.27(this));
    if (!w.chM()) {
      this.eQW.setVisibility(8);
    }
    this.eRm.setVisibility(8);
    this.eRj.setVisibility(8);
    this.eRl.setVisibility(8);
    this.eRk.setVisibility(8);
    this.eQP.setVisibility(8);
    this.eQR.setVisibility(8);
    this.eQS.setVisibility(8);
    this.eQT.setVisibility(8);
    this.eQQ.setVisibility(8);
    com.tencent.mm.ui.tools.a.c.d(this.eQO).fj(4, 16).a(null);
    this.eRf = ((ResizeLayout)findViewById(a.f.resize_lv));
    if ((bi.Xd(this.eRg).booleanValue()) && (!this.eRg.equals(this.eQZ)))
    {
      this.eRw[2] = 1;
      this.eQN.setText(pK(this.eRg));
      label864:
      this.eRf.setOnSizeChanged(new LoginHistoryUI.28(this));
      this.eRe.setOnTouchListener(new LoginHistoryUI.29(this));
      localObject = new com.tencent.mm.ui.widget.a.d(this, 1, false);
      ((com.tencent.mm.ui.widget.a.d)localObject).ofp = new LoginHistoryUI.30(this);
      ((com.tencent.mm.ui.widget.a.d)localObject).ofq = new LoginHistoryUI.2(this);
      ((com.tencent.mm.ui.widget.a.d)localObject).uJQ = new LoginHistoryUI.3(this, (com.tencent.mm.ui.widget.a.d)localObject);
      if (!bi.oW(this.eRc)) {
        break label1063;
      }
      this.eQX.setOnClickListener(new LoginHistoryUI.4(this, (com.tencent.mm.ui.widget.a.d)localObject));
    }
    for (;;)
    {
      setMMTitle("");
      lF(getResources().getColor(a.c.normal_actionbar_color));
      cqh();
      lD(false);
      if (com.tencent.mm.sdk.platformtools.e.sFE) {
        com.tencent.mm.plugin.account.a.a.ezo.g(this);
      }
      if (!com.tencent.mm.sdk.platformtools.d.EX_DEVICE_LOGIN) {
        break;
      }
      this.eRo.setVisibility(0);
      this.eRo.setOnClickListener(new LoginHistoryUI.7(this));
      return;
      this.eRw[2] = 2;
      this.eQN.setText(this.eRg);
      break label864;
      label1063:
      if (!w.chM())
      {
        this.eQX.setText(a.j.wechat_help_center);
        this.eQX.setOnClickListener(new LoginHistoryUI.5(this));
      }
      else
      {
        this.eQX.setText(a.j.wechat_safe_center);
        this.eQX.setOnClickListener(new LoginHistoryUI.6(this));
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int j = 0;
    int i = 0;
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    String str;
    if (paramIntent == null)
    {
      bool = true;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LoginHistoryUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if ((paramInt1 != 1024) || (paramIntent == null)) {
        break label164;
      }
      if (paramInt2 == -1)
      {
        str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
        paramInt2 = paramIntent.getIntExtra("KVoiceHelpCode", 0);
        bool = bi.oW(str);
        if (!bi.oW(str)) {
          break label155;
        }
        paramInt1 = i;
        label107:
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LoginHistoryUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        pL(str);
      }
    }
    label155:
    label164:
    label246:
    do
    {
      do
      {
        do
        {
          return;
          bool = false;
          break;
          paramInt1 = str.length();
          break label107;
          if ((paramInt1 != 1025) || (paramIntent == null)) {
            break label246;
          }
        } while (paramInt2 != 2);
        paramIntent = paramIntent.getStringExtra("KFaceLoginAuthPwd");
        bool = bi.oW(paramIntent);
        if (bi.oW(paramIntent)) {}
        for (paramInt1 = j;; paramInt1 = paramIntent.length())
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LoginHistoryUI", "hy: onActivityResult, do faceprint auth, authPwd is null:%b, authPwd.len:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1) });
          pL(paramIntent);
          return;
        }
      } while ((paramInt1 != 31685) || (paramIntent == null) || (paramInt2 != -1));
      paramIntent = paramIntent.getBundleExtra("result_data");
    } while ((paramIntent == null) || (!paramIntent.getString("go_next", "").equals("auth_again")));
    if (!bi.oW(paramIntent.getString("VoiceLoginAuthPwd"))) {
      this.eRp = paramIntent.getString("VoiceLoginAuthPwd");
    }
    Yz();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LoginHistoryUI", "AccountSyncApplication.modelCallback %s", new Object[] { com.tencent.mm.plugin.account.a.a.ezo });
    com.tencent.mm.plugin.account.a.a.ezo.vo();
    this.duR = ad.getContext().getSharedPreferences(ad.chY(), 0);
    paramBundle = getIntent();
    if (paramBundle != null)
    {
      this.eRu = paramBundle.getBooleanExtra("login_success_need_bind_fingerprint", false);
      if (this.eRu) {
        this.eRv = paramBundle.getStringExtra("bind_login_fingerprint_info");
      }
    }
    initView();
    this.eRi = new com.tencent.mm.platformtools.d();
  }
  
  public void onDestroy()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LoginHistoryUI", "onDestroy");
    com.tencent.mm.kernel.g.DF().b(701, this);
    if (this.eRi != null) {
      this.eRi.close();
    }
    com.tencent.mm.plugin.report.service.h.mEJ.h(14262, new Object[] { Integer.valueOf(this.eRw[0]), Integer.valueOf(this.eRw[1]), Integer.valueOf(this.eRw[2]), Integer.valueOf(this.eRw[3]), Integer.valueOf(this.eRw[4]) });
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0)) {
      goBack();
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
    super.onResume();
    final Object localObject1 = new ArrayList();
    Object localObject2;
    if ((YD()) && (this.eLS != 1) && ((this.eRs & 0x20000) != 0))
    {
      localObject2 = new com.tencent.mm.ui.base.m(this, 7001, 0);
      ((com.tencent.mm.ui.base.m)localObject2).setTitle(a.j.login_login_by_voice_print);
      ((List)localObject1).add(localObject2);
    }
    if ((this.eLS != 5) && ((this.eRs & 0x40000) != 0))
    {
      localObject2 = new com.tencent.mm.ui.base.m(this, 7005, 0);
      ((com.tencent.mm.ui.base.m)localObject2).setTitle(a.j.login_login_by_finger_print);
      ((List)localObject1).add(localObject2);
    }
    if (!bi.oW(this.eRg))
    {
      if (this.eLS != 2)
      {
        localObject2 = new com.tencent.mm.ui.base.m(this, 7007, 0);
        ((com.tencent.mm.ui.base.m)localObject2).setTitle(getString(a.j.login_login_by_password));
        ((List)localObject1).add(localObject2);
      }
      if ((!bi.oW(this.eRa)) && (this.eLS != 3))
      {
        localObject2 = new com.tencent.mm.ui.base.m(this, 7008, 0);
        ((com.tencent.mm.ui.base.m)localObject2).setTitle(getString(a.j.login_login_by_sms));
        ((List)localObject1).add(localObject2);
      }
      if (this.eRg.equalsIgnoreCase(this.eQZ)) {
        this.eQO.setHint(getString(a.j.regbyqq_password_hint));
      }
    }
    if (((List)localObject1).size() > 1)
    {
      localObject2 = new com.tencent.mm.ui.widget.a.d(this, 1, false);
      ((com.tencent.mm.ui.widget.a.d)localObject2).ofp = new n.c()
      {
        public final void a(com.tencent.mm.ui.base.l paramAnonymousl)
        {
          if (paramAnonymousl.size() == 0)
          {
            Iterator localIterator = localObject1.iterator();
            while (localIterator.hasNext())
            {
              com.tencent.mm.ui.base.m localm = (com.tencent.mm.ui.base.m)localIterator.next();
              if (localm != null) {
                paramAnonymousl.twb.add(localm);
              }
            }
          }
        }
      };
      ((com.tencent.mm.ui.widget.a.d)localObject2).ofq = new LoginHistoryUI.20(this);
      ((com.tencent.mm.ui.widget.a.d)localObject2).uJQ = new LoginHistoryUI.21(this, (com.tencent.mm.ui.widget.a.d)localObject2);
      this.eQQ.setVisibility(0);
      this.eQQ.setText(a.j.login_by_other_method);
      this.eQQ.setOnClickListener(new LoginHistoryUI.23(this, (com.tencent.mm.ui.widget.a.d)localObject2));
      com.tencent.mm.sdk.b.a.sFg.b(this.eQf);
      com.tencent.mm.kernel.g.Eg();
      com.tencent.mm.kernel.a.DB();
      com.tencent.mm.kernel.g.Eg();
      if ((!com.tencent.mm.kernel.a.Dw()) || (this.eRg.equals(""))) {
        break label470;
      }
      if ((this.eHw == null) || (!this.eHw.isShowing())) {
        break label464;
      }
    }
    label464:
    label470:
    while (com.tencent.mm.o.a.BP() != 2)
    {
      return;
      if (((List)localObject1).size() > 0)
      {
        this.eQQ.setVisibility(0);
        this.eQQ.setText(((com.tencent.mm.ui.base.m)((List)localObject1).get(0)).getTitle());
        this.eQQ.setOnClickListener(new LoginHistoryUI.24(this, (List)localObject1));
        break;
      }
      this.eQQ.setVisibility(8);
      break;
      b(null);
      return;
    }
    localObject1 = new c.a(this);
    ((c.a)localObject1).Gq(a.j.check_db_size_tip_dangerous_title);
    ((c.a)localObject1).abu(getString(a.j.check_db_size_tip_dangerous_message));
    ((c.a)localObject1).mF(false);
    ((c.a)localObject1).Gt(a.j.check_db_size_btn_dangerous_message).a(new LoginHistoryUI.22(this));
    ((c.a)localObject1).anj().show();
    com.tencent.mm.o.a.b(this, System.currentTimeMillis());
  }
  
  protected final String pK(String paramString)
  {
    new ap();
    String str1 = "86";
    Object localObject = paramString;
    if (this.eRg.startsWith("+"))
    {
      String str2 = paramString.replace("+", "");
      paramString = ap.Fp(str2);
      str1 = paramString;
      localObject = str2;
      if (paramString != null)
      {
        localObject = str2.substring(paramString.length());
        str1 = paramString;
      }
    }
    return ap.formatNumber(str1, (String)localObject);
  }
  
  public void setRequestedOrientation(int paramInt) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/ui/LoginHistoryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */