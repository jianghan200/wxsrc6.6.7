package com.tencent.xweb.c;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.xweb.e;

public abstract interface f
{
  public abstract boolean a(String paramString1, String paramString2, com.tencent.xweb.f paramf);
  
  public abstract boolean a(String paramString1, String paramString2, String paramString3, e parame);
  
  public abstract boolean b(String paramString1, String paramString2, com.tencent.xweb.f paramf);
  
  public abstract void onHideCustomView();
  
  public abstract void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback);
  
  public abstract void w(String paramString, Bitmap paramBitmap);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/xweb/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */