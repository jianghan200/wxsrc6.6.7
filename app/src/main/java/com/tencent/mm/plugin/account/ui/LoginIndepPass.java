package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.iz;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bg.a;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;

public class LoginIndepPass
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private String account;
  private String cbP;
  private ProgressDialog eHw = null;
  private String eHy;
  private p eIV;
  private SecurityImage eIX = null;
  private String eOW;
  private f eQY = new f();
  private com.tencent.mm.sdk.b.c eQf = new com.tencent.mm.sdk.b.c() {};
  private EditText eRG;
  private String eRH;
  private Button eRI;
  private String eRa;
  private String eRb;
  
  private void Yz()
  {
    Object localObject = this.eRG.getText().toString();
    if (bi.oW(this.account))
    {
      h.i(this, a.j.verify_username_null_tip, a.j.login_err_title);
      return;
    }
    if (((String)localObject).equals(""))
    {
      h.i(this, a.j.verify_password_null_tip, a.j.login_err_title);
      return;
    }
    YC();
    com.tencent.mm.kernel.g.DF().a(701, this);
    localObject = new q(this.account, (String)localObject, null, 1);
    com.tencent.mm.kernel.g.DF().a((com.tencent.mm.ab.l)localObject, 0);
    getString(a.j.app_tip);
    this.eHw = h.a(this, getString(a.j.login_logining), true, new LoginIndepPass.16(this, (q)localObject));
  }
  
  private boolean e(int paramInt1, int paramInt2, String paramString)
  {
    boolean bool2 = false;
    boolean bool1;
    if (com.tencent.mm.plugin.account.a.a.ezo.a(this.mController.tml, paramInt1, paramInt2, paramString)) {
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
          aa.n(this.mController.tml, paramString, this.cbP);
        }
        return true;
      case -1: 
        bool1 = bool2;
      }
    } while (com.tencent.mm.kernel.g.DF().Lg() != 5);
    h.i(this, a.j.net_warn_server_down_tip, a.j.net_warn_server_down);
    return true;
    h.i(this, a.j.errcode_password, a.j.login_err_title);
    return true;
    h.i(this, a.j.login_err_mailnotverify, a.j.login_err_title);
    return true;
    com.tencent.mm.kernel.a.hold();
    ActionBarActivity localActionBarActivity = this.mController.tml;
    com.tencent.mm.kernel.g.Eg();
    if (TextUtils.isEmpty(com.tencent.mm.kernel.a.Dh())) {}
    for (paramString = com.tencent.mm.bp.a.af(this.mController.tml, a.j.main_err_another_place);; paramString = com.tencent.mm.kernel.a.Dh())
    {
      h.a(localActionBarActivity, paramString, this.mController.tml.getString(a.j.app_tip), new LoginIndepPass.7(this), new LoginIndepPass.8(this));
      return true;
      com.tencent.mm.kernel.g.Eg();
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LoginIndepPass", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if (this.eIV != null)
    {
      this.eIV.dismiss();
      this.eIV = null;
    }
    if (paraml.getType() == 701)
    {
      this.cbP = ((q)paraml).Rd();
      com.tencent.mm.kernel.g.DF().b(701, this);
      this.eQY.eJa = ((q)paraml).Re();
      this.eQY.eIZ = ((q)paraml).Rf();
      this.eQY.eJb = ((q)paraml).Rg();
      this.eQY.eRQ = ((q)paraml).getSecCodeType();
      this.eQY.account = this.account;
      this.eQY.eIY = this.eRG.getText().toString();
      if (paramInt2 == -75) {
        aa.ch(this.mController.tml);
      }
      do
      {
        return;
        if (paramInt2 == -106)
        {
          aa.e(this, paramString, 0);
          return;
        }
        if (paramInt2 == 65319)
        {
          aa.a(this, com.tencent.mm.platformtools.f.a((q)paraml), paramInt2);
          return;
        }
        if (paramInt2 == 65331)
        {
          this.eOW = ((q)paraml).Ok();
          this.eRa = ((q)paraml).Rh();
          this.eRb = ((q)paraml).Rk();
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LoginIndepPass", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", new Object[] { bi.Xf(this.eOW), this.eRb });
          f.a(this.eQY);
          paramString = new Intent();
          paramString.putExtra("auth_ticket", this.eOW);
          paramString.putExtra("binded_mobile", this.eRa);
          paramString.putExtra("close_safe_device_style", this.eRb);
          paramString.putExtra("from_source", 5);
          com.tencent.mm.plugin.account.a.a.ezn.g(this, paramString);
          return;
        }
        if (paramInt2 != 65396) {
          break;
        }
      } while (bi.oW(this.cbP));
      aa.n(this, paramString, this.cbP);
      return;
      if ((paramInt1 != 4) || ((paramInt2 != -16) && (paramInt2 != -17))) {
        break label1098;
      }
      com.tencent.mm.kernel.g.DF().a(new bg(new bg.a()
      {
        public final void a(com.tencent.mm.network.e paramAnonymouse)
        {
          if (paramAnonymouse == null) {
            return;
          }
          paramAnonymouse = paramAnonymouse.Lr();
          com.tencent.mm.kernel.g.Eg();
          int i = com.tencent.mm.kernel.a.Df();
          paramAnonymouse.x(new byte[0], i);
        }
      }), 0);
    }
    label1098:
    for (int i = 1;; i = 0)
    {
      if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
      {
        com.tencent.mm.kernel.g.DF().a(701, this);
        if (this.eIX == null)
        {
          this.eIX = SecurityImage.a.a(this.mController.tml, a.j.regbyqq_secimg_title, this.eQY.eRQ, this.eQY.eIZ, this.eQY.eJa, this.eQY.eJb, new LoginIndepPass.4(this), null, new LoginIndepPass.5(this), this.eQY);
          return;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LoginIndepPass", "imgSid:" + this.eQY.eJa + " img len" + this.eQY.eIZ.length + " " + com.tencent.mm.compatible.util.g.Ac());
        this.eIX.a(this.eQY.eRQ, this.eQY.eIZ, this.eQY.eJa, this.eQY.eJb);
        return;
      }
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        com.tencent.mm.kernel.a.unhold();
        aa.oS(this.eQY.account);
        com.tencent.mm.platformtools.x.bZ(this);
        aa.showAddrBookUploadConfirm(this, new LoginIndepPass.6(this), false, 2);
        return;
      }
      if (e(paramInt1, paramInt2, paramString)) {
        break;
      }
      if (paraml.getType() == 701)
      {
        paramString = com.tencent.mm.h.a.eV(paramString);
        if ((paramString != null) && (paramString.a(this, null, null))) {
          break;
        }
      }
      Toast.makeText(this, getString(a.j.fmt_auth_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      return;
      if (paraml.getType() == 145)
      {
        com.tencent.mm.kernel.g.DF().b(145, this);
        paramString = ((com.tencent.mm.modelfriend.a)paraml).Ol();
        if (paramInt2 == -41)
        {
          h.i(this, a.j.regbymobile_reg_mobile_format_err_msg, a.j.regbymobile_reg_mobile_format_err_title);
          return;
        }
        if (paramInt2 == -75)
        {
          h.b(this, getString(a.j.alpha_version_tip_login), "", true);
          return;
        }
        com.tencent.mm.plugin.c.a.pU("L3");
        Object localObject = new StringBuilder();
        com.tencent.mm.kernel.g.Eg();
        localObject = ((StringBuilder)localObject).append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",L3,");
        com.tencent.mm.kernel.g.Eg();
        com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("L3") + ",1");
        localObject = new Intent();
        ((Intent)localObject).putExtra("bindmcontact_mobile", this.eRH);
        ((Intent)localObject).putExtra("bindmcontact_shortmobile", paramString);
        ((Intent)localObject).putExtra("mobile_verify_purpose", 1);
        ((Intent)localObject).putExtra("login_type", 3);
        ((Intent)localObject).putExtra("mobileverify_countdownsec", ((com.tencent.mm.modelfriend.a)paraml).Oq());
        ((Intent)localObject).putExtra("mobileverify_countdownstyle", ((com.tencent.mm.modelfriend.a)paraml).Or());
        ((Intent)localObject).putExtra("mobileverify_fb", ((com.tencent.mm.modelfriend.a)paraml).Os());
        a(MobileVerifyUI.class, (Intent)localObject);
        return;
      }
      if ((e(paramInt1, paramInt2, paramString)) || ((paramInt1 == 0) && (paramInt2 == 0))) {
        break;
      }
      Toast.makeText(this, getString(a.j.fmt_auth_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.login_indep_pass;
  }
  
  protected final void initView()
  {
    this.eRG = ((EditText)findViewById(a.f.indep_password));
    this.eRI = ((Button)findViewById(a.f.login_tip));
    enableOptionMenu(false);
    addTextOptionMenu(0, getString(a.j.login_login), new LoginIndepPass.9(this));
    this.eRG.addTextChangedListener(new LoginIndepPass.10(this));
    this.eRG.setOnEditorActionListener(new LoginIndepPass.11(this));
    this.eRG.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        if ((66 == paramAnonymousInt) && (paramAnonymousKeyEvent.getAction() == 0))
        {
          LoginIndepPass.a(LoginIndepPass.this);
          return true;
        }
        return false;
      }
    });
    this.eRI.setText(getString(a.j.login_login_by_sms));
    this.eRI.setOnClickListener(new LoginIndepPass.13(this));
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        com.tencent.mm.plugin.c.a.pU("L200_100");
        paramAnonymousMenuItem = new Intent(LoginIndepPass.this, MobileInputUI.class);
        paramAnonymousMenuItem.putExtra("mobile_input_purpose", 1);
        paramAnonymousMenuItem.addFlags(67108864);
        LoginIndepPass.this.startActivity(paramAnonymousMenuItem);
        LoginIndepPass.this.finish();
        return true;
      }
    });
    this.eOW = getIntent().getStringExtra("auth_ticket");
    if (!bi.oW(this.eOW)) {
      new ag().postDelayed(new Runnable()
      {
        public final void run()
        {
          LoginIndepPass.a(LoginIndepPass.this, f.YF(), f.YG());
        }
      }, 500L);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    String str;
    if (paramIntent == null)
    {
      bool = true;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LoginIndepPass", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if ((paramInt2 == -1) && (paramInt1 == 1024) && (paramIntent != null))
      {
        str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
        paramInt2 = paramIntent.getIntExtra("KVoiceHelpCode", 0);
        bool = bi.oW(str);
        if (!bi.oW(str)) {
          break label157;
        }
      }
    }
    label157:
    for (paramInt1 = i;; paramInt1 = str.length())
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LoginIndepPass", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramInt2 == 65319) {
        Yz();
      }
      return;
      bool = false;
      break;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getString(a.j.login_indep_title);
    if (d.qVQ) {
      paramBundle = getString(a.j.app_name) + getString(a.j.alpha_version_alpha);
    }
    setMMTitle(paramBundle);
    this.eRH = getIntent().getStringExtra("bindmcontact_mobile");
    if (this.eRH != null) {
      this.account = ap.Ww(this.eRH);
    }
    com.tencent.mm.plugin.account.a.a.ezo.vo();
    this.eHy = com.tencent.mm.plugin.c.a.Zu();
    initView();
  }
  
  public void onDestroy()
  {
    com.tencent.mm.kernel.g.DF().b(701, this);
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
    com.tencent.mm.sdk.b.a.sFg.c(this.eQf);
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",L200_200,");
    com.tencent.mm.kernel.g.Eg();
    com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("L200_200") + ",2");
  }
  
  public void onResume()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.eQf);
    super.onResume();
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",L200_200,");
    com.tencent.mm.kernel.g.Eg();
    com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("L200_200") + ",1");
    com.tencent.mm.plugin.c.a.pT("L200_200");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/ui/LoginIndepPass.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */