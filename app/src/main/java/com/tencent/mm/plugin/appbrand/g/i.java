package com.tencent.mm.plugin.appbrand.g;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.WebView;
import com.tencent.xweb.g.a;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

public final class i
  implements b, d, g
{
  private volatile boolean fwD = false;
  private volatile boolean fwE = false;
  private volatile CountDownLatch fwF;
  com.tencent.xweb.g gdR;
  private Handler mHandler;
  
  public i(Context paramContext)
  {
    this.gdR = com.tencent.xweb.g.a(g.a.vAc, "appbrand", paramContext);
    this.gdR.addJavascriptInterface(this, "WeixinJsThreadCaller");
    this.mHandler = new Handler(Looper.getMainLooper());
  }
  
  public final void a(URL paramURL, String paramString, ValueCallback<String> paramValueCallback)
  {
    if (this.fwD) {
      return;
    }
    paramURL = new i.2(this, paramURL, paramString, paramValueCallback);
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramURL.run();
      return;
    }
    this.mHandler.post(paramURL);
  }
  
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    this.gdR.addJavascriptInterface(paramObject, paramString);
  }
  
  public final boolean agi()
  {
    return WebView.getUsingTbsCoreVersion(ad.getContext()) >= 43600;
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final int callFromJsThread()
  {
    x.d("MicroMsg.AppBrandMessBasedJsEngine", "enter callFromJsThread, pendingPause %b", new Object[] { Boolean.valueOf(this.fwE) });
    if (this.fwE)
    {
      x.i("MicroMsg.AppBrandMessBasedJsEngine", "pause await threadId %d", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
      this.fwE = false;
      this.fwF = new CountDownLatch(1);
    }
    try
    {
      this.fwF.await();
      return 1;
    }
    catch (InterruptedException localInterruptedException)
    {
      x.e("MicroMsg.AppBrandMessBasedJsEngine", "pause await e = %s", new Object[] { localInterruptedException });
    }
    return 1;
  }
  
  public final void destroy()
  {
    if (!this.fwD) {
      this.gdR.cleanup();
    }
    this.fwD = true;
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    if (this.fwD) {
      return;
    }
    paramString = new i.1(this, paramString, paramValueCallback);
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramString.run();
      return;
    }
    this.mHandler.post(paramString);
  }
  
  public final ByteBuffer getNativeBuffer(int paramInt)
  {
    return this.gdR.vzZ.getNativeBuffer(paramInt);
  }
  
  public final int getNativeBufferId()
  {
    return this.gdR.vzZ.getNativeBufferId();
  }
  
  public final void pause()
  {
    if (this.gdR.CY())
    {
      this.gdR.pause();
      return;
    }
    this.fwE = true;
    evaluateJavascript("var ret = WeixinJsThreadCaller.callFromJsThread();", new i.3(this));
  }
  
  public final void resume()
  {
    if (this.gdR.CY()) {
      this.gdR.resume();
    }
    do
    {
      return;
      this.fwE = false;
    } while (this.fwF == null);
    this.fwF.countDown();
    this.fwF = null;
  }
  
  public final void setJsExceptionHandler(com.tencent.xweb.d paramd)
  {
    this.gdR.vzZ.setJsExceptionHandler(paramd);
  }
  
  public final void setNativeBuffer(int paramInt, ByteBuffer paramByteBuffer)
  {
    this.gdR.vzZ.setNativeBuffer(paramInt, paramByteBuffer);
  }
  
  public final <T extends c> T y(Class<T> paramClass)
  {
    if (paramClass.isInstance(this))
    {
      i locali = this;
      if (paramClass == d.class)
      {
        locali = this;
        if (!this.gdR.vzZ.cIG()) {
          locali = null;
        }
      }
      return locali;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/g/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */