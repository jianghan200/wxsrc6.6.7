package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.af;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.w.a;
import com.tencent.mm.ui.widget.b.a;

public class ChatroomContactUI
  extends MMActivity
  implements e, j.a
{
  private com.tencent.mm.pluginsdk.ui.d hLH = new com.tencent.mm.pluginsdk.ui.d(new AbsListView.OnScrollListener()
  {
    public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
    
    public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt) {}
  });
  private int hpr = 0;
  private int hps = 0;
  private a hql;
  private n.d iEm = new ChatroomContactUI.1(this);
  private TextView iYb;
  private ListView kBy;
  private com.tencent.mm.ui.voicesearch.b uhh;
  private String uhj;
  private ContactCountView uhu;
  private VoiceSearchLayout uis;
  private com.tencent.mm.modelvoiceaddr.ui.b uit;
  private d uiu;
  
  private void aYT()
  {
    if (this.uiu != null) {
      this.uiu.a(null, null);
    }
    if (this.uhh != null) {
      this.uhh.a(null, null);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if (!ai.ci(this)) {}
    while ((w.a.a(this, paramInt1, paramInt2, paramString, 4)) || (paramInt1 != 0) || (paramInt2 != 0)) {
      return;
    }
    switch (paraml.getType())
    {
    default: 
      return;
    }
    aYT();
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    if (this.uhu != null)
    {
      this.uhu.setContactType(2);
      this.uhu.cyd();
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.chatroom_address;
  }
  
  public final void initView()
  {
    ((TextView)findViewById(R.h.empty_voicesearch_tip_tv)).setVisibility(8);
    this.kBy = ((ListView)findViewById(R.h.address_contactlist));
    this.kBy.setAdapter(null);
    this.iYb = ((TextView)findViewById(R.h.empty_voicesearch_tip_tv));
    this.iYb.setText(R.l.address_empty_chatroom_tip);
    this.uiu = new d(this, "@all.chatroom.contact");
    this.uiu.lB(true);
    this.uhh = new com.tencent.mm.ui.voicesearch.b(this.mController.tml, 1);
    this.uhh.ugF = "@all.chatroom.contact";
    this.uit = new com.tencent.mm.modelvoiceaddr.ui.b((byte)0);
    this.uit.a(new ChatroomContactUI.7(this));
    a(this.uit);
    this.uiu.setGetViewPositionCallback(new ChatroomContactUI.8(this));
    this.uiu.setPerformItemClickListener(new ChatroomContactUI.9(this));
    this.uiu.a(new ChatroomContactUI.10(this));
    this.kBy.setOnScrollListener(this.hLH);
    this.uiu.qJh = this.hLH;
    this.hql = new a(this.mController.tml);
    this.kBy.setOnItemClickListener(new ChatroomContactUI.11(this));
    this.kBy.setOnItemLongClickListener(new ChatroomContactUI.12(this));
    this.kBy.setOnTouchListener(new ChatroomContactUI.13(this));
    Object localObject = this.kBy;
    ContactCountView localContactCountView = new ContactCountView(this);
    this.uhu = localContactCountView;
    ((ListView)localObject).addFooterView(localContactCountView, null, false);
    setBackBtn(new ChatroomContactUI.2(this));
    addIconOptionMenu(0, R.l.actionbar_title_new_group_chat, R.k.actionbar_icon_dark_add, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        paramAnonymousMenuItem = new Intent(ChatroomContactUI.this, SelectContactUI.class);
        paramAnonymousMenuItem.putExtra("titile", ChatroomContactUI.this.getString(R.l.address_title_launch_chatting));
        paramAnonymousMenuItem.putExtra("list_type", 0);
        paramAnonymousMenuItem.putExtra("list_attr", s.s(new int[] { s.ukG, 256, 512 }));
        ChatroomContactUI.this.mController.tml.startActivity(paramAnonymousMenuItem);
        return false;
      }
    });
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        BackwardSupportUtil.c.a(ChatroomContactUI.b(ChatroomContactUI.this));
      }
    };
    this.kBy.setAdapter(this.uiu);
    this.uhh.mz(false);
    this.kBy.setVisibility(0);
    this.uis = new VoiceSearchLayout(this);
    localObject = new RelativeLayout.LayoutParams(-1, -1);
    ((RelativeLayout.LayoutParams)localObject).addRule(14);
    this.uis.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.uis.setTopMargin(BackwardSupportUtil.b.b(this, 100.0F));
    this.uis.setVisibility(8);
    ((ViewGroup)findViewById(R.h.voicesearch_view)).addView(this.uis);
    if (this.uis != null) {
      this.uis.setOnVisibleChangeListener(new ChatroomContactUI.5(this));
    }
    if (this.uiu.getCount() == 0)
    {
      this.iYb.setSingleLine(false);
      this.iYb.setPadding(40, 0, 40, 0);
      this.iYb.setVisibility(0);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.address_chatroom_contact_nick);
    initView();
    au.DF().a(138, this);
    au.HU();
    c.FR().a(this.uiu);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    au.HU();
    if (c.FR().Yg(this.uhj) == null) {
      x.e("MicroMsg.ChatroomContactUI", "onCreateContextMenu, contact is null, username = " + this.uhj);
    }
    while (!com.tencent.mm.model.s.hc(this.uhj)) {
      return;
    }
    paramContextMenu.setHeaderTitle(j.a(paramView.getContext(), r.gT(this.uhj)));
    paramContextMenu.add(paramContextMenuInfo.position, 1, 0, R.l.address_delgroupcard);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    au.DF().b(138, this);
    au.HU();
    c.FR().b(this.uiu);
    d locald = this.uiu;
    if (locald.eKg != null)
    {
      locald.eKg.detach();
      locald.eKg = null;
    }
    this.uiu.aYc();
    this.uiu.tlG = null;
    this.uhh.detach();
    this.uhh.aYc();
  }
  
  protected void onPause()
  {
    super.onPause();
    au.HU();
    c.Ga().d(this);
    if (this.uit != null)
    {
      com.tencent.mm.modelvoiceaddr.ui.b localb = this.uit;
      localb.czQ();
      localb.cancel();
    }
    if (this.uhh != null) {
      this.uhh.onPause();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.uhu != null)
    {
      this.uhu.setContactType(2);
      this.uhu.cyd();
    }
    au.HU();
    c.Ga().c(this);
    if ((this.uit != null) && (this.uis != null))
    {
      com.tencent.mm.bg.d.cfH();
      if ((com.tencent.mm.al.b.PD()) || (!w.chP().equals("zh_CN"))) {
        break label109;
      }
      this.uit.erG = true;
      this.uit.o(this.uis);
    }
    for (;;)
    {
      if (this.uhh != null) {
        this.uhh.onResume();
      }
      return;
      label109:
      this.uit.erG = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/contact/ChatroomContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */