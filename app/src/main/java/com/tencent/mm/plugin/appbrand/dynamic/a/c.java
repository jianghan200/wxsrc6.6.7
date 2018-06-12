package com.tencent.mm.plugin.appbrand.dynamic.a;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.modelappbrand.f;
import com.tencent.mm.modelappbrand.j;
import com.tencent.mm.modelappbrand.l;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetInitializer;
import com.tencent.mm.plugin.appbrand.dynamic.h.a.a;
import com.tencent.mm.plugin.appbrand.dynamic.i;
import com.tencent.mm.plugin.appbrand.dynamic.j.a.1;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView.3;
import com.tencent.mm.plugin.appbrand.q.k;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ak.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;

public final class c
  implements View.OnAttachStateChangeListener, e, a.a, ak.c
{
  private String eIe;
  private volatile com.tencent.mm.modelappbrand.c fvh;
  private volatile b fvo;
  private volatile d fvp;
  
  private com.tencent.mm.modelappbrand.c aff()
  {
    if (this.fvh == null) {}
    try
    {
      if (this.fvh == null) {
        this.fvh = new a();
      }
      return this.fvh;
    }
    finally {}
  }
  
  public final com.tencent.mm.modelappbrand.d JM()
  {
    if (this.fvo == null) {}
    try
    {
      if (this.fvo == null) {
        this.fvo = new b(aff());
      }
      return this.fvo;
    }
    finally {}
  }
  
  public final j JN()
  {
    if (this.fvp == null) {}
    try
    {
      if (this.fvp == null) {
        this.fvp = new d();
      }
      return this.fvp;
    }
    finally {}
  }
  
  public final String a(String paramString, View paramView, Bundle paramBundle, u paramu)
  {
    Object localObject2 = null;
    if (!(paramView instanceof IPCDynamicPageView)) {
      return "";
    }
    String str = k.bT(System.nanoTime());
    com.tencent.mm.plugin.appbrand.collector.c.c("widget_launch", str, "on_bind_view", true);
    com.tencent.mm.plugin.appbrand.collector.c.ba(str, "init_finish");
    IPCDynamicPageView localIPCDynamicPageView = (IPCDynamicPageView)paramView;
    Object localObject1;
    if (paramBundle != null)
    {
      paramView = paramBundle.getString("app_id");
      localObject1 = paramBundle.getString("msg_id");
      paramBundle.putString("__session_id", paramString);
      paramBundle.putLong("__on_bind_nano_time", System.nanoTime());
      paramBundle.putString("__session_id", str);
      paramBundle.putParcelable("__cost_time_session", com.tencent.mm.plugin.appbrand.collector.c.rv(str));
    }
    for (;;)
    {
      str = WxaWidgetInitializer.bh(paramView, (String)localObject1);
      localObject1 = paramBundle.getString("exec_process_name", "com.tencent.mm:support");
      i.aeT().fuO.put(str, localObject1);
      com.tencent.mm.modelappbrand.s.i("MicroMsg.DynamicPageService", "onBindView(%s)", new Object[] { str });
      localIPCDynamicPageView.removeOnAttachStateChangeListener(this);
      localIPCDynamicPageView.addOnAttachStateChangeListener(this);
      Assert.assertNotNull(str);
      localIPCDynamicPageView.fyg = System.currentTimeMillis();
      localObject1 = localObject2;
      if (paramu != null) {
        localObject1 = paramu.JX();
      }
      if ((localIPCDynamicPageView.doU != null) && (!str.equals(localIPCDynamicPageView.doU))) {
        localIPCDynamicPageView.cleanup();
      }
      if ((localObject1 != null) && ((!str.equals(localIPCDynamicPageView.doU)) || (!localIPCDynamicPageView.fyf))) {
        ((f)localObject1).q(localIPCDynamicPageView, 0);
      }
      localIPCDynamicPageView.fyf = false;
      com.tencent.mm.modelappbrand.s.i("MicroMsg.IPCDynamicPageView", "attach (%s)", new Object[] { str });
      IPCDynamicPageView.fun.post(new IPCDynamicPageView.3(localIPCDynamicPageView, str, paramBundle, paramu, paramView));
      x.v("MicroMsg.DynamicPageService", "onBindView(%s)", new Object[] { str });
      paramView = com.tencent.mm.plugin.appbrand.dynamic.h.a.afs();
      if ((this == null) || (paramString == null) || (paramString.length() == 0)) {}
      for (;;)
      {
        com.tencent.mm.plugin.appbrand.dynamic.h.a.afs().c(paramString, localIPCDynamicPageView);
        aff().g(paramString, localIPCDynamicPageView);
        return str;
        paramView.fxs.put(paramString, this);
      }
      localObject1 = null;
      paramView = null;
    }
  }
  
  public final void a(String paramString, View paramView)
  {
    if (!(paramView instanceof IPCDynamicPageView)) {
      return;
    }
    paramView = (IPCDynamicPageView)paramView;
    x.v("MicroMsg.DynamicPageService", "onUnBindView(%s)", new Object[] { paramView.getExtId() });
    paramView.removeOnAttachStateChangeListener(this);
    aff().h(paramString, paramView);
    com.tencent.mm.plugin.appbrand.dynamic.h.a.afs().b(paramString, paramView);
    paramView.detach();
  }
  
  public final void a(String paramString, IPCDynamicPageView paramIPCDynamicPageView)
  {
    x.v("MicroMsg.DynamicPageService", "onOverLength(sessionId : %s, view : %s)", new Object[] { paramString, paramIPCDynamicPageView.getExtId() });
    a(paramString, paramIPCDynamicPageView);
  }
  
  public final void bB(View paramView)
  {
    if (!(paramView instanceof IPCDynamicPageView)) {
      return;
    }
    ((IPCDynamicPageView)paramView).kg(2104);
  }
  
  public final l bC(View paramView)
  {
    if ((paramView instanceof IPCDynamicPageView)) {
      return (l)paramView;
    }
    return null;
  }
  
  public final View bH(Context paramContext)
  {
    return new IPCDynamicPageView(paramContext);
  }
  
  public final void c(String paramString, Throwable paramThrowable)
  {
    x.e("MicroMsg.DynamicPageService", "uncaughtException(%s)", new Object[] { Log.getStackTraceString(paramThrowable) });
    shutdown();
  }
  
  public final void initialize()
  {
    if ((this.eIe != null) && (this.eIe.length() != 0)) {
      shutdown();
    }
    this.eIe = ("Token#" + System.nanoTime());
    ak.a(this);
    com.tencent.mm.plugin.appbrand.appcache.s.a(new com.tencent.mm.plugin.appbrand.dynamic.b.d());
  }
  
  public final void jl(String paramString)
  {
    com.tencent.mm.plugin.appbrand.dynamic.h.a.afs().fxr.remove(paramString);
    Object localObject = com.tencent.mm.plugin.appbrand.dynamic.h.a.afs();
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = aff().aY(paramString);
      if ((paramString != null) && (!paramString.isEmpty())) {
        break label67;
      }
    }
    label67:
    do
    {
      return;
      ((com.tencent.mm.plugin.appbrand.dynamic.h.a)localObject).fxs.remove(paramString);
      break;
      paramString = paramString.iterator();
      while (paramString.hasNext())
      {
        localObject = (View)paramString.next();
        if ((localObject != null) && ((localObject instanceof IPCDynamicPageView)))
        {
          localObject = (IPCDynamicPageView)localObject;
          x.v("MicroMsg.DynamicPageService", "onUnbindAllView, do unBindView(%s)", new Object[] { ((IPCDynamicPageView)localObject).getExtId() });
          ((IPCDynamicPageView)localObject).removeOnAttachStateChangeListener(this);
          ((IPCDynamicPageView)localObject).detach();
        }
      }
    } while (!aff().JL().isEmpty());
    com.tencent.mm.bu.a.post(new a.1());
  }
  
  public final void onViewAttachedToWindow(View paramView)
  {
    if ((paramView == null) || (!(paramView instanceof IPCDynamicPageView))) {
      return;
    }
    paramView = (IPCDynamicPageView)paramView;
    x.d("MicroMsg.DynamicPageService", "onViewAttachedToWindow(%s)", new Object[] { paramView.getExtId() });
    paramView.onResume();
  }
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    if ((paramView == null) || (!(paramView instanceof IPCDynamicPageView))) {
      return;
    }
    paramView = (IPCDynamicPageView)paramView;
    x.d("MicroMsg.DynamicPageService", "onViewDetachedFromWindow(%s)", new Object[] { paramView.getExtId() });
    paramView.onPause();
  }
  
  public final void shutdown()
  {
    Object localObject1 = aff().JL();
    if ((localObject1 == null) || (((Map)localObject1).isEmpty())) {}
    for (;;)
    {
      return;
      localObject1 = new LinkedHashSet(((Map)localObject1).keySet()).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = ((Iterator)localObject1).next();
        if ((localObject2 != null) && ((localObject2 instanceof String))) {
          jl((String)localObject2);
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */