package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;

public final class j
  extends i
{
  d qkY = null;
  private k qkZ = null;
  
  public j(MMWebView paramMMWebView, d paramd)
  {
    this(paramMMWebView, paramd, null);
  }
  
  public j(MMWebView paramMMWebView, d paramd, Bundle paramBundle)
  {
    super(paramMMWebView, false, paramBundle);
    this.qkY = paramd;
  }
  
  protected final void a(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    super.a(paramWebView, paramString, paramBitmap);
    if ((this.qkY instanceof e)) {
      ((e)this.qkY).Jo();
    }
  }
  
  protected final k aks()
  {
    if (this.qkZ == null) {
      this.qkZ = new j.1(this);
    }
    return this.qkZ;
  }
  
  protected final void e(WebView paramWebView, String paramString)
  {
    super.e(paramWebView, paramString);
    if ((this.qkY instanceof e)) {
      ((e)this.qkY).Jp();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/widget/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */