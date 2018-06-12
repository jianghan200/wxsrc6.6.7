package com.tencent.mm.plugin.appbrand.dynamic.e;

import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.u.b.d;
import com.tencent.xweb.g;
import java.util.concurrent.CountDownLatch;

public final class a
  implements d
{
  g fwC;
  private volatile boolean fwD;
  private volatile boolean fwE = false;
  private volatile CountDownLatch fwF;
  private ag mHandler;
  
  public a(Object paramObject, String paramString, g paramg)
  {
    this.fwC = paramg;
    this.fwD = false;
    this.fwC.addJavascriptInterface(paramObject, paramString);
    this.mHandler = new ag(Looper.getMainLooper());
    this.fwC.addJavascriptInterface(this, "WeixinJsThreadCaller");
  }
  
  public final boolean CY()
  {
    return true;
  }
  
  public final boolean CZ()
  {
    return this.fwC.isValid();
  }
  
  @JavascriptInterface
  public final int callFromJsThread()
  {
    x.d("MicroMsg.AppBrandX5BasedJsEngine", "enter callFromJsThread, pendingPause %b", new Object[] { Boolean.valueOf(this.fwE) });
    if (this.fwE)
    {
      x.i("MicroMsg.AppBrandX5BasedJsEngine", "pause await threadId %d", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
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
      x.e("MicroMsg.AppBrandX5BasedJsEngine", "pause await e = %s", new Object[] { localInterruptedException });
    }
    return 1;
  }
  
  public final void cleanup()
  {
    if (!this.fwD) {
      this.fwC.cleanup();
    }
    this.fwD = true;
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    if (this.fwD) {
      return;
    }
    paramString = new a.1(this, paramString, paramValueCallback);
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramString.run();
      return;
    }
    this.mHandler.post(paramString);
  }
  
  public final void pause()
  {
    if (this.fwC.CY())
    {
      this.fwC.pause();
      return;
    }
    this.fwE = true;
    evaluateJavascript("var ret = WeixinJsThreadCaller.callFromJsThread();", new a.2(this));
  }
  
  public final void resume()
  {
    if (this.fwC.CY()) {
      this.fwC.resume();
    }
    do
    {
      return;
      this.fwE = false;
    } while (this.fwF == null);
    this.fwF.countDown();
    this.fwF = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */