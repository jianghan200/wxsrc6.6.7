package com.tencent.xweb.sys;

import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import com.tencent.xweb.n;
import com.tencent.xweb.util.d;

public final class f
  extends n
{
  WebView vDm;
  String vDn = "";
  
  public f(WebView paramWebView)
  {
    this.vDm = paramWebView;
    getUserAgentString();
  }
  
  public final void cIo()
  {
    this.vDm.getSettings().setDisplayZoomControls(false);
  }
  
  public final void cIp()
  {
    this.vDm.getSettings().setSaveFormData(false);
  }
  
  public final void cIq()
  {
    this.vDm.getSettings().setJavaScriptEnabled(false);
  }
  
  public final void cIr()
  {
    this.vDm.getSettings().setDefaultFontSize(8);
  }
  
  public final void cIs()
  {
    this.vDm.getSettings().setJavaScriptEnabled(true);
  }
  
  public final void cIt()
  {
    this.vDm.getSettings().setAppCacheMaxSize(10485760L);
  }
  
  public final void cIu()
  {
    this.vDm.getSettings().setDatabaseEnabled(true);
  }
  
  public final void cIv()
  {
    this.vDm.getSettings().setDomStorageEnabled(true);
  }
  
  public final void cIw()
  {
    this.vDm.getSettings().setCacheMode(-1);
  }
  
  public final void cIx()
  {
    if (Build.VERSION.SDK_INT >= 21) {
      this.vDm.getSettings().setMixedContentMode(0);
    }
  }
  
  public final String getUserAgentString()
  {
    if ((this.vDn == null) || (this.vDn.isEmpty())) {}
    try
    {
      this.vDn = this.vDm.getSettings().getUserAgentString();
      return this.vDn;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final void setAppCachePath(String paramString)
  {
    this.vDm.getSettings().setAppCachePath(paramString);
  }
  
  public final void setBuiltInZoomControls(boolean paramBoolean)
  {
    this.vDm.getSettings().setBuiltInZoomControls(paramBoolean);
  }
  
  public final void setDatabasePath(String paramString)
  {
    this.vDm.getSettings().setDatabasePath(paramString);
  }
  
  public final void setDefaultTextEncodingName(String paramString)
  {
    this.vDm.getSettings().setDefaultTextEncodingName(paramString);
  }
  
  public final void setGeolocationEnabled(boolean paramBoolean)
  {
    this.vDm.getSettings().setJavaScriptEnabled(paramBoolean);
  }
  
  public final void setJavaScriptCanOpenWindowsAutomatically(boolean paramBoolean)
  {
    this.vDm.getSettings().setJavaScriptCanOpenWindowsAutomatically(paramBoolean);
  }
  
  public final void setJavaScriptEnabled(boolean paramBoolean)
  {
    this.vDm.getSettings().setJavaScriptEnabled(paramBoolean);
  }
  
  public final void setLayoutAlgorithm(WebSettings.LayoutAlgorithm paramLayoutAlgorithm)
  {
    this.vDm.getSettings().setLayoutAlgorithm(paramLayoutAlgorithm);
  }
  
  public final void setLoadWithOverviewMode(boolean paramBoolean)
  {
    this.vDm.getSettings().setLoadWithOverviewMode(paramBoolean);
  }
  
  public final void setLoadsImagesAutomatically(boolean paramBoolean)
  {
    this.vDm.getSettings().setLoadsImagesAutomatically(paramBoolean);
  }
  
  public final void setMediaPlaybackRequiresUserGesture(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      this.vDm.getSettings().setMediaPlaybackRequiresUserGesture(paramBoolean);
    }
  }
  
  public final void setPluginsEnabled(boolean paramBoolean)
  {
    d.c(this.vDm.getSettings(), "setPluginsEnabled", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
  }
  
  public final void setRenderPriority(WebSettings.RenderPriority paramRenderPriority)
  {
    this.vDm.getSettings().setRenderPriority(paramRenderPriority);
  }
  
  public final void setSupportZoom(boolean paramBoolean)
  {
    this.vDm.getSettings().setSupportZoom(paramBoolean);
  }
  
  public final void setTextZoom(int paramInt)
  {
    this.vDm.getSettings().setTextZoom(paramInt);
  }
  
  public final void setUseWideViewPort(boolean paramBoolean)
  {
    this.vDm.getSettings().setUseWideViewPort(paramBoolean);
  }
  
  public final void setUserAgentString(String paramString)
  {
    this.vDn = paramString;
    this.vDm.getSettings().setUserAgentString(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/xweb/sys/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */