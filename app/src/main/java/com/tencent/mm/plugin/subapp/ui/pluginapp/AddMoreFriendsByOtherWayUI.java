package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI;
import com.tencent.mm.plugin.account.bind.ui.MobileFriendUI;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class AddMoreFriendsByOtherWayUI
  extends MMPreference
{
  private f eOE;
  
  public final int Ys()
  {
    return R.o.add_more_friends_by_other_way;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    int i = 0;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AddMoreFriendsByOthersUI", "click %s", new Object[] { paramPreference.mKey });
    if ("find_friends_by_mobile".equals(paramPreference.mKey))
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
    if ("find_friends_by_google_account".equals(paramPreference.mKey))
    {
      if (TextUtils.isEmpty((String)g.Ei().DT().get(208903, null))) {}
      while (i == 0)
      {
        paramf = new Intent(this, BindGoogleContactUI.class);
        paramf.putExtra("enter_scene", 1);
        MMWizardActivity.D(this, paramf);
        return true;
        i = 1;
      }
      paramf = new Intent(this, GoogleFriendUI.class);
      paramf.putExtra("enter_scene", 1);
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
    setBackBtn(new AddMoreFriendsByOtherWayUI.1(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onResume()
  {
    super.onResume();
    if ((IconPreference)this.eOE.ZZ("find_friends_by_google_account") != null) {
      if ((q.GQ() & 0x800000) != 0) {
        break label65;
      }
    }
    label65:
    for (int i = 1;; i = 0)
    {
      if ((i == 0) || (!bi.fU(this))) {
        this.eOE.aaa("find_friends_by_google_account");
      }
      this.eOE.notifyDataSetChanged();
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsByOtherWayUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */