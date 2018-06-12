package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.plugin.appbrand.report.a.j.a;
import com.tencent.mm.plugin.appbrand.report.a.j.b;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.statusbar.DrawStatusBarActivity;

public final class AppBrandNearbyEmptyUI
  extends DrawStatusBarActivity
{
  protected final int getLayoutId()
  {
    return s.h.app_brand_nearby_empty_ui;
  }
  
  public final int getStatusBarColor()
  {
    if ((Build.VERSION.SDK_INT >= 23) && (j.b(getWindow()))) {
      return -855310;
    }
    if (Build.VERSION.SDK_INT >= 21) {
      return AppBrandLauncherUI.guy;
    }
    return super.getStatusBarColor();
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent() == null)
    {
      finish();
      return;
    }
    this.mController.contentView.setBackgroundColor(-855310);
    lF(-855310);
    setMMTitle(s.j.app_brand_nearby_list_title);
    nS(-16777216);
    setBackBtn(new AppBrandNearbyEmptyUI.1(this));
    k.c(this);
    paramBundle = (TextView)findViewById(s.g.content_title);
    TextView localTextView = (TextView)findViewById(s.g.content_message);
    switch (getIntent().getIntExtra("extra_enter_reason", 0))
    {
    default: 
      finish();
      return;
    case 0: 
      paramBundle = new com.tencent.mm.plugin.appbrand.report.a.j();
      paramBundle.grT = j.b.gsg;
      paramBundle.grX = j.a.grZ;
      paramBundle.xP();
    }
    for (;;)
    {
      setResult(-1);
      return;
      paramBundle.setText(s.j.app_brand_nearby_lbs_not_allowed_title);
      localTextView.setText(s.j.app_brand_nearby_lbs_not_allowed_message);
      paramBundle = new com.tencent.mm.plugin.appbrand.report.a.j();
      paramBundle.grT = j.b.gsg;
      paramBundle.grX = j.a.gsa;
      paramBundle.xP();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandNearbyEmptyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */