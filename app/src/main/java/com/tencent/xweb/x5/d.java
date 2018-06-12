package com.tencent.xweb.x5;

import com.tencent.smtt.sdk.CookieManager;
import com.tencent.xweb.c.b.a;
import org.xwalk.core.Log;

public final class d
  implements b.a
{
  CookieManager vDw = CookieManager.getInstance();
  
  public final void c(com.tencent.xweb.WebView paramWebView)
  {
    if (paramWebView == null)
    {
      Log.e("X5CookieManagerWrapper", "setAcceptThirdPartyCookies: the webview is null");
      return;
    }
    paramWebView = paramWebView.getWebViewUI();
    if (!(paramWebView instanceof com.tencent.smtt.sdk.WebView))
    {
      Log.e("X5CookieManagerWrapper", "setAcceptThirdPartyCookies: the webview is not x5 webview");
      return;
    }
    this.vDw.setAcceptThirdPartyCookies((com.tencent.smtt.sdk.WebView)paramWebView, true);
  }
  
  public final void cIj()
  {
    this.vDw.setAcceptCookie(true);
  }
  
  public final String getCookie(String paramString)
  {
    return this.vDw.getCookie(paramString);
  }
  
  public final void removeAllCookie()
  {
    this.vDw.removeAllCookie();
  }
  
  public final void removeSessionCookie()
  {
    this.vDw.removeSessionCookie();
  }
  
  public final void setCookie(String paramString1, String paramString2)
  {
    this.vDw.setCookie(paramString1, paramString2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/xweb/x5/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */