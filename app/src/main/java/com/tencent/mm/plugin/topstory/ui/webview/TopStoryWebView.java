package com.tencent.mm.plugin.topstory.ui.webview;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.topstory.a.g;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.b;
import com.tencent.xweb.n;
import java.io.File;
import java.lang.reflect.Field;

public class TopStoryWebView
  extends MMWebView
{
  private Context context;
  
  public TopStoryWebView(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
    init();
  }
  
  public TopStoryWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    init();
  }
  
  public TopStoryWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    init();
  }
  
  private void init()
  {
    x.i("MicroMsg.TopStory.TopStoryWebView", "init TopStoryWebView");
    this.dfF = true;
    he(this.context);
    if ((!getIsX5Kernel()) && (!d.fR(19))) {}
    try
    {
      Object localObject = new com.tencent.mm.compatible.loader.c(this, "mSysWebView", null).get();
      x.d("MicroMsg.TopStory.TopStoryWebView", "tryInterruptAwaitingWebCoreThread, mSysWebView = %s", new Object[] { localObject });
      localObject = new com.tencent.mm.compatible.loader.c(localObject, "mProvider", null).get();
      x.d("MicroMsg.TopStory.TopStoryWebView", "tryInterruptAwaitingWebCoreThread, mWebViewClassic = %s", new Object[] { localObject });
      localObject = new com.tencent.mm.compatible.loader.c(localObject, "mWebViewCore", null).get();
      x.d("MicroMsg.TopStory.TopStoryWebView", "tryInterruptAwaitingWebCoreThread, mWebViewCore = %s", new Object[] { localObject });
      localObject = new com.tencent.mm.compatible.loader.c(localObject, "sWebCoreHandler", null).get();
      x.d("MicroMsg.TopStory.TopStoryWebView", "tryInterruptAwaitingWebCoreThread, sWebCoreHandler = %s", new Object[] { localObject });
      localObject = new com.tencent.mm.compatible.loader.c(localObject, "mLooper", null).get();
      x.d("MicroMsg.TopStory.TopStoryWebView", "tryInterruptAwaitingWebCoreThread, mLooper = %s", new Object[] { localObject });
      localObject = new com.tencent.mm.compatible.loader.c(localObject, "mThread", null).get();
      x.d("MicroMsg.TopStory.TopStoryWebView", "tryInterruptAwaitingWebCoreThread, mThread = %s", new Object[] { localObject });
      if ((localObject instanceof Thread))
      {
        localObject = (Thread)localObject;
        x.i("MicroMsg.TopStory.TopStoryWebView", "tryInterruptAwaitingWebCoreThread, webCoreThread.getState = %s", new Object[] { ((Thread)localObject).getState() });
        if (((Thread)localObject).getState() == Thread.State.WAITING) {
          ((Thread)localObject).interrupt();
        }
      }
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.TopStory.TopStoryWebView", "tryInterruptAwaitingWebCoreThread, exception = %s", new Object[] { localException });
    }
  }
  
  public final void a(a parama, c paramc)
  {
    getSettings().cIv();
    getSettings().setJavaScriptEnabled(true);
    getSettings().setPluginsEnabled(true);
    getSettings().setBuiltInZoomControls(false);
    getSettings().setMediaPlaybackRequiresUserGesture(true);
    getSettings().cIx();
    getSettings().setUserAgentString(s.aV(getContext(), getSettings().getUserAgentString()));
    getSettings().setUseWideViewPort(true);
    getSettings().setLoadWithOverviewMode(true);
    getSettings().cIq();
    getSettings().cIp();
    getSettings().setGeolocationEnabled(true);
    getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    getSettings().cIx();
    getSettings().cIt();
    getSettings().setAppCachePath(this.context.getDir("webviewcache", 0).getAbsolutePath());
    getSettings().cIs();
    getSettings().cIu();
    getSettings().setDatabasePath(e.duM + "databases/");
    b.cIi().cIj();
    b.cIi().c(this);
    getView().setHorizontalScrollBarEnabled(false);
    getView().setVerticalScrollBarEnabled(true);
    setConfigCallback((WindowManager)ad.getContext().getSystemService("window"));
    super.setWebChromeClient(parama);
    super.setWebViewClient(paramc);
    x.i("MicroMsg.TopStory.TopStoryWebView", "Is the current broswer kernel X5, " + getIsX5Kernel());
    setBackgroundColor(-1);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    cAx();
    try
    {
      if (Build.VERSION.SDK_INT >= 19)
      {
        if (!g.bHC()) {
          break label367;
        }
        android.webkit.WebView.setWebContentsDebuggingEnabled(true);
      }
      for (;;)
      {
        f = getContext().getSharedPreferences(ad.chY(), 0).getFloat("current_text_size_scale_key", 1.0F);
        if (f < 2.025F) {
          break;
        }
        getSettings().setTextZoom(160);
        x.i("MicroMsg.TopStory.TopStoryWebView", "SetFontSize, fontSize = %f", new Object[] { Float.valueOf(f) });
        return;
        label367:
        android.webkit.WebView.setWebContentsDebuggingEnabled(false);
      }
    }
    catch (Exception parama)
    {
      for (;;)
      {
        float f;
        continue;
        if (f >= 1.875F) {
          getSettings().setTextZoom(150);
        } else if (f >= 1.625F) {
          getSettings().setTextZoom(140);
        } else if (f >= 1.375F) {
          getSettings().setTextZoom(130);
        } else if (f >= 1.25F) {
          getSettings().setTextZoom(120);
        } else if (f >= 1.125F) {
          getSettings().setTextZoom(110);
        } else if (f >= 1.0F) {
          getSettings().setTextZoom(100);
        } else if (f >= 0.875F) {
          getSettings().setTextZoom(90);
        } else {
          getSettings().setTextZoom(80);
        }
      }
    }
  }
  
  public void setConfigCallback(WindowManager paramWindowManager)
  {
    try
    {
      Field localField = com.tencent.xweb.WebView.class.getDeclaredField("mWebViewCore").getType().getDeclaredField("mBrowserFrame").getType().getDeclaredField("sConfigCallback");
      localField.setAccessible(true);
      Object localObject = localField.get(null);
      if (localObject == null) {
        return;
      }
      localField = localField.getType().getDeclaredField("mWindowManager");
      localField.setAccessible(true);
      localField.set(localObject, paramWindowManager);
      return;
    }
    catch (Exception paramWindowManager) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/webview/TopStoryWebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */