package com.tencent.mm.plugin.appbrand.dynamic.launching;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import com.tencent.mm.ab.a.a;
import com.tencent.mm.ab.w;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.a.c;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.ak;
import com.tencent.mm.plugin.appbrand.appcache.ak.a;
import com.tencent.mm.plugin.appbrand.appcache.al;
import com.tencent.mm.plugin.appbrand.appcache.ap;
import com.tencent.mm.plugin.appbrand.appcache.aq;
import com.tencent.mm.plugin.appbrand.dynamic.f.a;
import com.tencent.mm.plugin.appbrand.dynamic.i;
import com.tencent.mm.protocal.c.akm;
import com.tencent.mm.protocal.c.cgw;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public final class b
  implements Callable<WxaPkgWrappingInfo>
{
  public static int fwX = 0;
  public static int fwY = 1;
  final String appId;
  final int bPh;
  volatile int fii;
  String fuu;
  int fwV;
  volatile String fwZ;
  final String id;
  
  public b(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, String paramString4)
  {
    this.id = paramString1;
    this.appId = paramString2;
    this.bPh = paramInt1;
    this.fii = paramInt2;
    this.fwZ = paramString4;
    this.fwV = paramInt3;
    this.fuu = paramString3;
  }
  
  private static void a(ak.a parama)
  {
    if (ak.a.fhC.equals(parama)) {}
    while ((ak.a.fhE.equals(parama)) || (!ak.a.fhD.equals(parama))) {
      return;
    }
  }
  
  private WxaPkgWrappingInfo afq()
  {
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    com.tencent.mm.plugin.appbrand.q.h localh = new com.tencent.mm.plugin.appbrand.q.h();
    b.1 local1 = new b.1(this, localh, localCountDownLatch);
    if ((this.bPh == 10002) || (this.bPh == 10102))
    {
      x.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "triggerDownloading, debug type is release, start download appId(%s), pkgVersion(%d)", new Object[] { this.appId, Integer.valueOf(this.fii) });
      if (!aq.b(this.appId, this.bPh, this.fii, this.fwZ, local1))
      {
        a(ak.a.fhG);
        return null;
      }
    }
    else
    {
      x.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "triggerDownloading, appId = %s, debug type is %d", new Object[] { this.appId, Integer.valueOf(this.bPh) });
      if (((c)g.l(c.class)).aaN() == null)
      {
        x.e("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "triggerDownloading, null storage");
        a(ak.a.fhG);
        return null;
      }
      String str = ((c)g.l(c.class)).aaN().ai(this.appId, this.bPh);
      if (bi.oW(str))
      {
        x.e("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "triggerDownloading, url is null or nil");
        a(ak.a.fhC);
        return null;
      }
      aq.a(this.appId, this.bPh, str, local1);
    }
    try
    {
      localCountDownLatch.await();
      return (WxaPkgWrappingInfo)localh.value;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", localException, "tryDownload semaphore exp ", new Object[0]);
      }
    }
  }
  
  public final WxaPkgWrappingInfo afp()
  {
    int j = 1;
    Object localObject1 = ak.t(this.appId, this.bPh, this.fii);
    if (((Pair)localObject1).second != null) {
      localObject1 = (WxaPkgWrappingInfo)((Pair)localObject1).second;
    }
    Object localObject2;
    Object localObject3;
    do
    {
      return (WxaPkgWrappingInfo)localObject1;
      if (!ak.a.fhF.equals(((Pair)localObject1).first)) {
        break label879;
      }
      if ((this.bPh == 10002) || (this.bPh == 10102))
      {
        localObject2 = ((c)g.l(c.class)).aaN().a(this.appId, this.bPh, new String[] { "version", "versionMd5", "versionState" });
        if (localObject2 == null)
        {
          a((ak.a)((Pair)localObject1).first);
          return null;
        }
        if (this.bPh == 10102) {}
        for (i = 2;; i = 1)
        {
          localObject4 = w.b(new com.tencent.mm.plugin.appbrand.appcache.b(this.appId, ((al)localObject2).field_version, ((al)localObject2).field_versionMd5, i).diG);
          if ((localObject4 != null) && (((a.a)localObject4).errType == 0) && (((a.a)localObject4).errCode == 0)) {
            break;
          }
          if (this.fwV == 1)
          {
            if ((this.id != null) && (this.id.length() > 0))
            {
              localObject1 = new Bundle();
              ((Bundle)localObject1).putString("id", this.id);
              ((Bundle)localObject1).putInt("widgetState", 2105);
              f.a(i.aeT().sz(this.id), (Parcelable)localObject1, f.a.class, null);
            }
            com.tencent.mm.plugin.report.service.h.mEJ.h(14452, new Object[] { this.fuu + "-" + this.appId, Integer.valueOf(6), Long.valueOf(System.currentTimeMillis()) });
          }
          return null;
        }
        if (bi.oW(((akm)((a.a)localObject4).dIv).url))
        {
          if (this.fwV == 1) {
            com.tencent.mm.plugin.report.service.h.mEJ.h(14452, new Object[] { this.fuu + "-" + this.appId, Integer.valueOf(6), Long.valueOf(System.currentTimeMillis()) });
          }
          return null;
        }
        if (this.fwV == 1) {
          com.tencent.mm.plugin.report.service.h.mEJ.h(14452, new Object[] { this.fuu + "-" + this.appId, Integer.valueOf(5), Long.valueOf(System.currentTimeMillis()) });
        }
        localObject3 = new cgw();
        Object localObject4 = ((akm)((a.a)localObject4).dIv).url;
        this.fwZ = ((String)localObject4);
        ((cgw)localObject3).sBd = ((String)localObject4);
        i = ((al)localObject2).field_version;
        this.fii = i;
        ((cgw)localObject3).riv = i;
        ((cgw)localObject3).sBb = ((al)localObject2).field_versionState;
        ((cgw)localObject3).sBc = ((al)localObject2).field_versionMd5;
        ((c)g.l(c.class)).aaN().a(this.appId, (cgw)localObject3, this.bPh);
      }
      localObject2 = afq();
      if (localObject2 == null) {
        break;
      }
      localObject1 = localObject2;
    } while (this.fwV != 1);
    com.tencent.mm.plugin.report.service.h.mEJ.h(14452, new Object[] { this.fuu + "-" + this.appId, Integer.valueOf(7), Long.valueOf(System.currentTimeMillis()) });
    return (WxaPkgWrappingInfo)localObject2;
    if (this.fwV == 1) {
      com.tencent.mm.plugin.report.service.h.mEJ.h(14452, new Object[] { this.fuu + "-" + this.appId, Integer.valueOf(8), Long.valueOf(System.currentTimeMillis()) });
    }
    if ((this.bPh == 10002) || (this.bPh == 10102))
    {
      localObject2 = ((c)g.l(c.class)).aaN().qS(this.appId);
      if ((localObject2 == null) || (localObject2.length <= 1)) {}
    }
    for (int i = j;; i = j)
    {
      localObject3 = this.appId;
      int k = this.bPh;
      j = i + 1;
      localObject3 = ak.t((String)localObject3, k, localObject2[i]);
      if ((localObject3 != null) && (((Pair)localObject3).first == ak.a.fhB) && (((Pair)localObject3).second != null))
      {
        return (WxaPkgWrappingInfo)((Pair)localObject3).second;
        label879:
        if (ak.a.fhB.equals(((Pair)localObject1).first)) {
          break;
        }
        x.e("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "WxaPkgIntegrityChecker.checkPkg  appid %s, pkgType %d,pkgVersion %d return %d", new Object[] { this.appId, Integer.valueOf(this.bPh), Integer.valueOf(this.fii), Integer.valueOf(((ak.a)((Pair)localObject1).first).acj()) });
        break;
      }
      if (j >= localObject2.length)
      {
        a((ak.a)((Pair)localObject1).first);
        return null;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/launching/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */