package com.tencent.xweb.xwalk;

import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings.RenderPriority;
import com.tencent.xweb.n;
import org.xwalk.core.XWalkSettings;
import org.xwalk.core.XWalkView;

public final class i
  extends n
{
  XWalkView vFg;
  
  public i(XWalkView paramXWalkView)
  {
    this.vFg = paramXWalkView;
  }
  
  public final void cIo() {}
  
  public final void cIp()
  {
    this.vFg.getSettings().setSaveFormData(false);
  }
  
  public final void cIq() {}
  
  public final void cIr()
  {
    this.vFg.getSettings().setDefaultFontSize(8);
  }
  
  public final void cIs()
  {
    this.vFg.getSettings().setAppCacheEnabled(true);
  }
  
  public final void cIt() {}
  
  public final void cIu()
  {
    this.vFg.getSettings().setDatabaseEnabled(true);
  }
  
  public final void cIv()
  {
    this.vFg.getSettings().setDomStorageEnabled(true);
  }
  
  public final void cIw()
  {
    this.vFg.getSettings().setCacheMode(-1);
  }
  
  public final void cIx() {}
  
  public final String getUserAgentString()
  {
    return this.vFg.getUserAgentString();
  }
  
  public final void setAppCachePath(String paramString)
  {
    this.vFg.getSettings().setAppCachePath(paramString);
  }
  
  public final void setBuiltInZoomControls(boolean paramBoolean)
  {
    this.vFg.getSettings().setBuiltInZoomControls(paramBoolean);
  }
  
  public final void setDatabasePath(String paramString) {}
  
  public final void setDefaultTextEncodingName(String paramString) {}
  
  public final void setGeolocationEnabled(boolean paramBoolean) {}
  
  public final void setJavaScriptCanOpenWindowsAutomatically(boolean paramBoolean)
  {
    this.vFg.getSettings().setJavaScriptCanOpenWindowsAutomatically(paramBoolean);
  }
  
  public final void setJavaScriptEnabled(boolean paramBoolean)
  {
    this.vFg.getSettings().setJavaScriptEnabled(paramBoolean);
  }
  
  public final void setLayoutAlgorithm(WebSettings.LayoutAlgorithm paramLayoutAlgorithm)
  {
    paramLayoutAlgorithm = org.xwalk.core.XWalkSettings.LayoutAlgorithm.values()[paramLayoutAlgorithm.ordinal()];
    this.vFg.getSettings().setLayoutAlgorithm(paramLayoutAlgorithm);
  }
  
  public final void setLoadWithOverviewMode(boolean paramBoolean)
  {
    this.vFg.getSettings().setLoadWithOverviewMode(paramBoolean);
  }
  
  public final void setLoadsImagesAutomatically(boolean paramBoolean)
  {
    this.vFg.getSettings().setLoadsImagesAutomatically(paramBoolean);
  }
  
  public final void setMediaPlaybackRequiresUserGesture(boolean paramBoolean)
  {
    this.vFg.getSettings().setMediaPlaybackRequiresUserGesture(paramBoolean);
  }
  
  public final void setPluginsEnabled(boolean paramBoolean) {}
  
  public final void setRenderPriority(WebSettings.RenderPriority paramRenderPriority) {}
  
  public final void setSupportZoom(boolean paramBoolean)
  {
    this.vFg.getSettings().setSupportZoom(paramBoolean);
  }
  
  public final void setTextZoom(int paramInt)
  {
    this.vFg.getSettings().setTextZoom(paramInt);
  }
  
  public final void setUseWideViewPort(boolean paramBoolean)
  {
    this.vFg.getSettings().setUseWideViewPort(paramBoolean);
  }
  
  public final void setUserAgentString(String paramString)
  {
    this.vFg.getSettings().setUserAgentString(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/xweb/xwalk/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */