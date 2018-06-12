package com.tencent.smtt.sdk;

import android.graphics.Picture;

class br
  implements android.webkit.WebView.PictureListener
{
  br(WebView paramWebView, WebView.PictureListener paramPictureListener) {}
  
  public void onNewPicture(android.webkit.WebView paramWebView, Picture paramPicture)
  {
    this.b.a(paramWebView);
    this.a.onNewPicture(this.b, paramPicture);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/smtt/sdk/br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */