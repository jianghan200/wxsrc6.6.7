package com.tencent.mm.modelsns;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.tencent.mm.a.g;
import com.tencent.mm.bp.a;
import com.tencent.mm.protocal.c.arj;
import com.tencent.mm.protocal.c.at;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.atg;
import com.tencent.mm.protocal.c.av;
import com.tencent.mm.protocal.c.bov;
import com.tencent.mm.protocal.c.brh;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.cdo;
import com.tencent.mm.protocal.c.cfn;
import com.tencent.mm.protocal.c.ct;
import com.tencent.mm.protocal.c.dc;
import com.tencent.mm.protocal.c.dd;
import com.tencent.mm.protocal.c.de;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.Map;

public final class e
{
  public static bsu RF()
  {
    bsu localbsu = new bsu();
    Object localObject = new qc();
    localbsu.sqb = new dc();
    localbsu.sqc = ((qc)localObject);
    localbsu.rVG = 0;
    localbsu.lOH = 0;
    localbsu.ksA = "";
    localObject = new arj();
    ((arj)localObject).rms = 0.0F;
    ((arj)localObject).rmr = 0.0F;
    localbsu.sqa = ((arj)localObject);
    localbsu.ogR = "";
    localbsu.sqi = new cdo();
    return localbsu;
  }
  
  public static ate RG()
  {
    ate localate = new ate();
    localate.jOS = "";
    localate.rVG = 0;
    return localate;
  }
  
  public static Pair<Integer, Integer> a(bsu parambsu, Context paramContext, boolean paramBoolean)
  {
    int j;
    int i;
    if ((parambsu != null) && (parambsu.sqc != null) && (parambsu.sqc.ruA != null) && (parambsu.sqc.ruA.size() > 0))
    {
      parambsu = (ate)parambsu.sqc.ruA.get(0);
      if ((parambsu != null) && (parambsu.rVH != null) && (parambsu.rVH.rWu > 0.0F) && (parambsu.rVH.rWv > 0.0F))
      {
        j = (int)parambsu.rVH.rWu;
        i = (int)parambsu.rVH.rWv;
      }
    }
    for (;;)
    {
      int m = j;
      if (j <= 0) {
        m = 320;
      }
      if (i <= 0) {}
      for (int n = 240;; n = i)
      {
        if (paramContext == null)
        {
          x.e("MicroMsg.TimeLineHelper", "the context is null");
          return Pair.create(Integer.valueOf(m), Integer.valueOf(n));
        }
        parambsu = paramContext.getResources().getDisplayMetrics();
        if (parambsu != null) {}
        for (i = (int)Math.min(parambsu.widthPixels * 0.63F, parambsu.heightPixels * 0.63F);; i = m)
        {
          i = i >> 5 << 5;
          int k = i;
          if (m < n)
          {
            k = i;
            if (paramContext != null) {
              k = Math.min(BackwardSupportUtil.b.b(paramContext, 160.0F), i);
            }
          }
          int i2 = (int)(k * 1.0D * n / m);
          i = i2;
          j = k;
          int i3;
          int i1;
          if (!paramBoolean)
          {
            i3 = a.fromDPToPix(paramContext, 200);
            i1 = a.fromDPToPix(paramContext, 44);
            if (i2 < k) {
              break label390;
            }
            i = i2;
            if (i2 > i3) {
              i = i3;
            }
            k = (int)(m * 1.0F / n * i);
            j = k;
            if (k < i1)
            {
              i = (int)(i1 * 1.0D * n / m);
              j = i1;
            }
          }
          for (;;)
          {
            x.i("MicroMsg.TimeLineHelper", "getTimelineVideoSize: width %d, height %d, expectWidth %d,expectHeight %d, isAd: %s", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(paramBoolean) });
            return Pair.create(Integer.valueOf(j), Integer.valueOf(i));
            label390:
            j = k;
            if (k > i3) {
              j = i3;
            }
            k = (int)(n * 1.0F / m * j);
            i = k;
            if (k < i1)
            {
              j = (int)(i1 * 1.0D * m / n);
              i = i1;
            }
          }
        }
      }
      i = 0;
      j = 0;
    }
  }
  
  public static ate a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, int paramInt4, String paramString4, atg paramatg)
  {
    ate localate = new ate();
    localate.ksA = nf(paramString1);
    localate.hcE = paramInt1;
    localate.jOS = nf(paramString4);
    localate.jPK = nf(paramString2);
    localate.rVD = paramInt2;
    localate.rVE = nf(paramString3);
    localate.rVF = paramInt3;
    localate.rVG = paramInt4;
    localate.rVH = paramatg;
    if (paramString2 == null) {}
    for (paramString1 = "".getBytes();; paramString1 = paramString2.getBytes())
    {
      localate.rVS = g.u(paramString1);
      return localate;
    }
  }
  
  public static ate a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, String paramString4)
  {
    ate localate = new ate();
    localate.ksA = paramString1;
    localate.hcE = paramInt1;
    localate.jPK = paramString2;
    localate.rVE = paramString3;
    localate.rVD = paramInt2;
    localate.rVF = paramInt3;
    localate.jOS = paramString4;
    paramString1 = new atg();
    paramString1.rWv = 0.0F;
    paramString1.rWu = 0.0F;
    paramString1.rWw = 0.0F;
    localate.rVH = paramString1;
    if (paramString2 == null) {}
    for (paramString1 = "".getBytes();; paramString1 = paramString2.getBytes())
    {
      localate.rVS = g.u(paramString1);
      return localate;
    }
  }
  
  private static float ne(String paramString)
  {
    if (paramString == null) {
      return 0.0F;
    }
    return bi.getFloat(paramString, 0.0F);
  }
  
  private static String nf(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  public static bsu ng(String paramString)
  {
    Map localMap = bl.z(paramString, "TimelineObject");
    bsu localbsu = RF();
    if (localMap != null)
    {
      localbsu.ksA = nf((String)localMap.get(".TimelineObject.id"));
      localbsu.hbL = nf((String)localMap.get(".TimelineObject.username"));
      localbsu.rVG = bi.getInt((String)localMap.get(".TimelineObject.private"), 0);
      localbsu.lOH = bi.getInt((String)localMap.get(".TimelineObject.createTime"), 0);
      localbsu.spZ = nf((String)localMap.get(".TimelineObject.contentDesc"));
      localbsu.sqe = bi.getInt((String)localMap.get(".TimelineObject.contentDescShowType"), 0);
      localbsu.sqf = bi.getInt((String)localMap.get(".TimelineObject.contentDescScene"), 0);
      localbsu.nNV = nf((String)localMap.get(".TimelineObject.statExtStr"));
      localbsu.sqj = bi.getInt((String)localMap.get(".TimelineObject.sightFolded"), 0);
      localbsu.csE = bi.getInt((String)localMap.get(".TimelineObject.showFlag"), 0);
      Object localObject1 = new arj();
      ((arj)localObject1).rmr = ne((String)localMap.get(".TimelineObject.location.$longitude"));
      ((arj)localObject1).rms = ne((String)localMap.get(".TimelineObject.location.$latitude"));
      ((arj)localObject1).eJJ = nf((String)localMap.get(".TimelineObject.location.$city"));
      ((arj)localObject1).rTI = bi.getInt((String)localMap.get(".TimelineObject.location.$poiScale"), 0);
      ((arj)localObject1).rTG = nf((String)localMap.get(".TimelineObject.location.$poiClassifyId"));
      ((arj)localObject1).nOB = bi.getInt((String)localMap.get(".TimelineObject.location.$poiClassifyType"), 0);
      ((arj)localObject1).nOz = nf((String)localMap.get(".TimelineObject.location.$poiAddress"));
      ((arj)localObject1).kFa = nf((String)localMap.get(".TimelineObject.location.$poiName"));
      ((arj)localObject1).rTJ = bi.getInt((String)localMap.get(".TimelineObject.location.$poiClickableStatus"), 0);
      ((arj)localObject1).rTL = nf((String)localMap.get(".TimelineObject.location.$poiAddressName"));
      ((arj)localObject1).country = nf((String)localMap.get(".TimelineObject.location.$country"));
      localbsu.sqa = ((arj)localObject1);
      if (localbsu.sqc == null) {
        localbsu.sqc = new qc();
      }
      localbsu.sqc.jOS = nf((String)localMap.get(".TimelineObject.ContentObject.description"));
      localbsu.sqc.ruz = bi.getInt((String)localMap.get(".TimelineObject.ContentObject.contentStyle"), 0);
      localbsu.sqc.ruB = bi.getInt((String)localMap.get(".TimelineObject.ContentObject.contentSubStyle"), 0);
      localbsu.sqc.bHD = nf((String)localMap.get(".TimelineObject.ContentObject.title"));
      localbsu.sqc.jPK = nf((String)localMap.get(".TimelineObject.ContentObject.contentUrl"));
      int i = 0;
      String str25;
      String str24;
      String str23;
      String str22;
      String str21;
      String str18;
      String str19;
      String str17;
      String str16;
      String str20;
      String str13;
      String str12;
      Object localObject4;
      String str15;
      String str14;
      String str11;
      String str10;
      String str9;
      String str8;
      String str7;
      String str6;
      String str5;
      String str4;
      String str3;
      String str2;
      Object localObject3;
      Object localObject2;
      String str1;
      label1334:
      String str26;
      Object localObject5;
      if (i != 0)
      {
        str25 = ".TimelineObject.ContentObject.mediaList.media" + i + ".id";
        str24 = ".TimelineObject.ContentObject.mediaList.media" + i + ".type";
        str23 = ".TimelineObject.ContentObject.mediaList.media" + i + ".title";
        str22 = ".TimelineObject.ContentObject.mediaList.media" + i + ".description";
        str21 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url";
        str18 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$videomd5";
        str19 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb";
        str17 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$type";
        str16 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb.$type";
        str20 = ".TimelineObject.ContentObject.mediaList.media" + i + ".private";
        str13 = ".TimelineObject.ContentObject.mediaList.media" + i + ".subType";
        str12 = ".TimelineObject.ContentObject.mediaList.media" + i + ".userData";
        localObject4 = ".TimelineObject.ContentObject.mediaList.media" + i;
        str15 = ".TimelineObject.ContentObject.mediaList.media" + i + ".lowBandUrl";
        str14 = ".TimelineObject.ContentObject.mediaList.media" + i + ".lowBandUrl.$type";
        str11 = ".TimelineObject.ContentObject.mediaList.media" + i + ".attachUrl";
        str10 = ".TimelineObject.ContentObject.mediaList.media" + i + ".attachUrl.$md5";
        str9 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$md5";
        str8 = ".TimelineObject.ContentObject.mediaList.media" + i + ".videosize.$attachTotalTime";
        str7 = ".TimelineObject.ContentObject.mediaList.media" + i + ".attachThumbUrl";
        str6 = ".TimelineObject.ContentObject.mediaList.media" + i + ".attachShareTitle";
        str5 = ".TimelineObject.ContentObject.mediaList.media" + i + ".enc";
        str4 = ".TimelineObject.ContentObject.mediaList.media" + i + ".enc.$key";
        str3 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$token";
        str2 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$enc_idx";
        localObject3 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$key";
        localObject2 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb.$token";
        str1 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb.$enc_idx";
        localObject1 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb.$key";
        str26 = (String)localObject4 + ".size.$width";
        localObject5 = (String)localObject4 + ".size.$height";
        localObject4 = (String)localObject4 + ".size.$totalSize";
        str26 = (String)localMap.get(str26);
        localObject5 = (String)localMap.get(localObject5);
        String str27 = (String)localMap.get(localObject4);
        localObject4 = new atg();
        ((atg)localObject4).rWv = 0.0F;
        ((atg)localObject4).rWu = 0.0F;
        ((atg)localObject4).rWw = 0.0F;
        if (str26 != null) {
          ((atg)localObject4).rWu = ne(str26);
        }
        if (localObject5 != null) {
          ((atg)localObject4).rWv = ne((String)localObject5);
        }
        if (str27 != null) {
          ((atg)localObject4).rWw = ne(str27);
        }
        str25 = (String)localMap.get(str25);
        str24 = (String)localMap.get(str24);
        str23 = (String)localMap.get(str23);
        str22 = (String)localMap.get(str22);
        str21 = (String)localMap.get(str21);
        str20 = (String)localMap.get(str20);
        str19 = (String)localMap.get(str19);
        str18 = (String)localMap.get(str18);
        str17 = (String)localMap.get(str17);
        str16 = (String)localMap.get(str16);
        str15 = (String)localMap.get(str15);
        str14 = (String)localMap.get(str14);
        str13 = (String)localMap.get(str13);
        str12 = (String)localMap.get(str12);
        str11 = (String)localMap.get(str11);
        str10 = (String)localMap.get(str10);
        str9 = (String)localMap.get(str9);
        str8 = (String)localMap.get(str8);
        str7 = (String)localMap.get(str7);
        str6 = (String)localMap.get(str6);
        str5 = (String)localMap.get(str5);
        str4 = (String)localMap.get(str4);
        str3 = (String)localMap.get(str3);
        str2 = (String)localMap.get(str2);
        localObject3 = (String)localMap.get(localObject3);
        localObject2 = (String)localMap.get(localObject2);
        str1 = (String)localMap.get(str1);
        str26 = (String)localMap.get(localObject1);
        if ((str24 == null) || (str25 == null)) {
          break label2416;
        }
        localObject5 = new ate();
        ((ate)localObject5).ksA = nf(str25);
        ((ate)localObject5).hcE = bi.getInt(str24, 0);
        ((ate)localObject5).bHD = nf(str23);
        ((ate)localObject5).jOS = nf(str22);
        ((ate)localObject5).jPK = nf(str21);
        ((ate)localObject5).rVD = bi.getInt(str17, 0);
        ((ate)localObject5).rVE = nf(str19);
        ((ate)localObject5).rVF = bi.getInt(str16, 0);
        ((ate)localObject5).rVG = bi.getInt(str20, 0);
        ((ate)localObject5).rVH = ((atg)localObject4);
        ((ate)localObject5).rVI = nf(str15);
        ((ate)localObject5).rVJ = bi.getInt(str14, 0);
        ((ate)localObject5).nME = nf(str12);
        ((ate)localObject5).bID = bi.getInt(str13, 0);
        ((ate)localObject5).rVL = nf(str11);
        ((ate)localObject5).rVN = nf(str10);
        ((ate)localObject5).rVM = nf(str9);
        ((ate)localObject5).rVZ = nf(str18);
        ((ate)localObject5).oig = bi.getInt(str8, 0);
        ((ate)localObject5).rVO = nf(str7);
        ((ate)localObject5).rVP = nf(str6);
        ((ate)localObject5).rVQ = bi.getInt(str5, 0);
        ((ate)localObject5).rVR = bi.getLong(str4, 0L);
        if (((ate)localObject5).jPK != null) {
          break label2404;
        }
      }
      label2404:
      for (localObject1 = "".getBytes();; localObject1 = ((ate)localObject5).jPK.getBytes())
      {
        ((ate)localObject5).rVS = g.u((byte[])localObject1);
        ((ate)localObject5).rVT = str3;
        ((ate)localObject5).rVU = bi.getInt(str2, 0);
        ((ate)localObject5).rVV = ((String)localObject3);
        ((ate)localObject5).rVW = ((String)localObject2);
        ((ate)localObject5).rVX = bi.getInt(str1, 0);
        ((ate)localObject5).rVY = str26;
        localbsu.sqc.ruA.add(localObject5);
        i += 1;
        break;
        str25 = ".TimelineObject.ContentObject.mediaList.media.id";
        str24 = ".TimelineObject.ContentObject.mediaList.media.type";
        str23 = ".TimelineObject.ContentObject.mediaList.media.title";
        str22 = ".TimelineObject.ContentObject.mediaList.media.description";
        str21 = ".TimelineObject.ContentObject.mediaList.media.url";
        str18 = ".TimelineObject.ContentObject.mediaList.media.url.$videomd5";
        str19 = ".TimelineObject.ContentObject.mediaList.media.thumb";
        str17 = ".TimelineObject.ContentObject.mediaList.media.url.$type";
        str16 = ".TimelineObject.ContentObject.mediaList.media.thumb.$type";
        str20 = ".TimelineObject.ContentObject.mediaList.media.private";
        str13 = ".TimelineObject.ContentObject.mediaList.media.subType";
        str12 = ".TimelineObject.ContentObject.mediaList.media.userData";
        localObject4 = ".TimelineObject.ContentObject.mediaList.media";
        str15 = ".TimelineObject.ContentObject.mediaList.media.lowBandUrl";
        str14 = ".TimelineObject.ContentObject.mediaList.media.lowBandUrl.$type";
        localObject1 = ".TimelineObject.ContentObject.mediaList.media.thumb.$key";
        str1 = ".TimelineObject.ContentObject.mediaList.media.thumb.$enc_idx";
        localObject2 = ".TimelineObject.ContentObject.mediaList.media.thumb.$token";
        localObject3 = ".TimelineObject.ContentObject.mediaList.media.url.$key";
        str2 = ".TimelineObject.ContentObject.mediaList.media.url.$enc_idx";
        str3 = ".TimelineObject.ContentObject.mediaList.media.url.$token";
        str4 = ".TimelineObject.ContentObject.mediaList.media.enc.$key";
        str5 = ".TimelineObject.ContentObject.mediaList.media.enc";
        str6 = ".TimelineObject.ContentObject.mediaList.media.attachShareTitle";
        str7 = ".TimelineObject.ContentObject.mediaList.media.attachThumbUrl";
        str8 = ".TimelineObject.ContentObject.mediaList.media.videosize.$attachTotalTime";
        str9 = ".TimelineObject.ContentObject.mediaList.media.url.$md5";
        str10 = ".TimelineObject.ContentObject.mediaList.media.attachUrl.$md5";
        str11 = ".TimelineObject.ContentObject.mediaList.media.attachUrl";
        break label1334;
      }
      label2416:
      i = paramString.indexOf("<noteinfo>");
      int j = paramString.indexOf("</noteinfo>");
      if ((i < 0) || (j < 0)) {}
      for (;;)
      {
        paramString = new dc();
        localObject1 = nf((String)localMap.get(".TimelineObject.appInfo.id"));
        str1 = nf((String)localMap.get(".TimelineObject.appInfo.version"));
        localObject2 = nf((String)localMap.get(".TimelineObject.appInfo.appName"));
        localObject3 = nf((String)localMap.get(".TimelineObject.appInfo.installUrl "));
        str2 = nf((String)localMap.get(".TimelineObject.appInfo.fromUrl "));
        paramString.ksA = ((String)localObject1);
        paramString.jSv = ((String)localObject2);
        paramString.rdf = ((String)localObject3);
        paramString.rdg = str2;
        paramString.hcr = str1;
        paramString.rdh = bi.getInt((String)localMap.get(".TimelineObject.appInfo.clickable"), 0);
        localbsu.sqb = paramString;
        paramString = new cdo();
        localObject1 = nf((String)localMap.get(".TimelineObject.weappInfo.appUserName"));
        str1 = nf((String)localMap.get(".TimelineObject.weappInfo.pagePath"));
        paramString.username = ((String)localObject1);
        paramString.path = str1;
        localbsu.sqi = paramString;
        paramString = new brh();
        localObject1 = nf((String)localMap.get(".TimelineObject.streamvideo.streamvideotitle"));
        str1 = nf((String)localMap.get(".TimelineObject.streamvideo.streamvideototaltime"));
        localObject2 = nf((String)localMap.get(".TimelineObject.streamvideo.streamvideourl"));
        localObject3 = nf((String)localMap.get(".TimelineObject.streamvideo.streamvideoweburl"));
        str2 = nf((String)localMap.get(".TimelineObject.streamvideo.streamvideowording"));
        str3 = nf((String)localMap.get(".TimelineObject.streamvideo.streamvideothumburl"));
        str4 = nf((String)localMap.get(".TimelineObject.streamvideo.streamvideoaduxinfo"));
        str5 = nf((String)localMap.get(".TimelineObject.streamvideo.streamvideopublishid"));
        paramString.dyL = ((String)localObject1);
        paramString.dyK = bi.WU(str1);
        paramString.dyJ = ((String)localObject2);
        paramString.dyN = ((String)localObject3);
        paramString.dyM = str2;
        paramString.dyO = str3;
        paramString.dyP = str4;
        paramString.dyQ = str5;
        localbsu.sqh = paramString;
        paramString = new bov();
        localObject1 = nf((String)localMap.get(".TimelineObject.redEnvelopesInfo.sendId"));
        str1 = nf((String)localMap.get(".TimelineObject.redEnvelopesInfo.ticket"));
        paramString.kLZ = ((String)localObject1);
        paramString.bLe = str1;
        paramString = new av();
        i = bi.getInt((String)localMap.get(".TimelineObject.actionInfo.scene"), 0);
        localObject1 = nf((String)localMap.get(".TimelineObject.actionInfo.appid"));
        j = bi.getInt((String)localMap.get(".TimelineObject.actionInfo.type"), 0);
        str1 = nf((String)localMap.get(".TimelineObject.actionInfo.url"));
        localObject2 = nf((String)localMap.get(".TimelineObject.actionInfo.mediaTagName"));
        localObject3 = nf((String)localMap.get(".TimelineObject.actionInfo.wordingKey"));
        paramString.raP = ((String)localObject1);
        paramString.otY = i;
        paramString.hcE = j;
        paramString.jPK = str1;
        paramString.raQ = ((String)localObject2);
        paramString.raR = ((String)localObject3);
        localObject1 = new at();
        str1 = nf((String)localMap.get(".TimelineObject.actionInfo.appMsg.appid"));
        localObject2 = nf((String)localMap.get(".TimelineObject.actionInfo.appMsg.mediaTagName"));
        localObject3 = nf((String)localMap.get(".TimelineObject.actionInfo.appMsg.messageExt"));
        str2 = nf((String)localMap.get(".TimelineObject.actionInfo.appMsg.messageAction"));
        ((at)localObject1).jQb = str1;
        ((at)localObject1).raM = ((String)localObject2);
        ((at)localObject1).raN = ((String)localObject3);
        ((at)localObject1).raO = str2;
        paramString.raS = ((at)localObject1);
        i = bi.getInt((String)localMap.get(".TimelineObject.actionInfo.appActionScene.installedActionScene"), 0);
        j = bi.getInt((String)localMap.get(".TimelineObject.actionInfo.appActionScene.uninstalledActionScene"), 0);
        localObject1 = nf((String)localMap.get(".TimelineObject.actionInfo.appJumpWordingKey.installedWordingKey"));
        str1 = nf((String)localMap.get(".TimelineObject.actionInfo.appJumpWordingKey.uninstalledWordingKey"));
        paramString.raT = nf((String)localMap.get(".TimelineObject.actionInfo.newWordingKey"));
        localObject2 = new ct();
        ((ct)localObject2).rcR = i;
        ((ct)localObject2).rcS = j;
        localObject3 = new de();
        ((de)localObject3).rdl = ((String)localObject1);
        ((de)localObject3).rdm = str1;
        paramString.raU = ((ct)localObject2);
        paramString.raV = ((de)localObject3);
        paramString.raW = nh((String)localMap.get(".TimelineObject.actionInfo.installedWording"));
        paramString.raX = nh((String)localMap.get(".TimelineObject.actionInfo.uninstalledWording"));
        localbsu.nsB = paramString;
        localbsu.qIb = nf((String)localMap.get(".TimelineObject.sourceUserName"));
        localbsu.qIc = nf((String)localMap.get(".TimelineObject.sourceNickName"));
        localbsu.sqd = nf((String)localMap.get(".TimelineObject.publicUserName"));
        localbsu.sqg = nf((String)localMap.get(".TimelineObject.statisticsData"));
        localbsu.ogR = nf((String)localMap.get(".TimelineObject.canvasInfoXml"));
        localbsu.dwt = bi.getInt((String)localMap.get(".TimelineObject.contentattr"), 0);
        paramString = new cfn();
        paramString.pLr = nf((String)localMap.get(".TimelineObject.websearch.relevant_vid"));
        paramString.pLs = nf((String)localMap.get(".TimelineObject.websearch.relevant_expand"));
        paramString.pLt = nf((String)localMap.get(".TimelineObject.websearch.relevant_pre_searchid"));
        paramString.pLu = nf((String)localMap.get(".TimelineObject.websearch.relevant_shared_openid"));
        paramString.pLv = bi.getLong((String)localMap.get(".TimelineObject.websearch.rec_category"), 0L);
        paramString.ixy = nf((String)localMap.get(".TimelineObject.websearch.shareUrl"));
        paramString.ixz = nf((String)localMap.get(".TimelineObject.websearch.shareTitle"));
        paramString.nzH = nf((String)localMap.get(".TimelineObject.websearch.shareDesc"));
        paramString.pLw = nf((String)localMap.get(".TimelineObject.websearch.shareImgUrl"));
        paramString.pLx = nf((String)localMap.get(".TimelineObject.websearch.shareString"));
        paramString.pLy = nf((String)localMap.get(".TimelineObject.websearch.shareStringUrl"));
        paramString.bhd = nf((String)localMap.get(".TimelineObject.websearch.source"));
        paramString.lRt = nf((String)localMap.get(".TimelineObject.websearch.sourceUrl"));
        paramString.pLz = nf((String)localMap.get(".TimelineObject.websearch.strPlayCount"));
        paramString.pLA = nf((String)localMap.get(".TimelineObject.websearch.titleUrl"));
        paramString.pLB = nf((String)localMap.get(".TimelineObject.websearch.extReqParams"));
        paramString.pLC = nf((String)localMap.get(".TimelineObject.websearch.tagList"));
        localbsu.nsD = paramString;
        return localbsu;
        localbsu.sqc.ruC = paramString.substring(i, j + 11);
      }
    }
    return localbsu;
  }
  
  private static dd nh(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    Object localObject = new StringBuilder(paramString.length());
    int i = 0;
    int j = paramString.length();
    while (i < j)
    {
      char c = paramString.charAt(i);
      if (c != '&')
      {
        ((StringBuilder)localObject).append(c);
        i += 1;
      }
      else if (paramString.startsWith("&amp;", i))
      {
        ((StringBuilder)localObject).append('&');
        i += 5;
      }
      else if (paramString.startsWith("&apos;", i))
      {
        ((StringBuilder)localObject).append('\'');
        i += 6;
      }
      else if (paramString.startsWith("&quot;", i))
      {
        ((StringBuilder)localObject).append('"');
        i += 6;
      }
      else if (paramString.startsWith("&lt;", i))
      {
        ((StringBuilder)localObject).append('<');
        i += 4;
      }
      else if (paramString.startsWith("&gt;", i))
      {
        ((StringBuilder)localObject).append('>');
        i += 4;
      }
    }
    paramString = ((StringBuilder)localObject).toString();
    paramString = bl.z("<root>" + paramString + "</root>", "root");
    localObject = new dd();
    ((dd)localObject).rdi = nf((String)paramString.get(".root.en"));
    ((dd)localObject).rdj = nf((String)paramString.get(".root.zh-CN"));
    ((dd)localObject).rdk = nf((String)paramString.get(".root.zh-TW"));
    return (dd)localObject;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelsns/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */