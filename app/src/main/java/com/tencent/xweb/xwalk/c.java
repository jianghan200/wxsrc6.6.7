package com.tencent.xweb.xwalk;

import com.tencent.xweb.WebView;
import com.tencent.xweb.c.b.a;
import org.xwalk.core.XWalkCookieManager;

public final class c
  implements b.a
{
  XWalkCookieManager vEK = new XWalkCookieManager();
  
  public final void c(WebView paramWebView) {}
  
  public final void cIj()
  {
    this.vEK.setAcceptCookie(true);
  }
  
  public final String getCookie(String paramString)
  {
    return this.vEK.getCookie(paramString);
  }
  
  public final void removeAllCookie()
  {
    this.vEK.removeAllCookie();
  }
  
  public final void removeSessionCookie()
  {
    this.vEK.removeSessionCookie();
  }
  
  public final void setCookie(String paramString1, String paramString2)
  {
    this.vEK.setCookie(paramString1, paramString2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/xweb/xwalk/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */