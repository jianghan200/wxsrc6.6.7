package com.tencent.mm.plugin.subapp.ui.friend;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.model.a.e;
import com.tencent.mm.model.a.f;
import com.tencent.mm.model.a.g;
import com.tencent.mm.model.al;
import com.tencent.mm.model.au;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.r.a;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.tools.k;

public class FMessageConversationUI
  extends MMActivity
{
  private n.d hlb = new n.d()
  {
    public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
    {
      com.tencent.mm.az.c.d(FMessageConversationUI.d(FMessageConversationUI.this), FMessageConversationUI.e(FMessageConversationUI.this));
    }
  };
  private String mbU;
  private b orL;
  private ListView osa;
  private a osb;
  private TextView osc;
  private long osd;
  
  protected final int getLayoutId()
  {
    return R.i.fmessage_conversation;
  }
  
  protected final void initView()
  {
    boolean bool = true;
    Object localObject1;
    int i;
    if (g.IW().iP("1") != null)
    {
      localObject1 = g.IW().iP("1").value;
      if (((String)localObject1).equals("0"))
      {
        i = 0;
        f.iT("1");
      }
    }
    for (;;)
    {
      this.orL = new b(this.mController.tml);
      com.tencent.mm.az.d.SF().c(this.orL);
      this.orL.tlG = new r.a()
      {
        public final void Xa() {}
        
        public final void Xb()
        {
          if (FMessageConversationUI.a(FMessageConversationUI.this).getCount() >= 0)
          {
            FMessageConversationUI.this.enableOptionMenu(0, true);
            return;
          }
          FMessageConversationUI.this.enableOptionMenu(0, false);
        }
      };
      this.osa = ((ListView)findViewById(R.h.fmessage_conversation_lv));
      if (i != 0)
      {
        localObject1 = LayoutInflater.from(this.mController.tml).inflate(R.i.fmessage_conversation_header, null);
        ((View)localObject1).findViewById(R.h.fmsg_searchEt).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            Intent localIntent = new Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
            paramAnonymousView = null;
            if (Build.VERSION.SDK_INT >= 21) {
              paramAnonymousView = ActivityOptions.makeSceneTransitionAnimation(FMessageConversationUI.this, new Pair[0]).toBundle();
            }
            com.tencent.mm.plugin.fts.a.d.b(FMessageConversationUI.this.mController.tml, ".ui.FTSAddFriendUI", localIntent, paramAnonymousView);
          }
        });
        this.osa.addHeaderView((View)localObject1);
      }
      this.osa.setAdapter(this.orL);
      localObject1 = new k(this);
      this.osa.setOnItemLongClickListener(new FMessageConversationUI.3(this, (k)localObject1));
      localObject1 = this.mController.tml;
      Object localObject2 = this.orL;
      if (this.osa.getHeaderViewsCount() > 0)
      {
        label206:
        this.osb = new a((Context)localObject1, (b)localObject2, bool);
        this.osa.setOnItemClickListener(this.osb);
        if (i != 0) {
          break label330;
        }
        localObject1 = findViewById(R.h.fmessage_conversation_empty_a);
        ((View)localObject1).setVisibility(0);
        ((TextView)findViewById(R.h.empty_tip_recommend_bind_tv)).setOnClickListener(new FMessageConversationUI.4(this));
        this.osa.setEmptyView((View)localObject1);
      }
      for (;;)
      {
        addTextOptionMenu(0, getString(R.l.menu_item_add_friend), new FMessageConversationUI.7(this));
        setBackBtn(new FMessageConversationUI.8(this));
        return;
        if (!((String)localObject1).equals("1")) {
          break label406;
        }
        i = 1;
        break;
        bool = false;
        break label206;
        label330:
        localObject1 = findViewById(R.h.fmessage_conversation_empty_b);
        ((View)localObject1).setVisibility(0);
        this.osc = ((TextView)((View)localObject1).findViewById(R.h.fmsg_msg_content));
        localObject2 = (ListView)((View)localObject1).findViewById(R.h.fmsg_list);
        ((ListView)localObject2).setAdapter(new FMessageConversationUI.5(this));
        ((ListView)localObject2).setOnItemClickListener(new FMessageConversationUI.6(this));
        this.osa.setEmptyView((View)localObject1);
      }
      label406:
      i = 1;
      break;
      i = 1;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.fmessage_conversation_title);
    try
    {
      au.getNotification().xR();
      if (!au.HX())
      {
        finish();
        return;
      }
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.FMessageConversationUI", paramBundle, "try cancel notification fail", new Object[0]);
      }
      initView();
    }
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramContextMenuInfo = (ar)this.orL.getItem(paramView.position);
    if (paramContextMenuInfo == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FMessageConversationUI", "onItemLongClick, item is null, pos = " + paramView.position);
      return;
    }
    if (!bi.oW(paramContextMenuInfo.field_displayName)) {
      paramContextMenu.setHeaderTitle(j.a(this, paramContextMenuInfo.field_displayName));
    }
    paramContextMenu.add(0, 0, 0, R.l.app_delete);
    this.osd = paramContextMenuInfo.field_fmsgSysRowId;
    this.mbU = paramContextMenuInfo.field_talker;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    f.iU("1");
    com.tencent.mm.az.d.SF().clO();
    if (this.orL != null) {
      com.tencent.mm.az.d.SF().d(this.orL);
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    au.HU();
    com.tencent.mm.model.c.DT().set(143618, Integer.valueOf(0));
  }
  
  protected void onResume()
  {
    super.onResume();
    if (!au.HX()) {
      finish();
    }
    while ((this.osc == null) || (!bi.fU(this))) {
      return;
    }
    this.osc.setText(R.l.fmessage_no_recommend_msg_google);
  }
  
  final class a
  {
    TextView eGX;
    ImageView gwj;
    
    public a(View paramView)
    {
      this.gwj = ((ImageView)paramView.findViewById(R.h.fmsg_item_icon));
      this.eGX = ((TextView)paramView.findViewById(R.h.fmsg_item_title));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */