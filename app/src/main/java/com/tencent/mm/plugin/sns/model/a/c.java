package com.tencent.mm.plugin.sns.model.a;

import com.tencent.mm.a.o;
import com.tencent.mm.memory.n;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.b;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.pluginsdk.model.k;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.av;
import java.io.ByteArrayOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class c
  extends k<String, Integer, Integer>
{
  private static HashSet<String> ntf = new HashSet();
  protected ate caK = null;
  private long dnsCostTime = -1L;
  private int erZ = -1;
  private String host = "";
  protected a nsL;
  protected n nsM = null;
  protected a nsN = null;
  int nth = 0;
  
  public c(a parama, a parama1)
  {
    this.nsL = parama;
    this.nsN = parama1;
    if (parama1 == null) {
      return;
    }
    this.caK = parama1.noc;
    ntf.add(parama1.nob);
    parama1.init();
  }
  
  public static boolean ML(String paramString)
  {
    if (ntf.contains(com.tencent.mm.plugin.sns.data.i.aF(1, paramString))) {}
    while (ntf.contains(com.tencent.mm.plugin.sns.data.i.aF(5, paramString))) {
      return true;
    }
    return false;
  }
  
  private boolean a(com.tencent.mm.modelcdntran.h paramh, boolean paramBoolean, String paramString)
  {
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    int i;
    try
    {
      this.host = new URL(this.nsN.url).getHost();
      localArrayList1 = new ArrayList();
      this.erZ = b.a(this.host, false, localArrayList1);
      localArrayList2 = new ArrayList();
      i = b.a(this.host, true, localArrayList2);
      Random localRandom = new Random();
      localRandom.setSeed(bi.VF());
      Collections.shuffle(localArrayList1, localRandom);
      Collections.shuffle(localArrayList2, localRandom);
      while (localArrayList1.size() > 2) {
        localArrayList1.remove(0);
      }
      if (localArrayList2.size() <= 2) {
        break label170;
      }
    }
    catch (MalformedURLException paramh)
    {
      x.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", paramh, "", new Object[0]);
      x.w("MicroMsg.SnsCdnDownloadBase", "attachSnsImgTaskInfo fail:" + paramh);
      return false;
    }
    for (;;)
    {
      localArrayList2.remove(0);
    }
    label170:
    paramh.field_mediaId = (this.nsN.mediaId + "_" + this.nsN.nsI);
    paramh.url = this.nsN.url;
    paramh.host = this.host;
    paramh.referer = paramString;
    paramh.dPP = (this.nsN.getPath() + this.nsN.byY());
    paramh.dPQ = ck(localArrayList1);
    paramh.dPR = ck(localArrayList2);
    paramh.dPS = this.erZ;
    paramh.dPT = i;
    paramh.isColdSnsData = paramBoolean;
    paramh.signalQuality = ao.getStrength(ad.getContext());
    paramh.snsScene = this.nsN.nsJ.tag;
    if (this.nsN.noc != null)
    {
      if (this.nsN.nsG)
      {
        paramString = this.nsN.noc.rVY;
        paramh.snsCipherKey = paramString;
      }
    }
    else
    {
      if (this.nsN.nsI != 8) {
        break label452;
      }
      paramh.csS = 3;
      paramh.dPU = 109;
      paramh.fileType = 20204;
    }
    for (;;)
    {
      x.i("MicroMsg.SnsCdnDownloadBase", "attachSnsImgTaskInfo reqDownType:%d:%s", new Object[] { Integer.valueOf(this.nsN.nsI), paramh });
      return true;
      paramString = this.nsN.noc.rVV;
      break;
      label452:
      if ((this.nsN.nsI == 6) || (this.nsN.nsI == 4))
      {
        paramh.csS = 3;
        paramh.dPU = 105;
        paramh.fileType = 20210;
      }
      else if (this.nsN.nsI == 5)
      {
        paramh.csS = 3;
        paramh.dPU = 150;
        paramh.fileType = 20250;
      }
      else if ((this.nsN.nsI == 2) || (this.nsN.nsI == 1) || (this.nsN.nsI == 3))
      {
        paramh.csS = 3;
        paramh.dPU = 100;
        paramh.fileType = 20201;
      }
    }
  }
  
  private static String[] ck(List<String> paramList)
  {
    String[] arrayOfString = new String[paramList.size()];
    int i = 0;
    while (i < arrayOfString.length)
    {
      arrayOfString[i] = ((String)paramList.get(i));
      i += 1;
    }
    return arrayOfString;
  }
  
  public String MJ(String paramString)
  {
    return paramString;
  }
  
  public boolean a(av paramav, String paramString1, long paramLong, String paramString2)
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
        x.e("MicroMsg.SnsCdnDownloadBase", "error for check dcip %s", new Object[] { paramav.getMessage() });
      }
    }
    return false;
  }
  
  protected final void b(keep_SceneResult paramkeep_SceneResult)
  {
    int k = bzb();
    String str = "";
    Object localObject1;
    label46:
    Object localObject2;
    int i;
    switch (k)
    {
    default: 
      return;
    case 1: 
      localObject1 = "100105";
      localObject2 = com.tencent.mm.model.c.c.Jx().fJ((String)localObject1);
      if (((com.tencent.mm.storage.c)localObject2).isValid())
      {
        i = bi.getInt((String)((com.tencent.mm.storage.c)localObject2).ckq().get("needUploadData"), 1);
        str = ((com.tencent.mm.storage.c)localObject2).field_expId;
      }
      break;
    }
    while (i != 0)
    {
      if (this.nsN.nsI == 8) {
        i = 1;
      }
      for (;;)
      {
        label110:
        localObject2 = new com.tencent.mm.modelsns.d();
        ((com.tencent.mm.modelsns.d)localObject2).r("20ImgSize", paramkeep_SceneResult.field_fileLength + ",");
        StringBuilder localStringBuilder = new StringBuilder();
        int j;
        if (ao.isWifi(ad.getContext()))
        {
          j = 1;
          label170:
          ((com.tencent.mm.modelsns.d)localObject2).r("21NetType", j + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("22DelayTime", paramkeep_SceneResult.field_delayTime + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("23RetCode", paramkeep_SceneResult.field_retCode + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("24DnsCostTime", paramkeep_SceneResult.field_dnsCostTime + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("25ConnectCostTime", paramkeep_SceneResult.field_connectCostTime + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("26SendCostTime", ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("27WaitResponseCostTime", paramkeep_SceneResult.field_waitResponseCostTime + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("28ReceiveCostTime", paramkeep_SceneResult.field_receiveCostTime + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("29ClientAddrIP(uint)", paramkeep_SceneResult.field_clientHostIP + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("30ServerAddrIP(uint)", paramkeep_SceneResult.field_serverHostIP + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("31dnstype", this.erZ + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("32signal(int)", ao.getStrength(ad.getContext()) + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("33host(string)", this.host + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("34MediaType", k + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("35X_Errno(string)", paramkeep_SceneResult.field_xErrorNo + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("36MaxPackageSize", ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("37MaxPackageTimeStamp", ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("38PackageRecordList", ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("39ExpLayerId", (String)localObject1 + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("40ExpId", str + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("41FeedId", ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("42BizType", i + ",");
          ((com.tencent.mm.modelsns.d)localObject2).r("43CSeqCheck(uint)", paramkeep_SceneResult.field_cSeqCheck + ",");
          localObject1 = new StringBuilder();
          if (!paramkeep_SceneResult.field_usePrivateProtocol) {
            break label992;
          }
        }
        label992:
        for (i = 1;; i = 0)
        {
          ((com.tencent.mm.modelsns.d)localObject2).r("44isPrivate(uint)", i + ",");
          x.i("MicroMsg.SnsCdnDownloadBase", "report logbuffer(13480 TLMediaFielDownloadRecord): " + ((com.tencent.mm.modelsns.d)localObject2).wF());
          com.tencent.mm.plugin.report.service.h.mEJ.h(13480, new Object[] { localObject2 });
          if ((paramkeep_SceneResult.field_retCode == 200) || (paramkeep_SceneResult.field_retCode == 0)) {
            break;
          }
          com.tencent.mm.plugin.report.service.h.mEJ.h(14071, new Object[] { localObject2 });
          return;
          localObject1 = "100106";
          break label46;
          localObject1 = "100100";
          break label46;
          if ((this.nsN.nsI == 6) || (this.nsN.nsI == 4))
          {
            i = 2;
            break label110;
          }
          if (this.nsN.nsI == 5)
          {
            i = 4;
            break label110;
          }
          if ((this.nsN.nsI != 2) && (this.nsN.nsI != 1) && (this.nsN.nsI != 3)) {
            break label997;
          }
          i = 0;
          break label110;
          j = 0;
          break label170;
        }
        label997:
        i = 5;
      }
      i = 0;
    }
  }
  
  public ag bxH()
  {
    return af.bxZ();
  }
  
  public boolean byZ()
  {
    return true;
  }
  
  public abstract boolean bza();
  
  protected abstract int bzb();
  
  public Integer bzc()
  {
    com.tencent.mm.kernel.g.Ek();
    if ((!com.tencent.mm.kernel.g.Ei().isSDCardAvailable()) || (this.nsN == null)) {
      return Integer.valueOf(2);
    }
    if (byZ())
    {
      localObject1 = this.nsN.nnX + this.nsN.byY();
      x.i("MicroMsg.SnsCdnDownloadBase", "[tomys] delete img: %s", new Object[] { localObject1 });
      FileOp.deleteFile((String)localObject1);
    }
    System.currentTimeMillis();
    x.d("MicroMsg.SnsCdnDownloadBase", "to downloadBitmap " + this.nsN.mediaId + " " + this.nsN.nsG + " type " + this.nsN.nsI);
    FileOp.mL(this.nsN.getPath());
    av localav = this.nsN.nsJ;
    Object localObject1 = "";
    Object localObject2;
    if (localav == null)
    {
      localObject1 = "";
      localObject2 = localObject1;
      if (!bi.oW((String)localObject1)) {
        localObject2 = "&scene=" + (String)localObject1;
      }
      String str = String.format("http://weixin.qq.com/?version=%d&uin=%s&nettype=%d&signal=%d%s", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.qVN), o.getString(af.bxV()), Integer.valueOf(ao.getNetTypeForStat(ad.getContext())), Integer.valueOf(ao.getStrength(ad.getContext())), localObject2 });
      this.nsN.url = MJ(this.nsN.url);
      this.dnsCostTime = bi.VF();
      if (!this.nsN.nsH) {
        break label641;
      }
      localObject1 = "SnsSightDomainList";
      label315:
      if (!this.nsN.nsH) {
        break label649;
      }
      localObject2 = "SnsSightMainStandbyIpSwitchTime";
      label330:
      localObject1 = com.tencent.mm.k.g.AT().getValue((String)localObject1);
      long l2 = com.tencent.mm.k.g.AT().getInt((String)localObject2, 0);
      x.i("MicroMsg.SnsCdnDownloadBase", "pack.isAlbum %s pack.isthumb %s hostvalue %s dcipTime %s", new Object[] { Boolean.valueOf(this.nsN.nsH), Boolean.valueOf(this.nsN.nsG), localObject1, Long.valueOf(l2) });
      long l1 = l2;
      if (l2 <= 0L) {
        l1 = 259200L;
      }
      boolean bool = a(localav, this.nsN.url, l1, (String)localObject1);
      this.dnsCostTime = bi.bH(this.dnsCostTime);
      localObject1 = new com.tencent.mm.modelcdntran.h();
      if (!a((com.tencent.mm.modelcdntran.h)localObject1, bool, str)) {
        break label665;
      }
      ((com.tencent.mm.modelcdntran.h)localObject1).dPV = new i.a()
      {
        public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
        {
          paramAnonymousInt = 2;
          if (paramAnonymouskeep_SceneResult != null) {
            if (c.this.nsN != null) {}
          }
          float f;
          do
          {
            do
            {
              return 0;
              if (paramAnonymouskeep_SceneResult.field_retCode != 0) {
                b.reportFailIp(paramAnonymouskeep_SceneResult.field_serverIP);
              }
              for (;;)
              {
                c.this.b(paramAnonymouskeep_SceneResult);
                af.aRu().post(new c.1.1(this, paramAnonymousInt, paramAnonymouskeep_SceneResult));
                return 0;
                c.this.nth = paramAnonymouskeep_SceneResult.field_fileLength;
                if (c.this.bza()) {
                  if (c.this.nsN.nsG) {
                    paramAnonymousInt = 3;
                  } else {
                    paramAnonymousInt = 1;
                  }
                }
              }
            } while (paramAnonymouskeep_ProgressInfo == null);
            f = paramAnonymouskeep_ProgressInfo.field_finishedLength / paramAnonymouskeep_ProgressInfo.field_toltalLength;
          } while (c.this.nsN.nsK >= f);
          c.this.nsN.nsK = f;
          x.d("MicroMsg.SnsCdnDownloadBase", "Download sns image type: %d, mediaId: %s, progress: %f, url: %s", new Object[] { Integer.valueOf(c.this.nsN.nsI), paramAnonymousString, Float.valueOf(f), c.this.nsN.url });
          return 0;
        }
        
        public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream) {}
        
        public final byte[] i(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
        {
          return new byte[0];
        }
      };
      if (!com.tencent.mm.modelcdntran.g.ND().b((com.tencent.mm.modelcdntran.i)localObject1, -1)) {
        break label657;
      }
      x.i("MicroMsg.SnsCdnDownloadBase", "SubCoreCdnTransport addRecvTask suc");
    }
    label641:
    label649:
    label657:
    label665:
    for (int i = 1;; i = 2)
    {
      return Integer.valueOf(i);
      if (localav.equals(av.tbn))
      {
        localObject1 = "album_friend";
        break;
      }
      if (localav.equals(av.tbo))
      {
        localObject1 = "album_self";
        break;
      }
      if (localav.equals(av.tbp))
      {
        localObject1 = "album_stranger";
        break;
      }
      if (localav.equals(av.tbq))
      {
        localObject1 = "profile_friend";
        break;
      }
      if (localav.equals(av.tbr))
      {
        localObject1 = "profile_stranger";
        break;
      }
      if (localav.equals(av.tbs))
      {
        localObject1 = "comment";
        break;
      }
      if (!localav.equals(av.tbm)) {
        break;
      }
      localObject1 = "timeline";
      break;
      localObject1 = "SnsAlbumDomainList";
      break label315;
      localObject2 = "SnsAlbumMainStandbyIpSwitchTime";
      break label330;
      x.w("MicroMsg.SnsCdnDownloadBase", "SubCoreCdnTransport addRecvTask failed");
    }
  }
  
  public void bzd()
  {
    if (af.bxX()) {
      return;
    }
    System.currentTimeMillis();
    Object localObject1;
    Object localObject2;
    if (this.nsN.nkK.nkQ == 4)
    {
      x.i("MicroMsg.SnsCdnDownloadBase", "decodeType blur thumb");
      localObject1 = com.tencent.mm.plugin.sns.data.i.e(this.caK);
      localObject2 = com.tencent.mm.plugin.sns.data.i.g(this.caK);
      this.nsM = com.tencent.mm.plugin.sns.lucky.a.a.ev(this.nsN.getPath() + (String)localObject1, this.nsN.getPath() + (String)localObject2);
      af.byl().a(this.nsN.mediaId, this.nsM, this.nsN.nkK.nkQ);
      label132:
      localObject1 = null;
      if (this.nsN.nkK.nkQ != 0) {
        break label593;
      }
      localObject1 = "0-" + this.nsN.nkK.kJG;
    }
    for (;;)
    {
      af.byl().LZ((String)localObject1);
      return;
      if (this.nsN.nkK.nkQ == 5)
      {
        x.i("MicroMsg.SnsCdnDownloadBase", "decodeType blur grid");
        localObject1 = com.tencent.mm.plugin.sns.data.i.e(this.caK);
        localObject2 = com.tencent.mm.plugin.sns.data.i.h(this.caK);
        this.nsM = com.tencent.mm.plugin.sns.lucky.a.a.ev(this.nsN.getPath() + (String)localObject1, this.nsN.getPath() + (String)localObject2);
        af.byl().a(this.nsN.mediaId, this.nsM, this.nsN.nkK.nkQ);
        break label132;
      }
      if (this.nsN.nkK.list.size() <= 1)
      {
        af.byl().a(this.nsN.mediaId, this.nsM, this.nsN.nkK.nkQ);
        break label132;
      }
      af.byl().a(this.nsN.mediaId, this.nsM, 0);
      localObject1 = new LinkedList();
      int i = 0;
      for (;;)
      {
        if ((i >= this.nsN.nkK.list.size()) || (i >= 4)) {
          break label501;
        }
        localObject2 = (ate)this.nsN.nkK.list.get(i);
        n localn = af.byl().Ma(((ate)localObject2).ksA);
        if (!com.tencent.mm.plugin.sns.data.i.b(localn)) {
          break;
        }
        ((List)localObject1).add(localn);
        x.i("MicroMsg.SnsCdnDownloadBase", "merge bitmap from " + localn + " " + ((ate)localObject2).ksA);
        i += 1;
      }
      label501:
      this.nsM = n.m(com.tencent.mm.plugin.sns.data.i.i((List)localObject1, af.byw()));
      x.i("MicroMsg.SnsCdnDownloadBase", "merge bitmap " + this.nsN.nkK.kJG + " " + this.nsM);
      af.byl().a(this.nsN.nkK.kJG, this.nsM, this.nsN.nkK.nkQ);
      break label132;
      label593:
      if (this.nsN.nkK.nkQ == 1) {
        localObject1 = "1-" + this.nsN.nkK.kJG;
      } else if (this.nsN.nkK.nkQ == 4) {
        localObject1 = "4-" + this.nsN.nkK.kJG;
      } else if (this.nsN.nkK.nkQ == 5) {
        localObject1 = "5-" + this.nsN.nkK.kJG;
      } else if (this.nsN.nkK.nkQ == 3) {
        localObject1 = com.tencent.mm.plugin.sns.data.i.aE(3, this.nsN.nkK.kJG);
      }
    }
  }
  
  public void onPostExecute(Integer paramInteger)
  {
    super.onPostExecute(paramInteger);
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt1, ate paramate, int paramInt2, boolean paramBoolean, String paramString, int paramInt3);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */