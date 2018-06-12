package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.modelappbrand.j;
import com.tencent.mm.plugin.appbrand.dynamic.html.CustomURLSpan;
import com.tencent.mm.plugin.appbrand.dynamic.html.b;
import com.tencent.mm.plugin.appbrand.dynamic.widget.c;
import com.tencent.mm.plugin.appbrand.widget.l;
import com.tencent.mm.plugin.appbrand.widget.m;
import com.tencent.mm.plugin.appbrand.wxawidget.b.b;
import com.tencent.mm.plugin.appbrand.wxawidget.b.c;
import com.tencent.mm.plugin.appbrand.wxawidget.b.e;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.MMSwitchBtn;

public class WxaWidgetDebugUI
  extends MMActivity
{
  String appId;
  int bPh;
  int fii;
  MMSwitchBtn fxR;
  l fxS;
  String id;
  
  protected final int getLayoutId()
  {
    return b.c.wxa_widget_debug_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setBackBtn(new WxaWidgetDebugUI.1(this));
    int i = b.e.wxa_widget_debugger;
    if (((e)g.l(e.class)).JN().JQ()) {}
    TextView localTextView;
    for (paramBundle = String.format("(%s)", new Object[] { c.afB() });; paramBundle = "")
    {
      setMMTitle(getString(i, new Object[] { paramBundle }));
      paramBundle = getIntent();
      this.id = paramBundle.getStringExtra("id");
      this.appId = paramBundle.getStringExtra("app_id");
      this.bPh = paramBundle.getIntExtra("pkg_type", 0);
      this.fii = paramBundle.getIntExtra("pkg_version", 0);
      setMMSubTitle(String.format("(%s)", new Object[] { this.id }));
      this.fxR = ((MMSwitchBtn)findViewById(b.b.open_debug_btn));
      this.fxS = ((com.tencent.mm.plugin.appbrand.widget.a.a)g.l(com.tencent.mm.plugin.appbrand.widget.a.a.class)).abd().wg(this.appId);
      if (this.fxS == null)
      {
        this.fxS = new l();
        this.fxS.field_appId = this.appId;
      }
      this.fxR.setCheck(this.fxS.field_openDebug);
      this.fxR.setSwitchListener(new WxaWidgetDebugUI.2(this));
      localTextView = (TextView)findViewById(b.b.inspect_guide_tv);
      Spanned localSpanned = Html.fromHtml(getString(b.e.wxa_widget_open_inspect_guide), new com.tencent.mm.plugin.appbrand.dynamic.html.a(), new b());
      paramBundle = localSpanned;
      if (!(localSpanned instanceof Spannable)) {
        break;
      }
      i = localSpanned.length();
      Spannable localSpannable = (Spannable)localSpanned;
      URLSpan[] arrayOfURLSpan = (URLSpan[])localSpannable.getSpans(0, i, URLSpan.class);
      paramBundle = new SpannableStringBuilder(localSpanned);
      int j = arrayOfURLSpan.length;
      i = 0;
      while (i < j)
      {
        localSpanned = arrayOfURLSpan[i];
        paramBundle.removeSpan(localSpanned);
        paramBundle.setSpan(new CustomURLSpan(localSpanned.getURL()), localSpannable.getSpanStart(localSpanned), localSpannable.getSpanEnd(localSpanned), 34);
        i += 1;
      }
    }
    localTextView.setText(paramBundle);
    localTextView.setMovementMethod(LinkMovementMethod.getInstance());
    findViewById(b.b.restart_support_process_btn).setOnClickListener(new WxaWidgetDebugUI.3(this));
    paramBundle = findViewById(b.b.widget_settings_btn);
    if (((e)g.l(e.class)).JN().JQ())
    {
      paramBundle.setVisibility(0);
      paramBundle.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = new Intent(WxaWidgetDebugUI.this.mController.tml, WxaWidgetSettingsUI.class);
          paramAnonymousView.putExtra("app_id", WxaWidgetDebugUI.this.appId);
          paramAnonymousView.putExtra("pkg_type", WxaWidgetDebugUI.this.bPh);
          paramAnonymousView.putExtra("pkg_version", WxaWidgetDebugUI.this.fii);
          WxaWidgetDebugUI.this.startActivity(paramAnonymousView);
        }
      });
      return;
    }
    paramBundle.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/ui/WxaWidgetDebugUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */