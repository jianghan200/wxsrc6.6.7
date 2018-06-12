package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.ak.o;
import com.tencent.mm.g.a.ms;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.s;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.network.k;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bvm;
import com.tencent.mm.protocal.c.bvn;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.y.g.a;
import java.util.Map;

public final class al
  extends com.tencent.mm.ab.l
  implements k
{
  g.a bGT = null;
  String bJK;
  boolean dVC = true;
  String dVk = "";
  private i.a dVu = new al.1(this);
  private com.tencent.mm.ab.b diG;
  com.tencent.mm.ab.e diJ;
  private boolean dlR = false;
  int dlT = 0;
  keep_SceneResult dlU;
  com.tencent.mm.sdk.b.c dlW = new al.2(this);
  private String dwq = null;
  private boolean qAB = true;
  private long qAC = -1L;
  b qAe = null;
  long qAh = -1L;
  int retCode = 0;
  long startTime = 0L;
  String toUser;
  
  public al(long paramLong, String paramString1, String paramString2)
  {
    this.qAh = paramLong;
    this.dwq = paramString1;
    this.bJK = paramString2;
    paramString2 = new b.a();
    paramString2.dIG = new bvm();
    paramString2.dIH = new bvn();
    paramString2.uri = "/cgi-bin/micromsg-bin/uploadappattach";
    paramString2.dIF = 220;
    paramString2.dII = 105;
    paramString2.dIJ = 1000000105;
    this.diG = paramString2.KT();
    x.i("MicroMsg.NetSceneUploadAppAttach", "summerbig new NetSceneUploadAppAttach rowid[%d], emoticonmd5[%s], stack[%s]", new Object[] { Long.valueOf(paramLong), paramString1, bi.cjd() });
  }
  
  protected final int Cc()
  {
    return 3200;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    this.qAe = new b();
    if ((!ao.asF().b(this.qAh, this.qAe)) || (this.qAe == null))
    {
      x.e("MicroMsg.NetSceneUploadAppAttach", com.tencent.mm.compatible.util.g.Ac() + " summerbig get info failed rowid:" + this.qAh);
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.getLine());
      this.qAe = null;
      return -1;
    }
    if (this.qAe.field_status != 101L)
    {
      x.e("MicroMsg.NetSceneUploadAppAttach", com.tencent.mm.compatible.util.g.Ac() + " summerbig get field_status failed rowid:" + this.qAh + " status:" + this.qAe.field_status);
      return -1;
    }
    if (this.startTime == 0L)
    {
      this.startTime = bi.VF();
      this.qAC = this.qAe.field_offset;
    }
    x.i("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene rowid[%d], fileFullPath[%s], totalLen[%d],isUpload[%b], isUseCdn[%b], type[%d]", new Object[] { Long.valueOf(this.qAh), this.qAe.field_fileFullPath, Long.valueOf(this.qAe.field_totalLen), Boolean.valueOf(this.qAe.field_isUpload), Integer.valueOf(this.qAe.field_isUseCdn), Long.valueOf(this.qAe.field_type) });
    if (bi.oW(this.qAe.field_appId))
    {
      x.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene checkArgs : appId is null");
      if ((this.qAe.field_type != 8L) && (this.qAe.field_type != 6L))
      {
        this.retCode = (55536 - com.tencent.mm.compatible.util.g.getLine());
        return -1;
      }
    }
    int i;
    if ((this.qAe.field_type == 8L) || (this.qAe.field_type == 9L))
    {
      x.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra cdn not support Emoji or voiceremind now type:%d", new Object[] { Long.valueOf(this.qAe.field_type) });
      i = 0;
    }
    while (i != 0)
    {
      x.d("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene cdntra use cdn return -1 for onGYNetEnd client rowid:%d", new Object[] { Long.valueOf(this.qAh) });
      return 0;
      com.tencent.mm.modelcdntran.g.ND();
      if ((!com.tencent.mm.modelcdntran.c.hz(4)) && (this.qAe.field_isUseCdn != 1))
      {
        com.tencent.mm.modelcdntran.g.ND();
        x.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra not use cdn flag:%b getCdnInfo:%d", new Object[] { Boolean.valueOf(com.tencent.mm.modelcdntran.c.hz(4)), Integer.valueOf(this.qAe.field_isUseCdn) });
        i = 0;
      }
      else
      {
        au.HU();
        com.tencent.mm.storage.bd localbd = com.tencent.mm.model.c.FT().dW(this.qAe.field_msgInfoId);
        if (localbd.field_msgId != this.qAe.field_msgInfoId)
        {
          x.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra read msg info failed msgId[%d], rowid[%d], createtime[%d], len[%d], status[%d], upload[%b], useCdn[%d], mediaId[%s]", new Object[] { Long.valueOf(this.qAe.field_msgInfoId), Long.valueOf(this.qAe.sKx), Long.valueOf(this.qAe.field_createTime), Long.valueOf(this.qAe.field_totalLen), Long.valueOf(this.qAe.field_status), Boolean.valueOf(this.qAe.field_isUpload), Integer.valueOf(this.qAe.field_isUseCdn), this.qAe.field_mediaId });
          this.toUser = null;
          i = 0;
        }
        else
        {
          this.toUser = localbd.field_talker;
          parame1 = "";
          if (!bi.oW(localbd.field_imgPath)) {
            parame1 = o.Pf().lN(localbd.field_imgPath);
          }
          int k = com.tencent.mm.a.e.cm(parame1);
          int m = com.tencent.mm.a.e.cm(this.qAe.field_fileFullPath);
          if (k >= com.tencent.mm.modelcdntran.b.dOG)
          {
            x.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra thumb[%s][%d] Too Big Not Use CDN TRANS", new Object[] { parame1, Integer.valueOf(k) });
            i = 0;
          }
          else
          {
            this.dVk = com.tencent.mm.modelcdntran.d.a("upattach", this.qAe.field_createTime, localbd.field_talker, this.qAh);
            x.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra genClientId field_createTime[%d], useCdnTransClientId[%s]", new Object[] { Long.valueOf(this.qAe.field_createTime), this.dVk });
            if (bi.oW(this.dVk))
            {
              x.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra genClientId failed not use cdn rowid:%d", new Object[] { Long.valueOf(this.qAh) });
              i = 0;
            }
            else
            {
              i locali = new i();
              String str = localbd.field_content;
              localObject = str;
              if (s.fq(localbd.field_talker))
              {
                i = com.tencent.mm.model.bd.iA(localbd.field_content);
                localObject = str;
                if (i != -1) {
                  localObject = (localbd.field_content + " ").substring(i + 2).trim();
                }
              }
              this.bGT = g.a.gp(bi.WT((String)localObject));
              label1058:
              int j;
              label1103:
              label1126:
              boolean bool;
              if (this.bGT != null)
              {
                x.d("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra amc.cdnAttachUrl[%s], amc.aesKey[%s], amc.filemd5[%s], amc.type[%d]", new Object[] { this.bGT.dwD, bi.Xf(this.bGT.dwK), this.bGT.filemd5, Integer.valueOf(this.bGT.type) });
                locali.field_fileId = this.bGT.dwD;
                locali.field_aesKey = this.bGT.dwK;
                locali.field_filemd5 = this.bGT.filemd5;
                if ((this.bGT.dws != 0) || (this.bGT.dwo > 26214400))
                {
                  i = 1;
                  locali.dPV = this.dVu;
                  locali.field_mediaId = this.dVk;
                  locali.field_fullpath = this.qAe.field_fileFullPath;
                  locali.field_thumbpath = parame1;
                  if (i == 0) {
                    break label1483;
                  }
                  j = com.tencent.mm.modelcdntran.b.dOm;
                  locali.field_fileType = j;
                  if (i == 0) {
                    break label1491;
                  }
                  localObject = bi.oV(this.qAe.field_signature);
                  locali.field_svr_signature = ((String)localObject);
                  if (i == 0) {
                    break label1498;
                  }
                  bool = bi.oW(this.qAe.field_signature);
                  label1149:
                  locali.field_onlycheckexist = bool;
                  locali.field_fake_bigfile_signature_aeskey = this.qAe.field_fakeAeskey;
                  locali.field_fake_bigfile_signature = this.qAe.field_fakeSignature;
                  locali.field_talker = localbd.field_talker;
                  locali.field_priority = com.tencent.mm.modelcdntran.b.dOk;
                  locali.field_totalLen = m;
                  locali.field_needStorage = false;
                  locali.field_isStreamMedia = false;
                  locali.field_enable_hitcheck = this.dVC;
                  if (!s.fq(localbd.field_talker)) {
                    break label1504;
                  }
                }
              }
              label1483:
              label1491:
              label1498:
              label1504:
              for (i = 1;; i = 0)
              {
                locali.field_chattype = i;
                locali.field_force_aeskeycdn = false;
                locali.field_trysafecdn = true;
                x.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra checkUseCdn msgId:%d file[%s][%d] thumb[%s][%d], useCdnTransClientId[%s], fileType[%d], enable_hitcheck[%b], onlycheckexist[%b] force_aeskeycdn[%b] trysafecdn[%b] aeskey[%s], md5[%s], signature[%s], faeskey[%s], fsignature[%s]", new Object[] { Long.valueOf(this.qAe.field_msgInfoId), locali.field_fullpath, Integer.valueOf(m), parame1, Integer.valueOf(k), this.dVk, Integer.valueOf(locali.field_fileType), Boolean.valueOf(locali.field_enable_hitcheck), Boolean.valueOf(locali.field_onlycheckexist), Boolean.valueOf(locali.field_force_aeskeycdn), Boolean.valueOf(locali.field_trysafecdn), bi.Xf(locali.field_aesKey), locali.field_filemd5, bi.Xf(locali.field_svr_signature), bi.Xf(locali.field_fake_bigfile_signature_aeskey), bi.Xf(locali.field_fake_bigfile_signature) });
                if (com.tencent.mm.modelcdntran.g.ND().c(locali)) {
                  break label1509;
                }
                x.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra addSendTask failed.");
                this.dVk = "";
                i = 0;
                break;
                i = 0;
                break label1058;
                x.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra parse content xml failed");
                i = 0;
                break label1058;
                j = com.tencent.mm.modelcdntran.b.MediaType_FILE;
                break label1103;
                localObject = "";
                break label1126;
                bool = false;
                break label1149;
              }
              label1509:
              if (this.qAe.field_isUseCdn != 1)
              {
                this.qAe.field_isUseCdn = 1;
                bool = ao.asF().c(this.qAe, new String[0]);
                if (!bool)
                {
                  x.e("MicroMsg.NetSceneUploadAppAttach", "summerbig checkUseCdn update info ret:" + bool);
                  this.retCode = (55536 - com.tencent.mm.compatible.util.g.getLine());
                  this.diJ.a(3, -1, "", this);
                  i = 0;
                  continue;
                }
              }
              x.i("MicroMsg.NetSceneUploadAppAttach", "summerbig checkUseCdn ret true useCdnTransClientId[%s]", new Object[] { this.dVk });
              i = 1;
            }
          }
        }
      }
    }
    if (this.qAe.field_netTimes > 3200L)
    {
      l.fK(this.qAe.sKx);
      x.e("MicroMsg.NetSceneUploadAppAttach", com.tencent.mm.compatible.util.g.Ac() + " summerbig doScene info.field_netTimes > DOSCENE_LIMIT SET ERROR! rowid:" + this.qAh);
      return -1;
    }
    parame1 = this.qAe;
    parame1.field_netTimes += 1L;
    if (bi.oW(this.qAe.field_clientAppDataId))
    {
      x.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene checkArgs : clientAppDataId is null");
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.getLine());
      return -1;
    }
    if ((this.qAe.field_totalLen <= 0L) || (this.qAe.field_totalLen > 26214400L))
    {
      x.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene checkArgs : totalLen is invalid, totalLen = " + this.qAe.field_totalLen);
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.getLine());
      if (this.qAe.field_totalLen > 26214400L) {
        l.fK(this.qAe.sKx);
      }
      return -1;
    }
    if (bi.oW(this.qAe.field_fileFullPath))
    {
      x.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene checkArgs : fileFullPath is null");
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.getLine());
      return -1;
    }
    if (com.tencent.mm.a.e.cm(this.qAe.field_fileFullPath) > 26214400)
    {
      x.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene doScene : file is too large");
      l.fK(this.qAe.sKx);
      return -1;
    }
    if (bi.oW(this.dwq)) {}
    for (parame1 = com.tencent.mm.a.e.f(this.qAe.field_fileFullPath, (int)this.qAe.field_offset, 8192); bi.bC(parame1); parame1 = com.tencent.mm.a.e.f(this.qAe.field_fileFullPath, (int)this.qAe.field_offset, 32768))
    {
      x.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene doScene : data is null");
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.getLine());
      return -1;
    }
    Object localObject = (bvm)this.diG.dID.dIL;
    ((bvm)localObject).jQb = this.qAe.field_appId;
    ((bvm)localObject).rdn = ((int)this.qAe.field_sdkVer);
    ((bvm)localObject).ssa = this.qAe.field_clientAppDataId;
    ((bvm)localObject).hcE = ((int)this.qAe.field_type);
    ((bvm)localObject).hbL = com.tencent.mm.model.q.GF();
    ((bvm)localObject).rdV = ((int)this.qAe.field_totalLen);
    ((bvm)localObject).rdW = ((int)this.qAe.field_offset);
    if ((this.dwq != null) && (this.qAB))
    {
      ((bvm)localObject).rwt = this.dwq;
      ((bvm)localObject).rdV = ((int)this.qAe.field_totalLen);
      ((bvm)localObject).rdX = 0;
      ((bvm)localObject).rtW = new bhy().bq(new byte[0]);
      this.qAB = false;
      return a(parame, this.diG, this);
    }
    ((bvm)localObject).rdX = parame1.length;
    ((bvm)localObject).rtW = new bhy().bq(parame1);
    if (this.dwq != null) {
      ((bvm)localObject).rwt = this.dwq;
    }
    return a(parame, this.diG, this);
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd : errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bi.oW(this.dVk))) {
      x.w("MicroMsg.NetSceneUploadAppAttach", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.dVk });
    }
    do
    {
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        x.e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd : errType = " + paramInt2 + ", errCode = " + paramInt3);
        this.retCode = (55536 - com.tencent.mm.compatible.util.g.getLine());
        if (paramInt2 == 4) {
          h.mEJ.h(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bi.VF()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bL(ad.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Long.valueOf(this.qAe.field_totalLen - this.qAC) });
        }
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      paramString = (bvn)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      if ((paramString.jQb != null) && (this.dwq == null) && ((!paramString.jQb.equals(this.qAe.field_appId)) || (!paramString.ssa.equals(this.qAe.field_clientAppDataId))))
      {
        x.e("MicroMsg.NetSceneUploadAppAttach", "argument is not consistent");
        this.retCode = (55536 - com.tencent.mm.compatible.util.g.getLine());
        this.diJ.a(3, -1, "", this);
        return;
      }
      if ((paramString.rdV < 0) || (paramString.rdV != this.qAe.field_totalLen) || (paramString.rdW < 0) || (paramString.rdW > this.qAe.field_totalLen))
      {
        x.e("MicroMsg.NetSceneUploadAppAttach", "dataLen, startPos or totalLen is incorrect");
        this.retCode = (55536 - com.tencent.mm.compatible.util.g.getLine());
        this.diJ.a(3, -1, "", this);
        return;
      }
      this.qAe.field_offset = paramString.rdW;
      paramq = this.qAe;
      if (l.SX(paramString.rvP)) {}
      for (paramString = paramString.rvP;; paramString = "")
      {
        paramq.field_mediaSvrId = paramString;
        if (this.qAe.field_status != 105L) {
          break;
        }
        x.w("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd STATUS PAUSE [" + this.qAe.field_mediaSvrId + "," + this.qAe.field_offset + "] ");
        this.diJ.a(paramInt2, -1, "", this);
        return;
      }
      if (this.qAe.field_offset == this.qAe.field_totalLen)
      {
        if (bi.oW(this.qAe.field_mediaSvrId))
        {
          x.e("MicroMsg.NetSceneUploadAppAttach", "finish upload but mediaid == null!");
          this.retCode = (55536 - com.tencent.mm.compatible.util.g.getLine());
          this.diJ.a(3, -1, "", this);
          l.fK(this.qAe.sKx);
          return;
        }
        this.qAe.field_status = 199L;
        h.mEJ.h(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bi.VF()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bL(ad.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Long.valueOf(this.qAe.field_totalLen - this.qAC) });
      }
      boolean bool = ao.asF().c(this.qAe, new String[0]);
      if (!bool)
      {
        x.e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd update info ret:" + bool);
        this.retCode = (55536 - com.tencent.mm.compatible.util.g.getLine());
        d(null);
        this.diJ.a(3, -1, "", this);
        return;
      }
      if (this.qAe.field_status == 199L)
      {
        this.diJ.a(0, 0, "", this);
        return;
      }
    } while (a(this.dIX, this.diJ) >= 0);
    x.e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd : doScene fail");
    this.diJ.a(3, -1, "", this);
  }
  
  final void d(keep_SceneResult paramkeep_SceneResult)
  {
    if (this.qAe.field_type != 2L) {}
    do
    {
      return;
      com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.Jx().fJ("100131");
      if (localc.isValid()) {
        this.dlT = ai.getInt((String)localc.ckq().get("needUploadData"), 1);
      }
    } while ((this.dlR) || (this.dlT == 0));
    this.dlU = paramkeep_SceneResult;
    this.dlR = true;
    paramkeep_SceneResult = new ms();
    a.sFg.b(this.dlW);
    paramkeep_SceneResult.bXH.filePath = this.qAe.field_fileFullPath;
    a.sFg.m(paramkeep_SceneResult);
  }
  
  public final int getType()
  {
    return 220;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */