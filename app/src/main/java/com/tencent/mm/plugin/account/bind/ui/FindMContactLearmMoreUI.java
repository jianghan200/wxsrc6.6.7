package com.tencent.mm.plugin.account.bind.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.ag;
import com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI;
import com.tencent.mm.protocal.c.arf;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ah.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindMContactLearmMoreUI
  extends MMWizardActivity
{
  private String bTi;
  private Button eHP;
  private TextView eHQ;
  private String eHp = null;
  private String eHq = "";
  private int eHr = 2;
  private List<String[]> eHv = null;
  private ProgressDialog eHw = null;
  private ag eHx;
  private com.tencent.mm.ab.e ehD = null;
  
  private void WL()
  {
    YC();
    DT(1);
  }
  
  private void WR()
  {
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMContactLearmMoreUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd() });
    if (!bool) {
      return;
    }
    Object localObject = g.DF();
    com.tencent.mm.ab.e local3 = new com.tencent.mm.ab.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
      {
        if (FindMContactLearmMoreUI.c(FindMContactLearmMoreUI.this) != null)
        {
          FindMContactLearmMoreUI.c(FindMContactLearmMoreUI.this).dismiss();
          FindMContactLearmMoreUI.d(FindMContactLearmMoreUI.this);
        }
        if (FindMContactLearmMoreUI.e(FindMContactLearmMoreUI.this) != null)
        {
          g.DF().b(431, FindMContactLearmMoreUI.e(FindMContactLearmMoreUI.this));
          FindMContactLearmMoreUI.f(FindMContactLearmMoreUI.this);
        }
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          paramAnonymousString = ((ag)paramAnonymousl).XR();
          ((com.tencent.mm.plugin.account.a.a.a)g.n(com.tencent.mm.plugin.account.a.a.a.class)).setFriendData(paramAnonymousString);
          if ((paramAnonymousString == null) || (paramAnonymousString.size() <= 0)) {
            break label373;
          }
          paramAnonymousl = paramAnonymousString.iterator();
          paramAnonymousInt1 = 0;
          while (paramAnonymousl.hasNext())
          {
            arf localarf = (arf)paramAnonymousl.next();
            if (localarf != null)
            {
              if (localarf.hcd != 1) {
                break label370;
              }
              paramAnonymousInt1 += 1;
            }
          }
          if (paramAnonymousInt1 > 0) {
            paramAnonymousInt2 = 1;
          }
        }
        for (;;)
        {
          if (paramAnonymousString == null) {}
          for (int i = 0;; i = paramAnonymousString.size())
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FindMContactLearmMoreUI", "tigerreg data size=%d, addcount=%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramAnonymousInt1) });
            if ((FindMContactLearmMoreUI.g(FindMContactLearmMoreUI.this) == null) || (!FindMContactLearmMoreUI.g(FindMContactLearmMoreUI.this).contains("1")) || (paramAnonymousInt2 == 0)) {
              break label315;
            }
            com.tencent.mm.plugin.c.a.pU("R300_300_phone");
            paramAnonymousString = new Intent(FindMContactLearmMoreUI.this, FindMContactAddUI.class);
            paramAnonymousString.putExtra("regsetinfo_ticket", FindMContactLearmMoreUI.h(FindMContactLearmMoreUI.this));
            paramAnonymousString.putExtra("regsetinfo_NextStep", FindMContactLearmMoreUI.g(FindMContactLearmMoreUI.this));
            paramAnonymousString.putExtra("regsetinfo_NextStyle", FindMContactLearmMoreUI.i(FindMContactLearmMoreUI.this));
            paramAnonymousString.putExtra("login_type", 0);
            MMWizardActivity.D(FindMContactLearmMoreUI.this, paramAnonymousString);
            return;
            paramAnonymousInt2 = 0;
            break;
          }
          label315:
          FindMContactLearmMoreUI.b(FindMContactLearmMoreUI.this);
          return;
          Toast.makeText(FindMContactLearmMoreUI.this, FindMContactLearmMoreUI.this.getString(a.j.app_err_system_busy_tip, new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) }), 0).show();
          FindMContactLearmMoreUI.b(FindMContactLearmMoreUI.this);
          return;
          label370:
          break;
          label373:
          paramAnonymousInt2 = 0;
          paramAnonymousInt1 = 0;
        }
      }
    };
    this.ehD = local3;
    ((o)localObject).a(431, local3);
    localObject = this.mController.tml;
    getString(a.j.app_tip);
    this.eHw = h.a((Context)localObject, getString(a.j.app_loading), true, new FindMContactLearmMoreUI.4(this));
    g.Em().a(new ah.a()
    {
      public final boolean Kr()
      {
        try
        {
          FindMContactLearmMoreUI.a(FindMContactLearmMoreUI.this, com.tencent.mm.pluginsdk.a.cz(FindMContactLearmMoreUI.this));
          StringBuilder localStringBuilder = new StringBuilder("tigerreg mobileList size ");
          if (FindMContactLearmMoreUI.j(FindMContactLearmMoreUI.this) == null) {}
          for (int i = 0;; i = FindMContactLearmMoreUI.j(FindMContactLearmMoreUI.this).size())
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FindMContactLearmMoreUI", i);
            break;
          }
          return true;
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.FindMContactLearmMoreUI", localException, "", new Object[0]);
        }
      }
      
      public final boolean Ks()
      {
        if ((FindMContactLearmMoreUI.j(FindMContactLearmMoreUI.this) != null) && (FindMContactLearmMoreUI.j(FindMContactLearmMoreUI.this).size() != 0))
        {
          FindMContactLearmMoreUI.a(FindMContactLearmMoreUI.this, new ag(FindMContactLearmMoreUI.h(FindMContactLearmMoreUI.this), FindMContactLearmMoreUI.j(FindMContactLearmMoreUI.this)));
          g.DF().a(FindMContactLearmMoreUI.k(FindMContactLearmMoreUI.this), 0);
          return false;
        }
        if (FindMContactLearmMoreUI.c(FindMContactLearmMoreUI.this) != null)
        {
          FindMContactLearmMoreUI.c(FindMContactLearmMoreUI.this).dismiss();
          FindMContactLearmMoreUI.d(FindMContactLearmMoreUI.this);
        }
        FindMContactLearmMoreUI.b(FindMContactLearmMoreUI.this);
        return false;
      }
      
      public final String toString()
      {
        return super.toString() + "|doUpload";
      }
    });
    ((com.tencent.mm.plugin.account.a.a.a)g.n(com.tencent.mm.plugin.account.a.a.a.class)).syncUploadMContactStatus(true, false);
    ((com.tencent.mm.plugin.account.a.a.a)g.n(com.tencent.mm.plugin.account.a.a.a.class)).syncAddrBookAndUpload();
  }
  
  protected final int getLayoutId()
  {
    return a.g.findmcontact_intro_learn_more;
  }
  
  protected final void initView()
  {
    setMMTitle(a.j.find_mcontact_upload_title);
    this.eHP = ((Button)findViewById(a.f.ok_btn));
    this.eHQ = ((TextView)findViewById(a.f.cancel_btn));
    this.eHP.setOnClickListener(new FindMContactLearmMoreUI.1(this));
    this.eHQ.setOnClickListener(new FindMContactLearmMoreUI.2(this));
    g.Ei().DT().set(12323, Boolean.valueOf(true));
    this.bTi = ((String)g.Ei().DT().get(6, null));
    if ((this.bTi == null) || (this.bTi.equals(""))) {
      this.bTi = ((String)g.Ei().DT().get(4097, null));
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eHp = getIntent().getStringExtra("regsetinfo_ticket");
    this.eHq = getIntent().getStringExtra("regsetinfo_NextStep");
    this.eHr = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    initView();
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
    StringBuilder localStringBuilder = new StringBuilder();
    g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",RE300_600,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("RE300_600") + ",2");
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMContactLearmMoreUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
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
    h.a(this, getString(a.j.permission_contacts_request_again_msg), getString(a.j.permission_tips_title), getString(a.j.jump_to_settings), getString(a.j.app_cancel), false, new DialogInterface.OnClickListener()new FindMContactLearmMoreUI.7
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.dismiss();
        FindMContactLearmMoreUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
      }
    }, new FindMContactLearmMoreUI.7(this));
  }
  
  protected void onResume()
  {
    super.onResume();
    com.tencent.mm.plugin.c.a.pT("R300_100_phone");
    StringBuilder localStringBuilder = new StringBuilder();
    g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",RE300_600,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("RE300_600") + ",1");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/FindMContactLearmMoreUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */