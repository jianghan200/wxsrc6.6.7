package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;

public class RegByQQAuthUI
  extends MMActivity
  implements e
{
  private String account;
  private String bLe;
  private String bWI;
  private ProgressDialog eHw = null;
  private String eIY;
  private EditText eWe = null;
  private int eWf;
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.RegByQQAuthUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if (!bi.ci(this)) {}
    for (;;)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        switch (paraml.getType())
        {
        default: 
          return;
        }
        com.tencent.mm.kernel.a.unhold();
        at.dBv.T("login_user_name", this.account);
        paramString = new Intent(this, BindMContactIntroUI.class);
        paramString.putExtra("key_upload_scene", 1);
        paramString.putExtra("skip", true);
        paraml = com.tencent.mm.plugin.account.a.a.ezn.be(this);
        paraml.addFlags(67108864);
        paraml.putExtra("LauncherUI.enter_from_reg", true);
        MMWizardActivity.b(this, paramString, paraml);
        return;
      }
      if (paraml.getType() == 126)
      {
        paraml = com.tencent.mm.h.a.eV(paramString);
        if (paraml != null)
        {
          paraml.a(this, null, null);
          return;
        }
      }
      int i;
      if (com.tencent.mm.plugin.account.a.a.ezo.a(this.mController.tml, paramInt1, paramInt2, paramString)) {
        i = 1;
      }
      while (i == 0)
      {
        Toast.makeText(this, getString(a.j.fmt_reg_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        return;
        if (paramInt1 == 4) {}
        switch (paramInt2)
        {
        default: 
          i = 0;
          break;
        case -1: 
          if (g.DF().Lg() == 5)
          {
            h.i(this, a.j.net_warn_server_down_tip, a.j.net_warn_server_down);
            i = 1;
          }
          break;
        case -3: 
          h.i(this, a.j.app_err_password, a.j.regbyqq_auth_err_title);
          i = 1;
          break;
        case -4: 
          h.i(this, a.j.app_err_nouser, a.j.regbyqq_auth_err_title);
          i = 1;
          break;
        case -12: 
          h.i(this, a.j.regbyqq_auth_err_uinexsit, a.j.regbyqq_auth_err_title);
          i = 1;
          break;
        case -11: 
          h.i(this, a.j.regbyqq_auth_err_nickinvalid, a.j.regbyqq_auth_err_title);
          i = 1;
          break;
        case -72: 
          h.i(this.mController.tml, a.j.regbyqq_auth_err_failed_niceqq, a.j.app_tip);
          i = 1;
          break;
        case -75: 
          h.i(this.mController.tml, a.j.alpha_version_tip_reg, a.j.app_tip);
          i = 1;
        }
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.regbyqq_auth;
  }
  
  protected final void initView()
  {
    this.eWf = getIntent().getIntExtra("RegByQQ_BindUin", 0);
    this.eIY = getIntent().getStringExtra("RegByQQ_RawPsw");
    this.account = getIntent().getStringExtra("RegByQQ_Account");
    this.bLe = getIntent().getStringExtra("RegByQQ_Ticket");
    this.bWI = getIntent().getStringExtra("RegByQQ_Nick");
    x.v("MicroMsg.RegByQQAuthUI", "values : bindUin:" + this.eWf + "  pass:" + this.eIY + "  ticket:" + this.bLe);
    this.eWe = ((EditText)findViewById(a.f.nick_et));
    if ((this.bWI != null) && (!this.bWI.equals(""))) {
      this.eWe.setText(this.bWI);
    }
    setMMTitle(a.j.regbyqq_auth_title);
    addTextOptionMenu(0, getString(a.j.app_nextstep), new RegByQQAuthUI.1(this));
    setBackBtn(new RegByQQAuthUI.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
    g.DF().b(126, this);
  }
  
  public void onResume()
  {
    super.onResume();
    g.DF().a(126, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/ui/RegByQQAuthUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */