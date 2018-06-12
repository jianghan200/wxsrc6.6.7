package com.tencent.mm.plugin.account.bind.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.plugin.account.a.d;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.ag;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ah.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.a.c;
import java.util.List;

public class FindMContactAlertUI
  extends MMWizardActivity
{
  private int X = 0;
  private int Y = 0;
  private String bTi;
  private String eHA;
  private int eHB = 0;
  private final int eHC = 200;
  private int eHD = 0;
  private int eHE = 0;
  private int eHF = 0;
  private int eHG = 0;
  private String eHp = null;
  private String eHq = "";
  private int eHr = 2;
  private String eHs = null;
  private String eHt = null;
  private boolean eHu = false;
  private List<String[]> eHv = null;
  private ProgressDialog eHw = null;
  private ag eHx;
  private String eHy;
  private String eHz;
  private com.tencent.mm.ab.e ehD = null;
  
  private void WL()
  {
    com.tencent.mm.plugin.c.a.pU(this.eHy);
    YC();
    DT(1);
  }
  
  private void WP()
  {
    final Object localObject;
    if (this.eHu)
    {
      localObject = new StringBuilder();
      g.Eg();
      localObject = ((StringBuilder)localObject).append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R300_200_phone,");
      g.Eg();
      com.tencent.mm.plugin.c.a.pV(com.tencent.mm.kernel.a.gd("R300_200_phone") + ",1");
      com.tencent.mm.ui.base.h.a(this, false, getString(a.j.find_mcontact_bind_alert_content), getString(a.j.app_tip), getString(a.j.app_ok), getString(a.j.app_cancel), new FindMContactAlertUI.1(this), new FindMContactAlertUI.4(this));
      return;
    }
    if (com.tencent.mm.plugin.account.friend.a.l.XB())
    {
      localObject = this.eHA;
      String str = this.eHz;
      int i = a.j.find_mcontact_upload_ok;
      int j = a.j.find_mcontact_upload_learn_more;
      DialogInterface.OnClickListener local5 = new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          g.Ei().DT().set(12322, Boolean.valueOf(true));
          FindMContactAlertUI.e(FindMContactAlertUI.this);
          paramAnonymousDialogInterface.dismiss();
        }
      };
      DialogInterface.OnClickListener local6 = new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          paramAnonymousDialogInterface = new Intent(FindMContactAlertUI.this, FindMContactLearmMoreUI.class);
          paramAnonymousDialogInterface.putExtra("regsetinfo_ticket", FindMContactAlertUI.a(FindMContactAlertUI.this));
          paramAnonymousDialogInterface.putExtra("regsetinfo_NextStep", FindMContactAlertUI.b(FindMContactAlertUI.this));
          paramAnonymousDialogInterface.putExtra("regsetinfo_NextStyle", FindMContactAlertUI.c(FindMContactAlertUI.this));
          MMWizardActivity.D(FindMContactAlertUI.this, paramAnonymousDialogInterface);
        }
      };
      final c localc = new c(this);
      localc.setTitle(str);
      localc.setMessage((CharSequence)localObject);
      localc.a(i, local5);
      localc.b(j, local6);
      localc.pxh.setVisibility(0);
      localc.setCancelable(false);
      localc.show();
      localc.getWindow().clearFlags(2);
      addDialog(localc);
      localc.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
      {
        public final void onGlobalLayout()
        {
          localc.getWindow().getDecorView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
          int i = localc.getWindow().getDecorView().getMeasuredWidth();
          int j = localc.getWindow().getDecorView().getMeasuredHeight();
          View localView = FindMContactAlertUI.a(FindMContactAlertUI.this, (ViewGroup)localc.getWindow().getDecorView());
          if (localView != null) {
            i = localView.getMeasuredWidth() * 2;
          }
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FindMContactAlertUI", "dialog width: %s height: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            FindMContactAlertUI.a(FindMContactAlertUI.this, i, j);
            return;
          }
        }
      });
      localObject = findViewById(a.f.background);
      ((View)localObject).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
      {
        public final void onGlobalLayout()
        {
          localObject.getViewTreeObserver().removeGlobalOnLayoutListener(this);
          int i = localObject.getMeasuredHeight();
          int j = localObject.getMeasuredWidth();
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FindMContactAlertUI", "bg width: %s height: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
          FindMContactAlertUI.b(FindMContactAlertUI.this, j, i);
        }
      });
      return;
    }
    WR();
  }
  
  private void WQ()
  {
    int j = getWindowManager().getDefaultDisplay().getHeight();
    int i = this.eHF - (getResources().getDimensionPixelSize(a.d.PopPadding) + com.tencent.mm.bp.a.fromDPToPix(this, 48));
    int k = j / 2;
    int m = this.eHE / 2;
    int n = this.eHG;
    j = com.tencent.mm.bp.a.fromDPToPix(this, 20) + (k + m - (j - n));
    if ((i != this.X) || (j != this.Y))
    {
      this.X = i;
      this.Y = j;
      View localView = findViewById(a.f.findmcontact_arrow);
      localView.setVisibility(0);
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)localView.getLayoutParams();
      localLayoutParams.setMargins(i - localView.getMeasuredWidth() / 2, j, 0, 0);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FindMContactAlertUI", "attachArrow x: %s y: %s view.width: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localView.getMeasuredWidth()) });
      localView.setLayoutParams(localLayoutParams);
      localView.startAnimation(AnimationUtils.loadAnimation(this, a.a.arrow_appare));
    }
  }
  
  private void WR()
  {
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMContactAlertUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd() });
    if (!bool) {
      return;
    }
    Object localObject = findViewById(a.f.findmcontact_arrow);
    if (localObject != null) {
      ((View)localObject).setVisibility(8);
    }
    localObject = g.DF();
    FindMContactAlertUI.9 local9 = new FindMContactAlertUI.9(this);
    this.ehD = local9;
    ((o)localObject).a(431, local9);
    localObject = this.mController.tml;
    getString(a.j.app_tip);
    this.eHw = com.tencent.mm.ui.base.h.a((Context)localObject, getString(a.j.app_loading), true, new FindMContactAlertUI.10(this));
    g.Em().a(new ah.a()
    {
      public final boolean Kr()
      {
        try
        {
          FindMContactAlertUI.a(FindMContactAlertUI.this, com.tencent.mm.pluginsdk.a.cz(FindMContactAlertUI.this));
          StringBuilder localStringBuilder = new StringBuilder("tigerreg mobileList size ");
          if (FindMContactAlertUI.k(FindMContactAlertUI.this) == null) {}
          for (int i = 0;; i = FindMContactAlertUI.k(FindMContactAlertUI.this).size())
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FindMContactAlertUI", i);
            break;
          }
          return true;
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.FindMContactAlertUI", localException, "", new Object[0]);
        }
      }
      
      public final boolean Ks()
      {
        if ((FindMContactAlertUI.k(FindMContactAlertUI.this) != null) && (FindMContactAlertUI.k(FindMContactAlertUI.this).size() != 0))
        {
          FindMContactAlertUI.a(FindMContactAlertUI.this, new ag(FindMContactAlertUI.a(FindMContactAlertUI.this), FindMContactAlertUI.k(FindMContactAlertUI.this)));
          g.DF().a(FindMContactAlertUI.l(FindMContactAlertUI.this), 0);
          return false;
        }
        if (FindMContactAlertUI.f(FindMContactAlertUI.this) != null)
        {
          FindMContactAlertUI.f(FindMContactAlertUI.this).dismiss();
          FindMContactAlertUI.g(FindMContactAlertUI.this);
        }
        FindMContactAlertUI.d(FindMContactAlertUI.this);
        return false;
      }
      
      public final String toString()
      {
        return super.toString() + "|doUpload";
      }
    });
    ((com.tencent.mm.plugin.account.a.a.a)g.n(com.tencent.mm.plugin.account.a.a.a.class)).syncUploadMContactStatus(true, false);
    ((com.tencent.mm.plugin.account.a.a.a)g.n(com.tencent.mm.plugin.account.a.a.a.class)).syncAddrBookAndUpload();
    com.tencent.mm.plugin.report.service.h.mEJ.h(11438, new Object[] { Integer.valueOf(1) });
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMContactAlertUI", "[cpan] kv report logid:%d scene:%d", new Object[] { Integer.valueOf(11438), Integer.valueOf(1) });
  }
  
  private View f(ViewGroup paramViewGroup)
  {
    Object localObject;
    if (this.eHB >= 200)
    {
      localObject = null;
      return (View)localObject;
    }
    this.eHB += 1;
    int j = paramViewGroup.getChildCount();
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label92;
      }
      View localView = paramViewGroup.getChildAt(i);
      localObject = localView;
      if ((localView instanceof Button)) {
        break;
      }
      if ((localView instanceof ViewGroup))
      {
        localView = f((ViewGroup)localView);
        localObject = localView;
        if (localView != null) {
          break;
        }
      }
      i += 1;
    }
    label92:
    return null;
  }
  
  protected final int getLayoutId()
  {
    return a.g.findmcontact_intro_with_alert;
  }
  
  protected final void initView()
  {
    this.eHz = getString(a.j.find_mcontact_bind_alert_title);
    this.eHA = getString(a.j.find_mcontact_bind_alert_content);
    if (!bi.oW(this.eHs)) {
      this.eHz = this.eHs;
    }
    if (!bi.oW(this.eHt)) {
      this.eHA = this.eHt;
    }
    this.bTi = ((String)g.Ei().DT().get(6, null));
    if ((this.bTi == null) || (this.bTi.equals(""))) {
      this.bTi = ((String)g.Ei().DT().get(4097, null));
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
    this.eHs = getIntent().getStringExtra("alert_title");
    this.eHt = getIntent().getStringExtra("alert_message");
    if (com.tencent.mm.plugin.account.friend.a.l.XC() != l.a.eKt) {}
    for (boolean bool = true;; bool = false)
    {
      this.eHu = bool;
      this.eHy = com.tencent.mm.plugin.c.a.Zu();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FindMContactAlertUI", "tigerreg mNextStep %s  mNextStyle %s ", new Object[] { this.eHq, Integer.valueOf(this.eHr) });
      if (!isFinishing()) {
        break;
      }
      return;
    }
    initView();
    WP();
  }
  
  public void onDestroy()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FindMContactAlertUI", "ondestroy");
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
    if (this.eHu)
    {
      localStringBuilder = new StringBuilder();
      g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R300_100_QQ,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R300_100_QQ") + ",2");
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",RE300_100,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("RE300_100") + ",2");
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMContactAlertUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
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
    com.tencent.mm.ui.base.h.a(this, getString(a.j.permission_contacts_request_again_msg), getString(a.j.permission_tips_title), getString(a.j.jump_to_settings), getString(a.j.app_cancel), false, new FindMContactAlertUI.2(this), new FindMContactAlertUI.3(this));
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.eHu)
    {
      com.tencent.mm.plugin.c.a.pT("R300_100_QQ");
      localStringBuilder = new StringBuilder();
      g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R300_100_QQ,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("R300_100_QQ") + ",1");
      return;
    }
    com.tencent.mm.plugin.c.a.pT("R300_100_phone");
    StringBuilder localStringBuilder = new StringBuilder();
    g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",RE300_100,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("RE300_100") + ",1");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/FindMContactAlertUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */