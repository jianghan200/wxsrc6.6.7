package com.tencent.mm.modelcdntran;

import android.os.Looper;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.jb;
import com.tencent.mm.network.n;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

public final class c
  implements com.tencent.mm.ab.e, b.b, m.b
{
  private int dOQ = -1;
  ag dOR = new c.1(this, Looper.getMainLooper());
  com.tencent.mm.sdk.b.c<jb> dOS = new c.2(this);
  n dOT = new c.3(this);
  Queue<String> dOU = new LinkedList();
  public Map<String, i> dOV = new HashMap();
  public Map<String, i> dOW = new ConcurrentHashMap();
  public Map<String, Integer> dOX = new HashMap();
  private String dOY = "";
  private long dOZ = 0L;
  public HashSet<String> dPa = new HashSet();
  
  public c()
  {
    com.tencent.mm.kernel.g.Eh().a(this.dOT);
    if (com.tencent.mm.kernel.g.Eg().Dx()) {
      com.tencent.mm.kernel.g.Ei().DT().a(this);
    }
    com.tencent.mm.kernel.g.DF().a(379, this);
    com.tencent.mm.sdk.b.a.sFg.b(this.dOS);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CdnTransportService", "summersafecdn CdnTransportService init[%s] stack[%s]", new Object[] { Integer.valueOf(hashCode()), bi.cjd() });
  }
  
  public static boolean hz(int paramInt)
  {
    com.tencent.mm.kernel.g.Eg();
    if (com.tencent.mm.kernel.a.Dw())
    {
      int i = bi.a((Integer)com.tencent.mm.kernel.g.Ei().DT().get(144385, null), 0);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CdnTransportService", "summersafecdn cdntra cdnBitSet:%d grayScaleFlag:%d res:%d Test.forceCDNTrans:%b", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(i & paramInt), Boolean.valueOf(af.exg) });
      if (af.exg) {
        return true;
      }
      return (i & paramInt) > 0;
    }
    return true;
  }
  
  public final void Ny()
  {
    com.tencent.mm.kernel.g.Eg();
    b.c localc;
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    String str9;
    if (com.tencent.mm.kernel.a.Dw())
    {
      localc = new b.c(g.NE());
      str1 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("EnableCDNUploadImg");
      str2 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("EnableCDNVerifyConnect");
      str3 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("EnableCDNVideoRedirectOC");
      str4 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("EnableStreamUploadVideo");
      str5 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("C2COverloadDelaySeconds");
      str6 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("SNSOverloadDelaySeconds");
      str7 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("EnableSnsStreamDownload");
      str8 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("EnableSnsImageDownload");
      str9 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("ApprovedVideoPrivateProtocolHosts");
    }
    for (;;)
    {
      try
      {
        if (!bi.oW(str1)) {
          localc.field_UseStreamCDN = Integer.valueOf(str1).intValue();
        }
        if (!bi.oW(str2)) {
          localc.field_EnableCDNVerifyConnect = Integer.valueOf(str2).intValue();
        }
        if (!bi.oW(str3)) {
          localc.field_EnableCDNVideoRedirectOC = Integer.valueOf(str3).intValue();
        }
        if (!bi.oW(str4)) {
          localc.field_EnableStreamUploadVideo = Integer.valueOf(str4).intValue();
        }
        if (!bi.oW(str5)) {
          localc.field_C2COverloadDelaySeconds = Integer.valueOf(str5).intValue();
        }
        if (!bi.oW(str6)) {
          localc.field_SNSOverloadDelaySeconds = Integer.valueOf(str6).intValue();
        }
        if (!bi.oW(str7)) {
          localc.field_EnableSnsStreamDownload = Integer.valueOf(str7).intValue();
        }
        if (!bi.oW(str8)) {
          localc.field_EnableSnsImageDownload = Integer.valueOf(str8).intValue();
        }
        if (!bi.oW(str9)) {
          localc.field_ApprovedVideoHosts = str9;
        }
        g.ND();
        if (!hz(256)) {
          continue;
        }
        i = 1;
        localc.field_EnableSafeCDN = i;
        if (localc.field_UseStreamCDN != 0)
        {
          str1 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("ProgJPEGUploadSizeLimitWifi");
          str2 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("ProgJPEGUploadSizeLimit3G");
          str3 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("ProgJPEGDownloadSizeLimit");
          str4 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("ProgJPEGOnlyRecvPTL");
          str5 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("EnableJPEGDyncmicETL");
          if (!bi.oW(str1)) {
            localc.field_WifiEtl = Integer.valueOf(str1).intValue();
          }
          if (!bi.oW(str2)) {
            localc.field_noWifiEtl = Integer.valueOf(str2).intValue();
          }
          if (!bi.oW(str3)) {
            localc.field_Ptl = Integer.valueOf(str3).intValue();
          }
          if (!bi.oW(str4))
          {
            if (Integer.valueOf(str4).intValue() == 0) {
              continue;
            }
            bool = true;
            localc.field_onlyrecvPtl = bool;
          }
          if (!bi.oW(str5)) {
            localc.field_UseDynamicETL = Integer.valueOf(str5).intValue();
          }
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CdnTransportService", "summersafecdn streamcdn config[SVR]:%s", new Object[] { localc });
        if (this.dOQ != -1)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.CdnTransportService", "cmd set snsimage flag: %d", new Object[] { Integer.valueOf(this.dOQ) });
          localc.field_EnableSnsImageDownload = this.dOQ;
        }
        g.NE();
        b.a(localc);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        boolean bool;
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CdnTransportService", localNumberFormatException.toString());
        continue;
        int i = 0;
        continue;
        i = 0;
        continue;
        i = 0;
        continue;
      }
      if (af.exF)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.CdnTransportService", "use cdn debug configure.");
        if (!af.exB) {
          continue;
        }
        i = 1;
        localc.field_UseStreamCDN = i;
        if (localc.field_UseStreamCDN != 0)
        {
          localc.field_onlysendETL = af.exC;
          localc.field_onlyrecvPtl = af.exD;
          if (!bi.oW(af.exy)) {
            localc.field_WifiEtl = Integer.valueOf(af.exy).intValue();
          }
          if (!bi.oW(af.exz)) {
            localc.field_noWifiEtl = Integer.valueOf(af.exz).intValue();
          }
          if (!bi.oW(af.exA)) {
            localc.field_Ptl = Integer.valueOf(af.exA).intValue();
          }
        }
        if (!af.exG) {
          continue;
        }
        i = 1;
        localc.field_EnableCDNVerifyConnect = i;
        if (!af.exH) {
          continue;
        }
        i = 1;
        localc.field_EnableCDNVideoRedirectOC = i;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CdnTransportService", "streamcdn config[DEBUG]:%s", new Object[] { localc });
        g.NE();
        b.a(localc);
      }
      return;
      i = 0;
      continue;
      bool = false;
    }
  }
  
  public final int a(String paramString, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult)
  {
    if (bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CdnTransportService", "cdn callback mediaid is null");
      return -1;
    }
    if ((paramkeep_ProgressInfo == null) && (paramkeep_SceneResult == null))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CdnTransportService", "cdn callback info all null");
      return -2;
    }
    if (paramkeep_ProgressInfo != null) {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CdnTransportService", "CDN progress. total:%d, cur:%d, canshow:%b", new Object[] { Integer.valueOf(paramkeep_ProgressInfo.field_toltalLength), Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength), Boolean.valueOf(paramkeep_ProgressInfo.field_mtlnotify) });
    }
    this.dOZ = bi.VF();
    this.dOY = paramString;
    com.tencent.mm.kernel.g.Em().H(new c.7(this, paramString, paramkeep_ProgressInfo, paramkeep_SceneResult));
    return 0;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (paraml.getType() != 379) {}
    do
    {
      return;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CdnTransportService", "cdntra onSceneEnd it will tryStart sceneType:%d [%d,%d]", new Object[] { Integer.valueOf(paraml.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    } while (!com.tencent.mm.kernel.g.Eg().Dx());
    com.tencent.mm.kernel.g.Em().H(new c.4(this));
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {}
    int i;
    do
    {
      return;
      i = bi.p(paramObject, 0);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CdnTransportService", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
      if ((paramm != com.tencent.mm.kernel.g.Ei().DT()) || (i <= 0))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CdnTransportService", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
        return;
      }
    } while (i != 144385);
    g.NA().NF();
  }
  
  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    if (bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CdnTransportService", "cdn callback getauthbuf mediaid is null");
      return;
    }
    i locali = (i)this.dOW.get(paramString);
    if (locali == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CdnTransportService", " getauthbuf task in jni get info failed mediaid:%s", new Object[] { paramString });
      return;
    }
    if (locali.dPV != null)
    {
      locali.dPV.a(paramString, paramByteArrayOutputStream);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CdnTransportService", "getCdnAuthInfo fail, null taskcallback.");
  }
  
  public final void b(String paramString, keep_SceneResult paramkeep_SceneResult)
  {
    if (bi.oW(paramString)) {
      return;
    }
    com.tencent.mm.kernel.g.Em().H(new c.8(this, paramString, paramkeep_SceneResult));
  }
  
  public final boolean b(i parami, int paramInt)
  {
    if (parami == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CdnTransportService", "addRecvTask task info is null");
      return false;
    }
    if (bi.oW(parami.field_mediaId))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CdnTransportService", "addRecvTask mediaId is null");
      return false;
    }
    if (parami.field_fileId == null) {
      parami.field_fileId = "";
    }
    if (parami.field_aesKey == null) {
      parami.field_aesKey = "";
    }
    parami.ceW = false;
    com.tencent.mm.kernel.g.Em().H(new c.5(this, paramInt, parami));
    return true;
  }
  
  public final void bH(boolean paramBoolean)
  {
    if ((!paramBoolean) && (g.NE().Nx()))
    {
      com.tencent.mm.kernel.g.Eg();
      if (com.tencent.mm.kernel.a.Dw())
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.CdnTransportService", "summersafecdn cdntra Not init cdn dnsinfo , will retry after set info");
        g.NA().NF();
        return;
      }
    }
    Ny();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CdnTransportService", "summersafecdn tryStart queue:%d", new Object[] { Integer.valueOf(this.dOU.size()) });
    label69:
    Object localObject1;
    Object localObject3;
    int i;
    label193:
    int j;
    label203:
    Object localObject2;
    if (!this.dOU.isEmpty())
    {
      localObject1 = (String)this.dOU.poll();
      localObject3 = (i)this.dOV.remove(localObject1);
      if (localObject3 == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CdnTransportService", "summersafecdn task queue is empty , maybe bug here");
        return;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CdnTransportService", "summersafecdn id:%s cdnautostart :%s chatroom:%s", new Object[] { ((i)localObject3).field_mediaId, Boolean.valueOf(((i)localObject3).field_autostart), Integer.valueOf(((i)localObject3).field_chattype) });
      ((i)localObject3).field_startTime = bi.VF();
      if (((i)localObject3).ceW)
      {
        String str;
        if (((i)localObject3).field_fullpath == null)
        {
          i = -1;
          if (((i)localObject3).field_thumbpath != null) {
            break label563;
          }
          j = -1;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CdnTransportService", "summersafecdn tryStart send file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b] largesvideo[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), bi.Xf(((i)localObject3).field_svr_signature), bi.Xf(((i)localObject3).field_aesKey), Integer.valueOf(((i)localObject3).field_fileType), ((i)localObject3).field_mediaId, Boolean.valueOf(((i)localObject3).field_onlycheckexist), Integer.valueOf(((i)localObject3).field_largesvideo) });
          if (((i)localObject3).field_fullpath == null) {
            ((i)localObject3).field_fullpath = "";
          }
          if (((i)localObject3).field_thumbpath == null) {
            ((i)localObject3).field_thumbpath = "";
          }
          localObject1 = (i)this.dOW.put(((i)localObject3).field_mediaId, localObject3);
          localObject2 = (i)this.dOW.get(((i)localObject3).field_mediaId);
          if (localObject2 == null) {
            com.tencent.mm.plugin.report.service.h.mEJ.a(594L, 5L, 1L, true);
          }
          g.NE();
          i = b.b((i)localObject3);
          str = ((i)localObject3).field_mediaId;
          if (localObject1 != null) {
            break label575;
          }
          localObject1 = null;
          label409:
          if (localObject2 != null) {
            break label585;
          }
        }
        label563:
        label575:
        label585:
        for (localObject2 = null;; localObject2 = ((i)localObject2).field_mediaId)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CdnTransportService", "summersafecdn startupUploadMedia ok, field_mediaId[%s] ret[%s, %s, %s] hash[%s]", new Object[] { str, Integer.valueOf(i), localObject1, localObject2, Integer.valueOf(hashCode()) });
          if (i == 0) {
            break;
          }
          localObject1 = (i)this.dOW.remove(((i)localObject3).field_mediaId);
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CdnTransportService", "summersafecdn startupUploadMedia error:%d clientid:%s remove[%s]", new Object[] { Integer.valueOf(i), ((i)localObject3).field_mediaId, localObject1 });
          if (((i)localObject3).dPV == null) {
            break;
          }
          ((i)localObject3).dPV.a(((i)localObject3).field_mediaId, i, null, null, ((i)localObject3).field_onlycheckexist);
          break;
          i = ((i)localObject3).field_fullpath.length();
          break label193;
          j = ((i)localObject3).field_thumbpath.length();
          break label203;
          localObject1 = ((i)localObject1).field_mediaId;
          break label409;
        }
      }
      i = -1;
      if (((i)localObject3).field_fileType == 19)
      {
        g.NE();
        i = b.a(((i)localObject3).field_mediaId, ((i)localObject3).dPW, ((i)localObject3).field_fullpath, ((i)localObject3).field_fileType, ((i)localObject3).field_aesKey, ((i)localObject3).field_authKey);
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CdnTransportService", "summersafecdn startupDownloadMedia error:%d clientid:%s", new Object[] { Integer.valueOf(i), ((i)localObject3).field_mediaId });
        if (((i)localObject3).dPV == null) {
          break label69;
        }
        ((i)localObject3).dPV.a(((i)localObject3).field_mediaId, i, null, null, ((i)localObject3).field_onlycheckexist);
        break label69;
        if ((((i)localObject3).field_fileType == b.dOw) || (((i)localObject3).field_fileType == b.dOy))
        {
          j = i;
          if (((i)localObject3).field_fullpath != null)
          {
            j = i;
            if (!((i)localObject3).field_fullpath.isEmpty())
            {
              g.NE();
              j = b.a(((i)localObject3).field_mediaId, ((i)localObject3).dPW, ((i)localObject3).field_fullpath, ((i)localObject3).field_fileType, ((i)localObject3).dPX, ((i)localObject3).dPY, ((i)localObject3).dPZ, ((i)localObject3).dQa);
            }
          }
          if (((i)localObject3).field_fullpath == null) {}
          for (i = -1;; i = ((i)localObject3).field_fullpath.length())
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CdnTransportService", "url download tryStart recv file:%d field_mediaId[%s], download_url[%s], filetype:[%d]", new Object[] { Integer.valueOf(i), ((i)localObject3).field_mediaId, ((i)localObject3).dPW, Integer.valueOf(((i)localObject3).field_fileType) });
            i = j;
            break;
          }
        }
        if (((i)localObject3).dQc)
        {
          j = i;
          if (((i)localObject3).field_fullpath != null)
          {
            j = i;
            if (!((i)localObject3).field_fullpath.isEmpty())
            {
              g.NE();
              j = b.a(((i)localObject3).field_mediaId, ((i)localObject3).field_fullpath, ((i)localObject3).dPW, ((i)localObject3).dQd, ((i)localObject3).dQe, ((i)localObject3).allow_mobile_net_download, ((i)localObject3).dPX, ((i)localObject3).dPY, ((i)localObject3).is_resume_task, ((i)localObject3).dQb, ((i)localObject3).dPZ);
            }
          }
          if (((i)localObject3).field_fullpath == null) {}
          for (i = -1;; i = ((i)localObject3).field_fullpath.length())
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CdnTransportService", "game package download tryStart recv file:%d field_mediaId[%s], download_url[%s] https url[%s]", new Object[] { Integer.valueOf(i), ((i)localObject3).field_mediaId, ((i)localObject3).dPW, ((i)localObject3).dQd });
            i = j;
            break;
          }
        }
        if (((i)localObject3).dQf)
        {
          if (!(localObject3 instanceof h)) {
            break label1615;
          }
          localObject1 = (h)localObject3;
          g.NE();
          i = b.a(((h)localObject1).field_mediaId, ((h)localObject1).url, ((h)localObject1).referer, ((h)localObject1).dPP, ((h)localObject1).dPQ, ((h)localObject1).dPR, ((h)localObject1).dPS, ((h)localObject1).dPT, ((h)localObject1).isColdSnsData, ((h)localObject1).signalQuality, ((h)localObject1).snsScene, ((h)localObject1).snsCipherKey, ((h)localObject1).csS, ((h)localObject1).dPU, ((h)localObject1).fileType);
          continue;
        }
        if (((i)localObject3).field_fullpath == null)
        {
          j = -1;
          label1160:
          if (((i)localObject3).field_thumbpath != null) {
            break label1304;
          }
        }
        label1304:
        for (int k = -1;; k = ((i)localObject3).field_thumbpath.length())
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CdnTransportService", "summersafecdn tryStart recv file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), ((i)localObject3).field_svr_signature, ((i)localObject3).field_aesKey, Integer.valueOf(((i)localObject3).field_fileType), ((i)localObject3).field_mediaId, Boolean.valueOf(((i)localObject3).field_onlycheckexist) });
          if (((i)localObject3).dQg != 2) {
            break label1450;
          }
          if (!(localObject3 instanceof j)) {
            break label1615;
          }
          localObject1 = (j)localObject3;
          if (!((j)localObject1).NI()) {
            break label1317;
          }
          g.NE();
          i = b.a((i)localObject3, 2);
          break;
          j = ((i)localObject3).field_fullpath.length();
          break label1160;
        }
        label1317:
        if (((j)localObject1).NG())
        {
          g.NE();
          i = b.a(((j)localObject1).field_mediaId, ((j)localObject1).url, ((j)localObject1).referer, ((j)localObject1).field_fullpath, ((j)localObject1).dQm, ((j)localObject1).dPQ, ((j)localObject1).initialDownloadOffset, ((j)localObject1).initialDownloadLength, ((j)localObject1).isColdSnsData, ((j)localObject1).signalQuality, ((j)localObject1).snsScene, ((j)localObject1).field_preloadRatio);
          continue;
        }
        if (((j)localObject1).NH())
        {
          g.NE();
          i = b.a(((j)localObject1).field_mediaId, ((j)localObject1).url, ((j)localObject1).referer, ((j)localObject1).field_fullpath, ((j)localObject1).dQm, ((j)localObject1).field_preloadRatio, ((j)localObject1).concurrentCount);
        }
        continue;
        label1450:
        g.NE();
        i = CdnLogic.startC2CDownload(b.a((i)localObject3));
        continue;
      }
      localObject1 = (i)this.dOW.put(((i)localObject3).field_mediaId, localObject3);
      localObject2 = (i)this.dOW.get(((i)localObject3).field_mediaId);
      if (localObject2 == null) {
        com.tencent.mm.plugin.report.service.h.mEJ.a(594L, 6L, 1L, true);
      }
      localObject3 = ((i)localObject3).field_mediaId;
      if (localObject1 == null)
      {
        localObject1 = null;
        label1540:
        if (localObject2 != null) {
          break label1605;
        }
      }
      label1605:
      for (localObject2 = null;; localObject2 = ((i)localObject2).field_mediaId)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CdnTransportService", "summersafecdn startupDownloadMedia ok, field_mediaId[%s] ret[%s, %s, %s] hash[%s]", new Object[] { localObject3, Integer.valueOf(i), localObject1, localObject2, Integer.valueOf(hashCode()) });
        break label69;
        break;
        localObject1 = ((i)localObject1).field_mediaId;
        break label1540;
      }
      label1615:
      i = -1;
    }
  }
  
  public final boolean c(i parami)
  {
    if (bi.oW(parami.field_mediaId))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CdnTransportService", "summersafecdn addSendTask mediaId is null");
      return false;
    }
    if (parami.field_fileId == null) {
      parami.field_fileId = "";
    }
    if (parami.field_aesKey == null) {
      parami.field_aesKey = "";
    }
    parami.ceW = true;
    com.tencent.mm.kernel.g.Em().H(new c.6(this, parami));
    return true;
  }
  
  public final void hA(int paramInt)
  {
    this.dOQ = paramInt;
  }
  
  public final byte[] i(String paramString, byte[] paramArrayOfByte)
  {
    if (bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CdnTransportService", "cdn callback decodePrepareResponse mediaid is null");
      return null;
    }
    i locali = (i)this.dOW.get(paramString);
    if (locali == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CdnTransportService", " decodePrepareResponse task in jni get info failed mediaid:%s", new Object[] { paramString });
      return null;
    }
    if (locali.dPV != null) {
      return locali.dPV.i(paramString, paramArrayOfByte);
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CdnTransportService", "decodePrepareResponse fail, null taskcallback.");
    return null;
  }
  
  public final boolean lw(String paramString)
  {
    i locali = (i)this.dOW.remove(paramString);
    if (locali != null)
    {
      g.NE();
      b.lo(paramString);
      com.tencent.mm.plugin.report.service.h.mEJ.h(10769, new Object[] { Integer.valueOf(d.dPr), Integer.valueOf(locali.field_fileType), Long.valueOf(bi.VF() - locali.field_startTime) });
    }
    this.dOV.remove(paramString);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelSendTask mediaid:%s mapremove:%s engine ret:%d", new Object[] { paramString, locali, Integer.valueOf(0) });
    return true;
  }
  
  public final boolean lx(String paramString)
  {
    i locali = (i)this.dOW.remove(paramString);
    if (locali != null)
    {
      if ((locali.field_fileType != b.dOw) && (locali.field_fileType != b.dOy)) {
        break label144;
      }
      g.NE();
      b.lt(paramString);
    }
    for (;;)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.h(10769, new Object[] { Integer.valueOf(d.dPq), Integer.valueOf(locali.field_fileType), Long.valueOf(bi.VF() - locali.field_startTime) });
      this.dOV.remove(paramString);
      this.dOX.remove(paramString);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", new Object[] { paramString, locali, Integer.valueOf(0) });
      return true;
      label144:
      if (locali.dQc)
      {
        g.NE();
        b.lu(paramString);
      }
      else
      {
        g.NE();
        b.lp(paramString);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelcdntran/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */