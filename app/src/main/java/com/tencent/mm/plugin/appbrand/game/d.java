package com.tencent.mm.plugin.appbrand.game;

import android.graphics.Point;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g.b;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.l
  implements h
{
  private b fdQ;
  private l fzQ;
  private long fzR;
  private long fzS;
  private long fzT;
  
  private boolean afU()
  {
    return (this.fzQ != null) && (this.fzQ.agn());
  }
  
  private void e(Runnable paramRunnable)
  {
    Object localObject = this.fdO.fcz.getCurrentPage().getCurrentPageView();
    if ((localObject instanceof c)) {}
    for (localObject = (c)localObject; localObject != null; localObject = null)
    {
      ((c)localObject).e(paramRunnable);
      return;
      x.e("MicroMsg.WAGameAppService", "runOnRenderThread can't find the IRenderThreadHandler");
    }
    x.e("MicroMsg.WAGameAppService", "runOnRenderThread can't find the IRenderThreadHandler");
  }
  
  public final void E(int paramInt, String paramString)
  {
    if (!this.Sx) {
      return;
    }
    e(new d.2(this, paramInt, paramString));
  }
  
  protected final b aaE()
  {
    this.fdQ = new g(this);
    this.fzQ = new l(this, this.fdQ);
    return this.fdQ;
  }
  
  protected final com.tencent.mm.plugin.appbrand.jsapi.d aaF()
  {
    com.tencent.mm.plugin.appbrand.jsapi.d locald = new com.tencent.mm.plugin.appbrand.jsapi.d(this, this.fdQ);
    this.fdQ.addJavascriptInterface(locald, "WeixinJSCore");
    return locald;
  }
  
  public final void cleanup()
  {
    super.cleanup();
  }
  
  protected final JSONObject f(JSONObject paramJSONObject)
  {
    super.f(paramJSONObject);
    AppBrandSysConfig localAppBrandSysConfig = this.fdO.fcu;
    Object localObject1 = null;
    try
    {
      localObject2 = paramJSONObject.optJSONObject("wxAppInfo");
      localObject1 = localObject2;
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        Object localObject2;
      }
    }
    if (localObject1 == null)
    {
      localObject1 = new JSONObject();
      try
      {
        localObject2 = new JSONArray();
        int i = 0;
        while (i < localAppBrandSysConfig.frn.fpV.length)
        {
          ((JSONArray)localObject2).put(localAppBrandSysConfig.frn.fpV[i]);
          i += 1;
        }
        a((JSONObject)localObject1, "subContextImgDomain", localObject2);
      }
      catch (Exception localException1)
      {
        float f;
        for (;;) {}
      }
      a(paramJSONObject, "wxAppInfo", localObject1);
      localObject1 = new Point();
      m.fAw.d((Point)localObject1);
      f = a.getDensity(getContext());
      x.i("MicroMsg.WAGameAppService", "dm.widthPixels %d, dm.heightPixels %d", new Object[] { Integer.valueOf(((Point)localObject1).x), Integer.valueOf(((Point)localObject1).y) });
      if (com.tencent.mm.plugin.appbrand.config.d.p(this.fdO))
      {
        x.i("MicroMsg.WAGameAppService", "screen in right orientation");
        a(paramJSONObject, "screenWidth", Float.valueOf(((Point)localObject1).x / f));
        a(paramJSONObject, "screenHeight", Float.valueOf(((Point)localObject1).y / f));
      }
      for (;;)
      {
        a(paramJSONObject, "devicePixelRatio", Float.valueOf(f));
        if (afU()) {
          a(paramJSONObject, "isIsolateContext", Boolean.valueOf(true));
        }
        return paramJSONObject;
        x.w("MicroMsg.WAGameAppService", "screen in reverse orientation");
        a(paramJSONObject, "screenWidth", Float.valueOf(((Point)localObject1).y / f));
        a(paramJSONObject, "screenHeight", Float.valueOf(((Point)localObject1).x / f));
      }
    }
  }
  
  public final void init()
  {
    x.i("MicroMsg.WAGameAppService", "WAGameAppService.init");
    if (this.fdO != null) {
      this.fdO.fcJ.o(7, this.fdW);
    }
    e(new d.1(this));
  }
  
  public final void j(String paramString1, String paramString2, int paramInt)
  {
    if (!this.Sx) {
      return;
    }
    e(new d.3(this, paramString1, paramString2, paramInt));
  }
  
  public final void qw(String paramString)
  {
    x.i("MicroMsg.WAGameAppService", "hy: do nothing in game service when called from modularizing helper");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */