package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.k;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMAutoCompleteTextView;
import com.tencent.mm.ui.base.h;
import java.util.Map;
import java.util.Set;

public class RegByEmailUI
  extends MMActivity
  implements e
{
  private static String[] eUF;
  private String csD;
  private ProgressDialog eHw = null;
  private String eHy;
  private String eIY;
  private MMAutoCompleteTextView eUA;
  private EditText eUB;
  private CheckBox eUC;
  private String eUD;
  private Map<String, String> eUE;
  
  private void goBack()
  {
    h.a(this, a.j.regby_email_cancel_registion_tip, a.j.regby_email_err_tip_title, a.j.app_ok, a.j.app_cancel, new RegByEmailUI.2(this), null);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RegByEmailUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((this.eHw != null) && (this.eHw.isShowing()))
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if (paraml.getType() != 481) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RegByEmailUI", "error cgi type callback:[%d]", new Object[] { Integer.valueOf(paraml.getType()) });
    }
    for (;;)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.plugin.c.a.pU("R500_200");
        paramString = new Intent(this, EmailVerifyUI.class);
        paramString.putExtra("email_address", this.csD);
        paramString.putExtra("password", this.eIY);
        if ((this.eUE != null) && (!this.eUE.isEmpty()))
        {
          paraml = this.csD.split("@");
          if ((paraml != null) && (paraml.length == 2))
          {
            paraml = paraml[1];
            paramString.putExtra("email_login_page", (String)this.eUE.get(paraml));
          }
        }
        startActivity(paramString);
        return;
      }
      int i;
      if (com.tencent.mm.plugin.account.a.a.ezo.a(this, paramInt1, paramInt2, paramString)) {
        i = 1;
      }
      while (i == 0)
      {
        if (bi.oW(paramString)) {
          break label517;
        }
        paramString = bl.z(paramString, "e");
        if ((paramString == null) || (paramString.size() <= 0)) {
          break label517;
        }
        paramString = (String)paramString.get(".e.Content");
        if (bi.oW(paramString)) {
          break label517;
        }
        h.b(this, paramString, getString(a.j.regby_email_err_tip_title), true);
        return;
        switch (paramInt2)
        {
        default: 
          i = 0;
          break;
        case -7: 
          paraml = new StringBuilder();
          g.Eg();
          paraml = paraml.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R20_email_duplicate_confirm,");
          g.Eg();
          com.tencent.mm.plugin.c.a.pV(com.tencent.mm.kernel.a.gd("R20_email_duplicate_confirm") + ",3");
          h.a(this, a.j.regby_email_user_already_exist, a.j.regby_email_err_tip_title, a.j.regby_email_user_already_exist_op_signin, a.j.regby_email_user_already_exist_op_cancel, new RegByEmailUI.4(this), null);
          i = 1;
          break;
        case -111: 
          h.i(this, a.j.regby_email_invaild_email, a.j.regby_email_err_tip_title);
          i = 1;
          break;
        case -34: 
          Toast.makeText(this, a.j.regby_email_err_freq_limit, 0).show();
          i = 1;
          break;
        case -75: 
          h.i(this, a.j.alpha_version_tip_reg, a.j.reg_username_exist_title);
          i = 1;
        }
      }
    }
    label517:
    Toast.makeText(this, getString(a.j.regby_email_send_verify_code_failed, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
  }
  
  protected final int getLayoutId()
  {
    return a.g.reg_by_email;
  }
  
  protected final void initView()
  {
    this.eUA = ((MMAutoCompleteTextView)findViewById(a.f.reg_email));
    this.eUB = ((EditText)findViewById(a.f.reg_password));
    this.eUC = ((CheckBox)findViewById(a.f.agree_cb));
    if (!bi.oW(this.eUD))
    {
      this.eUB.postDelayed(new RegByEmailUI.1(this), 500L);
      this.eUA.setText(this.eUD);
    }
    if (eUF != null)
    {
      c localc = new c(this, eUF, "@");
      this.eUA.setSpilter("@");
      this.eUA.setDropDownAnchor(a.f.reg_email_ll);
      this.eUA.setDropDownVerticalOffset(this.eUA.getPaddingBottom());
      this.eUA.setAdapter(localc);
    }
    findViewById(a.f.agree_btn).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        bi.L(RegByEmailUI.this, RegByEmailUI.this.getString(a.j.url_agreement));
      }
    });
    this.eUC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        RegByEmailUI.b(RegByEmailUI.this);
      }
    });
    addTextOptionMenu(0, getString(a.j.app_nextstep), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        RegByEmailUI.c(RegByEmailUI.this);
        return true;
      }
    });
    enableOptionMenu(false);
    this.eUA.addTextChangedListener(new RegByEmailUI.8(this));
    this.eUB.addTextChangedListener(new RegByEmailUI.9(this));
    this.eUB.setOnEditorActionListener(new RegByEmailUI.10(this));
    this.eUB.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        if ((66 != paramAnonymousInt) || (paramAnonymousKeyEvent.getAction() != 0) || (!RegByEmailUI.d(RegByEmailUI.this).isChecked())) {
          return false;
        }
        RegByEmailUI.c(RegByEmailUI.this);
        return true;
      }
    });
    setBackBtn(new RegByEmailUI.12(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getString(a.j.regby_email_title);
    if (d.qVQ) {
      paramBundle = getString(a.j.app_name) + getString(a.j.alpha_version_alpha);
    }
    setMMTitle(paramBundle);
    com.tencent.mm.plugin.account.a.a.ezo.vo();
    this.eUD = com.tencent.mm.platformtools.x.cg(this);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RegByEmailUI", "get google account:[%s]", new Object[] { this.eUD });
    this.eUE = k.evQ.bY(this);
    if ((this.eUE != null) && (!this.eUE.isEmpty()))
    {
      eUF = new String[this.eUE.size()];
      this.eUE.keySet().toArray(eUF);
    }
    this.eHy = com.tencent.mm.plugin.c.a.Zu();
    initView();
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
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R500_100,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R500_100") + ",2");
  }
  
  protected void onResume()
  {
    super.onResume();
    g.DF().a(481, this);
    StringBuilder localStringBuilder = new StringBuilder();
    g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R500_100,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("R500_100") + ",1");
    com.tencent.mm.plugin.c.a.pT("R500_100");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/ui/RegByEmailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */