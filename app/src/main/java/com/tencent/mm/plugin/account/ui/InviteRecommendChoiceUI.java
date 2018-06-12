package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.a.k;
import com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class InviteRecommendChoiceUI
  extends MMPreference
{
  private f eOE;
  
  public final int Ys()
  {
    return a.k.invite_recommend_friend;
  }
  
  protected final boolean Yy()
  {
    return false;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    if (paramf.equals("settings_invite_qq_friends"))
    {
      paramf = new Intent(this, RecommendFriendUI.class);
      paramf.putExtra("recommend_type", Integer.toString(0));
      startActivity(paramf);
    }
    do
    {
      return false;
      if (paramf.equals("settings_recommend_by_mail"))
      {
        paramf = new Intent(this, RecommendFriendUI.class);
        paramf.putExtra("recommend_type", Integer.toString(2));
        startActivity(paramf);
        return false;
      }
      if (paramf.equals("settings_recommend_by_mb"))
      {
        paramf = new Intent(this, RecommendFriendUI.class);
        paramf.putExtra("recommend_type", Integer.toString(1));
        startActivity(paramf);
        return false;
      }
      if (paramf.equals("settings_invite_mobile_friends"))
      {
        paramf = new Intent("android.intent.action.VIEW");
        paramf.putExtra("sms_body", getString(a.j.invite_sms, new Object[] { g.Ei().DT().get(2, null) }));
        paramf.setType("vnd.android-dir/mms-sms");
        if (bi.k(this, paramf))
        {
          startActivity(paramf);
          return false;
        }
        Toast.makeText(this, a.j.selectsmsapp_none, 1).show();
        return false;
      }
    } while (!paramf.equals("settings_invite_facebook_friends"));
    startActivity(new Intent(this, InviteFacebookFriendsUI.class));
    return false;
  }
  
  protected final void initView()
  {
    setMMTitle(a.j.send_card_to_microblog);
    this.eOE = this.tCL;
    IconPreference localIconPreference = (IconPreference)this.eOE.ZZ("settings_invite_facebook_friends");
    this.eOE.c(localIconPreference);
    localIconPreference = (IconPreference)this.eOE.ZZ("settings_invite_qq_friends");
    if (q.GE() == 0) {
      this.eOE.c(localIconPreference);
    }
    localIconPreference = (IconPreference)this.eOE.ZZ("settings_recommend_by_mail");
    if (q.GE() == 0) {
      this.eOE.c(localIconPreference);
    }
    localIconPreference = (IconPreference)this.eOE.ZZ("settings_recommend_by_mb");
    if (((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FZ().Hg("@t.qq.com") == null) {
      this.eOE.c(localIconPreference);
    }
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        InviteRecommendChoiceUI.this.YC();
        InviteRecommendChoiceUI.this.finish();
        return true;
      }
    });
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */