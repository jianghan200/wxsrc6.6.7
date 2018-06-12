package com.tencent.mm.plugin.appbrand.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.statusbar.DrawStatusBarActivity;

@com.tencent.mm.ui.base.a(19)
public final class AppBrand404PageUI
  extends DrawStatusBarActivity
{
  public static void show(int paramInt)
  {
    ah.A(new AppBrand404PageUI.1(ad.getContext().getString(paramInt)));
  }
  
  public final void finish()
  {
    super.finish();
  }
  
  protected final int getLayoutId()
  {
    return s.h.app_brand_404_page_ui;
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.ui.statusbar.a.c(this.mController.contentView, getStatusBarColor(), false);
    setMMTitle(s.j.app_brand_error);
    setBackBtn(new AppBrand404PageUI.2(this));
    paramBundle = (TextView)findViewById(s.g.app_brand_error_page_reason);
    String str = getIntent().getStringExtra("key_wording");
    bi.oW(str);
    if (paramBundle != null) {
      paramBundle.setText(str);
    }
  }
  
  protected final void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrand404PageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */