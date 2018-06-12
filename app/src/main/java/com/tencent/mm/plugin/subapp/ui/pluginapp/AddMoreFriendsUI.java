package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View.OnClickListener;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.p.a;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.plugin.account.bind.ui.MobileFriendUI;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.websearch.api.i;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceInfoCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.e.i;
import com.tencent.mm.ui.s;
import java.util.Map;

public class AddMoreFriendsUI
  extends MMPreference
{
  private f eOE;
  private final int otl = 4;
  private final int otm = 9;
  
  public final int Ys()
  {
    return R.o.add_more_friends;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if ("find_friends_by_qrcode".equals(paramPreference.mKey))
    {
      paramf = new Intent();
      paramf.putExtra("BaseScanUI_select_scan_mode", 1);
      paramf.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
      paramf.setFlags(65536);
      h.mEJ.h(11265, new Object[] { Integer.valueOf(1) });
      if ((!a.bx(this)) && (!com.tencent.mm.ax.e.Sz())) {
        d.b(this, "scanner", ".ui.BaseScanUI", paramf);
      }
      return true;
    }
    if ("find_friends_by_other_way".equals(paramPreference.mKey))
    {
      if (l.XC() != l.a.eKt)
      {
        paramf = new Intent(this, BindMContactIntroUI.class);
        paramf.putExtra("key_upload_scene", 6);
        MMWizardActivity.D(this, paramf);
        return true;
      }
      startActivity(new Intent(this, MobileFriendUI.class));
      return true;
    }
    if ("find_friends_by_web".equals(paramPreference.mKey))
    {
      if (p.zO(0))
      {
        ((i)com.tencent.mm.kernel.g.l(i.class)).a(ad.getContext(), new Runnable()
        {
          public final void run()
          {
            Intent localIntent = p.adR();
            localIntent.putExtra("KRightBtn", true);
            localIntent.putExtra("ftsneedkeyboard", true);
            localIntent.putExtra("key_load_js_without_delay", true);
            localIntent.putExtra("ftsType", 1);
            localIntent.putExtra("ftsbizscene", 9);
            Object localObject = p.b(9, true, 0);
            String str = p.zK(bi.WU((String)((Map)localObject).get("scene")));
            ((Map)localObject).put("sessionId", str);
            ((Map)localObject).put("subSessionId", str);
            localIntent.putExtra("sessionId", str);
            localIntent.putExtra("subSessionId", str);
            localIntent.putExtra("rawUrl", p.v((Map)localObject));
            localObject = null;
            if (Build.VERSION.SDK_INT >= 21) {
              localObject = ActivityOptions.makeSceneTransitionAnimation(AddMoreFriendsUI.this, new Pair[0]).toBundle();
            }
            d.a(AddMoreFriendsUI.this, "webview", ".ui.tools.fts.FTSSearchTabWebViewUI", localIntent, (Bundle)localObject);
          }
        });
        paramPreference.setEnabled(false);
      }
      for (;;)
      {
        return true;
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AddMoreFriendsUI", "fts h5 template not avail");
      }
    }
    if ("find_friends_by_radar".equals(paramPreference.mKey))
    {
      d.A(this, "radar", ".ui.RadarSearchUI");
      return true;
    }
    if ("find_friends_create_pwdgroup".equals(paramPreference.mKey))
    {
      h.mEJ.h(11140, new Object[] { Integer.valueOf(1) });
      d.A(this, "pwdgroup", ".ui.FacingCreateChatRoomAllInOneUI");
      return true;
    }
    if ("find_friends_by_invite".equals(paramPreference.mKey))
    {
      int i = getIntent().getIntExtra("invite_friend_scene", 4);
      h.mEJ.h(14034, new Object[] { Integer.valueOf(i) });
      paramf = new Intent(this, InviteFriendsBy3rdUI.class);
      paramf.putExtra("Invite_friends", i);
      startActivity(paramf);
      return true;
    }
    return false;
  }
  
  public final int getForceOrientation()
  {
    return 1;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.add_more_friends_title);
    this.eOE = this.tCL;
    AddFriendItemPreference localAddFriendItemPreference = new AddFriendItemPreference(this.mController.tml);
    localAddFriendItemPreference.setKey("find_friends_by_invite");
    localAddFriendItemPreference.setTitle(R.l.find_friends_by_invite_friend);
    int i = R.k.addfriend_icon_invite;
    localAddFriendItemPreference.Hu = i;
    Drawable localDrawable = localAddFriendItemPreference.mContext.getResources().getDrawable(i);
    if (((localDrawable == null) && (localAddFriendItemPreference.hh != null)) || ((localDrawable != null) && (localAddFriendItemPreference.hh != localDrawable)))
    {
      localAddFriendItemPreference.hh = localDrawable;
      localAddFriendItemPreference.notifyChanged();
    }
    localAddFriendItemPreference.setSummary(R.l.find_friends_by_invite_friend_summary);
    if ((bi.getInt(com.tencent.mm.k.g.AT().getValue("InviteFriendsControlFlags"), 0) & 0x4) > 0) {
      this.eOE.a(localAddFriendItemPreference, 4);
    }
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AddMoreFriendsUI.this.finish();
        return true;
      }
    });
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    Object localObject;
    PreferenceInfoCategory localPreferenceInfoCategory;
    String str2;
    if (!d.QS("brandservice"))
    {
      this.eOE.bw("find_friends_by_web", true);
      this.eOE.notifyDataSetChanged();
      localObject = (AddFriendSearchPreference)this.eOE.ZZ("find_friends_by_input");
      ((AddFriendSearchPreference)localObject).otd = getString(R.l.contact_search_account_hint);
      ((AddFriendSearchPreference)localObject).otf = new AddMoreFriendsUI.3(this);
      localPreferenceInfoCategory = (PreferenceInfoCategory)this.eOE.ZZ("find_friends_info");
      localObject = q.GF();
      String str1 = q.GG();
      au.HU();
      str2 = ap.Ww((String)c.DT().get(6, null));
      if (bi.oW(str1)) {
        break label277;
      }
      localObject = getString(R.l.find_friends_my_account, new Object[] { str1 });
    }
    for (;;)
    {
      localPreferenceInfoCategory.setTitle((CharSequence)localObject);
      localPreferenceInfoCategory.tgI = R.g.info_qr_code;
      localObject = new AddMoreFriendsUI.4(this);
      localPreferenceInfoCategory.tDA = ((View.OnClickListener)localObject);
      localPreferenceInfoCategory.tDB = ((View.OnClickListener)localObject);
      ((AddFriendItemPreference)this.eOE.ZZ("find_friends_create_pwdgroup")).mQk = 8;
      localObject = new Intent();
      ((Intent)localObject).setComponent(new ComponentName(e.i.thA, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
      ((Intent)localObject).putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
      sendBroadcast((Intent)localObject);
      if (this.tCL != null)
      {
        localObject = this.tCL.ZZ("find_friends_by_web");
        if (localObject != null) {
          ((Preference)localObject).setEnabled(true);
        }
      }
      return;
      this.eOE.bw("find_friends_by_web", false);
      break;
      label277:
      if (!ab.XT((String)localObject)) {
        localObject = getString(R.l.find_friends_my_account, new Object[] { localObject });
      } else if (!bi.oW(str2)) {
        localObject = getString(R.l.find_friends_my_mobile, new Object[] { ap.Wv(str2) });
      } else {
        localObject = getString(R.l.find_friends_my_qrcode);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */