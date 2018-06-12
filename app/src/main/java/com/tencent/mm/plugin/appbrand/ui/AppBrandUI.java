package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.app.ActivityManager.TaskDescription;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.a.a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.mm.plugin.appbrand.app.b;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.d.a;
import com.tencent.mm.plugin.appbrand.config.d.b;
import com.tencent.mm.plugin.appbrand.config.d.c;
import com.tencent.mm.plugin.appbrand.config.d.d;
import com.tencent.mm.plugin.appbrand.e.c;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.s.a;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.c;
import com.tencent.mm.plugin.appbrand.widget.input.a.1;
import com.tencent.mm.plugin.appbrand.widget.input.af.a;
import com.tencent.mm.plugin.appbrand.widget.input.ah;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(1)
public class AppBrandUI
  extends MMActivity
  implements a.a, m
{
  private AppBrandRemoteTaskController.c fdp = new AppBrandUI.3(this);
  private Intent gwA = null;
  public boolean gwB = false;
  private Boolean gwC;
  private com.tencent.mm.ui.widget.a.c gwD = null;
  private final com.tencent.mm.plugin.appbrand.widget.input.a gww = new com.tencent.mm.plugin.appbrand.widget.input.a(this);
  com.tencent.mm.plugin.appbrand.h gwx;
  private i gwy;
  private com.tencent.mm.plugin.appbrand.b.d gwz;
  
  protected final void ahy() {}
  
  protected final void anC()
  {
    super.finish();
  }
  
  public final boolean anD()
  {
    boolean bool2 = true;
    boolean bool1 = true;
    if (this.gwC != null) {
      bool1 = this.gwC.booleanValue();
    }
    for (;;)
    {
      return bool1;
      Object localObject1 = ad.getContext().getPackageManager();
      try
      {
        localObject1 = ((PackageManager)localObject1).getActivityInfo(getComponentName(), 128);
        if (localObject1 == null) {
          continue;
        }
        if (!ad.getPackageName().equals(((ActivityInfo)localObject1).taskAffinity))
        {
          bool1 = bool2;
          localObject1 = Boolean.valueOf(bool1);
          this.gwC = ((Boolean)localObject1);
          return ((Boolean)localObject1).booleanValue();
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.e("MicroMsg.AppBrandUI", "runInStandaloneTask, resolve info e = %s", new Object[] { localException });
          Object localObject2 = null;
          continue;
          bool1 = false;
        }
      }
    }
  }
  
  public void finish()
  {
    if ((isFinishing()) || (this.tlP)) {
      return;
    }
    if (Build.VERSION.SDK_INT >= 21) {
      super.finishAndRemoveTask();
    }
    for (;;)
    {
      initActivityCloseAnimation();
      return;
      super.finish();
    }
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  protected void initActivityCloseAnimation()
  {
    if (this == null) {
      return;
    }
    overridePendingTransition(s.a.appbrand_ui_push_close_enter, s.a.appbrand_ui_push_close_exit);
  }
  
  protected void initActivityOpenAnimation(Intent paramIntent)
  {
    Object localObject1;
    if (paramIntent == null) {
      localObject1 = null;
    }
    try
    {
      for (;;)
      {
        localObject1 = (AppBrandStatObject)localObject1;
        if (localObject1 == null) {
          break;
        }
        f.a(this, (AppBrandStatObject)localObject1);
        return;
        localObject1 = paramIntent.getParcelableExtra("key_appbrand_stat_object");
      }
    }
    catch (Exception localException)
    {
      do
      {
        for (;;)
        {
          Object localObject2 = null;
        }
      } while (AppBrandLaunchProxyUI.v(paramIntent));
      super.initActivityOpenAnimation(paramIntent);
    }
  }
  
  public boolean moveTaskToBack(boolean paramBoolean)
  {
    try
    {
      paramBoolean = super.moveTaskToBack(paramBoolean);
      initActivityCloseAnimation();
      return paramBoolean;
    }
    catch (NullPointerException localNullPointerException)
    {
      finish();
    }
    return true;
  }
  
  public final boolean needShowIdcError()
  {
    return false;
  }
  
  public final boolean noActionBar()
  {
    return true;
  }
  
  public void onBackPressed()
  {
    x.i("MicroMsg.AppBrandUI", "onBackPressed");
    Object localObject = this.gwx.aaA();
    com.tencent.mm.plugin.appbrand.widget.c.e locale;
    com.tencent.mm.plugin.appbrand.widget.c.h localh;
    if (localObject != null)
    {
      if (((g)localObject).fcB != null) {
        break label116;
      }
      if (((g)localObject).fcD != null)
      {
        locale = ((g)localObject).fcD;
        localh = (com.tencent.mm.plugin.appbrand.widget.c.h)locale.gFV.peekLast();
        if (localh != null) {
          break label98;
        }
        locale.setVisibility(8);
      }
    }
    for (int i = 0;; i = 1)
    {
      if (i == 0) {
        if (((g)localObject).fcz != null)
        {
          localObject = ((g)localObject).fcz;
          if (!((n)localObject).getCurrentPage().getCurrentPageView().agV()) {
            ((n)localObject).agJ();
          }
        }
      }
      return;
      label98:
      localh.onCancel();
      locale.b(localh);
    }
    label116:
    ((g)localObject).finish();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    x.i("MicroMsg.AppBrandUI", "onConfigurationChanged newConfig: %s", new Object[] { Integer.valueOf(paramConfiguration.orientation) });
    super.onConfigurationChanged(paramConfiguration);
    Object localObject1 = this.gww;
    if (paramConfiguration != null)
    {
      x.i("MicroMsg.AppBrandFixInputIssuesActivityHelper", "onActivityConfigurationChanged, orientation %d", new Object[] { Integer.valueOf(paramConfiguration.orientation) });
      ((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1).apf();
    }
    localObject1 = this.gwx;
    x.d("MicroMsg.AppBrandRuntimeContainer", "AppBrandRuntimeContainer.onConfigurationChanged newConfig [%d]", new Object[] { Integer.valueOf(paramConfiguration.orientation) });
    if (((com.tencent.mm.plugin.appbrand.h)localObject1).fdn != null)
    {
      localObject1 = ((com.tencent.mm.plugin.appbrand.h)localObject1).fdn.iterator();
      while (((Iterator)localObject1).hasNext()) {
        com.tencent.mm.plugin.appbrand.jsapi.m.e.a(paramConfiguration, ((g)((Iterator)localObject1).next()).mAppId);
      }
    }
    localObject1 = com.tencent.mm.plugin.appbrand.config.d.b(this);
    x.i("MicroMsg.AppBrandDeviceOrientationHandler", "AppBrandDeviceOrientationHandler.onConfigurationChanged");
    Object localObject2;
    boolean bool2;
    label186:
    d.b localb;
    if ((this == null) || (paramConfiguration == null))
    {
      localObject2 = new RuntimeException();
      if (this == null)
      {
        bool1 = true;
        if (paramConfiguration != null) {
          break label634;
        }
        bool2 = true;
        x.printErrStackTrace("MicroMsg.AppBrandDeviceOrientationHandler", (Throwable)localObject2, "onConfigurationChanged activity[isNull ? %b] newConfig[isNull ? %b]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      }
    }
    else
    {
      localObject2 = new LinkedList();
      try
      {
        if (((com.tencent.mm.plugin.appbrand.config.d)localObject1).mFinished)
        {
          x.i("MicroMsg.AppBrandDeviceOrientationHandler", "onConfigurationChanged Finished = true");
          return;
        }
        if (((com.tencent.mm.plugin.appbrand.config.d)localObject1).fpt == null)
        {
          x.d("MicroMsg.AppBrandDeviceOrientationHandler", "No current request..., dismiss");
          return;
        }
      }
      finally {}
      localb = com.tencent.mm.plugin.appbrand.config.d.b(paramConfiguration);
      if (localb == null)
      {
        paramConfiguration = "null";
        x.i("MicroMsg.AppBrandDeviceOrientationHandler", "AppBrandDeviceOrientationConfig.onConfigurationChanged [%s]", new Object[] { paramConfiguration });
        if (((com.tencent.mm.plugin.appbrand.config.d)localObject1).fpt.fpz != null)
        {
          paramConfiguration = ((com.tencent.mm.plugin.appbrand.config.d)localObject1).fpt.fpz;
          if (localb != ((com.tencent.mm.plugin.appbrand.config.d)localObject1).fpt.fpA) {
            break label639;
          }
        }
      }
    }
    label439:
    label628:
    label634:
    label639:
    for (boolean bool1 = true;; bool1 = false)
    {
      ((List)localObject2).add(new d.c(paramConfiguration, localb, bool1, "CurrentRequest.listener result received", (byte)0));
      ((com.tencent.mm.plugin.appbrand.config.d)localObject1).fpt = null;
      if (((com.tencent.mm.plugin.appbrand.config.d)localObject1).fpu != null)
      {
        if (localb == ((com.tencent.mm.plugin.appbrand.config.d)localObject1).fpu.fpA)
        {
          if (((com.tencent.mm.plugin.appbrand.config.d)localObject1).fpu.fpz != null) {
            ((List)localObject2).add(new d.c(((com.tencent.mm.plugin.appbrand.config.d)localObject1).fpu.fpz, localb, true, "PendingRequest.Listener orientation equal direct", (byte)0));
          }
          ((com.tencent.mm.plugin.appbrand.config.d)localObject1).fpu = null;
        }
      }
      else {
        paramConfiguration = ((List)localObject2).iterator();
      }
      for (;;)
      {
        if (!paramConfiguration.hasNext()) {
          break label628;
        }
        localObject1 = (d.c)paramConfiguration.next();
        x.i("MicroMsg.AppBrandDeviceOrientationHandler", "Notify Listener[%s]", new Object[] { ((d.c)localObject1).name });
        if (((d.c)localObject1).fpz == null)
        {
          x.i("MicroMsg.AppBrandDeviceOrientationHandler", "PendingNotify: Listener is null when execute.");
          continue;
          paramConfiguration = localb.name();
          break;
          if (this == null)
          {
            x.e("MicroMsg.AppBrandDeviceOrientationHandler", "No Activity when handle pending request");
            if (((com.tencent.mm.plugin.appbrand.config.d)localObject1).fpu.fpz == null) {
              break label439;
            }
            ((List)localObject2).add(new d.c(((com.tencent.mm.plugin.appbrand.config.d)localObject1).fpu.fpz, localb, false, "PendingRequest.Listener activity == null", (byte)0));
            break label439;
          }
          ((com.tencent.mm.plugin.appbrand.config.d)localObject1).fpt = ((com.tencent.mm.plugin.appbrand.config.d)localObject1).fpu;
          ((com.tencent.mm.plugin.appbrand.config.d)localObject1).fpu = null;
          com.tencent.mm.plugin.appbrand.config.d.a(this, ((com.tencent.mm.plugin.appbrand.config.d)localObject1).fpt);
          break label439;
        }
        ((d.c)localObject1).fpz.a(((d.c)localObject1).fpA, ((d.c)localObject1).success);
      }
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label186;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.AppBrandUI", "onCreate");
    paramBundle = MultiProcessSharedPreferences.getSharedPreferences(ad.getContext(), "pref_appbrand_process", 4);
    Object localObject1 = ad.getProcessName() + ":start_time";
    Object localObject3 = paramBundle.edit();
    if (paramBundle.contains((String)localObject1))
    {
      ((SharedPreferences.Editor)localObject3).remove((String)localObject1);
      com.tencent.mm.plugin.report.f.mDy.a(365L, 2L, 1L, false);
    }
    com.tencent.mm.plugin.report.f.mDy.a(365L, 4L, 1L, false);
    ((SharedPreferences.Editor)localObject3).putLong((String)localObject1, System.currentTimeMillis());
    ((SharedPreferences.Editor)localObject3).commit();
    x.v("MicroMsg.AppBrandReporter", "onProcessStart");
    KVCommCrossProcessReceiver.brL();
    paramBundle = new FrameLayout(this.mController.tml);
    paramBundle.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    setContentView(paramBundle);
    localObject1 = this.gww;
    if ((((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1).activity == null) || (((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1).activity.getWindow() == null)) {}
    for (;;)
    {
      this.gwx = new com.tencent.mm.plugin.appbrand.h(this, this.fdp, paramBundle);
      this.gwy = new i(this, this.gwx);
      paramBundle = this.gwy;
      localObject1 = new IntentFilter();
      ((IntentFilter)localObject1).addAction("android.intent.action.SCREEN_OFF");
      try
      {
        ad.getContext().registerReceiver(paramBundle.fjD, (IntentFilter)localObject1);
        this.gwz = new AppBrandUI.1(this, this);
        paramBundle = this.gwz;
        localObject1 = new IntentFilter();
        ((IntentFilter)localObject1).addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
      }
      catch (Exception paramBundle)
      {
        try
        {
          ad.getContext().registerReceiver(paramBundle.rj, (IntentFilter)localObject1);
          paramBundle = com.tencent.mm.plugin.appbrand.config.d.b(this);
          x.i("MicroMsg.AppBrandDeviceOrientationHandler", "init");
          try
          {
            paramBundle.mFinished = false;
            this.gwA = getIntent();
            return;
          }
          finally {}
          if ((paramBundle.getParent() == null) || (!(paramBundle.getParent() instanceof ViewGroup))) {
            continue;
          }
          ((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1).gGf = true;
          localObject3 = (ViewGroup)paramBundle.getParent();
          ((ViewGroup)localObject3).removeView(paramBundle);
          com.tencent.mm.plugin.appbrand.widget.input.l locall = new com.tencent.mm.plugin.appbrand.widget.input.l(((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1).activity, paramBundle);
          ((ViewGroup)localObject3).addView(locall, new ViewGroup.LayoutParams(-1, -1));
          if (Build.VERSION.SDK_INT < 20)
          {
            af.a.a(((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1).activity, (View)localObject3);
            ((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1).a(locall);
          }
          if ((!com.tencent.mm.plugin.appbrand.widget.input.a.gGe) || (!com.tencent.mm.plugin.appbrand.widget.input.a.cO(((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1).activity))) {
            continue;
          }
          ah.a((View)localObject3, new a.1((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1));
          continue;
          paramBundle = paramBundle;
          x.e("MicroMsg.BaseAppBrandUIScreenOffReceiver", "register screen off receiver e = " + paramBundle);
        }
        catch (Exception paramBundle)
        {
          for (;;)
          {
            x.e("MicroMsg.BaseAppBrandUIHomePressReceiver", "register screen off receiver e = " + paramBundle);
          }
        }
      }
    }
  }
  
  protected final void onCreateBeforeSetContentView()
  {
    super.onCreateBeforeSetContentView();
    supportRequestWindowFeature(10);
    supportRequestWindowFeature(1);
    com.tencent.mm.plugin.appbrand.widget.input.a locala = this.gww;
    if ((locala.activity == null) || (locala.activity.getWindow() == null)) {
      return;
    }
    locala.activity.getWindow().setSoftInputMode(16);
  }
  
  /* Error */
  public void onDestroy()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 711	com/tencent/mm/ui/MMActivity:onDestroy	()V
    //   4: ldc -75
    //   6: ldc_w 712
    //   9: invokestatic 264	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   12: aload_0
    //   13: getfield 58	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:gwx	Lcom/tencent/mm/plugin/appbrand/h;
    //   16: invokevirtual 715	com/tencent/mm/plugin/appbrand/h:cleanup	()V
    //   19: aload_0
    //   20: getfield 624	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:gwz	Lcom/tencent/mm/plugin/appbrand/b/d;
    //   23: ifnull +18 -> 41
    //   26: aload_0
    //   27: getfield 624	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:gwz	Lcom/tencent/mm/plugin/appbrand/b/d;
    //   30: astore_2
    //   31: invokestatic 143	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   34: aload_2
    //   35: getfield 631	com/tencent/mm/plugin/appbrand/b/d:rj	Landroid/content/BroadcastReceiver;
    //   38: invokevirtual 719	android/content/Context:unregisterReceiver	(Landroid/content/BroadcastReceiver;)V
    //   41: aload_0
    //   42: getfield 598	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:gwy	Lcom/tencent/mm/plugin/appbrand/ui/i;
    //   45: ifnull +18 -> 63
    //   48: aload_0
    //   49: getfield 598	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:gwy	Lcom/tencent/mm/plugin/appbrand/ui/i;
    //   52: astore_2
    //   53: invokestatic 143	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   56: aload_2
    //   57: getfield 613	com/tencent/mm/plugin/appbrand/b/e:fjD	Landroid/content/BroadcastReceiver;
    //   60: invokevirtual 719	android/content/Context:unregisterReceiver	(Landroid/content/BroadcastReceiver;)V
    //   63: aload_0
    //   64: invokestatic 390	com/tencent/mm/plugin/appbrand/config/d:b	(Lcom/tencent/mm/ui/MMActivity;)Lcom/tencent/mm/plugin/appbrand/config/d;
    //   67: astore_2
    //   68: ldc_w 392
    //   71: ldc_w 721
    //   74: invokestatic 264	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: aload_2
    //   78: monitorenter
    //   79: aload_2
    //   80: getfield 413	com/tencent/mm/plugin/appbrand/config/d:fpt	Lcom/tencent/mm/plugin/appbrand/config/d$d;
    //   83: ifnonnull +76 -> 159
    //   86: aload_2
    //   87: getfield 449	com/tencent/mm/plugin/appbrand/config/d:fpu	Lcom/tencent/mm/plugin/appbrand/config/d$d;
    //   90: ifnonnull +69 -> 159
    //   93: ldc_w 392
    //   96: ldc_w 723
    //   99: invokestatic 264	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   102: aload_2
    //   103: monitorexit
    //   104: return
    //   105: astore_2
    //   106: ldc_w 696
    //   109: new 497	java/lang/StringBuilder
    //   112: dup
    //   113: ldc_w 725
    //   116: invokespecial 691	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   119: aload_2
    //   120: invokevirtual 694	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   123: invokevirtual 510	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   126: invokestatic 468	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   129: goto -88 -> 41
    //   132: astore_2
    //   133: ldc_w 687
    //   136: new 497	java/lang/StringBuilder
    //   139: dup
    //   140: ldc_w 725
    //   143: invokespecial 691	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   146: aload_2
    //   147: invokevirtual 694	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   150: invokevirtual 510	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: invokestatic 468	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   156: goto -93 -> 63
    //   159: ldc_w 392
    //   162: ldc_w 727
    //   165: iconst_2
    //   166: anewarray 185	java/lang/Object
    //   169: dup
    //   170: iconst_0
    //   171: aload_2
    //   172: getfield 413	com/tencent/mm/plugin/appbrand/config/d:fpt	Lcom/tencent/mm/plugin/appbrand/config/d$d;
    //   175: aastore
    //   176: dup
    //   177: iconst_1
    //   178: aload_2
    //   179: getfield 449	com/tencent/mm/plugin/appbrand/config/d:fpu	Lcom/tencent/mm/plugin/appbrand/config/d$d;
    //   182: aastore
    //   183: invokestatic 346	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: aload_2
    //   187: aconst_null
    //   188: putfield 413	com/tencent/mm/plugin/appbrand/config/d:fpt	Lcom/tencent/mm/plugin/appbrand/config/d$d;
    //   191: aload_2
    //   192: aconst_null
    //   193: putfield 449	com/tencent/mm/plugin/appbrand/config/d:fpu	Lcom/tencent/mm/plugin/appbrand/config/d$d;
    //   196: aload_2
    //   197: iconst_1
    //   198: putfield 407	com/tencent/mm/plugin/appbrand/config/d:mFinished	Z
    //   201: getstatic 731	com/tencent/mm/plugin/appbrand/config/d:fpr	Landroid/util/SparseArray;
    //   204: astore_3
    //   205: aload_3
    //   206: monitorenter
    //   207: getstatic 731	com/tencent/mm/plugin/appbrand/config/d:fpr	Landroid/util/SparseArray;
    //   210: aload_2
    //   211: invokevirtual 737	android/util/SparseArray:indexOfValue	(Ljava/lang/Object;)I
    //   214: istore_1
    //   215: iload_1
    //   216: iflt +10 -> 226
    //   219: getstatic 731	com/tencent/mm/plugin/appbrand/config/d:fpr	Landroid/util/SparseArray;
    //   222: iload_1
    //   223: invokevirtual 740	android/util/SparseArray:removeAt	(I)V
    //   226: aload_3
    //   227: monitorexit
    //   228: aload_2
    //   229: monitorexit
    //   230: return
    //   231: astore_3
    //   232: aload_2
    //   233: monitorexit
    //   234: aload_3
    //   235: athrow
    //   236: astore 4
    //   238: aload_3
    //   239: monitorexit
    //   240: aload 4
    //   242: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	243	0	this	AppBrandUI
    //   214	9	1	i	int
    //   30	73	2	localObject1	Object
    //   105	15	2	localException1	Exception
    //   132	101	2	localException2	Exception
    //   231	8	3	localObject2	Object
    //   236	5	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   31	41	105	java/lang/Exception
    //   53	63	132	java/lang/Exception
    //   79	104	231	finally
    //   159	207	231	finally
    //   228	230	231	finally
    //   232	234	231	finally
    //   240	243	231	finally
    //   207	215	236	finally
    //   219	226	236	finally
    //   226	228	236	finally
    //   238	240	236	finally
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    if ((paramIntent != null) && (paramIntent.getBooleanExtra("key_appbrand_bring_ui_to_front", false)))
    {
      if ((this.gwx == null) || (this.gwx.fdn.size() == 0)) {
        finish();
      }
      return;
    }
    x.i("MicroMsg.AppBrandUI", "onNewIntent");
    this.gwA = paramIntent;
    this.gwB = true;
  }
  
  public void onPause()
  {
    super.onPause();
    x.i("MicroMsg.AppBrandUI", "onPause");
    g localg = this.gwx.aaA();
    if (localg != null) {
      localg.onPause();
    }
    try
    {
      com.tencent.mm.modelstat.d.b(4, "AppBrandUI_" + this.gwx.aaA().mAppId, hashCode());
      if ((this.gwx.aaA() != null) && (this.gwx.aaA().aaq())) {
        com.tencent.mm.plugin.webview.ui.tools.widget.m.Bk(2);
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.AppBrandUI", localThrowable, "[oneliang]AppBrandUI click flow exception.", new Object[0]);
      }
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    g localg = this.gwx.aaA();
    if (localg != null) {
      com.tencent.mm.plugin.appbrand.a.a(localg.mAppId, paramInt, paramArrayOfString, paramArrayOfInt);
    }
  }
  
  public void onResume()
  {
    super.onResume();
    x.i("MicroMsg.AppBrandUI", "onResume");
    Object localObject2;
    if (this.gwA != null)
    {
      setIntent(this.gwA);
      localObject2 = this.gwA.getExtras();
      if (localObject2 != null) {
        break label126;
      }
      finish();
    }
    for (;;)
    {
      this.gwA = null;
      Object localObject1 = this.gwx.aaA();
      if (localObject1 != null) {
        ((g)localObject1).onResume();
      }
      try
      {
        com.tencent.mm.modelstat.d.b(3, "AppBrandUI_" + this.gwx.aaA().mAppId, hashCode());
        if ((this.gwx.aaA() != null) && (this.gwx.aaA().aaq())) {
          com.tencent.mm.plugin.webview.ui.tools.widget.m.Bk(1);
        }
        return;
        for (;;)
        {
          try
          {
            label126:
            ((Bundle)localObject2).setClassLoader(AppBrandInitConfig.class.getClassLoader());
            localObject1 = (AppBrandInitConfig)((Bundle)localObject2).getParcelable("key_appbrand_init_config");
          }
          catch (Exception localException1)
          {
            try
            {
              localObject2 = (AppBrandStatObject)((Bundle)localObject2).getParcelable("key_appbrand_stat_object");
              if ((localObject1 != null) && (localObject2 != null)) {
                break label213;
              }
              if ((this.gwx != null) && (this.gwx.aaA() != null)) {
                break;
              }
              finish();
            }
            catch (Exception localException2)
            {
              AppBrandStatObject localAppBrandStatObject;
              d.b localb;
              for (;;) {}
            }
            localException1 = localException1;
            localObject1 = null;
          }
          x.e("MicroMsg.AppBrandUI", "getParcelable: %s", new Object[] { localException1 });
          localAppBrandStatObject = null;
        }
        label213:
        if (!bi.oW(((AppBrandInitConfig)localObject1).fqt))
        {
          localb = com.tencent.mm.plugin.appbrand.config.d.a((AppBrandInitConfig)localObject1, null);
          com.tencent.mm.plugin.appbrand.config.d.b(this).a(this, localb, new AppBrandUI.2(this));
        }
        x.i("MicroMsg.AppBrandUI", "load() config %s , stat %s", new Object[] { localObject1, localAppBrandStatObject });
        if (((AppBrandInitConfig)localObject1).aaq())
        {
          b.aaR();
          com.tencent.mm.plugin.webview.ui.tools.widget.m.Bk(1);
        }
        this.gwx.a(null, (AppBrandInitConfig)localObject1, localAppBrandStatObject);
        initActivityOpenAnimation(getIntent());
      }
      catch (Throwable localThrowable)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.AppBrandUI", localThrowable, "[oneliang]AppBrandUI click flow exception.", new Object[0]);
        }
      }
    }
  }
  
  public void onStart()
  {
    super.onStart();
    x.i("MicroMsg.AppBrandUI", "onStart");
  }
  
  public void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams)
  {
    super.onWindowAttributesChanged(paramLayoutParams);
    com.tencent.mm.plugin.appbrand.widget.input.a locala = this.gww;
    if (paramLayoutParams == null) {}
    do
    {
      return;
      x.i("MicroMsg.AppBrandFixInputIssuesActivityHelper", "onActivityWindowAttributesChanged, oldFlags %d, newFlags %d", new Object[] { Integer.valueOf(locala.gGg), Integer.valueOf(paramLayoutParams.flags) });
    } while (paramLayoutParams.flags == locala.gGg);
    locala.gGg = paramLayoutParams.flags;
    locala.apf();
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    x.i("MicroMsg.AppBrandUI", "onWindowFocusChanged %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean) {
      this.gwB = false;
    }
  }
  
  public void setTaskDescription(ActivityManager.TaskDescription paramTaskDescription)
  {
    if (anD()) {
      super.setTaskDescription(paramTaskDescription);
    }
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    int j = 1;
    int i;
    if ((paramIntent != null) && ((paramIntent.getFlags() & 0x10000000) > 0)) {
      i = 1;
    }
    for (;;)
    {
      label45:
      boolean bool1;
      String str;
      if ((paramIntent != null) && (com.tencent.mm.plugin.appbrand.r.c.b(paramIntent.getComponent()).equals(com.tencent.mm.plugin.appbrand.r.c.b(getComponentName()))))
      {
        bool1 = AppBrandProcessProxyUI.t(paramIntent);
        boolean bool2 = AppBrandLaunchProxyUI.v(paramIntent);
        boolean bool3 = AppBrandEmbedUI.x(paramIntent);
        if (this.gwx.aaA() != null)
        {
          str = this.gwx.aaA().mAppId;
          if ((!bool2) && (!bool3)) {
            break label140;
          }
          com.tencent.mm.plugin.appbrand.e.a(str, e.c.fcl);
        }
      }
      try
      {
        for (;;)
        {
          this.gwx.aaA().fcz.getReporter().gqU = paramIntent;
          super.startActivityForResult(paramIntent, paramInt, paramBundle);
          return;
          i = 0;
          break;
          j = 0;
          break label45;
          label140:
          if (((i == 0) || (j != 0) || (bool1)) && (e.c.fch == com.tencent.mm.plugin.appbrand.e.qn(str))) {
            com.tencent.mm.plugin.appbrand.e.a(str, e.c.fck);
          }
        }
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */