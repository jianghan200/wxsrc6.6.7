package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;

public class SettingRedesign
  extends MMPreference
{
  private f eOE;
  private boolean mQO;
  
  private void refresh()
  {
    if (this.mQO != ad.getContext().getSharedPreferences(ad.chY() + "_redesign", 4).getBoolean("dark_actionbar", false))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("Intro_Need_Clear_Top ", true);
      b.ezn.q(localIntent, this.mController.tml);
    }
  }
  
  public final int Ys()
  {
    return a.k.setting_redesign;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if (paramPreference.mKey.equals("redesign_actionbar"))
    {
      if (((CheckBoxPreference)paramPreference).isChecked()) {
        ad.getContext().getSharedPreferences(ad.chY() + "_redesign", 4).edit().putBoolean("dark_actionbar", false).commit();
      }
    }
    else {
      return false;
    }
    ad.getContext().getSharedPreferences(ad.chY() + "_redesign", 4).edit().putBoolean("dark_actionbar", true).commit();
    return false;
  }
  
  public final void initView()
  {
    boolean bool = false;
    setMMTitle("Redesign");
    this.eOE = this.tCL;
    this.mQO = ad.getContext().getSharedPreferences(ad.chY() + "_redesign", 4).getBoolean("dark_actionbar", false);
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.eOE.ZZ("redesign_actionbar");
    if (localCheckBoxPreference != null)
    {
      if (!this.mQO) {
        bool = true;
      }
      localCheckBoxPreference.qpJ = bool;
    }
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        SettingRedesign.this.finish();
        SettingRedesign.a(SettingRedesign.this);
        return true;
      }
    });
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0))
    {
      finish();
      refresh();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingRedesign.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */