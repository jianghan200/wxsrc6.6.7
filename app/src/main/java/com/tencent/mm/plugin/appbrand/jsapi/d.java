package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.permission.c.a;
import com.tencent.mm.plugin.appbrand.report.a.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
{
  boolean Sx;
  final c fEJ;
  private final com.tencent.mm.plugin.appbrand.g.b fEK;
  private final Map<String, e> fEL;
  private int fEM = 0;
  private ConcurrentHashMap<Integer, String> fEN = new ConcurrentHashMap();
  public Handler fwr;
  
  public d(com.tencent.mm.plugin.appbrand.game.d paramd, com.tencent.mm.plugin.appbrand.g.b paramb)
  {
    this(paramd, paramb, com.tencent.mm.plugin.appbrand.game.d.c.agz());
  }
  
  private d(c paramc, com.tencent.mm.plugin.appbrand.g.b paramb, Map<String, e> paramMap)
  {
    this.fEJ = paramc;
    this.fEK = paramb;
    this.Sx = true;
    this.fEL = paramMap;
    paramc = new HandlerThread("AppBrandAsyncJSThread");
    paramc.start();
    this.fwr = new Handler(paramc.getLooper());
  }
  
  public d(com.tencent.mm.plugin.appbrand.l paraml, com.tencent.mm.plugin.appbrand.g.b paramb)
  {
    this(paraml, paramb, i.ahN());
  }
  
  public d(p paramp, com.tencent.mm.plugin.appbrand.g.b paramb)
  {
    this(paramp, paramb, i.ahO());
  }
  
  private static String H(String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("errMsg", paramString1 + ":" + paramString2);
    return new JSONObject(localHashMap).toString();
  }
  
  private String a(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    if ((this.fEJ.getRuntime() == null) || (!this.fEJ.isRunning()))
    {
      paramString2 = H(paramString1, "fail:interrupted");
      return paramString2;
    }
    e locale = (e)this.fEL.get(paramString1);
    paramString1 = com.tencent.mm.plugin.appbrand.permission.c.u(this.fEJ.getRuntime()).a(this.fEJ, locale, new d.3(this, paramString1, paramString2, paramInt, paramBoolean, locale));
    if (3 == paramString1.code) {
      return "";
    }
    if (paramString1.code != 1) {
      paramString1 = locale.f(paramString1.bIr, null);
    }
    for (;;)
    {
      if (paramString1 != null) {
        this.fEJ.fEE.H(paramInt, paramString1);
      }
      if (!paramBoolean) {
        break label204;
      }
      paramString2 = paramString1;
      if (!bi.oW(paramString1)) {
        break;
      }
      return "{}";
      paramString1 = ti(paramString2);
      if (paramString1 == null)
      {
        paramString1 = locale.f("fail:invalid data", null);
      }
      else if (paramBoolean)
      {
        paramString1 = ((n)locale).a(this.fEJ, paramString1);
      }
      else
      {
        ((a)locale).a(this.fEJ, paramString1, paramInt);
        paramString1 = null;
      }
    }
    label204:
    if (paramString1 != null) {
      this.fEJ.E(paramInt, paramString1);
    }
    return "";
  }
  
  private static JSONObject ti(String paramString)
  {
    String str = paramString;
    try
    {
      if (bi.oW(paramString)) {
        str = "{}";
      }
      paramString = new JSONObject(str);
      return paramString;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.AppBrandJSInterface", paramString.getMessage());
    }
    return null;
  }
  
  static int[] tj(String paramString)
  {
    int i = 0;
    localObject2 = new int[0];
    Object localObject1 = localObject2;
    try
    {
      JSONArray localJSONArray = new JSONArray(paramString);
      localObject1 = localObject2;
      paramString = new int[localJSONArray.length()];
      for (;;)
      {
        localObject1 = paramString;
        localObject2 = paramString;
        if (i >= localJSONArray.length()) {
          break;
        }
        localObject1 = paramString;
        paramString[i] = localJSONArray.getInt(i);
        i += 1;
      }
      return (int[])localObject2;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.AppBrandJSInterface", paramString.getMessage());
      localObject2 = localObject1;
    }
  }
  
  public final void cleanup()
  {
    this.fwr.getLooper().quit();
    this.Sx = false;
    this.fEN.clear();
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final String invokeHandler(String paramString1, String paramString2, int paramInt)
  {
    long l = System.currentTimeMillis();
    for (;;)
    {
      try
      {
        paramInt = this.fEJ.a(this.fEK, paramInt);
        e locale = (e)this.fEL.get(paramString1);
        if (locale == null)
        {
          this.fEJ.E(paramInt, H(paramString1, "fail:not supported"));
          return "fail:not supported";
        }
        boolean bool = locale instanceof n;
        j localj = this.fEJ.fEE;
        c localc = this.fEJ;
        if (this.fEJ.getRuntime() == null)
        {
          localObject = "";
          if (!h.adV(locale.getName())) {
            localj.fFi.put(Integer.valueOf(paramInt), new j.a(localc, locale, paramString2, System.currentTimeMillis(), (String)localObject));
          }
          if (!bool) {
            break label282;
          }
          localObject = a(paramString1, paramString2, paramInt, true);
          if (com.tencent.mm.compatible.loader.a.a(o.fFq, locale.getClass())) {
            break label326;
          }
          paramInt = 1;
          if (paramInt == 0) {
            break label316;
          }
          if (paramString2 != null) {
            break label308;
          }
          paramInt = 0;
          x.i("MicroMsg.AppBrandJSInterface", "invokeHandler, api: %s, data size: %d, sync: %b, time: %d", new Object[] { paramString1, Integer.valueOf(paramInt), Boolean.valueOf(bool), Long.valueOf(System.currentTimeMillis() - l) });
          return (String)localObject;
        }
      }
      catch (Exception paramString2)
      {
        x.printErrStackTrace("MicroMsg.AppBrandJSInterface", paramString2, " Invoke Error %s", new Object[] { paramString1 });
        throw paramString2;
      }
      Object localObject = this.fEJ.getRuntime().fcz;
      if ((localObject != null) && (((com.tencent.mm.plugin.appbrand.page.n)localObject).getCurrentPage() != null))
      {
        localObject = ((com.tencent.mm.plugin.appbrand.page.n)localObject).getCurrentPage().getCurrentUrl();
        continue;
        label282:
        this.fwr.post(new d.2(this, paramString1, paramString2, paramInt));
        localObject = "";
        continue;
        label308:
        paramInt = paramString2.length();
        continue;
        label316:
        return (String)localObject;
      }
      else
      {
        localObject = "";
        continue;
        label326:
        paramInt = 0;
      }
    }
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final boolean isDebugPackage()
  {
    return com.tencent.mm.sdk.a.b.chp();
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void publishHandler(String paramString1, String paramString2, String paramString3)
  {
    int i = 0;
    this.fwr.post(new d.1(this, paramString1, paramString2, paramString3));
    if (paramString2 == null) {}
    for (;;)
    {
      x.d("MicroMsg.AppBrandJSInterface", "publishHandler, event: %s, data size: %d, data : %s", new Object[] { paramString1, Integer.valueOf(i), paramString2 });
      return;
      i = paramString2.length();
    }
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final String retrieveEvent(int paramInt)
  {
    String str2 = (String)this.fEN.get(Integer.valueOf(paramInt));
    this.fEN.remove(Integer.valueOf(paramInt));
    String str1 = str2;
    if (str2 == null) {
      str1 = "";
    }
    return str1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */