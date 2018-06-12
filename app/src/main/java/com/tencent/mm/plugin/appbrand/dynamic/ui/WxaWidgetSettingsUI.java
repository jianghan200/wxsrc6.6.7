package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.appbrand.appcache.d.a;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.b;
import com.tencent.mm.plugin.appbrand.wxawidget.b.b;
import com.tencent.mm.plugin.appbrand.wxawidget.b.c;
import com.tencent.mm.plugin.appbrand.wxawidget.b.e;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMSwitchBtn;

public class WxaWidgetSettingsUI
  extends MMActivity
{
  String appId;
  int bPh;
  
  protected final int getLayoutId()
  {
    return b.c.wxa_widget_settings_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool2 = false;
    super.onCreate(paramBundle);
    setBackBtn(new WxaWidgetSettingsUI.1(this));
    setMMTitle(b.e.wxa_widget_settings);
    this.appId = getIntent().getStringExtra("app_id");
    this.bPh = getIntent().getIntExtra("pkg_type", 0);
    MMSwitchBtn localMMSwitchBtn = (MMSwitchBtn)findViewById(b.b.open_ban_btn);
    paramBundle = b.sD(this.appId);
    if ((paramBundle != null) && (paramBundle.fvF)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      localMMSwitchBtn.setCheck(bool1);
      localMMSwitchBtn.setSwitchListener(new WxaWidgetSettingsUI.2(this));
      localMMSwitchBtn = (MMSwitchBtn)findViewById(b.b.inject_debug_btn);
      if ((paramBundle == null) || (!paramBundle.fvD))
      {
        bool1 = bool2;
        if (!d.a.ho(this.bPh)) {}
      }
      else
      {
        bool1 = true;
      }
      localMMSwitchBtn.setCheck(bool1);
      localMMSwitchBtn.setEnabled(d.a.jC(this.bPh));
      localMMSwitchBtn.setSwitchListener(new WxaWidgetSettingsUI.3(this));
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/ui/WxaWidgetSettingsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */