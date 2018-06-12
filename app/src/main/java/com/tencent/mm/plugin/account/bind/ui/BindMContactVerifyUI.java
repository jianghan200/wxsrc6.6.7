package com.tencent.mm.plugin.account.bind.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.o;
import com.tencent.mm.al.b;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.sf;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.p;

public class BindMContactVerifyUI
  extends MMWizardActivity
  implements com.tencent.mm.ab.e
{
  private String bTi;
  private SharedPreferences duR;
  private boolean eFl = false;
  private EditText eGC;
  private TextView eGD;
  private Button eGE;
  private boolean eGF = false;
  private boolean eGb = false;
  private boolean eGc = false;
  private boolean eGx = false;
  private boolean eGy = false;
  private boolean eGz = false;
  private int fromScene = 0;
  private int status;
  private p tipDialog = null;
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BindMContactVerifyUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((((com.tencent.mm.plugin.account.friend.a.x)paraml).Oh() != 2) && (((com.tencent.mm.plugin.account.friend.a.x)paraml).Oh() != 19)) {}
    for (;;)
    {
      return;
      if (this.tipDialog != null)
      {
        this.tipDialog.dismiss();
        this.tipDialog = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if ((((com.tencent.mm.plugin.account.friend.a.x)paraml).Oh() == 2) || (((com.tencent.mm.plugin.account.friend.a.x)paraml).Oh() == 19))
        {
          if (this.fromScene == 5)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BindMContactVerifyUI", "onScene end, finish wizard from app brand reg phone");
            DT(-1);
            return;
          }
          if (this.eGb)
          {
            if (!q.GN())
            {
              paramString = new sf();
              paramString.ccY.ccZ = true;
              paramString.ccY.cda = true;
              com.tencent.mm.sdk.b.a.sFg.m(paramString);
            }
            DT(1);
            paramString = new Intent();
            paramString.addFlags(67108864);
            com.tencent.mm.plugin.account.a.a.ezn.e(this, paramString);
            return;
          }
          if (this.eGx)
          {
            DT(1);
            startActivity(new Intent(this, FindMContactAddUI.class));
            return;
          }
          if (this.eGz)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BindMContactVerifyUI", "to RegByMobileSetPwdUI for reset pwd");
            finish();
            paramString = new Intent();
            paramString.addFlags(603979776);
            paramString.putExtra("setpwd_ticket", ((com.tencent.mm.plugin.account.friend.a.x)paraml).Oj());
            d.b(this, "account", ".ui.RegByMobileSetPwdUI", paramString);
            return;
          }
          if ((this.status & 0x200) > 0)
          {
            paramInt1 = 1;
            com.tencent.mm.kernel.g.Ei().DT().set(7, Integer.valueOf(this.status));
            paramString = new xt();
            paramString.rDz = 8;
            if (paramInt1 == 0) {
              break label493;
            }
            paramInt1 = 1;
            label350:
            paramString.rDA = paramInt1;
            ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(23, paramString));
            com.tencent.mm.plugin.account.a.a.ezo.vl();
            if (!this.eGc) {
              ((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).syncAddrBookAndUpload();
            }
            if (this.eGy) {
              com.tencent.mm.ui.base.h.bA(this, getString(a.j.bind_mcontact_change_bind_success));
            }
            if (this.eFl)
            {
              if (!this.eGc) {
                break label498;
              }
              com.tencent.mm.plugin.report.service.h.mEJ.h(11002, new Object[] { Integer.valueOf(3), Integer.valueOf(3) });
            }
          }
          for (;;)
          {
            D(this, new Intent(this, BindMContactStatusUI.class));
            return;
            paramInt1 = 0;
            break;
            label493:
            paramInt1 = 2;
            break label350;
            label498:
            com.tencent.mm.plugin.report.service.h.mEJ.h(11002, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
          }
        }
      }
      else
      {
        paraml = com.tencent.mm.h.a.eV(paramString);
        if (paraml != null)
        {
          paraml.a(this, null, null);
          return;
        }
        int i;
        if (com.tencent.mm.plugin.account.a.a.ezo.a(this, paramInt1, paramInt2, paramString)) {
          i = 1;
        }
        while (i == 0)
        {
          Toast.makeText(this, getString(a.j.bind_mcontact_verify_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          return;
          switch (paramInt2)
          {
          default: 
            i = 0;
            break;
          case -34: 
            Toast.makeText(this, a.j.bind_mcontact_err_freq_limit, 0).show();
            i = 1;
            break;
          case -43: 
            Toast.makeText(this, a.j.bind_mcontact_err_binded, 0).show();
            i = 1;
            break;
          case -214: 
            paramString = com.tencent.mm.h.a.eV(paramString);
            if (paramString != null) {
              paramString.a(this, null, null);
            }
            i = 1;
            break;
          case -41: 
            Toast.makeText(this, a.j.bind_mcontact_err_format, 0).show();
            i = 1;
            break;
          case -35: 
            Toast.makeText(this, a.j.bind_mcontact_err_binded_by_other, 0).show();
            i = 1;
            break;
          case -36: 
            Toast.makeText(this, a.j.bind_mcontact_err_unbinded_notbinded, 0).show();
            i = 1;
            break;
          case -32: 
            com.tencent.mm.ui.base.h.a(this, a.j.bind_mcontact_verify_err_unmatch_content, a.j.bind_mcontact_verify_tip, null);
            i = 1;
            break;
          case -33: 
            com.tencent.mm.ui.base.h.a(this, a.j.bind_mcontact_verify_err_time_out_content, a.j.bind_mcontact_verify_tip, null);
            i = 1;
          }
        }
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.bindmcontact_verify;
  }
  
  protected final void initView()
  {
    this.bTi = ((String)com.tencent.mm.kernel.g.Ei().DT().get(4097, null));
    this.eGC = ((EditText)findViewById(a.f.bind_mcontact_verify_num));
    this.eGb = getIntent().getBooleanExtra("is_bind_for_safe_device", false);
    this.eGc = getIntent().getBooleanExtra("is_bind_for_contact_sync", false);
    this.eGx = getIntent().getBooleanExtra("BIND_FOR_QQ_REG", false);
    this.eGF = getIntent().getBooleanExtra("BIND_FIND_ME_BY_MOBILE", false);
    this.eGy = getIntent().getBooleanExtra("is_bind_for_change_mobile", false);
    this.eGz = getIntent().getBooleanExtra("is_bind_for_reset_pwd", false);
    this.eFl = getIntent().getBooleanExtra("KEnterFromBanner", false);
    this.fromScene = getIntent().getIntExtra("bind_scene", 0);
    Button localButton = (Button)findViewById(a.f.bind_mcontact_verify_btn);
    if ((this.bTi == null) || (this.bTi.equals(""))) {
      this.bTi = ((String)com.tencent.mm.kernel.g.Ei().DT().get(6, null));
    }
    BindMContactVerifyUI.1 local1 = new BindMContactVerifyUI.1(this);
    this.eGC.setFilters(new InputFilter[] { local1 });
    this.eGE = ((Button)findViewById(a.f.bind_mcontact_voice_code));
    this.eGD = ((TextView)findViewById(a.f.bind_mcontact_verify_hint));
    boolean bool = this.eGF;
    if (!bool)
    {
      this.status |= 0x200;
      this.duR.edit().putBoolean("settings_find_me_by_mobile", bool).commit();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BindMContactVerifyUI", "Bind mobile update = " + this.status);
      this.eGD.setText(getString(a.j.bind_mcontact_input_verify_hint, new Object[] { this.bTi }));
      localButton.setOnClickListener(new BindMContactVerifyUI.2(this));
      setBackBtn(new BindMContactVerifyUI.3(this));
      localButton = this.eGE;
      if (!b.mj(this.bTi)) {
        break label430;
      }
    }
    label430:
    for (int i = 0;; i = 8)
    {
      localButton.setVisibility(i);
      this.eGE.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          BindMContactVerifyUI.this.YC();
          paramAnonymousView = new Intent();
          Bundle localBundle = new Bundle();
          localBundle.putString("bindmcontact_mobile", BindMContactVerifyUI.c(BindMContactVerifyUI.this));
          localBundle.putInt("voice_verify_type", 4);
          paramAnonymousView.putExtras(localBundle);
          com.tencent.mm.plugin.account.a.a.ezn.f(BindMContactVerifyUI.this, paramAnonymousView);
        }
      });
      return;
      this.status &= 0xFDFF;
      break;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.DF().a(132, this);
    setMMTitle(a.j.bind_mcontact_title_verify);
    this.duR = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.status = q.GJ();
    initView();
  }
  
  public void onDestroy()
  {
    com.tencent.mm.kernel.g.DF().b(132, this);
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      DT(1);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/BindMContactVerifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */