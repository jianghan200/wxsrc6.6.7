package com.tencent.mm.plugin.account.bind.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.ag;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import java.util.List;

public class FindMContactIntroUI
  extends MMWizardActivity
{
  private String bTi;
  private Button eHK;
  private TextView eHL;
  private TextView eHM;
  private String eHp = null;
  private String eHq = "";
  private int eHr = 2;
  private boolean eHu = false;
  private List<String[]> eHv = null;
  private ProgressDialog eHw = null;
  private ag eHx;
  private String eHy;
  private com.tencent.mm.ab.e ehD = null;
  
  private void WL()
  {
    com.tencent.mm.plugin.c.a.pU(this.eHy);
    YC();
    DT(1);
  }
  
  private void WR()
  {
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMContactIntroUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd() });
    if (!bool) {
      return;
    }
    Object localObject = g.DF();
    FindMContactIntroUI.9 local9 = new FindMContactIntroUI.9(this);
    this.ehD = local9;
    ((o)localObject).a(431, local9);
    localObject = this.mController.tml;
    getString(a.j.app_tip);
    this.eHw = h.a((Context)localObject, getString(a.j.app_loading), true, new FindMContactIntroUI.10(this));
    g.Em().a(new FindMContactIntroUI.11(this));
  }
  
  protected final int getLayoutId()
  {
    return a.g.findmcontact_intro;
  }
  
  protected final void initView()
  {
    this.eHK = ((Button)findViewById(a.f.setting_bind_mobile_friend_btn));
    this.eHM = ((TextView)findViewById(a.f.findmcontact_skip_tv));
    this.eHL = ((TextView)findViewById(a.f.findmcontact_intro_tv));
    if ((this.eHq != null) && (this.eHq.contains("2"))) {
      this.eHL.setText(getString(a.j.find_mcontact_add_frined_tip));
    }
    for (;;)
    {
      this.bTi = ((String)g.Ei().DT().get(6, null));
      if ((this.bTi == null) || (this.bTi.equals(""))) {
        this.bTi = ((String)g.Ei().DT().get(4097, null));
      }
      this.eHK.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          FindMContactIntroUI.a(FindMContactIntroUI.this);
        }
      });
      this.eHM.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          h.a(FindMContactIntroUI.this, FindMContactIntroUI.this.getString(a.j.find_mcontact_skip_alert), null, FindMContactIntroUI.this.getString(a.j.find_mcontact_skip_btn), FindMContactIntroUI.this.getString(a.j.find_mcontact_skip_add_friend), new FindMContactIntroUI.4.1(this), new FindMContactIntroUI.4.2(this));
        }
      });
      return;
      this.eHL.setText(getString(a.j.find_mcontact_add_frined_tip_noinvite));
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.j.find_mcontact_title);
    com.tencent.mm.plugin.account.a.a.ezo.vo();
    this.eHp = getIntent().getStringExtra("regsetinfo_ticket");
    this.eHq = getIntent().getStringExtra("regsetinfo_NextStep");
    this.eHr = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    if (com.tencent.mm.plugin.account.friend.a.l.XC() != l.a.eKt) {}
    for (boolean bool = true;; bool = false)
    {
      this.eHu = bool;
      this.eHy = com.tencent.mm.plugin.c.a.Zu();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FindMContactIntroUI", "tigerreg mNextStep %s  mNextStyle %s ", new Object[] { this.eHq, Integer.valueOf(this.eHr) });
      return;
    }
  }
  
  public void onDestroy()
  {
    if (this.ehD != null)
    {
      g.DF().b(431, this.ehD);
      this.ehD = null;
    }
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      WL();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    com.tencent.mm.plugin.c.a.pU("RE900_100");
    if (this.eHu)
    {
      localStringBuilder = new StringBuilder();
      g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R300_100_QQ,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R300_100_QQ") + ",4");
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R300_100_phone,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R300_100_phone") + ",4");
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMContactIntroUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      WR();
      return;
    }
    h.a(this, getString(a.j.permission_contacts_request_again_msg), getString(a.j.permission_tips_title), getString(a.j.jump_to_settings), getString(a.j.app_cancel), false, new DialogInterface.OnClickListener()new FindMContactIntroUI.3
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.dismiss();
        FindMContactIntroUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
      }
    }, new FindMContactIntroUI.3(this));
  }
  
  protected void onResume()
  {
    super.onResume();
    initView();
    if (this.eHu)
    {
      localStringBuilder = new StringBuilder();
      g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R300_100_QQ,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("R300_100_QQ") + ",1");
      com.tencent.mm.plugin.c.a.pT("R300_100_QQ");
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R300_100_phone,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("R300_100_phone") + ",1");
    com.tencent.mm.plugin.c.a.pT("R300_100_phone");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/FindMContactIntroUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */