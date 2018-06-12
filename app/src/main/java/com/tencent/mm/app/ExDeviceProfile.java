package com.tencent.mm.app;

import android.app.Application;
import android.content.res.Configuration;
import com.tencent.mm.booter.r;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.f.a;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class ExDeviceProfile
  extends e
{
  public static final String byu = ad.getPackageName() + ":exdevice";
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    x.d("MicroMsg.ExDeviceProfile", "onConfigurationChanged:" + toString());
  }
  
  public final void onCreate()
  {
    x.i("MicroMsg.ExDeviceProfile", "exdevice profile oncreate");
    Object localObject = com.tencent.mm.booter.c.bj(this.app.getBaseContext());
    a.bh(ad.getContext());
    k.cN(byu);
    com.tencent.mm.compatible.util.k.setupBrokenLibraryHandler();
    localObject = new r((com.tencent.mm.booter.c)localObject);
    ((r)localObject).ez("EXDEVICE");
    af.ewA = bi.a(((r)localObject).eA(".com.tencent.mm.debug.test.display_errcode"), false);
    af.ewB = bi.a(((r)localObject).eA(".com.tencent.mm.debug.test.display_msgstate"), false);
    af.ewC = bi.a(((r)localObject).eA(".com.tencent.mm.debug.test.network.simulate_fault"), false);
    af.ewD = bi.a(((r)localObject).eA(".com.tencent.mm.debug.test.network.force_touch"), false);
    af.ewE = bi.a(((r)localObject).eA(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
    af.ewF = bi.a(((r)localObject).eA(".com.tencent.mm.debug.test.crashIsExit"), false);
    af.ewJ = bi.a(((r)localObject).eA(".com.tencent.mm.debug.test.album_show_info"), false);
    af.ewK = bi.a(((r)localObject).eA(".com.tencent.mm.debug.test.location_help"), false);
    af.ewN = bi.a(((r)localObject).eA(".com.tencent.mm.debug.test.force_soso"), false);
    af.ewO = bi.a(((r)localObject).eA(".com.tencent.mm.debug.test.simulatePostServerError"), false);
    af.ewP = bi.a(((r)localObject).eA(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
    af.ewQ = bi.a(((r)localObject).eA(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
    af.ewT = bi.a(((r)localObject).eA(".com.tencent.mm.debug.test.filterfpnp"), false);
    af.ewU = bi.a(((r)localObject).eA(".com.tencent.mm.debug.test.testForPull"), false);
    int i = bi.a(((r)localObject).getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
    af.ewR = i;
    if ((i != 4) && (af.ewR > 0))
    {
      com.tencent.mm.storage.z.sOq = af.ewR;
      x.e("MicroMsg.ExdDebugger", "cdn thread num " + af.ewR);
    }
    af.ewS = bi.a(((r)localObject).eA(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
    try
    {
      i = Integer.decode(((r)localObject).getString(".com.tencent.mm.debug.log.setversion")).intValue();
      d.CA(i);
      new StringBuilder("set up test protocal version = ").append(Integer.toHexString(i));
    }
    catch (Exception localException3)
    {
      try
      {
        String str = ((r)localObject).getString(".com.tencent.mm.debug.log.setapilevel");
        if (!bi.oW(str))
        {
          d.DEVICE_TYPE = "android-" + str;
          d.qVJ = "android-" + str;
          d.qVL = str;
          b.VW(str);
          new StringBuilder("set up test protocal apilevel = ").append(d.DEVICE_TYPE).append(" ").append(b.chq());
        }
      }
      catch (Exception localException3)
      {
        try
        {
          i = Integer.decode(((r)localObject).getString(".com.tencent.mm.debug.log.setuin")).intValue();
          new StringBuilder("set up test protocal uin old: ").append(d.qVM).append(" new: ").append(i);
          d.qVM = i;
        }
        catch (Exception localException3)
        {
          try
          {
            for (;;)
            {
              boolean bool1 = bi.a(((r)localObject).eA(".com.tencent.mm.debug.report.debugmodel"), false);
              boolean bool2 = bi.a(((r)localObject).eA(".com.tencent.mm.debug.report.kvstat"), false);
              boolean bool3 = bi.a(((r)localObject).eA(".com.tencent.mm.debug.report.clientpref"), false);
              boolean bool4 = bi.a(((r)localObject).eA(".com.tencent.mm.debug.report.useraction"), false);
              com.tencent.mm.plugin.report.a.c.a(bool1, bool2, bool3, bool4);
              new StringBuilder("try control report : debugModel[").append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
              af.exh = bi.aG(((r)localObject).getString(".com.tencent.mm.debug.jsapi.permission"), "");
              x.d("MicroMsg.ExdDebugger", "Test.jsapiPermission = " + af.exh);
              af.exi = bi.aG(((r)localObject).getString(".com.tencent.mm.debug.generalcontrol.permission"), "");
              x.d("MicroMsg.ExdDebugger", "Test.generalCtrl = " + af.exi);
              af.exj = bi.a(((r)localObject).eA(".com.tencent.mm.debug.skiploadurlcheck"), false);
              x.d("MicroMsg.ExdDebugger", "Test.skipLoadUrlCheck = " + af.exj);
              o.ve();
              return;
              localException1 = localException1;
              x.i("MicroMsg.ExdDebugger", "no debugger was got");
              continue;
              localException2 = localException2;
              x.i("MicroMsg.ExdDebugger", "no debugger was got");
              continue;
              localException3 = localException3;
              x.i("MicroMsg.ExdDebugger", "no debugger was got");
            }
          }
          catch (Exception localException4)
          {
            for (;;)
            {
              x.i("MicroMsg.ExdDebugger", "no debugger was got");
            }
          }
        }
      }
    }
  }
  
  public String toString()
  {
    return byu;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/app/ExDeviceProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */