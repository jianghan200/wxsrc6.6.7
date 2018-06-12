package com.tencent.mm.ui.voicesearch;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.am;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ai;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.r.a;
import java.util.LinkedList;

public class SearchConversationResultUI
  extends MMActivity
{
  private TextView hSp;
  private ListView uFC;
  private a uFD;
  private String uFE = null;
  private String username;
  
  protected final int getLayoutId()
  {
    return R.i.voice_search_result;
  }
  
  protected final void initView()
  {
    this.uFC = ((ListView)findViewById(R.h.voice_search_resultlist));
    this.hSp = ((TextView)findViewById(R.h.empty_voicesearch_tip_tv));
    this.uFD = new a(getApplicationContext(), new r.a()
    {
      public final void Xa() {}
      
      public final void Xb() {}
    });
    if (this.uFD != null) {
      this.uFD.dQ(new LinkedList());
    }
    this.uFC.setAdapter(this.uFD);
    this.hSp.setVisibility(8);
    this.username = getIntent().getStringExtra("SearchConversationResult_User");
    this.uFE = getIntent().getStringExtra("SearchConversationResult_Error");
    setMMTitle(getString(R.l.voice_search_result));
    setBackBtn(new SearchConversationResultUI.2(this));
    this.uFC.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        if (paramAnonymousInt < SearchConversationResultUI.a(SearchConversationResultUI.this).getHeaderViewsCount()) {
          return;
        }
        paramAnonymousInt -= SearchConversationResultUI.a(SearchConversationResultUI.this).getHeaderViewsCount();
        paramAnonymousAdapterView = (ai)SearchConversationResultUI.b(SearchConversationResultUI.this).getItem(paramAnonymousInt);
        if (paramAnonymousAdapterView == null)
        {
          x.e("MicroMsg.VoiceSearchResultUI", "null user at position = " + paramAnonymousInt);
          return;
        }
        x.d("MicroMsg.VoiceSearchResultUI", "username " + paramAnonymousAdapterView.field_username);
        if (com.tencent.mm.model.s.hk(paramAnonymousAdapterView.field_username))
        {
          if (q.GY())
          {
            paramAnonymousAdapterView = new Intent().putExtra("finish_direct", true);
            d.b(SearchConversationResultUI.this.mController.tml, "tmessage", ".ui.TConversationUI", paramAnonymousAdapterView);
            return;
          }
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          return;
        }
        if (com.tencent.mm.model.s.hm(paramAnonymousAdapterView.field_username))
        {
          if (q.GV())
          {
            paramAnonymousAdapterView = new Intent().putExtra("finish_direct", true);
            d.b(SearchConversationResultUI.this.mController.tml, "qmessage", ".ui.QConversationUI", paramAnonymousAdapterView);
            return;
          }
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          return;
        }
        if (com.tencent.mm.model.s.hl(paramAnonymousAdapterView.field_username))
        {
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          return;
        }
        if (com.tencent.mm.model.s.hq(paramAnonymousAdapterView.field_username))
        {
          MMAppMgr.cancelNotification(paramAnonymousAdapterView.field_username);
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          return;
        }
        if (com.tencent.mm.model.s.hi(paramAnonymousAdapterView.field_username))
        {
          if (q.Hh())
          {
            SearchConversationResultUI.a(SearchConversationResultUI.this, ChattingUI.class, new Intent().putExtra("Chat_User", paramAnonymousAdapterView.field_username).putExtra("finish_direct", true));
            return;
          }
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          return;
        }
        if (com.tencent.mm.model.s.hv(paramAnonymousAdapterView.field_username))
        {
          if (q.Hc())
          {
            paramAnonymousAdapterView = new Intent();
            paramAnonymousAdapterView.putExtra("type", 20);
            d.b(SearchConversationResultUI.this, "readerapp", ".ui.ReaderAppUI", paramAnonymousAdapterView);
            return;
          }
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          return;
        }
        if (com.tencent.mm.model.s.hD(paramAnonymousAdapterView.field_username))
        {
          if (q.Hd())
          {
            paramAnonymousAdapterView = new Intent();
            paramAnonymousAdapterView.putExtra("type", 11);
            d.b(SearchConversationResultUI.this, "readerapp", ".ui.ReaderAppUI", paramAnonymousAdapterView);
            return;
          }
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          return;
        }
        if (com.tencent.mm.model.s.hn(paramAnonymousAdapterView.field_username))
        {
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          return;
        }
        if (com.tencent.mm.model.s.ho(paramAnonymousAdapterView.field_username))
        {
          if (q.Hf())
          {
            paramAnonymousAdapterView = new Intent().putExtra("finish_direct", true);
            d.b(SearchConversationResultUI.this, "masssend", ".ui.MassSendHistoryUI", paramAnonymousAdapterView);
            return;
          }
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          return;
        }
        if (com.tencent.mm.model.s.hu(paramAnonymousAdapterView.field_username))
        {
          if (q.GZ())
          {
            SearchConversationResultUI.b(SearchConversationResultUI.this, ChattingUI.class, new Intent().putExtra("Chat_User", paramAnonymousAdapterView.field_username).putExtra("finish_direct", true));
            return;
          }
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          return;
        }
        if ((com.tencent.mm.model.s.hs(SearchConversationResultUI.c(SearchConversationResultUI.this))) || (com.tencent.mm.model.s.ht(SearchConversationResultUI.c(SearchConversationResultUI.this))) || (com.tencent.mm.model.s.hp(SearchConversationResultUI.c(SearchConversationResultUI.this))) || (com.tencent.mm.model.s.hx(SearchConversationResultUI.c(SearchConversationResultUI.this))) || (com.tencent.mm.model.s.hy(SearchConversationResultUI.c(SearchConversationResultUI.this))) || (com.tencent.mm.model.s.hj(SearchConversationResultUI.c(SearchConversationResultUI.this))) || (com.tencent.mm.model.s.hG(SearchConversationResultUI.c(SearchConversationResultUI.this))))
        {
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          return;
        }
        SearchConversationResultUI.c(SearchConversationResultUI.this, ChattingUI.class, new Intent().putExtra("Chat_User", paramAnonymousAdapterView.field_username).putExtra("finish_direct", true));
      }
    });
    String str = this.username;
    this.hSp.setVisibility(8);
    if (this.uFD != null) {
      this.uFD.pi(str);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.uFD.aYc();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/voicesearch/SearchConversationResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */