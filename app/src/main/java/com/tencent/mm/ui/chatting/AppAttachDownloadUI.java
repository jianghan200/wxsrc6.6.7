package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ln;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.s;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.ac;
import com.tencent.mm.pluginsdk.model.app.ac.a;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.tools.ShowImageUI;
import com.tencent.mm.y.g.a;
import java.io.File;

public class AppAttachDownloadUI
  extends MMActivity
  implements com.tencent.mm.ab.e, ac.a, j.a
{
  private long bJC;
  private String bSS;
  private boolean bUY;
  private String bWW;
  private com.tencent.mm.storage.bd bXQ;
  private int dPU;
  private String dwK;
  private TextView eGD;
  private ProgressBar eVR;
  private String fileName;
  private String fjS;
  private com.tencent.mm.ab.f ijX;
  private Button jcg;
  private View jck;
  private Button jnr;
  private String kni;
  private String mediaId;
  private MMImageView mel;
  private ImageView mem;
  private ac qzW;
  private View tGd;
  private TextView tGe;
  private TextView tGf;
  private boolean tGg;
  private g.a tGh;
  private boolean tGi = false;
  private boolean tGj = false;
  private boolean tGk = true;
  private int tGl = 5000;
  private LinearLayout tGm;
  private LinearLayout tGn;
  private boolean tGo = false;
  
  private static boolean a(com.tencent.mm.pluginsdk.model.app.b paramb)
  {
    if (paramb == null) {}
    File localFile;
    do
    {
      return false;
      localFile = new File(paramb.field_fileFullPath);
    } while ((!localFile.exists()) || (localFile.length() != paramb.field_totalLen));
    return true;
  }
  
  private void csB()
  {
    ch localch = new ch();
    com.tencent.mm.pluginsdk.model.e.a(localch, this.bXQ);
    localch.bJF.activity = this;
    localch.bJF.bJM = 39;
    com.tencent.mm.sdk.b.a.sFg.m(localch);
  }
  
  private void csC()
  {
    this.jck.setVisibility(0);
    this.jnr.setVisibility(8);
    this.tGd.setVisibility(0);
    if (csD())
    {
      this.qzW = new ac(this.bJC, this.mediaId, this.ijX);
      au.DF().a(this.qzW, 0);
      com.tencent.mm.modelsimple.z.w(this.bXQ);
    }
  }
  
  private boolean csD()
  {
    int i = -1;
    Object localObject1 = csE();
    Object localObject2;
    long l1;
    long l2;
    long l3;
    String str1;
    long l4;
    boolean bool1;
    label271:
    String str2;
    boolean bool2;
    long l5;
    if (localObject1 == null)
    {
      com.tencent.mm.pluginsdk.model.app.l.c(this.bJC, this.bWW, null);
      localObject2 = csE();
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        l1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).sKx;
        l2 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_totalLen;
        localObject1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath;
        l3 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_type;
        str1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_mediaId;
        l4 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_msgInfoId;
        bool1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_isUpload;
        if (((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_signature == null)
        {
          x.i("MicroMsg.AppAttachDownloadUI", "summerapp tryInitAttachInfo newInfo systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], signature len[%d]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), localObject1, Long.valueOf(l3), str1, Long.valueOf(l4), Boolean.valueOf(bool1), Integer.valueOf(i) });
          if (this.tGh.dws == 0)
          {
            localObject1 = localObject2;
            if (this.tGh.dwo <= 26214400) {
              break label493;
            }
          }
          if (ai.oW(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_signature)) {
            break label271;
          }
        }
        for (bool1 = true;; bool1 = false)
        {
          localObject1 = localObject2;
          if (!bool1) {
            au.DF().a(new com.tencent.mm.pluginsdk.model.app.z((com.tencent.mm.pluginsdk.model.app.b)localObject1, this.dwK, this.kni, this.fileName, this.fjS, this.bSS), 0);
          }
          return bool1;
          i = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_signature.length();
          break;
        }
      }
    }
    else
    {
      localObject2 = new File(((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath);
      if ((((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_status == 199L) && (!((File)localObject2).exists()))
      {
        x.i("MicroMsg.AppAttachDownloadUI", "summerapp tryInitAttachInfo info exist but file not!");
        com.tencent.mm.pluginsdk.model.app.l.c(this.bJC, this.bWW, null);
      }
      l1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).sKx;
      l2 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_totalLen;
      str1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath;
      l3 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_type;
      str2 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_mediaId;
      l4 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_msgInfoId;
      bool1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_isUpload;
      bool2 = ((File)localObject2).exists();
      l5 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_status;
      if (((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_signature != null) {
        break label499;
      }
    }
    for (;;)
    {
      x.i("MicroMsg.AppAttachDownloadUI", "summerapp tryInitAttachInfo info exist systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], file.exists[%b], status[%d], signature len[%d]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), str1, Long.valueOf(l3), str2, Long.valueOf(l4), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Long.valueOf(l5), Integer.valueOf(i) });
      label493:
      bool1 = true;
      break;
      label499:
      i = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_signature.length();
    }
  }
  
  private com.tencent.mm.pluginsdk.model.app.b csE()
  {
    Object localObject = ao.asF().fH(this.bJC);
    if (localObject != null) {
      x.i("MicroMsg.AppAttachDownloadUI", "summerapp getAppAttachInfo by msgId [%d] stack[%s]", new Object[] { Long.valueOf(this.bJC), ai.VI() });
    }
    com.tencent.mm.pluginsdk.model.app.b localb;
    do
    {
      do
      {
        return (com.tencent.mm.pluginsdk.model.app.b)localObject;
        localb = com.tencent.mm.pluginsdk.model.app.l.SZ(this.mediaId);
        if (localb == null)
        {
          x.i("MicroMsg.AppAttachDownloadUI", "summerapp getAppAttachInfo by msgId and mediaId is null stack[%s]", new Object[] { ai.VI() });
          return localb;
        }
        localObject = localb;
      } while (localb.field_msgInfoId == this.bJC);
      localObject = localb;
    } while (com.tencent.mm.a.e.cn(localb.field_fileFullPath));
    com.tencent.mm.pluginsdk.model.app.l.c(this.bJC, this.bWW, null);
    localObject = ao.asF().fH(this.bJC);
    if (localObject == null)
    {
      x.w("MicroMsg.AppAttachDownloadUI", "summerapp getAppAttachInfo create new info from local but failed stack[%s]", new Object[] { ai.VI() });
      return localb;
    }
    com.tencent.mm.sdk.f.e.post(new AppAttachDownloadUI.8(this, localb, (com.tencent.mm.pluginsdk.model.app.b)localObject), "copyAttachFromLocal");
    return localb;
  }
  
  private void csF()
  {
    switch (this.dPU)
    {
    case 1: 
    case 3: 
    case 4: 
    case 5: 
    default: 
      this.jcg.setVisibility(0);
      this.jck.setVisibility(8);
      this.tGd.setVisibility(8);
    case 0: 
    case 6: 
    case 2: 
      do
      {
        do
        {
          return;
        } while (!csG());
        if (bi.Xi(this.fjS))
        {
          localObject = csE();
          Intent localIntent = new Intent(this, ShowImageUI.class);
          localIntent.putExtra("key_message_id", this.bXQ.field_msgId);
          localIntent.putExtra("key_image_path", ((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath);
          localIntent.putExtra("key_favorite", true);
          startActivity(localIntent);
          finish();
          return;
        }
        localObject = getMimeType();
        this.eGD.setVisibility(0);
        this.jck.setVisibility(8);
        this.tGd.setVisibility(8);
        this.jnr.setVisibility(8);
        this.tGf.setVisibility(0);
        if (this.fileName.equals("")) {
          this.tGf.setText(getString(R.l.openapi_app_file));
        }
        while ((localObject == null) || (((String)localObject).equals("")))
        {
          this.jcg.setVisibility(8);
          this.eGD.setText(getString(R.l.download_can_not_open));
          return;
          this.tGf.setText(this.fileName);
        }
        this.jcg.setVisibility(0);
        this.eGD.setText(getString(R.l.download_can_not_open_by_wechat));
        return;
      } while (!csG());
      localObject = new Intent(this, ImageGalleryUI.class);
      ((Intent)localObject).putExtra("img_gallery_msg_id", this.bXQ.field_msgId);
      ((Intent)localObject).putExtra("img_gallery_talker", this.bXQ.field_talker);
      startActivity((Intent)localObject);
      finish();
      overridePendingTransition(0, 0);
      return;
    }
    Object localObject = new Intent();
    ((Intent)localObject).putExtra("App_MsgId", this.bJC);
    setResult(-1, (Intent)localObject);
    finish();
  }
  
  private boolean csG()
  {
    com.tencent.mm.pluginsdk.model.app.b localb = csE();
    if (localb == null) {
      return true;
    }
    if (com.tencent.mm.a.e.cn(localb.field_fileFullPath))
    {
      this.jck.setVisibility(8);
      this.tGd.setVisibility(8);
      this.jnr.setVisibility(8);
      return true;
    }
    this.tGm.setVisibility(8);
    this.tGn.setVisibility(0);
    return false;
  }
  
  private String getMimeType()
  {
    g.a locala = g.a.gp(this.bWW);
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (locala.dwp != null)
    {
      localObject1 = localObject2;
      if (locala.dwp.length() > 0) {
        localObject1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(locala.dwp);
      }
    }
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (((String)localObject1).length() != 0) {}
    }
    else
    {
      x.w("MicroMsg.AppAttachDownloadUI", "getMimeType fail, not a built-in mimetype, use \"*/{fileext}\" instead");
      localObject2 = "*/" + locala.dwp;
    }
    return (String)localObject2;
  }
  
  private void init()
  {
    setMMTitle(R.l.download_title);
    this.bJC = getIntent().getLongExtra("app_msg_id", -1L);
    boolean bool;
    if (this.bJC == -1L) {
      bool = false;
    }
    while (!bool)
    {
      finish();
      return;
      au.HU();
      this.bXQ = com.tencent.mm.model.c.FT().dW(this.bJC);
      if ((this.bXQ == null) || (this.bXQ.field_msgId == 0L) || (this.bXQ.field_content == null))
      {
        bool = false;
      }
      else
      {
        this.tGg = s.fq(this.bXQ.field_talker);
        this.bWW = this.bXQ.field_content;
        if ((this.tGg) && (this.bXQ.field_isSend == 0))
        {
          String str = this.bXQ.field_content;
          localObject = str;
          if (this.tGg)
          {
            localObject = str;
            if (str != null) {
              localObject = com.tencent.mm.model.bd.iC(str);
            }
          }
          this.bWW = ((String)localObject);
        }
        this.tGh = g.a.gp(this.bWW);
        if (this.tGh == null)
        {
          x.e("MicroMsg.AppAttachDownloadUI", "summerapp parse msgContent error, %s", new Object[] { this.bWW });
          bool = false;
        }
        else
        {
          if ((ai.oW(this.tGh.bGP)) && (!ai.oW(this.tGh.dwD)))
          {
            x.e("MicroMsg.AppAttachDownloadUI", "summerapp msgContent format error, %s", new Object[] { this.bWW });
            this.tGh.bGP = this.tGh.dwD.hashCode();
          }
          this.dPU = this.tGh.type;
          this.mediaId = this.tGh.bGP;
          this.fileName = ai.oV(this.tGh.title);
          this.fjS = ai.oV(this.tGh.dwp).toLowerCase();
          this.kni = ai.oV(this.tGh.filemd5);
          this.bSS = ai.oV(this.tGh.bSS);
          this.dwK = ai.oV(this.tGh.dwK);
          x.i("MicroMsg.AppAttachDownloadUI", "summerapp initParams msgId[%d], sender[%d], msgContent[%s], appType[%d], mediaId[%s], fileName[%s]", new Object[] { Long.valueOf(this.bJC), Integer.valueOf(this.bXQ.field_isSend), this.bWW, Integer.valueOf(this.dPU), this.mediaId, this.fileName });
          localObject = csE();
          if (localObject == null)
          {
            x.i("MicroMsg.AppAttachDownloadUI", "summerapp initParams attInfo is null");
            this.tGj = false;
            if (a((com.tencent.mm.pluginsdk.model.app.b)localObject)) {
              bool = com.tencent.mm.pluginsdk.ui.tools.a.a(this, ((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath, this.fjS, 1);
            }
          }
          else
          {
            new File(((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath);
            if (((com.tencent.mm.pluginsdk.model.app.b)localObject).field_offset > 0L) {}
            for (this.tGj = true;; this.tGj = false)
            {
              x.i("MicroMsg.AppAttachDownloadUI", "summerapp initParams attInfo field_fileFullPath[%s], field_offset[%d], isDownloadStarted[%b]", new Object[] { ((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath, Long.valueOf(((com.tencent.mm.pluginsdk.model.app.b)localObject).field_offset), Boolean.valueOf(this.tGj) });
              break;
            }
          }
          bool = true;
        }
      }
    }
    Object localObject = new File(com.tencent.mm.compatible.util.e.dgj);
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdir();
    }
    ao.asF().c(this);
    initView();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd type[%d], [%d, %d, %s]", new Object[] { Integer.valueOf(paraml.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paraml.getType() != 221) && (paraml.getType() != 728)) {}
    do
    {
      return;
      if ((paraml.getType() == 728) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = csE();
        if (paramString == null)
        {
          x.i("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd getAppAttachInfo is null");
          this.qzW = new ac(this.bJC, this.mediaId, this.ijX);
          au.DF().a(this.qzW, 0);
          return;
        }
        if (paramString.field_signature == null) {}
        for (paramInt1 = -1;; paramInt1 = paramString.field_signature.length())
        {
          x.i("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd CheckBigFileDownload ok signature len[%d] start NetSceneDownloadAppAttach", new Object[] { Integer.valueOf(paramInt1) });
          break;
        }
      }
      if ((this.qzW == null) && ((paraml instanceof ac)))
      {
        paramString = (ac)paraml;
        com.tencent.mm.pluginsdk.model.app.b localb = csE();
        if ((localb != null) && (!ai.oW(localb.field_mediaSvrId)) && (localb.field_mediaSvrId.equals(paramString.getMediaId())))
        {
          this.qzW = paramString;
          x.i("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd reset downloadAppAttachScene[%s] by mediaSvrId[%s]", new Object[] { this.qzW, localb.field_mediaSvrId });
        }
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = h.mEJ;
        paraml = this.tGh.dwD;
        if (this.tGh.dws == 1) {}
        for (paramInt1 = 7;; paramInt1 = 5)
        {
          paramString.h(14665, new Object[] { paraml, Integer.valueOf(paramInt1), Integer.valueOf(this.tGh.dwo), Integer.valueOf(0), Integer.valueOf(0), this.fjS });
          return;
        }
      }
      if ((paramInt2 != 0) && (com.tencent.mm.sdk.a.b.chp())) {
        Toast.makeText(this, "errCode[" + paramInt2 + "]", 0).show();
      }
      if (paramInt2 != -5103059) {
        break;
      }
      this.tGn.setVisibility(0);
      this.tGm.setVisibility(8);
    } while (this.dPU != 6);
    paramString = h.mEJ;
    paraml = this.tGh.dwD;
    if (this.tGh.dws == 1) {}
    for (paramInt1 = 7;; paramInt1 = 5)
    {
      paramString.h(14665, new Object[] { paraml, Integer.valueOf(paramInt1), Integer.valueOf(this.tGh.dwo), Integer.valueOf(1), Integer.valueOf(0), this.fjS });
      return;
    }
    this.jck.setVisibility(8);
    this.jnr.setVisibility(0);
    this.tGd.setVisibility(8);
    x.e("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd, download fail, type = " + paraml.getType() + " errType = " + paramInt1 + ", errCode = " + paramInt2);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    paramString = csE();
    long l1;
    long l2;
    if (paramString != null)
    {
      l1 = paramString.field_totalLen;
      l2 = paramString.field_offset;
      this.tGe.setText(getString(R.l.download_data, new Object[] { ai.bF(l2), ai.bF(l1) }));
      if (paramString.field_totalLen != 0L) {
        break label328;
      }
    }
    label328:
    for (int i = 0;; i = (int)(paramString.field_offset * 100L / paramString.field_totalLen))
    {
      x.v("MicroMsg.AppAttachDownloadUI", "summerapp attach progress:" + i + " offset:" + l2 + " totallen:" + l1);
      this.eVR.setProgress(i);
      if ((paramString.field_status == 199L) && (i >= 100) && (!this.tGi))
      {
        this.tGi = true;
        if (this.tGo)
        {
          this.tGo = false;
          csB();
        }
        if (paramString != null)
        {
          Toast.makeText(this, getString(R.l.download_success) + " : " + paramString.field_fileFullPath.replaceFirst(com.tencent.mm.compatible.util.e.bnC, com.tencent.mm.compatible.util.e.dgi), this.tGl).show();
          com.tencent.mm.pluginsdk.ui.tools.a.b(this, paramString.field_fileFullPath, this.fjS, 1);
        }
        ah.i(new Runnable()
        {
          public final void run()
          {
            AppAttachDownloadUI.v(AppAttachDownloadUI.this);
          }
        }, 200L);
      }
      if ((this.jck.getVisibility() != 0) && (i < 100) && (!paramString.field_isUpload) && (paramString.field_status == 101L))
      {
        x.i("MicroMsg.AppAttachDownloadUI", "summerapp still downloading updateProgress progress[%d]", new Object[] { Integer.valueOf(i) });
        this.jck.setVisibility(0);
        this.jnr.setVisibility(8);
        this.tGd.setVisibility(0);
      }
      return;
    }
  }
  
  public final void cbU()
  {
    Toast.makeText(this, R.l.download_pause_tip, 0).show();
  }
  
  protected final int getLayoutId()
  {
    return R.i.download_ui;
  }
  
  protected final void initView()
  {
    this.mel = ((MMImageView)findViewById(R.h.download_type_icon));
    this.jck = findViewById(R.h.download_progress_area);
    this.eVR = ((ProgressBar)findViewById(R.h.download_pb));
    this.mem = ((ImageView)findViewById(R.h.download_stop_btn));
    this.jnr = ((Button)findViewById(R.h.download_continue_btn));
    this.jcg = ((Button)findViewById(R.h.download_open_btn));
    this.tGd = findViewById(R.h.download_data_area);
    this.eGD = ((TextView)findViewById(R.h.download_hint));
    this.tGe = ((TextView)findViewById(R.h.download_data_size));
    this.tGf = ((TextView)findViewById(R.h.download_file_name));
    this.tGm = ((LinearLayout)findViewById(R.h.download_ll));
    this.tGn = ((LinearLayout)findViewById(R.h.load_fail_ll));
    this.mem.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppAttachDownloadUI.k(AppAttachDownloadUI.this).setVisibility(8);
        AppAttachDownloadUI.l(AppAttachDownloadUI.this).setVisibility(0);
        AppAttachDownloadUI.m(AppAttachDownloadUI.this).setVisibility(8);
        x.i("MicroMsg.AppAttachDownloadUI", "summerapp stopBtn downloadAppAttachScene[%s]", new Object[] { AppAttachDownloadUI.a(AppAttachDownloadUI.this) });
        if (AppAttachDownloadUI.a(AppAttachDownloadUI.this) != null)
        {
          paramAnonymousView = AppAttachDownloadUI.a(AppAttachDownloadUI.this);
          AppAttachDownloadUI localAppAttachDownloadUI = AppAttachDownloadUI.this;
          if (!paramAnonymousView.qAk)
          {
            com.tencent.mm.modelcdntran.g.ND().lx(paramAnonymousView.dVk);
            paramAnonymousView.qAe = ao.asF().SR(paramAnonymousView.mediaId);
          }
          x.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig pause listener[%s], info[%s], justSaveFile[%b], stack[%s]", new Object[] { localAppAttachDownloadUI, paramAnonymousView.qAe, Boolean.valueOf(paramAnonymousView.qAk), bi.cjd() });
          if (paramAnonymousView.qAe != null)
          {
            if ((paramAnonymousView.qAe.field_status == 101L) && (localAppAttachDownloadUI != null)) {
              localAppAttachDownloadUI.cbU();
            }
            paramAnonymousView.qAe.field_status = 102L;
            if (!paramAnonymousView.qAk) {
              ao.asF().c(paramAnonymousView.qAe, new String[0]);
            }
          }
          com.tencent.mm.kernel.g.DF().c(AppAttachDownloadUI.a(AppAttachDownloadUI.this));
        }
        do
        {
          return;
          paramAnonymousView = AppAttachDownloadUI.o(AppAttachDownloadUI.this);
        } while ((paramAnonymousView == null) || (paramAnonymousView.field_status == 199L));
        x.i("MicroMsg.AppAttachDownloadUI", "summerapp stopBtn onClick but scene is null and set status[%d] paused", new Object[] { Long.valueOf(paramAnonymousView.field_status) });
        paramAnonymousView.field_status = 102L;
        ao.asF().c(paramAnonymousView, new String[0]);
      }
    });
    this.jnr.setOnClickListener(new AppAttachDownloadUI.6(this));
    this.jcg.setOnClickListener(new AppAttachDownloadUI.7(this));
    Object localObject;
    int i;
    switch (this.dPU)
    {
    case 1: 
    case 3: 
    case 5: 
    default: 
      this.mel.setImageResource(R.k.app_attach_file_icon_unknow);
      setBackBtn(new AppAttachDownloadUI.1(this));
      this.bUY = getIntent().getBooleanExtra("app_show_share", true);
      if (this.bUY) {
        addIconOptionMenu(0, R.k.actionbar_icon_dark_more, new AppAttachDownloadUI.2(this));
      }
      this.tGi = false;
      localObject = csE();
      if ((localObject == null) || (!new File(((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath).exists()))
      {
        i = 0;
        label349:
        if (i == 0) {
          break label486;
        }
        x.i("MicroMsg.AppAttachDownloadUI", "summerapp isCanOpenFile");
        this.tGi = true;
        csF();
      }
      break;
    }
    label486:
    do
    {
      do
      {
        return;
        this.mel.setImageResource(R.g.app_attach_file_icon_pic);
        break;
        this.mel.setImageResource(R.k.app_attach_file_icon_video);
        break;
        this.mel.setImageResource(com.tencent.mm.pluginsdk.model.o.SQ(this.fjS));
        break;
        if (bi.Xi(this.fjS))
        {
          this.mel.setImageResource(R.g.app_attach_file_icon_pic);
          break;
        }
        this.mel.setImageResource(R.k.app_attach_file_icon_unknow);
        break;
        if ((((com.tencent.mm.pluginsdk.model.app.b)localObject).aSc()) || ((this.bXQ.field_isSend == 1) && (((com.tencent.mm.pluginsdk.model.app.b)localObject).field_isUpload)))
        {
          i = 1;
          break label349;
        }
        i = 0;
        break label349;
        if ((localObject != null) && (((com.tencent.mm.pluginsdk.model.app.b)localObject).aSc()) && (!new File(((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath).exists()))
        {
          x.i("MicroMsg.AppAttachDownloadUI", "summerapp set fail info[%s]", new Object[] { localObject });
          this.tGm.setVisibility(8);
          this.tGn.setVisibility(0);
          return;
        }
      } while (this.tGi);
      this.ijX = new AppAttachDownloadUI.4(this);
      switch (this.dPU)
      {
      case 1: 
      case 3: 
      case 4: 
      case 5: 
      default: 
        x.i("MicroMsg.AppAttachDownloadUI", "summerapp progressCallBack[%s], isDownloadFinished[%b], isDownloadStarted[%b]", new Object[] { this.ijX, Boolean.valueOf(this.tGi), Boolean.valueOf(this.tGj) });
      }
    } while ((this.dPU != 2) && ((this.tGi) || (this.tGj)));
    csC();
    return;
    if (this.tGj)
    {
      this.jnr.setVisibility(0);
      label702:
      this.jck.setVisibility(8);
      this.tGd.setVisibility(8);
      this.jcg.setVisibility(8);
      this.eGD.setVisibility(8);
      this.tGf.setVisibility(0);
      if (!this.fileName.equals("")) {
        break label840;
      }
      this.tGf.setText(getString(R.l.openapi_app_file));
      label773:
      localObject = getMimeType();
      if ((localObject != null) && (!((String)localObject).equals(""))) {
        break label854;
      }
      this.eGD.setText(getString(R.l.download_can_not_open));
    }
    while (bi.Xi(this.fjS))
    {
      this.eGD.setVisibility(8);
      break;
      this.jnr.setVisibility(8);
      break label702;
      label840:
      this.tGf.setText(this.fileName);
      break label773;
      label854:
      this.eGD.setText(getString(R.l.download_can_not_open_by_wechat));
    }
    if (this.tGj) {
      this.jnr.setVisibility(0);
    }
    for (;;)
    {
      this.jck.setVisibility(8);
      this.tGd.setVisibility(8);
      this.jcg.setVisibility(8);
      this.tGf.setVisibility(8);
      this.eGD.setVisibility(8);
      this.eGD.setText(getString(R.l.download_can_not_open_by_wechat));
      break;
      this.jnr.setVisibility(8);
    }
    this.jck.setVisibility(8);
    this.tGd.setVisibility(8);
    if (this.tGj) {
      this.jnr.setVisibility(0);
    }
    for (;;)
    {
      this.jcg.setVisibility(8);
      this.tGf.setVisibility(8);
      this.eGD.setVisibility(8);
      break;
      this.jnr.setVisibility(8);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.pluginsdk.ui.tools.a.a(this, paramInt1, paramInt2, paramIntent, this.tGk, R.l.download_no_match_msg, R.l.download_no_match_title, 1);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    init();
  }
  
  protected void onDestroy()
  {
    ao.asF().d(this);
    super.onDestroy();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    init();
  }
  
  protected void onPause()
  {
    au.DF().b(221, this);
    au.DF().b(728, this);
    super.onPause();
    ln localln = new ln();
    localln.bVQ.bVR = false;
    com.tencent.mm.sdk.b.a.sFg.a(localln, getMainLooper());
    x.d("MicroMsg.AppAttachDownloadUI", "AppAttachDownloadUI cancel pause auto download logic");
  }
  
  protected void onResume()
  {
    super.onResume();
    au.DF().a(221, this);
    au.DF().a(728, this);
    ln localln = new ln();
    localln.bVQ.bVR = true;
    com.tencent.mm.sdk.b.a.sFg.a(localln, getMainLooper());
    x.d("MicroMsg.AppAttachDownloadUI", "AppAttachDownloadUI req pause auto download logic");
    this.jcg.setEnabled(true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/AppAttachDownloadUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */