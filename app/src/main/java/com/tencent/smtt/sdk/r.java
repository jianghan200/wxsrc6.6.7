package com.tencent.smtt.sdk;

import android.os.Message;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.WebViewTransport;

class r
  implements Runnable
{
  r(q paramq, WebView.WebViewTransport paramWebViewTransport, Message paramMessage) {}
  
  public void run()
  {
    WebView localWebView = this.a.getWebView();
    if (localWebView != null) {
      ((IX5WebViewBase.WebViewTransport)this.b.obj).setWebView(localWebView.c());
    }
    this.b.sendToTarget();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/smtt/sdk/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */