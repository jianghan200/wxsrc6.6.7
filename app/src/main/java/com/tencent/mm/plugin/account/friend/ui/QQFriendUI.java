package com.tencent.mm.plugin.account.friend.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.aa.q;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.g.a.mc;
import com.tencent.mm.g.a.mc.b;
import com.tencent.mm.model.a.c;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.ac;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.account.friend.a.ap;
import com.tencent.mm.plugin.account.friend.a.j;
import com.tencent.mm.plugin.account.friend.a.k;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.agu;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class QQFriendUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private int GG;
  private ProgressDialog eHw = null;
  private ListView eIM;
  String eIQ;
  private TextView eIR = null;
  d eMR;
  private com.tencent.mm.ui.tools.o eMS;
  private boolean eMT = false;
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.QQFriendUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (((agu)((ac)paraml).diG.dID.dIL).jRb != 1) {
      return;
    }
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.eMR.WT();
      return;
    }
    Toast.makeText(this, a.j.qq_friend_load_err, 0).show();
  }
  
  protected final int getLayoutId()
  {
    return a.g.qq_friend;
  }
  
  protected final void initView()
  {
    this.eIM = ((ListView)findViewById(a.f.qq_friend_lv));
    this.eIR = ((TextView)findViewById(a.f.empty_qq_search_tip_tv));
    this.eIR.setText(a.j.qq_search_no_friend);
    this.eMS = new com.tencent.mm.ui.tools.o((byte)0);
    this.eMS.uBw = new QQFriendUI.2(this);
    a(this.eMS);
    String str;
    int i;
    if (com.tencent.mm.model.a.g.IW().iP("2") != null)
    {
      str = com.tencent.mm.model.a.g.IW().iP("2").value;
      if (str.equals("0"))
      {
        i = 0;
        com.tencent.mm.model.a.f.iT("2");
      }
    }
    for (;;)
    {
      if (i == 0) {}
      for (this.eMR = new e(this, this.GG);; this.eMR = new f(this, this.GG))
      {
        this.eMR.a(new QQFriendUI.3(this));
        this.eIM.setAdapter(this.eMR);
        this.eIM.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
          public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            paramAnonymousAdapterView = null;
            if (paramAnonymousInt < QQFriendUI.c(QQFriendUI.this).getHeaderViewsCount()) {}
            do
            {
              return;
              paramAnonymousInt -= QQFriendUI.c(QQFriendUI.this).getHeaderViewsCount();
              x.i("MicroMsg.QQFriendUI", "realpostion is:%d headerViewscount:%d", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(QQFriendUI.c(QQFriendUI.this).getHeaderViewsCount()) });
              paramAnonymousView = (ao)QQFriendUI.d(QQFriendUI.this).getItem(paramAnonymousInt);
              if (!QQFriendUI.this.getIntent().getBooleanExtra("qqgroup_sendmessage", false)) {
                break;
              }
              paramAnonymousAdapterView = new mc();
              paramAnonymousAdapterView.bWF.opType = 0;
              paramAnonymousAdapterView.bWF.bWH = (paramAnonymousView.eLw + "@qqim");
              paramAnonymousAdapterView.bWF.bWI = paramAnonymousView.getDisplayName();
              com.tencent.mm.sdk.b.a.sFg.m(paramAnonymousAdapterView);
            } while (!paramAnonymousAdapterView.bWG.bJm);
            paramAnonymousAdapterView = new Intent();
            paramAnonymousAdapterView.putExtra("Chat_User", paramAnonymousView.eLw + "@qqim");
            paramAnonymousAdapterView.putExtra("key_need_send_video", false);
            com.tencent.mm.plugin.account.a.a.ezn.e(paramAnonymousAdapterView, QQFriendUI.this);
            return;
            Object localObject1;
            Object localObject2;
            if ((paramAnonymousView.eLx == 1) || (paramAnonymousView.eLx == 2))
            {
              localObject1 = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg(paramAnonymousView.getUsername());
              if ((localObject1 != null) && (((ab)localObject1).ckW())) {
                com.tencent.mm.plugin.report.service.h.mEJ.k(10298, paramAnonymousView.getUsername() + ",12");
              }
              localObject1 = new Intent();
              ((Intent)localObject1).putExtra("Contact_User", paramAnonymousView.getUsername());
              ((Intent)localObject1).putExtra("Contact_Nick", paramAnonymousView.wO());
              ((Intent)localObject1).putExtra("Contact_Uin", paramAnonymousView.eLw);
              ((Intent)localObject1).putExtra("Contact_QQNick", paramAnonymousView.getDisplayName());
              ((Intent)localObject1).putExtra("Contact_Scene", 12);
              ((Intent)localObject1).putExtra("Contact_RemarkName", paramAnonymousView.XZ());
              localObject2 = (k)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getFrdExtStg();
              String str = paramAnonymousView.getUsername();
              str = "select friend_ext.username,friend_ext.sex,friend_ext.personalcard,friend_ext.province,friend_ext.city,friend_ext.signature from friend_ext   where friend_ext.username = \"" + bi.oU(str) + "\"";
              localObject2 = ((k)localObject2).dCZ.b(str, null, 2);
              if (localObject2 == null)
              {
                label461:
                if (paramAnonymousAdapterView != null) {
                  ((Intent)localObject1).putExtra("Contact_Sex", paramAnonymousAdapterView.sex);
                }
                ((Intent)localObject1).putExtra("Contact_ShowUserName", false);
                if (bi.oW(paramAnonymousView.getUsername())) {
                  x.e("MicroMsg.QQFriendUI", "username is null. can't start contact ui. friend is:%s", new Object[] { paramAnonymousView.toString() });
                }
              }
              else
              {
                if (!((Cursor)localObject2).moveToFirst()) {
                  break label744;
                }
                paramAnonymousAdapterView = new j();
                paramAnonymousAdapterView.username = ((Cursor)localObject2).getString(0);
                paramAnonymousAdapterView.sex = ((Cursor)localObject2).getInt(1);
                paramAnonymousAdapterView.csJ = ((Cursor)localObject2).getInt(2);
                paramAnonymousAdapterView.csK = ((Cursor)localObject2).getString(3);
                paramAnonymousAdapterView.csL = ((Cursor)localObject2).getString(4);
                paramAnonymousAdapterView.signature = ((Cursor)localObject2).getString(5);
              }
            }
            for (;;)
            {
              ((Cursor)localObject2).close();
              break label461;
              com.tencent.mm.plugin.account.a.a.ezn.d((Intent)localObject1, QQFriendUI.this);
              return;
              if (paramAnonymousView.eLx != 0) {
                break;
              }
              paramAnonymousAdapterView = new Intent(QQFriendUI.this, InviteFriendUI.class);
              paramAnonymousAdapterView.putExtra("friend_type", 0);
              paramAnonymousAdapterView.putExtra("friend_user_name", paramAnonymousView.getUsername());
              paramAnonymousAdapterView.putExtra("friend_num", paramAnonymousView.eLw);
              paramAnonymousAdapterView.putExtra("friend_nick", paramAnonymousView.getDisplayName());
              paramAnonymousAdapterView.putExtra("friend_weixin_nick", paramAnonymousView.wO());
              paramAnonymousAdapterView.putExtra("friend_scene", 12);
              QQFriendUI.this.startActivity(paramAnonymousAdapterView);
              return;
              label744:
              paramAnonymousAdapterView = null;
            }
          }
        });
        ((ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).a(this.eMR);
        setBackBtn(new QQFriendUI.5(this));
        new QQFriendUI.6(this);
        return;
        if (!str.equals("1")) {
          break label252;
        }
        i = 1;
        break;
      }
      label252:
      i = 1;
      break;
      i = 1;
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    x.d("MicroMsg.QQFriendUI", "onConfigurationChanged: orientation = " + paramConfiguration.orientation);
    super.onConfigurationChanged(paramConfiguration);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.DF().a(143, this);
    paramBundle = getIntent().getStringExtra("qqgroup_name");
    this.GG = getIntent().getIntExtra("qqgroup_id", -1);
    Object localObject1 = (ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg();
    int i = this.GG;
    x.d("MicroMsg.QQListStorage", "delete: GroupID:" + i);
    Object localObject2 = "update qqlist set reserved4=0 where groupid=" + i;
    ((ap)localObject1).dCZ.fV("qqlist", (String)localObject2);
    if (com.tencent.mm.plugin.account.friend.a.l.je(this.GG))
    {
      localObject1 = new ac(this.GG);
      com.tencent.mm.kernel.g.DF().a((com.tencent.mm.ab.l)localObject1, 0);
      localObject2 = this.mController.tml;
      getString(a.j.app_tip);
      this.eHw = com.tencent.mm.ui.base.h.a((Context)localObject2, getString(a.j.qq_friend_loading), true, new QQFriendUI.1(this, (ac)localObject1));
    }
    setMMTitle(paramBundle);
    initView();
  }
  
  public void onDestroy()
  {
    com.tencent.mm.model.a.f.iU("2");
    ((ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).b(this.eMR);
    com.tencent.mm.kernel.g.DF().b(143, this);
    this.eMR.aYc();
    q.KJ().cancel();
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    x.v("MicroMsg.QQFriendUI", "qq friend onKeyDown");
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    q.Kp().e(this.eMR);
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    q.Kp().d(this.eMR);
    this.eMR.notifyDataSetChanged();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/account/friend/ui/QQFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */