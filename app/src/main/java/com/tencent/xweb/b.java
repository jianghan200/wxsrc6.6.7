package com.tencent.xweb;

import com.tencent.xweb.c.b.a;

public final class b
{
  private static b vzU;
  public b.a vzV;
  
  public static b cIi()
  {
    try
    {
      if (vzU == null) {
        vzU = new b();
      }
      b localb = vzU;
      return localb;
    }
    finally {}
  }
  
  public final void c(WebView paramWebView)
  {
    try
    {
      if (this.vzV != null) {
        this.vzV.c(paramWebView);
      }
      return;
    }
    finally
    {
      paramWebView = finally;
      throw paramWebView;
    }
  }
  
  public final void cIj()
  {
    try
    {
      if (this.vzV != null) {
        this.vzV.cIj();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String getCookie(String paramString)
  {
    return this.vzV.getCookie(paramString);
  }
  
  public final void removeAllCookie()
  {
    this.vzV.removeAllCookie();
  }
  
  public final void setCookie(String paramString1, String paramString2)
  {
    try
    {
      this.vzV.setCookie(paramString1, paramString2);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/xweb/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */