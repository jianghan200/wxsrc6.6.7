package com.tencent.mm.plugin.setting.ui.setting;

import android.os.Bundle;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class SettingsHideUsernameUI
  extends MMPreference
{
  private f eOE;
  private boolean gju;
  private long hXx;
  private int mRK;
  private CheckBoxPreference mSl;
  private String username;
  
  private void btH()
  {
    if (this.gju)
    {
      this.mSl.setSummary(getString(a.i.settings_show_username_open_hint));
      return;
    }
    if (this.mSl.isEnabled())
    {
      this.mSl.setSummary(getString(a.i.settings_show_username_close_hint));
      return;
    }
    this.mSl.setSummary(getString(a.i.settings_show_username_disable_hint));
  }
  
  public final int Ys()
  {
    return a.k.settings_hide_username;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool = false;
    if (paramPreference.mKey.equals("settings_show_username"))
    {
      if (!((CheckBoxPreference)paramPreference).isChecked()) {
        bool = true;
      }
      this.gju = bool;
      btH();
      return true;
    }
    return false;
  }
  
  protected final void initView()
  {
    boolean bool2 = true;
    setMMTitle(a.i.settings_username);
    this.eOE.ZZ("settings_my_username").setSummary(this.username);
    CheckBoxPreference localCheckBoxPreference;
    if ((this.hXx & 0x4000) != 0L)
    {
      bool1 = true;
      this.gju = bool1;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsHideUsernameUI", "is hide: %s", new Object[] { Boolean.valueOf(bool1) });
      this.mSl = ((CheckBoxPreference)this.eOE.ZZ("settings_show_username"));
      this.mSl.tDr = false;
      localCheckBoxPreference = this.mSl;
      if (bool1) {
        break label139;
      }
    }
    label139:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localCheckBoxPreference.qpJ = bool1;
      if (bi.oW(q.GH())) {
        this.mSl.setEnabled(false);
      }
      this.eOE.notifyDataSetChanged();
      return;
      bool1 = false;
      break;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.username = q.GG();
    if (bi.oW(this.username)) {
      this.username = q.GF();
    }
    this.eOE = this.tCL;
    this.hXx = q.GK();
    this.mRK = q.GL();
    initView();
    setBackBtn(new SettingsHideUsernameUI.1(this));
  }
  
  protected void onPause()
  {
    int j = 0;
    int i = 1;
    super.onPause();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsHideUsernameUI", "hide: %s", new Object[] { Boolean.valueOf(this.gju) });
    if ((this.hXx & 0x4000) != 0L) {
      j = 1;
    }
    if (j != this.gju)
    {
      if (!this.gju) {
        break label184;
      }
      this.hXx |= 0x4000;
    }
    for (this.mRK |= 0x200;; this.mRK &= 0xFDFF)
    {
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().DT().set(147457, Long.valueOf(this.hXx));
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().DT().set(40, Integer.valueOf(this.mRK));
      xt localxt = new xt();
      localxt.rDz = 46;
      if (this.gju) {
        i = 2;
      }
      localxt.rDA = i;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(23, localxt));
      return;
      label184:
      this.hXx &= 0xFFFFFFFFFFFFBFFF;
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    btH();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsHideUsernameUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */