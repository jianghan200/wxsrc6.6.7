package com.tencent.mm.plugin.account.security.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.protocal.c.hh;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import java.util.Map;

public class SecurityAccountIntroUI
  extends MMWizardActivity
  implements e
{
  private String bTi;
  private ProgressDialog eHw = null;
  private String eHy;
  private String eOW;
  private String eOX;
  private boolean eOY = false;
  private Button eOZ;
  private String jumpUrl;
  
  private void WL()
  {
    com.tencent.mm.plugin.c.a.pU(this.eHy);
    cancel();
    DT(1);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if ((this.eHw != null) && (this.eHw.isShowing()))
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (!this.eOY) {}
      for (paramString = ((com.tencent.mm.modelfriend.a)paraml).Ok();; paramString = ((hh)((com.tencent.mm.plugin.account.friend.a.x)paraml).diG.dIE.dIL).reE)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SecurityAccountIntroUI", "duanyi test authTicket_login = " + this.eOW + "duanyi test authTicket_check = " + paramString);
        paraml = new Intent(this, SecurityAccountVerifyUI.class);
        paraml.putExtra("auth_ticket", paramString);
        paraml.putExtra("binded_mobile", this.bTi);
        paraml.putExtra("re_open_verify", this.eOY);
        paraml.putExtra("from_source", getIntent().getIntExtra("from_source", 1));
        D(this, paraml);
        if (getIntent().getIntExtra("from_source", 1) == 3) {
          finish();
        }
        return;
      }
    }
    int i;
    switch (paramInt2)
    {
    default: 
      i = 0;
    }
    while ((i == 0) && (!com.tencent.mm.plugin.account.a.a.ezo.a(this, paramInt1, paramInt2, paramString)))
    {
      Toast.makeText(this, getString(a.j.safe_device_send_verify_code_failed, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      return;
      Toast.makeText(this, a.j.app_err_system_busy_tip, 0).show();
      i = 1;
      continue;
      Toast.makeText(this, a.j.bind_mcontact_err_freq_limit, 0).show();
      i = 1;
      continue;
      Toast.makeText(this, a.j.bind_mcontact_err_format, 0).show();
      i = 1;
      continue;
      h.a(this, a.j.bind_mcontact_err_BindPhone_NeedAdjust, a.j.app_tip, null);
      i = 1;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.security_account_intro;
  }
  
  protected final void initView()
  {
    setMMTitle(a.j.safe_device_verify_phone_title);
    findViewById(a.f.operation_btn).setOnClickListener(new SecurityAccountIntroUI.1(this));
    if (!this.eOY)
    {
      this.eOZ = ((Button)findViewById(a.f.close_account_protect_btn));
      if (!bi.oW(this.eOX)) {
        this.eOZ.setText(this.eOX);
      }
      this.eOZ.setVisibility(0);
      this.eOZ.setOnClickListener(new SecurityAccountIntroUI.2(this));
    }
    setBackBtn(new SecurityAccountIntroUI.3(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eOW = getIntent().getStringExtra("auth_ticket");
    this.bTi = getIntent().getStringExtra("binded_mobile");
    this.eOY = getIntent().getBooleanExtra("re_open_verify", false);
    paramBundle = getIntent().getStringExtra("close_safe_device_style");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SecurityAccountIntroUI", "summerphone authTicket[%s], showStyle[%s]", new Object[] { bi.Xf(this.eOW), paramBundle });
    if (!bi.oW(paramBundle))
    {
      paramBundle = bl.z(paramBundle, "wording");
      if (paramBundle != null)
      {
        this.eOX = ((String)paramBundle.get(".wording.title"));
        this.jumpUrl = ((String)paramBundle.get(".wording.url"));
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SecurityAccountIntroUI", "summerphone closeBtnText[%s], jumpUrl[%s]", new Object[] { this.eOX, this.jumpUrl });
      }
    }
    this.eHy = com.tencent.mm.plugin.c.a.Zu();
    initView();
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
    super.onPause();
    g.DF().b(145, this);
    g.DF().b(132, this);
    if (!this.eOY)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",L600_100,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("L600_100") + ",2");
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    g.DF().a(145, this);
    g.DF().a(132, this);
    if (!this.eOY)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",L600_100,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("L600_100") + ",1");
      com.tencent.mm.plugin.c.a.pT("L600_100");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/security/ui/SecurityAccountIntroUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */