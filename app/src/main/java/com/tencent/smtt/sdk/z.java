package com.tencent.smtt.sdk;

import android.os.Message;

class z
  implements Runnable
{
  z(SystemWebChromeClient paramSystemWebChromeClient, WebView.WebViewTransport paramWebViewTransport, Message paramMessage) {}
  
  public void run()
  {
    WebView localWebView = this.a.getWebView();
    if (localWebView != null) {
      ((android.webkit.WebView.WebViewTransport)this.b.obj).setWebView(localWebView.b());
    }
    this.b.sendToTarget();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/smtt/sdk/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */