package com.tencent.xweb.xwalk;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.xweb.e;
import org.xwalk.core.XWalkView;

public final class f
  implements com.tencent.xweb.c.f
{
  j vEQ;
  k vER;
  XWalkView vES;
  
  public f(XWalkView paramXWalkView)
  {
    this.vES = paramXWalkView;
    this.vEQ = new j(paramXWalkView);
    this.vER = new k(paramXWalkView);
  }
  
  public final boolean a(String paramString1, String paramString2, com.tencent.xweb.f paramf)
  {
    if ((paramf instanceof e.c)) {
      return this.vEQ.b(this.vES, paramString1, paramString2, ((e.c)paramf).vEO);
    }
    return false;
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, e parame)
  {
    if ((parame instanceof e.d)) {
      return this.vEQ.a(this.vES, paramString1, paramString2, paramString3, ((e.d)parame).vEO);
    }
    return false;
  }
  
  public final boolean b(String paramString1, String paramString2, com.tencent.xweb.f paramf)
  {
    if ((paramf instanceof e.c)) {
      return this.vEQ.a(this.vES, paramString1, paramString2, ((e.c)paramf).vEO);
    }
    return false;
  }
  
  public final void onHideCustomView()
  {
    this.vEQ.cJi();
  }
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    if ((paramCustomViewCallback instanceof e.a)) {
      this.vEQ.a(paramView, ((e.a)paramCustomViewCallback).vEM);
    }
  }
  
  public final void w(String paramString, Bitmap paramBitmap)
  {
    this.vEQ.a(this.vES, paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/xweb/xwalk/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */