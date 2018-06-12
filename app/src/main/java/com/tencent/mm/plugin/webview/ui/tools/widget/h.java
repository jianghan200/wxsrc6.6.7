package com.tencent.mm.plugin.webview.ui.tools.widget;

import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;

public final class h
  extends g
{
  private final b qkG;
  
  public h(MMWebView paramMMWebView, b paramb)
  {
    super((MMWebViewWithJsApi)paramMMWebView);
    this.qkG = paramb;
  }
  
  public final void d(WebView paramWebView, String paramString)
  {
    if (this.qkG != null)
    {
      this.qkG.iZ(paramString);
      return;
    }
    super.d(paramWebView, paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */