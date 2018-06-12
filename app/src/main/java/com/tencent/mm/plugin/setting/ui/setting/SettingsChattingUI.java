package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.bg.d;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;

public class SettingsChattingUI
  extends MMPreference
{
  private f eOE;
  private boolean isDeleteCancel = false;
  private ProgressDialog mQY = null;
  
  public final int Ys()
  {
    return a.k.settings_pref_chatting;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool2 = false;
    boolean bool1 = true;
    paramf = paramPreference.mKey;
    int i = -1;
    switch (paramf.hashCode())
    {
    default: 
      switch (i)
      {
      default: 
        bool1 = false;
      }
      break;
    }
    do
    {
      return bool1;
      if (!paramf.equals("settings_voice_play_mode")) {
        break;
      }
      i = 0;
      break;
      if (!paramf.equals("settings_enter_button_send")) {
        break;
      }
      i = 1;
      break;
      if (!paramf.equals("settings_bak_chat")) {
        break;
      }
      i = 2;
      break;
      if (!paramf.equals("settings_chatting_bg")) {
        break;
      }
      i = 3;
      break;
      if (!paramf.equals("settings_emoji_manager")) {
        break;
      }
      i = 4;
      break;
      if (!paramf.equals("settings_reset")) {
        break;
      }
      i = 5;
      break;
      if (!paramf.equals("settings_recovery")) {
        break;
      }
      i = 6;
      break;
      boolean bool3 = ((Boolean)g.Ei().DT().get(26, Boolean.valueOf(false))).booleanValue();
      if (!bool3) {}
      for (bool1 = true;; bool1 = false)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsChattingUI", "set voice mode from %B to %B", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool1) });
        paramf = g.Ei().DT();
        bool1 = bool2;
        if (!bool3) {
          bool1 = true;
        }
        paramf.set(26, Boolean.valueOf(bool1));
        return true;
      }
      paramf = (CheckBoxPreference)this.eOE.ZZ("settings_enter_button_send");
    } while (paramf == null);
    bool1 = paramf.isChecked();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsChattingUI", "set enter button send : %s", new Object[] { Boolean.valueOf(bool1) });
    g.Ei().DT().set(66832, Boolean.valueOf(bool1));
    return true;
    paramf = new Intent().setClassName(this.mController.tml, "com.tencent.mm.plugin.backup.backupmoveui.BackupUI");
    MMWizardActivity.D(this.mController.tml, paramf);
    return true;
    paramf = new Intent();
    paramf.setClass(this, SettingsChattingBackgroundUI.class);
    this.mController.tml.startActivity(paramf);
    return true;
    paramf = new Intent();
    paramf.putExtra("10931", 2);
    d.b(this.mController.tml, "emoji", ".ui.EmojiMineUI", paramf);
    return true;
    h.a(this.mController.tml, getResources().getString(a.i.settings_reset_warning), "", getString(a.i.app_clear), getString(a.i.app_cancel), new SettingsChattingUI.2(this), null);
    return true;
    paramf = new Intent().setClassName(this.mController.tml, "com.tencent.mm.plugin.dbbackup.DBRecoveryUI");
    paramf.putExtra("scene", 1);
    this.mController.tml.startActivity(paramf);
    return true;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_chatting);
    this.eOE = this.tCL;
    if (g.Ei().DT().getInt(89, 0) != 2) {
      this.eOE.aaa("settings_recovery");
    }
    setBackBtn(new SettingsChattingUI.1(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!g.Eg().Dx())
    {
      finish();
      return;
    }
    initView();
  }
  
  protected void onResume()
  {
    super.onResume();
    Object localObject = (CheckBoxPreference)this.eOE.ZZ("settings_voice_play_mode");
    if (localObject != null)
    {
      ((CheckBoxPreference)localObject).qpJ = ((Boolean)g.Ei().DT().get(26, Boolean.valueOf(false))).booleanValue();
      ((Preference)localObject).tDr = false;
    }
    localObject = (CheckBoxPreference)this.eOE.ZZ("settings_enter_button_send");
    if (localObject != null)
    {
      ((CheckBoxPreference)localObject).qpJ = ((Boolean)g.Ei().DT().get(66832, Boolean.valueOf(false))).booleanValue();
      ((Preference)localObject).tDr = false;
    }
    localObject = this.eOE.ZZ("settings_text_size");
    if (localObject != null) {
      ((Preference)localObject).setSummary(getString(SetTextSizeUI.ed(this)));
    }
    this.eOE.notifyDataSetChanged();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */