package com.tencent.mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.mm.by.f;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.ak;
import com.tencent.mm.plugin.appbrand.appcache.ak.a;
import com.tencent.mm.plugin.appbrand.appcache.al;
import com.tencent.mm.plugin.appbrand.appcache.ap;
import com.tencent.mm.plugin.appbrand.appcache.b;
import com.tencent.mm.plugin.appbrand.appcache.d.a;
import com.tencent.mm.plugin.appbrand.appcache.k;
import com.tencent.mm.plugin.appbrand.appcache.r;
import com.tencent.mm.protocal.c.akl;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Locale;

public final class p
  extends o
{
  public final String appId;
  public final int bPh = 0;
  public final String fgp;
  public final int gfU;
  public final boolean gfV;
  
  public p(String paramString1, String paramString2, int paramInt)
  {
    this(paramString1, paramString2, paramInt, true);
  }
  
  public p(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    super(new r(paramString1, paramString2));
    this.appId = paramString1;
    this.fgp = paramString2;
    this.gfU = paramInt;
    this.gfV = paramBoolean;
  }
  
  public final String akH()
  {
    return String.format(Locale.US, "pkg %s, targetVersion %d, pkgType %d", new Object[] { this.gfS.toString(), Integer.valueOf(this.gfU), Integer.valueOf(0) });
  }
  
  public final void prepare()
  {
    Object localObject = ak.t(this.gfS.toString(), 0, this.gfU);
    if (((Pair)localObject).second != null)
    {
      x.i("MicroMsg.AppBrand.LaunchPkgPrepareJobReleaseCode", "%s prepare ok", new Object[] { akH() });
      ((WxaPkgWrappingInfo)((Pair)localObject).second).name = this.fgp;
      d((WxaPkgWrappingInfo)((Pair)localObject).second);
      return;
    }
    if (ak.a.fhF.equals(((Pair)localObject).first))
    {
      x.i("MicroMsg.AppBrand.LaunchPkgPrepareJobReleaseCode", "%s getDownloadURL", new Object[] { akH() });
      localObject = new akl();
      ((akl)localObject).bPS = this.appId;
      ((akl)localObject).rkb = this.gfU;
      ((akl)localObject).rNa = 0;
      if (!bi.oW(this.fgp))
      {
        ((akl)localObject).rLl = this.fgp;
        ((akl)localObject).rNa = 4;
      }
      ((akl)localObject).rMZ = com.tencent.mm.plugin.appbrand.app.e.abi().a(this.gfS.toString(), 0, new String[] { "versionMd5" }).field_versionMd5;
      if ((k.abE()) && (d.a.jC(0)))
      {
        WxaPkgWrappingInfo localWxaPkgWrappingInfo = e.aG(this.gfS.toString(), 1);
        if (localWxaPkgWrappingInfo != null) {
          ((akl)localObject).rNb = localWxaPkgWrappingInfo.fii;
        }
      }
      new b((akl)localObject).KM().h(new p.1(this, (akl)localObject));
      return;
    }
    x.e("MicroMsg.AppBrand.LaunchPkgPrepareJobReleaseCode", "%s, local check failed ret=%s", new Object[] { akH(), ((Pair)localObject).first });
    d(null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */