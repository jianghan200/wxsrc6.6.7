package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import android.util.Base64;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.modelstat.p;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.bfl;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.boc;
import com.tencent.mm.protocal.c.bof;
import com.tencent.mm.protocal.c.boh;
import com.tencent.mm.protocal.c.boi;
import com.tencent.mm.protocal.c.bon;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.bpm;
import com.tencent.mm.protocal.c.bqw;
import com.tencent.mm.protocal.c.bqx;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.cg;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.protocal.c.z;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
{
  private static final String nmw = g.Ei().cachePath + "sns_recvd_ad";
  private static LinkedHashMap<Long, Integer> nmx;
  private static Comparator<bon> nmy = new a.1();
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    g.Ek();
  }
  
  public static void LU(String paramString)
  {
    if (bi.oW(paramString)) {
      return;
    }
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.bAB().e("adId", paramString, "adxml", 1);
  }
  
  private static int a(boy paramboy)
  {
    n localn = af.byo().fi(paramboy.rlK);
    if (localn == null) {
      return paramboy.lOH;
    }
    return localn.field_createTime;
  }
  
  private static cg a(bfl parambfl)
  {
    cg localcg;
    if (parambfl != null)
    {
      localcg = new cg();
      localcg.rcC = parambfl.sgL;
      if (localcg.rcC == null) {
        x.i("MicroMsg.AdSnsInfoStorageLogic", "recObject.RecommendInfo is null");
      }
    }
    else
    {
      return null;
    }
    localcg.rcB = b(parambfl.sgK);
    return localcg;
  }
  
  private static String a(String paramString, bhy parambhy)
  {
    if ((parambhy == null) || (paramString == null))
    {
      x.i("MicroMsg.AdSnsInfoStorageLogic", "update with empty dynamic data");
      return paramString;
    }
    try
    {
      localObject1 = new z();
      ((z)localObject1).aG(parambhy.siK.lR);
      if (((z)localObject1).qYY == null) {
        break label336;
      }
      localObject2 = "";
      localIterator = ((z)localObject1).qYY.iterator();
      parambhy = paramString;
    }
    catch (Exception parambhy)
    {
      for (;;)
      {
        Iterator localIterator;
        Object localObject1 = paramString;
        continue;
        localObject1 = localObject2;
        break label341;
        Object localObject2 = paramString;
        continue;
        localObject2 = localObject1;
      }
    }
    localObject1 = parambhy;
    try
    {
      if (localIterator.hasNext())
      {
        localObject1 = parambhy;
        bof localbof = (bof)localIterator.next();
        localObject1 = parambhy;
        if (localbof.aAL == null) {
          break label331;
        }
        localObject1 = parambhy;
        String str = String.format("<(([a-zA-Z0-9\\-_]+)([^>]+)dynamicKey=[\"']%s[\"']([^>]*))", new Object[] { localbof.aAL });
        localObject1 = parambhy;
        Object localObject3 = Pattern.compile(str).matcher(parambhy);
        localObject1 = parambhy;
        if (!((Matcher)localObject3).find()) {
          break label331;
        }
        localObject1 = parambhy;
        localObject3 = ((Matcher)localObject3).group(2);
        if (localObject3 == null) {
          break label331;
        }
        localObject1 = parambhy;
        if (((String)localObject3).length() <= 0) {
          break label331;
        }
        localObject1 = parambhy;
        parambhy = parambhy.replaceAll(str + String.format("((>[\\s\\S]*</%s>)|(/([^>]*)>))", new Object[] { localObject3 }), String.format("<$1>%s</%s>", new Object[] { localbof.value, localObject3 }));
        localObject1 = parambhy;
        localObject2 = (String)localObject2 + localbof.aAL + ":" + localbof.value + ";";
        localObject1 = localObject2;
        break label341;
      }
      localObject1 = parambhy;
      x.i("MicroMsg.AdSnsInfoStorageLogic", "DynamicData is: [%s]", new Object[] { localObject2 });
      localObject1 = parambhy;
      localObject2 = parambhy;
      if (bl.z(paramString, "ADInfo") != null) {
        break label323;
      }
      localObject1 = parambhy;
      x.w("MicroMsg.AdSnsInfoStorageLogic", "DynamicData xml format error!");
      return paramString;
    }
    catch (Exception paramString) {}
    x.w("MicroMsg.AdSnsInfoStorageLogic", "replace error occurs!");
    localObject2 = localObject1;
    label323:
    return (String)localObject2;
  }
  
  private static void a(long paramLong, com.tencent.mm.plugin.sns.storage.a parama)
  {
    if ((!parama.nyu) || (bi.oW(parama.nyt))) {
      return;
    }
    parama = new m(paramLong, 1, parama.nyt);
    g.Ek();
    g.Eh().dpP.a(parama, 0);
  }
  
  public static void a(boc paramboc)
  {
    if (paramboc == null)
    {
      x.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      return;
    }
    if (paramboc.slX == null)
    {
      x.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      return;
    }
    com.tencent.mm.plugin.sns.storage.e locale = b(paramboc);
    af.byr().a(paramboc.slX.rlK, locale);
  }
  
  public static void a(boc paramboc, bhy parambhy)
  {
    if (paramboc == null) {
      x.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
    }
    com.tencent.mm.plugin.sns.storage.e locale;
    do
    {
      return;
      if (paramboc.slX == null)
      {
        x.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
        return;
      }
      locale = b(paramboc);
    } while (locale == null);
    locale.Ni(a(locale.field_adinfo, parambhy));
    if (af.byr().fa(paramboc.slX.rlK))
    {
      x.i("MicroMsg.AdSnsInfoStorageLogic", "ind this adobj and update" + paramboc.slX.rlK);
      af.byr().b(paramboc.slX.rlK, locale);
      return;
    }
    x.i("MicroMsg.AdSnsInfoStorageLogic", "local can not find this adobj " + paramboc.slX.rlK);
  }
  
  public static void a(bpm parambpm)
  {
    a(b(parambpm));
  }
  
  private static void a(cg paramcg)
  {
    paramcg = com.tencent.mm.platformtools.ab.a(paramcg.rcB.slY);
    if ((!bi.oW(paramcg)) && (new com.tencent.mm.plugin.sns.storage.b(paramcg).bzm())) {
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.bAB().e("adId", paramcg, "adxml", 0);
    }
  }
  
  private static void a(cg paramcg, int paramInt1, int paramInt2, com.tencent.mm.plugin.sns.storage.a parama)
  {
    if (paramcg == null) {
      x.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
    }
    for (;;)
    {
      return;
      if ((paramcg.rcB == null) || (paramcg.rcB.slX == null))
      {
        x.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
        return;
      }
      boy localboy = paramcg.rcB.slX;
      com.tencent.mm.plugin.sns.storage.e locale = b(paramcg.rcB);
      bsu localbsu = locale.bAJ();
      bqw localbqw = new bqw();
      localbqw.soW = new bqx();
      localbqw.soW.spa = parama.ntU;
      localbqw.soW.soZ = localbsu.ksA;
      localbqw.soW.source = locale.getSource();
      localbqw.soW.nIO = p.a(localbqw.soW);
      label160:
      com.tencent.mm.plugin.sns.storage.b localb;
      int i;
      if (localbsu.sqc.ruz == 1)
      {
        localbqw.soW.egL = 1;
        parama = localbqw.soW;
        localb = locale.bAG();
        if (localb != null) {
          break label385;
        }
        i = 0;
        parama.spb = i;
      }
      try
      {
        parama = Base64.encodeToString(localbqw.toByteArray(), 0).replace("\n", "");
        x.i("MicroMsg.AdSnsInfoStorageLogic", "replace newly add snsId:%s, statExtStr:%s(id=%s,uxInfo=%s)", new Object[] { localbsu.ksA, parama, localbqw.soW.soZ, localbqw.soW.spa });
        localbsu.nNV = parama;
        locale.c(localbsu);
        if (locale == null) {
          continue;
        }
        locale.field_createTime = paramInt1;
        locale.field_exposureTime = 0;
        locale.field_createAdTime = paramInt2;
        parama = com.tencent.mm.platformtools.ab.a(paramcg.rcB.slY);
        if (!bi.oW(parama)) {
          locale.field_recxml = parama;
        }
        locale.field_adinfo = com.tencent.mm.platformtools.ab.a(paramcg.rcC);
        locale.field_adxml = locale.field_recxml;
        af.byr().a(localboy.rlK, locale);
        return;
        if (localbsu.sqc.ruz == 15)
        {
          localbqw.soW.egL = 2;
          break label160;
        }
        localbqw.soW.egL = 0;
        break label160;
        label385:
        i = localb.nyZ;
      }
      catch (IOException parama)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", parama, "", new Object[0]);
        }
      }
    }
  }
  
  private static void a(LinkedList<cg> paramLinkedList, LinkedList<boy> paramLinkedList1, boolean paramBoolean)
  {
    if ((paramLinkedList == null) || (paramLinkedList1 == null) || (paramLinkedList1.size() == 0)) {
      return;
    }
    int k = a((boy)paramLinkedList1.get(paramLinkedList1.size() - 1));
    int i = 0;
    label36:
    cg localcg;
    if (i < paramLinkedList.size())
    {
      localcg = (cg)paramLinkedList.get(i);
      if (localcg != null) {
        break label74;
      }
      x.i("MicroMsg.AdSnsInfoStorageLogic", "ad is null");
    }
    label74:
    Object localObject;
    com.tencent.mm.plugin.sns.storage.a locala;
    for (;;)
    {
      i += 1;
      break label36;
      break;
      if (localcg.rcB == null)
      {
        x.i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject is null");
      }
      else if (localcg.rcB.slX == null)
      {
        x.i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject.SnsObject is null");
      }
      else if ((paramBoolean) && (af.byr().fa(localcg.rcB.slX.rlK)))
      {
        x.i("MicroMsg.AdSnsInfoStorageLogic", "snsId %d already exist, ignore ", new Object[] { Long.valueOf(localcg.rcB.slX.rlK) });
      }
      else
      {
        localObject = com.tencent.mm.platformtools.ab.a(localcg.rcC);
        String str1 = com.tencent.mm.platformtools.ab.a(localcg.rcB.slY);
        String str2 = com.tencent.mm.platformtools.ab.b(localcg.rcB.slX.smH);
        locala = new com.tencent.mm.plugin.sns.storage.a((String)localObject);
        x.i("MicroMsg.AdSnsInfoStorageLogic", "skXml " + (String)localObject);
        x.i("MicroMsg.AdSnsInfoStorageLogic", "adXml " + str1);
        x.i("MicroMsg.AdSnsInfoStorageLogic", "snsXml " + str2 + "\r\n");
        localObject = new com.tencent.mm.plugin.sns.storage.b(str1);
        if ((((com.tencent.mm.plugin.sns.storage.b)localObject).nza == 0L) || (!eH(((com.tencent.mm.plugin.sns.storage.b)localObject).nza))) {
          break label357;
        }
        x.w("MicroMsg.AdSnsInfoStorageLogic", "ignore recvd ad filter by originSnsId " + ((com.tencent.mm.plugin.sns.storage.b)localObject).nza);
      }
    }
    label357:
    int j = k + 1;
    if ((locala.nxS < paramLinkedList1.size()) && (locala.nxS >= 0))
    {
      j = a((boy)paramLinkedList1.get(locala.nxS)) + 1;
      x.i("MicroMsg.AdSnsInfoStorageLogic", "create adinfo time  " + j + " pos " + locala.nxS);
    }
    for (;;)
    {
      int m = (int)(System.currentTimeMillis() / 1000L);
      x.i("MicroMsg.AdSnsInfoStorageLogic", "gettime " + m);
      a(localcg, j, m, locala);
      eI(localcg.rcB.slX.rlK);
      eI(((com.tencent.mm.plugin.sns.storage.b)localObject).nza);
      a(localcg.rcB.slX.rlK, locala);
      break;
      x.w("MicroMsg.AdSnsInfoStorageLogic", "invalid ad.pos " + locala.nxS);
    }
  }
  
  public static boolean a(long paramLong, boi paramboi)
  {
    boh localboh = paramboi.smo;
    if ((localboh.hcE != 7) && (localboh.hcE != 8)) {
      return false;
    }
    com.tencent.mm.plugin.sns.storage.e locale = af.byr().eZ(paramLong);
    if (locale == null)
    {
      x.i("MicroMsg.AdSnsInfoStorageLogic", "pass the action because the snsinfo is null " + paramLong);
      return false;
    }
    try
    {
      boy localboy = (boy)new boy().aG(locale.field_attrBuf);
      localboy.rlK = paramLong;
      Iterator localIterator;
      bon localbon;
      if (localboh.hcE == 7)
      {
        localIterator = localboy.smL.iterator();
        while (localIterator.hasNext())
        {
          localbon = (bon)localIterator.next();
          if ((localbon.lOH == localboh.lOH) && (localbon.rdS.equals(localboh.seC)))
          {
            x.i("MicroMsg.AdSnsInfoStorageLogic", "like create time " + localbon.lOH + " ");
            return false;
          }
        }
        localboy.smL.add(ad.a(paramboi));
      }
      for (;;)
      {
        locale.aK(localboy.toByteArray());
        af.byr().a(localboy.rlK, locale);
        break;
        if (localboh.hcE == 8)
        {
          localIterator = localboy.smO.iterator();
          while (localIterator.hasNext())
          {
            localbon = (bon)localIterator.next();
            if ((localbon.lOH == localboh.lOH) && (localbon.rdS.equals(localboh.seC)))
            {
              x.i("MicroMsg.AdSnsInfoStorageLogic", "like create time " + localbon.lOH + " ");
              return false;
            }
          }
          localboy.smO.add(ad.a(paramboi));
        }
      }
      return true;
    }
    catch (Exception paramboi)
    {
      x.e("MicroMsg.AdSnsInfoStorageLogic", "e " + paramboi.getMessage());
      x.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", paramboi, "", new Object[0]);
    }
  }
  
  public static boolean a(long paramLong, boi paramboi, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    Object localObject1;
    if (paramboi != null)
    {
      localObject1 = paramboi.smo;
      if ((((boh)localObject1).hcE != 7) && (((boh)localObject1).hcE != 8)) {
        return false;
      }
    }
    Object localObject3 = q.GF();
    if ((paramboi != null) && (paramboi.smp != null) && (paramboi.smp.seC != null) && (paramboi.smp.seC.equals(localObject3))) {
      return true;
    }
    Object localObject2 = af.byr().eZ(paramLong);
    int k;
    Object localObject4;
    int i;
    long l;
    try
    {
      localObject1 = (boy)new boy().aG(((com.tencent.mm.plugin.sns.storage.e)localObject2).field_attrBuf);
      ((boy)localObject1).rlK = paramLong;
      k = ((com.tencent.mm.plugin.sns.storage.e)localObject2).field_firstControlTime;
      paramboi = paramboi.smo;
      if (paramboi.hcE == 7)
      {
        if ((paramInt2 <= 0) || (k + paramInt2 >= paramboi.lOH)) {
          break label721;
        }
        if (paramBoolean)
        {
          localObject3 = af.byo().Nk(((com.tencent.mm.plugin.sns.storage.e)localObject2).bAK());
          if (localObject3 == null) {
            break label418;
          }
          localObject4 = ((n)localObject3).bAH();
          if (localObject4 == null) {
            break label392;
          }
          localObject3 = (c)g.l(c.class);
          i = ((com.tencent.mm.plugin.sns.storage.e)localObject2).getSource();
          l = v.NE(((com.tencent.mm.plugin.sns.storage.e)localObject2).bAK());
          localObject2 = ((com.tencent.mm.plugin.sns.storage.a)localObject4).fvT;
          if (((boy)localObject1).smL == null) {
            break label1147;
          }
          paramInt1 = ((boy)localObject1).smL.size();
          if (((boy)localObject1).smO == null) {
            break label1152;
          }
          paramInt3 = ((boy)localObject1).smO.size();
          label253:
          ((c)localObject3).a(13182, i, new Object[] { Long.valueOf(l), localObject2, Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf((int)(System.currentTimeMillis() / 1000L)) });
        }
        for (;;)
        {
          x.i("MicroMsg.AdSnsInfoStorageLogic", "snsid " + paramLong + " firstCreateTime " + k + " actionLikeTimeLimit: " + paramInt2 + " curAction.createTime: " + paramboi.lOH + "is over the time limit!");
          return false;
          label392:
          x.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
        }
        return true;
      }
    }
    catch (Exception paramboi)
    {
      x.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", paramboi, "", new Object[0]);
    }
    label418:
    label542:
    label560:
    label699:
    label710:
    label721:
    label733:
    int j;
    label804:
    do
    {
      x.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
      break;
      if ((paramboi.hcE == 8) && (paramInt3 > 0) && (k + paramInt3 < paramboi.lOH))
      {
        if (paramBoolean)
        {
          localObject3 = af.byo().Nk(((com.tencent.mm.plugin.sns.storage.e)localObject2).bAK());
          if (localObject3 == null) {
            break label710;
          }
          localObject4 = ((n)localObject3).bAH();
          if (localObject4 == null) {
            break label699;
          }
          localObject3 = (c)g.l(c.class);
          i = ((com.tencent.mm.plugin.sns.storage.e)localObject2).getSource();
          l = v.NE(((com.tencent.mm.plugin.sns.storage.e)localObject2).bAK());
          localObject2 = ((com.tencent.mm.plugin.sns.storage.a)localObject4).fvT;
          if (((boy)localObject1).smL == null) {
            break label1158;
          }
          paramInt1 = ((boy)localObject1).smL.size();
          if (((boy)localObject1).smO == null) {
            break label1163;
          }
          paramInt2 = ((boy)localObject1).smO.size();
          ((c)localObject3).a(13182, i, new Object[] { Long.valueOf(l), localObject2, Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf((int)(System.currentTimeMillis() / 1000L)) });
        }
        for (;;)
        {
          x.i("MicroMsg.AdSnsInfoStorageLogic", "snsid " + paramLong + " firstCreateTime " + k + " actionCommentTimeLimit: " + paramInt3 + " curAction.createTime: " + paramboi.lOH + "is over the time limit!");
          return false;
          x.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
          continue;
          x.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
        }
      }
      i = 0;
      paramboi = ((boy)localObject1).smL.iterator();
      if (paramboi.hasNext())
      {
        localObject4 = (bon)paramboi.next();
        if (((bon)localObject4).lOH <= k) {
          break label1144;
        }
        if ((localObject4 == null) || (((bon)localObject4).rdS == null)) {
          break label1169;
        }
        if (((bon)localObject4).rdS.equals(localObject3)) {
          break label1144;
        }
        break label1169;
      }
      j = 0;
      paramboi = ((boy)localObject1).smO.iterator();
      if (paramboi.hasNext())
      {
        localObject4 = (bon)paramboi.next();
        if (((bon)localObject4).lOH <= k) {
          break label1141;
        }
        if ((localObject4 == null) || (((bon)localObject4).rdS == null)) {
          break label1178;
        }
        if (((bon)localObject4).rdS.equals(localObject3)) {
          break label1141;
        }
        break label1178;
      }
      i = i + 0 + j;
      x.i("MicroMsg.AdSnsInfoStorageLogic", "totalsize " + i + " firstCreateTime " + k + " actionLimit: " + paramInt1 + " actionLikeTimeLimit: " + paramInt2 + " actionCommentTimeLimit: " + paramInt3);
    } while (i < paramInt1);
    if (paramBoolean)
    {
      paramboi = af.byo().Nk(((com.tencent.mm.plugin.sns.storage.e)localObject2).bAK());
      if (paramboi != null)
      {
        localObject3 = paramboi.bAH();
        if (localObject3 != null)
        {
          paramboi = (c)g.l(c.class);
          paramInt3 = ((com.tencent.mm.plugin.sns.storage.e)localObject2).getSource();
          paramLong = v.NE(((com.tencent.mm.plugin.sns.storage.e)localObject2).bAK());
          localObject2 = ((com.tencent.mm.plugin.sns.storage.a)localObject3).fvT;
          if (((boy)localObject1).smL == null) {
            break label1189;
          }
          paramInt1 = ((boy)localObject1).smL.size();
          label1026:
          if (((boy)localObject1).smO == null) {
            break label1194;
          }
        }
      }
    }
    label1141:
    label1144:
    label1147:
    label1152:
    label1158:
    label1163:
    label1169:
    label1175:
    label1178:
    label1184:
    label1187:
    label1189:
    label1194:
    for (paramInt2 = ((boy)localObject1).smO.size();; paramInt2 = 0)
    {
      paramboi.a(13182, paramInt3, new Object[] { Long.valueOf(paramLong), localObject2, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf((int)(System.currentTimeMillis() / 1000L)) });
      break label1187;
      x.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
      break label1187;
      x.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
      break label1187;
      break label1184;
      break label1175;
      paramInt1 = 0;
      break;
      paramInt3 = 0;
      break label253;
      paramInt1 = 0;
      break label542;
      paramInt2 = 0;
      break label560;
      i += 1;
      break label733;
      j += 1;
      break label804;
      return false;
      paramInt1 = 0;
      break label1026;
    }
  }
  
  private static boolean a(bon parambon, List<bon> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      bon localbon = (bon)paramList.next();
      if ((!bi.oW(parambon.rdS)) && (parambon.rdS.equals(localbon.rdS))) {
        return true;
      }
    }
    return false;
  }
  
  private static LinkedList<cg> ab(LinkedList<bfl> paramLinkedList)
  {
    LinkedList localLinkedList = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      cg localcg = a((bfl)paramLinkedList.next());
      if (localcg != null) {
        localLinkedList.add(localcg);
      }
    }
    return localLinkedList;
  }
  
  public static void ac(LinkedList<bfl> paramLinkedList)
  {
    if ((paramLinkedList != null) && (!paramLinkedList.isEmpty()))
    {
      paramLinkedList = ab(paramLinkedList);
      x.i("MicroMsg.AdSnsInfoStorageLogic", "convert " + paramLinkedList.size() + " recObj to AdvertiseObj");
      ad(paramLinkedList);
    }
  }
  
  public static void ad(LinkedList<cg> paramLinkedList)
  {
    if (paramLinkedList == null) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < paramLinkedList.size())
      {
        a((cg)paramLinkedList.get(i));
        i += 1;
      }
    }
  }
  
  public static void ae(LinkedList<boy> paramLinkedList)
  {
    if (paramLinkedList == null) {}
    for (;;)
    {
      return;
      com.tencent.mm.plugin.sns.storage.o localo = af.byo();
      int i = 0;
      while (i < paramLinkedList.size())
      {
        Object localObject = (boy)paramLinkedList.get(i);
        if (localObject != null)
        {
          localObject = localo.fi(((boy)localObject).rlK);
          if (localObject != null)
          {
            localObject = ((n)localObject).bAJ();
            if ((localObject != null) && (!bi.oW(((bsu)localObject).ogR))) {
              com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.bAB().e("adId", ((bsu)localObject).ogR, "adxml", 0);
            }
          }
        }
        i += 1;
      }
    }
  }
  
  private static com.tencent.mm.plugin.sns.storage.e b(boc paramboc)
  {
    com.tencent.mm.plugin.sns.storage.e locale = af.byr().eZ(paramboc.slX.rlK);
    boy localboy = paramboc.slX;
    Object localObject1 = null;
    if (locale == null) {
      locale = new com.tencent.mm.plugin.sns.storage.e();
    }
    Object localObject2;
    for (;;)
    {
      localObject2 = com.tencent.mm.platformtools.ab.b(localboy.smH);
      if (!bi.oW((String)localObject2)) {
        break;
      }
      return null;
      localObject1 = locale.bAJ().nNV;
    }
    if (!locale.Nj((String)localObject2)) {
      return null;
    }
    if (!bi.oW((String)localObject1))
    {
      localObject2 = locale.bAJ();
      ((bsu)localObject2).nNV = ((String)localObject1);
      locale.c((bsu)localObject2);
    }
    localboy.smY = aj.b(localboy.smY, locale.field_attrBuf);
    x.d("MicroMsg.AdSnsInfoStorageLogic", "from server xml ok %d", new Object[] { Long.valueOf(localboy.rlK) });
    localboy.smH.bq(new byte[0]);
    locale.field_userName = localboy.rdS;
    if (paramboc.slY != null)
    {
      paramboc = com.tencent.mm.platformtools.ab.a(paramboc.slY);
      if (!bi.oW(paramboc)) {
        locale.field_recxml = paramboc;
      }
      paramboc = locale.field_recxml;
      if ((!bi.oW(paramboc)) && (!paramboc.equals(locale.field_adxml)))
      {
        x.i("MicroMsg.AdSnsInfoStorageLogic", "update field adxml " + paramboc);
        locale.field_adxml = paramboc;
      }
    }
    locale.field_likeFlag = localboy.smI;
    long l = localboy.rlK;
    locale.field_snsId = l;
    if (l != 0L)
    {
      locale.field_stringSeq = com.tencent.mm.plugin.sns.data.i.eF(l);
      locale.field_stringSeq = com.tencent.mm.plugin.sns.data.i.LK(locale.field_stringSeq);
      x.d("MicroMsg.AdSnsInfo", l + " stringSeq " + locale.field_stringSeq);
    }
    locale.wZ(2);
    locale.wZ(32);
    try
    {
      if (locale.field_attrBuf == null)
      {
        paramboc = new boy();
        if ((paramboc == null) || (paramboc.smO == null)) {
          break label880;
        }
        localObject1 = new LinkedList();
        localObject2 = localboy.smO.iterator();
        for (;;)
        {
          if (!((Iterator)localObject2).hasNext()) {
            break label664;
          }
          localObject3 = (bon)((Iterator)localObject2).next();
          if (((bon)localObject3).rXs > 0)
          {
            ((List)localObject1).add(localObject3);
            localIterator = paramboc.smO.iterator();
            if (localIterator.hasNext())
            {
              localbon = (bon)localIterator.next();
              if (localbon.smk != ((bon)localObject3).smk) {
                break;
              }
              paramboc.smO.remove(localbon);
            }
          }
        }
      }
    }
    catch (Exception paramboc)
    {
      for (;;)
      {
        Object localObject3;
        Iterator localIterator;
        bon localbon;
        x.i("MicroMsg.AdSnsInfoStorageLogic", "error " + paramboc.getMessage());
        x.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", paramboc, "", new Object[0]);
        try
        {
          for (;;)
          {
            locale.aK(localboy.toByteArray());
            paramboc = locale.bAJ();
            paramboc.hbL = localboy.rdS;
            locale.field_pravited = paramboc.rVG;
            x.d("MicroMsg.AdSnsInfoStorageLogic", "ext flag " + localboy.rXx + " " + localboy.smO.size() + " " + localboy.smL.size());
            localObject1 = paramboc.sqc.ruA.iterator();
            while (((Iterator)localObject1).hasNext()) {
              ((ate)((Iterator)localObject1).next()).nkG = true;
            }
            paramboc = (boy)new boy().aG(locale.field_attrBuf);
            break;
            label664:
            localObject2 = ((List)localObject1).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject3 = (bon)((Iterator)localObject2).next();
              localboy.smO.remove(localObject3);
            }
            ((List)localObject1).clear();
            localObject1 = paramboc.smO.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject2 = (bon)((Iterator)localObject1).next();
              if ((!b((bon)localObject2, localboy.smO)) && (((bon)localObject2).smk != 0L))
              {
                g.Ek();
                localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(((bon)localObject2).rdS);
                if ((localObject3 != null) && (com.tencent.mm.l.a.gd(((ai)localObject3).field_type)) && (!((com.tencent.mm.storage.ab)localObject3).BA()))
                {
                  localboy.smO.add(localObject2);
                  localboy.smN = localboy.smO.size();
                }
                else
                {
                  x.i("MicroMsg.AdSnsInfoStorageLogic", "not in ommentlist not mycontact " + ((bon)localObject2).rdS);
                }
              }
            }
            label880:
            Collections.sort(localboy.smO, nmy);
            if (localboy.smL != null)
            {
              localObject1 = new LinkedList();
              localObject2 = localboy.smL.iterator();
              for (;;)
              {
                if (!((Iterator)localObject2).hasNext()) {
                  break label1029;
                }
                localObject3 = (bon)((Iterator)localObject2).next();
                if (((bon)localObject3).rXs > 0)
                {
                  ((List)localObject1).add(localObject3);
                  localIterator = paramboc.smL.iterator();
                  if (localIterator.hasNext())
                  {
                    localbon = (bon)localIterator.next();
                    if ((!bi.oW(localbon.rdS)) && (!localbon.rdS.equals(((bon)localObject3).rdS))) {
                      break;
                    }
                    paramboc.smL.remove(localbon);
                  }
                }
              }
              label1029:
              localObject2 = ((List)localObject1).iterator();
              while (((Iterator)localObject2).hasNext())
              {
                localObject3 = (bon)((Iterator)localObject2).next();
                localboy.smL.remove(localObject3);
              }
              ((List)localObject1).clear();
              if ((paramboc != null) && (paramboc.smL != null))
              {
                paramboc = paramboc.smL.iterator();
                while (paramboc.hasNext())
                {
                  localObject1 = (bon)paramboc.next();
                  if (!a((bon)localObject1, localboy.smL))
                  {
                    g.Ek();
                    localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(((bon)localObject1).rdS);
                    if ((localObject2 != null) && (com.tencent.mm.l.a.gd(((ai)localObject2).field_type)) && (!((com.tencent.mm.storage.ab)localObject2).BA()))
                    {
                      localboy.smL.add(localObject1);
                      localboy.smK = localboy.smL.size();
                    }
                    else
                    {
                      x.i("MicroMsg.AdSnsInfoStorageLogic", "not in likelist not mycontact " + ((bon)localObject1).rdS);
                    }
                  }
                }
              }
              Collections.sort(localboy.smL, nmy);
            }
          }
        }
        catch (Exception paramboc)
        {
          for (;;)
          {
            x.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", paramboc, "", new Object[0]);
          }
          locale.c(paramboc);
          locale.field_type = paramboc.sqc.ruz;
          locale.field_subType = paramboc.sqc.ruB;
        }
      }
    }
    return locale;
  }
  
  private static boc b(bpm parambpm)
  {
    if (parambpm != null)
    {
      boc localboc = new boc();
      localboc.slY = parambpm.snA;
      if (localboc.slY == null) {
        x.i("MicroMsg.AdSnsInfoStorageLogic", "recommendObj.RecommendXml is null");
      }
      localboc.slX = parambpm.slX;
      return localboc;
    }
    return null;
  }
  
  public static void b(bfl parambfl)
  {
    cg localcg = a(parambfl);
    if (localcg == null) {
      return;
    }
    com.tencent.mm.plugin.sns.storage.a locala = new com.tencent.mm.plugin.sns.storage.a(com.tencent.mm.platformtools.ab.a(localcg.rcC));
    int j = locala.nxS;
    Object localObject;
    if (j <= 0)
    {
      i = 1;
      int k = af.byo().Ny("");
      x.i("MicroMsg.AdSnsInfoStorageLogic", "ad.pos = %d, dbLimit = %d, createTime.limit = %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k) });
      com.tencent.mm.plugin.sns.storage.o localo = af.byo();
      parambfl = com.tencent.mm.plugin.sns.storage.o.nJr + " from SnsInfo where ";
      localObject = parambfl + com.tencent.mm.plugin.sns.storage.o.bBu();
      parambfl = (bfl)localObject;
      if (com.tencent.mm.plugin.sns.storage.o.Nt("")) {
        parambfl = (String)localObject + " AND " + localo.Nu("");
      }
      parambfl = parambfl + " AND createTime >= " + k;
      parambfl = parambfl + " UNION ";
      parambfl = parambfl + com.tencent.mm.plugin.sns.storage.o.nJr + " from AdSnsInfo where createTime > " + k;
      parambfl = parambfl + com.tencent.mm.plugin.sns.storage.o.nJs;
      parambfl = parambfl + " limit " + i;
      x.d("MicroMsg.SnsInfoStorage", "getAdCursorForTimeLine " + parambfl + " limtiSeq: " + "");
      parambfl = localo.diF.rawQuery(parambfl, null);
      if ((parambfl == null) || (parambfl.getCount() <= 0)) {
        break label532;
      }
      x.i("MicroMsg.AdSnsInfoStorageLogic", "db return %d feeds", new Object[] { Integer.valueOf(parambfl.getCount()) });
      localObject = new n();
      if (j >= 0) {
        break label511;
      }
      i = 0;
      label398:
      if (!parambfl.moveToPosition(i)) {
        break label516;
      }
      ((n)localObject).d(parambfl);
    }
    label414:
    for (int i = ((n)localObject).field_createTime + 1;; i = (int)bi.VE())
    {
      parambfl.close();
      x.i("MicroMsg.AdSnsInfoStorageLogic", "inserting snsid  " + localcg.rcB.slX.rlK + " ,createTime " + i);
      a(localcg, i, (int)bi.VE(), locala);
      a(localcg);
      a(localcg.rcB.slX.rlK, locala);
      return;
      i = j + 1;
      break;
      label511:
      i = j;
      break label398;
      label516:
      parambfl.moveToLast();
      ((n)localObject).d(parambfl);
      break label414;
      label532:
      x.i("MicroMsg.AdSnsInfoStorageLogic", "db return nothing");
    }
  }
  
  private static boolean b(bon parambon, List<bon> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      bon localbon = (bon)paramList.next();
      if ((parambon.smk == localbon.smk) && (localbon.smk != 0L)) {
        return true;
      }
    }
    return false;
  }
  
  /* Error */
  private static void bxq()
  {
    // Byte code:
    //   0: getstatic 953	com/tencent/mm/plugin/sns/model/a:nmx	Ljava/util/LinkedHashMap;
    //   3: ifnonnull +77 -> 80
    //   6: getstatic 46	com/tencent/mm/plugin/sns/model/a:nmw	Ljava/lang/String;
    //   9: invokestatic 959	com/tencent/mm/pluginsdk/g/a/d/a:Tq	(Ljava/lang/String;)[B
    //   12: astore_0
    //   13: aload_0
    //   14: ifnull +41 -> 55
    //   17: new 961	java/io/ByteArrayInputStream
    //   20: dup
    //   21: aload_0
    //   22: invokespecial 963	java/io/ByteArrayInputStream:<init>	([B)V
    //   25: astore_0
    //   26: new 965	java/io/ObjectInputStream
    //   29: dup
    //   30: aload_0
    //   31: invokespecial 968	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   34: astore_1
    //   35: aload_1
    //   36: astore_0
    //   37: aload_1
    //   38: invokeinterface 973 1 0
    //   43: checkcast 975	java/util/LinkedHashMap
    //   46: putstatic 953	com/tencent/mm/plugin/sns/model/a:nmx	Ljava/util/LinkedHashMap;
    //   49: aload_1
    //   50: invokeinterface 976 1 0
    //   55: getstatic 953	com/tencent/mm/plugin/sns/model/a:nmx	Ljava/util/LinkedHashMap;
    //   58: ifnonnull +22 -> 80
    //   61: new 978	com/tencent/mm/plugin/sns/model/a$2
    //   64: dup
    //   65: ldc2_w 979
    //   68: invokestatic 986	java/lang/Math:ceil	(D)D
    //   71: d2i
    //   72: iconst_1
    //   73: iadd
    //   74: invokespecial 988	com/tencent/mm/plugin/sns/model/a$2:<init>	(I)V
    //   77: putstatic 953	com/tencent/mm/plugin/sns/model/a:nmx	Ljava/util/LinkedHashMap;
    //   80: return
    //   81: astore_2
    //   82: aconst_null
    //   83: astore_1
    //   84: aload_1
    //   85: astore_0
    //   86: ldc 118
    //   88: aload_2
    //   89: invokestatic 991	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   92: invokestatic 606	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   95: aload_1
    //   96: ifnull -41 -> 55
    //   99: aload_1
    //   100: invokeinterface 976 1 0
    //   105: goto -50 -> 55
    //   108: astore_0
    //   109: goto -54 -> 55
    //   112: astore_2
    //   113: aconst_null
    //   114: astore_1
    //   115: aload_1
    //   116: astore_0
    //   117: ldc 118
    //   119: aload_2
    //   120: invokestatic 991	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   123: invokestatic 606	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   126: aload_1
    //   127: ifnull -72 -> 55
    //   130: aload_1
    //   131: invokeinterface 976 1 0
    //   136: goto -81 -> 55
    //   139: astore_0
    //   140: goto -85 -> 55
    //   143: astore_2
    //   144: aconst_null
    //   145: astore_1
    //   146: aload_1
    //   147: astore_0
    //   148: ldc 118
    //   150: aload_2
    //   151: invokestatic 991	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   154: invokestatic 606	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   157: aload_1
    //   158: ifnull -103 -> 55
    //   161: aload_1
    //   162: invokeinterface 976 1 0
    //   167: goto -112 -> 55
    //   170: astore_0
    //   171: goto -116 -> 55
    //   174: astore_1
    //   175: aconst_null
    //   176: astore_0
    //   177: aload_0
    //   178: ifnull +9 -> 187
    //   181: aload_0
    //   182: invokeinterface 976 1 0
    //   187: aload_1
    //   188: athrow
    //   189: astore_0
    //   190: goto -135 -> 55
    //   193: astore_0
    //   194: goto -7 -> 187
    //   197: astore_1
    //   198: goto -21 -> 177
    //   201: astore_2
    //   202: goto -56 -> 146
    //   205: astore_2
    //   206: goto -91 -> 115
    //   209: astore_2
    //   210: goto -126 -> 84
    // Local variable table:
    //   start	length	slot	name	signature
    //   12	74	0	localObject1	Object
    //   108	1	0	localIOException1	IOException
    //   116	1	0	localObject2	Object
    //   139	1	0	localIOException2	IOException
    //   147	1	0	localObject3	Object
    //   170	1	0	localIOException3	IOException
    //   176	6	0	localObject4	Object
    //   189	1	0	localIOException4	IOException
    //   193	1	0	localIOException5	IOException
    //   34	128	1	localObjectInputStream	java.io.ObjectInputStream
    //   174	14	1	localObject5	Object
    //   197	1	1	localObject6	Object
    //   81	8	2	localStreamCorruptedException1	java.io.StreamCorruptedException
    //   112	8	2	localIOException6	IOException
    //   143	8	2	localClassNotFoundException1	ClassNotFoundException
    //   201	1	2	localClassNotFoundException2	ClassNotFoundException
    //   205	1	2	localIOException7	IOException
    //   209	1	2	localStreamCorruptedException2	java.io.StreamCorruptedException
    // Exception table:
    //   from	to	target	type
    //   26	35	81	java/io/StreamCorruptedException
    //   99	105	108	java/io/IOException
    //   26	35	112	java/io/IOException
    //   130	136	139	java/io/IOException
    //   26	35	143	java/lang/ClassNotFoundException
    //   161	167	170	java/io/IOException
    //   26	35	174	finally
    //   49	55	189	java/io/IOException
    //   181	187	193	java/io/IOException
    //   37	49	197	finally
    //   86	95	197	finally
    //   117	126	197	finally
    //   148	157	197	finally
    //   37	49	201	java/lang/ClassNotFoundException
    //   37	49	205	java/io/IOException
    //   37	49	209	java/io/StreamCorruptedException
  }
  
  public static void d(LinkedList<bfl> paramLinkedList, LinkedList<boy> paramLinkedList1)
  {
    if (paramLinkedList != null)
    {
      paramLinkedList = ab(paramLinkedList);
      x.i("MicroMsg.AdSnsInfoStorageLogic", "convert " + paramLinkedList.size() + " recObj to AdvertiseObj");
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        cg localcg = (cg)localIterator.next();
        if (eH(localcg.rcB.slX.rlK))
        {
          x.w("MicroMsg.AdSnsInfoStorageLogic", "ignore recvd ad filter by snsId " + localcg.rcB.slX.rlK);
          localIterator.remove();
        }
      }
      a(paramLinkedList, paramLinkedList1, true);
    }
  }
  
  public static void e(LinkedList<cg> paramLinkedList, LinkedList<boy> paramLinkedList1)
  {
    a(paramLinkedList, paramLinkedList1, false);
  }
  
  private static boolean eH(long paramLong)
  {
    bxq();
    return nmx.get(Long.valueOf(paramLong)) != null;
  }
  
  private static void eI(long paramLong)
  {
    if (paramLong == 0L) {
      return;
    }
    if (nmx == null) {
      bxq();
    }
    nmx.put(Long.valueOf(paramLong), Integer.valueOf(0));
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      Object localObject1 = new ObjectOutputStream(localByteArrayOutputStream);
      ((ObjectOutput)localObject1).writeObject(nmx);
      ((ObjectOutput)localObject1).flush();
      localObject1 = localByteArrayOutputStream.toByteArray();
      com.tencent.mm.pluginsdk.g.a.d.a.v(nmw, (byte[])localObject1);
      try
      {
        localByteArrayOutputStream.close();
        return;
      }
      catch (IOException localIOException1)
      {
        return;
      }
      try
      {
        localIOException2.close();
        throw ((Throwable)localObject2);
      }
      catch (IOException localIOException3)
      {
        for (;;) {}
      }
    }
    catch (IOException localIOException4)
    {
      localIOException4 = localIOException4;
      x.e("MicroMsg.AdSnsInfoStorageLogic", bi.i(localIOException4));
      try
      {
        localIOException1.close();
        return;
      }
      catch (IOException localIOException2) {}
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */