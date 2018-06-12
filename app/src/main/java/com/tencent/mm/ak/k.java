package com.tencent.mm.ak;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.s;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.d;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.c;
import com.tencent.mm.protocal.c.afj;
import com.tencent.mm.protocal.c.afk;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.storage.bc;
import com.tencent.mm.storage.bd;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import junit.framework.Assert;

public final class k
  extends l
  implements com.tencent.mm.network.k
{
  String TAG = "MicroMsg.NetSceneGetMsgImg";
  bd bGS = null;
  private long bJC = -1L;
  int dHI = 0;
  private int dTO;
  final com.tencent.mm.ab.f dVg;
  public final long dVh;
  private int dVi;
  private com.tencent.mm.modelstat.h dVj = null;
  String dVk = "";
  int dVl = 0;
  private String dVm = "";
  public String dVn = "";
  int dVo = -1;
  public boolean dVp = false;
  private int dVq = -1;
  private String dVr = null;
  private int dVs = 0;
  boolean dVt = false;
  private i.a dVu = new k.2(this);
  private final com.tencent.mm.ab.b diG;
  com.tencent.mm.ab.e diJ;
  long dlN;
  private int startOffset = -1;
  long startTime = 0L;
  private int token = -1;
  
  public k(long paramLong1, long paramLong2, int paramInt, com.tencent.mm.ab.f paramf)
  {
    this(paramLong1, paramLong2, paramInt, paramf, -1);
  }
  
  public k(long paramLong1, long paramLong2, int paramInt1, com.tencent.mm.ab.f paramf, int paramInt2)
  {
    boolean bool;
    e locale;
    if ((paramLong1 >= 0L) && (paramLong2 >= 0L) && (paramf != null))
    {
      bool = true;
      Assert.assertTrue(bool);
      this.dVg = paramf;
      this.dTO = paramInt1;
      this.dVh = paramLong1;
      this.dlN = paramLong1;
      this.bJC = paramLong2;
      this.dVq = paramInt2;
      locale = o.Pf().b(Long.valueOf(this.dlN));
      if (paramInt1 != 1) {
        break label566;
      }
      this.dlN = locale.dTU;
      locale = o.Pf().b(Long.valueOf(this.dlN));
    }
    label566:
    for (;;)
    {
      this.TAG = (this.TAG + "[" + this.dlN + "]");
      Object localObject = new b.a();
      ((b.a)localObject).dIG = new afj();
      ((b.a)localObject).dIH = new afk();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getmsgimg";
      ((b.a)localObject).dIF = 109;
      ((b.a)localObject).dII = 10;
      ((b.a)localObject).dIJ = 1000000010;
      this.diG = ((b.a)localObject).KT();
      localObject = (afj)this.diG.dID.dIL;
      this.bGS = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dW(paramLong2);
      ((afj)localObject).rdW = locale.offset;
      ((afj)localObject).rdV = locale.dHI;
      com.tencent.mm.sdk.platformtools.x.d(this.TAG, "cdntra offset:%d total:%d stack:[%s]", new Object[] { Integer.valueOf(locale.offset), Integer.valueOf(locale.dHI), bi.cjd() });
      ((afj)localObject).rcq = this.bGS.field_msgSvrId;
      ((afj)localObject).rcj = new bhz().VO(this.bGS.field_talker);
      ((afj)localObject).rck = new bhz().VO((String)com.tencent.mm.kernel.g.Ei().DT().get(2, null));
      ((afj)localObject).rJr = paramInt1;
      if (locale.offset == 0) {
        this.dVj = new com.tencent.mm.modelstat.h(109, false, locale.dHI);
      }
      this.dVi = 8192;
      if (paramf != null) {
        ah.A(new k.1(this, paramf, locale.offset, locale.dHI));
      }
      return;
      bool = false;
      break;
    }
  }
  
  private boolean a(e parame, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    parame.hL(paramInt1);
    parame.setOffset(paramInt2 + paramInt3);
    this.dVi = paramInt3;
    if (paramArrayOfByte != null) {
      com.tencent.mm.a.e.e(this.dVn, paramArrayOfByte);
    }
    com.tencent.mm.sdk.platformtools.x.d(this.TAG, "onGYNetEnd : offset = " + parame.offset + " totalLen = " + parame.dHI + " stack:[%s]", new Object[] { bi.cjd() });
    if (parame.OM())
    {
      paramArrayOfByte = this.dVn;
      if ((paramArrayOfByte == null) || (paramArrayOfByte.equals(""))) {
        paramArrayOfByte = "";
      }
    }
    for (;;)
    {
      Object localObject = new MMBitmapFactory.DecodeResultLogger();
      boolean bool = MMBitmapFactory.checkIsImageLegal(this.dVn, (MMBitmapFactory.DecodeResultLogger)localObject);
      File localFile = new File(this.dVn);
      if (bool)
      {
        localObject = o.Pf().o(this.dVm, null, paramArrayOfByte);
        com.tencent.mm.sdk.platformtools.x.i(this.TAG, "sceneEndproc ext:%s tmp:%s tmpfull:%s full:%s ", new Object[] { paramArrayOfByte, this.dVm, this.dVn, localObject });
        localFile.renameTo(new File((String)localObject));
        parame.lH(this.dVm + paramArrayOfByte);
        parame.lG(FileOp.mO((String)localObject));
        parame.hP(this.dTO);
      }
      for (paramArrayOfByte = (byte[])localObject;; paramArrayOfByte = null)
      {
        if (o.Pf().a(Long.valueOf(this.dlN), parame) >= 0) {
          break label523;
        }
        com.tencent.mm.sdk.platformtools.x.e(this.TAG, "onGYNetEnd : update img fail");
        this.diJ.a(3, -1, "", this);
        return false;
        paramArrayOfByte = com.tencent.mm.a.e.e(paramArrayOfByte, 0, 2);
        if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 2))
        {
          paramArrayOfByte = "";
          break;
        }
        paramInt3 = paramArrayOfByte[0];
        paramInt2 = paramInt3;
        if (paramInt3 < 0) {
          paramInt2 = paramInt3 + 256;
        }
        int i = paramArrayOfByte[1];
        paramInt3 = i;
        if (i < 0) {
          paramInt3 = i + 256;
        }
        if ((paramInt2 == 66) && (paramInt3 == 77))
        {
          paramArrayOfByte = ".bmp";
          break;
        }
        if ((paramInt2 == 255) && (paramInt3 == 216))
        {
          paramArrayOfByte = ".jpg";
          break;
        }
        if ((paramInt2 == 137) && (paramInt3 == 80))
        {
          paramArrayOfByte = ".png";
          break;
        }
        if ((paramInt2 != 71) || (paramInt3 != 73)) {
          break label889;
        }
        paramArrayOfByte = ".gif";
        break;
        localFile.delete();
        if (((MMBitmapFactory.DecodeResultLogger)localObject).getDecodeResult() >= 2000)
        {
          paramArrayOfByte = MMBitmapFactory.KVStatHelper.getKVStatString(this.dVn, 2, (MMBitmapFactory.DecodeResultLogger)localObject);
          com.tencent.mm.plugin.report.service.h.mEJ.k(12712, paramArrayOfByte);
        }
      }
      label523:
      if (this.dVg != null) {
        ah.A(new k.3(this, parame));
      }
      com.tencent.mm.sdk.platformtools.x.d(this.TAG, "cdntra check iscompleted :%b clientid:%s", new Object[] { Boolean.valueOf(parame.OM()), this.dVk });
      if (parame.OM())
      {
        if (bi.oW(this.dVk)) {
          com.tencent.mm.plugin.report.service.h.mEJ.h(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bi.VF()), Integer.valueOf(d.bL(ad.getContext())), Integer.valueOf(this.dVl), Integer.valueOf(paramInt1 - this.startOffset) });
        }
        bool = false;
        if (this.dVo > 0) {
          bool = o.Pf().a(paramArrayOfByte, parame.dTN, this.dVo, 1, this.bGS.cGC, this.bGS.cGD);
        }
        if (bool)
        {
          parame.cGG = 1;
          parame.dUl = true;
          ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().a(this.bGS.field_msgId, this.bGS);
        }
        o.Pf().a(Long.valueOf(this.dlN), parame);
        com.tencent.mm.sdk.platformtools.x.d(this.TAG, "cdntra ext:%s %s %s  MediaCheckDuplicationStorage md5:%s", new Object[] { this.dVn, paramArrayOfByte, parame.dTL, this.dVr });
        if (this.dVj != null) {
          this.dVj.bz(parame.dHI);
        }
        if ((!bi.oW(this.dVr)) && (this.dVs > 0))
        {
          com.tencent.mm.plugin.p.b.aWB();
          com.tencent.mm.plugin.p.b.FY().y(this.dVr, this.dVs, paramArrayOfByte);
        }
        this.diJ.a(0, 0, "", this);
        return false;
      }
      return true;
      label889:
      paramArrayOfByte = ".jpg";
    }
  }
  
  protected final int Cc()
  {
    if (this.dTO == 0) {
      return 100;
    }
    return 1280;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    afj localafj = (afj)this.diG.dID.dIL;
    e locale = o.Pf().b(Long.valueOf(this.dlN));
    if (locale.dTK == 0L)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 195L, 1L, false);
      com.tencent.mm.sdk.platformtools.x.e(this.TAG, "doScene id:%d  img:%s", new Object[] { Long.valueOf(this.dlN), locale });
      return -1;
    }
    if (locale.status != 0)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 194L, 1L, false);
      com.tencent.mm.sdk.platformtools.x.e(this.TAG, "doSceneError, id:%d, status:%d", new Object[] { Long.valueOf(locale.dTK), Integer.valueOf(locale.status) });
      return -1;
    }
    parame1 = locale.dTL;
    int i;
    if (parame1.startsWith("SERVERID://"))
    {
      this.dVm = com.tencent.mm.a.g.u(locale.dTL.getBytes());
      this.dVn = o.Pf().o(this.dVm, null, ".temp");
      locale.lH(this.dVm + ".temp");
      o.Pf().a(Long.valueOf(this.dlN), locale);
      com.tencent.mm.sdk.platformtools.x.i(this.TAG, "doscene id:%d comp:%d off:%d total:%d name:%s tmp:%s full:%s", new Object[] { Long.valueOf(locale.dTK), Integer.valueOf(this.dTO), Integer.valueOf(locale.offset), Integer.valueOf(locale.dHI), parame1, this.dVm, this.dVn });
      if (this.startTime == 0L)
      {
        this.startTime = bi.VF();
        this.startOffset = locale.offset;
        if (this.dTO != 1) {
          break label450;
        }
        i = com.tencent.mm.modelcdntran.b.MediaType_FULLSIZEIMAGE;
        label360:
        this.dVl = i;
      }
      parame1 = localafj.rcj.siM;
      long l = localafj.rcq;
      if (!bi.oW(locale.dTV)) {
        break label457;
      }
      i = 0;
    }
    for (;;)
    {
      if (i == 0) {
        break label1706;
      }
      com.tencent.mm.sdk.platformtools.x.d(this.TAG, "cdntra this img use cdn : %s", new Object[] { this.dVk });
      return 0;
      this.dVm = locale.dTL;
      this.dVn = o.Pf().o(this.dVm, null, "");
      break;
      label450:
      i = com.tencent.mm.modelcdntran.b.MediaType_IMAGE;
      break label360;
      label457:
      Map localMap = bl.z(locale.dTV, "msg");
      if (localMap == null)
      {
        com.tencent.mm.sdk.platformtools.x.e(this.TAG, "parse cdnInfo failed. [%s]", new Object[] { locale.dTV });
        i = 0;
      }
      else
      {
        this.dHI = 0;
        String str1;
        if (this.dTO != 1)
        {
          str1 = (String)localMap.get(".msg.img.$cdnmidimgurl");
          this.dHI = bi.getInt((String)localMap.get(".msg.img.$length"), 0);
          label551:
          if (this.dTO == 1) {
            break label721;
          }
          str2 = (String)localMap.get(".msg.img.$tpurl");
          parame1 = str2;
          if (bi.oW(str2)) {
            break label771;
          }
          this.dHI = bi.getInt((String)localMap.get(".msg.img.$tplength"), 0);
          parame1 = str2;
        }
        label721:
        label771:
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.d(this.TAG, "cdntra read xml  comptype:%d totallen:%d url:[%s] [%s]", new Object[] { Integer.valueOf(this.dTO), Integer.valueOf(this.dHI), str1, parame1 });
          if ((!bi.oW(str1)) || (!bi.oW(parame1))) {
            break label774;
          }
          com.tencent.mm.sdk.platformtools.x.e(this.TAG, "cdntra get cdnUrlfailed.");
          i = 0;
          break;
          str1 = (String)localMap.get(".msg.img.$cdnbigimgurl");
          this.dHI = bi.getInt((String)localMap.get(".msg.img.$hdlength"), 0);
          break label551;
          str2 = (String)localMap.get(".msg.img.$tphdurl");
          parame1 = str2;
          if (!bi.oW(str2))
          {
            this.dHI = bi.getInt((String)localMap.get(".msg.img.$tphdlength"), 0);
            parame1 = str2;
          }
        }
        label774:
        String str2 = (String)localMap.get(".msg.img.$aeskey");
        if (bi.oW(str2))
        {
          com.tencent.mm.sdk.platformtools.x.e(this.TAG, "cdntra get aes key failed.");
          i = 0;
        }
        else
        {
          this.dVk = d.a("downimg", locale.dTR, this.bGS.field_talker, this.bGS.field_msgId);
          if (bi.oW(this.dVk))
          {
            com.tencent.mm.sdk.platformtools.x.w(this.TAG, "cdntra genClientId failed not use cdn imgLocalId:%d", new Object[] { Long.valueOf(this.dlN) });
            i = 0;
          }
          else
          {
            Object localObject1 = (String)localMap.get(".msg.img.$md5");
            if ((bi.oW(parame1)) && (!bi.oW((String)localObject1)) && ((bi.oW((String)localMap.get(".msg.img.$cdnbigimgurl"))) || (this.dTO == 1)))
            {
              com.tencent.mm.plugin.p.b.aWB();
              String str3 = com.tencent.mm.plugin.p.b.FY().de((String)localObject1, this.dHI);
              i = com.tencent.mm.a.e.cm(str3);
              int j = this.dHI - i;
              String str4 = this.TAG;
              int k = this.dHI;
              Object localObject2 = localMap.get(".msg.img.$cdnbigimgurl");
              if (this.dTO == 1) {}
              for (boolean bool = true;; bool = false)
              {
                com.tencent.mm.sdk.platformtools.x.i(str4, "MediaCheckDuplicationStorage: totallen:%s md5:%s big:%s NOcompress:%s  dup(len:%d path:%s) diffLen:%d to:%s", new Object[] { Integer.valueOf(k), localObject1, localObject2, Boolean.valueOf(bool), Integer.valueOf(i), str3, Integer.valueOf(j), this.dVn });
                if (bi.oW(str3)) {
                  break label1304;
                }
                if ((j < 0) || (j > 16)) {
                  break label1318;
                }
                bool = j.fN(str3, this.dVn);
                com.tencent.mm.sdk.platformtools.x.i(this.TAG, "MediaCheckDuplicationStorage copy dup file now :%s -> %s [%b]", new Object[] { str3, this.dVn, Boolean.valueOf(bool) });
                a(locale, this.dHI, this.dHI, 0, null);
                if (this.bGS != null) {
                  ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().a(new f.c(this.bGS.field_talker, "update", this.bGS));
                }
                com.tencent.mm.plugin.report.service.h.mEJ.h(13267, new Object[] { str1, Long.valueOf(this.bGS.field_msgSvrId), localObject1, Long.valueOf(this.bGS.field_createTime / 1000L), this.bGS.field_talker, Integer.valueOf(3), Integer.valueOf(i) });
                i = 1;
                break;
              }
              label1304:
              this.dVr = ((String)localObject1);
              this.dVs = this.dHI;
            }
            label1318:
            localObject1 = new com.tencent.mm.modelcdntran.i();
            ((com.tencent.mm.modelcdntran.i)localObject1).field_mediaId = this.dVk;
            ((com.tencent.mm.modelcdntran.i)localObject1).field_fullpath = this.dVn;
            ((com.tencent.mm.modelcdntran.i)localObject1).field_fileType = this.dVl;
            ((com.tencent.mm.modelcdntran.i)localObject1).field_totalLen = this.dHI;
            ((com.tencent.mm.modelcdntran.i)localObject1).field_aesKey = str2;
            ((com.tencent.mm.modelcdntran.i)localObject1).field_fileId = str1;
            ((com.tencent.mm.modelcdntran.i)localObject1).field_priority = com.tencent.mm.modelcdntran.b.dOk;
            ((com.tencent.mm.modelcdntran.i)localObject1).dPV = this.dVu;
            if (s.fq(this.bGS.field_talker))
            {
              i = 1;
              label1409:
              ((com.tencent.mm.modelcdntran.i)localObject1).field_chattype = i;
              if (!bi.oW(parame1))
              {
                str1 = (String)localMap.get(".msg.img.$tpauthkey");
                ((com.tencent.mm.modelcdntran.i)localObject1).field_fileType = 19;
                ((com.tencent.mm.modelcdntran.i)localObject1).field_authKey = str1;
                ((com.tencent.mm.modelcdntran.i)localObject1).dPW = parame1;
                ((com.tencent.mm.modelcdntran.i)localObject1).field_fileId = "";
              }
              com.tencent.mm.sdk.platformtools.x.i(this.TAG, "cdnautostart %s %b", new Object[] { "image_" + this.bGS.field_msgId, Boolean.valueOf(com.tencent.mm.modelcdntran.g.ND().dPa.contains("image_" + this.bGS.field_msgId)) });
              if (!com.tencent.mm.modelcdntran.g.ND().dPa.contains("image_" + this.bGS.field_msgId)) {
                break label1682;
              }
              com.tencent.mm.modelcdntran.g.ND().dPa.remove("image_" + this.bGS.field_msgId);
            }
            label1682:
            for (((com.tencent.mm.modelcdntran.i)localObject1).field_autostart = true;; ((com.tencent.mm.modelcdntran.i)localObject1).field_autostart = false)
            {
              if (com.tencent.mm.modelcdntran.g.ND().b((com.tencent.mm.modelcdntran.i)localObject1, this.dVq)) {
                break label1691;
              }
              com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 196L, 1L, false);
              com.tencent.mm.sdk.platformtools.x.e(this.TAG, "addRecvTask failed :%s", new Object[] { this.dVk });
              this.dVk = "";
              i = 0;
              break;
              i = 0;
              break label1409;
            }
            label1691:
            com.tencent.mm.sdk.platformtools.x.d(this.TAG, "add recv task");
            i = 1;
          }
        }
      }
    }
    label1706:
    com.tencent.mm.sdk.platformtools.x.d(this.TAG, "cdntra this img NOT USE CDN: %s", new Object[] { this.dVk });
    locale.lK("");
    locale.bWA = 4096;
    o.Pf().a(Long.valueOf(this.dlN), locale);
    localafj.rdW = locale.offset;
    localafj.rdX = this.dVi;
    localafj.rdV = locale.dHI;
    if (this.dVj != null) {
      this.dVj.Sa();
    }
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bi.oW(this.dVk))) {
      com.tencent.mm.sdk.platformtools.x.w(this.TAG, "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.dVk });
    }
    do
    {
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        if (paramInt2 == 4)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 193L, 1L, false);
          com.tencent.mm.plugin.report.service.h.mEJ.h(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bi.VF()), Integer.valueOf(d.bL(ad.getContext())), Integer.valueOf(this.dVl), Integer.valueOf(this.dHI - this.startOffset) });
        }
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      paramString = (afk)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      paramq = o.Pf().b(Long.valueOf(this.dlN));
      paramInt1 = 0;
      if (paramString.rdX <= 0)
      {
        com.tencent.mm.sdk.platformtools.x.e(this.TAG, "flood control, malformed data_len");
        paramInt1 = -1;
      }
      while (paramInt1 != 0)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 192L, 1L, false);
        com.tencent.mm.plugin.report.service.h.mEJ.h(10420, new Object[] { Integer.valueOf(-1), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bi.VF()), Integer.valueOf(d.bL(ad.getContext())), Integer.valueOf(this.dVl), Integer.valueOf(this.dHI - this.startOffset) });
        this.diJ.a(4, -1, "", this);
        return;
        if ((paramString.rtW == null) || (paramString.rdX != paramString.rtW.siI))
        {
          com.tencent.mm.sdk.platformtools.x.e(this.TAG, "flood control, malformed data is null or dataLen not match with data buf length");
          paramInt1 = -1;
        }
        else if ((paramString.rdW < 0) || (paramString.rdW + paramString.rdX > paramString.rdV))
        {
          com.tencent.mm.sdk.platformtools.x.e(this.TAG, "flood control, malformed start pos");
          paramInt1 = -1;
        }
        else if (paramString.rdW != paramq.offset)
        {
          com.tencent.mm.sdk.platformtools.x.e(this.TAG, "flood control, malformed start_pos");
          paramInt1 = -1;
        }
        else if (paramString.rdV <= 0)
        {
          com.tencent.mm.sdk.platformtools.x.e(this.TAG, "flood control, malformed total_len");
          paramInt1 = -1;
        }
      }
    } while ((!a(paramq, paramString.rdV, paramString.rdW, paramString.rdX, paramString.rtW.siK.lR)) || (a(this.dIX, this.diJ) >= 0));
    this.diJ.a(3, -1, "", this);
  }
  
  protected final void cancel()
  {
    if ((!bi.oW(this.dVk)) && (com.tencent.mm.modelcdntran.g.ND() != null))
    {
      com.tencent.mm.sdk.platformtools.x.d(this.TAG, "cancel recv task");
      com.tencent.mm.modelcdntran.g.ND().lx(this.dVk);
    }
    super.cancel();
  }
  
  public final int getType()
  {
    return 109;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ak/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */