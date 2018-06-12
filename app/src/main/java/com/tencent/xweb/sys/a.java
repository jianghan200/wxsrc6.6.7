package com.tencent.xweb.sys;

import android.os.Build.VERSION;
import android.webkit.CookieManager;
import com.tencent.xweb.c.b.a;
import org.xwalk.core.Log;

public final class a
  implements b.a
{
  CookieManager vCJ = CookieManager.getInstance();
  
  public final void c(com.tencent.xweb.WebView paramWebView)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      if ((paramWebView != null) && (paramWebView.getWebViewUI() != null) && ((paramWebView.getWebViewUI() instanceof android.webkit.WebView))) {
        this.vCJ.setAcceptThirdPartyCookies((android.webkit.WebView)paramWebView.getWebViewUI(), true);
      }
    }
    else {
      return;
    }
    Log.e("SysCookieManagerWrapper", "webview kind not match");
  }
  
  public final void cIj()
  {
    this.vCJ.setAcceptCookie(true);
  }
  
  public final String getCookie(String paramString)
  {
    return this.vCJ.getCookie(paramString);
  }
  
  public final void removeAllCookie()
  {
    this.vCJ.removeAllCookie();
  }
  
  public final void removeSessionCookie()
  {
    this.vCJ.removeSessionCookie();
  }
  
  public final void setCookie(String paramString1, String paramString2)
  {
    this.vCJ.setCookie(paramString1, paramString2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/xweb/sys/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */