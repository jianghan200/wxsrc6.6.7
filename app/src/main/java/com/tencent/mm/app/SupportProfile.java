package com.tencent.mm.app;

import android.app.Application;
import android.content.res.Configuration;
import com.tencent.mm.booter.q;
import com.tencent.mm.booter.v;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;

public class SupportProfile
  extends e
{
  protected static String bqA = "";
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onCreate()
  {
    bqA = ad.getProcessName();
    ClassLoader localClassLoader = SupportProfile.class.getClassLoader();
    com.tencent.mm.f.a.bh(ad.getContext());
    k.a(new SupportProfile.1(this));
    v localv = new v(com.tencent.mm.booter.c.bj(this.app.getBaseContext()));
    localv.ez("SUPPORT");
    af.ewA = bi.a(localv.eA(".com.tencent.mm.debug.test.display_errcode"), false);
    af.ewB = bi.a(localv.eA(".com.tencent.mm.debug.test.display_msgstate"), false);
    af.ewC = bi.a(localv.eA(".com.tencent.mm.debug.test.network.simulate_fault"), false);
    af.ewD = bi.a(localv.eA(".com.tencent.mm.debug.test.network.force_touch"), false);
    af.ewE = bi.a(localv.eA(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
    af.ewF = bi.a(localv.eA(".com.tencent.mm.debug.test.crashIsExit"), false);
    af.ewJ = bi.a(localv.eA(".com.tencent.mm.debug.test.album_show_info"), false);
    af.ewK = bi.a(localv.eA(".com.tencent.mm.debug.test.location_help"), false);
    af.ewN = bi.a(localv.eA(".com.tencent.mm.debug.test.force_soso"), false);
    af.ewO = bi.a(localv.eA(".com.tencent.mm.debug.test.simulatePostServerError"), false);
    af.ewP = bi.a(localv.eA(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
    af.ewQ = bi.a(localv.eA(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
    af.ewT = bi.a(localv.eA(".com.tencent.mm.debug.test.filterfpnp"), false);
    af.ewU = bi.a(localv.eA(".com.tencent.mm.debug.test.testForPull"), false);
    int i = bi.a(localv.getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
    af.ewR = i;
    if ((i != 4) && (af.ewR > 0))
    {
      com.tencent.mm.storage.z.sOq = af.ewR;
      x.e("SetupSupportDebugger", "cdn thread num " + af.ewR);
    }
    af.ewS = bi.a(localv.eA(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
    af.exk = bi.a(localv.eA(".com.tencent.mm.debug.forcex5webview"), false);
    af.exh = bi.aG(localv.getString(".com.tencent.mm.debug.jsapi.permission"), "");
    x.d("SetupSupportDebugger", "Test.jsapiPermission = " + af.exh);
    try
    {
      i = Integer.decode(localv.getString(".com.tencent.mm.debug.log.setversion")).intValue();
      d.CA(i);
      new StringBuilder("set up test protocal version = ").append(Integer.toHexString(i));
    }
    catch (Exception localException5)
    {
      try
      {
        String str = localv.getString(".com.tencent.mm.debug.log.setapilevel");
        if (!bi.oW(str))
        {
          d.DEVICE_TYPE = "android-" + str;
          d.qVJ = "android-" + str;
          d.qVL = str;
          b.VW(str);
          new StringBuilder("set up test protocal apilevel = ").append(d.DEVICE_TYPE).append(" ").append(b.chq());
        }
      }
      catch (Exception localException5)
      {
        try
        {
          i = Integer.decode(localv.getString(".com.tencent.mm.debug.log.setuin")).intValue();
          new StringBuilder("set up test protocal uin old: ").append(d.qVM).append(" new: ").append(i);
          d.qVM = i;
        }
        catch (Exception localException5)
        {
          try
          {
            i = Integer.decode(localv.getString(".com.tencent.mm.debug.log.setchannel")).intValue();
            localv.cXF.cWO = i;
          }
          catch (Exception localException5)
          {
            try
            {
              for (;;)
              {
                boolean bool1 = bi.a(localv.eA(".com.tencent.mm.debug.report.debugmodel"), false);
                boolean bool2 = bi.a(localv.eA(".com.tencent.mm.debug.report.kvstat"), false);
                boolean bool3 = bi.a(localv.eA(".com.tencent.mm.debug.report.clientpref"), false);
                boolean bool4 = bi.a(localv.eA(".com.tencent.mm.debug.report.useraction"), false);
                com.tencent.mm.plugin.report.a.c.a(bool1, bool2, bool3, bool4);
                new StringBuilder("try control report : debugModel[").append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
                k.cN(bqA);
                a.cI(bqA);
                com.tencent.mm.compatible.util.k.b("wcdb", localClassLoader);
                com.tencent.mm.compatible.util.k.b("wechatcommon", localClassLoader);
                com.tencent.mm.compatible.util.k.b(com.tencent.mm.sdk.a.sFa, localClassLoader);
                com.tencent.mm.compatible.util.k.b("FFmpeg", localClassLoader);
                com.tencent.mm.compatible.util.k.b("wechatpack", localClassLoader);
                i = m.zj();
                if ((i & 0x400) == 0) {
                  break label926;
                }
                x.i("MicroMsg.SupportProfile", "load wechatsight_v7a, core number: %d", new Object[] { Integer.valueOf(i >> 12) });
                com.tencent.mm.compatible.util.k.b("wechatsight_v7a", localClassLoader);
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
                return;
                localException2 = localException2;
                x.i("SetupSupportDebugger", "no debugger was got");
                continue;
                localException3 = localException3;
                x.i("SetupSupportDebugger", "no debugger was got");
                continue;
                localException4 = localException4;
                x.i("SetupSupportDebugger", "no debugger was got");
                continue;
                localException5 = localException5;
                x.i("SetupSupportDebugger", "no debugger was got");
              }
            }
            catch (Exception localException1)
            {
              for (;;)
              {
                x.i("SetupSupportDebugger", "no debugger was got");
                continue;
                com.tencent.mm.plugin.sight.base.b.nbT = 1;
                com.tencent.mm.plugin.sight.base.b.nbV = 1;
                com.tencent.mm.plugin.sight.base.b.nbW = 640000;
                continue;
                label926:
                x.i("MicroMsg.SupportProfile", "load wechatsight");
                com.tencent.mm.compatible.util.k.b("wechatsight", localClassLoader);
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
    x.v("MicroMsg.SupportProfile", "onTrimMemory(l : %d)", new Object[] { Integer.valueOf(paramInt) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/app/SupportProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */