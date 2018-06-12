package com.tencent.xweb.x5;

import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings.RenderPriority;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebSettings.TextSize;
import com.tencent.smtt.sdk.WebView;
import com.tencent.xweb.n;
import com.tencent.xweb.n.a;

public final class k
  extends n
{
  WebView vDX;
  
  public k(WebView paramWebView)
  {
    this.vDX = paramWebView;
  }
  
  public final void a(n.a parama)
  {
    try
    {
      this.vDX.getSettings().setTextSize(WebSettings.TextSize.valueOf(parama.name()));
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public final void cIo()
  {
    this.vDX.getSettings().setDisplayZoomControls(false);
  }
  
  public final void cIp()
  {
    this.vDX.getSettings().setSaveFormData(false);
  }
  
  public final void cIq()
  {
    this.vDX.getSettings().setJavaScriptEnabled(false);
  }
  
  public final void cIr()
  {
    this.vDX.getSettings().setDefaultFontSize(8);
  }
  
  public final void cIs()
  {
    this.vDX.getSettings().setJavaScriptEnabled(true);
  }
  
  public final void cIt()
  {
    this.vDX.getSettings().setAppCacheMaxSize(10485760L);
  }
  
  public final void cIu()
  {
    this.vDX.getSettings().setDatabaseEnabled(true);
  }
  
  public final void cIv()
  {
    this.vDX.getSettings().setDomStorageEnabled(true);
  }
  
  public final void cIw()
  {
    this.vDX.getSettings().setCacheMode(-1);
  }
  
  public final void cIx()
  {
    this.vDX.getSettings().setMixedContentMode(0);
  }
  
  public final String getUserAgentString()
  {
    return this.vDX.getSettings().getUserAgentString();
  }
  
  public final void setAppCachePath(String paramString)
  {
    this.vDX.getSettings().setAppCachePath(paramString);
  }
  
  public final void setBuiltInZoomControls(boolean paramBoolean)
  {
    this.vDX.getSettings().setBuiltInZoomControls(paramBoolean);
  }
  
  public final void setDatabasePath(String paramString)
  {
    this.vDX.getSettings().setDatabasePath(paramString);
  }
  
  public final void setDefaultTextEncodingName(String paramString)
  {
    this.vDX.getSettings().setDefaultTextEncodingName(paramString);
  }
  
  public final void setGeolocationEnabled(boolean paramBoolean)
  {
    this.vDX.getSettings().setJavaScriptEnabled(paramBoolean);
  }
  
  public final void setJavaScriptCanOpenWindowsAutomatically(boolean paramBoolean)
  {
    this.vDX.getSettings().setJavaScriptCanOpenWindowsAutomatically(paramBoolean);
  }
  
  public final void setJavaScriptEnabled(boolean paramBoolean)
  {
    this.vDX.getSettings().setJavaScriptEnabled(paramBoolean);
  }
  
  public final void setLayoutAlgorithm(WebSettings.LayoutAlgorithm paramLayoutAlgorithm)
  {
    paramLayoutAlgorithm = com.tencent.smtt.sdk.WebSettings.LayoutAlgorithm.values()[paramLayoutAlgorithm.ordinal()];
    this.vDX.getSettings().setLayoutAlgorithm(paramLayoutAlgorithm);
  }
  
  public final void setLoadWithOverviewMode(boolean paramBoolean)
  {
    this.vDX.getSettings().setLoadWithOverviewMode(paramBoolean);
  }
  
  public final void setLoadsImagesAutomatically(boolean paramBoolean)
  {
    this.vDX.getSettings().setLoadsImagesAutomatically(paramBoolean);
  }
  
  public final void setMediaPlaybackRequiresUserGesture(boolean paramBoolean)
  {
    this.vDX.getSettings().setMediaPlaybackRequiresUserGesture(paramBoolean);
  }
  
  public final void setPluginsEnabled(boolean paramBoolean)
  {
    this.vDX.getSettings().setPluginsEnabled(paramBoolean);
  }
  
  public final void setRenderPriority(WebSettings.RenderPriority paramRenderPriority)
  {
    paramRenderPriority = com.tencent.smtt.sdk.WebSettings.RenderPriority.values()[paramRenderPriority.ordinal()];
    this.vDX.getSettings().setRenderPriority(paramRenderPriority);
  }
  
  public final void setSupportZoom(boolean paramBoolean)
  {
    this.vDX.getSettings().setSupportZoom(paramBoolean);
  }
  
  public final void setTextZoom(int paramInt)
  {
    this.vDX.getSettings().setTextZoom(paramInt);
  }
  
  public final void setUseWideViewPort(boolean paramBoolean)
  {
    this.vDX.getSettings().setUseWideViewPort(paramBoolean);
  }
  
  public final void setUserAgentString(String paramString)
  {
    this.vDX.getSettings().setUserAgentString(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/xweb/x5/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */