package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.model.UserAuthItemParcelable;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.Iterator;
import java.util.List;

public class SettingsModifyUserAuthUI
  extends MMPreference
  implements e
{
  private String appId;
  private p eXe;
  private com.tencent.mm.ui.base.preference.h mSX;
  private int scene;
  
  public final int Ys()
  {
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    boolean bool = true;
    x.i("MicroMsg.SettingsModifyUserAuthUI", "errCode %d, errMsg %s", new Object[] { Integer.valueOf(paramInt2), paramString });
    if (this.eXe != null) {
      this.eXe.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((com.tencent.mm.plugin.setting.model.h)paraml).mOL;
      paramInt1 = ((com.tencent.mm.plugin.setting.model.h)paraml).mOM;
      if (!bi.oW(paramString))
      {
        paramString = (CheckBoxPreference)this.mSX.ZZ(paramString);
        if (paramInt1 != 1) {
          break label96;
        }
      }
      for (;;)
      {
        paramString.qpJ = bool;
        return;
        label96:
        bool = false;
      }
    }
    com.tencent.mm.ui.base.h.bA(this, paramString);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if (((CheckBoxPreference)paramPreference).isChecked()) {}
    for (int i = 1;; i = 2)
    {
      paramf = new com.tencent.mm.plugin.setting.model.h(this.appId, paramPreference.mKey, i, this.scene);
      g.DF().a(paramf, 0);
      this.eXe = com.tencent.mm.ui.base.h.a(this, getString(a.i.app_sending), true, new SettingsModifyUserAuthUI.2(this, paramf));
      return true;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mSX = ((com.tencent.mm.ui.base.preference.h)this.tCL);
    paramBundle = getIntent().getParcelableArrayListExtra("app_auth_items");
    this.appId = getIntent().getStringExtra("app_id");
    this.scene = getIntent().getIntExtra("modify_scene", 1);
    if ((paramBundle != null) && (!paramBundle.isEmpty()))
    {
      paramBundle = paramBundle.iterator();
      if (paramBundle.hasNext())
      {
        UserAuthItemParcelable localUserAuthItemParcelable = (UserAuthItemParcelable)paramBundle.next();
        CheckBoxPreference localCheckBoxPreference = new CheckBoxPreference(this);
        localCheckBoxPreference.setTitle(localUserAuthItemParcelable.mPl);
        if (localUserAuthItemParcelable.scope.equals("snsapi_friend")) {
          localCheckBoxPreference.setSummary(a.i.settings_auth_close_friend_tip);
        }
        localCheckBoxPreference.setKey(localUserAuthItemParcelable.scope);
        if (localUserAuthItemParcelable.state == 1) {}
        for (boolean bool = true;; bool = false)
        {
          localCheckBoxPreference.qpJ = bool;
          localCheckBoxPreference.tDr = false;
          this.mSX.a(localCheckBoxPreference, -1);
          break;
        }
      }
    }
    setMMTitle(getIntent().getStringExtra("app_name"));
    setBackBtn(new SettingsModifyUserAuthUI.1(this));
  }
  
  protected void onPause()
  {
    super.onPause();
    g.DF().b(1144, this);
  }
  
  protected void onResume()
  {
    super.onResume();
    g.DF().a(1144, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsModifyUserAuthUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */