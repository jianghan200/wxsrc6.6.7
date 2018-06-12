package com.tencent.mm.plugin.appbrand.game;

import android.webkit.ValueCallback;
import com.tencent.mm.plugin.appbrand.g.a;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.sdk.platformtools.x;
import java.net.URL;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class g
  implements com.tencent.mm.plugin.appbrand.g.b
{
  private h fAa;
  private boolean nY = false;
  
  public g(h paramh)
  {
    j localj = j.fAf;
    x.i("MicroMsg.V8JsVmManager", "lm:GameRenderer.initJsVmContext ThreadName = [%s]", new Object[] { Thread.currentThread().getName() });
    if (localj.fAg != null) {
      throw new IllegalStateException("Init JsVm Context second time");
    }
    int i = localj.fAh.addAndGet(1);
    x.i("MicroMsg.V8JsVmManager", "lm:GameRenderer.initJsVmContext new WAGameJsContextImpl");
    localj.fAg = new f(true, new com.tencent.magicbrush.engine.b(), i);
    x.i("MicroMsg.V8JsVmManager", "lm:GameRenderer.initJsVmContext new WAGameJsContextImpl finished");
    localj.fAi.put(Integer.valueOf(i), localj.fAg);
    x.i("MicroMsg.V8JsVmManager", "lm:GameRenderer.initJsVmContext finished");
    this.fAa = paramh;
  }
  
  public final void a(URL paramURL, String paramString, ValueCallback<String> paramValueCallback)
  {
    f localf = j.fAf.fAg;
    if (localf == null) {
      throw new IllegalStateException("JsVmContext Not Initialized, main");
    }
    if ((paramString == null) || (paramString.isEmpty()))
    {
      x.e("WAGameJsEngine", "js script is null");
      throw new IllegalArgumentException("js script is null");
    }
    try
    {
      if (this.nY)
      {
        x.w("WAGameJsEngine", "evaluateSubJavascript is mDestroyed. script : " + paramString);
        return;
      }
      localf.a(paramURL, paramString, paramValueCallback);
      return;
    }
    finally {}
  }
  
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    f localf = j.fAf.fAg;
    if ((paramObject == null) || (paramString == null) || (paramString.isEmpty()))
    {
      x.w("WAGameJsEngine", "addJavaScriptInterface empty! : " + paramString);
      return;
    }
    if (localf == null)
    {
      x.w("WAGameJsEngine", "");
      return;
    }
    try
    {
      if (this.nY)
      {
        x.w("WAGameJsEngine", "addJavaScriptInterface mDestroyed. name : " + paramString);
        return;
      }
    }
    finally {}
    x.i("WAGameJsEngine", "addJavaScriptInterface name : " + paramString);
    localf.addJavascriptInterface(paramObject, paramString);
  }
  
  public final void destroy()
  {
    try
    {
      this.nY = true;
      return;
    }
    finally {}
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    f localf = j.fAf.fAg;
    if (localf == null) {
      throw new IllegalStateException("JsVmContext Not Initialized, main");
    }
    if ((paramString == null) || (paramString.isEmpty()))
    {
      x.e("WAGameJsEngine", "js script is null");
      throw new IllegalArgumentException("js script is null");
    }
    if (localf == null)
    {
      x.w("WAGameJsEngine", "WAGameJsEngine.evaluateJavaScriptImpl jsVmContext == null");
      return;
    }
    try
    {
      if (this.nY)
      {
        x.w("WAGameJsEngine", "evaluateSubJavascript is mDestroyed. script : " + paramString);
        return;
      }
    }
    finally {}
    localf.evaluateJavascript(paramString, paramValueCallback);
  }
  
  public final void setJsExceptionHandler(com.tencent.xweb.d paramd) {}
  
  public final <T extends c> T y(Class<T> paramClass)
  {
    Object localObject;
    if ((paramClass.equals(com.tencent.mm.plugin.appbrand.g.f.class)) || (paramClass.equals(com.tencent.mm.plugin.appbrand.g.d.class))) {
      localObject = j.fAf;
    }
    do
    {
      return (T)localObject;
      localObject = this;
    } while (paramClass.isInstance(this));
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */