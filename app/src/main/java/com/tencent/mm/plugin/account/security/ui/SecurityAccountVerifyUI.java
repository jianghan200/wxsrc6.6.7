package com.tencent.mm.plugin.account.security.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.security.a.f;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import java.util.Map;

public class SecurityAccountVerifyUI
  extends MMWizardActivity
  implements e
{
  private al bAZ;
  private String bQX;
  private String bQZ;
  private String bTi;
  private ProgressDialog eHw = null;
  private String eHy;
  private String eOW;
  private Button eOZ;
  private EditText ePd;
  private TextView ePe;
  private TextView ePf;
  private Button ePg;
  private boolean ePh = false;
  
  private void WL()
  {
    cancel();
    DT(1);
  }
  
  private boolean e(int paramInt1, int paramInt2, String paramString)
  {
    if (com.tencent.mm.plugin.account.a.a.ezo.a(this.mController.tml, paramInt1, paramInt2, paramString)) {
      return true;
    }
    switch (paramInt2)
    {
    default: 
      return false;
    case -32: 
      h.a(this.mController.tml, a.j.bind_mcontact_verify_err_unmatch_content, a.j.bind_mcontact_verify_tip, null);
      return true;
    case -33: 
      h.a(this.mController.tml, a.j.bind_mcontact_verify_err_time_out_content, a.j.bind_mcontact_verify_tip, null);
      return true;
    case -34: 
      Toast.makeText(this, a.j.bind_mcontact_err_freq_limit, 0).show();
      return true;
    case -57: 
    case -1: 
      Toast.makeText(this.mController.tml, a.j.app_err_system_busy_tip, 0).show();
      return true;
    case -41: 
      Toast.makeText(this.mController.tml, a.j.bind_mcontact_err_format, 0).show();
      return true;
    }
    h.a(this.mController.tml, a.j.bind_mcontact_err_BindPhone_NeedAdjust, a.j.app_tip, null);
    return true;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if ((this.eHw != null) && (this.eHw.isShowing()))
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    switch (paraml.getType())
    {
    }
    do
    {
      do
      {
        do
        {
          return;
          paraml = (com.tencent.mm.modelfriend.a)paraml;
          if (paraml.Oh() != 10) {
            break;
          }
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            x.i("MicroMsg.SecurityAccountVerifyUI", "resend verify code successfully");
            return;
          }
          x.w("MicroMsg.SecurityAccountVerifyUI", "resend verify code fail, errType %d, errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        } while (e(paramInt1, paramInt2, paramString));
        Toast.makeText(this.mController.tml, getString(a.j.safe_device_send_verify_code_failed, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        return;
        if (paraml.Oh() != 11) {
          break;
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.eOW = paraml.Ok();
          x.d("MicroMsg.SecurityAccountVerifyUI", "duanyi test bind opmobile verify authticket = " + this.eOW);
          paramInt1 = getIntent().getIntExtra("from_source", 1);
          Intent localIntent = new Intent();
          localIntent.putExtra("from_source", paramInt1);
          localIntent.putExtra("binded_mobile", this.bTi);
          switch (paramInt1)
          {
          case 4: 
          default: 
            DT(1);
            return;
          case 3: 
            localIntent.addFlags(67108864);
            localIntent.putExtra("auth_ticket", this.eOW);
            paraml = getIntent().getStringExtra("WizardTransactionId");
            paramString = paraml;
            if (paraml == null) {
              paramString = "";
            }
            paramString = (Intent)tob.get(paramString);
            tob.clear();
            if (paramString != null) {
              com.tencent.mm.plugin.account.a.a.ezn.a(this, localIntent, paramString);
            }
            for (;;)
            {
              finish();
              return;
              com.tencent.mm.plugin.account.a.a.ezn.a(this, localIntent, null);
            }
          }
          localIntent.addFlags(67108864);
          localIntent.putExtra("auth_ticket", this.eOW);
          com.tencent.mm.plugin.account.a.a.ezn.a(this, localIntent, null);
          finish();
          return;
        }
        x.w("MicroMsg.SecurityAccountVerifyUI", "verify verify-code fail, errType %d, errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      } while (e(paramInt1, paramInt2, paramString));
      Toast.makeText(this.mController.tml, getString(a.j.safe_device_verify_failed, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      return;
      x.w("MicroMsg.SecurityAccountVerifyUI", "unknow bind mobile for reg op code %d, errType %d, errCode %d", new Object[] { Integer.valueOf(paraml.Oh()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        f.n(true, true);
        paramString = new Intent(this, MySafeDeviceListUI.class);
        paramString.addFlags(67108864);
        startActivity(paramString);
        finish();
        return;
      }
    } while (e(paramInt1, paramInt2, paramString));
    Toast.makeText(this, getString(a.j.safe_device_verify_failed, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
  }
  
  protected final int getLayoutId()
  {
    return a.g.security_account_verify;
  }
  
  protected final void initView()
  {
    this.bTi = getIntent().getStringExtra("binded_mobile");
    this.eOW = getIntent().getStringExtra("auth_ticket");
    this.ePh = getIntent().getBooleanExtra("re_open_verify", false);
    this.ePd = ((EditText)findViewById(a.f.bind_mcontact_verify_num));
    this.ePe = ((TextView)findViewById(a.f.mobile_number_tv));
    this.ePf = ((TextView)findViewById(a.f.resend_verify_code_tips_tv));
    this.ePg = ((Button)findViewById(a.f.resend_verify_code_btn));
    this.ePd.addTextChangedListener(new SecurityAccountVerifyUI.1(this));
    this.ePe.setText(bi.Xc(this.bTi));
    this.ePf.setTag(Integer.valueOf(60));
    this.bAZ = new al(new SecurityAccountVerifyUI.2(this), true);
    this.ePg.setOnClickListener(new SecurityAccountVerifyUI.3(this));
    if (!this.ePh)
    {
      this.eOZ = ((Button)findViewById(a.f.close_account_protect_btn));
      this.eOZ.setVisibility(0);
      this.eOZ.setOnClickListener(new SecurityAccountVerifyUI.4(this));
    }
    setBackBtn(new SecurityAccountVerifyUI.5(this));
    addTextOptionMenu(0, getString(a.j.app_nextstep), new SecurityAccountVerifyUI.6(this));
    enableOptionMenu(false);
    setMMTitle(a.j.safe_device_input_verify_code);
    this.bAZ.J(1000L, 1000L);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eHy = com.tencent.mm.plugin.c.a.Zu();
    initView();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.bAZ.SO();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      WL();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    g.DF().b(145, this);
    g.DF().b(132, this);
    super.onPause();
    if (!this.ePh)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",L600_200,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("L600_200") + ",2");
    }
  }
  
  protected void onResume()
  {
    g.DF().a(145, this);
    g.DF().a(132, this);
    super.onResume();
    if (!this.ePh)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",L600_200,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("L600_200") + ",1");
      com.tencent.mm.plugin.c.a.pT("L600_200");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */