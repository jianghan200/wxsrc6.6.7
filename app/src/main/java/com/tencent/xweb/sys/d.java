package com.tencent.xweb.sys;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tencent.xweb.e;

public final class d
  implements com.tencent.xweb.c.f
{
  WebViewClient vCT;
  WebChromeClient vCU;
  WebView vCV;
  
  public d(WebView paramWebView)
  {
    this.vCV = paramWebView;
    this.vCT = new WebViewClient();
    this.vCU = new WebChromeClient();
  }
  
  public final boolean a(String paramString1, String paramString2, com.tencent.xweb.f paramf)
  {
    return false;
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, e parame)
  {
    return false;
  }
  
  public final boolean b(String paramString1, String paramString2, com.tencent.xweb.f paramf)
  {
    return false;
  }
  
  public final void onHideCustomView() {}
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback) {}
  
  public final void w(String paramString, Bitmap paramBitmap)
  {
    this.vCT.onPageStarted(this.vCV, paramString, paramBitmap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/xweb/sys/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */