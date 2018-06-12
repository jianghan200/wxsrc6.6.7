package com.tencent.mm.plugin.bottle.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.model.bl;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;

public class BottleWizardStep2
  extends MMPreference
{
  private c hlA;
  
  private void goBack()
  {
    Intent localIntent = new Intent().setClass(this, BottleWizardStep1.class);
    localIntent.addFlags(67108864);
    startActivity(localIntent);
    YC();
    finish();
  }
  
  public final int Ys()
  {
    return R.o.bottle_wizard_step2;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    if (paramf.equals("settings_district")) {
      return this.hlA.aus();
    }
    if (paramf.equals("settings_signature")) {
      return this.hlA.aur();
    }
    return false;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.settings_personal_info);
    this.hlA = new c(this, this.tCL);
    setBackBtn(new BottleWizardStep2.1(this));
    addTextOptionMenu(0, getString(R.l.app_nextstep), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        c.auq();
        paramAnonymousMenuItem = bl.IC();
        if (bi.a(Integer.valueOf(paramAnonymousMenuItem.sex), 0) <= 0)
        {
          h.b(BottleWizardStep2.this.mController.tml, BottleWizardStep2.this.getString(R.l.bottle_settings_change_info_err_sex), BottleWizardStep2.this.getString(R.l.app_tip), true);
          return true;
        }
        if (bi.oW(paramAnonymousMenuItem.getProvince()))
        {
          h.b(BottleWizardStep2.this.mController.tml, BottleWizardStep2.this.getString(R.l.bottle_settings_change_info_err_district), BottleWizardStep2.this.getString(R.l.app_tip), true);
          return true;
        }
        paramAnonymousMenuItem = new Intent().setClass(BottleWizardStep2.this, BottleBeachUI.class);
        paramAnonymousMenuItem.addFlags(67108864);
        BottleWizardStep2.this.startActivity(paramAnonymousMenuItem);
        BottleWizardStep2.this.finish();
        return true;
      }
    });
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.hlA.update();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/BottleWizardStep2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */