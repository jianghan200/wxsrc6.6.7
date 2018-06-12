package com.tencent.mm.ui.chatting.gallery;

import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.g.a.la;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bd.b;
import com.tencent.mm.model.d.a;
import com.tencent.mm.model.m;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsimple.z;
import com.tencent.mm.modelvideo.n;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s.a;
import com.tencent.mm.modelvideo.s.a.a;
import com.tencent.mm.modelvideo.x.a;
import com.tencent.mm.network.ab;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f.e;
import com.tencent.mm.protocal.c.aso;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.al.a;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.HashMap;
import java.util.Map;

public final class i
  extends a
  implements d.a, s.a
{
  public static boolean tWC = false;
  String filename;
  private com.tencent.mm.model.d gbl;
  private com.tencent.mm.sdk.platformtools.al hEr = new com.tencent.mm.sdk.platformtools.al(new i.16(this), true);
  int jfN = 0;
  private long lastCheckTime = 0L;
  private com.tencent.mm.plugin.u.b ldj = new com.tencent.mm.plugin.u.b()
  {
    public final long bdp()
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "%d video get online cache sec", new Object[] { Integer.valueOf(i.this.hashCode()) });
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sVF, Boolean.valueOf(true));
      try
      {
        if ((i.c(i.this)) && (i.f(i.this) != null))
        {
          int i = i.f(i.this).elJ;
          return i;
        }
      }
      catch (Exception localException) {}
      return 0L;
    }
  };
  private long nPD;
  int nPE;
  private f.e nPi = new i.7(this);
  private boolean nPt;
  long nPx = 0L;
  long nPy = 0L;
  private com.tencent.mm.sdk.platformtools.al nPz = new com.tencent.mm.sdk.platformtools.al(new i.15(this), true);
  private long qEu = 0L;
  private com.tencent.mm.plugin.sight.decode.ui.b qEz = new com.tencent.mm.plugin.sight.decode.ui.b()
  {
    public final void ajO()
    {
      if (i.this.tTx.cwO() != null) {
        i.a(i.this, i.this.tTx.cwO());
      }
      i.this.tTx.tTy.tWg.SO();
    }
    
    public final void kV(int paramAnonymousInt)
    {
      localObject = null;
      try
      {
        String str = i.this.tTx.cwO().cxz().tXa.getVideoPath();
        localObject = str;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Imagegallery.handler.video", localException, "", new Object[0]);
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Imagegallery.handler.video", "on seek get video path error: " + localException.toString());
          continue;
          boolean bool = i.f(i.this).ap(paramAnonymousInt, true);
          continue;
          localObject = i.this.tTx.cwN();
          if ((localObject != null) && (((com.tencent.mm.storage.bd)localObject).cmj())) {
            com.tencent.mm.modelvideo.t.c(((cm)localObject).field_imgPath, paramAnonymousInt * 1000, i.c(i.this));
          }
          i.this.tTx.Fr(i.this.tTx.tTy.getCurrentItem());
        }
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "on seek to time[%d] isOnlinePlay[%b] videoPath[%s]", new Object[] { Integer.valueOf(paramAnonymousInt), Boolean.valueOf(i.c(i.this)), localObject });
      if (!bi.oW((String)localObject)) {
        if (!i.c(i.this))
        {
          i.this.R(paramAnonymousInt, true);
          bool = true;
          if (bool) {
            i.this.bS(false);
          }
          i.this.tTx.tTy.cxf();
          return;
        }
      }
    }
  };
  private HashMap<String, a> tVv = new HashMap();
  private int tWA = 0;
  private boolean tWB = false;
  ag tWD = new ag(Looper.getMainLooper(), new i.11(this));
  private int tWE = 0;
  private com.tencent.mm.sdk.b.c<la> tWF = new i.4(this);
  private boolean tWG = false;
  private int tWH = 0;
  private int[] tWI = { 64536, 63536, 3400 };
  private com.tencent.mm.sdk.b.c tWs;
  final SparseArray<r> tWt = new SparseArray();
  private l tWu = new l(this);
  private boolean tWv = false;
  private boolean tWw = false;
  private boolean tWx = false;
  private int tWy = 0;
  private int tWz = 0;
  
  public i(b paramb)
  {
    super(paramb);
    com.tencent.mm.sdk.b.a locala = com.tencent.mm.sdk.b.a.sFg;
    paramb = new com.tencent.mm.ui.chatting.al(al.a.tMO, paramb.tTy);
    this.tWs = paramb;
    locala.b(paramb);
    com.tencent.mm.sdk.b.a.sFg.b(this.tWF);
    this.gbl = new com.tencent.mm.model.d();
  }
  
  private void a(com.tencent.mm.storage.bd parambd, r paramr)
  {
    if ((!ab.bU(this.tTx.tTy.mController.tml)) && (!tWC))
    {
      com.tencent.mm.ui.base.h.a(this.tTx.tTy.mController.tml, R.l.video_export_file_warning, R.l.app_tip, new i.1(this, parambd, paramr), null);
      return;
    }
    b(parambd, paramr);
  }
  
  private void a(com.tencent.mm.storage.bd parambd, r paramr, int paramInt, boolean paramBoolean)
  {
    if ((parambd == null) || (paramr == null)) {
      return;
    }
    if (parambd.cmu())
    {
      Toast.makeText(this.tTx.tTy, R.l.video_fail_or_clean, 0).show();
      return;
    }
    Object localObject3;
    Object localObject1;
    if (paramr.enT == -1)
    {
      localObject3 = paramr.Tl();
      localObject1 = localObject3;
      if (!com.tencent.mm.a.e.cn((String)localObject3))
      {
        o.Ta();
        localObject1 = com.tencent.mm.modelvideo.s.nK(parambd.field_imgPath);
        label73:
        if ((localObject1 != null) && (com.tencent.mm.a.e.cn((String)localObject1))) {
          break label305;
        }
        Toast.makeText(this.tTx.tTy, R.l.video_fail_or_clean, 0).show();
      }
    }
    else
    {
      o.Ta();
      localObject3 = com.tencent.mm.modelvideo.s.nK(parambd.field_imgPath);
      localObject1 = localObject3;
      if (parambd.field_isSend == 1)
      {
        localObject1 = localObject3;
        if (paramr.enW != null)
        {
          localObject1 = localObject3;
          if (!paramr.enW.rUP) {}
        }
      }
    }
    for (;;)
    {
      String str;
      boolean bool;
      try
      {
        str = FileOp.mK((String)localObject3);
        localObject1 = str;
        if (!str.endsWith("/")) {
          localObject1 = str + "/";
        }
        str = com.tencent.mm.a.e.cq((String)localObject3);
        localObject1 = (String)localObject1 + str + "_hd.mp4";
        bool = FileOp.cn((String)localObject1);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "local capture video, hdFilePath: %s, exist: %s", new Object[] { localObject1, Boolean.valueOf(bool) });
        if (!bool) {
          break label1129;
        }
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Imagegallery.handler.video", "try to get hd filePath error: %s", new Object[] { localException.getMessage() });
        localObject2 = localObject3;
      }
      break label73;
      label305:
      localObject3 = Fl(paramInt);
      if (localObject3 == null) {
        break;
      }
      if (com.tencent.mm.model.s.fq(paramr.Tj())) {}
      for (int i = m.gK(paramr.Tj());; i = 0)
      {
        bool = com.tencent.mm.modelvideo.q.nD((String)localObject2);
        int j = this.tTx.tTy.gJ(parambd.field_msgId);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "play video pos[%d], isOnlinePlay[%b] opcode[%d] resetByCompletion[%b]", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean), Integer.valueOf(j), Boolean.valueOf(this.tWB) });
        if (!bool)
        {
          if ((com.tencent.mm.compatible.e.q.deW.ddT == 1) && (com.tencent.mm.pluginsdk.h.b.a.a.b(paramr.getFileName(), this.tTx.tTy.mController.tml, bool))) {
            break;
          }
          au.HU();
          if ((((Integer)com.tencent.mm.model.c.DT().get(aa.a.sUA, Integer.valueOf(0))).intValue() == 1) && (((j)localObject3).tXc != null))
          {
            ((j)localObject3).tXc.setVisibility(0);
            ((j)localObject3).tXc.setText(com.tencent.mm.plugin.sight.base.d.Ho((String)localObject2));
          }
          int k = paramr.enM;
          int m = paramr.dHI;
          parambd = paramr.Tj();
          str = r.nH(paramr.Tm());
          long l = paramr.createTime;
          ((j)localObject3).nFC = k;
          ((j)localObject3).tXo = m;
          ((j)localObject3).tXp = i;
          ((j)localObject3).bSS = parambd;
          ((j)localObject3).fileId = str;
          ((j)localObject3).createTime = l;
          this.nPt = paramBoolean;
          this.tWv = true;
          this.filename = paramr.getFileName();
          if (j == 3)
          {
            ((j)localObject3).cxz().tXa.setMute(true);
            if ((((j)localObject3).cxz().tXa.getVideoPath() == null) || (!((j)localObject3).cxz().tXa.getVideoPath().equals(localObject2)) || (((j)localObject3).cxz().tXa.isPlaying()) || (this.tWB)) {
              break label836;
            }
            ((j)localObject3).a(true, 1.0F);
            ((j)localObject3).cxz().tXa.start();
            bCs();
            if (!paramBoolean) {
              aaz(this.filename);
            }
            FI(((j)localObject3).cxz().tXa.getCurrentPosition() / 1000);
            bS(false);
            this.tWt.put(paramInt, paramr);
            this.tTx.tTy.md(false);
            this.tTx.tTy.mController.tml.getWindow().addFlags(128);
            if (com.tencent.mm.compatible.util.d.fS(18)) {
              aaz(this.filename);
            }
            this.gbl.a(this);
          }
        }
        for (;;)
        {
          ((j)localObject3).cxz().tXb.setVisibility(8);
          return;
          ((j)localObject3).cxz().tXa.setMute(false);
          break;
          label836:
          this.tWx = false;
          this.tWB = false;
          ((j)localObject3).cxz().tXa.setVideoPath((String)localObject2);
          if ((((j)localObject3).cxz().tXa instanceof VideoPlayerTextureView))
          {
            ((VideoPlayerTextureView)((j)localObject3).cxz().tXa).setIOnlineCache(this.ldj);
            parambd = (VideoPlayerTextureView)((j)localObject3).cxz().tXa;
            if (this.nPt) {
              break label956;
            }
          }
          for (bool = false;; bool = com.tencent.mm.model.c.DT().getBoolean(aa.a.sVF, false))
          {
            parambd.setNeedResetExtractor(bool);
            ((VideoPlayerTextureView)((j)localObject3).cxz().tXa).setIsOnlineVideoType(paramBoolean);
            ((j)localObject3).a(true, 0.0F);
            break;
            label956:
            au.HU();
          }
          com.tencent.mm.plugin.report.service.h.mEJ.h(12084, new Object[] { Integer.valueOf(paramr.dHI), Integer.valueOf(paramr.enM * 1000), Integer.valueOf(0), Integer.valueOf(3), paramr.Tj(), Integer.valueOf(i), r.nH(paramr.Tm()), Long.valueOf(paramr.createTime) });
          if (!com.tencent.mm.pluginsdk.h.b.a.a.c((String)localObject2, this.tTx.tTy.mController.tml, bool)) {
            Toast.makeText(this.tTx.tTy.mController.tml, this.tTx.tTy.getString(R.l.video_play_export_file_error), 0).show();
          }
        }
      }
      label1129:
      Object localObject2 = localObject3;
    }
  }
  
  private void b(com.tencent.mm.storage.bd parambd, r paramr)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "startDownloading [%d]", new Object[] { Integer.valueOf(hashCode()) });
    if ((parambd == null) || (paramr == null)) {}
    j localj;
    do
    {
      return;
      localj = this.tTx.cwO();
    } while (localj == null);
    z.w(parambd);
    int i = this.tTx.tTy.gJ(parambd.field_msgId);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Imagegallery.handler.video", "enterVideoOpCode : " + i);
    switch (i)
    {
    default: 
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Imagegallery.handler.video", "enterVideoOpCode[%d] is error", new Object[] { Integer.valueOf(i) });
      return;
    case 3: 
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "%d mute play video [%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i) });
    case 0: 
      l locall = this.tWu;
      String str1 = parambd.field_imgPath;
      com.tencent.mm.modelcontrol.d.NP();
      if (!com.tencent.mm.modelcontrol.d.NU()) {
        i = 0;
      }
      while (i != 0)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "start online play video.");
        this.nPt = true;
        o.Ta().a(this);
        this.tTx.tTy.cxh();
        this.tWG = false;
        localj.cxz().tWZ.setVisibility(8);
        localj.cxz().tXb.setVisibility(8);
        localj.cxz().tXi.setVisibility(0);
        return;
        locall.reset();
        Object localObject1 = com.tencent.mm.modelvideo.t.nW(str1);
        if (localObject1 != null)
        {
          i = ((r)localObject1).dHI;
          if (i < locall.tXL.tXN)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoUIHelper", "video size[%d] less than config size[%d], do not stream video", new Object[] { Integer.valueOf(i), Integer.valueOf(locall.tXL.tXN) });
            com.tencent.mm.modelvideo.t.b((r)localObject1, 9);
            com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 17L, 1L, false);
            i = 0;
            continue;
          }
        }
        com.tencent.mm.modelvideo.t.W(str1, 1);
        n.SY();
        o.Tb();
        if (bi.oW(str1)) {
          localObject1 = null;
        }
        for (;;)
        {
          if (localObject1 == null)
          {
            i = 0;
            break;
            r localr = com.tencent.mm.modelvideo.t.nW(str1);
            if (localr == null)
            {
              localObject1 = null;
            }
            else
            {
              localObject1 = bl.z(localr.Tm(), "msg");
              if (localObject1 == null)
              {
                com.tencent.mm.sdk.platformtools.x.w("MicroMsg.OnlineVideoService", "cdntra parse video recv xml failed");
                localObject1 = null;
              }
              else
              {
                Object localObject2 = (String)((Map)localObject1).get(".msg.videomsg.$cdnvideourl");
                if (bi.oW((String)localObject2))
                {
                  com.tencent.mm.sdk.platformtools.x.w("MicroMsg.OnlineVideoService", "cdntra parse video recv xml failed");
                  localObject1 = null;
                }
                else
                {
                  int j = Integer.valueOf((String)((Map)localObject1).get(".msg.videomsg.$length")).intValue();
                  Object localObject3 = (String)((Map)localObject1).get(".msg.videomsg.$md5");
                  String str2 = (String)((Map)localObject1).get(".msg.videomsg.$aeskey");
                  String str3 = (String)((Map)localObject1).get(".msg.videomsg.$fileparam");
                  String str4 = com.tencent.mm.modelcdntran.d.a("downvideo", localr.createTime, localr.Tj(), localr.getFileName());
                  if (bi.oW(str4))
                  {
                    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.OnlineVideoService", "cdntra genClientId failed not use cdn file:%s", new Object[] { localr.getFileName() });
                    localObject1 = null;
                  }
                  else
                  {
                    o.Ta();
                    String str5 = com.tencent.mm.modelvideo.s.nK(str1);
                    localObject1 = new com.tencent.mm.modelcdntran.j();
                    ((com.tencent.mm.modelcdntran.j)localObject1).filename = str1;
                    ((com.tencent.mm.modelcdntran.j)localObject1).dQk = ((String)localObject3);
                    ((com.tencent.mm.modelcdntran.j)localObject1).dQl = j;
                    ((com.tencent.mm.modelcdntran.j)localObject1).dQm = 1;
                    ((com.tencent.mm.modelcdntran.j)localObject1).bSS = localr.Tk();
                    ((com.tencent.mm.modelcdntran.j)localObject1).dQn = localr.Tj();
                    if (com.tencent.mm.model.s.fq(localr.Tj()))
                    {
                      i = m.gK(localr.Tj());
                      label706:
                      ((com.tencent.mm.modelcdntran.j)localObject1).bSU = i;
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_mediaId = str4;
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_fullpath = str5;
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_fileType = com.tencent.mm.modelcdntran.b.MediaType_VIDEO;
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_totalLen = j;
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_aesKey = str2;
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_fileId = ((String)localObject2);
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_priority = com.tencent.mm.modelcdntran.b.dOk;
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_wxmsgparam = str3;
                      if (!com.tencent.mm.model.s.fq(localr.Tj())) {
                        break label947;
                      }
                      i = 1;
                      label783:
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_chattype = i;
                      ((com.tencent.mm.modelcdntran.j)localObject1).dQo = localr.dQo;
                      localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().I(localr.Tj(), localr.bYu);
                      localObject3 = com.tencent.mm.model.bd.iF(((cm)localObject2).cqb);
                      if (localObject3 == null) {
                        break label952;
                      }
                      i = ((bd.b)localObject3).dCA;
                      label851:
                      ((com.tencent.mm.modelcdntran.j)localObject1).initialDownloadLength = i;
                      ((com.tencent.mm.modelcdntran.j)localObject1).initialDownloadOffset = 0;
                      ((com.tencent.mm.modelcdntran.j)localObject1).dQq = ((cm)localObject2).field_createTime;
                      ((com.tencent.mm.modelcdntran.j)localObject1).bYu = ((cm)localObject2).field_msgSvrId;
                      if (localObject3 == null) {
                        break label957;
                      }
                    }
                    label947:
                    label952:
                    label957:
                    for (i = ((bd.b)localObject3).dCB;; i = 0)
                    {
                      ((com.tencent.mm.modelcdntran.j)localObject1).dQr = i;
                      if (((com.tencent.mm.modelcdntran.j)localObject1).initialDownloadLength > 0) {
                        com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 36L, 1L, false);
                      }
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_autostart = false;
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_requestVideoFormat = com.tencent.mm.modelcontrol.d.a(1, localr);
                      break;
                      i = 0;
                      break label706;
                      i = 0;
                      break label783;
                      i = 0;
                      break label851;
                    }
                  }
                }
              }
            }
          }
        }
        locall.mediaId = ((com.tencent.mm.modelcdntran.j)localObject1).field_mediaId;
        locall.fhf = ((com.tencent.mm.modelcdntran.j)localObject1).dQl;
        locall.filename = str1;
        locall.elC = 1;
        locall.elF = 0;
        boolean bool = o.Tf().Tx();
        o.Tb().a((com.tencent.mm.modelcdntran.j)localObject1, bool);
        locall.dQj = bi.VF();
        com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 1L, 1L, false);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoUIHelper", "download online video.[%s, %s] start time[%d]", new Object[] { locall.mediaId, str1, Long.valueOf(locall.dQj) });
        i = 1;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "start offline play video.");
      this.nPt = false;
      o.Ta().a(this, Looper.getMainLooper());
      com.tencent.mm.modelvideo.t.nS(parambd.field_imgPath);
      this.tTx.tTy.cxh();
      this.tWG = false;
      localj.cxz().tWZ.setVisibility(8);
      localj.cxz().tXb.setVisibility(0);
      localj.cxz().tXb.setProgress(com.tencent.mm.modelvideo.t.f(paramr));
      return;
    }
    if (paramr.To())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "start complete online video");
      com.tencent.mm.modelvideo.t.oa(parambd.field_imgPath);
    }
    for (;;)
    {
      o.Ta().a(this, Looper.getMainLooper());
      this.tTx.tTy.cxh();
      this.tWG = false;
      localj.cxz().tWZ.setVisibility(8);
      localj.cxz().tXb.setVisibility(0);
      localj.cxz().tXb.setProgress(com.tencent.mm.modelvideo.t.f(paramr));
      if (i != 2) {
        break;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 14L, 1L, false);
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "start complete offline video");
      jdMethod_do(parambd.field_imgPath, 10);
      com.tencent.mm.modelvideo.t.nS(parambd.field_imgPath);
    }
    com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 11L, 1L, false);
  }
  
  private void b(j paramj)
  {
    if (paramj == null) {}
    do
    {
      return;
      bCq();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Imagegallery.handler.video", "pause video.");
    } while (!paramj.cxz().tXa.isPlaying());
    paramj.cxz().tXa.pause();
    bCt();
  }
  
  private boolean b(a parama)
  {
    if (parama == null) {
      return false;
    }
    o.Ta().a(this);
    if (this.tTx.tTy.getCurrentItem() == parama.pos)
    {
      parama = Fl(parama.pos);
      if (parama != null)
      {
        parama.cxz().tXi.setVisibility(8);
        parama.cxz().tXb.setVisibility(8);
        parama.cxz().tWZ.setVisibility(8);
      }
      this.tWG = true;
      this.tTx.tTy.cxg();
      return true;
    }
    this.tTx.Ft(parama.pos);
    return false;
  }
  
  public static r bA(com.tencent.mm.storage.bd parambd)
  {
    if (!b.bh(parambd)) {
      return null;
    }
    return com.tencent.mm.modelvideo.t.nW(parambd.field_imgPath);
  }
  
  private void bCq()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "clear timer");
    this.nPz.SO();
    this.hEr.SO();
  }
  
  private void bCs()
  {
    this.nPD = bi.VF();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Imagegallery.handler.video", "notePlayVideo filename %s notePlayVideo %d ", new Object[] { this.filename, Long.valueOf(this.nPD) });
  }
  
  private void bCt()
  {
    if (this.nPD > 0L) {
      this.nPE = ((int)(this.nPE + (bi.VF() - this.nPD) / 1000L));
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "notePauseVideo filename %s playVideoDuration %d ", new Object[] { this.filename, Integer.valueOf(this.nPE) });
    this.nPD = 0L;
  }
  
  private boolean c(j paramj)
  {
    boolean bool2 = false;
    int i = this.tWy;
    this.tWy = paramj.cxz().tXa.getCurrentPosition();
    int j;
    label113:
    boolean bool1;
    if (i != this.tWy)
    {
      this.lastCheckTime = bi.VF();
      long l = paramj.cxz().tXa.getLastSurfaceUpdateTime();
      if ((l > 0L) && (l != this.qEu))
      {
        this.qEu = l;
        j = this.tWz;
        switch (j)
        {
        default: 
          this.tWz = 0;
          bool1 = true;
        }
      }
    }
    do
    {
      do
      {
        return bool1;
        i = 21;
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Imagegallery.handler.video", "%d rpt rptRepairEffect idKey %d errorTime %d filename %s", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(j), this.filename });
          com.tencent.mm.plugin.report.service.h.mEJ.a(354L, i, 1L, false);
          com.tencent.mm.plugin.report.service.h.mEJ.h(13836, new Object[] { Integer.valueOf(301), Long.valueOf(bi.VE()), "" });
          break;
          i = 22;
          continue;
          i = 23;
        }
        if (this.tWz == -1) {
          break label113;
        }
        this.tWz += 1;
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Imagegallery.handler.video", "media play is playing[%d], but surface is not update!! repair time[%d]", new Object[] { Integer.valueOf(this.tWz), Integer.valueOf(this.tWA) });
        if (this.tWA >= 2) {
          this.tWu.cxC();
        }
        switch (this.tWz)
        {
        case 0: 
        case 1: 
        default: 
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Imagegallery.handler.video", "rpt surface not update!!");
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Imagegallery.handler.video", "%d rpt rptSurfaceNotUpdate %s", new Object[] { Integer.valueOf(hashCode()), this.filename });
          com.tencent.mm.plugin.report.service.h.mEJ.h(13836, new Object[] { Integer.valueOf(300), Long.valueOf(bi.VE()), "" });
          com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 20L, 1L, false);
          this.tWz = -1;
          break;
        case 2: 
          i = this.tWy / 1000;
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Imagegallery.handler.video", "surface not update, it try seek time[%d] to repair.", new Object[] { Integer.valueOf(i) });
          R(i, true);
          this.tWA += 1;
          return false;
        case 3: 
          j = (this.tWy - 2000) / 1000;
          i = j;
          if (j < 0) {
            i = 0;
          }
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Imagegallery.handler.video", "surface not update, it try seek time[%d] to repair.", new Object[] { Integer.valueOf(i) });
          R(i, true);
          this.tWA += 1;
          return false;
        case 4: 
          j = (this.tWy - 4000) / 1000;
          i = j;
          if (j < 0) {
            i = 0;
          }
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Imagegallery.handler.video", "surface not update, it try seek time[%d] to repair.", new Object[] { Integer.valueOf(i) });
          R(i, true);
          this.tWA += 1;
          return false;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "check time[%d, %d], play time[%d, %d]", new Object[] { Long.valueOf(this.lastCheckTime), Long.valueOf(bi.VF()), Integer.valueOf(i), Integer.valueOf(this.tWy) });
          if ((this.lastCheckTime <= 0L) || (bi.bH(this.lastCheckTime) < 1500L)) {
            break;
          }
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Imagegallery.handler.video", "play time not update! request all video data to play. ");
          i = this.tTx.cwO().tXa.getCurrentPosition();
          bCq();
          com.tencent.mm.modelvideo.t.c(this.filename, i, this.nPt);
          this.tTx.cwO().tXa.stop();
          this.tWu.cxC();
          paramj = (a)this.tVv.get(this.filename);
          bool1 = bool2;
        }
      } while (paramj == null);
      bool1 = bool2;
    } while (paramj.bGS == null);
    r localr = bA(paramj.bGS);
    a(paramj.bGS, localr, paramj.pos, this.nPt);
    this.lastCheckTime = 0L;
    return false;
  }
  
  private void cxv()
  {
    try
    {
      this.tTx.tTy.cwX().tVM.setIplaySeekCallback(this.qEz);
      return;
    }
    catch (Exception localException) {}
  }
  
  private void jdMethod_do(String paramString, int paramInt)
  {
    au.Em().H(new i.10(this, paramString, paramInt));
  }
  
  public final void FH(int paramInt)
  {
    this.tWt.remove(paramInt);
  }
  
  protected final void FI(int paramInt)
  {
    paramInt = Math.max(0, paramInt);
    this.tTx.tTy.cwX().tVM.seek(paramInt);
  }
  
  protected final void R(int paramInt, boolean paramBoolean)
  {
    j localj = this.tTx.cwO();
    if (localj == null) {
      return;
    }
    bCs();
    localj.cxz().tXi.setVisibility(8);
    localj.cxz().tXa.d(paramInt * 1000, paramBoolean);
    this.tTx.tTy.md(false);
    bS(false);
  }
  
  protected final void SN()
  {
    j localj = this.tTx.cwO();
    if (localj == null) {
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "start to pause");
    this.tTx.tTy.md(true);
    localj.cxz().tXi.setVisibility(0);
    localj.cxz().tXa.pause();
    bCt();
  }
  
  public final void a(s.a.a parama)
  {
    Object localObject = parama.fileName;
    if ((bi.oW((String)localObject)) || (this.tVv == null)) {}
    com.tencent.mm.storage.bd localbd;
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            parama = (a)this.tVv.get(localObject);
          } while (parama == null);
          localbd = parama.bGS;
        } while ((localbd == null) || (localbd.field_imgPath == null) || (!localbd.field_imgPath.equals(localObject)));
        localObject = bA(localbd);
      } while (localObject == null);
      if ((!localbd.cmu()) && (((r)localObject).status != 198)) {
        break;
      }
    } while (!b(parama));
    Toast.makeText(this.tTx.tTy, R.l.video_fail_or_clean, 0).show();
    return;
    int i = com.tencent.mm.modelvideo.t.f((r)localObject);
    j localj = Fl(parama.pos);
    if ((this.tTx.tTy.getCurrentItem() == parama.pos) && (localj != null))
    {
      this.tTx.tTy.cxh();
      this.tWG = false;
      localj.cxz().tXb.setVisibility(0);
      localj.cxz().tXb.setProgress(i);
    }
    while (localj != null)
    {
      if (i < localj.cxz().tXb.getMax()) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Imagegallery.handler.video", "onNotifyChange, status:%d", new Object[] { Integer.valueOf(((r)localObject).status) });
      if (((((r)localObject).status != 199) && (((r)localObject).status != 199)) || (!b(parama))) {
        break;
      }
      this.tTx.tTy.fm(true);
      i = this.tTx.tTy.gJ(localbd.field_msgId);
      switch (i)
      {
      default: 
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Imagegallery.handler.video", "enterVideoOpCode[%d] is error", new Object[] { Integer.valueOf(i) });
        return;
      }
    }
    return;
    a(localbd, (r)localObject, this.tTx.tTy.getCurrentItem(), false);
    return;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Imagegallery.handler.video", "do restransmit video");
    com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 15L, 1L, false);
    this.tTx.bo(localbd);
    this.tTx.tTy.gK(-1L);
    if (this.nPt)
    {
      i = this.tTx.cwO().tXa.getCurrentPosition();
      com.tencent.mm.modelvideo.t.c(this.filename, i, this.nPt);
      this.tWB = true;
    }
    this.nPt = false;
    return;
    com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 16L, 1L, false);
    b.a(this.tTx.tTy, localbd, true);
    this.tTx.tTy.gK(-1L);
    if (this.nPt)
    {
      i = this.tTx.cwO().tXa.getCurrentPosition();
      com.tencent.mm.modelvideo.t.c(this.filename, i, this.nPt);
      this.tWB = true;
    }
    this.nPt = false;
  }
  
  public final boolean a(j paramj, com.tencent.mm.storage.bd parambd, int paramInt)
  {
    super.a(paramj, parambd, paramInt);
    r localr = bA(parambd);
    if (parambd == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Imagegallery.handler.video", "msg is null!!");
    }
    for (;;)
    {
      return false;
      if (this.tVv != null) {
        this.tVv.put(parambd.field_imgPath, new a(parambd, paramInt));
      }
      while (localr != null)
      {
        o.Ta();
        parambd = BackwardSupportUtil.b.e(com.tencent.mm.modelvideo.s.nL(parambd.field_imgPath), 1.0F);
        paramj.cxz().tWY.setImageBitmap(parambd);
        if (paramj.cxz().tXa.isPlaying()) {
          paramj.cxz().tXa.stop();
        }
        paramj.tXc.setVisibility(8);
        paramj.cxz().tXb.setVisibility(8);
        paramj.cxz().tXi.setVisibility(8);
        paramj.a(false, 0.0F);
        this.tWz = 0;
        this.nPx = bi.VF();
        return true;
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Imagegallery.handler.video", "mCacheMap is null!");
      }
    }
  }
  
  protected final void aX(String paramString, boolean paramBoolean)
  {
    ah.A(new i.5(this, paramString, paramBoolean));
  }
  
  protected final void aaz(String paramString)
  {
    if ((!this.tWG) && (!b((a)this.tVv.get(paramString)))) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Imagegallery.handler.video", "show tool bar error.");
    }
  }
  
  protected final boolean bCr()
  {
    j localj = this.tTx.cwO();
    boolean bool2;
    if (localj == null) {
      bool2 = false;
    }
    boolean bool1;
    do
    {
      return bool2;
      bool1 = true;
      if (!localj.cxz().tXa.isPlaying())
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "start to play");
        this.tTx.tTy.md(false);
        localj.cxz().tXi.setVisibility(8);
        bool1 = localj.cxz().tXa.start();
        bCs();
      }
      bool2 = bool1;
    } while (localj.cxz().tXi.getVisibility() == 8);
    localj.cxz().tXi.setVisibility(8);
    return bool1;
  }
  
  protected final void bS(boolean paramBoolean)
  {
    if (!this.tWw)
    {
      if (!this.nPt) {
        break label44;
      }
      if (paramBoolean) {
        ah.A(new i.14(this));
      }
    }
    else
    {
      return;
    }
    this.nPz.J(500L, 500L);
    return;
    label44:
    this.hEr.J(500L, 500L);
  }
  
  public final void cwV()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "stopAll. video handler hash code : " + hashCode());
    this.nPy = bi.VF();
    SparseArray localSparseArray = this.tTx.tzb;
    int j = 0;
    int i = 0;
    if (j < localSparseArray.size())
    {
      int k = localSparseArray.keyAt(j);
      if ((localSparseArray.get(k) == null) || (((View)localSparseArray.get(k)).getTag() == null)) {
        break label404;
      }
      j localj = (j)((View)localSparseArray.get(k)).getTag();
      if ((localj.tWX == null) || (localj.cxz().tWX.getVisibility() != 0) || ((((View)localj.cxz().tXa).getVisibility() != 0) && (bi.oW(localj.cxz().tXa.getVideoPath())) && ((!this.nPt) || (!this.tWu.isStreaming())))) {
        break label404;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "stop");
      bCq();
      if (localj != null)
      {
        bCt();
        if (this.nPt) {
          this.tWu.cxB();
        }
        if (!this.tWw) {
          com.tencent.mm.modelvideo.t.c(this.filename, this.tWy - 1000, this.nPt);
        }
        localj.cxz().tXb.setVisibility(8);
        localj.cxz().tXi.setVisibility(8);
        localj.cxz().tXa.stop();
        FI(0);
        localj.a(false, 0.0F);
        this.nPt = false;
        this.tWG = false;
        this.tWB = false;
        this.filename = null;
        this.nPE = 0;
        this.nPD = 0L;
        this.tWH = 0;
        this.tWE = 0;
        this.tWA = 0;
        this.tWz = 0;
        this.qEu = 0L;
        this.lastCheckTime = 0L;
      }
      i = 1;
    }
    label404:
    for (;;)
    {
      j += 1;
      break;
      this.gbl.bv(false);
      if ((i == 0) && (this.nPt))
      {
        this.tWu.cxB();
        this.nPt = false;
      }
      bCq();
      this.tWt.clear();
      return;
    }
  }
  
  public final void cxt()
  {
    this.tWw = false;
    this.jfN = 0;
    if (this.tTx != null) {}
    for (Object localObject = this.tTx.cwO(); localObject == null; localObject = null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Imagegallery.handler.video", "notify video prepared, but holder is null.");
      return;
    }
    int i = bi.ge(((j)localObject).cxz().tXa.getDuration());
    int j = this.tTx.tTy.cwX().tVM.getVideoTotalTime();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "%d videoDuration %d hadSetTotalTime %d", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(j) });
    if ((j <= 0) || (Math.abs(j - i) >= 2)) {
      this.tTx.tTy.cwX().tVM.setVideoTotalTime(i);
    }
    cxv();
    if ((i == 0) || (i >= 1800))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Imagegallery.handler.video", "%d repair video duration[%d] error. filename[%s]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), this.filename });
      i = com.tencent.mm.modelvideo.t.w(i, this.filename);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "notify video prepared. isOnlinePlay[%b] playDuration[%d] playVideoWhenNotify[%b] hadPlayError[%b].", new Object[] { Boolean.valueOf(this.nPt), Integer.valueOf(i), Boolean.valueOf(this.tWv), Boolean.valueOf(this.tWw) });
      ((j)localObject).cxz().tXa.setOneTimeVideoTextureUpdateCallback(this.nPi);
      if (!this.tWv) {
        break label388;
      }
      if (this.nPt) {
        break label329;
      }
      this.tWu.reset();
      bCs();
      R(i, true);
    }
    for (;;)
    {
      bS(false);
      return;
      au.Em().H(new i.6(this, i));
      break;
      label329:
      localObject = this.tWu;
      if (i > 0)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OnlineVideoUIHelper", "seek to last duration : " + i);
        ((l)localObject).elG = i;
        ((l)localObject).elI = true;
        ((l)localObject).elD = 2;
      }
      this.tWu.iC(0);
    }
    label388:
    if (!this.nPt) {
      R(i, false);
    }
    for (;;)
    {
      FI(i);
      this.tTx.tTy.md(true);
      bCq();
      return;
      this.tWu.ap(i, false);
    }
  }
  
  public final void cxu()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "notify video completion. isOnlinePlay : " + this.nPt);
    bCq();
    bCt();
    Object localObject;
    if ((this.nPt) && (this.tTx != null) && (this.tTx.cwO() != null))
    {
      localObject = this.tTx.cwO().cxz().tXa;
      if ((localObject != null) && (((com.tencent.mm.pluginsdk.ui.tools.f)localObject).getCurrentPosition() + 2000 < ((com.tencent.mm.pluginsdk.ui.tools.f)localObject).getDuration())) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Imagegallery.handler.video", "notify video completion, but cur pos[%d] is less than duration[%d]", new Object[] { Integer.valueOf(((com.tencent.mm.pluginsdk.ui.tools.f)localObject).getCurrentPosition()), Integer.valueOf(((com.tencent.mm.pluginsdk.ui.tools.f)localObject).getDuration()) });
      }
    }
    for (int i = 0;; i = 1)
    {
      if (i != 0) {
        ah.A(new i.12(this));
      }
      for (;;)
      {
        return;
        try
        {
          i = this.tTx.cwO().tXa.getCurrentPosition();
          com.tencent.mm.modelvideo.t.c(this.filename, i, this.nPt);
          this.tTx.cwO().tXa.stop();
          this.tWu.cxC();
          i = this.tWE + 1;
          this.tWE = i;
          if (i <= 3)
          {
            localObject = (a)this.tVv.get(this.filename);
            if ((localObject != null) && (((a)localObject).bGS != null))
            {
              r localr = bA(((a)localObject).bGS);
              a(((a)localObject).bGS, localr, ((a)localObject).pos, this.nPt);
              return;
            }
          }
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Imagegallery.handler.video", localException, "notify video completion error[%s]", new Object[] { localException.toString() });
          return;
        }
      }
    }
  }
  
  public final void detach()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "detach.[%d]", new Object[] { Integer.valueOf(hashCode()) });
    this.nPy = bi.VF();
    this.tWD.removeMessages(1);
    bCq();
    com.tencent.mm.sdk.b.a.sFg.c(this.tWs);
    com.tencent.mm.sdk.b.a.sFg.c(this.tWF);
    cwV();
    this.tTx.tTy.mController.tml.getWindow().clearFlags(128);
    this.tTx.tTy.cwX().tVM.setIplaySeekCallback(null);
    super.detach();
    this.tVv.clear();
    this.tVv = null;
    o.Ta().a(this);
    this.tWt.clear();
    l locall = this.tWu;
    locall.reset();
    locall.elE = null;
    locall.tXK = null;
    locall.tXL = null;
    if (com.tencent.mm.plugin.u.e.bds()) {
      au.Em().H(new i.9(this));
    }
    o.Tf().Tx();
    o.Tf().run();
  }
  
  public final void eZ(int paramInt1, int paramInt2)
  {
    boolean bool2 = this.nPt;
    Object localObject = this.tWu;
    boolean bool1;
    if ((!bi.oW(((l)localObject).mediaId)) && (((l)localObject).elC == 1))
    {
      bool1 = true;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Imagegallery.handler.video", "notify video error, what %d, extras %d isOnlinePlay %b isLoading %b ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      this.tWw = true;
      this.jfN = paramInt2;
      if (!this.nPt) {
        break label263;
      }
      if (paramInt1 != -1) {
        break label181;
      }
      bCq();
      this.tTx.cwO().tXa.stop();
      this.tWu.cxC();
    }
    label181:
    label244:
    do
    {
      for (;;)
      {
        this.tWG = false;
        this.tTx.tTy.md(true);
        this.tTx.cwO().cxz().tXi.setVisibility(0);
        bCt();
        com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 18L, 1L, false);
        return;
        bool1 = false;
        break;
        if (paramInt1 != -2) {
          break label244;
        }
        bCq();
        paramInt1 = this.tTx.cwO().tXa.getCurrentPosition();
        com.tencent.mm.modelvideo.t.c(this.filename, paramInt1, this.nPt);
        this.tTx.cwO().tXa.stop();
        this.tWu.cxC();
      }
    } while (paramInt1 != -3);
    this.tWw = false;
    this.tWu.cxC();
    return;
    label263:
    com.tencent.mm.modelvideo.t.nZ(this.filename);
    bCt();
    if ((this.tTx != null) && (this.tTx.cwO() != null) && (this.tTx.cwO().tXa != null))
    {
      localObject = this.tTx.cwO().tXa.getVideoPath();
      this.tTx.cwO().tXa.stop();
    }
    while (this.tWx)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "%d had play completion don't show error tips", new Object[] { Integer.valueOf(hashCode()) });
      return;
      localObject = "";
    }
    ah.A(new i.13(this, (String)localObject));
    com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 25L, 1L, false);
  }
  
  public final void g(com.tencent.mm.storage.bd parambd, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "toggle video");
    if (parambd == null) {}
    r localr;
    do
    {
      do
      {
        return;
      } while ((!b.bh(parambd)) && (!b.bi(parambd)));
      localr = bA(parambd);
    } while (localr == null);
    if ((this.nPt) && (this.tWu != null) && (this.tWu.elI))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "%d it loading video data, do not response button click.", new Object[] { Integer.valueOf(hashCode()) });
      return;
    }
    if (this.tTx.tTy.bIB())
    {
      b(Fl(paramInt));
      this.tTx.tTy.md(true);
      this.tTx.tTy.tWg.SO();
      this.gbl.bv(false);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "toggle pause video.");
      return;
    }
    au.HU();
    if (!com.tencent.mm.model.c.isSDCardAvailable())
    {
      com.tencent.mm.ui.base.s.gH(this.tTx.tTy.mController.tml);
      return;
    }
    if (this.nPt) {}
    for (;;)
    {
      int i;
      try
      {
        if (this.tTx.cwO().tXa != null)
        {
          i = this.tTx.cwO().tXa.getCurrentPosition() / 1000;
          if (this.tWu == null) {
            continue;
          }
          if (!this.tWu.iD(i)) {
            continue;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "toggle play video");
          a(parambd, localr, paramInt, this.nPt);
          if (this.tTx.tTy.tWf) {
            this.tTx.tTy.cxf();
          }
          cxv();
        }
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Imagegallery.handler.video", localException, "", new Object[0]);
        i = 0;
        continue;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "toggle start timer.");
        bS(false);
        continue;
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Imagegallery.handler.video", "%d toggle video but online video helper is null.", new Object[] { Integer.valueOf(hashCode()) });
        continue;
      }
      if (parambd.field_isSend == 0)
      {
        if ((localr.status != 113) && (localr.status != 198)) {
          break label467;
        }
        a(parambd, localr);
      }
      for (;;)
      {
        if (parambd.field_isSend != 1) {
          break label568;
        }
        i = localr.status;
        if ((i != 111) && (i != 113) && (i != 112) && (i != 121) && (i != 122)) {
          break label570;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "download video. msg talker[%s], info status[%d]", new Object[] { parambd.field_talker, Integer.valueOf(i) });
        a(parambd, localr);
        break;
        label467:
        if (localr.status == 199) {
          a(parambd, localr, paramInt, false);
        }
        if (localr.status == 111) {
          a(parambd, localr);
        }
        if (localr.status == 112) {
          a(parambd, localr);
        }
        if ((localr.status == 121) || (localr.status == 122)) {
          a(parambd, localr);
        }
        if (localr.status == 123) {
          a(parambd, localr, paramInt, false);
        }
      }
      label568:
      continue;
      label570:
      a(parambd, localr, paramInt, false);
    }
  }
  
  public final void h(com.tencent.mm.storage.bd parambd, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "toggleVideoMenu pos ");
    r localr = com.tencent.mm.modelvideo.t.nW(parambd.field_imgPath);
    if ((localr != null) && (!localr.Tp()))
    {
      b(Fl(paramInt));
      this.tTx.tTy.md(true);
      if (this.nPt)
      {
        this.tWu.cxB();
        this.tWu.reset();
      }
      a(parambd, localr);
      if (this.tTx.tTy.gJ(parambd.field_msgId) == 2) {
        jdMethod_do(parambd.field_imgPath, 8);
      }
    }
    else
    {
      return;
    }
    jdMethod_do(parambd.field_imgPath, 5);
  }
  
  protected final void onResume()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Imagegallery.handler.video", "ui on resume, add online video event.");
    this.tWD.removeMessages(1);
    com.tencent.mm.sdk.b.a.sFg.b(this.tWF);
    j localj;
    if ((this.tTx != null) && (com.tencent.mm.compatible.util.d.fR(21)))
    {
      localj = this.tTx.cwO();
      if ((localj != null) && (localj.tXa != null))
      {
        if (!(localj.tXa instanceof VideoPlayerTextureView)) {
          break label83;
        }
        ((VideoPlayerTextureView)localj.tXa).bdC();
      }
    }
    label83:
    while (!(localj.tXa instanceof VideoTextureView)) {
      return;
    }
    ((VideoTextureView)localj.tXa).bdC();
  }
  
  public final void pause(int paramInt)
  {
    b(Fl(paramInt));
    this.gbl.bv(false);
    this.tTx.tTy.md(true);
  }
  
  public static final class a
  {
    public com.tencent.mm.storage.bd bGS;
    public int pos;
    
    public a(com.tencent.mm.storage.bd parambd, int paramInt)
    {
      this.bGS = parambd;
      this.pos = paramInt;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/chatting/gallery/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */