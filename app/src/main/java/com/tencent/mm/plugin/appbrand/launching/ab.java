package com.tencent.mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.mm.ab.a.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.a.d.h;
import com.tencent.mm.plugin.appbrand.appcache.al;
import com.tencent.mm.plugin.appbrand.appcache.ap;
import com.tencent.mm.plugin.appbrand.appcache.d.a;
import com.tencent.mm.plugin.appbrand.appcache.k;
import com.tencent.mm.plugin.appbrand.appusage.d;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.d;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Locale;

final class ab
  extends w<Pair<WxaAttributes, Boolean>>
{
  private String appId;
  private final int fmv;
  private final String fqx;
  private final int gfw;
  private boolean ggA = false;
  private boolean ggB = false;
  private int ggC = r.a.gfZ;
  private final int ggz;
  private String username;
  
  ab(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    this.username = paramString1;
    this.appId = paramString2;
    this.fmv = paramInt1;
    this.ggz = paramInt2;
    this.gfw = paramInt3;
    this.fqx = paramString3;
  }
  
  private WxaAttributes akN()
  {
    if (!bi.oW(this.username)) {
      return com.tencent.mm.plugin.appbrand.app.e.aba().e(this.username, new String[0]);
    }
    return com.tencent.mm.plugin.appbrand.app.e.aba().f(this.appId, new String[0]);
  }
  
  private static boolean c(WxaAttributes paramWxaAttributes)
  {
    if (bi.oW(paramWxaAttributes.field_appId))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "invalid appID in contact(%s)", new Object[] { paramWxaAttributes.field_username });
      return true;
    }
    if ((paramWxaAttributes.ael().fsi == 0) && (bi.oW(paramWxaAttributes.ael().fsj)))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "invalid versionMD5 in contact(%s)", new Object[] { paramWxaAttributes.field_username });
      return true;
    }
    return false;
  }
  
  public final Pair<WxaAttributes, Boolean> akM()
  {
    Object localObject2 = akN();
    long l1;
    Object localObject1;
    label93:
    int i;
    if (localObject2 == null)
    {
      this.ggA = true;
      this.ggC = r.a.ggg;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "getAttrs, awaitCgi=%B, fallbackIfCgiFailed=%B, reason=%d", new Object[] { Boolean.valueOf(this.ggA), Boolean.valueOf(this.ggB), Integer.valueOf(this.ggC - 1) });
      l1 = bi.VF();
      if (!bi.oW(this.username)) {
        break label1031;
      }
      localObject1 = com.tencent.mm.plugin.appbrand.config.r.R(this.appId, this.ggA);
      if (((Pair)localObject1).first != null) {
        break label1099;
      }
      i = s.j.app_brand_preparing_attr_sync_timeout;
      if (((Pair)localObject1).second != null) {
        break label1047;
      }
      localObject2 = "";
      label117:
      x.um(x.getMMString(i, new Object[] { localObject2 }));
      com.tencent.mm.plugin.appbrand.report.a.G("", 7, this.fmv + 1);
      label146:
      if ((!this.ggA) || (((Pair)localObject1).second == null) || (((a.a)((Pair)localObject1).second).errType == 0)) {
        break label1227;
      }
      if (!this.ggB) {
        break label1151;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "getInternal, await but cgi failed, return result from db");
      localObject1 = Pair.create(akN(), Boolean.valueOf(false));
    }
    for (;;)
    {
      localObject2 = localObject1;
      if (c((WxaAttributes)((Pair)localObject1).first))
      {
        x.lc(s.j.app_brand_launching_get_attrs_invalid_fields);
        localObject2 = Pair.create(null, Boolean.valueOf(false));
      }
      return (Pair<WxaAttributes, Boolean>)localObject2;
      this.username = ((WxaAttributes)localObject2).field_username;
      this.appId = ((WxaAttributes)localObject2).field_appId;
      if (c((WxaAttributes)localObject2))
      {
        q.rZ(this.username);
        this.ggA = true;
        this.ggC = r.a.ggc;
        break;
      }
      localObject1 = this.username;
      Object localObject3 = new com.tencent.mm.plugin.appbrand.appusage.a();
      ((com.tencent.mm.plugin.appbrand.appusage.a)localObject3).field_username = ((String)localObject1);
      if (!((d)com.tencent.mm.plugin.appbrand.app.e.x(d.class)).b((c)localObject3, new String[0])) {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateByLastOpenTime, usage record not found with username(%s), forceUpdate=TRUE", new Object[] { localObject1 });
      }
      for (i = 1;; i = 0)
      {
        if (i == 0) {
          break label376;
        }
        this.ggA = true;
        this.ggB = true;
        this.ggC = r.a.ggb;
        break;
      }
      label376:
      if (!d.a.jC(this.fmv)) {
        break;
      }
      if ((this.ggz > 0) && (this.ggz > ((WxaAttributes)localObject2).ael().cbu))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "call, preferVersion[%d], attrs.appVersion[%d], forceSync", new Object[] { Integer.valueOf(this.ggz), Integer.valueOf(((WxaAttributes)localObject2).ael().cbu) });
        this.ggA = true;
        this.ggC = r.a.ggd;
        break;
      }
      if ((k.abG()) && (((WxaAttributes)localObject2).ael() != null) && (((WxaAttributes)localObject2).ael().fsm))
      {
        i = 1;
        label485:
        if (i == 0) {
          break label623;
        }
        localObject1 = new com.tencent.mm.plugin.appbrand.appcache.r(((WxaAttributes)localObject2).field_appId, "__APP__").toString();
        label508:
        i = ((WxaAttributes)localObject2).ael().cbu;
        if (this.fmv != 0) {
          break label801;
        }
        localObject3 = com.tencent.mm.plugin.appbrand.app.e.abi().a((String)localObject1, i, 0, new String[] { "version", "pkgPath", "versionMd5" });
        if (localObject3 != null) {
          break label633;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, get null manifest record by key(%s), version(%d), forceSync", new Object[] { localObject1, Integer.valueOf(i) });
        i = 1;
      }
      label623:
      label633:
      boolean bool1;
      for (;;)
      {
        if (i == 0) {
          break label917;
        }
        this.ggA = true;
        if (this.ggC != r.a.gfZ) {
          break;
        }
        this.ggC = r.a.gga;
        break;
        i = 0;
        break label485;
        localObject1 = ((WxaAttributes)localObject2).field_appId;
        break label508;
        if ((!bi.oW(((al)localObject3).field_pkgPath)) && (((al)localObject3).field_versionMd5.equals(com.tencent.mm.a.g.cu(((al)localObject3).field_pkgPath))))
        {
          bool1 = true;
          label666:
          if (bi.oW(this.fqx)) {
            break label773;
          }
          if ((!bool1) || (!e.bA(((al)localObject3).field_pkgPath, this.fqx))) {
            break label762;
          }
        }
        label762:
        for (boolean bool2 = true;; bool2 = false)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, latestPkgExists[%B], enterPath[%s], pathAccessible[%B]", new Object[] { Boolean.valueOf(bool1), this.fqx, Boolean.valueOf(bool2) });
          if (!bool2) {
            this.ggC = r.a.gge;
          }
          if (bool2) {
            break label768;
          }
          i = 1;
          break;
          bool1 = false;
          break label666;
        }
        label768:
        i = 0;
      }
      label773:
      if (bool1) {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "local available pkg version[%d] LATEST, no need force update", new Object[] { Integer.valueOf(((al)localObject3).field_version) });
      }
      for (;;)
      {
        label801:
        i = 0;
        break;
        localObject1 = e.aG(this.appId, 1);
        if (localObject1 == null)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, no local available pkg, force update");
          i = 1;
          break;
        }
        if ((this.ggz > 0) && (this.ggz > ((WxaPkgWrappingInfo)localObject1).fii))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, local available pkg version[%d], preferred version[%d], force update", new Object[] { Integer.valueOf(((WxaPkgWrappingInfo)localObject1).fii), Integer.valueOf(this.ggz) });
          i = 1;
          break;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, local available pkg version[%d], no need force update", new Object[] { Integer.valueOf(((WxaPkgWrappingInfo)localObject1).fii) });
      }
      label917:
      localObject3 = (h)com.tencent.mm.plugin.appbrand.app.e.x(h.class);
      String str = ((WxaAttributes)localObject2).field_username;
      if (!bi.oW(str))
      {
        localObject1 = new com.tencent.mm.plugin.appbrand.appcache.a.d.g();
        ((com.tencent.mm.plugin.appbrand.appcache.a.d.g)localObject1).field_username = str;
        if (!((h)localObject3).b((c)localObject1, new String[0])) {}
      }
      for (;;)
      {
        if ((localObject1 == null) || (((com.tencent.mm.plugin.appbrand.appcache.a.d.g)localObject1).field_appVersion <= ((WxaAttributes)localObject2).ael().cbu)) {
          break label1029;
        }
        this.ggA = true;
        this.ggC = r.a.ggf;
        i = com.tencent.mm.plugin.appbrand.appcache.a.c.a.fiY;
        com.tencent.mm.plugin.appbrand.appcache.a.c.a.n(((com.tencent.mm.plugin.appbrand.appcache.a.d.g)localObject1).field_reportId, 154L);
        break;
        localObject1 = null;
      }
      label1029:
      break;
      label1031:
      localObject1 = com.tencent.mm.plugin.appbrand.config.r.S(this.username, this.ggA);
      break label93;
      label1047:
      localObject2 = String.format(Locale.US, "(%d,%d)", new Object[] { Integer.valueOf(((a.a)((Pair)localObject1).second).errType), Integer.valueOf(((a.a)((Pair)localObject1).second).errCode) });
      break label117;
      label1099:
      long l2 = bi.VF();
      if (((Pair)localObject1).second == null) {
        break label146;
      }
      r.a(r.b.ggi, this.appId, ((WxaAttributes)((Pair)localObject1).first).ael().cbu, this.fmv, this.gfw, l2 - l1);
      break label146;
      label1151:
      x.um(x.getMMString(s.j.app_brand_preparing_attr_sync_timeout, new Object[] { String.format(Locale.US, "(%d,%d)", new Object[] { Integer.valueOf(((a.a)((Pair)localObject1).second).errType), Integer.valueOf(((a.a)((Pair)localObject1).second).errCode) }) }));
      localObject1 = Pair.create(null, Boolean.valueOf(true));
      continue;
      label1227:
      localObject1 = Pair.create(((Pair)localObject1).first, Boolean.valueOf(this.ggA));
    }
  }
  
  final String getTag()
  {
    return "MicroMsg.AppBrand.PrepareStepGetWxaAttrs";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */