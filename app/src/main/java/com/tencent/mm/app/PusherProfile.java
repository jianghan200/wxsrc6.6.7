package com.tencent.mm.app;

import android.content.res.Configuration;
import com.tencent.mm.booter.o;
import com.tencent.mm.booter.q;
import com.tencent.mm.booter.t;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.console.Shell;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;

public final class PusherProfile
  extends e
{
  public static final String byu = ad.getPackageName() + ":push";
  private Shell bzd = new Shell();
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onCreate()
  {
    t localt = new t(com.tencent.mm.booter.c.bj(ad.getContext()));
    localt.ez("PUSH");
    af.ewA = bi.a(localt.eA(".com.tencent.mm.debug.test.display_errcode"), false);
    af.ewB = bi.a(localt.eA(".com.tencent.mm.debug.test.display_msgstate"), false);
    af.ewC = bi.a(localt.eA(".com.tencent.mm.debug.test.network.simulate_fault"), false);
    af.ewD = bi.a(localt.eA(".com.tencent.mm.debug.test.network.force_touch"), false);
    af.ewE = bi.a(localt.eA(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
    af.ewF = bi.a(localt.eA(".com.tencent.mm.debug.test.crashIsExit"), false);
    af.ewJ = bi.a(localt.eA(".com.tencent.mm.debug.test.album_show_info"), false);
    af.ewK = bi.a(localt.eA(".com.tencent.mm.debug.test.location_help"), false);
    af.ewN = bi.a(localt.eA(".com.tencent.mm.debug.test.force_soso"), false);
    af.ewO = bi.a(localt.eA(".com.tencent.mm.debug.test.simulatePostServerError"), false);
    af.ewP = bi.a(localt.eA(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
    af.ewQ = bi.a(localt.eA(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
    af.ewT = bi.a(localt.eA(".com.tencent.mm.debug.test.filterfpnp"), false);
    af.ewU = bi.a(localt.eA(".com.tencent.mm.debug.test.testForPull"), false);
    int i = bi.a(localt.getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
    af.ewR = i;
    if ((i != 4) && (af.ewR > 0))
    {
      com.tencent.mm.storage.z.sOq = af.ewR;
      x.e("MicroMsg.PushDebugger", "cdn thread num " + af.ewR);
    }
    af.ewS = bi.a(localt.eA(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
    af.ewX = bi.a(localt.eA(".com.tencent.mm.debug.test.skip_getdns"), false);
    try
    {
      i = Integer.decode(localt.getString(".com.tencent.mm.debug.log.setversion")).intValue();
      com.tencent.mm.protocal.d.CA(i);
      new StringBuilder("set up test protocal version = ").append(Integer.toHexString(i));
    }
    catch (Exception localException5)
    {
      try
      {
        String str = localt.getString(".com.tencent.mm.debug.log.setapilevel");
        if (!bi.oW(str))
        {
          com.tencent.mm.protocal.d.DEVICE_TYPE = "android-" + str;
          com.tencent.mm.protocal.d.qVJ = "android-" + str;
          com.tencent.mm.protocal.d.qVL = str;
          b.VW(str);
          new StringBuilder("set up test protocal apilevel = ").append(com.tencent.mm.protocal.d.DEVICE_TYPE).append(" ").append(b.chq());
        }
      }
      catch (Exception localException5)
      {
        try
        {
          i = Integer.decode(localt.getString(".com.tencent.mm.debug.log.setuin")).intValue();
          new StringBuilder("set up test protocal uin old: ").append(com.tencent.mm.protocal.d.qVM).append(" new: ").append(i);
          com.tencent.mm.protocal.d.qVM = i;
        }
        catch (Exception localException5)
        {
          try
          {
            i = Integer.decode(localt.getString(".com.tencent.mm.debug.log.setchannel")).intValue();
            localt.cXF.cWO = i;
          }
          catch (Exception localException5)
          {
            try
            {
              for (;;)
              {
                boolean bool1 = bi.a(localt.eA(".com.tencent.mm.debug.report.debugmodel"), false);
                boolean bool2 = bi.a(localt.eA(".com.tencent.mm.debug.report.kvstat"), false);
                boolean bool3 = bi.a(localt.eA(".com.tencent.mm.debug.report.clientpref"), false);
                boolean bool4 = bi.a(localt.eA(".com.tencent.mm.debug.report.useraction"), false);
                com.tencent.mm.plugin.report.a.c.a(bool1, bool2, bool3, bool4);
                new StringBuilder("try control report : debugModel[").append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
                a.cI(byu);
                o.onCreate(false);
                com.tencent.mm.bg.d.a("gcm", null, null);
                com.tencent.mm.bg.d.Uo("gcm");
                com.tencent.mm.sdk.b.a.sFg.b(new PusherProfile.1(this));
                w.initLanguage(ad.getContext());
                return;
                localException2 = localException2;
                x.i("MicroMsg.PushDebugger", "no debugger was got");
                continue;
                localException3 = localException3;
                x.i("MicroMsg.PushDebugger", "no debugger was got");
                continue;
                localException4 = localException4;
                x.i("MicroMsg.PushDebugger", "no debugger was got");
                continue;
                localException5 = localException5;
                x.i("MicroMsg.PushDebugger", "no debugger was got");
              }
            }
            catch (Exception localException1)
            {
              for (;;)
              {
                x.i("MicroMsg.PushDebugger", "no debugger was got");
              }
            }
          }
        }
      }
    }
  }
  
  public final String toString()
  {
    return byu;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/app/PusherProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */