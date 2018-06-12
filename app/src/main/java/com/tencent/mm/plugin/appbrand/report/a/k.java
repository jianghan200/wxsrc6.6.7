package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.a;
import com.tencent.mm.protocal.c.cgu;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class k
{
  private static final k gsi = new k(true, g.grq);
  public String appId;
  public int bGF;
  public String bGG;
  public String bGH;
  public String bJK;
  public int cbB;
  public String cbC;
  public int gqK;
  private final boolean grE;
  private final g grG;
  public String grK;
  public int grP;
  public int scene;
  
  private k(boolean paramBoolean, g paramg)
  {
    this.grE = paramBoolean;
    this.grG = paramg;
  }
  
  public static k amQ()
  {
    return gsi;
  }
  
  public static k b(com.tencent.mm.plugin.appbrand.g paramg, String paramString, g paramg1)
  {
    paramg1 = new k(false, paramg1);
    paramg1.bJK = paramString;
    paramg1.appId = paramg.mAppId;
    paramString = paramg.fcE;
    paramg1.scene = paramString.scene;
    paramg1.bGG = paramString.bGG;
    paramg1.cbB = paramString.cbB;
    paramg1.cbC = paramString.cbC;
    paramg1.gqK = paramString.gqK;
    paramg1.bGF = (paramg.fcu.frm.fih + 1);
    return paramg1;
  }
  
  public final void j(p paramp)
  {
    this.bGH = paramp.ahc();
    paramp = this.grG.g(paramp);
    if ((paramp != null) && (paramp.grt != null))
    {
      paramp = paramp.grt.path;
      this.grK = paramp;
      if (!this.grG.vr(this.bGH)) {
        break label242;
      }
    }
    label242:
    for (int i = 1;; i = 0)
    {
      this.grP = i;
      if (!this.grE)
      {
        paramp = new cgu();
        paramp.hcE = 1;
        paramp.jQb = this.appId;
        paramp.sAS = this.bGH;
        paramp.mEb = 0;
        paramp.ixe = ((int)bi.VE());
        paramp.mEc = 1;
        paramp.sAT = "";
        paramp.sAU = this.bGF;
        paramp.sAV = this.bJK;
        paramp.sAW = a.cH(ad.getContext());
        paramp.pPq = this.scene;
        paramp.sAX = this.gqK;
        paramp.sAY = this.bGG;
        paramp.grK = this.grK;
        paramp.cbB = this.cbB;
        paramp.cbC = this.cbC;
        paramp.grP = this.grP;
        AppBrandIDKeyBatchReport.a(paramp);
        x.i("MicroMsg.AppBrand.Report.kv_14004", "report " + toString());
      }
      return;
      paramp = null;
      break;
    }
  }
  
  public final String toString()
  {
    return "kv_14004{appId='" + this.appId + '\'' + ", sessionId='" + this.bJK + '\'' + ", scene=" + this.scene + ", sceneNote='" + this.bGG + '\'' + ", preScene=" + this.cbB + ", preSceneNote='" + this.cbC + '\'' + ", pagePath='" + this.bGH + '\'' + ", usedState=" + this.gqK + ", appState=" + this.bGF + ", referPagePath='" + this.grK + '\'' + ", isEntrance=" + this.grP + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */