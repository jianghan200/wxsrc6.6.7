package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.platformtools.b;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.bind.ui.BindQQUI;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMEditText.c;

@Deprecated
public class RegByMobileSetNickUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private String bTi;
  private ProgressDialog eHw = null;
  private EditText eVq;
  private r eVr = null;
  private boolean eVs;
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RegByMobileSetNickUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
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
        paramInt1 = q.GJ();
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.RegByMobileSetNickUI", "Reg By mobile status = " + paramInt1 + " isSync = " + this.eVs);
        if (this.eVs)
        {
          paramInt1 &= 0xFFFDFFFF;
          com.tencent.mm.plugin.account.friend.a.l.Xz();
          getApplicationContext();
          b.Vn();
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.RegByMobileSetNickUI", "Reg By mobile update = " + paramInt1);
          com.tencent.mm.kernel.g.Ei().DT().set(7, Integer.valueOf(paramInt1));
          if (this.eVs) {
            break label313;
          }
        }
        label313:
        for (paramInt1 = 1;; paramInt1 = 2)
        {
          paramString = new xt();
          paramString.rDz = 17;
          paramString.rDA = paramInt1;
          ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(23, paramString));
          com.tencent.mm.plugin.account.a.a.ezo.vl();
          at.dBv.T("login_user_name", this.bTi);
          paramString = com.tencent.mm.plugin.account.a.a.ezn.be(this);
          paramString.putExtra("LauncherUI.enter_from_reg", true);
          paramString.addFlags(67108864);
          if (!((com.tencent.mm.modelsimple.s)paraml).egi) {
            break label318;
          }
          MMWizardActivity.b(this, new Intent(this, BindQQUI.class).putExtra("bindqq_regbymobile", 1), paramString);
          return;
          paramInt1 |= 0x20000;
          break;
        }
        label318:
        MMWizardActivity.b(this, new Intent(this, BindFacebookUI.class), paramString);
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
        switch (paramInt1)
        {
        }
        do
        {
          i = 0;
          break;
          if ((paramInt2 == -7) || (paramInt2 == -10))
          {
            h.i(this, a.j.reg_username_exist_tip, a.j.reg_username_exist_title);
            i = 1;
            break;
          }
        } while (paramInt2 != -75);
        h.i(this, a.j.alpha_version_tip_reg, a.j.reg_username_exist_title);
        i = 1;
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.regbymobilesetnick_reg;
  }
  
  protected final void initView()
  {
    setMMTitle(a.j.regbymobile_reg_setnick_title);
    this.eVq = ((EditText)findViewById(a.f.regbymobilereg_nick_et));
    this.eVq.addTextChangedListener(new MMEditText.c(this.eVq, null, 16));
    addTextOptionMenu(0, getString(a.j.app_finish), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        paramAnonymousMenuItem = RegByMobileSetNickUI.a(RegByMobileSetNickUI.this).getText().toString().trim();
        if ((paramAnonymousMenuItem == null) || (paramAnonymousMenuItem.length() <= 0))
        {
          h.i(RegByMobileSetNickUI.this, a.j.verify_account_null_tip, a.j.regbymobile_reg_setpwd_alert_title);
          return true;
        }
        RegByMobileSetNickUI.this.YC();
        Object localObject1 = RegByMobileSetNickUI.this.getIntent().getExtras().getString("regbymobile_pwd");
        Object localObject2 = RegByMobileSetNickUI.this.getIntent().getExtras().getString("regbymobile_ticket");
        paramAnonymousMenuItem = new com.tencent.mm.modelsimple.s("", (String)localObject1, paramAnonymousMenuItem, 0, "", RegByMobileSetNickUI.b(RegByMobileSetNickUI.this), (String)localObject2, 4);
        com.tencent.mm.kernel.g.DF().a(paramAnonymousMenuItem, 0);
        localObject1 = RegByMobileSetNickUI.this;
        localObject2 = RegByMobileSetNickUI.this;
        RegByMobileSetNickUI.this.getString(a.j.app_tip);
        RegByMobileSetNickUI.a((RegByMobileSetNickUI)localObject1, h.a((Context)localObject2, RegByMobileSetNickUI.this.getString(a.j.regbyqq_reg_waiting), true, new RegByMobileSetNickUI.1.1(this, paramAnonymousMenuItem)));
        return true;
      }
    });
    setBackBtn(new RegByMobileSetNickUI.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eVs = getIntent().getBooleanExtra("is_sync_addr", false);
    this.bTi = getIntent().getExtras().getString("bindmcontact_mobile");
    initView();
    com.tencent.mm.kernel.g.DF().a(126, this);
  }
  
  public void onDestroy()
  {
    if (this.eVr != null)
    {
      r localr = this.eVr;
      com.tencent.mm.ui.base.s locals = localr.eUz;
      locals.cancel();
      locals.bAZ.SO();
      locals.reset();
      localr.text = null;
    }
    com.tencent.mm.kernel.g.DF().b(126, this);
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/ui/RegByMobileSetNickUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */