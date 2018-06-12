package com.tencent.mm.plugin.appbrand.dynamic.html;

import android.content.Intent;
import android.text.style.URLSpan;
import android.view.View;
import com.tencent.mm.bg.d;
import com.tencent.mm.sdk.platformtools.x;

public class CustomURLSpan
  extends URLSpan
{
  private String mUrl;
  
  public CustomURLSpan(String paramString)
  {
    super(paramString);
    this.mUrl = paramString;
  }
  
  public void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", this.mUrl);
    d.b(paramView.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
    x.d("MicroMsg.CustomURLSpan", "on custom url(%s) span clicked.", new Object[] { this.mUrl });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/html/CustomURLSpan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */