package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.aq.d;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.bottle.a.b;
import com.tencent.mm.plugin.bottle.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.r.a;

public class BottleConversationUI
  extends MMActivity
{
  private TextView emptyTipTv;
  private ListView hkY;
  private a hkZ;
  private String hla;
  private n.d hlb = new BottleConversationUI.2(this);
  private boolean isDeleteCancel = false;
  private String talker;
  private p tipDialog = null;
  
  protected final int getLayoutId()
  {
    return R.i.tmessage;
  }
  
  protected final void initView()
  {
    int i = q.GJ();
    int j = q.GQ();
    au.HU();
    com.tencent.mm.model.c.DT().set(7, Integer.valueOf(i | 0x1000));
    au.HU();
    com.tencent.mm.model.c.DT().set(34, Integer.valueOf(j & 0xFFFFFFBF));
    this.hkY = ((ListView)findViewById(R.h.tmessage_lv));
    this.emptyTipTv = ((TextView)findViewById(R.h.empty_msg_tip_tv));
    this.emptyTipTv.setText(R.l.bottle_empty_msg_tip);
    this.hkZ = new a(this, new r.a()
    {
      public final void Xa() {}
      
      public final void Xb()
      {
        BottleConversationUI localBottleConversationUI = BottleConversationUI.this;
        String str = BottleConversationUI.this.getString(R.l.bottle_opt_list);
        int i = com.tencent.mm.model.k.GB();
        if (i <= 0) {
          localBottleConversationUI.setMMTitle(str);
        }
        while (BottleConversationUI.a(BottleConversationUI.this).getCount() <= 0)
        {
          BottleConversationUI.b(BottleConversationUI.this).setVisibility(0);
          BottleConversationUI.c(BottleConversationUI.this).setVisibility(8);
          return;
          localBottleConversationUI.setMMTitle(str + "(" + i + ")");
        }
        BottleConversationUI.b(BottleConversationUI.this).setVisibility(8);
        BottleConversationUI.c(BottleConversationUI.this).setVisibility(0);
      }
    });
    this.hkZ.setGetViewPositionCallback(new BottleConversationUI.4(this));
    this.hkZ.setPerformItemClickListener(new MMSlideDelView.g()
    {
      public final void t(View paramAnonymousView, int paramAnonymousInt)
      {
        BottleConversationUI.c(BottleConversationUI.this).performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
      }
    });
    this.hkZ.a(new BottleConversationUI.6(this));
    this.hkY.setAdapter(this.hkZ);
    Object localObject = new com.tencent.mm.ui.tools.k(this);
    this.hkY.setOnItemLongClickListener(new BottleConversationUI.7(this, (com.tencent.mm.ui.tools.k)localObject));
    this.hkY.setOnItemClickListener(new BottleConversationUI.8(this));
    com.tencent.mm.plugin.bottle.a.ezo.vl();
    setBackBtn(new BottleConversationUI.9(this));
    localObject = getIntent().getStringExtra("conversation_from");
    if ((bi.oW((String)localObject)) && (bi.oW(this.hla))) {
      addTextOptionMenu(0, getString(R.l.contact_into_goto_floatbottle_str_btn), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.setClass(BottleConversationUI.this, BottleBeachUI.class);
          BottleConversationUI.this.startActivity(paramAnonymousMenuItem);
          BottleConversationUI.this.finish();
          return true;
        }
      });
    }
    for (;;)
    {
      new BottleConversationUI.11(this);
      return;
      if (!bi.oW((String)localObject)) {
        this.hla = ((String)localObject);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    this.talker = ((ai)this.hkZ.getItem(paramView.position)).field_username;
    int i = R.l.bottle_chatting_from_city;
    paramContextMenuInfo = this.hkZ;
    au.HU();
    paramContextMenu.setHeaderTitle(getString(i, new Object[] { paramContextMenuInfo.B(com.tencent.mm.model.c.FR().Yg(this.talker)) }));
    paramContextMenu.add(paramView.position, 0, 0, R.l.bottle_conversation_delete);
  }
  
  public void onDestroy()
  {
    this.hkZ.aYc();
    super.onDestroy();
  }
  
  public void onPause()
  {
    au.HU();
    com.tencent.mm.model.c.FR().b(this.hkZ);
    au.HU();
    com.tencent.mm.model.c.FW().b(this.hkZ);
    au.HU();
    Object localObject = com.tencent.mm.model.c.FT().sx(8);
    if ((localObject != null) && (((cm)localObject).field_msgId > 0L))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Bottle.BottleConversationUI", "resetUnread: lastReadTime = " + ((cm)localObject).field_createTime);
      au.HU();
      com.tencent.mm.model.c.DT().set(12306, Long.valueOf(((cm)localObject).field_createTime));
    }
    au.HU();
    localObject = com.tencent.mm.model.c.FW().Yq("floatbottle");
    if ((localObject == null) || (bi.oV(((am)localObject).field_username).length() <= 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Bottle.BottleConversationUI", "resetUnread: can not find bottle");
    }
    for (;;)
    {
      this.hkZ.onPause();
      super.onPause();
      return;
      ((ai)localObject).eV(0);
      au.HU();
      if (com.tencent.mm.model.c.FW().a((ai)localObject, ((am)localObject).field_username) == -1) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Bottle.BottleConversationUI", "reset bottle unread failed");
      }
    }
  }
  
  public void onResume()
  {
    super.onResume();
    au.HU();
    com.tencent.mm.model.c.FR().a(this.hkZ);
    au.HU();
    com.tencent.mm.model.c.FW().a(this.hkZ);
    this.hkZ.a(null, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/BottleConversationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */