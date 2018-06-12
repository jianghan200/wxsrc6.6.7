package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.ui.base.preference.CheckPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.TextButtonPreference;
import com.tencent.mm.ui.base.preference.f;

public class UnfamiliarContactUI
  extends MMPreference
{
  private boolean mOS;
  private boolean mOT;
  private boolean mOU;
  
  public final int Ys()
  {
    return a.k.settings_unfamiliar_contact_ui;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool2 = false;
    CheckPreference localCheckPreference;
    boolean bool1;
    if ((paramPreference instanceof CheckPreference))
    {
      localCheckPreference = (CheckPreference)paramPreference;
      if (paramPreference.mKey.equals("settings_half_year_not_chat")) {
        if (!this.mOS)
        {
          bool1 = true;
          localCheckPreference.qpJ = bool1;
          if (this.mOS) {
            break label113;
          }
          bool1 = true;
          label52:
          this.mOS = bool1;
          label57:
          paramPreference = (TextButtonPreference)paramf.ZZ("settings_next_step");
          if ((!this.mOS) && (!this.mOU))
          {
            bool1 = bool2;
            if (!this.mOT) {}
          }
          else
          {
            bool1 = true;
          }
          paramPreference.setEnabled(bool1);
        }
      }
    }
    for (;;)
    {
      paramf.notifyDataSetChanged();
      return true;
      bool1 = false;
      break;
      label113:
      bool1 = false;
      break label52;
      if (paramPreference.mKey.equals("settings_has_not_same_chatroom"))
      {
        if (!this.mOU)
        {
          bool1 = true;
          label139:
          localCheckPreference.qpJ = bool1;
          if (this.mOU) {
            break label167;
          }
        }
        label167:
        for (bool1 = true;; bool1 = false)
        {
          this.mOU = bool1;
          break;
          bool1 = false;
          break label139;
        }
      }
      if (!paramPreference.mKey.equals("settings_half_year_not_response")) {
        break label57;
      }
      if (!this.mOT)
      {
        bool1 = true;
        label193:
        localCheckPreference.qpJ = bool1;
        if (this.mOT) {
          break label221;
        }
      }
      label221:
      for (bool1 = true;; bool1 = false)
      {
        this.mOT = bool1;
        break;
        bool1 = false;
        break label193;
      }
      if (paramPreference.mKey.equals("settings_next_step"))
      {
        paramPreference = new Intent(this, UnfamiliarContactDetailUI.class);
        paramPreference.putExtra("half_year_not_chat", this.mOS);
        paramPreference.putExtra("half_year_not_response", this.mOT);
        paramPreference.putExtra("has_not_same_chatroom", this.mOU);
        startActivityForResult(paramPreference, 291);
      }
    }
  }
  
  protected final void initView()
  {
    super.initView();
    setMMTitle(a.i.settings_unfamiliar_contact);
    setBackBtn(new UnfamiliarContactUI.1(this));
    ((CheckPreference)this.tCL.ZZ("settings_half_year_not_chat")).tBG = 0;
    ((CheckPreference)this.tCL.ZZ("settings_has_not_same_chatroom")).tBG = 0;
    ((CheckPreference)this.tCL.ZZ("settings_half_year_not_response")).tBG = 0;
    ((TextButtonPreference)this.tCL.ZZ("settings_next_step")).setEnabled(false);
    this.tCL.notifyDataSetChanged();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      onBackPressed();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */