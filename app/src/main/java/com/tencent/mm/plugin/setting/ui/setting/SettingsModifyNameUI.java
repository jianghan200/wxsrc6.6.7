package com.tencent.mm.plugin.setting.ui.setting;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.ui.widget.MMEditText;

public class SettingsModifyNameUI
  extends MMActivity
  implements c.a
{
  private p eXe = null;
  private boolean hLL = false;
  private com.tencent.mm.sdk.b.c hLO = new SettingsModifyNameUI.1(this);
  private MMEditText hMU;
  private h.b mPN;
  
  public final void YX()
  {
    h.i(this, a.i.settings_modify_name_invalid_less, a.i.settings_modify_name_title);
  }
  
  public final void YY()
  {
    h.i(this, a.i.settings_modify_name_invalid_more, a.i.settings_modify_name_title);
  }
  
  protected final int getLayoutId()
  {
    return a.g.settings_modify_name;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_modify_name);
    this.hMU = ((MMEditText)findViewById(a.f.settings_modify_name_new_name_et));
    this.hMU.setText(j.a(this, (String)g.Ei().DT().get(4, null), this.hMU.getTextSize()));
    this.hMU.setSelection(this.hMU.getText().length());
    this.hMU.addTextChangedListener(new SettingsModifyNameUI.2(this));
    com.tencent.mm.ui.tools.a.c localc = com.tencent.mm.ui.tools.a.c.d(this.hMU).fj(1, 32);
    localc.uCR = false;
    localc.a(null);
    a(0, getString(a.i.app_save), new SettingsModifyNameUI.3(this), s.b.tmX);
    enableOptionMenu(false);
    setBackBtn(new SettingsModifyNameUI.4(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a.sFg.b(this.hLO);
    initView();
  }
  
  protected void onDestroy()
  {
    a.sFg.c(this.hLO);
    super.onDestroy();
  }
  
  public final void pO(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MiroMsg.SettingsModifyNameUI", "Set New NickName : " + paramString);
    this.hLL = true;
    ActionBarActivity localActionBarActivity = this.mController.tml;
    getString(a.i.app_tip);
    this.eXe = h.a(localActionBarActivity, getString(a.i.contact_info_change_remarkimage_save), false, null);
    this.mPN = q.q(2, paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsModifyNameUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */