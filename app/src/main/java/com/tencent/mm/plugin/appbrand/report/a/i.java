package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.a;
import com.tencent.mm.plugin.appbrand.report.b;
import com.tencent.mm.plugin.appbrand.report.f;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class i
{
  private static final i grF = new i(true, null);
  public String appId;
  public int apptype;
  public int bGF;
  public String bGG;
  public String bGH;
  public String bJK;
  public int cbB;
  public String cbC;
  public int cbu;
  public com.tencent.mm.plugin.appbrand.g fdO;
  public int gqK;
  public long grC;
  private final boolean grE;
  private final g grG;
  boolean grH = false;
  public String grI;
  public long grJ;
  public String grK;
  public int grL;
  public String grM;
  public long grN;
  public int grO;
  public int grP;
  public String grQ;
  public int scene;
  
  private i(boolean paramBoolean, g paramg)
  {
    this.grE = paramBoolean;
    this.grG = paramg;
  }
  
  public static i a(com.tencent.mm.plugin.appbrand.g paramg, String paramString, g paramg1)
  {
    paramg1 = new i(false, paramg1);
    paramg1.bJK = paramString;
    paramString = paramg.fcE;
    paramg1.scene = paramString.scene;
    paramg1.bGG = paramString.bGG;
    paramg1.appId = paramg.mAppId;
    paramg1.fdO = paramg;
    paramg1.bGF = (paramg.fcu.frm.fih + 1);
    paramg1.cbu = paramg.fcu.frm.fii;
    paramg1.gqK = paramString.gqK;
    paramg1.cbB = paramString.cbB;
    paramg1.cbC = paramString.cbC;
    return paramg1;
  }
  
  public static i amP()
  {
    return grF;
  }
  
  final void i(p paramp)
  {
    Object localObject = paramp.fdO.fcu;
    if (localObject != null)
    {
      this.cbu = ((AppBrandSysConfig)localObject).frm.fii;
      this.grO = WxaCommLibRuntimeReader.abP().fii;
    }
    this.grN = paramp.gnC.grg;
    this.grC = Math.max(0L, paramp.gnC.grh);
    localObject = paramp.gnC;
    long l1 = ((c)localObject).gre.gqM;
    long l2 = ((c)localObject).grg;
    long l3 = ((c)localObject).grh;
    label243:
    int i;
    if (l1 <= 0L)
    {
      x.i("MicroMsg.AppBrandPageViewStatistics", "foregroundMs invalid(%d), loadStart %d, loadCost %d, [%s/%s]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), ((c)localObject).mAppId, ((c)localObject).grf });
      if ((l2 > 0L) && (l3 > 0L) && (l1 == 0L))
      {
        l1 = bi.VF() - l2;
        this.grJ = l1;
        this.bGH = paramp.getURL();
        this.grQ = paramp.ahc();
        this.grI = a.cH(ad.getContext());
        localObject = this.grG.g(paramp);
        if (localObject != null) {
          break label337;
        }
        x.e("MicroMsg.AppBrand.Report.kv_13536", "visitNode (%s) not found, maybe page switching to quickly", new Object[] { paramp.ahc() });
        localObject = null;
        if (localObject != null) {
          break label347;
        }
        i = 0;
        label250:
        this.grL = i;
        if (localObject != null) {
          break label356;
        }
        localObject = null;
        label263:
        this.grM = ((String)localObject);
        if (!this.grG.vr(this.grQ)) {
          break label366;
        }
        i = 1;
        label287:
        this.grP = i;
        paramp = paramp.fdO;
        if (paramp != null) {
          break label371;
        }
        paramp = null;
        label303:
        if (paramp == null) {
          break label379;
        }
        this.apptype = paramp.bGM;
      }
    }
    for (;;)
    {
      this.apptype += 1000;
      return;
      l1 = Math.max(0L, l1);
      break;
      label337:
      localObject = ((g.a)localObject).grs;
      break label243;
      label347:
      i = ((g.c)localObject).type;
      break label250;
      label356:
      localObject = ((g.c)localObject).path;
      break label263;
      label366:
      i = 0;
      break label287;
      label371:
      paramp = paramp.fct;
      break label303;
      label379:
      this.apptype = b.vo(this.appId);
      x.i("MicroMsg.AppBrand.Report.kv_13536", "prepareCommonFields null = initConfig! apptype:%s", new Object[] { Integer.valueOf(this.apptype) });
    }
  }
  
  public final String toString()
  {
    return "kv_13536{scene=" + this.scene + ", sceneNote='" + this.bGG + '\'' + ", sessionId='" + this.bJK + '\'' + ", appId='" + this.appId + '\'' + ", appVersion=" + this.cbu + ", appState=" + this.bGF + ", usedState=" + this.gqK + ", pagePath='" + this.bGH + '\'' + ", networkType='" + this.grI + '\'' + ", costTime=" + this.grC + ", stayTime=" + this.grJ + ", referPagePath='" + this.grK + '\'' + ", targetAction=" + this.grL + ", targetPagePath='" + this.grM + '\'' + ", clickTimestamp=" + this.grN + ", publicLibVersion=" + this.grO + ", preScene=" + this.cbB + ", preSceneNote='" + this.cbC + '\'' + ", isEntrance=" + this.grP + ", apptype=" + this.apptype + '}';
  }
  
  final void xP()
  {
    if (this.grE) {
      return;
    }
    x.i("MicroMsg.AppBrand.Report.kv_13536", "report " + toString());
    i.1 local1 = new i.1(this, new Object[] { Integer.valueOf(this.scene), this.bGG, this.bJK, this.appId, Integer.valueOf(this.cbu), Integer.valueOf(this.bGF), Integer.valueOf(this.gqK), this.bGH, this.grI, Long.valueOf(this.grC), Long.valueOf(this.grJ), this.grK, Integer.valueOf(this.grL), this.grM, Long.valueOf(this.grN), Integer.valueOf(this.grO), Integer.valueOf(this.cbB), this.cbC, Integer.valueOf(this.grP), this.grQ, Integer.valueOf(this.apptype) });
    if (this.grH)
    {
      local1.run();
      try
      {
        KVCommCrossProcessReceiver.brP();
        return;
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.AppBrand.Report.kv_13536", localException, "sendKV", new Object[0]);
        return;
      }
    }
    com.tencent.mm.plugin.appbrand.r.c.Em().H(localException);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */