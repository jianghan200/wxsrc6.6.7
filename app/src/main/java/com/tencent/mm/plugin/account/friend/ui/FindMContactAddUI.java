package com.tencent.mm.plugin.account.friend.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.h;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.i;
import com.tencent.mm.plugin.account.friend.a.i.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import java.util.List;

public class FindMContactAddUI
  extends MMWizardActivity
{
  private String eHp = null;
  private String eHq = "";
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
  private i.a eLV = new i.a()
  {
    public final void notifyDataSetChanged()
    {
      if ((FindMContactAddUI.e(FindMContactAddUI.this) != 2) && (FindMContactAddUI.e(FindMContactAddUI.this) == 1))
      {
        FindMContactAddUI.f(FindMContactAddUI.this).setText(FindMContactAddUI.this.getString(a.j.find_mcontact_add_all_continue));
        if (!FindMContactAddUI.c(FindMContactAddUI.this).Xx()) {
          break label233;
        }
        if ((FindMContactAddUI.e(FindMContactAddUI.this) != 1) && (FindMContactAddUI.f(FindMContactAddUI.this).getVisibility() == 0) && (FindMContactAddUI.g(FindMContactAddUI.this) != null))
        {
          FindMContactAddUI.f(FindMContactAddUI.this).setVisibility(8);
          FindMContactAddUI.g(FindMContactAddUI.this).setVisibility(0);
        }
      }
      for (;;)
      {
        if ((FindMContactAddUI.c(FindMContactAddUI.this).getSelectCount() <= 0) || (FindMContactAddUI.e(FindMContactAddUI.this) == 1)) {
          break label295;
        }
        FindMContactAddUI.h(FindMContactAddUI.this).setText(FindMContactAddUI.this.getResources().getQuantityString(a.h.find_mcontact_already_add_count, FindMContactAddUI.c(FindMContactAddUI.this).getSelectCount(), new Object[] { Integer.valueOf(FindMContactAddUI.c(FindMContactAddUI.this).getSelectCount()) }));
        return;
        FindMContactAddUI.f(FindMContactAddUI.this).setText(FindMContactAddUI.this.getString(a.j.find_mcontact_add_all, new Object[] { Integer.valueOf(FindMContactAddUI.c(FindMContactAddUI.this).getCount()) }));
        break;
        label233:
        if ((FindMContactAddUI.e(FindMContactAddUI.this) != 1) && (FindMContactAddUI.f(FindMContactAddUI.this).getVisibility() == 8) && (FindMContactAddUI.g(FindMContactAddUI.this) != null))
        {
          FindMContactAddUI.f(FindMContactAddUI.this).setVisibility(0);
          FindMContactAddUI.g(FindMContactAddUI.this).setVisibility(8);
        }
      }
      label295:
      FindMContactAddUI.h(FindMContactAddUI.this).setText(FindMContactAddUI.this.getResources().getQuantityString(a.h.find_mcontact_wechat_friend, FindMContactAddUI.c(FindMContactAddUI.this).getCount(), new Object[] { Integer.valueOf(FindMContactAddUI.c(FindMContactAddUI.this).getCount()) }));
    }
  };
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
    this.eHw = h.a(localActionBarActivity, getString(a.j.mobile_friend_loading), true, new FindMContactAddUI.1(this));
    g.Em().a(new FindMContactAddUI.6(this));
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
      this.eLO.setText(getString(a.j.find_mcontact_your_friend));
      this.eLP.setText(getString(a.j.find_mcontact_your_friend_title));
      this.eLR.setText(getString(a.j.find_mcontact_add_all_continue));
    }
    for (;;)
    {
      this.eLL = new i(this, this.eLV, 1);
      this.eLR.setOnClickListener(new FindMContactAddUI.8(this));
      if (this.eLQ != null)
      {
        this.eLQ.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            FindMContactAddUI.f(FindMContactAddUI.this).setVisibility(0);
            FindMContactAddUI.g(FindMContactAddUI.this).setVisibility(8);
            FindMContactAddUI.c(FindMContactAddUI.this).ci(false);
            FindMContactAddUI.c(FindMContactAddUI.this).notifyDataSetChanged();
          }
        });
        this.eLQ.setVisibility(8);
      }
      this.eIM.addHeaderView(this.eLM);
      this.eIM.setAdapter(this.eLL);
      addTextOptionMenu(0, getString(a.j.app_nextstep), new FindMContactAddUI.10(this));
      new FindMContactAddUI.11(this);
      return;
      this.eLM = LayoutInflater.from(this).inflate(a.g.find_mcontact_header, null);
      this.eLN = ((TextView)this.eLM.findViewById(a.f.findmcontact_count));
      this.eLO = ((TextView)this.eLM.findViewById(a.f.findmcontact_tip));
      this.eLP = ((TextView)this.eLM.findViewById(a.f.find_mcontact_title));
      this.eLR = ((Button)this.eLM.findViewById(a.f.find_mcontact_addall));
      this.eLO.setText(getString(a.j.find_mcontact_your_friend));
      this.eLP.setText(getString(a.j.find_mcontact_your_friend_title));
      this.eLR.setText(getString(a.j.find_mcontact_add_all, new Object[] { Integer.valueOf(0) }));
      this.eLQ = ((TextView)this.eLM.findViewById(a.f.mobile_all_unselect));
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.j.find_mcontact_add_title);
    com.tencent.mm.plugin.account.a.a.ezo.vo();
    this.eHp = getIntent().getStringExtra("regsetinfo_ticket");
    this.eHq = getIntent().getStringExtra("regsetinfo_NextStep");
    this.eHr = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    this.eLS = getIntent().getIntExtra("login_type", 0);
    this.eHy = com.tencent.mm.plugin.c.a.Zu();
    initView();
  }
  
  public void onDestroy()
  {
    if (this.ehD != null)
    {
      g.DF().b(30, this.ehD);
      this.ehD = null;
    }
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
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R300_300_QQ,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R300_300_QQ") + ",2");
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R300_300_phone,");
    g.Eg();
    com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R300_300_phone") + ",2");
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    x.i("MicroMsg.FindMContactAddUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
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
    h.a(this, getString(a.j.permission_contacts_request_again_msg), getString(a.j.permission_tips_title), getString(a.j.jump_to_settings), getString(a.j.app_cancel), false, new FindMContactAddUI.4(this), new FindMContactAddUI.5(this));
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
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R300_300_QQ,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("R300_300_QQ") + ",1");
      com.tencent.mm.plugin.c.a.pT("R300_300_QQ");
    }
    for (;;)
    {
      if (this.eLU)
      {
        boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.READ_CONTACTS", 48, null, null);
        x.i("MicroMsg.FindMContactAddUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd() });
        if (bool) {
          break;
        }
      }
      return;
      localStringBuilder = new StringBuilder();
      g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R300_300_phone,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("R300_300_phone") + ",1");
      com.tencent.mm.plugin.c.a.pT("R300_300_phone");
    }
    Yd();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/friend/ui/FindMContactAddUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */