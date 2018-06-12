package com.tencent.mm.modelvideo;

import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.m;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bri;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.ay;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public final class u
  implements com.tencent.mm.ab.d
{
  public static int a(int paramInt1, keep_SceneResult paramkeep_SceneResult, long paramLong1, r paramr, String paramString1, String paramString2, int paramInt2, String paramString3, long paramLong2)
  {
    if (paramInt1 != 0)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoMsgExtension", "getThumbByCdn failed. startRet:%d msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), paramr.Tj(), paramString2, paramString1 });
      com.tencent.mm.plugin.report.service.h.mEJ.h(10421, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(2), Long.valueOf(paramLong2), Long.valueOf(bi.VF()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bL(ad.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE), Integer.valueOf(paramInt2), "" });
      return paramInt1;
    }
    if (paramkeep_SceneResult == null) {
      return 0;
    }
    label200:
    int i;
    int j;
    if (paramkeep_SceneResult.field_retCode != 0)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoMsgExtension", "getThumbByCdn failed. sceneResult.field_retCode:%d msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", new Object[] { Integer.valueOf(paramkeep_SceneResult.field_retCode), Long.valueOf(paramLong1), paramr.Tj(), paramString2, paramString1 });
      paramString3 = com.tencent.mm.plugin.report.service.h.mEJ;
      if (paramkeep_SceneResult != null) {
        break label826;
      }
      paramInt1 = -1;
      paramLong1 = bi.VF();
      i = com.tencent.mm.modelcdntran.d.bL(ad.getContext());
      j = com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE;
      if (paramkeep_SceneResult != null) {
        break label834;
      }
      paramString1 = "";
      label225:
      if (paramkeep_SceneResult != null) {
        break label843;
      }
      paramString2 = "";
      label233:
      paramString3.h(10421, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(2), Long.valueOf(paramLong2), Long.valueOf(paramLong1), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt2), paramString1, "", "", "", "", "", "", "", paramString2 });
      if ((paramkeep_SceneResult != null) && (paramkeep_SceneResult.field_retCode != 0))
      {
        paramString2 = com.tencent.mm.plugin.report.service.h.mEJ;
        if (paramkeep_SceneResult != null) {
          break label852;
        }
        paramInt1 = -1;
        label376:
        paramLong1 = bi.VF();
        i = com.tencent.mm.modelcdntran.d.bL(ad.getContext());
        j = com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE;
        if (paramkeep_SceneResult != null) {
          break label860;
        }
        paramString1 = "";
        label401:
        if (paramkeep_SceneResult != null) {
          break label869;
        }
      }
    }
    label826:
    label834:
    label843:
    label852:
    label860:
    label869:
    for (paramkeep_SceneResult = "";; paramkeep_SceneResult = paramkeep_SceneResult.report_Part2)
    {
      paramString2.h(13937, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(2), Long.valueOf(paramLong2), Long.valueOf(paramLong1), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt2), paramString1, "", "", "", "", "", "", "", paramkeep_SceneResult });
      paramkeep_SceneResult = o.Ta();
      paramString1 = paramr.getFileName();
      paramr = s.a.c.eoj;
      if (!bi.oW(paramString1))
      {
        paramString1 = paramkeep_SceneResult.nI(paramString1);
        if (paramString1 != null)
        {
          paramr = new s.a.a(paramString1.getFileName(), s.a.b.eoh, paramr, paramString1.enT, paramString1.emf);
          paramkeep_SceneResult.dHn.ci(paramr);
          paramkeep_SceneResult.dHn.doNotify();
        }
      }
      return 0;
      File localFile = new File(paramString1);
      new File(paramString3).renameTo(localFile);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoMsgExtension", "getThumbByCdn succ. msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", new Object[] { Long.valueOf(paramLong1), paramr.Tj(), paramString2, paramString1 });
      if (paramr.enT == 3)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(198L, 6L, paramInt2, false);
        com.tencent.mm.plugin.report.service.h.mEJ.a(198L, 7L, 1L, false);
        paramString1 = com.tencent.mm.plugin.report.service.h.mEJ;
        if (com.tencent.mm.model.s.fq(paramr.Tj())) {}
        for (paramLong1 = 9L;; paramLong1 = 8L)
        {
          paramString1.a(198L, paramLong1, 1L, false);
          break;
        }
      }
      com.tencent.mm.plugin.report.service.h.mEJ.a(198L, 11L, paramInt2, false);
      com.tencent.mm.plugin.report.service.h.mEJ.a(198L, 12L, 1L, false);
      paramString1 = com.tencent.mm.plugin.report.service.h.mEJ;
      if (com.tencent.mm.model.s.fq(paramr.Tj())) {}
      for (paramLong1 = 14L;; paramLong1 = 13L)
      {
        paramString1.a(198L, paramLong1, 1L, false);
        break;
      }
      paramInt1 = paramkeep_SceneResult.field_retCode;
      break label200;
      paramString1 = paramkeep_SceneResult.field_transInfo;
      break label225;
      paramString2 = paramkeep_SceneResult.report_Part2;
      break label233;
      paramInt1 = paramkeep_SceneResult.field_retCode;
      break label376;
      paramString1 = paramkeep_SceneResult.field_transInfo;
      break label401;
    }
  }
  
  public final d.b b(d.a arg1)
  {
    Object localObject5 = ???.dIN;
    if (localObject5 == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoMsgExtension", "onPreAddMessage cmdAM is null , give up.");
      return null;
    }
    String str1 = (String)com.tencent.mm.kernel.g.Ei().DT().get(2, "");
    Object localObject1 = com.tencent.mm.platformtools.ab.a(((by)localObject5).rck);
    Object localObject3 = com.tencent.mm.platformtools.ab.a(((by)localObject5).rcj);
    boolean bool;
    final Object localObject6;
    if ((((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FZ().has((String)localObject3)) || (str1.equals(localObject3)))
    {
      bool = true;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoMsgExtension", "video msg fromuser %s, toUser %s, userName %s, isSender %b", new Object[] { localObject3, localObject1, str1, Boolean.valueOf(bool) });
      localObject6 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY();
      if (!str1.equals(localObject3)) {
        break label357;
      }
    }
    label357:
    for (Object localObject4 = localObject1;; localObject4 = localObject3)
    {
      localObject4 = ((f)localObject6).I((String)localObject4, ((by)localObject5).rcq);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoMsgExtension", "dkmsgid prepareMsgInfo svrid:%d localid:%d, flag:%d, msgseq:%d, addMsgInfo[%s]", new Object[] { Long.valueOf(((by)localObject5).rcq), Long.valueOf(((cm)localObject4).field_msgId), Integer.valueOf(((cm)localObject4).field_flag), Long.valueOf(((cm)localObject4).field_msgSeq), ??? });
      if ((((cm)localObject4).field_msgId != 0L) && (((cm)localObject4).field_createTime + 604800000L < com.tencent.mm.model.bd.o((String)localObject3, ((by)localObject5).lOH)))
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VideoMsgExtension", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d localid:%d", new Object[] { Long.valueOf(((by)localObject5).rcq), Long.valueOf(((cm)localObject4).field_msgId) });
        com.tencent.mm.model.bd.aU(((cm)localObject4).field_msgId);
        ((com.tencent.mm.storage.bd)localObject4).setMsgId(0L);
      }
      if (((cm)localObject4).field_msgId == 0L) {
        break label364;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoMsgExtension", "Msgid:%d duplicate give up ", new Object[] { Long.valueOf(((by)localObject5).rcq) });
      return null;
      bool = false;
      break;
    }
    label364:
    final Object localObject7 = com.tencent.mm.platformtools.ab.a(((by)localObject5).rcl);
    localObject4 = new r();
    if (bool) {
      localObject3 = localObject1;
    }
    ((r)localObject4).bWJ = ((String)localObject3);
    ((r)localObject4).createTime = ((by)localObject5).lOH;
    ((r)localObject4).bYu = ((by)localObject5).rcq;
    ((r)localObject4).enS = ((by)localObject5).rcl.siM;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoMsgExtension", "parseVideoMsgXml [%s] msg Source[%s]", new Object[] { localObject7, ((by)localObject5).rco });
    Object localObject8 = bl.z((String)localObject7, "msg");
    if (localObject8 == null)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 216L, 1L, false);
      return null;
    }
    localObject3 = new com.tencent.mm.storage.bd();
    ((com.tencent.mm.storage.bd)localObject3).dt(((by)localObject5).rco);
    ((com.tencent.mm.storage.bd)localObject3).ev(com.tencent.mm.model.bd.iG(((by)localObject5).rco));
    for (;;)
    {
      int j;
      String str4;
      String str2;
      String str3;
      final int k;
      try
      {
        ((r)localObject4).dHI = bi.getInt((String)((Map)localObject8).get(".msg.videomsg.$length"), 0);
        ((r)localObject4).enM = bi.getInt((String)((Map)localObject8).get(".msg.videomsg.$playlength"), 0);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoMsgExtension", "video msg total len %d, video len %d", new Object[] { Integer.valueOf(((r)localObject4).dHI), Integer.valueOf(((r)localObject4).enM) });
        ((r)localObject4).enF = ((String)((Map)localObject8).get(".msg.videomsg.$fromusername"));
        if (str1.equals(((r)localObject4).Tk())) {
          ((r)localObject4).enF = ((String)localObject1);
        }
        ((r)localObject4).bZN = ((String)((Map)localObject8).get(".msg.statextstr"));
        localObject1 = (String)((Map)localObject8).get(".msg.videomsg.$cdnthumbaeskey");
        str1 = (String)((Map)localObject8).get(".msg.videomsg.$cdnthumburl");
        j = bi.getInt((String)((Map)localObject8).get(".msg.videomsg.$cdnthumblength"), 0);
        str4 = (String)((Map)localObject8).get(".msg.videomsg.$tpvideourl");
        localObject6 = (String)((Map)localObject8).get(".msg.videomsg.$tpthumburl");
        str2 = (String)((Map)localObject8).get(".msg.videomsg.$tpauthkey");
        str3 = (String)((Map)localObject8).get(".msg.videomsg.$tpthumbaeskey");
        k = bi.getInt((String)((Map)localObject8).get(".msg.videomsg.$tpthumblength"), 0);
        int m = bi.getInt((String)((Map)localObject8).get(".msg.videomsg.$type"), 0);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoMsgExtension", "video msg exportType :" + m);
        if (m != 44) {
          break label3080;
        }
        i = 1;
        ((r)localObject4).enQ = i;
        if (62 == ((by)localObject5).jQd)
        {
          ((r)localObject4).enT = 3;
          String str5 = bi.aG((String)((Map)localObject8).get(".msg.streamvideo.streamvideourl"), "");
          i = bi.getInt((String)((Map)localObject8).get(".msg.streamvideo.streamvideototaltime"), 0);
          String str6 = bi.aG((String)((Map)localObject8).get(".msg.streamvideo.streamvideotitle"), "");
          String str7 = bi.aG((String)((Map)localObject8).get(".msg.streamvideo.streamvideowording"), "");
          String str8 = bi.aG((String)((Map)localObject8).get(".msg.streamvideo.streamvideoweburl"), "");
          String str9 = bi.aG((String)((Map)localObject8).get(".msg.streamvideo.streamvideoaduxinfo"), "");
          String str10 = bi.aG((String)((Map)localObject8).get(".msg.streamvideo.streamvideopublishid"), "");
          if (((r)localObject4).enV == null) {
            ((r)localObject4).enV = new bri();
          }
          ((r)localObject4).enV.dyL = str6;
          ((r)localObject4).enV.rBq = i;
          ((r)localObject4).enV.dyJ = str5;
          ((r)localObject4).enV.dyM = str7;
          ((r)localObject4).enV.dyN = str8;
          ((r)localObject4).enV.dyP = str9;
          ((r)localObject4).enV.dyQ = str10;
          if (!((r)localObject4).Tk().equals((String)com.tencent.mm.kernel.g.Ei().DT().get(2, ""))) {
            break label1177;
          }
          return null;
        }
        if (m > 0)
        {
          ((r)localObject4).enT = 2;
          continue;
        }
        ((r)localObject4).enT = 1;
      }
      catch (Exception ???)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 216L, 1L, false);
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoMsgExtension", "parsing voice msg xml failed");
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoMsgExtension", "exception:%s", new Object[] { bi.i(???) });
        return null;
      }
      continue;
      label1177:
      localObject8 = (String)((Map)localObject8).get(".msg.commenturl");
      localObject7 = bl.z((String)localObject7, "msgoperation");
      if (localObject7 != null)
      {
        ((com.tencent.mm.storage.bd)localObject3).ew((String)((Map)localObject7).get(".msgoperation.expinfo.expidstr"));
        ((com.tencent.mm.storage.bd)localObject3).fk(bi.getInt((String)((Map)localObject7).get(".msgoperation.sightmsg.downloadcontroltype"), 0));
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoMsgExtension", "[chatting_exp] expidstr:%s, downloadcontroltype:%d", new Object[] { ((cm)localObject3).cGK, Integer.valueOf(((cm)localObject3).cGL) });
      }
      localObject7 = s.nJ(((r)localObject4).Tk());
      ((r)localObject4).fileName = ((String)localObject7);
      ((com.tencent.mm.storage.bd)localObject3).ax(((r)localObject4).bYu);
      ((com.tencent.mm.storage.bd)localObject3).eq(((r)localObject4).getFileName());
      ((com.tencent.mm.storage.bd)localObject3).ay(com.tencent.mm.model.bd.o(((r)localObject4).Tj(), ((r)localObject4).createTime));
      ((com.tencent.mm.storage.bd)localObject3).ep(((r)localObject4).Tj());
      ((com.tencent.mm.storage.bd)localObject3).setStatus(((by)localObject5).hcd);
      if (bool)
      {
        i = 1;
        ((com.tencent.mm.storage.bd)localObject3).eX(i);
        if (((by)localObject5).jQd != 62) {
          break label1487;
        }
        ((com.tencent.mm.storage.bd)localObject3).setType(62);
      }
      final long l1;
      for (;;)
      {
        ((com.tencent.mm.storage.bd)localObject3).setContent(p.b(((r)localObject4).Tk(), 0L, false));
        ((com.tencent.mm.storage.bd)localObject3).eu((String)localObject8);
        ((com.tencent.mm.storage.bd)localObject3).dt(((by)localObject5).rco);
        com.tencent.mm.model.bd.a((com.tencent.mm.storage.bd)localObject3, ???);
        l1 = com.tencent.mm.model.bd.i((com.tencent.mm.storage.bd)localObject3);
        if (l1 > 0L) {
          break label1497;
        }
        com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 215L, 1L, false);
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoMsgExtension", "onPreAddMessage insert msg failed local:%d svrid:%d", new Object[] { Long.valueOf(l1), Long.valueOf(((r)localObject4).bYu) });
        return null;
        i = 0;
        break;
        label1487:
        ((com.tencent.mm.storage.bd)localObject3).setType(43);
      }
      label1497:
      ((r)localObject4).enN = ((int)l1);
      ((r)localObject4).enK = bi.VE();
      ((r)localObject4).enO = 0;
      ((r)localObject4).status = 111;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoMsgExtension", "Insert fileName[" + ((r)localObject4).getFileName() + "] size:" + ((r)localObject4).dHI + " svrid:" + ((r)localObject4).bYu + " timelen:" + ((r)localObject4).enM + " user:" + ((r)localObject4).Tj() + " human:" + ((r)localObject4).Tk());
      if (!o.Ta().a((r)localObject4))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoMsgExtension", "Insert Error fileName:" + ((r)localObject4).getFileName());
        return null;
      }
      o.Ta();
      localObject7 = s.nL((String)localObject7);
      ??? = com.tencent.mm.platformtools.ab.a(((by)localObject5).rcn);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoMsgExtension", "imgBuf  :%d", new Object[] { Integer.valueOf(bi.bD(???)) });
      if (af.exs)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VideoMsgExtension", "Test.useCdnDownThumb  set img buf null !!!!!!!");
        ??? = null;
      }
      if (!bi.bC(???)) {
        s.a((String)localObject7, 0, ???);
      }
      for (;;)
      {
        if (((com.tencent.mm.storage.bd)localObject3).cmk())
        {
          com.tencent.mm.modelcontrol.c.NM();
          if (((cm)localObject3).cGL != 1) {
            break label2364;
          }
          i = 1;
          label1757:
          if (i != 0)
          {
            t.nS(((cm)localObject3).field_imgPath);
            com.tencent.mm.modelcdntran.g.ND().dPa.add("video_" + ((cm)localObject3).field_msgId);
          }
        }
        i = 1;
        j = 0;
        if (com.tencent.mm.model.s.fq(((r)localObject4).Tj()))
        {
          j = m.gK(((r)localObject4).Tj());
          if ((com.tencent.mm.model.s.hT(((r)localObject4).Tj())) || (!com.tencent.mm.model.s.hS(((r)localObject4).Tj()))) {
            i = 2;
          }
        }
        else
        {
          com.tencent.mm.plugin.report.service.h.mEJ.h(14388, new Object[] { Long.valueOf(((cm)localObject3).field_msgSvrId), Integer.valueOf(i), "", Integer.valueOf(j) });
          localObject1 = o.Tc();
        }
        synchronized (((i)localObject1).emG)
        {
          ((i)localObject1).emG.offerFirst(localObject3);
          ((i)localObject1).ST();
          return new d.b((com.tencent.mm.storage.bd)localObject3, true);
          final long l2;
          if (!bi.oW(str4))
          {
            l1 = ((r)localObject4).bYu;
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoMsgExtension", "getThumbByCdn msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", new Object[] { Long.valueOf(l1), ((r)localObject4).Tj(), localObject6, localObject7 });
            l2 = bi.VF();
            ??? = (String)localObject7 + ".tmp";
            localObject1 = new com.tencent.mm.modelcdntran.i();
            ((com.tencent.mm.modelcdntran.i)localObject1).field_mediaId = com.tencent.mm.modelcdntran.d.a("downvideothumb", ((r)localObject4).createTime, ((r)localObject4).Tj(), String.valueOf(l1));
            ((com.tencent.mm.modelcdntran.i)localObject1).field_fullpath = ???;
            ((com.tencent.mm.modelcdntran.i)localObject1).field_fileType = 19;
            ((com.tencent.mm.modelcdntran.i)localObject1).field_aesKey = str3;
            ((com.tencent.mm.modelcdntran.i)localObject1).field_authKey = str2;
            ((com.tencent.mm.modelcdntran.i)localObject1).dPW = ((String)localObject6);
            ((com.tencent.mm.modelcdntran.i)localObject1).dPV = new i.a()
            {
              public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
              {
                return u.a(paramAnonymousInt, paramAnonymouskeep_SceneResult, l1, localObject7, localObject6, k, parama, l2, this.dUQ);
              }
              
              public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream) {}
              
              public final byte[] i(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
              {
                return new byte[0];
              }
            };
            com.tencent.mm.modelcdntran.g.ND().b((com.tencent.mm.modelcdntran.i)localObject1, -1);
          }
          else
          {
            l1 = ((r)localObject4).bYu;
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoMsgExtension", "getThumbByCdn msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", new Object[] { Long.valueOf(l1), ((r)localObject4).Tj(), str1, localObject7 });
            l2 = bi.VF();
            ??? = (String)localObject7 + ".tmp";
            localObject5 = new com.tencent.mm.modelcdntran.i();
            ((com.tencent.mm.modelcdntran.i)localObject5).field_mediaId = com.tencent.mm.modelcdntran.d.a("downvideothumb", ((r)localObject4).createTime, ((r)localObject4).Tj(), String.valueOf(l1));
            ((com.tencent.mm.modelcdntran.i)localObject5).field_fullpath = ???;
            ((com.tencent.mm.modelcdntran.i)localObject5).field_fileType = com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE;
            ((com.tencent.mm.modelcdntran.i)localObject5).field_totalLen = j;
            ((com.tencent.mm.modelcdntran.i)localObject5).field_aesKey = ((String)localObject1);
            ((com.tencent.mm.modelcdntran.i)localObject5).field_fileId = str1;
            ((com.tencent.mm.modelcdntran.i)localObject5).field_priority = com.tencent.mm.modelcdntran.b.dOl;
            if (com.tencent.mm.model.s.fq(((r)localObject4).Tj())) {}
            for (i = 1;; i = 0)
            {
              ((com.tencent.mm.modelcdntran.i)localObject5).field_chattype = i;
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoMsgExtension", "get thumb by cdn [video] chatType[%d] user[%s] ", new Object[] { Integer.valueOf(((com.tencent.mm.modelcdntran.i)localObject5).field_chattype), ((r)localObject4).Tj() });
              ((com.tencent.mm.modelcdntran.i)localObject5).dPV = new u.2(this, l1, (r)localObject4, (String)localObject7, str1, j, ???, l2);
              com.tencent.mm.modelcdntran.g.ND().b((com.tencent.mm.modelcdntran.i)localObject5, -1);
              break;
            }
            label2364:
            if (((cm)localObject3).cGL == 2)
            {
              i = 0;
              break label1757;
            }
            if (!com.tencent.mm.modelcontrol.c.p((com.tencent.mm.storage.bd)localObject3))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "this message need control, do not auto download C2C short video.");
              i = 0;
              break label1757;
            }
            ??? = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("C2CSightNotAutoDownloadTimeRange");
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BusyTimeControlLogic", "C2CSightNotAutoDownloadTimeRange value: " + ???);
            if (com.tencent.mm.modelcontrol.b.lz(???))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "it is busy time now , do not auto download C2C short video.");
              i = 0;
              break label1757;
            }
            ??? = ((cm)localObject3).field_talker;
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SubCoreAutoDownload", "isC2CSightAutoDownload msg talker: " + ???);
            i = bi.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("SIGHTSessionAutoLoadNetwork"), 1);
            if (i == 3)
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "setting is not download sight automate, %d, %d", new Object[] { Long.valueOf(((cm)localObject3).field_msgId), Long.valueOf(((cm)localObject3).field_msgSvrId) });
              i = 0;
              break label1757;
            }
            if (ao.isWifi(ad.getContext()))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "match wifi, do auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((cm)localObject3).field_msgId), Long.valueOf(((cm)localObject3).field_msgSvrId), ((cm)localObject3).field_imgPath });
              localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(???);
              if ((localObject1 != null) && ((int)((com.tencent.mm.l.a)localObject1).dhP > 0) && (((???.endsWith("@chatroom")) && (((ai)localObject1).csI == 0)) || (((com.tencent.mm.storage.ab)localObject1).BD()))) {
                break label3054;
              }
              i = 1;
              break label1757;
            }
            if (ao.is2G(ad.getContext()))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "match edge, do not auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((cm)localObject3).field_msgId), Long.valueOf(((cm)localObject3).field_msgSvrId), ((cm)localObject3).field_imgPath });
              i = 0;
              break label1757;
            }
            ??? = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(((cm)localObject3).field_talker);
            if (com.tencent.mm.model.s.fq(((cm)localObject3).field_talker))
            {
              if (???.csI == 0)
              {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "match muted chatroom and not wifi, do not auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((cm)localObject3).field_msgId), Long.valueOf(((cm)localObject3).field_msgSvrId), ((cm)localObject3).field_imgPath });
                i = 0;
                break label1757;
              }
              if (((ao.is3G(ad.getContext())) || (ao.is4G(ad.getContext()))) && (i == 1))
              {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "match 3G/4G and unmuted chatroom, do auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((cm)localObject3).field_msgId), Long.valueOf(((cm)localObject3).field_msgSvrId), ((cm)localObject3).field_imgPath });
                i = 1;
                break label1757;
              }
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "unknown auto download short video step A");
              i = 0;
              break label1757;
            }
            if (???.BD())
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "match muted and not wifi, do not auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((cm)localObject3).field_msgId), Long.valueOf(((cm)localObject3).field_msgSvrId), ((cm)localObject3).field_imgPath });
              i = 0;
              break label1757;
            }
            if (((ao.is3G(ad.getContext())) || (ao.is4G(ad.getContext()))) && (i == 1))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "match 3G/4G and unmuted, do auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((cm)localObject3).field_msgId), Long.valueOf(((cm)localObject3).field_msgSvrId), ((cm)localObject3).field_imgPath });
              i = 1;
              break label1757;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "unknown auto download short video step B");
            i = 0;
            break label1757;
            label3054:
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "default can not auto download C2C short video.");
            i = 0;
            break label1757;
            i = 3;
          }
        }
      }
      label3080:
      int i = 0;
    }
  }
  
  public final void h(com.tencent.mm.storage.bd parambd)
  {
    int i = 1;
    if (parambd == null) {}
    for (;;)
    {
      return;
      parambd = parambd.field_imgPath;
      if (!bi.oW(parambd))
      {
        s locals = o.Ta();
        if (locals.dCZ.delete("videoinfo2", "filename= ?", new String[] { parambd }) > 0)
        {
          s.a.a locala = new s.a.a(parambd, s.a.b.eog, s.a.c.eoj, 1, -1L);
          locals.dHn.ci(locala);
          locals.dHn.doNotify();
        }
        while (i != 0)
        {
          try
          {
            o.Ta();
            new File(s.nL(parambd)).delete();
            o.Ta();
            new File(s.nK(parambd)).delete();
            return;
          }
          catch (Exception localException)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "ERR: Delete file Failed" + com.tencent.mm.compatible.util.g.Ac() + " file:" + parambd + " msg:" + localException.getMessage());
            return;
          }
          i = 0;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelvideo/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */