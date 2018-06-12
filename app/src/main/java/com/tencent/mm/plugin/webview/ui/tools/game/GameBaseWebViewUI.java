package com.tencent.mm.plugin.webview.ui.tools.game;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI.i;
import com.tencent.xweb.WebView;

public class GameBaseWebViewUI
  extends WebViewUI
{
  private c jJI = new GameBaseWebViewUI.1(this);
  protected a qfD;
  
  protected final boolean anv()
  {
    return true;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public void onDestroy()
  {
    c.a(this.jJI.qfW.qfX);
    if (this.qfD != null) {
      this.qfD.onDestroy();
    }
    super.onDestroy();
  }
  
  protected void onPause()
  {
    super.onPause();
    this.jJI.qfW.onPause();
    if (this.qfD != null) {
      this.qfD.jJI.qfW.onPause();
    }
  }
  
  protected void onResume()
  {
    this.jJI.qfW.onResume();
    if (this.qfD != null) {
      this.qfD.jJI.qfW.onResume();
    }
    super.onResume();
  }
  
  protected final void setGamePageReportData(Bundle paramBundle)
  {
    this.jJI.qfW.ab(paramBundle);
  }
  
  protected class a
    extends WebViewUI.i
  {
    protected a()
    {
      super();
    }
    
    public void a(WebView paramWebView, String paramString)
    {
      super.a(paramWebView, paramString);
      GameBaseWebViewUI.c(GameBaseWebViewUI.this).qfW.bXK();
    }
    
    public void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      GameBaseWebViewUI.c(GameBaseWebViewUI.this).qfW.bXJ();
      super.b(paramWebView, paramString, paramBitmap);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/game/GameBaseWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */