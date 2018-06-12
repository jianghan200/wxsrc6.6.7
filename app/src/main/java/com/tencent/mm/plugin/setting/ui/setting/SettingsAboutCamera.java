package com.tencent.mm.plugin.setting.ui.setting;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class SettingsAboutCamera
  extends MMPreference
{
  private f eOE;
  
  public final int Ys()
  {
    return a.k.settings_pref_camera;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool2 = true;
    paramf = paramPreference.mKey;
    aa.a locala;
    if (paramf.equals("settings_auto_mul_terminal_sync"))
    {
      bool1 = ((Boolean)g.Ei().DT().get(aa.a.sVp, Boolean.valueOf(true))).booleanValue();
      paramPreference = g.Ei().DT();
      locala = aa.a.sVp;
      if (!bool1)
      {
        bool1 = true;
        paramPreference.a(locala, Boolean.valueOf(bool1));
      }
    }
    else
    {
      if (paramf.equals("settings_take_photo_auto_save_photo"))
      {
        bool1 = ((Boolean)g.Ei().DT().get(aa.a.sVr, Boolean.valueOf(true))).booleanValue();
        paramPreference = g.Ei().DT();
        locala = aa.a.sVr;
        if (bool1) {
          break label194;
        }
        bool1 = true;
        label118:
        paramPreference.a(locala, Boolean.valueOf(bool1));
      }
      if (paramf.equals("settings_take_photo_auto_save_video"))
      {
        bool1 = ((Boolean)g.Ei().DT().get(aa.a.sVs, Boolean.valueOf(true))).booleanValue();
        paramf = g.Ei().DT();
        paramPreference = aa.a.sVs;
        if (bool1) {
          break label199;
        }
      }
    }
    label194:
    label199:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      paramf.a(paramPreference, Boolean.valueOf(bool1));
      return false;
      bool1 = false;
      break;
      bool1 = false;
      break label118;
    }
  }
  
  protected final void initView()
  {
    this.eOE = this.tCL;
    setMMTitle(a.i.settings_photo_video);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        SettingsAboutCamera.this.YC();
        SettingsAboutCamera.this.finish();
        return true;
      }
    });
    boolean bool = ((Boolean)g.Ei().DT().get(aa.a.sVp, Boolean.valueOf(true))).booleanValue();
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.eOE.ZZ("settings_auto_mul_terminal_sync");
    localCheckBoxPreference.tDr = false;
    localCheckBoxPreference.qpJ = bool;
    bool = ((Boolean)g.Ei().DT().get(aa.a.sVr, Boolean.valueOf(true))).booleanValue();
    localCheckBoxPreference = (CheckBoxPreference)this.eOE.ZZ("settings_take_photo_auto_save_photo");
    localCheckBoxPreference.tDr = false;
    localCheckBoxPreference.qpJ = bool;
    bool = ((Boolean)g.Ei().DT().get(aa.a.sVs, Boolean.valueOf(true))).booleanValue();
    localCheckBoxPreference = (CheckBoxPreference)this.eOE.ZZ("settings_take_photo_auto_save_video");
    localCheckBoxPreference.qpJ = bool;
    localCheckBoxPreference.tDr = false;
    this.eOE.notifyDataSetChanged();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsAboutCamera.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */