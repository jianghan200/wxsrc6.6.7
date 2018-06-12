package com.tencent.mm.plugin.appbrand.dynamic.e;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.jg.JgClassChecked;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.u.b.d;
import com.tencent.xweb.WebView;
import com.tencent.xweb.n;
import com.tencent.xweb.p;
import java.util.LinkedList;

@JgClassChecked(author=30, fComment="checked", lastDate="20170320", reviewer=30, vComment={com.jg.EType.JSEXECUTECHECK})
public class b
  extends WebView
  implements d
{
  private final LinkedList<Pair<String, ValueCallback<String>>> fwJ = new LinkedList();
  private boolean fwK = false;
  private p fwL = new b.2(this);
  private Context mContext;
  private ag mHandler;
  private volatile boolean nY = false;
  
  public b(Context paramContext, Object paramObject, String paramString1, String paramString2)
  {
    super(paramContext);
    this.mContext = paramContext;
    this.mHandler = new ag(Looper.getMainLooper());
    getSettings().setJavaScriptEnabled(true);
    getSettings().setUserAgentString(s.aV(this.mContext, getSettings().getUserAgentString()));
    setWebViewClient(this.fwL);
    if ((paramObject != null) && (!bi.oW(paramString1))) {
      addJavascriptInterface(paramObject, paramString1);
    }
    setWillNotDraw(true);
    loadDataWithBaseURL(paramString2, "<html>\n  <head>\n    <meta http-equiv=\"Content-Security-Policy\" content=\"default-src 'none';script-src 'unsafe-eval';\">\n  </head>\n  <body></body>\n</html>", "text/html", "utf-8", null);
  }
  
  private void d(String paramString, ValueCallback<String> paramValueCallback)
  {
    if (this.nY) {
      return;
    }
    paramString = new b.1(this, paramString, paramValueCallback);
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramString.run();
      return;
    }
    this.mHandler.post(paramString);
  }
  
  public boolean CY()
  {
    return false;
  }
  
  public final boolean CZ()
  {
    return true;
  }
  
  public final void cleanup()
  {
    this.nY = true;
    destroy();
  }
  
  public void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
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
  
  public void pause() {}
  
  public void resume() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */