package com.tencent.mm.app;

import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.tencent.mm.booter.p;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ak.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.c;
import com.tencent.xweb.r;
import java.util.Map;
import org.xwalk.core.WebViewExtensionListener;

public class AppBrandProfile
  extends com.tencent.mm.compatible.loader.e
{
  protected static String bqA = "";
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onCreate()
  {
    bqA = ad.getProcessName();
    Object localObject1 = AppBrandProfile.class.getClassLoader();
    com.tencent.mm.f.a.bh(ad.getContext());
    k.a(new ak.c()
    {
      public final void c(String paramAnonymousString, Throwable paramAnonymousThrowable)
      {
        h.mEJ.a(365L, 3L, 1L, false);
        KVCommCrossProcessReceiver.brP();
      }
    });
    Object localObject2 = new p(com.tencent.mm.booter.c.bj(this.app.getBaseContext()));
    Object localObject3 = bqA.replace(ad.getPackageName() + ":appbrand", "");
    ((p)localObject2).ez("APPBRAND" + (String)localObject3);
    af.ewA = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.test.display_errcode"), false);
    af.ewB = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.test.display_msgstate"), false);
    af.ewC = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.test.network.simulate_fault"), false);
    af.ewD = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.test.network.force_touch"), false);
    af.ewE = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
    af.ewF = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.test.crashIsExit"), false);
    af.ewJ = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.test.album_show_info"), false);
    af.ewK = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.test.location_help"), false);
    af.ewN = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.test.force_soso"), false);
    af.ewO = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.test.simulatePostServerError"), false);
    af.ewP = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
    af.ewQ = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
    af.ewT = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.test.filterfpnp"), false);
    af.ewU = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.test.testForPull"), false);
    int i = bi.a(((p)localObject2).getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
    af.ewR = i;
    if ((i != 4) && (af.ewR > 0))
    {
      com.tencent.mm.storage.z.sOq = af.ewR;
      x.e("MicroMsg.AppBDebugger", "cdn thread num " + af.ewR);
    }
    af.ewS = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
    af.exk = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.forcex5webview"), false);
    af.exh = bi.aG(((p)localObject2).getString(".com.tencent.mm.debug.jsapi.permission"), "");
    x.d("MicroMsg.AppBDebugger", "Test.jsapiPermission = " + af.exh);
    try
    {
      i = Integer.decode(((p)localObject2).getString(".com.tencent.mm.debug.log.setversion")).intValue();
      com.tencent.mm.protocal.d.CA(i);
      new StringBuilder("set up test protocal version = ").append(Integer.toHexString(i));
    }
    catch (Exception localException5)
    {
      try
      {
        localObject3 = ((p)localObject2).getString(".com.tencent.mm.debug.log.setapilevel");
        if (!bi.oW((String)localObject3))
        {
          com.tencent.mm.protocal.d.DEVICE_TYPE = "android-" + (String)localObject3;
          com.tencent.mm.protocal.d.qVJ = "android-" + (String)localObject3;
          com.tencent.mm.protocal.d.qVL = (String)localObject3;
          com.tencent.mm.sdk.a.b.VW((String)localObject3);
          new StringBuilder("set up test protocal apilevel = ").append(com.tencent.mm.protocal.d.DEVICE_TYPE).append(" ").append(com.tencent.mm.sdk.a.b.chq());
        }
      }
      catch (Exception localException5)
      {
        try
        {
          i = Integer.decode(((p)localObject2).getString(".com.tencent.mm.debug.log.setuin")).intValue();
          new StringBuilder("set up test protocal uin old: ").append(com.tencent.mm.protocal.d.qVM).append(" new: ").append(i);
          com.tencent.mm.protocal.d.qVM = i;
        }
        catch (Exception localException5)
        {
          try
          {
            i = Integer.decode(((p)localObject2).getString(".com.tencent.mm.debug.log.setchannel")).intValue();
            ((com.tencent.mm.booter.q)localObject2).cXF.cWO = i;
          }
          catch (Exception localException5)
          {
            try
            {
              for (;;)
              {
                boolean bool1 = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.report.debugmodel"), false);
                boolean bool2 = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.report.kvstat"), false);
                boolean bool3 = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.report.clientpref"), false);
                boolean bool4 = bi.a(((p)localObject2).eA(".com.tencent.mm.debug.report.useraction"), false);
                com.tencent.mm.plugin.report.a.c.a(bool1, bool2, bool3, bool4);
                new StringBuilder("try control report : debugModel[").append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
                k.cN(bqA);
                a.cI(bqA);
                com.tencent.mm.compatible.util.k.b("wcdb", (ClassLoader)localObject1);
                com.tencent.mm.compatible.util.k.b("wechatcommon", (ClassLoader)localObject1);
                com.tencent.mm.compatible.util.k.b(com.tencent.mm.sdk.a.sFa, (ClassLoader)localObject1);
                com.tencent.mm.compatible.util.k.b("FFmpeg", (ClassLoader)localObject1);
                com.tencent.mm.compatible.util.k.b("wechatpack", (ClassLoader)localObject1);
                i = m.zj();
                if ((i & 0x400) == 0) {
                  break label1068;
                }
                x.i("MicroMsg.AppBrandProfile", "load wechatsight_v7a, core number: %d", new Object[] { Integer.valueOf(i >> 12) });
                com.tencent.mm.compatible.util.k.b("wechatsight_v7a", (ClassLoader)localObject1);
                if (i >> 12 < 4) {
                  break;
                }
                com.tencent.mm.plugin.sight.base.b.nbT = 3;
                com.tencent.mm.plugin.sight.base.b.nbV = 3;
                com.tencent.mm.plugin.sight.base.b.nbW = 544000;
                com.tencent.mm.f.a.bh(ad.getContext());
                o.ve();
                MMActivity.initLanguage(this.app.getBaseContext());
                FileOp.init(false);
                MMBitmapFactory.init();
                localObject1 = new AppBrandProfile.2(this);
                localObject2 = new AppBrandProfile.3(this);
                localObject3 = new WebViewExtensionListener()
                {
                  public final Object onMiscCallBack(String paramAnonymousString, Object... paramAnonymousVarArgs)
                  {
                    if ("AddFilterResources".equals(paramAnonymousString)) {
                      com.tencent.mm.svg.a.e.a((Resources)paramAnonymousVarArgs[0], (Map)paramAnonymousVarArgs[1]);
                    }
                    return null;
                  }
                };
                r.a(ad.getContext(), (com.tencent.xweb.util.b)localObject1, (com.tencent.xweb.q)localObject2, (WebViewExtensionListener)localObject3);
                com.tencent.xweb.b.d.a(com.tencent.mm.plugin.cdndownloader.e.a.aAr());
                if (com.tencent.mm.sdk.platformtools.e.chv()) {
                  com.tencent.xweb.x5.sdk.d.forceSysWebView();
                }
                WebView.initWebviewCore(ad.getContext(), MMWebView.uHn, "appbrand", new WebView.c()
                {
                  public final void onCoreInitFinished()
                  {
                    x.i("MicroMsg.AppBrandProfile", "onCoreInitFinished");
                  }
                  
                  public final void uL()
                  {
                    x.i("MicroMsg.AppBrandProfile", "onCoreInitFailed");
                  }
                });
                com.tencent.mm.sdk.b.a.sFg.b(new l(42, 52));
                return;
                localException2 = localException2;
                x.i("MicroMsg.AppBDebugger", "no debugger was got");
                continue;
                localException3 = localException3;
                x.i("MicroMsg.AppBDebugger", "no debugger was got");
                continue;
                localException4 = localException4;
                x.i("MicroMsg.AppBDebugger", "no debugger was got");
                continue;
                localException5 = localException5;
                x.i("MicroMsg.AppBDebugger", "no debugger was got");
              }
            }
            catch (Exception localException1)
            {
              for (;;)
              {
                x.i("MicroMsg.AppBDebugger", "no debugger was got");
                continue;
                com.tencent.mm.plugin.sight.base.b.nbT = 1;
                com.tencent.mm.plugin.sight.base.b.nbV = 1;
                com.tencent.mm.plugin.sight.base.b.nbW = 640000;
                continue;
                label1068:
                x.i("MicroMsg.AppBrandProfile", "load wechatsight");
                com.tencent.mm.compatible.util.k.b("wechatsight", (ClassLoader)localObject1);
                com.tencent.mm.plugin.sight.base.b.nbT = 1;
                com.tencent.mm.plugin.sight.base.b.nbV = 1;
                com.tencent.mm.plugin.sight.base.b.nbW = 640000;
              }
            }
          }
        }
      }
    }
  }
  
  public final void onTrimMemory(int paramInt)
  {
    super.onTrimMemory(paramInt);
    x.v("MicroMsg.AppBrandProfile", "onTrimMemory(l : %d)", new Object[] { Integer.valueOf(paramInt) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/app/AppBrandProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */