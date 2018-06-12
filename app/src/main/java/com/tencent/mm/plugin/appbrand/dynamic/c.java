package com.tencent.mm.plugin.appbrand.dynamic;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mm.model.u.b;
import com.tencent.mm.modelappbrand.s;
import com.tencent.mm.protocal.c.su;
import com.tencent.mm.protocal.c.sv;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.u.b.d;
import com.tencent.mm.u.c.e.a;
import java.util.Iterator;
import java.util.Set;

public final class c
  implements com.tencent.mm.plugin.appbrand.canvas.widget.b
{
  boolean Sx;
  String appId;
  volatile com.tencent.mm.u.c.e doR;
  String doU;
  String fmS;
  Runnable fuA;
  int fuq;
  String fur;
  boolean fus;
  com.tencent.mm.plugin.appbrand.widget.g fut;
  String fuu;
  volatile boolean fuv;
  private volatile boolean fuw;
  boolean fux = false;
  boolean fuy = false;
  private com.tencent.mm.ipcinvoker.wx_extension.b.a fuz;
  Context mContext;
  String mUrl;
  
  public c(Context paramContext)
  {
    this.mContext = paramContext;
    this.fuz = new c.1(this);
    this.fuA = new Runnable()
    {
      public final void run()
      {
        c.this.aeP();
      }
    };
  }
  
  static void a(com.tencent.mm.u.c.e parame, com.tencent.mm.plugin.appbrand.widget.g paramg)
  {
    boolean bool2 = false;
    if ((parame == null) || (paramg == null) || (bi.oW(paramg.field_data)))
    {
      if (parame == null) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        if (paramg == null) {
          bool2 = true;
        }
        x.i("MicroMsg.DynamicPageViewIPCProxy", "pushData failed, jsBridge(isNull : %s) or cacheData(isNull : %s) or cacheData.field_data is null", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        return;
      }
    }
    s.i("MicroMsg.DynamicPageViewIPCProxy", "pushData %s", new Object[] { paramg.field_id });
    com.tencent.mm.plugin.appbrand.dynamic.f.c localc = new com.tencent.mm.plugin.appbrand.dynamic.f.c();
    localc.data = paramg.field_data;
    parame.a(localc);
    parame = new Bundle();
    parame.putString("widgetId", paramg.field_id);
    parame.putString("respData", paramg.field_data);
    com.tencent.mm.ipcinvoker.f.a("com.tencent.mm:tools", parame, a.class, null);
  }
  
  final void aeP()
  {
    if (this.fus) {}
    com.tencent.mm.plugin.appbrand.widget.g localg;
    do
    {
      return;
      localg = this.fut;
    } while ((localg == null) || (!this.Sx));
    if (this.fuv)
    {
      this.fuw = true;
      return;
    }
    if (bi.oW(localg.field_appId))
    {
      x.e("MicroMsg.DynamicPageViewIPCProxy", "tryToRefresh(%s) failed, has no appId", new Object[] { this.doU });
      return;
    }
    this.fuw = false;
    long l = localg.field_updateTime + localg.field_interval * 1000L - System.currentTimeMillis();
    if (l > 0L)
    {
      x.i("MicroMsg.DynamicPageViewIPCProxy", "post delay refresh(%s) data.", new Object[] { Long.valueOf(l) });
      b.e(this.fuA, l);
      return;
    }
    x.i("MicroMsg.DynamicPageViewIPCProxy", "refresh data(%s, %s, %s)", new Object[] { this.fut.field_id, this.fut.field_appId, this.fut.field_cacheKey });
    s.i("MicroMsg.DynamicPageViewIPCProxy", "refresh data(%s, %s, %s)", new Object[] { this.fut.field_id, this.fut.field_appId, this.fut.field_cacheKey });
    com.tencent.mm.ab.b.a locala = new com.tencent.mm.ab.b.a();
    locala.dIF = 1193;
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/getdynamicdata";
    su localsu = new su();
    localsu.bPS = localg.field_appId;
    localsu.aAL = localg.field_cacheKey;
    localsu.scene = this.fuq;
    localsu.bWm = this.fur;
    localsu.url = this.mUrl;
    locala.dIG = localsu;
    locala.dIH = new sv();
    com.tencent.mm.ipcinvoker.wx_extension.b.a(locala.KT(), this.fuz);
  }
  
  public final boolean bg(String paramString1, String paramString2)
  {
    if ((this.doR == null) || (TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2))) {
      return false;
    }
    com.tencent.mm.u.c.f localf = this.doR.doW;
    Object localObject = localf.dpa.fO(paramString1);
    if (localObject == null)
    {
      x.i("MicroMsg.MiniJsEventDispatcher", "JsEvent(%s) do not exist.", new Object[] { paramString1 });
      return false;
    }
    if (!localf.doM.gu(((com.tencent.mm.u.b.e)localObject).getIndex()))
    {
      x.i("MicroMsg.MiniJsEventDispatcher", "JsEvent(%s) no permission.", new Object[] { paramString1 });
      return false;
    }
    localObject = paramString2;
    if (bi.oW(paramString2)) {
      localObject = "{}";
    }
    x.d("MicroMsg.MiniJsEventDispatcher", "dispatch, event: %s, data size: %s, srcId: %d", new Object[] { paramString1, Integer.valueOf(((String)localObject).length()), Integer.valueOf(0) });
    localf.doX.evaluateJavascript(String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler(\"%s\", %s, %s, %s)", new Object[] { paramString1, localObject, "undefined", com.tencent.mm.u.c.f.Db() }), null);
    return true;
  }
  
  final void cleanup()
  {
    if (this.fut != null) {
      x.i("MicroMsg.DynamicPageViewIPCProxy", "cleanup(%s, %s, %s)", new Object[] { this.fut.field_id, this.fut.field_appId, this.fut.field_cacheKey });
    }
    for (;;)
    {
      if (this.doR != null)
      {
        com.tencent.mm.u.c.e locale = this.doR;
        x.v("MicroMsg.MiniJsBridge", "onStop(%s)", new Object[] { locale.doU });
        locale.Sx = false;
        locale.doX.cleanup();
        com.tencent.mm.u.c.c localc = locale.doV;
        localc.doO.quit();
        localc.doL.doS.recycle();
        if (locale.doZ != null)
        {
          locale.doZ.C(locale.doU, 4);
          locale.doZ = null;
        }
      }
      return;
      x.i("MicroMsg.DynamicPageViewIPCProxy", "cleanup");
    }
  }
  
  public final boolean isPaused()
  {
    return this.fuv;
  }
  
  public final void n(Bundle paramBundle)
  {
    if (paramBundle == null) {
      break label4;
    }
    for (;;)
    {
      label4:
      return;
      if (this.doR != null)
      {
        u.b localb = this.doR.doV.doL.doS;
        if (localb == null) {
          break;
        }
        Object localObject = paramBundle.keySet();
        if ((localObject == null) || (localb == null)) {
          break;
        }
        localObject = ((Set)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          localb.p(str, paramBundle.get(str));
        }
      }
    }
  }
  
  public final void onPause()
  {
    x.i("MicroMsg.DynamicPageViewIPCProxy", "onPause(%s)", new Object[] { this.doU });
    this.fuv = true;
    if (this.doR != null) {
      this.doR.b(new com.tencent.mm.plugin.appbrand.dynamic.f.f());
    }
  }
  
  public final void onResume()
  {
    x.i("MicroMsg.DynamicPageViewIPCProxy", "onResume(%s)", new Object[] { this.doU });
    boolean bool = this.fuv;
    if (this.doR != null) {
      this.doR.c(new com.tencent.mm.plugin.appbrand.dynamic.f.g());
    }
    this.fuv = false;
    if ((bool) && (this.fuw)) {
      aeP();
    }
  }
  
  private static class a
    implements com.tencent.mm.ipcinvoker.a<Bundle, Bundle>
  {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */