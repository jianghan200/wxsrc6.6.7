package com.tencent.mm.plugin.account.friend.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.i;
import com.tencent.mm.plugin.account.friend.a.i.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ah.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.applet.b;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import java.util.List;

public class FindMContactInviteUI
  extends MMWizardActivity
{
  private int eHr = 2;
  private ProgressDialog eHw = null;
  private String eHy;
  private ListView eIM;
  private i eLL;
  private View eLM;
  private TextView eLN = null;
  private TextView eLO = null;
  private TextView eLP = null;
  private TextView eLQ = null;
  private Button eLR = null;
  private int eLS;
  private List<String[]> eLT;
  private boolean eLU = true;
  private i.a eLV = new FindMContactInviteUI.6(this);
  private String eLX = null;
  private e ehD = null;
  private TextView emptyTipTv = null;
  
  private void WL()
  {
    com.tencent.mm.plugin.c.a.pU(this.eHy);
    YC();
    DT(1);
  }
  
  private void Yd()
  {
    ActionBarActivity localActionBarActivity = this.mController.tml;
    getString(a.j.app_tip);
    this.eHw = h.a(localActionBarActivity, getString(a.j.mobile_friend_loading), true, new FindMContactInviteUI.1(this));
    g.Em().a(new ah.a()
    {
      public final boolean Kr()
      {
        try
        {
          FindMContactInviteUI.a(FindMContactInviteUI.this, com.tencent.mm.pluginsdk.a.cz(FindMContactInviteUI.this));
          FindMContactInviteUI.b(FindMContactInviteUI.this).eHv = FindMContactInviteUI.c(FindMContactInviteUI.this);
          FindMContactInviteUI.b(FindMContactInviteUI.this).p(((com.tencent.mm.plugin.account.a.a.a)g.n(com.tencent.mm.plugin.account.a.a.a.class)).getFriendData());
          return true;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            x.printErrStackTrace("MicroMsg.FindMContactInviteUI", localException, "", new Object[0]);
          }
        }
      }
      
      public final boolean Ks()
      {
        if (FindMContactInviteUI.a(FindMContactInviteUI.this) != null)
        {
          FindMContactInviteUI.a(FindMContactInviteUI.this).dismiss();
          FindMContactInviteUI.a(FindMContactInviteUI.this, null);
        }
        FindMContactInviteUI.b(FindMContactInviteUI.this).notifyDataSetChanged();
        return false;
      }
      
      public final String toString()
      {
        return super.toString() + "|listMFriendData";
      }
    });
  }
  
  protected final int getLayoutId()
  {
    return a.g.find_mcontact_add;
  }
  
  protected final void initView()
  {
    this.emptyTipTv = ((TextView)findViewById(a.f.mobile_friend_empty_msg_tip_tv));
    this.emptyTipTv.setText(a.j.mobile_friend_empty_qmsg_tip);
    this.eIM = ((ListView)findViewById(a.f.mobile_friend_lv));
    if ((this.eHr != 2) && (this.eHr == 1))
    {
      this.eLM = LayoutInflater.from(this).inflate(a.g.find_mcontact_header_style_two, null);
      this.eLN = ((TextView)this.eLM.findViewById(a.f.findmcontact_count));
      this.eLO = ((TextView)this.eLM.findViewById(a.f.findmcontact_tip));
      this.eLP = ((TextView)this.eLM.findViewById(a.f.find_mcontact_title));
      this.eLR = ((Button)this.eLM.findViewById(a.f.find_mcontact_addall));
      this.eLO.setText(getString(a.j.find_mcontact_invite_friend));
      this.eLP.setText(getString(a.j.find_mcontact_invite_friend));
      this.eLR.setText(getString(a.j.find_mcontact_invite_all_continue));
    }
    for (;;)
    {
      this.eLL = new i(this, this.eLV, 2);
      this.eLR.setOnClickListener(new FindMContactInviteUI.7(this));
      if (this.eLQ != null)
      {
        this.eLQ.setOnClickListener(new FindMContactInviteUI.8(this));
        this.eLQ.setVisibility(8);
      }
      this.eIM.addHeaderView(this.eLM);
      this.eIM.setAdapter(this.eLL);
      this.eIM.setOnScrollListener(new com.tencent.mm.ui.applet.a());
      this.eIM.setOnTouchListener(new FindMContactInviteUI.9(this));
      addTextOptionMenu(0, getString(a.j.app_finish), new FindMContactInviteUI.10(this));
      new FindMContactInviteUI.11(this);
      return;
      this.eLM = LayoutInflater.from(this).inflate(a.g.find_mcontact_header, null);
      this.eLN = ((TextView)this.eLM.findViewById(a.f.findmcontact_count));
      this.eLO = ((TextView)this.eLM.findViewById(a.f.findmcontact_tip));
      this.eLP = ((TextView)this.eLM.findViewById(a.f.find_mcontact_title));
      this.eLR = ((Button)this.eLM.findViewById(a.f.find_mcontact_addall));
      this.eLO.setText(getString(a.j.find_mcontact_invite_your_friend));
      this.eLP.setText(getString(a.j.find_mcontact_invite_friend));
      this.eLR.setText(getString(a.j.find_mcontact_invite_all, new Object[] { Integer.valueOf(0) }));
      this.eLQ = ((TextView)this.eLM.findViewById(a.f.mobile_all_unselect));
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.j.find_mcontact_invite_title);
    com.tencent.mm.plugin.account.a.a.ezo.vo();
    this.eLX = getIntent().getStringExtra("regsetinfo_ticket");
    this.eLS = getIntent().getIntExtra("login_type", 0);
    this.eHr = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    this.eHy = com.tencent.mm.plugin.c.a.Zu();
    initView();
  }
  
  public void onDestroy()
  {
    if (this.ehD != null)
    {
      g.DF().b(432, this.ehD);
      this.ehD = null;
    }
    if (this.eLL != null)
    {
      i locali = this.eLL;
      if (locali.eKg != null)
      {
        locali.eKg.detach();
        locali.eKg = null;
      }
    }
    ((com.tencent.mm.plugin.account.a.a.a)g.n(com.tencent.mm.plugin.account.a.a.a.class)).clearFriendData();
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      WL();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
    if (this.eLS == 1)
    {
      localStringBuilder = new StringBuilder();
      g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R300_400_QQ,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R300_400_QQ") + ",2");
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R300_400_phone,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R300_400_phone") + ",2");
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    x.i("MicroMsg.FindMContactInviteUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      Yd();
      return;
    }
    this.eLU = false;
    h.a(this, getString(a.j.permission_contacts_request_again_msg), getString(a.j.permission_tips_title), getString(a.j.jump_to_settings), getString(a.j.app_cancel), false, new DialogInterface.OnClickListener()new FindMContactInviteUI.4
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        FindMContactInviteUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
        FindMContactInviteUI.n(FindMContactInviteUI.this);
        FindMContactInviteUI.this.finish();
      }
    }, new FindMContactInviteUI.4(this));
  }
  
  protected void onResume()
  {
    super.onResume();
    this.eLL.notifyDataSetChanged();
    StringBuilder localStringBuilder;
    if (this.eLS == 1)
    {
      localStringBuilder = new StringBuilder();
      g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R300_400_QQ,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("R300_400_QQ") + ",1");
    }
    for (;;)
    {
      if (this.eLU)
      {
        boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.READ_CONTACTS", 48, null, null);
        x.i("MicroMsg.FindMContactInviteUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd() });
        if (bool) {
          break;
        }
      }
      return;
      localStringBuilder = new StringBuilder();
      g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R300_400_phone,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("R300_400_phone") + ",1");
    }
    Yd();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */