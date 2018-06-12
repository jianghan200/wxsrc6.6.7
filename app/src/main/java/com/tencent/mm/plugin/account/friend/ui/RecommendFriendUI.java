package com.tencent.mm.plugin.account.friend.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.aa;
import com.tencent.mm.protocal.c.avw;
import com.tencent.mm.protocal.c.avz;
import com.tencent.mm.protocal.c.xp;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import java.util.LinkedList;
import junit.framework.Assert;

public class RecommendFriendUI
  extends MMActivity
  implements e
{
  private ProgressDialog eHw = null;
  private b eMW;
  private ListView eMX;
  private TextView eMY;
  private LinkedList<avz> eMZ = new LinkedList();
  private LinkedList<xp> eMb = new LinkedList();
  private boolean eMc;
  private int eNa = -1;
  private boolean eNb = false;
  
  private void Yf()
  {
    this.eMY.setVisibility(0);
    this.eMX.setVisibility(8);
  }
  
  private void Yg()
  {
    if (this.eNa == 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("dealGetInviteFriendGroupSuccess just only qq", bool);
      x.i("MicroMsg.RecommendFriendUI", "dealGetInviteFriendGroupSuccess  respList.size:" + this.eMb.size());
      this.eMW.eMb = this.eMb;
      this.eMX.setAdapter(this.eMW);
      showOptionMenu(false);
      this.eMc = true;
      setMMTitle(a.j.settings_invite_qq_friends);
      this.eMW.eMc = this.eMc;
      this.eMW.notifyDataSetChanged();
      return;
    }
  }
  
  private void goBack()
  {
    if (this.eNa != 0)
    {
      finish();
      return;
    }
    if ((this.eMc) || (this.eNb))
    {
      finish();
      return;
    }
    Yg();
  }
  
  private void ji(int paramInt)
  {
    x.i("MicroMsg.RecommendFriendUI", "dealGetInviteFriendSuccess  respList.size:" + this.eMZ.size());
    this.eMW.a(this.eMZ, paramInt);
    this.eMX.setAdapter(this.eMW);
    this.eMc = false;
    String str;
    int i;
    if (this.eNa == 0)
    {
      str = "";
      i = 0;
      if (i < this.eMb.size())
      {
        if (paramInt != ((xp)this.eMb.get(i)).rxW) {
          break label142;
        }
        str = ((xp)this.eMb.get(i)).rDt;
      }
    }
    label142:
    for (;;)
    {
      i += 1;
      break;
      setMMTitle(str);
      this.eMW.eMc = this.eMc;
      this.eMW.notifyDataSetChanged();
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.RecommendFriendUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paraml.getType() != 135))
    {
      Yf();
      return;
    }
    this.eMZ = ((avw)((aa)paraml).diG.dIE.dIL).jTa;
    this.eMb = ((avw)((aa)paraml).diG.dIE.dIL).rcM;
    this.eNb = false;
    if (this.eMZ.size() <= 0)
    {
      Yf();
      return;
    }
    if ((this.eNa == 0) && (this.eMb.size() <= 0))
    {
      Yf();
      return;
    }
    if (this.eNa != 0)
    {
      ji(-1);
      return;
    }
    Yg();
  }
  
  protected final int getLayoutId()
  {
    return a.g.inviteqqfriends;
  }
  
  protected final void initView()
  {
    this.eMY = ((TextView)findViewById(a.f.empty_tip_tv));
    if (this.eNa == 1)
    {
      setMMTitle(a.j.settings_recommend_by_mb);
      this.eMY.setText(a.j.settings_recommend_no_mb_contact);
    }
    for (;;)
    {
      this.eMW = new b(getLayoutInflater());
      this.eMX = ((ListView)findViewById(a.f.inviteqqfriends_friend_lv));
      this.eMX.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          int i = 0;
          if (!RecommendFriendUI.a(RecommendFriendUI.this))
          {
            RecommendFriendUI.b(RecommendFriendUI.this).jh(paramAnonymousInt);
            if (RecommendFriendUI.b(RecommendFriendUI.this).Ye().length > 0)
            {
              RecommendFriendUI.this.showOptionMenu(true);
              return;
            }
            RecommendFriendUI.this.showOptionMenu(false);
            return;
          }
          paramAnonymousAdapterView = RecommendFriendUI.this;
          paramAnonymousView = RecommendFriendUI.b(RecommendFriendUI.this);
          if (!paramAnonymousView.eMc) {}
          for (paramAnonymousInt = i;; paramAnonymousInt = ((xp)paramAnonymousView.eMb.get(paramAnonymousInt)).rxW)
          {
            RecommendFriendUI.a(paramAnonymousAdapterView, paramAnonymousInt);
            return;
          }
        }
      });
      this.eMX.setAdapter(this.eMW);
      addTextOptionMenu(0, getString(a.j.inviteqqfriends_invite), new RecommendFriendUI.2(this));
      showOptionMenu(false);
      this.eNb = true;
      aa localaa = new aa(this.eNa);
      g.DF().a(localaa, 0);
      ActionBarActivity localActionBarActivity = this.mController.tml;
      getString(a.j.app_tip);
      this.eHw = h.a(localActionBarActivity, getString(a.j.inviteqqfriends_loading_friends_info), true, new RecommendFriendUI.5(this, localaa));
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          RecommendFriendUI.d(RecommendFriendUI.this);
          return true;
        }
      });
      new RecommendFriendUI.4(this);
      return;
      if (this.eNa == 2)
      {
        setMMTitle(a.j.settings_recommend_by_mail);
        this.eMY.setText(a.j.settings_recommend_no_mail_contact);
      }
      else
      {
        setMMTitle(a.j.settings_invite_qq_friends);
        this.eMY.setText(a.j.settings_recommend_no_qq_contact);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eNa = bi.getInt(getIntent().getStringExtra("recommend_type"), 0);
    this.eMc = false;
    g.DF().a(135, this);
    initView();
  }
  
  protected void onDestroy()
  {
    g.DF().b(135, this);
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/friend/ui/RecommendFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */