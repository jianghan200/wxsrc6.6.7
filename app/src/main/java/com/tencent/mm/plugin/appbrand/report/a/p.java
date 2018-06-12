package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.r.c;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.b;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.LinkedList;

public final class p
{
  private static final p gsB = new p(true);
  public String appId;
  public int apptype;
  public int bGF;
  public String bGG;
  public String bGH;
  public String bJK;
  public int cbB;
  public String cbC;
  public int cbu;
  public g fdO;
  public int gqK;
  private final boolean grE;
  boolean grH = false;
  public String grI;
  public String grK;
  public int grL;
  public String grM;
  public long grN;
  public int grO;
  public int grP;
  public String grQ;
  String gsC = "";
  public final LinkedList<String> gsD = new LinkedList();
  public String gsE;
  public boolean gsF = true;
  public int scene;
  
  private p(boolean paramBoolean)
  {
    this.grE = paramBoolean;
  }
  
  public static p a(g paramg, String paramString, LinkedList<String> paramLinkedList)
  {
    p localp = new p(false);
    localp.bJK = paramString;
    paramString = paramg.fcE;
    localp.scene = paramString.scene;
    localp.bGG = paramString.bGG;
    localp.appId = paramg.mAppId;
    localp.fdO = paramg;
    localp.bGF = (paramg.fcu.frm.fih + 1);
    localp.cbu = paramg.fcu.frm.fii;
    localp.gqK = paramString.gqK;
    localp.cbB = paramString.cbB;
    localp.cbC = paramString.cbC;
    localp.gsD.addAll(paramLinkedList);
    return localp;
  }
  
  public static p amS()
  {
    return gsB;
  }
  
  public final void b(com.tencent.mm.plugin.appbrand.page.p paramp, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 7)
    {
      this.grL = i;
      String str = (String)this.gsD.pollFirst();
      this.grM = str;
      this.grK = str;
      if (!paramBoolean) {
        this.grM = this.gsC;
      }
      k(paramp);
      return;
    }
  }
  
  public final void k(com.tencent.mm.plugin.appbrand.page.p paramp)
  {
    Object localObject1 = paramp.alS();
    if (localObject1 == null) {
      return;
    }
    Object localObject2 = paramp.fdO.fcu;
    if (localObject2 != null)
    {
      this.cbu = ((AppBrandSysConfig)localObject2).frm.fii;
      this.grO = WxaCommLibRuntimeReader.abP().fii;
    }
    this.grN = System.currentTimeMillis();
    localObject2 = ((com.tencent.mm.plugin.appbrand.jsapi.p.a)localObject1).getWebView().getUrl();
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = "";
    }
    this.gsE = com.tencent.mm.compatible.util.p.encode((String)localObject1);
    this.bGH = paramp.getURL();
    this.grQ = paramp.ahc();
    this.grI = com.tencent.mm.plugin.appbrand.report.a.cH(ad.getContext());
    int i;
    if (this.gsF)
    {
      i = 1;
      label116:
      this.grP = i;
      this.gsF = false;
      paramp = paramp.fdO;
      if (paramp != null) {
        break label427;
      }
      paramp = null;
      label137:
      if (paramp == null) {
        break label435;
      }
      this.apptype = paramp.bGM;
    }
    for (;;)
    {
      this.apptype += 1000;
      if (this.grE) {
        break;
      }
      x.i("MicroMsg.AppBrand.Report.kv_14992", "report " + toString());
      paramp = new p.1(this, new Object[] { Integer.valueOf(this.scene), this.bGG, this.bJK, this.appId, Integer.valueOf(this.cbu), Integer.valueOf(this.bGF), Integer.valueOf(this.gqK), this.bGH, this.gsE, this.grI, this.grK, Integer.valueOf(this.grL), this.grM, Long.valueOf(this.grN), Integer.valueOf(this.grO), Integer.valueOf(this.cbB), this.cbC, Integer.valueOf(this.grP), this.grQ, Integer.valueOf(this.apptype) });
      if (!this.grH) {
        break label471;
      }
      paramp.run();
      try
      {
        KVCommCrossProcessReceiver.brP();
        return;
      }
      catch (Exception paramp)
      {
        x.printErrStackTrace("MicroMsg.AppBrand.Report.kv_14992", paramp, "sendKV", new Object[0]);
        return;
      }
      i = 0;
      break label116;
      label427:
      paramp = paramp.fct;
      break label137;
      label435:
      this.apptype = b.vo(this.appId);
      x.i("MicroMsg.AppBrand.Report.kv_14992", "prepareCommonFields null = initConfig! apptype:%s", new Object[] { Integer.valueOf(this.apptype) });
    }
    label471:
    c.Em().H(paramp);
  }
  
  public final String toString()
  {
    return "kv_4992{scene=" + this.scene + ", sceneNote='" + this.bGG + '\'' + ", sessionId='" + this.bJK + '\'' + ", appId='" + this.appId + '\'' + ", appVersion=" + this.cbu + ", appState=" + this.bGF + ", usedState=" + this.gqK + ", pagePath='" + this.bGH + '\'' + ", currentUrl='" + this.gsE + '\'' + ", networkType='" + this.grI + '\'' + ", referPagePath='" + this.grK + '\'' + ", targetAction=" + this.grL + ", targetPagePath='" + this.grM + '\'' + ", clickTimestamp=" + this.grN + ", publicLibVersion=" + this.grO + ", preScene=" + this.cbB + ", preSceneNote='" + this.cbC + '\'' + ", isEntrance=" + this.grP + ", apptype=" + this.apptype + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/a/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */