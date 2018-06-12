package com.tencent.mm.modelvideo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.bd.b;
import com.tencent.mm.model.m;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.c;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.so;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bc;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import junit.framework.Assert;

public final class d
  extends l
  implements k
{
  int dHI = 0;
  private al dHa = new al(new d.3(this), false);
  String dVk = "";
  String dVr = null;
  int dVs = 0;
  private i.a dVu = new d.1(this);
  private com.tencent.mm.ab.b diG;
  com.tencent.mm.ab.e diJ;
  boolean elU;
  boolean elV;
  r elW = null;
  com.tencent.mm.modelcdntran.j elX;
  int elY = com.tencent.mm.modelcdntran.b.MediaType_VIDEO;
  private boolean elZ = false;
  boolean ema = true;
  long emb = 0L;
  String fileName;
  private String mediaId;
  int retCode = 0;
  private int startOffset = 0;
  long startTime = 0L;
  
  public d(String paramString)
  {
    this(paramString, false);
  }
  
  public d(String paramString, boolean paramBoolean)
  {
    if (paramString != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.fileName = paramString;
      this.elU = paramBoolean;
      x.i("MicroMsg.NetSceneDownloadVideo", "%s NetSceneDownloadVideo:  file [%s] isCompleteOnlineVideo [%b]", new Object[] { SR(), paramString, Boolean.valueOf(paramBoolean) });
      return;
    }
  }
  
  private boolean SQ()
  {
    x.d("MicroMsg.NetSceneDownloadVideo", "%s parseVideoMsgXML content: %s", new Object[] { SR(), this.elW.Tm() });
    Object localObject4 = bl.z(this.elW.Tm(), "msg");
    if (localObject4 == null)
    {
      h.mEJ.a(111L, 214L, 1L, false);
      x.w("MicroMsg.NetSceneDownloadVideo", "%s cdntra parse video recv xml failed", new Object[] { SR() });
      return false;
    }
    String str1 = (String)((Map)localObject4).get(".msg.videomsg.$cdnvideourl");
    Object localObject1 = (String)((Map)localObject4).get(".msg.videomsg.$tpvideourl");
    if ((bi.oW(str1)) && (bi.oW((String)localObject1)))
    {
      h.mEJ.a(111L, 213L, 1L, false);
      x.w("MicroMsg.NetSceneDownloadVideo", "%s cdntra parse video recv xml failed", new Object[] { SR() });
      return false;
    }
    Object localObject5 = (String)((Map)localObject4).get(".msg.videomsg.$aeskey");
    this.dHI = bi.getInt((String)((Map)localObject4).get(".msg.videomsg.$length"), 0);
    String str2 = (String)((Map)localObject4).get(".msg.videomsg.$fileparam");
    this.dVk = com.tencent.mm.modelcdntran.d.a("downvideo", this.elW.createTime, this.elW.Tj(), this.elW.getFileName());
    if (bi.oW(this.dVk))
    {
      x.w("MicroMsg.NetSceneDownloadVideo", "%s cdntra genClientId failed not use cdn file:%s", new Object[] { SR(), this.elW.getFileName() });
      return false;
    }
    if ((!this.elU) && (this.dHI < 1048576) && (this.elW != null) && (this.elW.bSX > 0))
    {
      this.elU = true;
      x.i("MicroMsg.NetSceneDownloadVideo", "%s less 1M and had preload, reset isCompleteOnlineVideo [%b]", new Object[] { SR(), Boolean.valueOf(this.elU) });
    }
    Object localObject2 = (String)((Map)localObject4).get(".msg.videomsg.$md5");
    Object localObject3 = new StringBuilder();
    o.Ta();
    localObject3 = s.nK(this.fileName) + ".tmp";
    this.elX = new com.tencent.mm.modelcdntran.j();
    this.elX.filename = this.elW.getFileName();
    this.elX.dQk = ((String)localObject2);
    this.elX.dQl = this.dHI;
    this.elX.dQm = 0;
    this.elX.bSS = this.elW.Tk();
    this.elX.dQn = this.elW.Tj();
    com.tencent.mm.modelcdntran.j localj = this.elX;
    int i;
    label619:
    label784:
    label821:
    label945:
    int k;
    if (com.tencent.mm.model.s.fq(this.elW.Tj()))
    {
      i = m.gK(this.elW.Tj());
      localj.bSU = i;
      this.elX.field_mediaId = this.dVk;
      this.elX.field_fullpath = ((String)localObject3);
      this.elX.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_VIDEO;
      this.elX.field_totalLen = this.dHI;
      this.elX.field_aesKey = ((String)localObject5);
      this.elX.field_fileId = str1;
      this.elX.field_priority = com.tencent.mm.modelcdntran.b.dOk;
      this.elX.dPV = this.dVu;
      this.elX.field_wxmsgparam = str2;
      localObject5 = this.elX;
      if (!com.tencent.mm.model.s.fq(this.elW.Tj())) {
        break label1644;
      }
      i = 1;
      ((com.tencent.mm.modelcdntran.j)localObject5).field_chattype = i;
      this.elX.dQo = this.elW.dQo;
      if (!bi.oW((String)localObject1))
      {
        localObject4 = (String)((Map)localObject4).get(".msg.videomsg.$tpauthkey");
        this.elX.field_fileId = "";
        this.elX.field_fileType = 19;
        this.elX.field_authKey = ((String)localObject4);
        this.elX.dPW = ((String)localObject1);
      }
      localObject4 = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().I(this.elW.Tj(), this.elW.bYu);
      this.elX.dQq = ((cm)localObject4).field_createTime;
      this.elX.bYu = ((cm)localObject4).field_msgSvrId;
      localObject1 = com.tencent.mm.model.bd.iF(((cm)localObject4).cqb);
      localObject5 = this.elX;
      if (localObject1 == null) {
        break label1649;
      }
      i = ((bd.b)localObject1).dCB;
      ((com.tencent.mm.modelcdntran.j)localObject5).dQr = i;
      if (this.elW.Tj().equals(((cm)localObject4).field_talker))
      {
        localObject5 = this.elX;
        if (localObject1 != null) {
          break label1654;
        }
        i = 0;
        ((com.tencent.mm.modelcdntran.j)localObject5).field_limitrate = i;
      }
      x.d("MicroMsg.NetSceneDownloadVideo", "%s limitrate:%d file:%s", new Object[] { SR(), Integer.valueOf(this.elX.field_limitrate), this.elW.getFileName() });
      if (!com.tencent.mm.modelcdntran.g.ND().dPa.contains("video_" + this.elW.enN)) {
        break label1666;
      }
      com.tencent.mm.modelcdntran.g.ND().dPa.remove("video_" + this.elW.enN);
      this.elX.field_autostart = true;
      if (3 == this.elW.enT) {
        this.elX.field_smallVideoFlag = 1;
      }
      if ((bi.oW((String)localObject2)) || (this.elU)) {
        break label1697;
      }
      localObject1 = ((com.tencent.mm.plugin.t.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.t.a.a.class)).FY().de((String)localObject2, this.dHI);
      j = com.tencent.mm.a.e.cm((String)localObject1);
      k = this.dHI - j;
      o.Ta();
      localObject5 = s.nK(this.fileName);
      int m = com.tencent.mm.a.e.cm((String)localObject5);
      if (m > 0)
      {
        x.w("MicroMsg.NetSceneDownloadVideo", "%s already copy dup file, but download again, something error here.", new Object[] { SR() });
        bool = com.tencent.mm.a.e.deleteFile((String)localObject5);
        localObject1 = ((com.tencent.mm.plugin.t.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.t.a.a.class)).FY();
        int n = this.dHI;
        i = 0;
        if (!bi.oW((String)localObject2)) {
          i = ((bc)localObject1).diF.delete("MediaDuplication", "md5=? AND size=? AND status!=?", new String[] { localObject2, String.valueOf(n), "100" });
        }
        localObject1 = t.nW(this.fileName);
        ((r)localObject1).enH = 0;
        ((r)localObject1).bWA = 16;
        t.e((r)localObject1);
        x.w("MicroMsg.NetSceneDownloadVideo", "%s don't copy dup file, go to download now. target video len %d, delete file:%b,delete db: %d", new Object[] { SR(), Integer.valueOf(m), Boolean.valueOf(bool), Integer.valueOf(i) });
        localObject1 = "";
      }
      x.i("MicroMsg.NetSceneDownloadVideo", "%s MediaCheckDuplicationStorage: totallen:%s md5:%s  dup(len:%d path:%s) diffLen:%d to:%s target video len %d", new Object[] { SR(), Integer.valueOf(this.dHI), localObject2, Integer.valueOf(j), localObject1, Integer.valueOf(k), localObject3, Integer.valueOf(m) });
      if (bi.oW((String)localObject1)) {
        break label1683;
      }
      if ((k < 0) || (k > 16)) {
        break label1697;
      }
      x.i("MicroMsg.NetSceneDownloadVideo", "%s MediaCheckDuplicationStorage copy dup file now :%s -> %s", new Object[] { SR(), localObject1, localObject3 });
      com.tencent.mm.sdk.platformtools.j.fN((String)localObject1, (String)localObject3);
      iE(this.dHI);
      ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().a(new f.c(((cm)localObject4).field_talker, "update", (com.tencent.mm.storage.bd)localObject4));
      localObject1 = h.mEJ;
      long l1 = this.elW.bYu;
      long l2 = this.elW.createTime;
      localObject3 = this.elW.Tj();
      if (3 == this.elW.enT) {
        break label1677;
      }
      i = 43;
      label1428:
      ((h)localObject1).h(13267, new Object[] { str1, Long.valueOf(l1), localObject2, Long.valueOf(l2), localObject3, Integer.valueOf(i), Integer.valueOf(j) });
      i = 1;
      label1489:
      if (i != 0) {
        break label1729;
      }
      this.mediaId = this.elX.field_mediaId;
      this.emb = bi.VF();
      if (this.elW.videoFormat != 2) {
        break label1702;
      }
    }
    label1644:
    label1649:
    label1654:
    label1666:
    label1677:
    label1683:
    label1697:
    label1702:
    for (boolean bool = true;; bool = false)
    {
      this.elV = bool;
      x.i("MicroMsg.NetSceneDownloadVideo", "%s check use cdn isHadHevcLocalFile[%b] isCompleteOnlineVideo[%b]", new Object[] { SR(), Boolean.valueOf(this.elV), Boolean.valueOf(this.elU) });
      if ((!this.elV) && (this.elU)) {
        break label1942;
      }
      if (com.tencent.mm.modelcdntran.g.ND().b(this.elX, -1)) {
        break label1708;
      }
      h.mEJ.a(111L, 212L, 1L, false);
      x.e("MicroMsg.NetSceneDownloadVideo", "%s cdntra addSendTask failed.", new Object[] { SR() });
      this.dVk = "";
      return false;
      i = 0;
      break;
      i = 0;
      break label619;
      i = 0;
      break label784;
      i = ((bd.b)localObject1).dCz / 8;
      break label821;
      this.elX.field_autostart = false;
      break label945;
      i = 62;
      break label1428;
      this.dVr = ((String)localObject2);
      this.dVs = this.dHI;
      i = 0;
      break label1489;
    }
    label1708:
    if (this.elV) {
      h.mEJ.a(354L, 135L, 1L, false);
    }
    label1729:
    if (this.elW.enR != 1)
    {
      this.elW.enR = 1;
      this.elW.bWA = 524288;
      t.e(this.elW);
    }
    if (3 != this.elW.enT)
    {
      localObject1 = this.elW.Tj();
      if (!bi.oW((String)localObject1)) {
        if (!com.tencent.mm.model.s.fq((String)localObject1)) {
          break label2086;
        }
      }
    }
    label1942:
    label2086:
    for (int j = m.gK((String)localObject1);; j = 0) {
      for (;;)
      {
        try
        {
          localObject2 = ((ConnectivityManager)ad.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
          i = ((NetworkInfo)localObject2).getSubtype();
          k = ((NetworkInfo)localObject2).getType();
          if (k != 1) {
            continue;
          }
          i = 1;
        }
        catch (Exception localException)
        {
          x.e("MicroMsg.NetSceneDownloadVideo", "getNetType : %s", new Object[] { bi.i(localException) });
          i = 0;
          continue;
        }
        localObject1 = (String)localObject1 + "," + j + "," + str1 + "," + this.dHI + "," + i;
        x.i("MicroMsg.NetSceneDownloadVideo", "%s dk12024 report:%s", new Object[] { SR(), localObject1 });
        h.mEJ.k(12024, (String)localObject1);
        return true;
        this.ema = false;
        localObject1 = this.elX;
        o.Ta();
        ((com.tencent.mm.modelcdntran.j)localObject1).field_fullpath = s.nK(this.fileName);
        o.Tb().a(this.elX, false);
        break;
        if ((i == 13) || (i == 15) || (i == 14)) {
          i = 4;
        } else if ((i == 3) || (i == 4) || (i == 5) || (i == 6) || (i == 12)) {
          i = 3;
        } else if ((i == 1) || (i == 2)) {
          i = 2;
        } else {
          i = 0;
        }
      }
    }
  }
  
  protected final int Cc()
  {
    return 2500;
  }
  
  public final boolean KY()
  {
    boolean bool = super.KY();
    if (bool) {
      h.mEJ.a(111L, 210L, 1L, false);
    }
    return bool;
  }
  
  final String SR()
  {
    return this.fileName + "_" + hashCode();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    int i = 1;
    this.diJ = parame1;
    this.elW = t.nW(this.fileName);
    if (this.elW == null)
    {
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: Get INFO FAILED :" + this.fileName);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
      return -1;
    }
    if ((this.elW != null) && (3 == this.elW.enT)) {
      this.elY = com.tencent.mm.modelcdntran.b.MediaType_TinyVideo;
    }
    if (this.startTime == 0L)
    {
      this.startTime = bi.VF();
      this.startOffset = this.elW.enH;
    }
    if (SQ())
    {
      x.d("MicroMsg.NetSceneDownloadVideo", "cdntra use cdn return -1 for onGYNetEnd clientid:%s", new Object[] { this.fileName });
      return 0;
    }
    if (this.elW.status != 112)
    {
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: STATUS: " + this.elW.status + " [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "]");
      this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
      return -1;
    }
    x.d("MicroMsg.NetSceneDownloadVideo", "start doScene  [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "]  filesize:" + this.elW.enH + " file:" + this.elW.dHI + " netTimes:" + this.elW.enO);
    if (!t.nO(this.fileName))
    {
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: NET TIMES: " + this.elW.enO + " [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      t.nP(this.fileName);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
      return -1;
    }
    if (this.elW.bYu <= 0L)
    {
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: MSGSVRID: " + this.elW.bYu + " [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      t.nP(this.fileName);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
      return -1;
    }
    if ((this.elW.enH < 0) || (this.elW.dHI <= this.elW.enH) || (this.elW.dHI <= 0))
    {
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: fileSize:" + this.elW.enH + " total:" + this.elW.dHI + " [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      t.nP(this.fileName);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
      return -1;
    }
    parame1 = new b.a();
    parame1.dIG = new so();
    parame1.dIH = new sp();
    parame1.uri = "/cgi-bin/micromsg-bin/downloadvideo";
    parame1.dIF = 150;
    parame1.dII = 40;
    parame1.dIJ = 1000000040;
    this.diG = parame1.KT();
    parame1 = (so)this.diG.dID.dIL;
    parame1.rcq = this.elW.bYu;
    parame1.rdW = this.elW.enH;
    parame1.rdV = this.elW.dHI;
    if (ab.bU(ad.getContext())) {}
    for (;;)
    {
      parame1.rvT = i;
      return a(parame, this.diG, this);
      i = 2;
    }
  }
  
  protected final int a(q paramq)
  {
    paramq = (so)((com.tencent.mm.ab.b)paramq).dID.dIL;
    if ((paramq.rcq <= 0L) || (paramq.rdW < 0) || (paramq.rdV <= 0) || (paramq.rdV <= paramq.rdW))
    {
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: SECURITY CHECK FAILED [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      t.nP(this.fileName);
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if (this.elZ)
    {
      x.d("MicroMsg.NetSceneDownloadVideo", "onGYNetEnd Call Stop by Service  [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bi.oW(this.dVk)))
    {
      x.w("MicroMsg.NetSceneDownloadVideo", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.dVk });
      return;
    }
    paramArrayOfByte = (sp)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    paramq = (so)((com.tencent.mm.ab.b)paramq).dID.dIL;
    this.elW = t.nW(this.fileName);
    if (this.elW == null)
    {
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd Get INFO FAILED :" + this.fileName);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (this.elW.status == 113)
    {
      x.w("MicroMsg.NetSceneDownloadVideo", "onGYNetEnd STATUS PAUSE [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (this.elW.status != 112)
    {
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd STATUS ERR: status:" + this.elW.status + " [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0))
    {
      h.mEJ.a(111L, 208L, 1L, false);
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd SERVER FAILED errtype:" + paramInt2 + " errCode:" + paramInt3 + " [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      t.nP(this.fileName);
      h.mEJ.h(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bi.VF()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bL(ad.getContext())), Integer.valueOf(this.elY), Integer.valueOf(this.dHI - this.startOffset) });
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      h.mEJ.a(111L, 207L, 1L, false);
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd SERVER FAILED (SET PAUSE) errtype:" + paramInt2 + " errCode:" + paramInt3 + " [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      this.elW.status = 113;
      t.e(this.elW);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (bi.bC(paramArrayOfByte.rtW.siK.lR))
    {
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd Recv BUF ZERO length  [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      t.nP(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (paramArrayOfByte.rdW != paramq.rdW)
    {
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd OFFSET ERROR respStartPos:" + paramArrayOfByte.rdW + " reqStartPos:" + paramq.rdW + " [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      t.nP(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (paramArrayOfByte.rdV != paramq.rdV)
    {
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd respTotal:" + paramArrayOfByte.rdV + " reqTotal:" + paramq.rdV + " [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      t.nP(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (paramq.rdV < paramArrayOfByte.rdW)
    {
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd respTotal:" + paramArrayOfByte.rdV + " respStartPos:" + paramq.rdW + " [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      t.nP(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (paramArrayOfByte.rcq != paramq.rcq)
    {
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd respMsgId:" + paramArrayOfByte.rcq + " reqMsgId:" + paramq.rcq + " [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      t.nP(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    x.d("MicroMsg.NetSceneDownloadVideo", "onGYNetEnd respBuf:" + paramArrayOfByte.rtW.siI + " reqStartPos:" + paramq.rdW + " totallen:" + paramq.rdV + " [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
    o.Ta();
    int j = s.a(s.nK(this.fileName), paramq.rdW, paramArrayOfByte.rtW.siK.toByteArray());
    if (j < 0)
    {
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd WRITEFILE RET:" + j + " [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      t.nP(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (j > this.elW.dHI)
    {
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd WRITEFILE newOffset:" + j + " totalLen:" + this.elW.dHI + " [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      t.nP(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = this.fileName;
    paramArrayOfByte = t.nW(paramq);
    if (paramArrayOfByte == null)
    {
      x.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Ac() + " getinfo failed: " + paramq);
      paramInt1 = 0 - com.tencent.mm.compatible.util.g.getLine();
    }
    while (paramInt1 < 0)
    {
      x.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd updateAfterRecv Ret:" + paramInt1 + " newOffset :" + j + " [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      paramArrayOfByte.enH = j;
      paramArrayOfByte.enK = bi.VE();
      paramArrayOfByte.bWA = 1040;
      int i = 0;
      paramInt1 = i;
      if (paramArrayOfByte.dHI > 0)
      {
        paramInt1 = i;
        if (j >= paramArrayOfByte.dHI)
        {
          t.d(paramArrayOfByte);
          paramArrayOfByte.status = 199;
          paramArrayOfByte.bWA |= 0x100;
          x.i("MicroMsg.VideoLogic", "END!!!  updateRecv  file:" + paramq + " newsize:" + j + " total:" + paramArrayOfByte.dHI + " status:" + paramArrayOfByte.status + " netTimes:" + paramArrayOfByte.enO);
          paramInt1 = 1;
        }
      }
      x.d("MicroMsg.VideoLogic", "updateRecv " + com.tencent.mm.compatible.util.g.Ac() + " file:" + paramq + " newsize:" + j + " total:" + paramArrayOfByte.dHI + " status:" + paramArrayOfByte.status);
      if (!t.e(paramArrayOfByte)) {
        paramInt1 = 0 - com.tencent.mm.compatible.util.g.getLine();
      }
    }
    if (paramInt1 == 1)
    {
      h.mEJ.h(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bi.VF()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bL(ad.getContext())), Integer.valueOf(this.elY), Integer.valueOf(this.dHI - this.startOffset) });
      a.a(this.elW, 1);
      x.i("MicroMsg.NetSceneDownloadVideo", "!!!FIN [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "]");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (this.elZ)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.dHa.J(0L, 0L);
  }
  
  protected final void a(l.a parama)
  {
    h.mEJ.a(111L, 211L, 1L, false);
    t.nP(this.fileName);
  }
  
  protected final void cancel()
  {
    wk();
    super.cancel();
  }
  
  public final int getType()
  {
    return 150;
  }
  
  final void iE(int paramInt)
  {
    Object localObject;
    if (this.ema)
    {
      localObject = new StringBuilder();
      o.Ta();
      localObject = new File(s.nK(this.fileName) + ".tmp");
      o.Ta();
    }
    for (boolean bool = ((File)localObject).renameTo(new File(s.nK(this.fileName)));; bool = true)
    {
      com.tencent.mm.kernel.g.Em().H(new d.2(this, bool, paramInt));
      return;
      localObject = new StringBuilder();
      o.Ta();
      com.tencent.mm.a.e.deleteFile(s.nK(this.fileName) + ".tmp");
    }
  }
  
  final boolean wk()
  {
    boolean bool = false;
    if (!bi.oW(this.mediaId))
    {
      if (!this.elU) {
        break label59;
      }
      x.i("MicroMsg.NetSceneDownloadVideo", "%s cancel online video task.", new Object[] { SR() });
      o.Tb().k(this.mediaId, null);
    }
    for (;;)
    {
      bool = true;
      this.elZ = true;
      return bool;
      label59:
      x.i("MicroMsg.NetSceneDownloadVideo", "%s cancel offline video task.", new Object[] { SR() });
      com.tencent.mm.modelcdntran.g.ND().lx(this.mediaId);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelvideo/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */