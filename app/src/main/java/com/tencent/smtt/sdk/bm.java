package com.tencent.smtt.sdk;

import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;
import com.tencent.smtt.export.external.extension.proxy.X5ProxyWebViewClientExtension;

class bm
  extends X5ProxyWebViewClientExtension
{
  bm(WebView paramWebView, IX5WebViewClientExtension paramIX5WebViewClientExtension)
  {
    super(paramIX5WebViewClientExtension);
  }
  
  public void invalidate() {}
  
  public void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    WebView.a(this.a, paramInt3, paramInt4, paramInt1, paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/smtt/sdk/bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */