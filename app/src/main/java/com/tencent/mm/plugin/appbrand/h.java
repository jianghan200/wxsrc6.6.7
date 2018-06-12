package com.tencent.mm.plugin.appbrand;

import android.content.Intent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.b.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.c;
import com.tencent.mm.plugin.appbrand.ui.AppBrandEmbedUI;
import com.tencent.mm.plugin.appbrand.ui.f;
import com.tencent.mm.plugin.appbrand.ui.m;
import com.tencent.mm.plugin.appbrand.widget.recentview.d;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

public final class h<_ActivityContext extends MMActivity,  extends m>
  implements q
{
  FrameLayout fcA;
  private _ActivityContext fcq;
  public LinkedList<g> fdn;
  HashMap<String, g> fdo;
  private AppBrandRemoteTaskController.c fdp;
  
  public h(_ActivityContext param_ActivityContext, AppBrandRemoteTaskController.c paramc, FrameLayout paramFrameLayout)
  {
    this.fcq = param_ActivityContext;
    this.fdn = new LinkedList();
    this.fdo = new HashMap();
    this.fcA = paramFrameLayout;
    this.fdp = paramc;
  }
  
  public final void a(MiniProgramNavigationBackResult paramMiniProgramNavigationBackResult)
  {
    if ((paramMiniProgramNavigationBackResult != null) && ((this.fcq instanceof AppBrandEmbedUI)))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("result_key_mini_program_navigate_back_result", paramMiniProgramNavigationBackResult);
      this.fcq.setResult(-1, localIntent);
    }
    this.fcq.finish();
  }
  
  public final void a(AppBrandInitConfig paramAppBrandInitConfig, MiniProgramNavigationBackResult paramMiniProgramNavigationBackResult, g paramg)
  {
    Object localObject = null;
    AppBrandLaunchReferrer localAppBrandLaunchReferrer = new AppBrandLaunchReferrer();
    localAppBrandLaunchReferrer.appId = paramAppBrandInitConfig.appId;
    localAppBrandLaunchReferrer.fqE = 3;
    String str;
    if (paramMiniProgramNavigationBackResult == null)
    {
      str = null;
      localAppBrandLaunchReferrer.fqF = str;
      if (paramMiniProgramNavigationBackResult != null) {
        break label155;
      }
    }
    label155:
    for (paramMiniProgramNavigationBackResult = (MiniProgramNavigationBackResult)localObject;; paramMiniProgramNavigationBackResult = paramMiniProgramNavigationBackResult.fej.toString())
    {
      localAppBrandLaunchReferrer.fqG = paramMiniProgramNavigationBackResult;
      paramg.fct.fqA.a(localAppBrandLaunchReferrer);
      paramMiniProgramNavigationBackResult = new AppBrandStatObject();
      paramMiniProgramNavigationBackResult.scene = 1038;
      paramMiniProgramNavigationBackResult.bGG = (paramAppBrandInitConfig.appId + ':' + paramAppBrandInitConfig.fdE + ':' + (paramAppBrandInitConfig.bGM + 1000));
      paramg.fct.aea();
      paramg.a(paramMiniProgramNavigationBackResult);
      return;
      str = paramMiniProgramNavigationBackResult.fei.toString();
      break;
    }
  }
  
  public final void a(g paramg, AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject)
  {
    if ((paramAppBrandInitConfig == null) || (paramAppBrandStatObject == null)) {
      return;
    }
    if (paramg == null)
    {
      Iterator localIterator = this.fdn.iterator();
      while (localIterator.hasNext())
      {
        g localg = (g)localIterator.next();
        localg.fcA.setVisibility(8);
        this.fdo.put(localg.mAppId, localg);
        localg.fcL.fjj.jG(12);
      }
      this.fdn.clear();
    }
    if (qp(paramAppBrandInitConfig.appId) == null)
    {
      b(paramg, paramAppBrandInitConfig, paramAppBrandStatObject);
      return;
    }
    this.fcq.runOnUiThread(new h.2(this, paramg, paramAppBrandInitConfig, paramAppBrandStatObject));
  }
  
  public final g aaA()
  {
    return (g)this.fdn.peek();
  }
  
  public final int aaB()
  {
    return this.fdn.size();
  }
  
  public final AppBrandRemoteTaskController.c aaC()
  {
    return this.fdp;
  }
  
  final void b(final g paramg, final AppBrandInitConfig paramAppBrandInitConfig, final AppBrandStatObject paramAppBrandStatObject)
  {
    if (!ah.isMainThread()) {
      this.fcq.runOnUiThread(new Runnable()
      {
        public final void run()
        {
          h.this.b(paramg, paramAppBrandInitConfig, paramAppBrandStatObject);
        }
      });
    }
    g localg;
    do
    {
      return;
      if (!paramAppBrandInitConfig.aaq()) {
        break;
      }
      x.i("MicroMsg.AppBrandRuntimeContainer", "cleanup by game, ugly");
      cleanup();
      if (paramg != null) {
        paramg.onPause();
      }
      localg = new g(this.fcq, this);
      localg.a(paramAppBrandInitConfig, paramAppBrandStatObject);
      localg.fcs = paramg;
      localg.aak();
      this.fdn.push(localg);
      this.fcA.addView(localg.fcA);
    } while (paramg == null);
    f.a(localg, paramg, null);
    return;
    Iterator localIterator = this.fdn.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      localg = (g)localIterator.next();
    } while (!localg.aaq());
    for (;;)
    {
      f(localg);
      break;
      localIterator = this.fdo.values().iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          localg = (g)localIterator.next();
          if (localg.aaq()) {
            break;
          }
        }
      }
      localg = null;
    }
  }
  
  public final void cleanup()
  {
    Object localObject = new LinkedList();
    ((LinkedList)localObject).addAll(this.fdn);
    ((LinkedList)localObject).addAll(this.fdo.values());
    localObject = ((LinkedList)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      f((g)((Iterator)localObject).next());
    }
    x.i("MicroMsg.AppBrandRuntimeContainer", "cleanup");
  }
  
  public final void close()
  {
    if ((aaA() != null) && (aaA().aan() != 1060) && (aaA().fcu != null) && (aaA().fcu.fqN) && (aaA().dti))
    {
      ((d)com.tencent.mm.kernel.g.l(d.class)).cN(this.fcq);
      aaA().fcu.fqN = false;
    }
    if (((m)this.fcq).anD())
    {
      this.fcq.moveTaskToBack(true);
      return;
    }
    this.fcq.finish();
  }
  
  public final g d(g paramg)
  {
    int i = this.fdn.indexOf(paramg);
    int j = this.fdn.size();
    if ((i == -1) || (i >= j - 1)) {
      return null;
    }
    return (g)this.fdn.get(i + 1);
  }
  
  public final boolean e(g paramg)
  {
    return this.fdn.contains(paramg);
  }
  
  public final void f(g paramg)
  {
    this.fcq.runOnUiThread(new h.4(this, paramg));
  }
  
  final g qp(String paramString)
  {
    Iterator localIterator = this.fdn.iterator();
    while (localIterator.hasNext())
    {
      g localg = (g)localIterator.next();
      if (localg.mAppId.equals(paramString)) {
        return localg;
      }
    }
    return (g)this.fdo.get(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */