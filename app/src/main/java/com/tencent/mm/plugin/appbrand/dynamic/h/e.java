package com.tencent.mm.plugin.appbrand.dynamic.h;

import android.content.Context;
import android.os.Bundle;
import com.tencent.mm.plugin.appbrand.appcache.af;
import com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetContext;
import com.tencent.mm.plugin.appbrand.dynamic.d.p;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.j;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetRuntimeConfig;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetSysConfig;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.u.a.a;
import com.tencent.mm.u.c.b;
import com.tencent.xweb.g;
import com.tencent.xweb.g.a;
import org.json.JSONObject;

public class e
{
  private static volatile com.tencent.mm.u.c.e fxv;
  private static volatile DebuggerInfo fxw;
  private static volatile boolean fxx;
  
  public static com.tencent.mm.u.c.e a(Context paramContext, WxaWidgetContext paramWxaWidgetContext, com.tencent.mm.u.d.a parama, Bundle paramBundle)
  {
    for (;;)
    {
      try
      {
        Object localObject2 = fxv;
        fxv = null;
        Object localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = a(paramWxaWidgetContext.afc());
        }
        int i = paramBundle.getInt("widget_type");
        localObject2 = new com.tencent.mm.plugin.appbrand.dynamic.d.a.c();
        if (i == 1) {
          ((com.tencent.mm.plugin.appbrand.dynamic.d.a.c)localObject2).fws = new com.tencent.mm.plugin.appbrand.dynamic.i.c(paramWxaWidgetContext.getAppId(), paramBundle.getString("search_id"));
        }
        paramBundle = new com.tencent.mm.u.c.c(paramContext, (com.tencent.mm.u.c.e)localObject1, parama, (b)localObject2);
        paramBundle.doN = p.kc(i);
        ((com.tencent.mm.u.c.e)localObject1).doV = paramBundle;
        paramBundle = ((com.tencent.mm.u.c.e)localObject1).doX;
        ((com.tencent.mm.u.c.e)localObject1).doW = new com.tencent.mm.u.c.f(paramBundle, com.tencent.mm.plugin.appbrand.dynamic.f.a.kd(i), parama);
        ((com.tencent.mm.u.c.e)localObject1).doZ = com.tencent.mm.plugin.appbrand.dynamic.debugger.a.afi();
        parama = paramWxaWidgetContext.afe();
        localObject2 = new JSONObject();
        b((JSONObject)localObject2, "widgetType", Integer.valueOf(parama.fwV));
        b((JSONObject)localObject2, "platform", "android");
        b((JSONObject)localObject2, "debug", Boolean.valueOf(paramWxaWidgetContext.afc().fvD));
        b((JSONObject)localObject2, "drawMinInterval", Integer.valueOf(paramWxaWidgetContext.afd().fpQ));
        b((JSONObject)localObject2, "clientVersion", Integer.valueOf(com.tencent.mm.protocal.d.qVN));
        JSONObject localJSONObject = new JSONObject();
        b(localJSONObject, "drawMinInterval", Integer.valueOf(parama.fxl));
        b(localJSONObject, "timerEnabled", Boolean.valueOf(parama.fxm));
        b(localJSONObject, "drawLock", Boolean.valueOf(parama.fxn));
        parama = String.format("var __widgetConfig__ = %s;var __wxConfig = %s;var __wxIndexPage = \"%s\"", new Object[] { localJSONObject.toString(), ((JSONObject)localObject2).toString(), "" });
        paramBundle.evaluateJavascript(parama, null);
        x.v("MicroMsg.PreloadOptimizer", "injectConfig(%s, %s)", new Object[] { paramWxaWidgetContext.getId(), parama });
        parama = com.tencent.mm.plugin.appbrand.dynamic.j.c.bj(paramWxaWidgetContext.getId(), "WAWidget.js");
        if (bi.oW(parama))
        {
          parama = com.tencent.mm.plugin.appbrand.q.c.convertStreamToString(af.openRead("WAWidget.js"));
          if (bi.oW(parama)) {
            x.e("MicroMsg.PreloadOptimizer", "get Null Or Nil widget js");
          }
          h.mEJ.a(636L, 0L, 1L, false);
          com.tencent.mm.u.a.a(paramBundle, parama, new a.a()
          {
            public final void CT()
            {
              h.mEJ.a(636L, 1L, 1L, false);
            }
            
            public final void fM(String paramAnonymousString)
            {
              j.aeV().C(this.fxy.getId(), 626, 26);
              h.mEJ.a(636L, 2L, 1L, false);
              x.e("MicroMsg.PreloadOptimizer", "Inject SDK widget Script Failed: %s", new Object[] { paramAnonymousString });
            }
          });
          x.v("MicroMsg.PreloadOptimizer", "injectWAWidget(%s)", new Object[] { paramWxaWidgetContext.getId() });
          parama = com.tencent.mm.plugin.appbrand.dynamic.j.c.bj(paramWxaWidgetContext.getId(), "widget.js");
          if (bi.oW(parama))
          {
            x.e("MicroMsg.PreloadOptimizer", "get Null Or Nil widget js");
            com.tencent.mm.plugin.appbrand.dynamic.f.aeS().ax(paramWxaWidgetContext.getId(), 2102);
          }
          h.mEJ.a(636L, 3L, 1L, false);
          com.tencent.mm.u.a.a(paramBundle, parama, new a.a()
          {
            public final void CT()
            {
              h.mEJ.a(636L, 4L, 1L, false);
            }
            
            public final void fM(String paramAnonymousString)
            {
              h.mEJ.a(636L, 5L, 1L, false);
              x.e("MicroMsg.PreloadOptimizer", "Inject External widget Script Failed: %s", new Object[] { paramAnonymousString });
            }
          });
          x.v("MicroMsg.PreloadOptimizer", "injectWidget(%s)", new Object[] { paramWxaWidgetContext.getId() });
          cv(paramContext);
          return (com.tencent.mm.u.c.e)localObject1;
        }
      }
      finally {}
    }
  }
  
  private static com.tencent.mm.u.c.e a(DebuggerInfo paramDebuggerInfo)
  {
    com.tencent.mm.u.c.e locale = new com.tencent.mm.u.c.e();
    int j = 0;
    int i = j;
    if (paramDebuggerInfo != null)
    {
      i = j;
      if (paramDebuggerInfo.fvE)
      {
        x.i("MicroMsg.PreloadOptimizer", "debug mode opened, use WebView  JavaScript Engine.");
        i = 1;
      }
    }
    paramDebuggerInfo = ad.getContext();
    if (i != 0)
    {
      paramDebuggerInfo = new com.tencent.mm.plugin.appbrand.dynamic.e.d(paramDebuggerInfo, locale, "WeixinJSCore", "https://servicewechat.com/app-widget");
      if (!paramDebuggerInfo.CZ()) {
        break label174;
      }
      h.mEJ.a(639L, 1L, 1L, false);
      x.i("MicroMsg.PreloadOptimizer", "Using WebView Based Javascript Engine");
    }
    for (;;)
    {
      h.mEJ.a(639L, 0L, 1L, false);
      if (locale.doX == null) {
        break label199;
      }
      x.e("MicroMsg.MiniJsBridge", "can not initialize again.");
      return locale;
      g localg = g.a(g.a.vAc, "support", paramDebuggerInfo);
      if (localg.isValid())
      {
        paramDebuggerInfo = new com.tencent.mm.plugin.appbrand.dynamic.e.a(locale, "WeixinJSCore", localg);
        break;
      }
      paramDebuggerInfo = new com.tencent.mm.plugin.appbrand.dynamic.e.d(paramDebuggerInfo, locale, "WeixinJSCore", "https://servicewechat.com/app-widget");
      break;
      label174:
      h.mEJ.a(639L, 2L, 1L, false);
      x.i("MicroMsg.PreloadOptimizer", "Using v8 Javascript Engine");
    }
    label199:
    locale.doX = paramDebuggerInfo;
    return locale;
  }
  
  private static void b(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    try
    {
      paramJSONObject.put(paramString, paramObject);
      return;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.PreloadOptimizer", "put env arguments error, %s", new Object[] { paramJSONObject });
    }
  }
  
  public static void cv(Context paramContext)
  {
    if (!fxx) {
      return;
    }
    com.tencent.mm.bu.a.ab(new e.1(paramContext));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/h/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */