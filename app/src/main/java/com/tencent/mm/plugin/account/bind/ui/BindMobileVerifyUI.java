package com.tencent.mm.plugin.account.bind.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.o;
import com.tencent.mm.al.b;
import com.tencent.mm.g.a.sf;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsimple.BindWordingContent;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.h;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import java.util.Timer;
import java.util.TimerTask;

public class BindMobileVerifyUI
  extends MMWizardActivity
  implements com.tencent.mm.ab.e
{
  private String bTi;
  private Timer bno;
  private EditText eGC;
  private Button eGE;
  private BindWordingContent eGQ;
  private int eGR;
  private boolean eGS;
  private boolean eGT;
  private boolean eGb = false;
  private boolean eGx = false;
  private boolean eHe = false;
  private TextView eHh;
  private TextView eHi;
  private boolean eHj = false;
  private Integer eHk = Integer.valueOf(15);
  private p tipDialog = null;
  
  private void WO()
  {
    if (this.bno != null)
    {
      this.bno.cancel();
      this.bno = null;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    boolean bool2 = true;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BindMobileVerifyUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (((com.tencent.mm.plugin.account.friend.a.x)paraml).Oh() != 2) {}
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
        if (((com.tencent.mm.plugin.account.friend.a.x)paraml).Oh() == 2)
        {
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
          if (this.eHe)
          {
            boolean bool1;
            if (!this.eGS)
            {
              bool1 = true;
              if (this.eGT) {
                break label241;
              }
            }
            for (;;)
            {
              BindMobileStatusUI.c(this, bool1, bool2);
              exit(-1);
              return;
              bool1 = false;
              break;
              label241:
              bool2 = false;
            }
          }
          if (!this.eHj) {
            ((com.tencent.mm.plugin.account.a.a.a)g.n(com.tencent.mm.plugin.account.a.a.a.class)).syncAddrBookAndUpload();
          }
          paramString = new Intent(this, BindMobileStatusUI.class);
          paramString.putExtra("kstyle_bind_wording", this.eGQ);
          paramString.putExtra("kstyle_bind_recommend_show", this.eGR);
          paramString.putExtra("Kfind_friend_by_mobile_flag", this.eGS);
          paramString.putExtra("Krecom_friends_by_mobile_flag", this.eGT);
          D(this, paramString);
        }
      }
      else
      {
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
            h.a(this, a.j.bind_mcontact_verify_err_unmatch_content, a.j.bind_mcontact_verify_tip, null);
            i = 1;
            break;
          case -33: 
            h.a(this, a.j.bind_mcontact_verify_err_time_out_content, a.j.bind_mcontact_verify_tip, null);
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
    this.bTi = ((String)g.Ei().DT().get(4097, null));
    this.eGC = ((EditText)findViewById(a.f.bind_mcontact_verify_num));
    this.eHh = ((TextView)findViewById(a.f.bind_mcontact_verify_mobile_num));
    this.eHi = ((TextView)findViewById(a.f.bind_mcontact_sms_time_hint));
    this.eGb = getIntent().getBooleanExtra("is_bind_for_safe_device", false);
    this.eHj = getIntent().getBooleanExtra("is_bind_for_contact_sync", false);
    this.eGx = getIntent().getBooleanExtra("BIND_FOR_QQ_REG", false);
    Object localObject = (Button)findViewById(a.f.bind_mcontact_verify_btn);
    if ((this.bTi == null) || (this.bTi.equals(""))) {
      this.bTi = ((String)g.Ei().DT().get(6, null));
    }
    if ((this.bTi != null) && (this.bTi.length() > 0))
    {
      this.eHh.setVisibility(0);
      this.eHh.setText(this.bTi);
    }
    BindMobileVerifyUI.1 local1 = new BindMobileVerifyUI.1(this);
    this.eGC.setFilters(new InputFilter[] { local1 });
    this.eGE = ((Button)findViewById(a.f.bind_mcontact_voice_code));
    ((Button)localObject).setVisibility(8);
    this.eHi.setText(getResources().getQuantityString(a.h.mobileverify_send_code_tip, this.eHk.intValue(), new Object[] { this.eHk }));
    if (this.bno == null)
    {
      this.bno = new Timer();
      localObject = new BindMobileVerifyUI.5(this);
      if (this.bno != null) {
        this.bno.schedule((TimerTask)localObject, 1000L, 1000L);
      }
    }
    addTextOptionMenu(0, getString(a.j.app_nextstep), new BindMobileVerifyUI.2(this));
    setBackBtn(new BindMobileVerifyUI.3(this));
    localObject = this.eGE;
    if (b.mj(this.bTi)) {}
    for (int i = 0;; i = 8)
    {
      ((Button)localObject).setVisibility(i);
      this.eGE.setOnClickListener(new BindMobileVerifyUI.4(this));
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    g.DF().a(132, this);
    setMMTitle(a.j.bind_mcontact_title_verify);
    this.eGQ = ((BindWordingContent)getIntent().getParcelableExtra("kstyle_bind_wording"));
    this.eGR = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
    this.eGS = getIntent().getBooleanExtra("Kfind_friend_by_mobile_flag", false);
    this.eGT = getIntent().getBooleanExtra("Krecom_friends_by_mobile_flag", false);
    this.eHe = getIntent().getBooleanExtra("is_bind_for_chatroom_upgrade", false);
    initView();
  }
  
  public void onDestroy()
  {
    g.DF().b(132, this);
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0)) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onStop()
  {
    WO();
    super.onStop();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/BindMobileVerifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */