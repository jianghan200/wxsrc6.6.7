package com.tencent.mm.plugin.hp.tinker;

import android.os.Build.VERSION;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.app.ApplicationLike;
import com.tinkerboots.sdk.a.a;
import com.tinkerboots.sdk.tinker.service.TinkerServerResultService;

public final class d
{
  private static boolean knb = false;
  
  public static void EH(String paramString)
  {
    if (!knb) {
      throw new RuntimeException("upgrade patch but tinker is not installed");
    }
    com.tencent.tinker.lib.e.c.bP(com.tencent.mm.app.b.applicationLike.getApplication(), paramString);
  }
  
  public static void aWs()
  {
    com.tencent.tinker.lib.f.a.a(new d.1());
  }
  
  public static void aWt()
  {
    if (!knb) {
      throw new RuntimeException("cleanPatch but tinker is not installed");
    }
    com.tencent.tinker.lib.e.a.hL(com.tencent.mm.app.b.applicationLike.getApplication()).aWt();
  }
  
  public static void b(ApplicationLike paramApplicationLike)
  {
    x.i("Tinker.TinkerPatchManager", "try installing tinker");
    if (knb)
    {
      x.w("Tinker.TinkerPatchManager", "install tinker, but has installed, ignore");
      return;
    }
    long l1 = 0L;
    long l2;
    try
    {
      l2 = com.tencent.mm.kernel.a.Dz() & 0xFFFFFFFF;
      l1 = l2;
      x.i("Tinker.TinkerPatchManager", "uin is %s", new Object[] { bi.Xf(String.valueOf(l2)) });
    }
    catch (Exception localException)
    {
      for (;;)
      {
        a.a locala;
        x.printErrStackTrace("Tinker.TinkerPatchManager", localException, "tinker patch manager get uin failed.", new Object[0]);
        l2 = l1;
      }
      localException.vsy = ((com.tencent.tinker.lib.d.c)localObject);
      Object localObject = new e(paramApplicationLike.getApplication());
      if (localException.vsz == null) {
        break label158;
      }
      throw new TinkerRuntimeException("patchReporter is already set.");
      localException.vsz = ((com.tencent.tinker.lib.d.d)localObject);
      paramApplicationLike = new b(paramApplicationLike.getApplication());
      if (localException.vsx == null) {
        break label195;
      }
      throw new TinkerRuntimeException("listener is already set.");
      localException.vsx = paramApplicationLike;
      if (localException.vGa == null) {
        break label219;
      }
      throw new TinkerRuntimeException("resultServiceClass is already set.");
      localException.vGa = TinkerPatchResultService.class;
      if (localException.vsy != null) {
        break label251;
      }
      localException.vsy = new com.tinkerboots.sdk.tinker.b.a(localException.context);
      if (localException.vsz != null) {
        break label276;
      }
      localException.vsz = new com.tinkerboots.sdk.tinker.b.c(localException.context);
      if (localException.vsx != null) {
        break label301;
      }
      localException.vsx = new com.tinkerboots.sdk.tinker.b.b(localException.context);
      if (localException.vFZ != null) {
        break label321;
      }
      localException.vFZ = new com.tencent.tinker.lib.c.f();
      if (localException.vGa != null) {
        break label336;
      }
      localException.vGa = TinkerServerResultService.class;
      if (localException.vGb != null) {
        break label356;
      }
      localException.vGb = new com.tinkerboots.sdk.a.a.a();
      paramApplicationLike = new com.tinkerboots.sdk.a(localException.context, localException.applicationLike, localException.vsy, localException.vsz, localException.vsx, localException.vFZ, localException.vGa, localException.vGb);
      if (com.tinkerboots.sdk.a.vFU == null) {
        break label420;
      }
      throw new TinkerRuntimeException("TinkerClient instance is already set.");
      com.tinkerboots.sdk.a.vFU = paramApplicationLike;
      paramApplicationLike = com.tinkerboots.sdk.a.cJC().Iz(g.dJ(ad.getContext()));
      bool = com.tencent.mm.sdk.a.b.chp();
      if (paramApplicationLike.vFW == null) {
        break label456;
      }
    }
    locala = new a.a(paramApplicationLike);
    localObject = new c(paramApplicationLike.getApplication());
    if (locala.vsy != null) {
      throw new TinkerRuntimeException("loadReporter is already set.");
    }
    label158:
    label195:
    label219:
    label251:
    label276:
    label301:
    label321:
    label336:
    label356:
    label420:
    boolean bool;
    label456:
    int i;
    label510:
    f localf;
    if (paramApplicationLike.vFV == null)
    {
      com.tencent.tinker.lib.f.a.e("Tinker.TinkerClient", "setDebugger, tinkerServerClient or tinkerClient is null, just return", new Object[0]);
      paramApplicationLike = com.tinkerboots.sdk.a.vFU;
      paramApplicationLike = paramApplicationLike.gy("uin", String.valueOf(l2)).gy("code-version", com.tencent.mm.sdk.platformtools.d.CLIENT_VERSION).gy("code-reversion", com.tencent.mm.sdk.platformtools.d.REV);
      if (!ao.isWifi(ad.getContext())) {
        break label645;
      }
      i = 3;
      paramApplicationLike = paramApplicationLike.gy("network", String.valueOf(i)).gy("sdk", String.valueOf(Build.VERSION.SDK_INT)).gy("os-name", com.tencent.mm.protocal.d.qVK).gy("device-brand", com.tencent.mm.protocal.d.qVH).gy("device-name", com.tencent.mm.protocal.d.DEVICE_NAME);
      localf = new f();
      if ((paramApplicationLike.vFW != null) && (paramApplicationLike.vFV != null)) {
        break label650;
      }
      com.tencent.tinker.lib.f.a.e("Tinker.TinkerClient", "setPatchRequestCallback, tinkerServerClient or tinkerClient is null, just return", new Object[0]);
    }
    for (;;)
    {
      x.i("Tinker.TinkerPatchManager", "try installing end");
      knb = true;
      return;
      com.tencent.tinker.lib.f.a.i("Tinker.TinkerClient", "set debugger to %b", new Object[] { Boolean.valueOf(bool) });
      paramApplicationLike.vFW.isDebug = bool;
      paramApplicationLike = com.tinkerboots.sdk.a.vFU;
      break;
      label645:
      i = 2;
      break label510;
      label650:
      com.tencent.tinker.lib.f.a.i("Tinker.TinkerClient", "setPatchRequestCallback with hashcode %d", new Object[] { Integer.valueOf(localf.hashCode()) });
      paramApplicationLike.vFW.vGb = localf;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/hp/tinker/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */