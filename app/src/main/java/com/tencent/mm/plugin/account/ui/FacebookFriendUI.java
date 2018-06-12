package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.plugin.account.friend.a.ab;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.f.a.c;
import com.tencent.mm.ui.s;

@Deprecated
public class FacebookFriendUI
  extends MMActivity
  implements f.c, com.tencent.mm.ab.e
{
  private ProgressDialog eHw = null;
  private ListView eIM;
  private View eIO;
  String eIQ;
  private TextView eIR = null;
  private boolean eMT = false;
  d eQl;
  
  private void aM(String paramString1, String paramString2)
  {
    h.a(this, paramString2, paramString1, new FacebookFriendUI.4(this), null);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FacebookFriendUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paraml.getType() != 32) {
      return;
    }
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if ((paramInt1 == 4) && (paramInt2 == -68))
    {
      paraml = paramString;
      if (bi.oW(paramString)) {
        paraml = "error";
      }
      aM(getString(q.e.app_tip), paraml);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.eQl.a(null, null);
      return;
    }
    Toast.makeText(this, q.e.mobile_friend_err, 0).show();
  }
  
  protected final int getLayoutId()
  {
    return q.c.fb_friend;
  }
  
  protected final void initView()
  {
    this.eIM = ((ListView)findViewById(q.b.mobile_friend_lv));
    this.eIR = ((TextView)findViewById(q.b.empty_facebook_friend_search_tip_tv));
    this.eIR.setText(q.e.facebook_friend_search_no_friend);
    Object localObject1 = (TextView)findViewById(q.b.empty_msg_tip_tv);
    ((TextView)localObject1).setText(q.e.facebook_empty_friend_tip);
    Object localObject2 = new com.tencent.mm.ui.tools.o((byte)0);
    ((com.tencent.mm.ui.tools.o)localObject2).uBw = new FacebookFriendUI.1(this);
    a((com.tencent.mm.ui.tools.o)localObject2);
    this.eQl = new d(this, new FacebookFriendUI.5(this, (TextView)localObject1));
    this.eQl.eQh = new FacebookFriendUI.6(this);
    this.eIM.setAdapter(this.eQl);
    this.eIO = findViewById(q.b.mobile_friend_mobile_not_bind_ll);
    this.eIM.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        paramAnonymousAdapterView = (com.tencent.mm.plugin.account.friend.a.g)FacebookFriendUI.b(FacebookFriendUI.this).getItem(paramAnonymousInt - FacebookFriendUI.e(FacebookFriendUI.this).getHeaderViewsCount());
        if ((paramAnonymousAdapterView.status == 100) || (paramAnonymousAdapterView.status == 101))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("Contact_User", paramAnonymousAdapterView.getUsername());
          paramAnonymousView.putExtra("Contact_Nick", paramAnonymousAdapterView.Xm());
          paramAnonymousView.putExtra("Contact_KFacebookId", paramAnonymousAdapterView.csC);
          paramAnonymousView.putExtra("Contact_KFacebookName", paramAnonymousAdapterView.Xv());
          paramAnonymousView.putExtra("Contact_Scene", 31);
          a.ezn.d(paramAnonymousView, FacebookFriendUI.this);
        }
        if (paramAnonymousAdapterView.status == 102) {}
      }
    });
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FacebookFriendUI", "isBindForFacebookApp:" + com.tencent.mm.model.q.Hg());
    if (com.tencent.mm.model.q.Hg())
    {
      this.eIM.setVisibility(0);
      this.eIO.setVisibility(8);
      long l = bi.c((Long)com.tencent.mm.kernel.g.Ei().DT().get(65831, null));
      localObject1 = bi.oV((String)com.tencent.mm.kernel.g.Ei().DT().get(65830, null));
      if ((bi.bH(l) > 86400000L) && (((String)localObject1).length() > 0))
      {
        localObject2 = new c("290293790992170");
        ((c)localObject2).aaT((String)localObject1);
        new com.tencent.mm.plugin.account.model.g((c)localObject2, new FacebookFriendUI.8(this)).Yl();
      }
      localObject1 = new ab();
      ((ab)localObject1).XO();
      localObject2 = new al(new FacebookFriendUI.9(this, (ab)localObject1), false);
      if (bi.f((Integer)com.tencent.mm.kernel.g.Ei().DT().get(65829, null)) > 0)
      {
        com.tencent.mm.kernel.g.Ei().DT().set(65829, Integer.valueOf(1));
        com.tencent.mm.kernel.g.DF().a((l)localObject1, 0);
        ActionBarActivity localActionBarActivity = this.mController.tml;
        getString(q.e.app_tip);
        this.eHw = h.a(localActionBarActivity, getString(q.e.qq_friend_loading), true, new FacebookFriendUI.10(this, (al)localObject2, (ab)localObject1));
        addTextOptionMenu(0, getString(q.e.find_friends_by_facebook_invite), new FacebookFriendUI.11(this));
      }
    }
    for (;;)
    {
      setBackBtn(new FacebookFriendUI.2(this));
      new FacebookFriendUI.3(this);
      return;
      ((al)localObject2).J(5000L, 5000L);
      break;
      this.eIM.setVisibility(8);
      this.eIO.setVisibility(0);
      ((TextView)findViewById(q.b.mobile_friend_mobile_not_bind_tv)).setText(q.e.fb_friend_not_bind);
      this.eIO.setOnClickListener(new FacebookFriendUI.12(this));
    }
  }
  
  public final void jX(String paramString)
  {
    this.eQl.notifyDataSetChanged();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(q.e.find_friends_by_facebook);
    com.tencent.mm.kernel.g.DF().a(32, this);
    initView();
  }
  
  public void onDestroy()
  {
    com.tencent.mm.kernel.g.DF().b(32, this);
    this.eQl.aYc();
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
    com.tencent.mm.aa.q.Kp().e(this);
  }
  
  protected void onResume()
  {
    super.onResume();
    com.tencent.mm.aa.q.Kp().d(this);
    this.eQl.notifyDataSetChanged();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/ui/FacebookFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */