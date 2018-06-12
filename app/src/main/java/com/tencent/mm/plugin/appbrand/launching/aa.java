package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appcache.ab;
import com.tencent.mm.plugin.appbrand.appcache.al;
import com.tencent.mm.plugin.appbrand.appcache.ap;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.launching.a.b;
import com.tencent.mm.protocal.c.aqj;
import com.tencent.mm.protocal.c.cgg;
import com.tencent.mm.protocal.c.chh;
import com.tencent.mm.protocal.c.chx;
import com.tencent.mm.sdk.platformtools.bi;

final class aa
  extends w<t>
{
  final String appId;
  final int cbB;
  final int cbu;
  final int fKP;
  final int fmv;
  final AppBrandLaunchReferrer fqA;
  final String fqx;
  final int gfw;
  final String gfx;
  
  aa(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, String paramString3, int paramInt4)
  {
    this.appId = paramString1;
    this.fmv = paramInt1;
    this.cbB = paramInt2;
    this.gfw = paramInt3;
    this.fqx = paramString2;
    this.fqA = paramAppBrandLaunchReferrer;
    this.gfx = paramString3;
    paramString1 = e.abi().a(paramString1, paramInt1, new String[] { "version" });
    if (paramString1 == null)
    {
      paramInt1 = i;
      this.cbu = paramInt1;
      if (paramInt4 < 0) {
        break label96;
      }
    }
    for (;;)
    {
      this.fKP = paramInt4;
      return;
      paramInt1 = paramString1.field_version;
      break;
      label96:
      paramInt4 = ab.abL();
    }
  }
  
  public final t akL()
  {
    int j = 0;
    Object localObject2 = new t();
    ((t)localObject2).field_appId = this.appId;
    Object localObject3 = e.abb();
    if (localObject3 == null) {
      return null;
    }
    Object localObject1 = new cgg();
    ((cgg)localObject1).rRb = this.fmv;
    ((cgg)localObject1).riv = this.cbu;
    ((cgg)localObject1).otY = this.gfw;
    ((cgg)localObject1).rUC = this.fqx;
    ((cgg)localObject1).rUB = 0;
    ((cgg)localObject1).rUA = this.cbB;
    int i;
    if (1055 == this.gfw) {
      i = 1;
    }
    for (;;)
    {
      if (i == 0) {
        if (((s)localObject3).a((t)localObject2, new String[] { "appId" }))
        {
          i = j;
          if (((t)localObject2).field_jsapiInfo != null) {
            i = 1;
          }
          if ((i != 0) && (((t)localObject2).field_launchAction != null) && (1 == ((t)localObject2).field_launchAction.qZk)) {
            break;
          }
        }
      }
      localObject2 = b.b(this.fqA);
      localObject3 = b.c(this.fqA);
      long l1 = bi.VF();
      localObject1 = new com.tencent.mm.plugin.appbrand.launching.a.a(this.appId, true, (cgg)localObject1, (chx)localObject2, (chh)localObject3, this.gfx, this.fKP);
      ((com.tencent.mm.plugin.appbrand.launching.a.a)localObject1).ggm = true;
      com.tencent.mm.ab.w.a((com.tencent.mm.ab.a)localObject1);
      long l2 = bi.VF();
      r.a(r.b.ggj, this.appId, this.cbu, this.fmv, this.gfw, l2 - l1);
      return ((com.tencent.mm.plugin.appbrand.launching.a.a)localObject1).ggV;
      if (1037 == this.gfw)
      {
        i = 1;
      }
      else
      {
        int[] arrayOfInt = AppBrandGlobalSystemConfig.adZ().fpL;
        if ((arrayOfInt != null) && (com.tencent.mm.compatible.loader.a.c(arrayOfInt, this.gfw))) {
          i = 1;
        } else {
          i = 0;
        }
      }
    }
    new com.tencent.mm.plugin.appbrand.launching.a.a(this.appId, (cgg)localObject1, this.gfx, this.fKP).akR();
    return (t)localObject2;
  }
  
  final String getTag()
  {
    return "MicroMsg.AppBrand.PrepareStepCheckLaunchInfo";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */