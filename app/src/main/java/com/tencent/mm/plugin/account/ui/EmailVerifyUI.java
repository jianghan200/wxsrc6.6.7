package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.r.a;
import com.tencent.mm.plugin.account.friend.a.r.b;
import com.tencent.mm.plugin.account.friend.a.z;
import com.tencent.mm.protocal.c.sy;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMAutoSwitchEditTextView;
import com.tencent.mm.ui.base.MMAutoSwitchEditTextView.b;
import com.tencent.mm.ui.base.h;

public class EmailVerifyUI
  extends MMActivity
  implements e
{
  private ProgressDialog eHw = null;
  private String eHy;
  private TextView ePN;
  private TextView ePO;
  private MMAutoSwitchEditTextView ePP;
  private Button ePQ;
  private Button ePR;
  private String ePS;
  private String ePT;
  private String ePU;
  private String ePV;
  private boolean ePW = false;
  
  private void goBack()
  {
    com.tencent.mm.plugin.c.a.pU(this.eHy);
    finish();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.EmailVerifyUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    this.ePW = false;
    if ((this.eHw != null) && (this.eHw.isShowing()))
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if (paraml.getType() != 481) {
      x.e("MicroMsg.EmailVerifyUI", "error cgi type callback:[%d]", new Object[] { Integer.valueOf(paraml.getType()) });
    }
    int j;
    label567:
    do
    {
      for (;;)
      {
        return;
        j = ((r.a)((z)paraml).dJM.KV()).eKz.rfe;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (j == 2)
          {
            com.tencent.mm.plugin.c.a.pU("R200_900_email");
            paramString = new Intent(this, RegSetInfoUI.class);
            paramString.putExtra("regsetinfo_ticket", ((r.b)((z)paraml).dJM.Id()).eKA.rwj);
            paramString.putExtra("regsetinfo_user", this.ePS);
            paramString.putExtra("regsetinfo_ismobile", 3);
            paramString.putExtra("regsetinfo_NextStyle", ((z)paraml).Ro());
            paramString.putExtra("regsetinfo_pwd", this.ePU);
            paramString.putExtra("regsetinfo_bind_email", this.ePS);
            startActivity(paramString);
            return;
          }
          if (j == 1)
          {
            paramString = new StringBuilder();
            g.Eg();
            paramString = paramString.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R22_resend_email_code_alert,");
            g.Eg();
            com.tencent.mm.plugin.c.a.pV(com.tencent.mm.kernel.a.gd("R22_resend_email_code_alert") + ",3");
            h.bA(this, getString(a.j.regby_email_send_verify_code_ok));
            return;
          }
          x.e("MicroMsg.EmailVerifyUI", "err opcode");
          return;
        }
        int i;
        if (com.tencent.mm.plugin.account.a.a.ezo.a(this, paramInt1, paramInt2, paramString)) {
          i = 1;
        }
        while (i == 0)
        {
          if (j != 2) {
            break label567;
          }
          Toast.makeText(this, getString(a.j.regby_email_verify_failed, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          return;
          switch (paramInt2)
          {
          default: 
            i = 0;
            break;
          case -32: 
            h.a(this, a.j.regby_email_err_unmatch_content, a.j.regby_email_err_tip_title, null);
            paramString = new StringBuilder();
            g.Eg();
            paramString = paramString.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R500_260,");
            g.Eg();
            com.tencent.mm.plugin.c.a.pV(com.tencent.mm.kernel.a.gd("R500_260") + ",3");
            i = 1;
            break;
          case -33: 
            h.a(this, a.j.regby_email_err_time_out_content, a.j.regby_email_err_tip_title, null);
            i = 1;
            break;
          case -34: 
            Toast.makeText(this, a.j.regby_email_err_freq_limit, 0).show();
            i = 1;
          }
        }
      }
    } while (j != 1);
    Toast.makeText(this, getString(a.j.regby_email_send_verify_code_failed, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
  }
  
  protected final int getLayoutId()
  {
    return a.g.verify_email_address;
  }
  
  protected final void initView()
  {
    setMMTitle(a.j.regby_email_verify_email);
    this.ePN = ((TextView)findViewById(a.f.verify_email_hint));
    String str = getString(a.j.regby_email_input_verify_tip);
    this.ePN.setText(Html.fromHtml(str));
    this.ePO = ((TextView)findViewById(a.f.email_address));
    this.ePS = getIntent().getStringExtra("email_address");
    if (!bi.oW(this.ePS))
    {
      this.ePO.setText(this.ePS);
      this.ePU = getIntent().getStringExtra("password");
      this.ePT = getIntent().getStringExtra("email_login_page");
      x.i("MicroMsg.EmailVerifyUI", "user register:email add:[%s], password not allowed to printf, login page:[%s]", new Object[] { this.ePS, this.ePT });
      this.ePP = ((MMAutoSwitchEditTextView)findViewById(a.f.auto_switch_ll));
      this.ePP.setOnInputFinished(new EmailVerifyUI.1(this));
      this.ePP.setOnTextChanged(new MMAutoSwitchEditTextView.b()
      {
        public final void Yu()
        {
          EmailVerifyUI.this.enableOptionMenu(false);
        }
      });
      this.ePR = ((Button)findViewById(a.f.re_send_verify_code_btn));
      this.ePR.setOnClickListener(new EmailVerifyUI.3(this));
      this.ePQ = ((Button)findViewById(a.f.open_browser_btn));
      if ((!bi.oW(this.ePT)) && (!bi.oW(this.ePS))) {
        break label308;
      }
      this.ePQ.setVisibility(8);
    }
    for (;;)
    {
      setBackBtn(new EmailVerifyUI.5(this));
      addTextOptionMenu(0, getString(a.j.app_nextstep), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          EmailVerifyUI.b(EmailVerifyUI.this, EmailVerifyUI.e(EmailVerifyUI.this).getText());
          if ((!bi.oW(EmailVerifyUI.f(EmailVerifyUI.this))) && (EmailVerifyUI.f(EmailVerifyUI.this).length() == 12)) {
            EmailVerifyUI.a(EmailVerifyUI.this, EmailVerifyUI.f(EmailVerifyUI.this));
          }
          for (;;)
          {
            return true;
            EmailVerifyUI.this.enableOptionMenu(false);
          }
        }
      });
      enableOptionMenu(false);
      return;
      x.w("MicroMsg.EmailVerifyUI", "email add is null or nill");
      break;
      label308:
      this.ePQ.setVisibility(0);
      this.ePQ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          bi.L(EmailVerifyUI.this, EmailVerifyUI.c(EmailVerifyUI.this));
        }
      });
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    this.eHy = com.tencent.mm.plugin.c.a.Zu();
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
  
  protected void onPause()
  {
    super.onPause();
    g.DF().b(481, this);
    StringBuilder localStringBuilder = new StringBuilder();
    g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R500_200,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R500_200") + ",2");
  }
  
  protected void onResume()
  {
    super.onResume();
    g.DF().a(481, this);
    StringBuilder localStringBuilder = new StringBuilder();
    g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R500_200,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("R500_200") + ",1");
    com.tencent.mm.plugin.c.a.pT("R500_200");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/ui/EmailVerifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */