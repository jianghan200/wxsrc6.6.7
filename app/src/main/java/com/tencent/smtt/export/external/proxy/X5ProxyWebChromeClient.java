package com.tencent.smtt.export.external.proxy;

import com.tencent.smtt.export.external.WebViewWizardBase;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;

public abstract class X5ProxyWebChromeClient
  extends ProxyWebChromeClient
{
  public X5ProxyWebChromeClient(WebViewWizardBase paramWebViewWizardBase)
  {
    this.mWebChromeClient = ((IX5WebChromeClient)paramWebViewWizardBase.newInstance("com.tencent.smtt.webkit.WebChromeClient"));
  }
  
  public X5ProxyWebChromeClient(IX5WebChromeClient paramIX5WebChromeClient)
  {
    setWebChromeClient(paramIX5WebChromeClient);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/smtt/export/external/proxy/X5ProxyWebChromeClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */