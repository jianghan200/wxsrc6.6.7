package com.tencent.mm.plugin.appbrand.g;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.xweb.WebView;
import com.tencent.xweb.d;
import com.tencent.xweb.n;
import com.tencent.xweb.p;
import java.net.URL;
import java.util.LinkedList;

public final class j
  extends WebView
  implements b, e
{
  private final LinkedList<Pair<String, ValueCallback<String>>> fwJ = new LinkedList();
  private boolean fwK = false;
  private p fwL = new j.2(this);
  private boolean gdU = false;
  private Context mContext;
  private ag mHandler;
  private volatile boolean nY = false;
  
  public j(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    this.mHandler = new ag(Looper.getMainLooper());
    getSettings().setJavaScriptEnabled(true);
    getSettings().setUserAgentString(s.aV(this.mContext, getSettings().getUserAgentString()));
    setWebViewClient(this.fwL);
    setWillNotDraw(true);
  }
  
  private void d(final String paramString, final ValueCallback<String> paramValueCallback)
  {
    if (this.nY) {
      return;
    }
    paramString = new Runnable()
    {
      public final void run()
      {
        j.a(j.this, paramString, paramValueCallback);
      }
    };
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramString.run();
      return;
    }
    this.mHandler.post(paramString);
  }
  
  public final void a(URL paramURL, String paramString, ValueCallback<String> paramValueCallback)
  {
    evaluateJavascript(paramString, paramValueCallback);
  }
  
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    if ((paramObject != null) && (!bi.oW(paramString))) {
      super.addJavascriptInterface(paramObject, paramString);
    }
  }
  
  public final void destroy()
  {
    this.nY = true;
    super.destroy();
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    if (!this.gdU)
    {
      this.gdU = true;
      loadDataWithBaseURL("https://servicewechat.com/js-engine", "<html>\n  <head>\n    <meta http-equiv=\"Content-Security-Policy\" content=\"default-src 'none';script-src 'unsafe-eval';\">\n  </head>\n  <body></body>\n</html>", "text/html", "utf-8", null);
    }
    synchronized (this.fwJ)
    {
      if (!this.fwK)
      {
        this.fwJ.add(new Pair(paramString, paramValueCallback));
        return;
      }
      d(paramString, paramValueCallback);
      return;
    }
  }
  
  public final void setJsExceptionHandler(d paramd) {}
  
  public final void setJsRuntimeTitle(String paramString)
  {
    evaluateJavascript("document.title=\"" + paramString + "\"", null);
  }
  
  public final <T extends c> T y(Class<T> paramClass)
  {
    if (paramClass.isInstance(this)) {
      return this;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/g/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */