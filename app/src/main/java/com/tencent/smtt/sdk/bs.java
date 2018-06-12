package com.tencent.smtt.sdk;

import android.graphics.Picture;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.PictureListener;

class bs
  implements IX5WebViewBase.PictureListener
{
  bs(WebView paramWebView, WebView.PictureListener paramPictureListener) {}
  
  public void onNewPicture(IX5WebViewBase paramIX5WebViewBase, Picture paramPicture, boolean paramBoolean)
  {
    this.b.a(paramIX5WebViewBase);
    this.a.onNewPicture(this.b, paramPicture);
  }
  
  public void onNewPictureIfHaveContent(IX5WebViewBase paramIX5WebViewBase, Picture paramPicture) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/smtt/sdk/bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */