package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.model.r;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.ab;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.chat.AppPanel;
import com.tencent.mm.pluginsdk.ui.chat.AppPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.ata;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import java.util.ArrayList;
import java.util.List;

public class MassSendMsgUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private static String lbi = "";
  private String filePath;
  private TextView kxe;
  private ChatFooter laA;
  private String laC;
  private List<String> laD;
  private boolean laE = false;
  private TextView lbh;
  private com.tencent.mm.ui.widget.a.c lbj;
  private b lbk;
  private AppPanel.a lbl = new MassSendMsgUI.9(this);
  private p tipDialog = null;
  
  public static void Go(String paramString)
  {
    lbi = paramString;
  }
  
  private static void Gp(String paramString)
  {
    long l = com.tencent.mm.a.e.cm(paramString);
    int i = bi.f((Integer)com.tencent.mm.plugin.report.service.h.a((int)(l / 1024L), new int[] { 512, 1024, 2048, 5120, 8192, 10240, 15360, 20480 }, 247, 255));
    com.tencent.mm.plugin.report.service.h.mEJ.a(106L, i, 1L, false);
    com.tencent.mm.plugin.report.service.h.mEJ.a(106L, 246L, 1L, false);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MassSendMsgUI", "report video size res : " + i + " hadCompress : true fileLen : " + l / 1024L + "K");
  }
  
  private void R(Intent paramIntent)
  {
    Object localObject = paramIntent.getStringExtra("VideoRecorder_FileName");
    int i = paramIntent.getIntExtra("VideoRecorder_VideoLength", 0);
    paramIntent = new com.tencent.mm.plugin.masssend.a.a();
    paramIntent.laj = this.laC;
    paramIntent.lak = this.laD.size();
    paramIntent.filename = ((String)localObject);
    paramIntent.lal = i;
    paramIntent.msgType = 43;
    paramIntent = new com.tencent.mm.plugin.masssend.a.f(paramIntent, this.laE);
    au.DF().a(paramIntent, 0);
    localObject = this.mController.tml;
    getString(R.l.app_tip);
    this.tipDialog = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.sendrequest_sending), true, new MassSendMsgUI.11(this, paramIntent));
  }
  
  private void S(Intent paramIntent)
  {
    Object localObject = paramIntent.getStringExtra("CropImage_OutputPath");
    if (localObject == null) {
      return;
    }
    if (q.a((String)localObject, null, paramIntent.getBooleanExtra("CropImage_Compress_Img", true))) {}
    for (int i = 1;; i = 0)
    {
      com.tencent.mm.plugin.masssend.a.h.bco();
      paramIntent = com.tencent.mm.plugin.masssend.a.b.i((String)localObject, this.laC, this.laD.size(), i);
      if (paramIntent == null) {
        break;
      }
      paramIntent = new com.tencent.mm.plugin.masssend.a.f(paramIntent, this.laE, i);
      au.DF().a(paramIntent, 0);
      localObject = this.mController.tml;
      getString(R.l.app_tip);
      this.tipDialog = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.sendrequest_sending), true, new MassSendMsgUI.12(this, paramIntent));
      return;
    }
  }
  
  private void T(Intent paramIntent)
  {
    if (!ab.bU(this))
    {
      com.tencent.mm.ui.base.h.a(this, R.l.video_export_file_warning, R.l.app_tip, new MassSendMsgUI.2(this, paramIntent), new MassSendMsgUI.3(this));
      return;
    }
    U(paramIntent);
  }
  
  private void U(Intent paramIntent)
  {
    com.tencent.mm.modelvideo.c localc = new com.tencent.mm.modelvideo.c();
    getString(R.l.app_tip);
    this.tipDialog = com.tencent.mm.ui.base.h.a(this, getString(R.l.app_waiting), true, new MassSendMsgUI.4(this, localc));
    localc.a(this, paramIntent, new MassSendMsgUI.5(this));
  }
  
  private void auu()
  {
    if (!com.tencent.mm.pluginsdk.ui.tools.l.c(this, com.tencent.mm.compatible.util.e.dgl, "microMsg." + System.currentTimeMillis() + ".jpg", 2)) {
      Toast.makeText(this, getString(R.l.selectcameraapp_none), 1).show();
    }
  }
  
  private boolean dE(String paramString1, String paramString2)
  {
    boolean bool = ao.is2G(this);
    int i;
    if (bool)
    {
      i = 10485760;
      label16:
      if (!bool) {
        break label138;
      }
    }
    label138:
    for (double d = 60000.0D;; d = 300000.0D)
    {
      i = SightVideoJNI.shouldRemuxing(paramString2, 660, 500, i, d, 1000000);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MassSendMsgUI", "check remuxing, ret %d", new Object[] { Integer.valueOf(i) });
      switch (i)
      {
      default: 
        return false;
        i = 26214400;
        break label16;
      }
    }
    com.tencent.mm.modelvideo.o.Ta();
    Gp(com.tencent.mm.modelvideo.s.nK(paramString1));
    return true;
    return false;
    com.tencent.mm.modelvideo.o.Ta();
    String str = com.tencent.mm.modelvideo.s.nK(paramString1);
    MediaMetadataRetriever localMediaMetadataRetriever = new MediaMetadataRetriever();
    localMediaMetadataRetriever.setDataSource(paramString2);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MassSendMsgUI", "start remux, targetPath: %s", new Object[] { str });
    int m = bi.getInt(localMediaMetadataRetriever.extractMetadata(18), 0);
    int n = bi.getInt(localMediaMetadataRetriever.extractMetadata(19), 0);
    VideoTransPara localVideoTransPara = new VideoTransPara();
    Object localObject = new PInt();
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    PInt localPInt3 = new PInt();
    PInt localPInt4 = new PInt();
    com.tencent.mm.plugin.sight.base.d.a(paramString2, (PInt)localObject, localPInt1, localPInt2, localPInt3, localPInt4);
    localVideoTransPara.duration = (((PInt)localObject).value / 1000);
    localVideoTransPara.width = localPInt1.value;
    localVideoTransPara.height = localPInt2.value;
    localVideoTransPara.fps = localPInt3.value;
    localVideoTransPara.videoBitrate = localPInt4.value;
    localObject = com.tencent.mm.modelcontrol.d.NP().b(localVideoTransPara);
    int i2 = com.tencent.mm.plugin.sight.base.b.nbW;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MassSendMsgUI", "check remuxing old para %s, newPara: %s", new Object[] { localVideoTransPara, localObject });
    int i1;
    int j;
    int k;
    if (localObject == null)
    {
      i1 = 0;
      i = n;
      j = m;
      if (i1 < 3)
      {
        k = j;
        if (j % 2 != 0) {
          k = j - 1;
        }
        j = i;
        if (i % 2 != 0) {
          j = i - 1;
        }
        if (((k >= j) && ((k <= 640) || (j <= 480))) || ((k <= j) && ((k <= 480) || (j <= 640))))
        {
          i = k;
          k = i2;
        }
      }
    }
    for (;;)
    {
      localMediaMetadataRetriever.release();
      k = SightVideoJNI.remuxing(paramString2, str, i, j, k, com.tencent.mm.plugin.sight.base.b.nbV, 8, 2, 25.0F, com.tencent.mm.plugin.sight.base.b.nbX, null, 0, false);
      if (k >= 0) {
        break label615;
      }
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MassSendMsgUI", "remuxing video error");
      return false;
      i = k / 2;
      k = j / 2;
      i1 += 1;
      j = i;
      i = k;
      break;
      j = n;
      i = m;
      k = i2;
      continue;
      i = ((VideoTransPara)localObject).width;
      j = ((VideoTransPara)localObject).height;
      k = ((VideoTransPara)localObject).videoBitrate;
    }
    label615:
    Gp(str);
    com.tencent.mm.modelvideo.o.Ta();
    paramString1 = com.tencent.mm.modelvideo.s.nL(paramString1);
    if (!FileOp.cn(paramString1)) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MassSendMsgUI", "thumb not exist create one, thumbPath: %s", new Object[] { paramString1 });
    }
    try
    {
      paramString2 = ThumbnailUtils.createVideoThumbnail(str, 1);
      if (paramString2 != null) {
        com.tencent.mm.sdk.platformtools.c.a(paramString2, 60, Bitmap.CompressFormat.JPEG, paramString1, true);
      }
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.MassSendMsgUI", paramString1, "", new Object[0]);
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MassSendMsgUI", "create thumb error: %s", new Object[] { paramString1.getMessage() });
      }
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MassSendMsgUI", "do remux, targetPath: %s, outputWidth: %s, outputHeight: %s, retDuration: %s", new Object[] { str, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
    return true;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MassSendMsgUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    if (this.lbk != null)
    {
      b localb = this.lbk;
      if (localb.tipDialog != null)
      {
        localb.tipDialog.dismiss();
        localb.tipDialog = null;
      }
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      lbi = "";
      paramString = new Intent(this, MassSendHistoryUI.class);
      paramString.addFlags(67108864);
      startActivity(paramString);
      finish();
      return;
    }
    if ((paramInt1 == 4) && (paramInt2 == -24))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MassSendMsgUI", "onSceneEnd, masssend err spam");
      Toast.makeText(this, R.l.mass_send_err_spam, 0).show();
      return;
    }
    if ((paramInt1 == 2) || (paramInt1 == 1) || (paramInt1 == 3)) {
      this.laA.setLastText(lbi);
    }
    com.tencent.mm.plugin.masssend.a.ezo.a(this.mController.tml, paramInt1, paramInt2, paramString);
    switch (paramInt2)
    {
    default: 
      Toast.makeText(this, R.l.sendrequest_send_fail, 0).show();
      return;
    case -71: 
      paramInt1 = ((ata)((com.tencent.mm.plugin.masssend.a.f)paraml).diG.dIE.dIL).rVz;
      com.tencent.mm.ui.base.h.a(this, getString(R.l.mass_send_tolist_limit, new Object[] { Integer.valueOf(paramInt1) }), getString(R.l.app_tip), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          MassSendMsgUI.this.finish();
        }
      });
      return;
    }
    Toast.makeText(this, R.l.mass_send_err_freq_limit, 0).show();
  }
  
  protected final int getLayoutId()
  {
    return R.i.mass_send_msg;
  }
  
  protected final void initView()
  {
    boolean bool = false;
    setMMTitle(R.l.mass_send_msg);
    this.lbh = ((TextView)findViewById(R.h.mass_send_msg_contact_list));
    this.kxe = ((TextView)findViewById(R.h.mass_send_msg_contact_count));
    TextView localTextView = this.lbh;
    int j = (int)this.lbh.getTextSize();
    if (this.laD == null) {}
    for (Object localObject = new SpannableString("");; localObject = j.a(this, ((StringBuilder)localObject).toString(), j))
    {
      localTextView.setText((CharSequence)localObject);
      this.kxe.setText(getResources().getQuantityString(R.j.mass_send_count, this.laD.size(), new Object[] { Integer.valueOf(this.laD.size()) }));
      this.laA = ((ChatFooter)findViewById(R.h.nav_footer));
      ((MassSendLayout)findViewById(R.h.mass_send_root_layout)).setPanel(this.laA.getPanel());
      this.laA.setCattingRootLayoutId(R.h.mass_send_root_layout);
      this.lbk = new b(this, this.laA, this.laC, this.laD, this.laE);
      this.laA.setFooterEventListener(this.lbk);
      localObject = new d(this);
      this.laA.setSmileyPanelCallback((com.tencent.mm.pluginsdk.ui.chat.f)localObject);
      localObject = this.laA;
      au.HU();
      j = ((Integer)com.tencent.mm.model.c.DT().get(18, Integer.valueOf(-1))).intValue();
      int i = j;
      if (j == -1) {
        i = 1;
      }
      ((ChatFooter)localObject).setMode(i);
      this.laA.setUserName("masssendapp");
      this.laA.qLk.refresh();
      au.HU();
      if (((Boolean)com.tencent.mm.model.c.DT().get(66832, Boolean.valueOf(false))).booleanValue())
      {
        this.laA.ceF();
        this.laA.ceB();
      }
      this.laA.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable) {}
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          paramAnonymousCharSequence = String.valueOf(paramAnonymousCharSequence);
          String str = paramAnonymousCharSequence.substring(paramAnonymousInt1, paramAnonymousInt1 + paramAnonymousInt3);
          Bitmap localBitmap;
          if (((MassSendMsgUI.a(MassSendMsgUI.this) == null) || (!MassSendMsgUI.a(MassSendMsgUI.this).isShowing())) && (com.tencent.mm.sdk.platformtools.o.Wd(str)))
          {
            localBitmap = com.tencent.mm.sdk.platformtools.c.e(str, 300, 300, false);
            if (localBitmap == null) {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MassSendMsgUI", "showAlert fail, bmp is null");
            }
          }
          else
          {
            return;
          }
          ImageView localImageView = new ImageView(MassSendMsgUI.this);
          localImageView.setImageBitmap(localBitmap);
          paramAnonymousInt2 = MassSendMsgUI.this.getResources().getDimensionPixelSize(R.f.LargePadding);
          localImageView.setPadding(paramAnonymousInt2, paramAnonymousInt2, paramAnonymousInt2, paramAnonymousInt2);
          MassSendMsgUI.a(MassSendMsgUI.this, com.tencent.mm.ui.base.h.a(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.chatting_send_img_confirm), localImageView, MassSendMsgUI.this.getString(R.l.app_ok), MassSendMsgUI.this.getString(R.l.app_cancel), new MassSendMsgUI.8.1(this, str), null));
          paramAnonymousCharSequence = paramAnonymousCharSequence.substring(0, paramAnonymousInt1) + paramAnonymousCharSequence.substring(paramAnonymousInt1 + paramAnonymousInt3);
          MassSendMsgUI.b(MassSendMsgUI.this).o(paramAnonymousCharSequence, -1, false);
          MassSendMsgUI.Gq(paramAnonymousCharSequence);
        }
      });
      this.laA.ceA();
      this.laA.cet();
      this.laA.cez();
      this.laA.S(true, true);
      this.laA.cey();
      this.laA.kP(true);
      this.laA.setAppPanelListener(this.lbl);
      localObject = this.laA;
      com.tencent.mm.bg.d.cfH();
      if ((com.tencent.mm.al.b.Pz()) || ((q.GQ() & 0x2000000) != 0)) {
        bool = true;
      }
      ((ChatFooter)localObject).kQ(bool);
      this.laA.cev();
      this.laA.ceE();
      setBackBtn(new MassSendMsgUI.1(this));
      return;
      localObject = new StringBuilder();
      i = 0;
      if (i < this.laD.size())
      {
        String str = r.gT((String)this.laD.get(i));
        if (i == this.laD.size() - 1) {
          ((StringBuilder)localObject).append(str);
        }
        for (;;)
        {
          i += 1;
          break;
          ((StringBuilder)localObject).append(str + ",  ");
        }
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MassSendMsgUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1) {}
    do
    {
      for (;;)
      {
        return;
        switch (paramInt1)
        {
        case 3: 
        default: 
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MassSendMsgUI", "onActivityResult: not found this requestCode");
          return;
        case 1: 
          if (paramIntent != null)
          {
            if (paramIntent.getBooleanExtra("is_video", false))
            {
              paramIntent = paramIntent.getStringExtra("video_full_path");
              localObject = new Intent();
              ((Intent)localObject).setData(Uri.parse("file://" + paramIntent));
              T((Intent)localObject);
              return;
            }
            localObject = new Intent();
            ((Intent)localObject).putExtra("CropImageMode", 4);
            ((Intent)localObject).putExtra("CropImage_Filter", true);
            m localm = com.tencent.mm.plugin.masssend.a.ezn;
            au.HU();
            localm.a(this, paramIntent, (Intent)localObject, com.tencent.mm.model.c.Gb(), 4, null);
            return;
          }
          break;
        case 2: 
          localObject = getApplicationContext();
          au.HU();
          this.filePath = com.tencent.mm.pluginsdk.ui.tools.l.d((Context)localObject, paramIntent, com.tencent.mm.model.c.Gb());
          if (this.filePath != null)
          {
            paramIntent = new Intent();
            paramIntent.putExtra("CropImageMode", 4);
            paramIntent.putExtra("CropImage_Filter", true);
            paramIntent.putExtra("CropImage_ImgPath", this.filePath);
            com.tencent.mm.plugin.masssend.a.ezn.a(this.mController.tml, paramIntent, 4);
            return;
          }
          break;
        case 4: 
          S(paramIntent);
          return;
        case 8: 
          paramIntent = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
          if (paramIntent != null) {
            if (paramIntent.lec)
            {
              localObject = paramIntent.lek;
              if (bi.oW((String)localObject)) {
                continue;
              }
              try
              {
                boolean bool = paramIntent.led;
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MassSendMsgUI", "doSendChattingImage, path: %s", new Object[] { localObject });
                com.tencent.mm.plugin.masssend.a.h.bco();
                paramIntent = com.tencent.mm.plugin.masssend.a.b.i((String)localObject, this.laC, this.laD.size(), 0);
                if (paramIntent != null)
                {
                  paramIntent = new com.tencent.mm.plugin.masssend.a.f(paramIntent, this.laE, 0);
                  au.DF().a(paramIntent, 0);
                  localObject = this.mController.tml;
                  getString(R.l.app_tip);
                  this.tipDialog = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.sendrequest_sending), true, new MassSendMsgUI.13(this, paramIntent));
                  return;
                }
              }
              catch (Exception paramIntent)
              {
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MassSendMsgUI", "doSendChattingImage error: %s", new Object[] { paramIntent.getMessage() });
                return;
              }
            }
          }
          break;
        }
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MassSendMsgUI", "video path %s thumb path ", new Object[] { paramIntent.lee, paramIntent.lef });
      com.tencent.mm.modelvideo.o.Ta();
      Object localObject = com.tencent.mm.modelvideo.s.nK(paramIntent.leg);
      if (!paramIntent.lee.equals(localObject))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MassSendMsgUI", "filepath not videopath and move it %s %s", new Object[] { paramIntent.lee, localObject });
        FileOp.av(paramIntent.lee, (String)localObject);
      }
      localObject = paramIntent.leg;
      paramInt1 = paramIntent.lei;
      paramIntent = new com.tencent.mm.modelvideo.c();
      getString(R.l.app_tip);
      this.tipDialog = com.tencent.mm.ui.base.h.a(this, getString(R.l.app_waiting), true, new MassSendMsgUI.14(this, paramIntent));
      com.tencent.mm.sdk.f.e.post(new MassSendMsgUI.15(this, (String)localObject, paramInt1), "MassSend_Remux");
      return;
    } while (paramIntent == null);
    if (paramIntent.getBooleanExtra("from_record", false))
    {
      R(paramIntent);
      return;
    }
    T(paramIntent);
    return;
    R(paramIntent);
    return;
    T(paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    au.DF().a(193, this);
    this.laE = getIntent().getBooleanExtra("mass_send_again", false);
    this.laC = getIntent().getStringExtra("mass_send_contact_list");
    paramBundle = this.laC;
    this.laD = new ArrayList();
    if ((paramBundle == null) || (paramBundle.equals(""))) {}
    for (;;)
    {
      initView();
      return;
      paramBundle = paramBundle.split(";");
      if ((paramBundle != null) && (paramBundle.length > 0)) {
        this.laD = bi.F(paramBundle);
      }
    }
  }
  
  protected void onDestroy()
  {
    au.DF().b(193, this);
    super.onDestroy();
    if (this.laA != null) {
      this.laA.destroy();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0) && (this.laA.ceI()))
    {
      this.laA.setBottomPanelVisibility(8);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    this.laA.aMo();
    this.laA.onPause();
    super.onPause();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MassSendMsgUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      auu();
      return;
    }
    com.tencent.mm.ui.base.h.a(this, getString(R.l.permission_camera_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new MassSendMsgUI.10(this), null);
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.laA != null)
    {
      this.laA.setLastText(lbi);
      this.laA.a(this.mController.tml, this);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/masssend/ui/MassSendMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */