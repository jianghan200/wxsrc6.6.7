package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.s.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends ClickableSpan
{
  private String fJM;
  private int fJN = ad.getContext().getResources().getColor(s.d.green_text_color);
  
  public a(String paramString)
  {
    this.fJM = paramString;
  }
  
  public final void onClick(View paramView)
  {
    if (bi.oW(this.fJM))
    {
      x.e("MicroMsg.ExposeSpan", "exposeUrl is null, return");
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", this.fJM);
    localIntent.putExtra("forceHideShare", true);
    d.b(paramView.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
    x.d("MicroMsg.ExposeSpan", "expose click, exposeUrl:%s", new Object[] { this.fJM });
  }
  
  public final void updateDrawState(TextPaint paramTextPaint)
  {
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setColor(this.fJN);
    paramTextPaint.setUnderlineText(false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */