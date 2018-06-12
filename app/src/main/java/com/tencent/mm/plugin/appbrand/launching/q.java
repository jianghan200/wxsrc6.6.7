package com.tencent.mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.mm.ab.a.a;
import com.tencent.mm.ab.w;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.ak;
import com.tencent.mm.plugin.appbrand.appcache.al;
import com.tencent.mm.plugin.appbrand.appcache.ap;
import com.tencent.mm.plugin.appbrand.appcache.aq;
import com.tencent.mm.plugin.appbrand.appcache.aq.a;
import com.tencent.mm.plugin.appbrand.appcache.r;
import com.tencent.mm.plugin.appbrand.report.a;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI;
import com.tencent.mm.protocal.c.ain;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Locale;

final class q
  extends o
{
  final String appId;
  final int bPh;
  final String fgp;
  
  q(String paramString1, String paramString2, int paramInt)
  {
    super(new r(paramString1, paramString2));
    this.appId = paramString1;
    this.fgp = paramString2;
    this.bPh = paramInt;
  }
  
  public final String akH()
  {
    return String.format(Locale.US, "appId %s, module %s, pkgType %d", new Object[] { this.appId, this.fgp, Integer.valueOf(this.bPh) });
  }
  
  public final void prepare()
  {
    int k = -1;
    Object localObject1 = ak.t(this.gfS.toString(), this.bPh, 1);
    if (((Pair)localObject1).second != null)
    {
      ((WxaPkgWrappingInfo)((Pair)localObject1).second).name = this.fgp;
      d((WxaPkgWrappingInfo)((Pair)localObject1).second);
    }
    Object localObject2;
    label252:
    label259:
    label301:
    label349:
    label358:
    label367:
    label502:
    label542:
    do
    {
      return;
      if (bi.oW(this.fgp)) {}
      for (localObject1 = e.abi().ai(this.appId, this.bPh);; localObject1 = null)
      {
        localObject2 = new q.1(this, this.bPh);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.LaunchPkgPrepareJobTestCode", "%s before download, url(%s)", new Object[] { akH(), localObject1 });
        if (!bi.oW((String)localObject1)) {
          break label542;
        }
        d(null);
        return;
        localObject1 = e.abi().a(this.gfS.toString(), this.bPh, new String[] { "versionMd5" });
        if (localObject1 != null) {
          break;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrand.LaunchPkgPrepareJobTestCode", "%s, NULL record", new Object[] { akH() });
      }
      localObject1 = w.a(new com.tencent.mm.plugin.appbrand.appcache.c(this.appId, this.fgp, ((al)localObject1).field_versionMd5, this.bPh));
      if ((localObject1 == null) || (((a.a)localObject1).errType != 0) || (((a.a)localObject1).errCode != 0))
      {
        localObject2 = akH();
        int i;
        int m;
        if (localObject1 == null)
        {
          i = -1;
          if (localObject1 != null) {
            break label349;
          }
          j = -1;
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrand.LaunchPkgPrepareJobTestCode", "%s, cgi failed, %d %d", new Object[] { localObject2, Integer.valueOf(i), Integer.valueOf(j) });
          m = s.j.app_brand_prepare_get_cdn_url_err;
          if (localObject1 != null) {
            break label358;
          }
          i = -1;
          if (localObject1 != null) {
            break label367;
          }
        }
        for (int j = k;; j = ((a.a)localObject1).errCode)
        {
          x.um(x.getMMString(m, new Object[] { Integer.valueOf(i), Integer.valueOf(j) }));
          localObject1 = null;
          break;
          i = ((a.a)localObject1).errType;
          break label252;
          j = ((a.a)localObject1).errCode;
          break label259;
          i = ((a.a)localObject1).errType;
          break label301;
        }
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.LaunchPkgPrepareJobTestCode", "resp.errcode %d, resp.errmsg %s, resp.url %s", new Object[] { Integer.valueOf(((ain)((a.a)localObject1).dIv).rLp), ((ain)((a.a)localObject1).dIv).rLo, ((ain)((a.a)localObject1).dIv).dPW });
      if (bi.oW(((ain)((a.a)localObject1).dIv).dPW))
      {
        if (((ain)((a.a)localObject1).dIv).rLp != 64535) {
          break label502;
        }
        AppBrand404PageUI.show(s.j.app_brand_qrcode_result_uin_invalid);
        a.G(this.appId, 4, this.bPh + 1);
      }
      for (;;)
      {
        localObject1 = ((ain)((a.a)localObject1).dIv).dPW;
        break;
        x.um(com.tencent.mm.plugin.appbrand.r.c.getMMString(s.j.app_brand_preparing_comm_err_code, new Object[] { Integer.valueOf(5), Integer.valueOf(((ain)((a.a)localObject1).dIv).rLp) }));
      }
    } while (aq.b(this.gfS.toString(), this.bPh, 1, (String)localObject1, (aq.a)localObject2));
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrand.LaunchPkgPrepareJobTestCode", "%s start downloadPkg failed", new Object[] { akH() });
    d(null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */