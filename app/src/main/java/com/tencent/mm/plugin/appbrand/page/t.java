package com.tencent.mm.plugin.appbrand.page;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.ao;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.j;
import com.tencent.xweb.n;
import com.tencent.xweb.o;
import com.tencent.xweb.p;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

public final class t
  extends MMWebView
  implements com.tencent.mm.plugin.appbrand.g.b
{
  String fCQ;
  g fdO;
  private LinkedList<Pair<String, ValueCallback<String>>> fsN;
  boolean fwK = false;
  private p fwL = new t.6(this);
  private o gcI = new t.8(this);
  private com.tencent.xweb.x5.a.a.a.a.b gcJ = new com.tencent.xweb.x5.a.a.a.a.b()
  {
    public final void computeScroll(View paramAnonymousView)
    {
      t.j(t.this).akr();
    }
    
    public final boolean dispatchTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
    {
      return t.j(t.this).A(paramAnonymousMotionEvent);
    }
    
    public final void hasDiscardCurrentPage(boolean paramAnonymousBoolean)
    {
      boolean bool2 = true;
      t.b(t.this, paramAnonymousBoolean);
      t localt = t.this;
      boolean bool1;
      if (!paramAnonymousBoolean)
      {
        bool1 = true;
        t.a(localt, bool1);
        localt = t.this;
        if (paramAnonymousBoolean) {
          break label55;
        }
      }
      label55:
      for (paramAnonymousBoolean = bool2;; paramAnonymousBoolean = false)
      {
        t.c(localt, paramAnonymousBoolean);
        return;
        bool1 = false;
        break;
      }
    }
    
    public final boolean onInterceptTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
    {
      return t.j(t.this).B(paramAnonymousMotionEvent);
    }
    
    public final Object onMiscCallBack(String paramAnonymousString, Bundle paramAnonymousBundle)
    {
      if ((!bi.oW(paramAnonymousString)) && (paramAnonymousBundle != null))
      {
        x.i("MicroMsg.AppBrandWebView", "method = %s", new Object[] { paramAnonymousString });
        if (paramAnonymousString.equalsIgnoreCase("shouldInterceptMediaUrl"))
        {
          paramAnonymousString = paramAnonymousBundle.getString("url");
          if (!bi.oW(paramAnonymousString))
          {
            paramAnonymousBundle = AppBrandLocalMediaObjectManager.getItemByLocalId(t.a(t.this), paramAnonymousString);
            if (paramAnonymousBundle != null) {
              break label92;
            }
            x.e("MicroMsg.AppBrandWebView", "get meidiaobj failed, appid : %s, localid :%s", new Object[] { t.a(t.this), paramAnonymousString });
          }
        }
      }
      return null;
      label92:
      paramAnonymousBundle = paramAnonymousBundle.dDG;
      x.i("MicroMsg.AppBrandWebView", "filePath" + paramAnonymousBundle + "tempFilePath" + paramAnonymousString);
      return paramAnonymousBundle;
    }
    
    public final void onOverScrolled(int paramAnonymousInt1, int paramAnonymousInt2, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2, View paramAnonymousView)
    {
      t.j(t.this).c(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousBoolean1, paramAnonymousBoolean2);
    }
    
    public final void onScrollChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, View paramAnonymousView)
    {
      t.j(t.this).onScrollChanged(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousView);
    }
    
    public final boolean onShowLongClickPopupMenu()
    {
      return WebView.getUsingTbsCoreVersion(t.this.getContext()) < 43011;
    }
    
    public final boolean onTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
    {
      return t.j(t.this).z(paramAnonymousMotionEvent);
    }
    
    public final boolean overScrollBy(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8, boolean paramAnonymousBoolean, View paramAnonymousView)
    {
      return t.j(t.this).b(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousInt5, paramAnonymousInt6, paramAnonymousInt7, paramAnonymousInt8, paramAnonymousBoolean);
    }
    
    public final boolean shouldDiscardCurrentPage()
    {
      boolean bool2 = t.k(t.this).alT();
      if ((bool2) && (!t.l(t.this))) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        x.i("MicroMsg.AppBrandWebView", "shouldTrimCurrentPage: %b", new Object[] { Boolean.valueOf(bool1) });
        if ((!bool2) || (t.l(t.this))) {
          break;
        }
        return true;
      }
      return false;
    }
  };
  private c gnB;
  long goA;
  private long goB;
  boolean goC = false;
  private boolean goD = false;
  boolean goE = true;
  private String goF;
  long goG;
  private String goH = null;
  private String goI = null;
  private j goJ = new j()
  {
    public final void onHideCustomView()
    {
      try
      {
        if (t.h(t.this) != null) {
          t.h(t.this).alE();
        }
        return;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.AppBrandWebView", "onHideCustomView error " + localException.getMessage());
      }
    }
    
    public final void onShowCustomView(View paramAnonymousView, WebChromeClient.CustomViewCallback paramAnonymousCustomViewCallback)
    {
      try
      {
        if (t.h(t.this) != null)
        {
          t.h(t.this).r(paramAnonymousView, 90);
          t.h(t.this).gmk = paramAnonymousCustomViewCallback;
        }
        return;
      }
      catch (Exception paramAnonymousView)
      {
        x.e("MicroMsg.AppBrandWebView", "onShowCustomView error " + paramAnonymousView.getMessage());
      }
    }
  };
  String gou;
  private w gov;
  private v gow;
  com.tencent.mm.plugin.appbrand.k.l gox;
  public Animator goy;
  private long goz;
  String mAppId;
  
  public t(Context paramContext)
  {
    super(paramContext);
    this.dfF = true;
    boolean bool;
    if (getX5WebViewExtension() != null) {
      bool = true;
    }
    for (;;)
    {
      this.isX5Kernel = bool;
      this.fsN = new LinkedList();
      this.goz = System.currentTimeMillis();
      he(getContext());
      getSettings().cIv();
      getSettings().setJavaScriptEnabled(true);
      getSettings().setMediaPlaybackRequiresUserGesture(false);
      getSettings().cIx();
      getSettings().setUserAgentString(s.aV(getContext(), getSettings().getUserAgentString()));
      this.goF = getSettings().getUserAgentString();
      getView().setHorizontalScrollBarEnabled(false);
      getView().setVerticalScrollBarEnabled(false);
      setWebViewClient(this.fwL);
      setWebChromeClient(this.goJ);
      setWebViewCallbackClient(this.gcI);
      if (getIsX5Kernel()) {
        setWebViewClientExtension(this.gcJ);
      }
      try
      {
        a.a.cJ(getX5WebViewExtension()).y("setEnableAutoPageDiscarding", new Object[] { Boolean.valueOf(false) });
        a.a.cJ(getX5WebViewExtension()).y("setEnableAutoPageRestoration", new Object[] { Boolean.valueOf(false) });
        x.i("MicroMsg.AppBrandWebView", "Is the current broswer kernel X5, " + getIsX5Kernel());
        setBackgroundColor(-1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setOnLongClickListener(new t.1(this));
        setDownloadListener(new t.2(this));
        return;
        bool = false;
      }
      catch (Exception paramContext)
      {
        for (;;)
        {
          x.e("MicroMsg.AppBrandWebView", "DisableAutoPageDiscarding error " + paramContext);
        }
      }
    }
  }
  
  private static void a(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    try
    {
      paramJSONObject.put(paramString, paramObject);
      return;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.AppBrandWebView", paramJSONObject.getMessage());
    }
  }
  
  private void amc()
  {
    Iterator localIterator = this.fsN.iterator();
    while (localIterator.hasNext())
    {
      Pair localPair = (Pair)localIterator.next();
      super.evaluateJavascript((String)localPair.first, (ValueCallback)localPair.second);
    }
    this.fsN.clear();
  }
  
  private String getBaseURL()
  {
    if (this.goI == null) {
      this.goI = (getBaseURLPrefix() + "page-frame.html");
    }
    return this.goI;
  }
  
  private String getBaseURLPrefix()
  {
    if (this.goH == null)
    {
      this.goH = "https://servicewechat.com/";
      if (!this.goC) {
        break label53;
      }
    }
    label53:
    for (this.goH += "preload/";; this.goH = (this.goH + this.mAppId + "/" + this.fdO.fcu.frm.fii + "/")) {
      return this.goH;
    }
  }
  
  private String getPerformanceScript()
  {
    String str = "";
    if (AppBrandPerformanceManager.vi(this.mAppId)) {
      str = WxaCommLibRuntimeReader.qJ("WAPerf.js");
    }
    return str;
  }
  
  private String getRemoteDebugScript()
  {
    String str = "";
    if (this.fdO.aar()) {
      str = ";" + WxaCommLibRuntimeReader.qJ("WARemoteDebug.js");
    }
    return str;
  }
  
  private String getVConsoleScript()
  {
    String str2 = "";
    String str1 = str2;
    if (this.fdO.fcu.fqL)
    {
      str1 = str2;
      if (!this.fdO.aar()) {
        str1 = WxaCommLibRuntimeReader.qJ("WAVConsole.js");
      }
    }
    return str1;
  }
  
  private static String vd(String paramString)
  {
    String str = "";
    int i = 0;
    int j = paramString.indexOf("<script>", i);
    int k = paramString.indexOf("</script>", i);
    if ((j != -1) && (k != -1) && (k > j))
    {
      StringBuilder localStringBuilder = new StringBuilder().append(str);
      if (i > 0) {}
      for (str = ";";; str = "")
      {
        str = str + paramString.substring(j + 8, k);
        i = k + 9;
        break;
      }
    }
    return str;
  }
  
  public final void a(URL paramURL, String paramString, ValueCallback<String> paramValueCallback)
  {
    evaluateJavascript(paramString, paramValueCallback);
  }
  
  final void amd()
  {
    Object localObject1 = new JSONObject();
    Object localObject2;
    if (this.fdO != null)
    {
      a((JSONObject)localObject1, "appType", Integer.valueOf(this.fdO.fct.bGM));
      a((JSONObject)localObject1, "clientVersion", Integer.valueOf(com.tencent.mm.protocal.d.qVN));
      if (this.fdO != null) {
        localObject1 = this.fdO.fcy.aaK();
      }
      localObject2 = new JSONObject();
      a((JSONObject)localObject2, "width", Float.valueOf(getResources().getDisplayMetrics().widthPixels / getResources().getDisplayMetrics().density));
      a((JSONObject)localObject2, "pixelRatio", Float.valueOf(getResources().getDisplayMetrics().density));
      evaluateJavascript(String.format("var __wxConfig = %s;\nvar __deviceInfo__ = %s\n", new Object[] { ((JSONObject)localObject1).toString(), ((JSONObject)localObject2).toString() }), null);
      localObject1 = "";
      if (!this.goD)
      {
        this.goD = true;
        localObject1 = "" + com.tencent.mm.plugin.appbrand.q.c.vM("wxa_library/android.js") + WxaCommLibRuntimeReader.qJ("WAWebview.js");
      }
      localObject2 = localObject1;
      if (this.fdO != null) {
        localObject2 = (String)localObject1 + getVConsoleScript() + getPerformanceScript() + getRemoteDebugScript();
      }
      if (!bi.oW((String)localObject2)) {
        break label302;
      }
      x.v("MicroMsg.AppBrandWebView", "execInitScript, js null");
    }
    for (;;)
    {
      if ((this.fdO != null) && (this.mAppId != null)) {
        break label330;
      }
      return;
      if (!this.goC) {
        break;
      }
      a((JSONObject)localObject1, "preload", Boolean.valueOf(true));
      break;
      label302:
      h.mEJ.a(370L, 1L, 1L, false);
      com.tencent.mm.plugin.appbrand.r.i.a(this, (String)localObject2, new t.4(this));
    }
    label330:
    this.fdO.fcJ.o(3, this.goB - this.goz);
    com.tencent.mm.plugin.appbrand.performance.a.a(this.mAppId, "Native", "WebViewInit+PageFrameLoad", this.goz, this.goB, "");
    if (this.fCQ != null)
    {
      x.i("MicroMsg.AppBrandWebView", "Inject page on frame load finished");
      vc(this.fCQ);
    }
    amc();
  }
  
  public final void destroy()
  {
    super.destroy();
    if (this.goy != null)
    {
      this.goy.cancel();
      this.goy = null;
    }
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    if (!this.fwK)
    {
      this.fsN.add(new Pair(paramString, paramValueCallback));
      return;
    }
    paramString = new t.3(this, paramString, paramValueCallback);
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramString.run();
      return;
    }
    ah.A(paramString);
  }
  
  public final String getPagePath()
  {
    return this.fCQ;
  }
  
  public final String getPageURL()
  {
    return this.gou;
  }
  
  public final String getUserAgentString()
  {
    return this.goF;
  }
  
  public final void init()
  {
    x.i("MicroMsg.AppBrandWebView", "loadPageFrame with url(%s)", new Object[] { getBaseURL() });
    loadUrl(getBaseURL());
  }
  
  public final void setFullscreenImpl(c paramc)
  {
    this.gnB = paramc;
  }
  
  public final void setIsPreload(boolean paramBoolean)
  {
    this.goC = paramBoolean;
  }
  
  public final void setJsExceptionHandler(com.tencent.xweb.d paramd) {}
  
  public final void setOnScrollChangedListener(w paramw)
  {
    this.gov = paramw;
  }
  
  public final void setOnTrimListener(v paramv)
  {
    this.gow = paramv;
  }
  
  public final void setWebViewTitle(String paramString)
  {
    if ((bi.oW(paramString)) || (!com.tencent.mm.sdk.a.b.chp())) {
      return;
    }
    evaluateJavascript("document.title=\"" + paramString + "\"", null);
  }
  
  final void vc(String paramString)
  {
    this.goA = System.currentTimeMillis();
    String str2 = ao.a(this.fdO, paramString);
    if (bi.oW(str2))
    {
      x.e("MicroMsg.AppBrandWebView", "Cache content empty, abort inject");
      return;
    }
    Object localObject;
    label179:
    int i;
    int j;
    if (this.fdO.fcM.alp())
    {
      str1 = "" + ";" + ao.a(this.fdO, "/app-wxss.js");
      paramString = this.fdO.fcM.uB(this.fCQ);
      localObject = new StringBuilder().append(paramString);
      if (paramString.endsWith("/"))
      {
        paramString = "";
        paramString = paramString + "page-frame.js";
        paramString = str1 + ";" + ao.a(this.fdO, paramString);
        i = str2.indexOf("<style>");
        j = str2.indexOf("</style>");
        if ((i != -1) && (j != -i)) {
          break label341;
        }
        str1 = "";
        label213:
        localObject = Base64.encodeToString(str1.getBytes(), 2);
        i = str2.indexOf("<page>");
        j = str2.indexOf("</page>");
        if ((i != -1) && (j != -i)) {
          break label356;
        }
      }
    }
    label341:
    label356:
    for (String str1 = "";; str1 = str2.substring(i + 6, j))
    {
      evaluateJavascript(String.format("var style = document.createElement('style');style.innerHTML = atob(\"%s\");document.head.appendChild(style);var page = document.createElement('page');page.innerHTML = atob(\"%s\");document.body.appendChild(page);%s;%s", new Object[] { localObject, Base64.encodeToString(str1.getBytes(), 2), paramString, vd(str2) }), null);
      return;
      paramString = "/";
      break;
      if (this.goC)
      {
        paramString = vd(ao.a(this.fdO, "/page-frame.html"));
        break label179;
      }
      paramString = "";
      break label179;
      str1 = str2.substring(i + 7, j);
      break label213;
    }
  }
  
  public final <T extends com.tencent.mm.plugin.appbrand.g.c> T y(Class<T> paramClass)
  {
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */