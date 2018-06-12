package com.tencent.mm.plugin.setting.ui.setting;

import android.os.Bundle;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.model.k;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class SettingsPluginsNotifyUI
  extends MMPreference
{
  private f eOE;
  private int state;
  
  private void btS()
  {
    this.eOE.removeAll();
    Preference localPreference = new Preference(this);
    localPreference.setTitle(a.i.settings_plugings_disturb_on);
    localPreference.setKey("settings_plugings_disturb_on");
    localPreference.setLayoutResource(a.g.mm_preference);
    if (this.state == 0)
    {
      localPreference.setWidgetLayoutResource(a.g.mm_preference_radio_checked);
      this.eOE.a(localPreference);
      localPreference = new Preference(this);
      localPreference.setTitle(a.i.settings_plugings_disturb_on_night);
      localPreference.setKey("settings_plugings_disturb_on_night");
      localPreference.setLayoutResource(a.g.mm_preference);
      if (this.state != 1) {
        break label223;
      }
      localPreference.setWidgetLayoutResource(a.g.mm_preference_radio_checked);
      label106:
      this.eOE.a(localPreference);
      localPreference = new Preference(this);
      localPreference.setTitle(a.i.settings_plugings_disturb_off);
      localPreference.setKey("settings_plugings_disturb_off");
      localPreference.setLayoutResource(a.g.mm_preference);
      if (this.state != 2) {
        break label233;
      }
      localPreference.setWidgetLayoutResource(a.g.mm_preference_radio_checked);
    }
    for (;;)
    {
      this.eOE.a(localPreference);
      localPreference = new Preference(this);
      localPreference.setTitle(a.i.settings_plugings_disturb_time_tip);
      localPreference.setLayoutResource(a.g.mm_preference_info);
      this.eOE.a(localPreference);
      this.eOE.notifyDataSetChanged();
      return;
      localPreference.setWidgetLayoutResource(a.g.mm_preference_radio_unchecked);
      break;
      label223:
      localPreference.setWidgetLayoutResource(a.g.mm_preference_radio_unchecked);
      break label106;
      label233:
      localPreference.setWidgetLayoutResource(a.g.mm_preference_radio_unchecked);
    }
  }
  
  private void vR(int paramInt)
  {
    this.state = paramInt;
    if ((this.state == 1) || (this.state == 0))
    {
      com.tencent.mm.kernel.g.Ei().DT().set(8200, Boolean.valueOf(true));
      if (this.state == 1)
      {
        com.tencent.mm.kernel.g.Ei().DT().set(8201, Integer.valueOf(22));
        com.tencent.mm.kernel.g.Ei().DT().set(8208, Integer.valueOf(8));
        ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new k(true, 22, 8));
      }
    }
    for (;;)
    {
      btS();
      return;
      com.tencent.mm.kernel.g.Ei().DT().set(8201, Integer.valueOf(0));
      com.tencent.mm.kernel.g.Ei().DT().set(8208, Integer.valueOf(0));
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new k(true, 0, 0));
      continue;
      com.tencent.mm.kernel.g.Ei().DT().set(8200, Boolean.valueOf(false));
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new k());
    }
  }
  
  public final int Ys()
  {
    return -1;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    if (paramf.equals("settings_plugings_disturb_on")) {
      vR(0);
    }
    if (paramf.equals("settings_plugings_disturb_on_night")) {
      vR(1);
    }
    if (paramf.equals("settings_plugings_disturb_off")) {
      vR(2);
    }
    return false;
  }
  
  protected final void initView()
  {
    Boolean localBoolean = Boolean.valueOf(q.Hb());
    int j = q.Hj();
    int k = q.Hk();
    int i;
    if (localBoolean.booleanValue()) {
      if (j == k) {
        i = 0;
      }
    }
    for (this.state = i;; this.state = 2)
    {
      com.tencent.mm.sdk.platformtools.x.d("ui.settings.SettingsPlugingsNotify", localBoolean + "st " + j + " ed " + k + "  state " + this.state);
      this.state = this.state;
      this.eOE = this.tCL;
      setMMTitle(a.i.settings_plugings_disturb_title);
      setBackBtn(new SettingsPluginsNotifyUI.1(this));
      return;
      i = 1;
      break;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onResume()
  {
    super.onResume();
    btS();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsPluginsNotifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */