package com.tencent.xweb;

import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;

public class j
{
  com.tencent.xweb.c.f vAn;
  
  public void a(WebView paramWebView, int paramInt) {}
  
  public boolean a(WebView paramWebView, ValueCallback<Uri[]> paramValueCallback, a parama)
  {
    return false;
  }
  
  public boolean a(WebView paramWebView, String paramString1, String paramString2, f paramf)
  {
    if (this.vAn != null) {
      return this.vAn.a(paramString1, paramString2, paramf);
    }
    return false;
  }
  
  public boolean a(WebView paramWebView, String paramString1, String paramString2, String paramString3, e parame)
  {
    if (this.vAn != null) {
      return this.vAn.a(paramString1, paramString2, paramString3, parame);
    }
    return false;
  }
  
  public boolean b(WebView paramWebView, String paramString1, String paramString2, f paramf)
  {
    if (this.vAn != null) {
      return this.vAn.b(paramString1, paramString2, paramf);
    }
    return false;
  }
  
  public void d(WebView paramWebView, String paramString) {}
  
  public View getVideoLoadingProgressView()
  {
    return null;
  }
  
  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    return false;
  }
  
  public void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    paramCallback.invoke(paramString, true, true);
  }
  
  public void onHideCustomView()
  {
    if (this.vAn != null) {
      this.vAn.onHideCustomView();
    }
  }
  
  public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    if (this.vAn != null) {
      this.vAn.onShowCustomView(paramView, paramCustomViewCallback);
    }
  }
  
  public void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    paramValueCallback.onReceiveValue(null);
  }
  
  public static abstract class a
  {
    public abstract String[] getAcceptTypes();
    
    public abstract int getMode();
    
    public abstract boolean isCaptureEnabled();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/xweb/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */