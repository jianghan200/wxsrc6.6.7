package com.tencent.magicbrush.bind;

import android.support.annotation.Keep;
import android.webkit.JavascriptInterface;

public abstract interface V8JSInterface
{
  @JavascriptInterface
  @Keep
  public abstract String invokeHandler(String paramString1, String paramString2, int paramInt);
  
  @JavascriptInterface
  @Keep
  public abstract boolean isDebugPackage();
  
  @JavascriptInterface
  @Keep
  public abstract void publishHandler(String paramString1, String paramString2, String paramString3);
  
  @JavascriptInterface
  @Keep
  public abstract String retrieveEvent(int paramInt);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/magicbrush/bind/V8JSInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */