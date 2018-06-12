package com.tencent.mm.plugin.sns.g;

import android.util.Base64;
import com.tencent.mm.protocal.c.arj;
import com.tencent.mm.protocal.c.at;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.atg;
import com.tencent.mm.protocal.c.av;
import com.tencent.mm.protocal.c.bqu;
import com.tencent.mm.protocal.c.bqw;
import com.tencent.mm.protocal.c.brh;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.cdo;
import com.tencent.mm.protocal.c.cfn;
import com.tencent.mm.protocal.c.dc;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class j
{
  public static String gVK = "]]>";
  public static String gVL = "<TimelineObject>";
  public static String gVM = "</TimelineObject>";
  
  private static String MQ(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  private static String MR(String paramString)
  {
    if (bi.oW(paramString)) {
      paramString = "";
    }
    for (;;)
    {
      return paramString;
      if (paramString.matches("\\d*")) {}
      for (int i = 1; i == 0; i = 0) {
        return "";
      }
    }
  }
  
  public static String b(bsu parambsu)
  {
    a locala = new a();
    Object localObject1 = new HashMap();
    locala.wA("TimelineObject");
    locala.wA("id");
    Object localObject2;
    label1936:
    Object localObject3;
    if ((parambsu.ksA == null) || (parambsu.ksA.equals("")))
    {
      locala.setText("0");
      locala.wB("id");
      if (parambsu.hbL != null)
      {
        locala.wA("username");
        locala.setText(parambsu.hbL);
        locala.wB("username");
      }
      locala.wA("createTime");
      locala.setText(parambsu.lOH);
      locala.wB("createTime");
      locala.wA("contentDescShowType");
      locala.wI(parambsu.sqe);
      locala.wB("contentDescShowType");
      locala.wA("contentDescScene");
      locala.wI(parambsu.sqf);
      locala.wB("contentDescScene");
      locala.wA("private");
      locala.setText(parambsu.rVG);
      locala.wB("private");
      if ((parambsu.sqb != null) && (!bi.oW(parambsu.sqb.ksA)))
      {
        locala.wA("appInfo");
        locala.wA("id");
        locala.setText(MQ(parambsu.sqb.ksA));
        locala.wB("id");
        locala.wA("version");
        locala.setText(MQ(parambsu.sqb.hcr));
        locala.wB("version");
        locala.wA("appName");
        locala.setText(MQ(parambsu.sqb.jSv));
        locala.wB("appName");
        locala.wA("installUrl");
        locala.setText(MQ(parambsu.sqb.rdf));
        locala.wB("installUrl");
        locala.wA("fromUrl");
        locala.setText(MQ(parambsu.sqb.rdg));
        locala.wB("fromUrl");
        locala.wB("appInfo");
      }
      if ((parambsu.sqh != null) && (!bi.oW(parambsu.sqh.dyJ)))
      {
        locala.wA("streamvideo");
        locala.wA("streamvideourl");
        locala.setText(MQ(parambsu.sqh.dyJ));
        locala.wB("streamvideourl");
        locala.wA("streamvideototaltime");
        locala.wI(parambsu.sqh.dyK);
        locala.wB("streamvideototaltime");
        locala.wA("streamvideotitle");
        locala.setText(MQ(parambsu.sqh.dyL));
        locala.wB("streamvideotitle");
        locala.wA("streamvideowording");
        locala.setText(MQ(parambsu.sqh.dyM));
        locala.wB("streamvideowording");
        locala.wA("streamvideoweburl");
        locala.setText(MQ(parambsu.sqh.dyN));
        locala.wB("streamvideoweburl");
        locala.wA("streamvideothumburl");
        locala.setText(MQ(parambsu.sqh.dyO));
        locala.wB("streamvideothumburl");
        locala.wA("streamvideoaduxinfo");
        locala.setText(MQ(parambsu.sqh.dyP));
        locala.wB("streamvideoaduxinfo");
        locala.wA("streamvideopublishid");
        locala.setText(MQ(parambsu.sqh.dyQ));
        locala.wB("streamvideopublishid");
        locala.wB("streamvideo");
      }
      if ((parambsu.nsD != null) && (!bi.oW(parambsu.nsD.pLr)))
      {
        locala.wA("websearch");
        locala.wA("relevant_vid");
        locala.setText(MQ(parambsu.nsD.pLr));
        locala.wB("relevant_vid");
        locala.wA("relevant_expand");
        locala.setText(MQ(parambsu.nsD.pLs));
        locala.wB("relevant_expand");
        locala.wA("relevant_pre_searchid");
        locala.setText(MQ(parambsu.nsD.pLt));
        locala.wB("relevant_pre_searchid");
        locala.wA("relevant_shared_openid");
        locala.setText(MQ(parambsu.nsD.pLu));
        locala.wB("relevant_shared_openid");
        locala.wA("rec_category");
        locala.setText(MQ(parambsu.nsD.pLv));
        locala.wB("rec_category");
        locala.wA("shareUrl");
        locala.setText(MQ(parambsu.nsD.ixy));
        locala.wB("shareUrl");
        locala.wA("shareTitle");
        locala.setText(MQ(parambsu.nsD.ixz));
        locala.wB("shareTitle");
        locala.wA("shareDesc");
        locala.setText(MQ(parambsu.nsD.nzH));
        locala.wB("shareDesc");
        locala.wA("shareImgUrl");
        locala.setText(MQ(parambsu.nsD.pLw));
        locala.wB("shareImgUrl");
        locala.wA("shareString");
        locala.setText(MQ(parambsu.nsD.pLx));
        locala.wB("shareString");
        locala.wA("shareStringUrl");
        locala.setText(MQ(parambsu.nsD.pLy));
        locala.wB("shareStringUrl");
        locala.wA("source");
        locala.setText(MQ(parambsu.nsD.bhd));
        locala.wB("source");
        locala.wA("strPlayCount");
        locala.setText(MQ(parambsu.nsD.pLz));
        locala.wB("strPlayCount");
        locala.wA("titleUrl");
        locala.setText(MQ(parambsu.nsD.pLA));
        locala.wB("titleUrl");
        locala.wA("tagList");
        locala.setText(MQ(parambsu.nsD.pLC));
        locala.wB("tagList");
        locala.wB("websearch");
      }
      locala.wA("contentDesc");
      locala.setText(MQ(parambsu.spZ));
      locala.wB("contentDesc");
      locala.wA("contentattr");
      locala.setText(parambsu.dwt);
      locala.wB("contentattr");
      locala.wA("sourceUserName");
      locala.setText(MQ(parambsu.qIb));
      locala.wB("sourceUserName");
      locala.wA("sourceNickName");
      locala.setText(MQ(parambsu.qIc));
      locala.wB("sourceNickName");
      locala.wA("statisticsData");
      locala.setText(MQ(parambsu.sqg));
      locala.wB("statisticsData");
      locala.wA("weappInfo");
      locala.wA("appUserName");
      locala.setText(MQ(parambsu.sqi.username));
      locala.wB("appUserName");
      locala.wA("pagePath");
      locala.setText(MQ(parambsu.sqi.path));
      locala.wB("pagePath");
      locala.wB("weappInfo");
      locala.wA("canvasInfoXml");
      locala.setText(MQ(parambsu.ogR));
      locala.wB("canvasInfoXml");
      if (parambsu.sqa != null)
      {
        float f1 = parambsu.sqa.rmr;
        float f2 = parambsu.sqa.rms;
        if ((f1 != -1000.0F) && (f2 != -1000.0F))
        {
          ((Map)localObject1).clear();
          ((Map)localObject1).put("longitude", parambsu.sqa.rmr);
          ((Map)localObject1).put("latitude", parambsu.sqa.rms);
          ((Map)localObject1).put("city", bi.WS(MQ(parambsu.sqa.eJJ)));
          ((Map)localObject1).put("poiName", bi.WS(MQ(parambsu.sqa.kFa)));
          ((Map)localObject1).put("poiAddress", bi.WS(MQ(parambsu.sqa.nOz)));
          ((Map)localObject1).put("poiScale", parambsu.sqa.rTI);
          ((Map)localObject1).put("poiClassifyId", MQ(parambsu.sqa.rTG));
          ((Map)localObject1).put("poiClassifyType", parambsu.sqa.nOB);
          ((Map)localObject1).put("poiClickableStatus", parambsu.sqa.rTJ);
          locala.i("location", (Map)localObject1);
          locala.wB("location");
        }
      }
      locala.wA("ContentObject");
      locala.wA("contentStyle");
      locala.setText(parambsu.sqc.ruz);
      locala.wB("contentStyle");
      locala.wA("contentSubStyle");
      locala.setText(parambsu.sqc.ruB);
      locala.wB("contentSubStyle");
      locala.wA("title");
      locala.setText(MQ(parambsu.sqc.bHD));
      locala.wB("title");
      locala.wA("description");
      locala.setText(MQ(parambsu.sqc.jOS));
      locala.wB("description");
      locala.wA("contentUrl");
      locala.setText(MQ(parambsu.sqc.jPK));
      locala.wB("contentUrl");
      if (parambsu.sqc.ruA.size() <= 0) {
        break label2769;
      }
      locala.wA("mediaList");
      localObject2 = parambsu.sqc.ruA.iterator();
      if (!((Iterator)localObject2).hasNext()) {
        break label2761;
      }
      localObject3 = (ate)((Iterator)localObject2).next();
      locala.wA("media");
      locala.wA("id");
      if (!MR(((ate)localObject3).ksA).equals("")) {
        break label2745;
      }
      locala.setText("0");
    }
    for (;;)
    {
      locala.wB("id");
      locala.wA("type");
      locala.setText(((ate)localObject3).hcE);
      locala.wB("type");
      locala.wA("title");
      locala.setText(MQ(((ate)localObject3).bHD));
      locala.wB("title");
      locala.wA("description");
      locala.setText(MQ(((ate)localObject3).jOS));
      locala.wB("description");
      locala.wA("private");
      locala.setText(((ate)localObject3).rVG);
      locala.wB("private");
      ((Map)localObject1).clear();
      ((Map)localObject1).put("type", ((ate)localObject3).rVD);
      if (!bi.oW(((ate)localObject3).bKg)) {
        ((Map)localObject1).put("md5", ((ate)localObject3).bKg);
      }
      if (!bi.oW(((ate)localObject3).rVZ)) {
        ((Map)localObject1).put("videomd5", ((ate)localObject3).rVZ);
      }
      locala.i("url", (Map)localObject1);
      locala.setText(MQ(((ate)localObject3).jPK));
      locala.wB("url");
      if ((((ate)localObject3).rVE != null) && (!((ate)localObject3).rVE.equals("")))
      {
        ((Map)localObject1).clear();
        ((Map)localObject1).put("type", ((ate)localObject3).rVF);
        locala.i("thumb", (Map)localObject1);
        locala.setText(MQ(((ate)localObject3).rVE));
        locala.wB("thumb");
      }
      if (((ate)localObject3).bID > 0)
      {
        locala.wA("subType");
        locala.setText(((ate)localObject3).bID);
        locala.wB("subType");
      }
      if (!bi.oW(((ate)localObject3).nME))
      {
        locala.wA("userData");
        locala.setText(((ate)localObject3).nME);
        locala.wB("userData");
      }
      if ((((ate)localObject3).rVI != null) && (!((ate)localObject3).rVI.equals("")))
      {
        ((Map)localObject1).clear();
        ((Map)localObject1).put("type", ((ate)localObject3).rVJ);
        locala.i("lowBandUrl", (Map)localObject1);
        locala.setText(MQ(((ate)localObject3).rVI));
        locala.wB("lowBandUrl");
      }
      if (((ate)localObject3).rVH != null)
      {
        ((Map)localObject1).clear();
        if (((ate)localObject3).rVH.rWu > 0.0F) {
          ((Map)localObject1).put("width", ((ate)localObject3).rVH.rWu);
        }
        if (((ate)localObject3).rVH.rWv > 0.0F) {
          ((Map)localObject1).put("height", ((ate)localObject3).rVH.rWv);
        }
        if (((ate)localObject3).rVH.rWw > 0.0F) {
          ((Map)localObject1).put("totalSize", ((ate)localObject3).rVH.rWw);
        }
        locala.i("size", (Map)localObject1);
        locala.wB("size");
      }
      locala.wB("media");
      break label1936;
      locala.setText(parambsu.ksA);
      break;
      label2745:
      locala.setText(MR(((ate)localObject3).ksA));
    }
    label2761:
    locala.wB("mediaList");
    label2769:
    locala.gVP.append(MQ(parambsu.sqc.ruC));
    locala.wB("ContentObject");
    if (parambsu.nsB != null)
    {
      locala.wA("actionInfo");
      if (parambsu.nsB.raS != null)
      {
        locala.wA("appMsg");
        locala.wA("mediaTagName");
        locala.setText(parambsu.nsB.raS.raM);
        locala.wB("mediaTagName");
        locala.wA("messageExt");
        locala.setText(parambsu.nsB.raS.raN);
        locala.wB("messageExt");
        locala.wA("messageAction");
        locala.setText(parambsu.nsB.raS.raO);
        locala.wB("messageAction");
        locala.wB("appMsg");
      }
      locala.wB("actionInfo");
    }
    if ((parambsu.sqb != null) && (!bi.oW(parambsu.sqb.ksA)))
    {
      localObject1 = parambsu.nNV;
      localObject2 = new bqw();
      if (localObject1 != null) {
        localObject3 = Base64.decode((String)localObject1, 0);
      }
    }
    try
    {
      ((bqw)localObject2).aG((byte[])localObject3);
      ((bqw)localObject2).soY = new bqu();
      ((bqw)localObject2).soY.jLY = parambsu.sqb.ksA;
      try
      {
        localObject2 = Base64.encodeToString(((bqw)localObject2).toByteArray(), 0);
        localObject1 = localObject2;
        localObject2 = ((String)localObject2).replace("\n", "");
        localObject1 = localObject2;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.TimelineConvert", localIOException, "", new Object[0]);
        }
      }
      parambsu.nNV = ((String)localObject1);
      if (parambsu.nNV != null)
      {
        locala.wA("statExtStr");
        locala.setText(parambsu.nNV);
        locala.wB("statExtStr");
      }
      locala.wB("TimelineObject");
      localObject1 = locala.gVP.toString();
      x.d("MicroMsg.TimelineConvert", "xmlContent: " + (String)localObject1);
      parambsu = (bsu)localObject1;
      if (bl.z((String)localObject1, "TimelineObject") == null)
      {
        x.e("MicroMsg.TimelineConvert", "xml is error");
        parambsu = "";
      }
      return parambsu;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  static final class a
  {
    StringBuffer gVP = new StringBuffer();
    
    public final void i(String paramString, Map<String, String> paramMap)
    {
      this.gVP.append("<" + paramString);
      paramString = paramMap.keySet().iterator();
      while (paramString.hasNext())
      {
        String str1 = (String)paramString.next();
        String str2 = (String)paramMap.get(str1);
        this.gVP.append(" " + str1 + "=\"" + str2 + "\" ");
      }
      this.gVP.append(">");
      paramMap.clear();
    }
    
    public final void setText(String paramString)
    {
      if (bi.oW(paramString)) {
        return;
      }
      if (paramString.contains(j.gVK))
      {
        this.gVP.append("<![CDATA[" + bi.WS(paramString) + "]]>");
        return;
      }
      this.gVP.append("<![CDATA[" + paramString + "]]>");
    }
    
    public final void wA(String paramString)
    {
      this.gVP.append("<" + paramString + ">");
    }
    
    public final void wB(String paramString)
    {
      this.gVP.append("</" + paramString + ">");
    }
    
    public final void wI(int paramInt)
    {
      this.gVP.append(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/g/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */