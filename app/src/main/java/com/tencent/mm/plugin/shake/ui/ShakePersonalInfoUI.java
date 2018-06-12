package com.tencent.mm.plugin.shake.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.k.g;
import com.tencent.mm.model.au;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.shake.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class ShakePersonalInfoUI
  extends MMPreference
{
  private f eOE;
  
  public final int Ys()
  {
    return R.o.shake_settings_pref_personal_info;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    if ("shake_item_default_bgimg".equals(paramf))
    {
      au.HU();
      com.tencent.mm.model.c.DT().set(4110, Boolean.valueOf(true));
      h.bA(this, getResources().getString(R.l.shake_settings_laert_reset_bg_ok));
    }
    if ("shake_item_change_bgimg".equals(paramf)) {
      com.tencent.mm.pluginsdk.ui.tools.l.a(this, 1, null);
    }
    if ("shake_item_sound".equals(paramf))
    {
      au.HU();
      bool = bi.c((Boolean)com.tencent.mm.model.c.DT().get(4112, null));
      au.HU();
      paramPreference = com.tencent.mm.model.c.DT();
      if (bool) {
        break label247;
      }
    }
    label247:
    for (boolean bool = true;; bool = false)
    {
      paramPreference.set(4112, Boolean.valueOf(bool));
      if ("say_hi_list_shake_title".equals(paramf))
      {
        paramPreference = new Intent(this, ShakeSayHiListUI.class);
        paramPreference.putExtra("IntentSayHiType", 1);
        startActivity(paramPreference);
      }
      if ("shake_item_histoty_list".equals(paramf))
      {
        paramPreference = new Intent(this, ShakeItemListUI.class);
        paramPreference.putExtra("_key_show_type_", 100);
        paramPreference.putExtra("_key_title_", getString(R.l.shake_item_history_list));
        startActivity(paramPreference);
      }
      if ("shake_msg_list".equals(paramf))
      {
        paramf = new Intent(this, ShakeMsgListUI.class);
        paramf.putExtra("shake_msg_from", 2);
        paramf.putExtra("shake_msg_list_title", getString(R.l.shake_tv_msg_center_title));
        startActivity(paramf);
      }
      return false;
    }
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.shake_item_setting);
    this.eOE = this.tCL;
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.eOE.ZZ("shake_item_sound");
    au.HU();
    if (com.tencent.mm.model.c.DT().get(4112, null) == null)
    {
      au.HU();
      com.tencent.mm.model.c.DT().set(4112, Boolean.valueOf(true));
    }
    au.HU();
    localCheckBoxPreference.qpJ = bi.c((Boolean)com.tencent.mm.model.c.DT().get(4112, null));
    setBackBtn(new ShakePersonalInfoUI.1(this));
    if (!com.tencent.mm.an.c.Qf()) {
      this.eOE.aaa("shake_item_shake_music_list");
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    }
    do
    {
      do
      {
        return;
      } while (paramIntent == null);
      Intent localIntent = new Intent();
      localIntent.putExtra("CropImageMode", 4);
      localIntent.putExtra("CropImage_Filter", true);
      localIntent.putExtra("CropImage_DirectlyIntoFilter", true);
      StringBuilder localStringBuilder = new StringBuilder();
      au.HU();
      localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.model.c.Gb() + "custom_shake_img_filename.jpg");
      a.ezn.a(localIntent, 2, this, paramIntent);
      return;
    } while (paramIntent == null);
    paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
    au.HU();
    com.tencent.mm.model.c.DT().set(4110, Boolean.valueOf(false));
    au.HU();
    com.tencent.mm.model.c.DT().set(4111, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onDestroy()
  {
    a.ezo.vl();
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onResume()
  {
    boolean bool = false;
    super.onResume();
    if (au.HX()) {
      a.ezo.vl();
    }
    if (this.eOE.ZZ("shake_item_shake_tv_list") == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.mmui.MMPreference", "shake_tv_list preference is null");
    }
    do
    {
      return;
      if (bi.getInt(g.AU().G("ShowConfig", "showShakeTV"), 0) == 1) {
        bool = true;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ConfigListDecoder", "isShowShakeTV : " + bool);
    } while ((bool) || (af.exd));
    this.eOE.bw("shake_item_shake_tv_list", true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */