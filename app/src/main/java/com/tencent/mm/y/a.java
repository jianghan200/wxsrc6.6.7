package com.tencent.mm.y;

import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Map;

public class a
  extends d
{
  public boolean dvC;
  public String dvD;
  public int dvE;
  public boolean dvF;
  public String dvG;
  public String dvH;
  public String dvI;
  public String dvJ;
  public String dvK;
  public int dvL;
  public int dvM;
  
  public final d FD()
  {
    a locala = new a();
    locala.dvC = this.dvC;
    locala.dvD = this.dvD;
    locala.dvE = this.dvE;
    locala.dvF = this.dvF;
    locala.dvG = this.dvG;
    locala.dvH = this.dvH;
    locala.dvI = this.dvI;
    locala.dvJ = this.dvJ;
    locala.dvK = this.dvK;
    locala.dvL = this.dvL;
    locala.dvM = this.dvM;
    return locala;
  }
  
  public final void a(StringBuilder paramStringBuilder, g.a parama, String paramString, keep_SceneResult paramkeep_SceneResult, int paramInt1, int paramInt2)
  {
    paramStringBuilder.append("<weappinfo>");
    if (!bi.oW(parama.dyR)) {
      paramStringBuilder.append("<pagepath>" + g.a.gq(parama.dyR) + "</pagepath>");
    }
    paramStringBuilder.append("<username>" + bi.WS(parama.dyS) + "</username>");
    paramStringBuilder.append("<appid>" + bi.WS(parama.dyT) + "</appid>");
    if (parama.dza != 0) {
      paramStringBuilder.append("<version>" + parama.dza + "</version>");
    }
    if (parama.dyU != 0) {
      paramStringBuilder.append("<type>" + parama.dyU + "</type>");
    }
    if (!bi.oW(parama.dzb)) {
      paramStringBuilder.append("<weappiconurl>" + g.a.gq(parama.dzb) + "</weappiconurl>");
    }
    if (!bi.oW(parama.dyX)) {
      paramStringBuilder.append("<shareId>" + g.a.gq(parama.dyX) + "</shareId>");
    }
    if ((parama.dyZ == 1) || (parama.dyZ == 2))
    {
      paramStringBuilder.append("<pkginfo>");
      paramStringBuilder.append("<type>");
      paramStringBuilder.append(parama.dyZ);
      paramStringBuilder.append("</type>");
      paramStringBuilder.append("<md5>");
      paramStringBuilder.append(parama.dyV);
      paramStringBuilder.append("</md5>");
      paramStringBuilder.append("</pkginfo>");
    }
    if (!bi.oW(parama.dyY)) {
      paramStringBuilder.append("<sharekey>" + g.a.gq(parama.dyY) + "</sharekey>");
    }
    if (this.dvC)
    {
      paramStringBuilder.append("<wadynamicpageinfo>");
      paramStringBuilder.append("<shouldUseDynamicPage>1</shouldUseDynamicPage>");
      paramStringBuilder.append("<cacheKey>");
      paramStringBuilder.append(g.a.gq(this.dvD));
      paramStringBuilder.append("</cacheKey>");
      paramStringBuilder.append("</wadynamicpageinfo>");
    }
    if (this.dvF)
    {
      paramStringBuilder.append("<waupdatablemsginfo>");
      paramStringBuilder.append("<shoulduseupdatablemsg>1</shoulduseupdatablemsg>");
      paramStringBuilder.append("<updatablemsgperiod>");
      paramStringBuilder.append(this.dvL);
      paramStringBuilder.append("</updatablemsgperiod>");
      paramStringBuilder.append("<updatablemsgstate>");
      paramStringBuilder.append(this.dvM);
      paramStringBuilder.append("</updatablemsgstate>");
      paramStringBuilder.append("<updatablemsgcontent>");
      paramStringBuilder.append(g.a.gq(this.dvG));
      paramStringBuilder.append("</updatablemsgcontent>");
      paramStringBuilder.append("<updatablemsgcontentcolor>");
      paramStringBuilder.append(g.a.gq(this.dvH));
      paramStringBuilder.append("</updatablemsgcontentcolor>");
      paramStringBuilder.append("<subscribeentrycontent>");
      paramStringBuilder.append(g.a.gq(this.dvI));
      paramStringBuilder.append("</subscribeentrycontent>");
      paramStringBuilder.append("<subscribeentrybuttonwording>");
      paramStringBuilder.append(g.a.gq(this.dvJ));
      paramStringBuilder.append("</subscribeentrybuttonwording>");
      paramStringBuilder.append("<subscribeconfirmedcontent>");
      paramStringBuilder.append(g.a.gq(this.dvK));
      paramStringBuilder.append("</subscribeconfirmedcontent>");
      paramStringBuilder.append("</waupdatablemsginfo>");
    }
    paramStringBuilder.append("<appservicetype>" + this.dvE + "</appservicetype>");
    paramStringBuilder.append("</weappinfo>");
  }
  
  public final void a(Map<String, String> paramMap, g.a parama)
  {
    boolean bool2 = false;
    if (bi.getInt((String)paramMap.get(".msg.appmsg.weappinfo.wadynamicpageinfo.shouldUseDynamicPage"), 0) == 1) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      this.dvC = bool1;
      this.dvD = ((String)paramMap.get(".msg.appmsg.weappinfo.wadynamicpageinfo.cacheKey"));
      this.dvE = bi.getInt((String)paramMap.get(".msg.appmsg.weappinfo.appservicetype"), this.dvE);
      bool1 = bool2;
      if (bi.getInt((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfo.shoulduseupdatablemsg"), 0) == 1) {
        bool1 = true;
      }
      this.dvF = bool1;
      this.dvG = ((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfo.updatablemsgcontent"));
      this.dvH = ((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfo.updatablemsgcontentcolor"));
      this.dvI = ((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfo.subscribeentrycontent"));
      this.dvJ = ((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfo.subscribeentrybuttonwording"));
      this.dvK = ((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfo.subscribeconfirmedcontent"));
      this.dvM = bi.getInt((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfo.updatablemsgstate"), 1);
      this.dvL = bi.getInt((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfo.updatablemsgperiod"), 10);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/y/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */