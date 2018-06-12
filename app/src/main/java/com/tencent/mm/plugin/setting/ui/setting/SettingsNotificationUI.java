package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.bk.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.as;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.setting.a.c;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class SettingsNotificationUI
  extends MMPreference
{
  private HashMap<Integer, Integer> eGU = new HashMap();
  private com.tencent.mm.ui.base.preference.f eOE;
  private int status;
  
  private void btQ()
  {
    Preference localPreference = this.eOE.ZZ("settings_notification_ringtone");
    if (localPreference != null) {
      localPreference.setSummary(this.duR.getString("settings.ringtone.name", getString(a.i.settings_notification_ringtone_sys)));
    }
    this.eOE.notifyDataSetChanged();
  }
  
  private boolean hB(boolean paramBoolean)
  {
    Preference localPreference1 = this.eOE.ZZ("settings_sound");
    Preference localPreference2 = this.eOE.ZZ("settings_shake");
    Preference localPreference3 = this.eOE.ZZ("settings_show_detail");
    if (localPreference1 != null) {
      localPreference1.setEnabled(paramBoolean);
    }
    if (localPreference2 != null) {
      localPreference2.setEnabled(paramBoolean);
    }
    if (localPreference3 != null) {
      localPreference3.setEnabled(paramBoolean);
    }
    return true;
  }
  
  public final int Ys()
  {
    return a.k.settings_pref_notification;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    if (paramf.equals("settings_new_msg_notification"))
    {
      com.tencent.mm.k.f.bg(((CheckBoxPreference)paramPreference).isChecked());
      initView();
      if (((CheckBoxPreference)paramPreference).isChecked()) {
        com.tencent.mm.plugin.report.service.h.mEJ.a(500L, 0L, 1L, false);
      }
      for (;;)
      {
        hB(((CheckBoxPreference)paramPreference).isChecked());
        as.j(true, false);
        return true;
        com.tencent.mm.plugin.report.service.h.mEJ.a(500L, 1L, 1L, false);
      }
    }
    if (paramf.equals("settings_new_voip_msg_notification"))
    {
      if (!((CheckBoxPreference)paramPreference).isChecked()) {
        com.tencent.mm.ui.base.h.a(this.mController.tml, false, this.mController.tml.getString(a.i.settings_new_voip_msg_close_tips), "", this.mController.tml.getString(a.i.settings_new_voip_msg_close_confirm), this.mController.tml.getString(a.i.settings_logout_option_cancel), new SettingsNotificationUI.2(this), new SettingsNotificationUI.3(this), a.c.alert_btn_color_warn, 0);
      }
      for (;;)
      {
        initView();
        return true;
        com.tencent.mm.k.f.bh(true);
        com.tencent.mm.plugin.report.service.h.mEJ.a(500L, 2L, 1L, false);
        as.j(false, true);
      }
    }
    boolean bool;
    if (paramf.equals("settings_voip_notification_sound"))
    {
      bool = ((CheckBoxPreference)paramPreference).isChecked();
      com.tencent.mm.kernel.g.Ei().DT().set(73217, Boolean.valueOf(bool));
      com.tencent.mm.kernel.g.Ei().DT().set(73218, Boolean.valueOf(bool));
      paramf = com.tencent.mm.plugin.report.service.h.mEJ;
      if (bool) {}
      for (long l = 8L;; l = 9L)
      {
        paramf.a(500L, l, 1L, false);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsNotificationUI", "void sound checkbox %b", new Object[] { Boolean.valueOf(bool) });
        return true;
      }
    }
    if (paramf.equals("settings_sound"))
    {
      com.tencent.mm.k.f.bk(((CheckBoxPreference)paramPreference).isChecked());
      initView();
      if (((CheckBoxPreference)paramPreference).isChecked()) {
        com.tencent.mm.plugin.report.service.h.mEJ.a(500L, 10L, 1L, false);
      }
      for (;;)
      {
        return true;
        com.tencent.mm.plugin.report.service.h.mEJ.a(500L, 11L, 1L, false);
      }
    }
    if (paramf.equals("settings_shake"))
    {
      com.tencent.mm.k.f.bl(((CheckBoxPreference)paramPreference).isChecked());
      if (((CheckBoxPreference)paramPreference).isChecked()) {
        com.tencent.mm.plugin.report.service.h.mEJ.a(500L, 16L, 1L, false);
      }
      for (;;)
      {
        bi.t(this, ((CheckBoxPreference)paramPreference).isChecked());
        return true;
        com.tencent.mm.plugin.report.service.h.mEJ.a(500L, 17L, 1L, false);
      }
    }
    label528:
    int i;
    if (paramf.equals("settings_show_detail"))
    {
      bool = ((CheckBoxPreference)paramPreference).isChecked();
      com.tencent.mm.k.f.bi(bool);
      if (!bool)
      {
        bool = true;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsNotificationUI", "switch change : open = " + bool + " item value = 2048 functionId = 10");
        if (!bool) {
          break label560;
        }
        this.status |= 0x800;
        if (!bool) {
          break label575;
        }
      }
      label560:
      label575:
      for (i = 1;; i = 2)
      {
        this.eGU.put(Integer.valueOf(10), Integer.valueOf(i));
        return true;
        bool = false;
        break;
        this.status &= 0xF7FF;
        break label528;
      }
    }
    if (paramf.equals("settings_notification_ringtone"))
    {
      startActivity(new Intent(this.mController.tml, SettingsRingtoneUI.class));
      return true;
    }
    if (paramf.equals("settings_active_time"))
    {
      startActivity(new Intent(this, SettingsActiveTimeUI.class));
      return true;
    }
    int j;
    int k;
    if (paramf.equals("settings_plugings_notify"))
    {
      paramf = new LinkedList();
      paramf.add(getString(a.i.settings_plugings_disturb_on));
      paramf.add(getString(a.i.settings_plugings_disturb_on_night));
      paramf.add(getString(a.i.settings_plugings_disturb_off));
      paramPreference = Boolean.valueOf(q.Hb());
      j = q.Hj();
      k = q.Hk();
      if (!paramPreference.booleanValue()) {
        break label833;
      }
      if (j != k) {
        break label828;
      }
      i = 0;
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsNotificationUI", paramPreference + "st " + j + " ed " + k + "  state " + i);
      paramPreference = this.mController.tml;
      String str = getString(a.i.settings_plugings_disturb_title);
      getString(a.i.settings_plugings_disturb_time_tip);
      com.tencent.mm.ui.base.h.a(paramPreference, str, paramf, i, new SettingsNotificationUI.4(this, i));
      return false;
      label828:
      i = 1;
      continue;
      label833:
      i = 2;
    }
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_notification);
    this.eOE = this.tCL;
    this.eOE.removeAll();
    this.eOE.addPreferencesFromResource(a.k.settings_pref_notification);
    CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)this.eOE.ZZ("settings_new_msg_notification");
    if (com.tencent.mm.k.f.Aj()) {
      localCheckBoxPreference1.qpJ = true;
    }
    hB(localCheckBoxPreference1.isChecked());
    CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)this.eOE.ZZ("settings_new_voip_msg_notification");
    if (com.tencent.mm.k.f.Ak()) {
      localCheckBoxPreference2.qpJ = true;
    }
    if (localCheckBoxPreference1.isChecked())
    {
      localCheckBoxPreference1 = (CheckBoxPreference)this.eOE.ZZ("settings_sound");
      if (com.tencent.mm.k.f.Am())
      {
        localCheckBoxPreference1.qpJ = true;
        btQ();
        localCheckBoxPreference1 = (CheckBoxPreference)this.eOE.ZZ("settings_shake");
        if (com.tencent.mm.k.f.Ao()) {
          localCheckBoxPreference1.qpJ = true;
        }
        localCheckBoxPreference1 = (CheckBoxPreference)this.eOE.ZZ("settings_show_detail");
        if (com.tencent.mm.k.f.Al()) {
          localCheckBoxPreference1.qpJ = true;
        }
      }
    }
    for (;;)
    {
      setBackBtn(new SettingsNotificationUI.1(this));
      return;
      this.eOE.aaa("settings_notification_ringtone");
      break;
      this.eOE.aaa("settings_show_detail");
      this.eOE.aaa("settings_sound");
      this.eOE.aaa("settings_notification_ringtone");
      this.eOE.aaa("settings_shake");
      this.eOE.aaa("settings_active_time");
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.status = q.GJ();
    initView();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    as.ha(3);
  }
  
  protected void onPause()
  {
    super.onPause();
    com.tencent.mm.kernel.g.Ei().DT().set(7, Integer.valueOf(this.status));
    Iterator localIterator = this.eGU.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      int i = ((Integer)((Map.Entry)localObject).getKey()).intValue();
      int j = ((Integer)((Map.Entry)localObject).getValue()).intValue();
      localObject = new xt();
      ((xt)localObject).rDz = i;
      ((xt)localObject).rDA = j;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(23, (a)localObject));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsNotificationUI", "switch  " + i + " " + j);
    }
    this.eGU.clear();
  }
  
  public void onResume()
  {
    super.onResume();
    btQ();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */