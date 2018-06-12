package com.tencent.mm.plugin.appbrand;

import android.webkit.JavascriptInterface;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.ao;
import com.tencent.mm.plugin.appbrand.debugger.r;
import com.tencent.mm.plugin.appbrand.g.a;
import com.tencent.mm.plugin.appbrand.g.f;
import com.tencent.mm.plugin.appbrand.r.i;
import com.tencent.mm.plugin.appbrand.r.i.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Locale;
import org.json.JSONObject;

public class c
{
  final l fbP;
  private final f fbQ;
  private final a fbR;
  
  public c(l paraml, f paramf)
  {
    this.fbP = paraml;
    this.fbQ = paramf;
    this.fbR = paramf.agh();
  }
  
  public void aad()
  {
    this.fbQ.agg().a(this.fbR, "WeixinJSContext");
  }
  
  public a aae()
  {
    return this.fbQ.agh();
  }
  
  public String aaf()
  {
    return WxaCommLibRuntimeReader.qJ("WASubContext.js");
  }
  
  public void aag() {}
  
  public void aah() {}
  
  public void cq(boolean paramBoolean) {}
  
  public void cr(boolean paramBoolean) {}
  
  @JavascriptInterface
  public final int create(final String paramString)
  {
    x.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s) appScriptPath(%s)", new Object[] { this.fbP.mAppId, paramString });
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s), nil appScriptPath", new Object[] { this.fbP.mAppId });
      return -1;
    }
    a locala = aae();
    if (locala == null)
    {
      x.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s), scriptPath(%s), allocJsContext failed", new Object[] { this.fbP.mAppId, paramString });
      return -2;
    }
    this.fbR.a(locala, "WeixinJSContext");
    locala.evaluateJavascript(String.format(Locale.US, "var __wxConfig = %s;", new Object[] { this.fbP.aaK().toString() }), null);
    String str = aaf();
    if (bi.oW(str))
    {
      x.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s), scriptPath(%s), sdkScript 404", new Object[] { this.fbP.mAppId, paramString });
      aag();
      return 0;
    }
    i.a(locala, str, new c.1(this, paramString));
    str = ao.a(this.fbP.fdO, paramString);
    if (bi.oW(str))
    {
      x.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s), scriptPath(%s), appScript 404", new Object[] { this.fbP.mAppId, paramString });
      aah();
      return -1;
    }
    i.a(locala, paramString, str, new i.a()
    {
      public final void fM(String paramAnonymousString)
      {
        x.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s), scriptPath(%s), appScript inject failed", new Object[] { c.this.fbP.mAppId, paramString });
        c.this.cr(false);
      }
      
      public final void qe(String paramAnonymousString)
      {
        x.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s), scriptPath(%s), appScript inject succeed", new Object[] { c.this.fbP.mAppId, paramString });
        c.this.cr(true);
      }
    });
    r.a(this.fbP.fdO, locala, paramString);
    x.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s) appScriptPath(%s), success with contextId(%d)", new Object[] { this.fbP.mAppId, paramString, Integer.valueOf(locala.afW()) });
    return locala.afW();
  }
  
  @JavascriptInterface
  public final void destroy(int paramInt)
  {
    this.fbQ.km(paramInt);
  }
  
  @JavascriptInterface
  public final int evaluateScriptFile(int paramInt, String paramString)
  {
    x.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) contextId(%d) appScriptPath(%s)", new Object[] { this.fbP.mAppId, Integer.valueOf(paramInt), paramString });
    a locala = this.fbQ.kl(paramInt);
    if (locala == null)
    {
      x.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) contextId(%d), appScriptPath(%s), get null context", new Object[] { this.fbP.mAppId, Integer.valueOf(paramInt), paramString });
      return -1;
    }
    if (locala.afV())
    {
      x.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) scriptPath(%s), but want to inject main-context", new Object[] { this.fbP.mAppId, paramString });
      return -1;
    }
    String str = ao.a(this.fbP.fdO, paramString);
    if (bi.oW(str))
    {
      x.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) contextId(%d), appScriptPath(%s), script 404", new Object[] { this.fbP.mAppId, Integer.valueOf(paramInt), paramString });
      aah();
      return 0;
    }
    i.a(locala, paramString, str, new c.3(this, locala, paramString));
    r.a(this.fbP.fdO, locala, paramString);
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */