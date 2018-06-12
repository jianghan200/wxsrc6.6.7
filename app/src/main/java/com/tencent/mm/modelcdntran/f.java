package com.tencent.mm.modelcdntran;

import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.jk;
import com.tencent.mm.g.a.la;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.c;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.av;
import com.tencent.mm.storage.bc;
import com.tencent.mm.storage.bd;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class f
  implements com.tencent.mm.ab.e, b.a
{
  Queue<String> dOU = new LinkedList();
  Map<String, j> dOV = new HashMap();
  Map<String, j> dOW = new HashMap();
  Map<String, j> dPA = new HashMap();
  Map<String, keep_SceneResult> dPB = new HashMap();
  
  public f()
  {
    com.tencent.mm.kernel.g.DF().a(379, this);
  }
  
  public static j a(av paramav, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    if (paramav == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.OnlineVideoService", "check can sns online video, scene is null.");
      return null;
    }
    if (bi.oW(paramString1))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.OnlineVideoService", "check can sns online video, url is null.");
      return null;
    }
    Object localObject = t.nW(paramString3);
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.OnlineVideoService", "check can sns online video, video info is null. %s", new Object[] { paramString3 });
      return null;
    }
    String str = d.a("snsvideo", paramav.time, "sns", paramString1);
    if (bi.oW(str))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.OnlineVideoService", "check can http online video, can not create media id. url %s ", new Object[] { paramString1 });
      return null;
    }
    j localj = new j();
    localj.filename = paramString3;
    localj.field_fullpath = paramString2;
    localj.field_mediaId = str;
    localj.dQh = 2;
    localj.dQm = paramInt;
    localj.dQo = ((r)localObject).dQo;
    if (paramav == null) {
      paramString2 = "";
    }
    for (;;)
    {
      paramInt = com.tencent.mm.protocal.d.qVN;
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eg();
      localObject = com.tencent.mm.a.o.getString(com.tencent.mm.kernel.a.Df());
      int i = ao.getNetTypeForStat(ad.getContext());
      int j = ao.getStrength(ad.getContext());
      label216:
      long l1;
      if (!bi.oW(paramString2))
      {
        paramString3 = "&scene=" + paramString2;
        localj.referer = String.format("http://weixin.qq.com/?version=%d&uin=%s&nettype=%d&signal=%d%s", new Object[] { Integer.valueOf(paramInt), localObject, Integer.valueOf(i), Integer.valueOf(j), paramString3 });
        localj.url = paramString1;
        paramString1 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("SnsSightDomainList");
        long l2 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getInt("SnsSightMainStandbyIpSwitchTime", 0);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoService", "hostvalue %s dcipTime %s scene.time[%d]", new Object[] { paramString1, Long.valueOf(l2), Integer.valueOf(paramav.time) });
        l1 = l2;
        if (l2 <= 0L) {
          l1 = 259200L;
        }
      }
      for (boolean bool = a(paramav, localj.url, l1, paramString1);; bool = false)
      {
        try
        {
          localj.host = new URL(localj.url).getHost();
          paramString1 = new ArrayList();
          com.tencent.mm.network.b.a(bool, paramString1, localj.host);
          localj.dPQ = new String[paramString1.size()];
          paramString1.toArray(localj.dPQ);
          if (bi.bG(paramav.time) <= l1) {
            continue;
          }
          bool = true;
          localj.isColdSnsData = bool;
          localj.signalQuality = ao.getStrength(ad.getContext());
          localj.snsScene = paramString2;
          return localj;
        }
        catch (Exception paramav)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.OnlineVideoService", paramav, "check can sns online video error taskInfo %s", new Object[] { localj });
          return null;
        }
        if (paramav.equals(av.tbn))
        {
          paramString2 = "album_friend";
          break;
        }
        if (paramav.equals(av.tbo))
        {
          paramString2 = "album_self";
          break;
        }
        if (paramav.equals(av.tbp))
        {
          paramString2 = "album_stranger";
          break;
        }
        if (paramav.equals(av.tbq))
        {
          paramString2 = "profile_friend";
          break;
        }
        if (paramav.equals(av.tbr))
        {
          paramString2 = "profile_stranger";
          break;
        }
        if (paramav.equals(av.tbs))
        {
          paramString2 = "comment";
          break;
        }
        if (paramav.equals(av.tbm))
        {
          paramString2 = "timeline";
          break;
        }
        if (!paramav.equals(av.tbv)) {
          break label665;
        }
        paramString2 = "snssight";
        break;
        paramString3 = "";
        break label216;
      }
      label665:
      paramString2 = "";
    }
  }
  
  static void a(r paramr, int paramInt, String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoService", "download finish. totalLen %d ", new Object[] { Integer.valueOf(paramInt) });
    if (paramr != null)
    {
      t.U(paramr.getFileName(), paramInt);
      paramr = paramr.getFileName();
      if (!bi.oW(paramString))
      {
        com.tencent.mm.modelvideo.o.Ta();
        paramr = com.tencent.mm.modelvideo.s.nK(paramr);
        if ((!bi.oW(paramString)) && (paramInt > 0) && (!bi.oW(paramr))) {
          break label99;
        }
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.OnlineVideoService", "insert media duplication but args is error.[%d, %s, %s]", new Object[] { Integer.valueOf(paramInt), paramString, paramr });
      }
    }
    return;
    label99:
    ((com.tencent.mm.plugin.t.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.t.a.a.class)).FY().y(paramString, paramInt, paramr);
  }
  
  public static void a(Object[] paramArrayOfObject, keep_SceneResult paramkeep_SceneResult, j paramj, boolean paramBoolean)
  {
    if ((paramj == null) || (paramkeep_SceneResult == null))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.OnlineVideoService", "video task info is null or download result is null.");
      break label16;
    }
    label16:
    while ((!paramj.NG()) && (!paramj.NI())) {
      return;
    }
    String str1 = paramkeep_SceneResult.field_clientIP;
    int k;
    label47:
    Object localObject1;
    Object localObject2;
    label181:
    label202:
    boolean bool;
    int i9;
    int i8;
    int i5;
    int i4;
    int i3;
    int i2;
    int i1;
    int n;
    int m;
    if (paramkeep_SceneResult.field_isCrossNet)
    {
      k = 1;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoService", "rpt online video format[%d] clientIp[%s] isCrossNet[%d]", new Object[] { Integer.valueOf(paramkeep_SceneResult.field_videoFormat), str1, Integer.valueOf(k) });
      if (paramkeep_SceneResult.field_videoFormat == 2)
      {
        localObject1 = paramj.filename;
        localObject2 = t.nW((String)localObject1);
        if (localObject2 != null)
        {
          ((r)localObject2).videoFormat = 2;
          ((r)localObject2).bWA = 2;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "set VideoFormat ret[%b] filename[%s] format[%d]", new Object[] { Boolean.valueOf(com.tencent.mm.modelvideo.o.Ta().b((r)localObject2)), localObject1, Integer.valueOf(2) });
        }
      }
      if (!bi.oW(str1)) {
        break label1680;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 45L, 1L, false);
      if (!paramkeep_SceneResult.field_isCrossNet) {
        break label1697;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 47L, 1L, false);
      bool = paramj.NI();
      localObject1 = new PInt();
      localObject2 = new PInt();
      ((PInt)localObject2).value = 0;
      ((PInt)localObject1).value = 0;
      t.a(paramj.field_fullpath, (PInt)localObject1, (PInt)localObject2);
      i9 = ((PInt)localObject1).value;
      i8 = ((PInt)localObject2).value;
      if (paramArrayOfObject == null) {
        break label2012;
      }
      i5 = ((Integer)paramArrayOfObject[0]).intValue() * 1000;
      i4 = ((Integer)paramArrayOfObject[1]).intValue();
      i3 = ((Integer)paramArrayOfObject[2]).intValue();
      i2 = ((Integer)paramArrayOfObject[3]).intValue();
      i1 = ((Integer)paramArrayOfObject[4]).intValue();
      n = ((Integer)paramArrayOfObject[5]).intValue();
      m = ((Integer)paramArrayOfObject[6]).intValue();
    }
    for (;;)
    {
      int j = paramj.dQo;
      int i = j;
      label374:
      int i10;
      String str2;
      int i11;
      int i6;
      if (j <= 0)
      {
        if (bool) {
          i = 10;
        }
      }
      else
      {
        i10 = ao.fI(ad.getContext());
        str2 = paramkeep_SceneResult.getRptIpList();
        localObject1 = new PInt();
        localObject2 = new PInt();
        paramArrayOfObject = paramj.filename;
        i11 = paramj.dQr;
        i6 = 0;
        paramArrayOfObject = t.nW(paramArrayOfObject);
        if (paramArrayOfObject == null) {
          break label2006;
        }
        i6 = paramArrayOfObject.bSX;
      }
      label540:
      label796:
      label822:
      label836:
      label926:
      label1062:
      label1222:
      label1304:
      label1351:
      label1680:
      label1697:
      label1798:
      label1830:
      label1838:
      label1844:
      label1876:
      label1882:
      label1888:
      label1944:
      label1966:
      label1974:
      label1989:
      label2006:
      for (int i7 = paramArrayOfObject.dHI;; i7 = 0)
      {
        Object localObject3;
        if (i11 <= 0)
        {
          j = 1;
          ((PInt)localObject1).value = i6;
          ((PInt)localObject2).value = j;
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.OnlineVideoService", "getPreloadVideoInfo pHadPreloadSize[%d] pHadPreloadCompletion[%d]", new Object[] { Integer.valueOf(((PInt)localObject1).value), Integer.valueOf(((PInt)localObject2).value) });
          localObject3 = new StringBuffer();
          if (!bool) {
            break label1798;
          }
          ((StringBuffer)localObject3).append(paramj.field_fileId).append(",").append(paramj.field_aesKey).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_fileLength).append(",").append(i9 * 1000).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_recvedBytes).append(",");
          ((StringBuffer)localObject3).append(i5 + ",").append(i4 + ",").append(i3 + ",");
          ((StringBuffer)localObject3).append(i2 + ",").append(i1 + ",");
          ((StringBuffer)localObject3).append(i10).append(",");
          ((StringBuffer)localObject3).append(i).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_startTime).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_endTime).append(",");
          if (!bool) {
            break label1844;
          }
          if (paramj.dQn == null) {
            break label1830;
          }
          paramArrayOfObject = com.tencent.mm.a.g.u(paramj.dQn.getBytes());
          ((StringBuffer)localObject3).append(paramArrayOfObject).append(",");
          if (!com.tencent.mm.model.s.fq(paramj.dQn)) {
            break label1838;
          }
          i = 1;
          ((StringBuffer)localObject3).append(i).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_retCode).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_enQueueTime).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_firstRequestCost).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_firstRequestSize).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_firstRequestDownloadSize).append(",");
          if (!paramkeep_SceneResult.field_firstRequestCompleted) {
            break label1876;
          }
          i = 1;
          ((StringBuffer)localObject3).append(i).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_averageSpeed).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_averageConnectCost).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_firstConnectCost).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_netConnectTimes).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_moovRequestTimes).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_moovCost).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_moovSize).append(",");
          if (!paramkeep_SceneResult.field_moovCompleted) {
            break label1882;
          }
          i = 1;
          ((StringBuffer)localObject3).append(i).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_moovFailReason).append(",");
          ((StringBuffer)localObject3).append(n).append(",");
          ((StringBuffer)localObject3).append(m).append(",");
          if (!bool) {
            break label1888;
          }
          ((StringBuffer)localObject3).append(i8).append(",");
          ((StringBuffer)localObject3).append(str2).append(",");
          if (!bool) {
            break label1944;
          }
          ((StringBuffer)localObject3).append(paramj.dQq).append(",");
          ((StringBuffer)localObject3).append(paramj.bYu).append(",");
          ((StringBuffer)localObject3).append(paramj.initialDownloadLength).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_videoFormat).append(",");
          ((StringBuffer)localObject3).append(str1).append(",");
          ((StringBuffer)localObject3).append(k).append(",");
          ((StringBuffer)localObject3).append(paramj.dQs).append(",");
          ((StringBuffer)localObject3).append(((PInt)localObject1).value).append(",");
          ((StringBuffer)localObject3).append(((PInt)localObject2).value);
          if (!bool) {
            break label1966;
          }
          i = 13570;
          paramArrayOfObject = ((StringBuffer)localObject3).toString();
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoService", "report online video %d:%s", new Object[] { Integer.valueOf(i), paramArrayOfObject });
          if (!bool) {
            break label1974;
          }
          new com.tencent.mm.g.b.a.e(paramArrayOfObject).RD();
          if (paramBoolean)
          {
            paramArrayOfObject = paramj.bSS;
            str1 = paramj.dQn;
            i = paramj.bSU;
            str2 = paramkeep_SceneResult.field_fileId;
            long l1 = paramkeep_SceneResult.field_startTime;
            long l2 = paramkeep_SceneResult.field_endTime;
            localObject3 = paramj.field_fullpath;
            String[] arrayOfString = paramkeep_SceneResult.field_usedSvrIps;
            String str3 = paramj.url;
            j = ((PInt)localObject1).value;
            k = ((PInt)localObject2).value;
            localObject1 = paramj.bSZ;
            localObject2 = new jk();
            ((jk)localObject2).bSR.bSS = paramArrayOfObject;
            ((jk)localObject2).bSR.bST = str1;
            ((jk)localObject2).bSR.bSU = i;
            ((jk)localObject2).bSR.fileId = str2;
            ((jk)localObject2).bSR.netType = i10;
            ((jk)localObject2).bSR.startTime = l1;
            ((jk)localObject2).bSR.endTime = l2;
            ((jk)localObject2).bSR.path = ((String)localObject3);
            ((jk)localObject2).bSR.bSV = arrayOfString;
            ((jk)localObject2).bSR.bSW = str3;
            ((jk)localObject2).bSR.bSX = j;
            ((jk)localObject2).bSR.bSY = k;
            ((jk)localObject2).bSR.bSZ = ((String)localObject1);
            com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
          }
          if (!bool) {
            break;
          }
          if (paramkeep_SceneResult.field_videoFormat != 2) {
            break label1989;
          }
          com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 132L, 1L, false);
        }
        for (;;)
        {
          paramArrayOfObject = t.nW(paramj.filename);
          if (paramArrayOfObject == null) {
            break;
          }
          paramArrayOfObject = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dW(paramArrayOfObject.enN);
          ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().a(new f.c(paramArrayOfObject.field_talker, "update", paramArrayOfObject));
          return;
          k = 0;
          break label47;
          com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 46L, 1L, false);
          break label181;
          com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 48L, 1L, false);
          break label202;
          i = 31;
          break label374;
          int i12 = (int)(i11 / 100.0F * i7);
          if (i6 < i12) {}
          for (j = 2;; j = 3)
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.OnlineVideoService", "getPreloadVideoInfo %d * %d = configSize[%d] preloadSize[%d]", new Object[] { Integer.valueOf(i11), Integer.valueOf(i7), Integer.valueOf(i12), Integer.valueOf(i6) });
            break;
          }
          ((StringBuffer)localObject3).append(paramj.url).append(",").append(paramj.dQp).append(",");
          break label540;
          paramArrayOfObject = Integer.valueOf(0);
          break label796;
          i = 0;
          break label822;
          ((StringBuffer)localObject3).append(0).append(",");
          ((StringBuffer)localObject3).append(paramkeep_SceneResult.field_httpStatusCode).append(",");
          break label836;
          i = 0;
          break label926;
          i = 0;
          break label1062;
          ((StringBuffer)localObject3).append(i8).append(",");
          if (paramj.dQn != null) {}
          for (paramArrayOfObject = com.tencent.mm.a.g.u(paramj.dQn.getBytes());; paramArrayOfObject = Integer.valueOf(0))
          {
            ((StringBuffer)localObject3).append(paramArrayOfObject).append(",");
            break;
          }
          ((StringBuffer)localObject3).append(com.tencent.mm.plugin.video.c.OC(paramj.bSZ)).append(",");
          break label1222;
          i = 13790;
          break label1304;
          new com.tencent.mm.g.b.a.h(paramArrayOfObject).RD();
          break label1351;
          com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 133L, 1L, false);
        }
      }
      label2012:
      m = 0;
      n = 0;
      i1 = 0;
      i2 = 0;
      i3 = 0;
      i4 = 0;
      i5 = 0;
    }
  }
  
  private static boolean a(av paramav, String paramString1, long paramLong, String paramString2)
  {
    if (paramString1 == null) {}
    for (;;)
    {
      return false;
      try
      {
        paramString1 = new URL(paramString1);
        if ((paramav != null) && (paramString2 != null) && (paramString2.indexOf(paramString1.getHost()) != -1) && (paramav.time != 0))
        {
          long l = bi.bG(paramav.time);
          if (l > paramLong) {
            return true;
          }
        }
      }
      catch (Exception paramav)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.OnlineVideoService", "error for check dcip %s", new Object[] { paramav.getMessage() });
      }
    }
    return false;
  }
  
  public static int g(String paramString, int paramInt1, int paramInt2)
  {
    g.NE();
    int i = b.g(paramString, paramInt1, paramInt2);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoService", "request video video[%s], offset[%d], length[%d] duration[%d] ret[%d]", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(i) });
    return i;
  }
  
  public final int a(String paramString, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult)
  {
    if (bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.OnlineVideoService", "cdn callback mediaid is null.");
      return -1;
    }
    if ((paramkeep_ProgressInfo == null) && (paramkeep_SceneResult == null))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.OnlineVideoService", "cdn callback info all null.");
      return -2;
    }
    com.tencent.mm.kernel.g.Em().H(new f.8(this, paramString, paramkeep_ProgressInfo, paramkeep_SceneResult));
    if (this.dOW.get(paramString) != null) {
      return 1;
    }
    return 0;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (paraml.getType() != 379) {}
    do
    {
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoService", "it get cdn dns success[%d, %d], try to start.", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    } while (!com.tencent.mm.kernel.g.Eg().Dx());
    com.tencent.mm.kernel.g.Em().H(new f.1(this));
  }
  
  public final boolean a(j paramj, boolean paramBoolean)
  {
    if (paramj == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.OnlineVideoService", "add download task, but task is null.");
      return false;
    }
    if (bi.oW(paramj.field_mediaId))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.OnlineVideoService", "add download task, but task mediaId is null.");
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoService", "add download task : " + paramj.field_mediaId + " delay : " + paramBoolean);
    if (paramj.field_fileId == null) {
      paramj.field_fileId = "";
    }
    if (paramj.field_aesKey == null) {
      paramj.field_aesKey = "";
    }
    paramj.ceW = false;
    if ((k(paramj.field_mediaId, null)) || (paramBoolean)) {
      com.tencent.mm.kernel.g.Em().H(new f.2(this, paramj));
    }
    for (;;)
    {
      return true;
      com.tencent.mm.kernel.g.Em().H(new f.3(this, paramj));
    }
  }
  
  public final void bH(boolean paramBoolean)
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {}
    for (;;)
    {
      return;
      if ((!paramBoolean) && (g.NE().Nx()))
      {
        com.tencent.mm.kernel.g.Eg();
        if (com.tencent.mm.kernel.a.Dw())
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.OnlineVideoService", "cdn engine not init cdn dnsinfo , will retry after set info");
          g.ND().bH(paramBoolean);
          return;
        }
      }
      g.ND().Ny();
      while (!this.dOU.isEmpty())
      {
        Object localObject1 = (String)this.dOU.poll();
        Object localObject2 = (j)this.dOV.remove(localObject1);
        if (localObject2 != null)
        {
          ((j)localObject2).field_startTime = bi.VF();
          if (!((j)localObject2).ceW)
          {
            if (((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sUi, Integer.valueOf(-1))).intValue() == 2) {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoService", "command set do not check media duplication.");
            }
            label152:
            int j;
            for (int i = 0;; i = 1)
            {
              if (i == 0) {
                break label394;
              }
              localObject2 = new la();
              ((la)localObject2).bVm.bOh = 6;
              ((la)localObject2).bVm.mediaId = ((String)localObject1);
              com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
              break;
              if (((j)localObject2).NJ()) {
                break label152;
              }
              Object localObject3 = ((j)localObject2).dQk;
              i = ((j)localObject2).dQl;
              Object localObject4 = ((com.tencent.mm.plugin.t.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.t.a.a.class)).FY().de((String)localObject3, i);
              j = i - com.tencent.mm.a.e.cm((String)localObject4);
              if ((bi.oW((String)localObject4)) || (j < 0) || (j > 16)) {
                break label152;
              }
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoService", "it had download this video[%d, %s, %s].", new Object[] { Integer.valueOf(i), localObject3, localObject4 });
              com.tencent.mm.sdk.platformtools.j.fN((String)localObject4, ((j)localObject2).field_fullpath);
              localObject4 = t.nW(((j)localObject2).filename);
              a((r)localObject4, i, (String)localObject3);
              localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dW(((r)localObject4).enN);
              ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().a(new f.c(((cm)localObject3).field_talker, "update", (bd)localObject3));
            }
            label394:
            if (((j)localObject2).NI())
            {
              g.NE();
              i = b.a((i)localObject2, ((j)localObject2).dQm);
              label417:
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoService", "start task %s streaming download. ret %d ", new Object[] { localObject2, Integer.valueOf(i) });
              if (i == 0) {
                break label959;
              }
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.OnlineVideoService", "start stream video error. ret : " + i + " media id: " + ((j)localObject2).field_mediaId);
              paramBoolean = ((j)localObject2).NI();
              j = ((j)localObject2).dQm;
              if (!paramBoolean) {
                break label870;
              }
              com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 3L, 1L, false);
              if (j != 1) {
                break label805;
              }
              if (i != 44530) {
                break label764;
              }
              com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 100L, 1L, false);
            }
            for (;;)
            {
              com.tencent.mm.plugin.report.service.h.mEJ.h(13836, new Object[] { Integer.valueOf(100), Long.valueOf(bi.VE()), "" });
              break;
              if (((j)localObject2).NG())
              {
                g.NE();
                i = b.a(((j)localObject2).field_mediaId, ((j)localObject2).url, ((j)localObject2).referer, ((j)localObject2).field_fullpath, ((j)localObject2).dQm, ((j)localObject2).dPQ, ((j)localObject2).initialDownloadOffset, ((j)localObject2).initialDownloadLength, ((j)localObject2).isColdSnsData, ((j)localObject2).signalQuality, ((j)localObject2).snsScene, ((j)localObject2).field_preloadRatio);
                break label417;
              }
              if (((j)localObject2).NH())
              {
                g.NE();
                i = b.a(((j)localObject2).field_mediaId, ((j)localObject2).url, ((j)localObject2).referer, ((j)localObject2).field_fullpath, ((j)localObject2).dQm, ((j)localObject2).field_preloadRatio, ((j)localObject2).concurrentCount);
                break label417;
              }
              g.NE();
              i = b.a(((j)localObject2).field_mediaId, ((j)localObject2).url, ((j)localObject2).referer, ((j)localObject2).field_fullpath, ((j)localObject2).dQm, ((j)localObject2).dPQ, ((j)localObject2).initialDownloadOffset, ((j)localObject2).initialDownloadLength, ((j)localObject2).field_preloadRatio);
              break label417;
              label764:
              if (i == 45533)
              {
                com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 101L, 1L, false);
              }
              else
              {
                com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 102L, 1L, false);
                continue;
                label805:
                if (i == 44530) {
                  com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 106L, 1L, false);
                } else if (i == 45533) {
                  com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 107L, 1L, false);
                } else {
                  com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 108L, 1L, false);
                }
              }
            }
            label870:
            com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 210L, 1L, false);
            if (j == 1) {
              com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 211L, 1L, false);
            }
            for (;;)
            {
              com.tencent.mm.plugin.report.service.h.mEJ.h(13836, new Object[] { Integer.valueOf(200), Long.valueOf(bi.VE()), "" });
              break;
              com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 212L, 1L, false);
            }
            label959:
            ((j)localObject2).dQj = bi.VF();
            if (((j)localObject2).NI())
            {
              localObject1 = t.nW(((j)localObject2).filename);
              if (localObject1 != null)
              {
                i = ((r)localObject1).status;
                if ((i != 120) && (i != 122) && (i != 121))
                {
                  ((r)localObject1).status = 120;
                  ((r)localObject1).bWA = 256;
                  com.tencent.mm.modelvideo.o.Ta().b((r)localObject1);
                }
              }
            }
            this.dOW.put(((j)localObject2).field_mediaId, localObject2);
          }
        }
      }
    }
  }
  
  public final boolean isVideoDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    if ((j)this.dOW.get(paramString) == null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoService", "this media[%s] don't download now.", new Object[] { paramString });
      return false;
    }
    g.NE();
    boolean bool = b.isVideoDataAvailable(paramString, paramInt1, paramInt2);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoService", "is video[%s] data[%d, %d] available[%b]", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean k(String paramString, Object[] paramArrayOfObject)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    if (!bi.oW(paramString)) {
      if (!this.dOW.containsKey(paramString)) {
        break label78;
      }
    }
    for (bool1 = true;; bool1 = bool2)
    {
      com.tencent.mm.kernel.g.Em().H(new f.4(this, paramString, paramArrayOfObject));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoService", "cancelDownloadTask mediaId : " + paramString + " remove : " + bool1);
      return bool1;
      label78:
      g.ND().lx(paramString);
    }
  }
  
  public final void onDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoService", "onDataAvailable. offset %d, length %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (bi.oW(paramString)) {
      return;
    }
    com.tencent.mm.kernel.g.Em().H(new f.6(this, paramString, paramInt1, paramInt2));
  }
  
  public final void onDownloadToEnd(String paramString, int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoService", "onDownloadToEnd. offset %d, length %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (bi.oW(paramString)) {
      return;
    }
    com.tencent.mm.kernel.g.Em().H(new f.7(this, paramString, paramInt1, paramInt2));
  }
  
  public final void onMoovReady(String paramString, int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoService", "onMoovReady mediaId[%s]", new Object[] { paramString });
    if (bi.oW(paramString)) {
      return;
    }
    com.tencent.mm.kernel.g.Em().H(new f.5(this, paramString, paramInt1, paramInt2));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelcdntran/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */