package com.tencent.mm.plugin.appbrand.g;

import android.webkit.ValueCallback;
import com.tencent.xweb.d;
import java.net.URL;

public abstract interface b
  extends c
{
  public abstract void a(URL paramURL, String paramString, ValueCallback<String> paramValueCallback);
  
  public abstract void addJavascriptInterface(Object paramObject, String paramString);
  
  public abstract void destroy();
  
  public abstract void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback);
  
  public abstract void setJsExceptionHandler(d paramd);
  
  public abstract <T extends c> T y(Class<T> paramClass);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */