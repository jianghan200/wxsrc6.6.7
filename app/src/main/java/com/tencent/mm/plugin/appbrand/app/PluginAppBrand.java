package com.tencent.mm.plugin.appbrand.app;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.support.annotation.Keep;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.a.b.a.a;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.ai;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.p;
import com.tencent.mm.modelappbrand.i;
import com.tencent.mm.plugin.appbrand.appcache.l;
import com.tencent.mm.plugin.appbrand.appcache.m;
import com.tencent.mm.plugin.appbrand.appcache.s;
import com.tencent.mm.plugin.appbrand.appstorage.n.a;
import com.tencent.mm.plugin.appbrand.appstorage.n.b;
import com.tencent.mm.plugin.appbrand.appusage.t;
import com.tencent.mm.plugin.appbrand.appusage.w;
import com.tencent.mm.plugin.appbrand.config.g.1;
import com.tencent.mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.mm.plugin.appbrand.dynamic.e.c.a;
import com.tencent.mm.plugin.appbrand.launching.ae;
import com.tencent.mm.plugin.appbrand.launching.precondition.j;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ak.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Keep
public final class PluginAppBrand
  extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.kernel.api.c, ai, com.tencent.mm.plugin.appbrand.a.b
{
  public static final String TAG = "MicroMsg.PluginAppBrand";
  private final com.tencent.mm.plugin.appbrand.r.d singletonRegistry = new com.tencent.mm.plugin.appbrand.r.d();
  
  static
  {
    k.b("appbrandcommon", PluginAppBrand.class.getClassLoader());
  }
  
  private static boolean isAppBrandProcess()
  {
    try
    {
      String str = ad.getPackageName();
      boolean bool = ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).dox.startsWith(str + ":appbrand");
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  private static boolean isSupportProcess(String paramString)
  {
    try
    {
      boolean bool = "com.tencent.mm:support".equals(paramString);
      return bool;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public final void configure(com.tencent.mm.kernel.b.g paramg) {}
  
  public final void dependency()
  {
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
    dependsOn(com.tencent.mm.plugin.appbrand.compat.a.e.class);
  }
  
  public final void execute(com.tencent.mm.kernel.b.g paramg)
  {
    x.d("MicroMsg.PluginAppBrand", "current process name = %s, isMainThread %b", new Object[] { ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).dox, Boolean.valueOf(com.tencent.mm.sdk.platformtools.ah.isMainThread()) });
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.n.d.class, new com.tencent.mm.kernel.c.e(new ae()));
    com.tencent.mm.kernel.g.a(com.tencent.mm.modelappbrand.e.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.dynamic.a.c()));
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.n.e.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.launching.b.f()));
    Object localObject1;
    if (paramg.ES())
    {
      localObject1 = n.b.fkX;
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.appstorage.a.a.class, (com.tencent.mm.kernel.c.a)localObject1);
      com.tencent.mm.plugin.appbrand.game.b.c.adc();
      if (!paramg.ES()) {
        break label499;
      }
      com.tencent.mm.plugin.ah.c.nbP.a(new com.tencent.mm.plugin.appbrand.u());
      com.tencent.mm.kernel.g.a(a.class, new com.tencent.mm.kernel.c.e(new a()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.modelappbrand.g.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.share.a.a()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.ui.banner.e.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.ui.banner.a()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.n.a.class, new com.tencent.mm.kernel.c.e(new d()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.n.c.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.config.o()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.n.f.class, new com.tencent.mm.kernel.c.e(new c()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.a.c.class, new com.tencent.mm.kernel.c.e(new f()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.widget.a.a.class, new com.tencent.mm.kernel.c.e(new g()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.n.g.class, new com.tencent.mm.kernel.c.e(new w()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.n.b.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.game.e()));
      com.tencent.mm.kernel.g.a(i.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.h.e()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.modelappbrand.h.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.h.a()));
      com.tencent.mm.pluginsdk.cmd.b.a(new com.tencent.mm.plugin.appbrand.b(), new String[] { "//enable_appbrand_monkey_test", "//disable_appbrand_monkey_test", "//callsearchshowoutwxaapp", "//getsearchshowoutwxaapp", "//appbrandtest", "//wxafts", "//wxatest", "//localwxalibrary" });
      com.tencent.mm.pluginsdk.cmd.b.a(new com.tencent.mm.plugin.appbrand.dynamic.c.a(), new String[] { "//widget" });
      com.tencent.mm.kernel.g.Ek().a(new com.tencent.mm.kernel.api.g()
      {
        public final void aF(boolean paramAnonymousBoolean)
        {
          ((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.g.l(com.tencent.mm.modelappbrand.e.class)).shutdown();
          ((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.g.l(com.tencent.mm.modelappbrand.e.class)).JM().exit();
        }
        
        public final void vk()
        {
          ((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.g.l(com.tencent.mm.modelappbrand.e.class)).initialize();
        }
      });
      if (DebuggerShell.aer()) {
        com.tencent.mm.kernel.g.a(DebuggerShell.class, new DebuggerShell());
      }
      s.a(new l());
    }
    label499:
    do
    {
      return;
      localObject1 = n.a.fkV;
      break;
      if ((ad.cie()) || (isAppBrandProcess()))
      {
        b.aaQ();
        com.tencent.mm.plugin.appbrand.report.a.h.amK();
        com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.appusage.u.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.appusage.h()));
        com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.widget.recentview.d.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.widget.d()));
        j.cF(ad.getContext());
        localObject1 = this.singletonRegistry;
        Object localObject2 = paramg.dsQ;
        x.i("MicroMsg.AppSingletonRegistry", "AppSingletonRegistry.AppSingletonRegistry ");
        ((Application)localObject2).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject1);
        localObject1 = this.singletonRegistry;
        localObject2 = paramg.dsQ;
        ((com.tencent.mm.plugin.appbrand.r.d)localObject1).gBB = true;
        ((com.tencent.mm.plugin.appbrand.r.d)localObject1).app = ((Application)localObject2);
        localObject1 = this.singletonRegistry;
        localObject2 = com.tencent.mm.plugin.appbrand.r.a.a.gCg;
        x.i("MicroMsg.AppSingletonRegistry", "registerAppSingleton() called with: singleton = [%s]", new Object[] { localObject2 });
        ((com.tencent.mm.plugin.appbrand.r.d)localObject1).gBz.offer(localObject2);
      }
      if (ad.cie())
      {
        com.tencent.mm.plugin.appbrand.dynamic.widget.c.initialize();
        ak.a(new ak.c()
        {
          public final void c(String paramAnonymousString, Throwable paramAnonymousThrowable)
          {
            if (bi.oV(paramAnonymousString).contains(".plugin.appbrand"))
            {
              com.tencent.mm.plugin.report.service.h.mEJ.a(365L, 3L, 1L, false);
              KVCommCrossProcessReceiver.brP();
            }
          }
        });
        return;
      }
      if (isAppBrandProcess())
      {
        AppBrandProcessSuicideLogic.d(paramg.dsQ);
        return;
      }
    } while (!isSupportProcess(paramg.dox));
    com.tencent.mm.plugin.appbrand.dynamic.e.c.initialize();
    com.tencent.mm.plugin.appbrand.dynamic.e.c.a(new c.a()
    {
      public final void aaS()
      {
        com.tencent.mm.plugin.appbrand.dynamic.h.e.cv(ad.getContext());
      }
    });
    com.tencent.mm.v.g.initialize();
  }
  
  final e getCore()
  {
    return (e)p.v(e.class);
  }
  
  public final List<com.tencent.mm.model.ah> getDataTransferList()
  {
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(new g.1(new com.tencent.mm.plugin.appbrand.config.g()));
    localLinkedList.add(new t());
    return localLinkedList;
  }
  
  public final void installed()
  {
    alias(com.tencent.mm.plugin.appbrand.a.b.class);
  }
  
  public final String name()
  {
    return "plugin-appbrand";
  }
  
  public final void onAccountInitialized(e.c paramc) {}
  
  public final void onAccountRelease() {}
  
  private static final class a
    extends p
    implements com.tencent.mm.kernel.a.b.b
  {
    private com.tencent.mm.plugin.appbrand.debugger.f feA = new com.tencent.mm.plugin.appbrand.debugger.f();
    private com.tencent.mm.plugin.appbrand.jsapi.appdownload.a fez;
    
    a()
    {
      super();
    }
    
    public final void onAccountInitialized(e.c paramc)
    {
      super.onAccountInitialized(paramc);
      com.tencent.mm.plugin.appbrand.dynamic.widget.c.initialize();
      ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.a.e.class)).a("link_view_wxapp", new com.tencent.mm.plugin.appbrand.h.d());
      ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.a.e.class)).a("link_view_wxapp", new com.tencent.mm.plugin.appbrand.h.c());
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.a.a.class, new com.tencent.mm.kernel.c.e(m.fgc));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.appusage.u.class, new com.tencent.mm.kernel.c.e((com.tencent.mm.kernel.c.a)e.x(com.tencent.mm.plugin.appbrand.appusage.g.class)));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.widget.recentview.d.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.widget.d()));
      com.tencent.mm.a.e.co(ad.getContext().getFilesDir().getParent() + File.separator + "voice_split_joint/");
      ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("WeAppSyncCommand", com.tencent.mm.plugin.appbrand.appcache.a.c.fiB);
      ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("subscribesysmsg", com.tencent.mm.plugin.appbrand.h.b.gjW);
      this.fez = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.a();
      com.tencent.mm.plugin.downloader.model.d.aCU();
      com.tencent.mm.plugin.downloader.model.b.a(this.fez);
      ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("DebugAppCodeUpdated", this.feA);
    }
    
    public final void onAccountRelease()
    {
      com.tencent.mm.kernel.g.m(com.tencent.mm.plugin.appbrand.appusage.u.class);
      com.tencent.mm.kernel.g.m(com.tencent.mm.plugin.appbrand.widget.recentview.d.class);
      super.onAccountRelease();
      ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.a.e.class)).Gs("link_view_wxapp");
      ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.a.e.class)).Gt("link_view_wxapp");
      ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("WeAppSyncCommand", com.tencent.mm.plugin.appbrand.appcache.a.c.fiB);
      ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("subscribesysmsg", com.tencent.mm.plugin.appbrand.h.b.gjW);
      com.tencent.mm.plugin.downloader.model.d.aCU();
      com.tencent.mm.plugin.downloader.model.b.b(this.fez);
      ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("DebugAppCodeUpdated", this.feA);
    }
    
    public final void parallelsDependency()
    {
      com.tencent.mm.kernel.a.b.a.a(this, com.tencent.mm.kernel.api.c.class).aN(com.tencent.mm.kernel.g.n(n.class));
      com.tencent.mm.kernel.a.b.a.a(this, com.tencent.mm.kernel.api.c.class).aN(com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.appbrand.a.b.class));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/app/PluginAppBrand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */