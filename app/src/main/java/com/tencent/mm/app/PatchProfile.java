package com.tencent.mm.app;

import android.app.Application;
import android.content.res.Configuration;
import com.tencent.mm.booter.s;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.f.a;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class PatchProfile
  extends e
{
  public static final String byu = ad.getPackageName() + ":patch";
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onCreate()
  {
    long l = System.currentTimeMillis();
    s locals = new s(com.tencent.mm.booter.c.bj(this.app.getBaseContext()));
    locals.ez("PATCH");
    try
    {
      i = Integer.decode(locals.getString(".com.tencent.mm.debug.log.setversion")).intValue();
      com.tencent.mm.protocal.d.CA(i);
      new StringBuilder("set up test protocal version = ").append(Integer.toHexString(i));
    }
    catch (Exception localException4)
    {
      try
      {
        String str = locals.getString(".com.tencent.mm.debug.log.setapilevel");
        if (!bi.oW(str))
        {
          com.tencent.mm.protocal.d.DEVICE_TYPE = "android-" + str;
          com.tencent.mm.protocal.d.qVJ = "android-" + str;
          com.tencent.mm.protocal.d.qVL = str;
          b.VW(str);
          new StringBuilder("set up test protocal apilevel = ").append(com.tencent.mm.protocal.d.DEVICE_TYPE).append(" ").append(b.chq());
        }
      }
      catch (Exception localException4)
      {
        try
        {
          int i = Integer.decode(locals.getString(".com.tencent.mm.debug.log.setuin")).intValue();
          new StringBuilder("set up test protocal uin old: ").append(com.tencent.mm.protocal.d.qVM).append(" new: ").append(i);
          com.tencent.mm.protocal.d.qVM = i;
        }
        catch (Exception localException4)
        {
          try
          {
            for (;;)
            {
              boolean bool1 = bi.a(locals.eA(".com.tencent.mm.debug.report.debugmodel"), false);
              boolean bool2 = bi.a(locals.eA(".com.tencent.mm.debug.report.kvstat"), false);
              boolean bool3 = bi.a(locals.eA(".com.tencent.mm.debug.report.clientpref"), false);
              boolean bool4 = bi.a(locals.eA(".com.tencent.mm.debug.report.useraction"), false);
              com.tencent.mm.plugin.report.a.c.a(bool1, bool2, bool3, bool4);
              new StringBuilder("try control report : debugModel[").append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
              a.bh(ad.getContext());
              k.cN(byu);
              com.tencent.mm.compatible.util.k.setupBrokenLibraryHandler();
              o.ve();
              x.i("MicroMsg.PatchProfile", "patchsprofile try to init hotpatch plugin");
              com.tencent.mm.bg.d.a("hp", null, null);
              com.tencent.mm.bg.d.Uo("hp");
              x.i("MicroMsg.PatchProfile", "start time check patchsprofile use time = " + (System.currentTimeMillis() - l));
              return;
              localException2 = localException2;
              x.i("MicroMsg.PatchDebugger", "no debugger was got");
              continue;
              localException3 = localException3;
              x.i("MicroMsg.PatchDebugger", "no debugger was got");
              continue;
              localException4 = localException4;
              x.i("MicroMsg.PatchDebugger", "no debugger was got");
            }
          }
          catch (Exception localException1)
          {
            for (;;)
            {
              x.i("MicroMsg.PatchDebugger", "no debugger was got");
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/app/PatchProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */