package com.tencent.mm.pluginsdk.model.app;

import android.util.Base64;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.g.a.n;
import com.tencent.mm.g.a.n.a;
import com.tencent.mm.g.a.ua;
import com.tencent.mm.g.a.ua.a;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.m;
import com.tencent.mm.model.t;
import com.tencent.mm.model.u;
import com.tencent.mm.model.u.b;
import com.tencent.mm.modelcdntran.d;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bke;
import com.tencent.mm.protocal.c.bkf;
import com.tencent.mm.protocal.c.bqu;
import com.tencent.mm.protocal.c.bqw;
import com.tencent.mm.protocal.c.df;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.y.g.a;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import junit.framework.Assert;

public final class ai
  extends l
  implements k
{
  long bJC = 0L;
  bd bXQ = null;
  String dVk = "";
  private i.a dVu = new i.a()
  {
    public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, final keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
    {
      x.d("MicroMsg.NetSceneSendAppMsg", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { ai.this.dVk, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult });
      if (paramAnonymousInt == 44531)
      {
        x.d("MicroMsg.NetSceneSendAppMsg", "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", new Object[] { ai.this.dVk });
        return 0;
      }
      if (paramAnonymousInt != 0)
      {
        ai.this.bXQ.setStatus(5);
        com.tencent.mm.plugin.report.f.mDy.a(111L, 34L, 1L, true);
        au.HU();
        com.tencent.mm.model.c.FT().a(ai.this.bXQ.field_msgId, ai.this.bXQ);
        com.tencent.mm.plugin.report.service.h.mEJ.h(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(ai.this.startTime), Long.valueOf(bi.VF()), Integer.valueOf(d.bL(ad.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Integer.valueOf(0), "" });
        ai.this.diJ.a(3, paramAnonymousInt, "", ai.this);
        return 0;
      }
      if (paramAnonymouskeep_SceneResult != null)
      {
        if (paramAnonymouskeep_SceneResult.field_retCode != 0)
        {
          x.e("MicroMsg.NetSceneSendAppMsg", "cdntra sceneResult.retCode :%d arg[%s] info[%s]", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), paramAnonymouskeep_SceneResult.field_arg, paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
          ai.this.bXQ.setStatus(5);
          com.tencent.mm.plugin.report.f.mDy.a(111L, 34L, 1L, true);
          au.HU();
          com.tencent.mm.model.c.FT().a(ai.this.bXQ.field_msgId, ai.this.bXQ);
          com.tencent.mm.plugin.report.service.h.mEJ.h(10421, new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(1), Long.valueOf(ai.this.startTime), Long.valueOf(bi.VF()), Integer.valueOf(d.bL(ad.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
          com.tencent.mm.plugin.report.service.h.mEJ.h(13937, new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(1), Long.valueOf(ai.this.startTime), Long.valueOf(bi.VF()), Integer.valueOf(d.bL(ad.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
          ai.this.diJ.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", ai.this);
        }
      }
      else {
        return 0;
      }
      if ((ai.this.emx > 0) && (paramAnonymouskeep_SceneResult.field_fileLength > 0))
      {
        paramAnonymousString = ai.this.emx + "," + paramAnonymouskeep_SceneResult.field_fileLength + "," + paramAnonymouskeep_SceneResult.field_fileId;
        if (ai.this.emx * 2 <= paramAnonymouskeep_SceneResult.field_fileLength) {
          break label905;
        }
      }
      label905:
      for (boolean bool = true;; bool = false)
      {
        ak.r("SendAppMsgThumbTooBig", paramAnonymousString, bool);
        x.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn cdnCallback upload attach by cdn, isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], aesKey[%s], md5[%s]", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_UploadHitCacheType), Boolean.valueOf(paramAnonymousBoolean), Boolean.valueOf(paramAnonymouskeep_SceneResult.field_exist_whencheck), bi.Xf(paramAnonymouskeep_SceneResult.field_aesKey), paramAnonymouskeep_SceneResult.field_filemd5 });
        au.DF().a(new aj(ai.this.bJC, false, paramAnonymouskeep_SceneResult, new aj.a()
        {
          public final void bp(int paramAnonymous2Int1, int paramAnonymous2Int2)
          {
            x.d("MicroMsg.NetSceneSendAppMsg", "summersafecdn cdntra NetSceneSendAppMsgForCdn callback %d,%d", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2) });
            com.tencent.mm.plugin.report.service.h.mEJ.h(10421, new Object[] { Integer.valueOf(paramAnonymous2Int2), Integer.valueOf(1), Long.valueOf(ai.this.startTime), Long.valueOf(bi.VF()), Integer.valueOf(d.bL(ad.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
            ai.this.diJ.a(paramAnonymous2Int1, paramAnonymous2Int2, "", ai.this);
          }
        }, ai.this.fmS, null), 0);
        break;
      }
    }
    
    public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream) {}
    
    public final byte[] i(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
    {
      return null;
    }
  };
  private com.tencent.mm.ab.b diG;
  com.tencent.mm.ab.e diJ;
  int emx = 0;
  String fmS;
  private ua nol;
  private String ogj;
  private n qAu;
  long startTime = 0L;
  
  public ai(long paramLong, String paramString1, String paramString2)
  {
    this.bJC = paramLong;
    this.fmS = paramString1;
    this.ogj = paramString2;
    b.a locala = new b.a();
    locala.dIG = new bke();
    locala.dIH = new bkf();
    locala.uri = "/cgi-bin/micromsg-bin/sendappmsg";
    locala.dIF = 222;
    locala.dII = 107;
    locala.dIJ = 1000000107;
    this.diG = locala.KT();
    x.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn NetSceneSendAppMsg msgid[%d], sessionid[%s], signature[%s], stack[%s]", new Object[] { Long.valueOf(paramLong), paramString1, bi.Xf(paramString2), bi.cjd() });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    if (this.startTime == 0L) {
      this.startTime = bi.VF();
    }
    au.HU();
    this.bXQ = com.tencent.mm.model.c.FT().dW(this.bJC);
    if ((this.bXQ == null) || (this.bXQ.field_msgId != this.bJC)) {
      return -1;
    }
    parame1 = g.a.gp(this.bXQ.field_content);
    Object localObject1;
    if (parame1 == null)
    {
      localObject1 = an.YJ(this.bXQ.field_content);
      if (bi.oW(((an)localObject1).taT))
      {
        parame1 = new g.a();
        parame1.dwq = ((an)localObject1).bKg;
        parame1.type = 8;
        x.i("MicroMsg.NetSceneSendAppMsg", "create new content. loss appid");
      }
    }
    for (;;)
    {
      localObject1 = "content != null [[" + this.bXQ.field_content + "]]";
      if (parame1 != null) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue((String)localObject1, bool);
        if (parame1 != null) {
          break label205;
        }
        this.bXQ = null;
        return -1;
        parame1 = g.a.gp(((an)localObject1).taT);
        break;
      }
      label205:
      if (!bi.oW(this.bXQ.field_imgPath)) {}
      String str;
      for (localObject1 = com.tencent.mm.ak.o.Pf().lN(this.bXQ.field_imgPath);; localObject1 = "")
      {
        if ((parame1.type == 8) || (parame1.type == 9) || (parame1.type == 6))
        {
          x.i("MicroMsg.NetSceneSendAppMsg", "cdntra cdn not support Emoji or voiceremind now type:%d", new Object[] { Integer.valueOf(parame1.type) });
          i = 0;
        }
        Object localObject2;
        while (i != 0)
        {
          x.d("MicroMsg.NetSceneSendAppMsg", "cdntra use cdn return -1 for onGYNetEnd clientId:%s", new Object[] { this.dVk });
          return 0;
          if (bi.oW((String)localObject1))
          {
            x.i("MicroMsg.NetSceneSendAppMsg", "cdntra cdn not support no thumb msg type:%d", new Object[] { Integer.valueOf(parame1.type) });
            i = 0;
          }
          else
          {
            this.emx = com.tencent.mm.a.e.cm((String)localObject1);
            if ((parame1.type != 33) && (parame1.type != 36) && (this.emx >= 262144))
            {
              x.w("MicroMsg.NetSceneSendAppMsg", "cdntra thumb[%s][%d] Too Big Not Use CDN TRANS", new Object[] { localObject1, Integer.valueOf(this.emx) });
              i = 0;
            }
            else
            {
              x.i("MicroMsg.NetSceneSendAppMsg", "cdntra content.type:%d  thumbPath:%s,  thumbLength:%d ", new Object[] { Integer.valueOf(parame1.type), localObject1, Integer.valueOf(this.emx) });
              if (!bi.oW(parame1.bGP))
              {
                x.w("MicroMsg.NetSceneSendAppMsg", "cdntra attach has been upload by cdn msgid:%d", new Object[] { Long.valueOf(this.bJC) });
                i = 0;
              }
              else
              {
                com.tencent.mm.modelcdntran.g.ND();
                if (!com.tencent.mm.modelcdntran.c.hz(4))
                {
                  com.tencent.mm.modelcdntran.g.ND();
                  x.w("MicroMsg.NetSceneSendAppMsg", "cdntra not use cdn flag:%b ", new Object[] { Boolean.valueOf(com.tencent.mm.modelcdntran.c.hz(4)) });
                  i = 0;
                }
                else
                {
                  this.dVk = d.a("upappmsg", this.bXQ.field_createTime, this.bXQ.field_talker, this.bXQ.field_msgId);
                  if (bi.oW(this.dVk))
                  {
                    x.w("MicroMsg.NetSceneSendAppMsg", "cdntra genClientId failed not use cdn msgid:%d", new Object[] { Long.valueOf(this.bXQ.field_msgId) });
                    i = 0;
                  }
                  else
                  {
                    localObject2 = new i();
                    ((i)localObject2).dPV = this.dVu;
                    ((i)localObject2).field_mediaId = this.dVk;
                    ((i)localObject2).field_fullpath = "";
                    ((i)localObject2).field_thumbpath = ((String)localObject1);
                    ((i)localObject2).field_fileType = com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE;
                    ((i)localObject2).field_talker = this.bXQ.field_talker;
                    ((i)localObject2).field_priority = com.tencent.mm.modelcdntran.b.dOk;
                    ((i)localObject2).field_needStorage = false;
                    ((i)localObject2).field_isStreamMedia = false;
                    ((i)localObject2).dPV = this.dVu;
                    ((i)localObject2).field_force_aeskeycdn = true;
                    ((i)localObject2).field_trysafecdn = false;
                    x.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn cdntra checkUseCdn content.type[%d], thumb[%s], useCdnTransClientId[%s], fileType[%d], enable_hitcheck[%b], onlycheckexist[%b], force_aeskeycdn[%b], trysafecdn[%b]", new Object[] { Integer.valueOf(parame1.type), localObject1, this.dVk, Integer.valueOf(((i)localObject2).field_fileType), Boolean.valueOf(((i)localObject2).field_enable_hitcheck), Boolean.valueOf(((i)localObject2).field_onlycheckexist), Boolean.valueOf(((i)localObject2).field_force_aeskeycdn), Boolean.valueOf(((i)localObject2).field_trysafecdn) });
                    if (!com.tencent.mm.modelcdntran.g.ND().c((i)localObject2))
                    {
                      x.e("MicroMsg.NetSceneSendAppMsg", "cdntra addSendTask failed.");
                      this.dVk = "";
                      i = 0;
                    }
                    else
                    {
                      i = 1;
                    }
                  }
                }
              }
            }
          }
        }
        bke localbke = (bke)this.diG.dID.dIL;
        df localdf = new df();
        localdf.jQb = parame1.appId;
        localdf.rdo = (this.bXQ.field_talker + this.bXQ.field_msgId + "T" + this.bXQ.field_createTime);
        localdf.jSA = g.a.a(parame1, null, null, 0, 0);
        localdf.lOH = ((int)bi.VE());
        localdf.jTu = this.bXQ.field_talker;
        localdf.jTv = com.tencent.mm.model.q.GF();
        localdf.hcE = parame1.type;
        localdf.rdn = parame1.sdkVer;
        localdf.rdq = parame1.dwr;
        u.b localb;
        bqw localbqw;
        if (com.tencent.mm.ac.f.eZ(this.bXQ.field_talker))
        {
          localdf.rco = com.tencent.mm.ac.a.e.lg(this.bXQ.cqb);
          localdf.rds = parame1.bZJ;
          localdf.rdt = parame1.bZK;
          localdf.rdu = parame1.bZL;
          localb = u.Hx().ib(this.fmS);
          if (localb != null)
          {
            this.nol = new ua();
            this.nol.cfH.url = parame1.url;
            this.nol.cfH.cfI = localb.getString("prePublishId", "");
            this.nol.cfH.cfK = localb.getString("preUsername", "");
            this.nol.cfH.cfL = localb.getString("preChatName", "");
            this.nol.cfH.cfM = localb.getInt("preMsgIndex", 0);
            this.nol.cfH.cfQ = localb.getInt("sendAppMsgScene", 0);
            this.nol.cfH.cfR = localb.getInt("getA8KeyScene", 0);
            this.nol.cfH.cfS = localb.getString("referUrl", null);
            this.nol.cfH.cfT = localb.getString("adExtStr", null);
            this.nol.cfH.cfN = this.bXQ.field_talker;
            this.nol.cfH.cfU = parame1.title;
            au.HU();
            localObject2 = com.tencent.mm.model.c.FR().Yg(this.bXQ.field_talker);
            if (localObject2 != null) {
              this.nol.cfH.cfO = ((ab)localObject2).BK();
            }
            this.nol.cfH.cfP = m.gK(this.bXQ.field_talker);
            str = "";
            localObject2 = str;
            if (parame1.bZN != null)
            {
              localbqw = new bqw();
              localObject2 = Base64.decode(parame1.bZN, 0);
            }
          }
        }
        try
        {
          localbqw.aG((byte[])localObject2);
          localObject2 = str;
          if (localbqw.soY != null) {
            localObject2 = localbqw.soY.jLY;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            int j;
            Object localObject3 = str;
          }
        }
        localbke.sjU = String.format(Locale.US, "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s", new Object[] { this.nol.cfH.cfI, this.nol.cfH.cfK, this.nol.cfH.cfL, Integer.valueOf(t.N(this.nol.cfH.cfK, this.nol.cfH.cfL)), Integer.valueOf(this.nol.cfH.cfR), localObject2 });
        if ((localb != null) && (parame1.type == 33))
        {
          this.qAu = new n();
          i = localb.getInt("fromScene", 1);
          this.qAu.bGE.scene = i;
          j = localb.getInt("appservicetype", 0);
          this.qAu.bGE.bGM = j;
          localObject2 = localb.getString("preChatName", "");
          if (2 == i)
          {
            str = localb.getString("preUsername", "");
            this.qAu.bGE.bGG = ((String)localObject2 + ":" + str);
            label1640:
            localObject2 = this.bXQ.field_talker;
            bool = localb.getBoolean("moreRetrAction", false);
            if (!((String)localObject2).endsWith("@chatroom")) {
              break label2033;
            }
            localObject2 = this.qAu.bGE;
            if (!bool) {
              break label2028;
            }
            i = 5;
            label1687:
            ((n.a)localObject2).action = i;
            this.qAu.bGE.bGF = (parame1.dyZ + 1);
            this.qAu.bGE.bGH = parame1.dyR;
            this.qAu.bGE.bGy = parame1.dyS;
            this.qAu.bGE.appId = parame1.dyT;
            this.qAu.bGE.bGJ = bi.VE();
            this.qAu.bGE.bGK = 1;
          }
        }
        else
        {
          x.d("MicroMsg.NetSceneSendAppMsg", "SnsPostOperationFields: ShareUrlOriginal=%s, ShareUrlOpen=%s, JsAppId=%s", new Object[] { parame1.bZJ, parame1.bZK, parame1.bZL });
          if (!bi.oW((String)localObject1))
          {
            localObject2 = com.tencent.mm.a.e.e((String)localObject1, 0, -1);
            if (!bi.bC((byte[])localObject2)) {
              localdf.rdp = new bhy().bq((byte[])localObject2);
            }
          }
          if (localdf.rdp == null) {
            break label2063;
          }
        }
        label2028:
        label2033:
        label2063:
        for (int i = localdf.rdp.siI;; i = -1)
        {
          x.d("MicroMsg.NetSceneSendAppMsg", "doScene thumbFile:[%s] thumbdata:%d", new Object[] { localObject1, Integer.valueOf(i) });
          localbke.sjS = localdf;
          if ((parame1.dws != 0) || (parame1.dwo > 26214400)) {
            localbke.rdY = com.tencent.mm.modelcdntran.b.dOm;
          }
          localbke.rwk = parame1.filemd5;
          localbke.eJK = this.ogj;
          x.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn file md5[%s], signature[%s], type[%d], fromScene[%s]", new Object[] { localbke.rwk, bi.Xf(localbke.eJK), Integer.valueOf(localbke.rdY), localbke.sjU });
          return a(parame, this.diG, this);
          localdf.rco = bf.Ir();
          break;
          this.qAu.bGE.bGG = ((String)localObject2);
          break label1640;
          i = 2;
          break label1687;
          localObject2 = this.qAu.bGE;
          if (bool) {}
          for (i = 4;; i = 1)
          {
            ((n.a)localObject2).action = i;
            break;
          }
        }
      }
    }
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn cdntra onGYNetEnd [%d,%d,%s] msgId:%d, oldContent[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Long.valueOf(this.bJC), this.bXQ.field_content });
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bi.oW(this.dVk)))
    {
      x.w("MicroMsg.NetSceneSendAppMsg", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.dVk });
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.bXQ.setStatus(5);
      com.tencent.mm.plugin.report.f.mDy.a(111L, 34L, 1L, true);
      au.HU();
      com.tencent.mm.model.c.FT().a(this.bXQ.field_msgId, this.bXQ);
      x.e("MicroMsg.NetSceneSendAppMsg", "send app msg failed, err=" + paramInt2 + "," + paramInt3 + ", msgId " + this.bXQ.field_msgId);
      if (paramInt2 == 4) {
        com.tencent.mm.plugin.report.service.h.mEJ.h(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bi.VF()), Integer.valueOf(d.bL(ad.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE), Integer.valueOf(0) });
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramArrayOfByte = (bkf)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    bke localbke = (bke)((com.tencent.mm.ab.b)paramq).dID.dIL;
    this.bXQ.setStatus(2);
    this.bXQ.ax(paramArrayOfByte.rcq);
    au.HU();
    com.tencent.mm.model.c.FT().a(this.bXQ.field_msgId, this.bXQ);
    com.tencent.mm.modelstat.b.ehL.a(this.bXQ, com.tencent.mm.y.h.g(this.bXQ));
    if ((this.nol != null) && (!bi.oW(this.nol.cfH.url)))
    {
      this.nol.cfH.cfJ = ("msg_" + Long.toString(paramArrayOfByte.rcq));
      a.sFg.m(this.nol);
    }
    paramArrayOfByte = g.a.gp(this.bXQ.field_content);
    if ((paramArrayOfByte != null) && ("wx4310bbd51be7d979".equals(paramArrayOfByte.appId))) {
      if ((bi.oW(this.bXQ.field_talker)) || (!this.bXQ.field_talker.endsWith("@chatroom"))) {
        break label762;
      }
    }
    label762:
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      paramq = "";
      try
      {
        paramArrayOfByte = URLEncoder.encode(paramArrayOfByte.description, "UTF-8");
        paramq = paramArrayOfByte;
      }
      catch (UnsupportedEncodingException paramArrayOfByte)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.NetSceneSendAppMsg", paramArrayOfByte, "", new Object[0]);
          continue;
          paramInt1 = 1;
        }
      }
      paramArrayOfByte = new StringBuilder("1,");
      if (paramInt1 == 0) {
        break;
      }
      paramInt1 = 2;
      paramq = paramInt1 + ",," + paramq;
      x.i("MicroMsg.NetSceneSendAppMsg", "androidSystemShareFixed(13717) %s", new Object[] { paramq });
      com.tencent.mm.plugin.report.service.h.mEJ.k(13717, paramq);
      if (this.qAu != null)
      {
        this.qAu.bGE.bGI = ("msg_" + this.bXQ.field_msgSvrId);
        a.sFg.m(this.qAu);
      }
      if (localbke.sjS.rdp != null) {
        com.tencent.mm.plugin.report.service.h.mEJ.h(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bi.VF()), Integer.valueOf(d.bL(ad.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE), Integer.valueOf(localbke.sjS.rdp.siI) });
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
  }
  
  public final int getType()
  {
    return 222;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */