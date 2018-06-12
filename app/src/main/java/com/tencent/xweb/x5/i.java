package com.tencent.xweb.x5;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.smtt.sdk.WebView;
import com.tencent.xweb.e;

public final class i
  implements com.tencent.xweb.c.f
{
  c vDK;
  b vDL;
  WebView vDM;
  
  public i(WebView paramWebView)
  {
    this.vDM = paramWebView;
    this.vDK = new c();
    this.vDL = new b();
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
  
  public final void onHideCustomView()
  {
    this.vDL.cJi();
  }
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback) {}
  
  public final void w(String paramString, Bitmap paramBitmap)
  {
    this.vDK.b(this.vDM, paramString, paramBitmap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/xweb/x5/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */