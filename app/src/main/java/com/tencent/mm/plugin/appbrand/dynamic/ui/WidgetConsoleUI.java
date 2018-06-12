package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.mm.bu.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.modelappbrand.j;
import com.tencent.mm.modelappbrand.j.a;
import com.tencent.mm.plugin.appbrand.wxawidget.b.b;
import com.tencent.mm.plugin.appbrand.wxawidget.b.c;
import com.tencent.mm.plugin.appbrand.wxawidget.b.e;
import com.tencent.mm.plugin.appbrand.wxawidget.console.ConsolePanel;
import com.tencent.mm.plugin.appbrand.wxawidget.console.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;

public class WidgetConsoleUI
  extends MMActivity
  implements j.a
{
  String appId;
  int bPh;
  int fii;
  ConsolePanel fxO;
  String id;
  
  private boolean afz()
  {
    Intent localIntent = getIntent();
    String str = localIntent.getStringExtra("id");
    this.appId = localIntent.getStringExtra("app_id");
    this.bPh = localIntent.getIntExtra("pkg_type", 0);
    this.fii = localIntent.getIntExtra("pkg_version", 0);
    setMMSubTitle(String.format("(%s)", new Object[] { str }));
    if (bi.oW(str)) {
      return false;
    }
    if (str.equals(this.id)) {
      return true;
    }
    ((e)g.l(e.class)).JN().b(this.id, this);
    ((e)g.l(e.class)).JN().a(str, this);
    this.id = str;
    d.a(this.fxO);
    return true;
  }
  
  public void finish()
  {
    if ((isFinishing()) || (this.tlP)) {
      return;
    }
    if (Build.VERSION.SDK_INT >= 21) {
      finishAndRemoveTask();
    }
    for (;;)
    {
      TypedArray localTypedArray = obtainStyledAttributes(16973825, new int[] { 16842938, 16842939 });
      int i = localTypedArray.getResourceId(0, 0);
      int j = localTypedArray.getResourceId(1, 0);
      localTypedArray.recycle();
      overridePendingTransition(i, j);
      return;
      super.finish();
    }
  }
  
  protected final int getLayoutId()
  {
    return b.c.widget_console_ui;
  }
  
  public final void hp(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = "";
    }
    for (;;)
    {
      a.ab(new WidgetConsoleUI.2(this, str));
      return;
      str = "(PAUSE)";
      continue;
      str = "(RESUME)";
      continue;
      str = "(START)";
      continue;
      str = "(STOP)";
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setBackBtn(new WidgetConsoleUI.1(this));
    setMMTitle(b.e.wxa_widget_console);
    this.fxO = ((ConsolePanel)findViewById(b.b.console_widget));
    if (!afz()) {
      finish();
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    ((e)g.l(e.class)).JN().b(this.id, this);
    d.b(this.fxO);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    if (!afz()) {
      finish();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/ui/WidgetConsoleUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */