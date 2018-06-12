package com.tencent.mm.plugin.appbrand.jsapi.p;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.s.f;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.plugin.webview.ui.tools.widget.f;
import com.tencent.mm.plugin.webview.ui.tools.widget.f.a;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.MMFalseProgressBar;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.o;
import java.io.File;
import java.util.LinkedList;
import org.json.JSONObject;

public final class a
  extends FrameLayout
  implements c.c
{
  private MMFalseProgressBar dEm;
  private MMWebView dEn;
  private com.tencent.mm.plugin.appbrand.page.p fFv;
  private b gcD;
  private final c.b gcE;
  private String gcF = "";
  private boolean gcG = true;
  private boolean gcH = false;
  private o gcI = new a.2(this);
  private com.tencent.xweb.x5.a.a.a.a.b gcJ = new a.3(this);
  private String mAppId;
  
  public a(Context paramContext, com.tencent.mm.plugin.appbrand.g paramg, com.tencent.mm.plugin.appbrand.page.p paramp)
  {
    super(paramContext);
    this.mAppId = paramg.mAppId;
    this.gcD = new b();
    this.gcD.a(paramp);
    this.fFv = paramp;
    this.dEn = f.a.qkE.cS(paramContext);
    this.dEn.getSettings().cIv();
    this.dEn.getSettings().setJavaScriptEnabled(true);
    this.dEn.getSettings().setMediaPlaybackRequiresUserGesture(false);
    this.dEn.getSettings().cIx();
    this.dEn.getSettings().setUserAgentString(s.aV(getContext(), this.dEn.getSettings().getUserAgentString()) + " miniProgram");
    this.dEn.getView().setHorizontalScrollBarEnabled(false);
    this.dEn.getView().setVerticalScrollBarEnabled(false);
    this.dEn.getSettings().setBuiltInZoomControls(true);
    this.dEn.getSettings().setUseWideViewPort(true);
    this.dEn.getSettings().setLoadWithOverviewMode(true);
    this.dEn.getSettings().cIq();
    this.dEn.getSettings().cIp();
    this.dEn.getSettings().setGeolocationEnabled(true);
    this.dEn.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    this.dEn.getSettings().cIt();
    this.dEn.getSettings().setAppCachePath(getContext().getDir("webviewcache", 0).getAbsolutePath());
    this.dEn.getSettings().cIs();
    this.dEn.getSettings().cIu();
    this.dEn.getSettings().setDatabasePath(com.tencent.mm.loader.stub.b.duM + "databases/");
    this.dEn.setCompetitorView(paramp.gnt);
    this.dEn.cAy();
    this.dEn.setWebViewCallbackClient(this.gcI);
    if (this.dEn.getIsX5Kernel()) {
      this.dEn.setWebViewClientExtension(this.gcJ);
    }
    addView(this.dEn, new ViewGroup.LayoutParams(-1, -1));
    this.dEm = new MMFalseProgressBar(paramContext);
    this.dEm.setProgressDrawable(com.tencent.mm.bp.a.f(paramContext, s.f.mm_webview_progress_horizontal));
    addView(this.dEm, new ViewGroup.LayoutParams(-1, com.tencent.mm.bp.a.fromDPToPix(paramContext, 3)));
    this.gcE = ((c.a)com.tencent.mm.kernel.g.l(c.a.class)).a(this);
    this.fFv.a(new a.1(this));
    getReporter().gsF = true;
  }
  
  private void a(com.tencent.mm.plugin.appbrand.page.p paramp, String paramString)
  {
    paramp.getContentView().post(new a.4(this, paramp, paramString));
  }
  
  private void akp()
  {
    this.dEn.evaluateJavascript("window.__wxjs_environment = \"miniprogram\";", null);
  }
  
  private com.tencent.mm.plugin.appbrand.report.a.p getReporter()
  {
    return this.fFv.fdO.fcz.getReporter().gqY;
  }
  
  public final boolean akm()
  {
    if (getWebView().canGoBack())
    {
      getReporter().b(this.fFv, true);
      getWebView().goBack();
      this.gcH = true;
      return true;
    }
    getReporter().b(this.fFv, false);
    return false;
  }
  
  public final void akn()
  {
    akp();
    this.dEm.start();
  }
  
  public final void ako()
  {
    this.fFv.fdO.fcz.agJ();
  }
  
  public final boolean akq()
  {
    if (this.fFv.fdO.fcu.fqw) {
      return this.fFv.fdO.fcu.fqO;
    }
    return this.fFv.fdO.fcu.fqL;
  }
  
  public final String getAppId()
  {
    return this.mAppId;
  }
  
  public final String[] getJsApiReportArgs()
  {
    com.tencent.mm.plugin.appbrand.page.p localp = this.fFv;
    com.tencent.mm.plugin.appbrand.g localg = localp.fdO;
    AppBrandStatObject localAppBrandStatObject = localg.fcE;
    Object localObject2 = j.g(localg);
    Object localObject1 = localp.alS();
    String str1 = localAppBrandStatObject.scene;
    String str2 = localAppBrandStatObject.bGG;
    String str3 = localg.mAppId;
    String str4 = localg.fcu.frm.fii;
    localObject2 = ((j)localObject2).fdE;
    String str5 = localg.fcu.frm.fih + 1;
    String str6 = localAppBrandStatObject.gqK;
    String str7 = localp.getURL();
    if (localObject1 == null) {}
    for (localObject1 = "";; localObject1 = ((a)localObject1).getWebView().getUrl()) {
      return new String[] { str1, str2, str3, str4, localObject2, str5, str6, str7, localObject1, com.tencent.mm.plugin.appbrand.report.a.cH(localp.mContext), "", "", "", "", "", "", localAppBrandStatObject.cbB, localAppBrandStatObject.cbC, localg.fct.bGM + 1000 };
    }
  }
  
  public final MMWebView getWebView()
  {
    return this.dEn;
  }
  
  public final void runOnUiThread(Runnable paramRunnable)
  {
    post(paramRunnable);
  }
  
  public final void setCurrentURL(String paramString)
  {
    this.gcF = paramString;
    if (!bi.oW(paramString))
    {
      paramString = Uri.parse(paramString).getHost();
      if (!bi.oW(paramString))
      {
        paramString = getContext().getString(s.j.webview_logo_url, new Object[] { paramString });
        a(this.fFv, paramString);
        return;
      }
    }
    a(this.fFv, "");
  }
  
  public final void ud(String paramString)
  {
    this.fFv.sZ(paramString);
  }
  
  public final void ue(String paramString)
  {
    akp();
    this.dEm.finish();
    if ((!this.gcG) && (!this.gcH))
    {
      com.tencent.mm.plugin.appbrand.report.a.p localp = getReporter();
      com.tencent.mm.plugin.appbrand.page.p localp1 = this.fFv;
      String str = this.gcF;
      localp.grK = ((String)localp.gsD.peekFirst());
      localp.grL = 2;
      localp.grM = paramString;
      localp.gsD.push(str);
      localp.k(localp1);
    }
    this.gcG = false;
    this.gcH = false;
    setCurrentURL(paramString);
  }
  
  public final void w(JSONObject paramJSONObject)
  {
    this.gcD.mData = paramJSONObject.toString();
    this.gcD.ahM();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/p/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */