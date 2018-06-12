package com.tencent.mm.plugin.setting.ui.fixtools;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMMHeaderPreference;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;

@com.tencent.mm.ui.base.a(3)
public class FixToolsUI
  extends MMPreference
{
  private f eOE;
  
  public final int Ys()
  {
    return a.k.fix_tools;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if (paramPreference.mKey.equals("fix_tools_uplog"))
    {
      if (com.tencent.mm.plugin.setting.model.a.btq().egv)
      {
        MMWizardActivity.D(this, new Intent(this.mController.tml, FixToolsUpLogUploadingUI.class));
        return true;
      }
      paramf = new Intent(this.mController.tml, FixToolsUplogUI.class);
      paramf.putExtra("entry_fix_tools_uplog", 9);
      MMWizardActivity.D(this, paramf);
      return true;
    }
    if (paramPreference.mKey.equals("fix_tools_db_recover"))
    {
      paramf = new Intent().setClassName(this.mController.tml, "com.tencent.mm.plugin.dbbackup.DBRecoveryUI");
      paramf.putExtra("scene", 3);
      this.mController.tml.startActivity(paramf);
      return true;
    }
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eOE = this.tCL;
    setMMTitle(a.i.fix_tools);
    SettingsAboutMMHeaderPreference localSettingsAboutMMHeaderPreference = (SettingsAboutMMHeaderPreference)this.eOE.ZZ("fix_tools_micromsg_header");
    String str = e.aj(this.mController.tml, d.qVN);
    paramBundle = str;
    if (d.qVQ) {
      paramBundle = str + " " + getString(a.i.alpha_version_alpha);
    }
    localSettingsAboutMMHeaderPreference.mQR = paramBundle;
    int i = getIntent().getIntExtra("entry_fix_tools", 2);
    h.mEJ.a(873L, i, 1L, false);
    h.mEJ.a(873L, 0L, 1L, false);
    setBackBtn(new FixToolsUI.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */