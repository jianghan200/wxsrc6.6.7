package com.tencent.mm.plugin.mmsight.ui;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.g.a.ls;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.a.d.a;
import com.tencent.mm.plugin.mmsight.model.a.k;
import com.tencent.mm.plugin.mmsight.model.c.a;
import com.tencent.mm.plugin.mmsight.model.e;
import com.tencent.mm.plugin.mmsight.model.e.a;
import com.tencent.mm.plugin.mmsight.model.i;
import com.tencent.mm.plugin.mmsight.model.o;
import com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.plugin.w.a.a;
import com.tencent.mm.plugin.w.a.d;
import com.tencent.mm.plugin.w.a.e;
import com.tencent.mm.plugin.w.a.f;
import com.tencent.mm.plugin.webview.ui.tools.widget.m;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.protocal.c.aso;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;

@com.tencent.mm.ui.base.a(3)
public class SightCaptureUI
  extends MMActivity
  implements d.a, c.a
{
  private String cas = "";
  private b epT;
  private int fOu = -1;
  private boolean fOv = false;
  private long fOw = -1L;
  private com.tencent.mm.plugin.mmsight.model.a.d fam;
  private ObservableTextureView fbo;
  private com.tencent.mm.remoteservice.d iMQ = new com.tencent.mm.remoteservice.d(ad.getContext());
  private View kIx;
  private int lel = 2;
  private VideoTransPara lem;
  private SightParams lip;
  private VideoPlayerTextureView lkZ;
  private VideoSeekBarEditorView lla;
  private f.a llf = new SightCaptureUI.19(this);
  private ViewGroup lpA;
  private MMSightRecordButton lpB;
  private View lpC;
  private View lpD;
  private ViewGroup lpE;
  private ViewGroup lpF;
  private ImageView lpG;
  private ImageView lpH;
  private SurfaceTexture lpI;
  CameraFrontSightView lpJ;
  private ViewGroup lpK;
  private ImageView lpL;
  private MMSightCameraGLSurfaceView lpM;
  private com.tencent.mm.plugin.mmsight.ui.cameraglview.a lpN;
  private TextView lpO;
  private MMSightCaptureTouchView lpP;
  private View lpQ;
  private a lpR;
  private boolean lpS = true;
  private aso lpT = new aso();
  private byte[] lpU;
  private int lpV;
  private int lpW;
  private int lpX;
  private int lpY;
  private byte[] lpZ;
  private int lpx = 1;
  private boolean lpy = true;
  private e lpz;
  private int lqa;
  private com.tencent.mm.plugin.mmsight.model.c lqb;
  private boolean lqc = false;
  private boolean lqd = false;
  private boolean lqe = false;
  private int lqf = 0;
  private int lqg = 0;
  private Thread lqh = null;
  private long lqi = -1L;
  private boolean lqj = false;
  private boolean lqk = false;
  private Runnable lql = new SightCaptureUI.17(this);
  private String lqm;
  private String lqn;
  private boolean lqo;
  private Bundle lqp;
  private Runnable lqq = new SightCaptureUI.18(this);
  
  private String aG(String paramString, boolean paramBoolean)
  {
    boolean bool1 = CaptureMMProxy.getInstance().getBoolean(aa.a.sVr, true);
    boolean bool2 = CaptureMMProxy.getInstance().getBoolean(aa.a.sVs, true);
    if (paramBoolean) {}
    for (String str = com.tencent.mm.plugin.mmsight.d.oN("jpg");; str = com.tencent.mm.plugin.mmsight.d.oN("mp4"))
    {
      if (((bool1) && (paramBoolean)) || ((bool2) && (!paramBoolean)))
      {
        x.i("MicroMsg.SightCaptureUI", "auto save src %s dest %s state %s %s", new Object[] { paramString, str, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        FileOp.y(paramString, str);
        r.a(str, this);
      }
      return str;
    }
  }
  
  private void bfl()
  {
    updateState(0);
    this.lqg = 0;
    this.fOv = false;
    this.lqk = false;
    if (this.lkZ != null)
    {
      this.lkZ.stop();
      this.lkZ.setVideoCallback(null);
    }
    try
    {
      ViewGroup.LayoutParams localLayoutParams = this.lkZ.getLayoutParams();
      this.lpE.removeView(this.lkZ);
      this.lpE.addView(this.lkZ, 0, localLayoutParams);
      if (this.lpR != null)
      {
        this.lpR.release();
        this.lpR = null;
      }
      this.lpM.setVisibility(0);
      this.lpL.setImageBitmap(null);
      bfq();
      this.lpz = new e(this.lem, this.lip.scene);
      this.lpz.a(this.lpN.lqP);
      if (!this.lpz.o(this, this.lpS))
      {
        updateState(8);
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.SightCaptureUI", "clearVideoPlayViewContent, error: %s", new Object[] { localException.getMessage() });
      }
    }
    if (this.fbo.isAvailable())
    {
      this.lpI = this.fbo.getSurfaceTexture();
      x.i("MicroMsg.SightCaptureUI", "surface already available, directly set local surface: %s", new Object[] { this.lpI });
      if (gz(false)) {
        updateState(1);
      }
    }
    for (;;)
    {
      if ((this.lpO != null) && (this.lpy))
      {
        this.lpO.setAlpha(1.0F);
        this.lpO.setVisibility(0);
      }
      com.tencent.mm.plugin.mmsight.model.c localc = this.lqb;
      x.i("MicroMsg.DeviceOrientationListener", "reset");
      localc.lfm = -1;
      localc.orientation = -1;
      localc.lfl = -1;
      this.lqc = false;
      this.lqd = false;
      return;
      updateState(8);
      continue;
      this.fbo.setTextureChangeCallback(new SightCaptureUI.7(this));
    }
  }
  
  private int bfm()
  {
    x.i("MicroMsg.SightCaptureUI", "startRecordImpl");
    int i = this.fam.d(this.lpz.getOrientation(), this.lqb.bdK(), this.lqb.getOrientation());
    x.i("MicroMsg.SightCaptureUI", "startRecordImpl ret: %d", new Object[] { Integer.valueOf(i) });
    if (i >= 0) {
      this.lpz.a(e.a.lge);
    }
    return i;
  }
  
  private void bfn()
  {
    this.lqk = true;
    updateState(8);
    if (this.fam != null) {}
    try
    {
      this.fam.cancel();
      this.fam = null;
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.SightCaptureUI", localException, "", new Object[0]);
    }
  }
  
  private void bfo()
  {
    k.bey();
    if (!k.isDebug()) {
      return;
    }
    TextView localTextView = (TextView)findViewById(a.d.video_debug_info);
    localTextView.setVisibility(8);
    localTextView.setText("");
  }
  
  private void bfp()
  {
    k.bey();
    if (!k.isDebug()) {
      return;
    }
    x.i("MicroMsg.SightCaptureUI", "test for debug " + bi.cjd().toString());
    i.D(new SightCaptureUI.13(this));
  }
  
  private void bfq()
  {
    if (this.fbo != null) {
      this.fbo.setTextureChangeCallback(null);
    }
    if (this.lpz != null)
    {
      this.lpS = this.lpz.lgb;
      this.lpz.bdL();
      this.lqi = -1L;
      this.fOw = -1L;
    }
  }
  
  private boolean bfr()
  {
    return (this.fOu == 4) || (this.fOu == 3) || (this.fOu == 1) || (this.fOu == 8) || (this.fOu == 9);
  }
  
  private void gA(boolean paramBoolean)
  {
    x.i("MicroMsg.SightCaptureUI", "[clearPhotoEditCache] isDelete:%s mLastEditPhotoPath:%s mRawEditPhotoPath:%s", new Object[] { Boolean.valueOf(paramBoolean), this.lqn, this.lqm });
    if ((!bi.oW(this.lqn)) && (paramBoolean)) {
      FileOp.deleteFile(this.lqn);
    }
    if (!bi.oW(this.lqm)) {
      FileOp.deleteFile(this.lqm);
    }
    this.lqn = null;
    this.lqm = null;
    ls localls = new ls();
    localls.bWh.bIH = 0;
    com.tencent.mm.sdk.b.a.sFg.m(localls);
  }
  
  private boolean gz(boolean paramBoolean)
  {
    x.k("MicroMsg.SightCaptureUI", "createRecorder, surface: %s", new Object[] { this.lpI });
    this.lqk = false;
    if (this.fam != null)
    {
      if (this.lpz != null) {
        this.lpz.b(this.fam.bem());
      }
      this.fam.cancel();
    }
    if (this.lpz == null) {}
    do
    {
      while (this.lpz.lfD == null) {
        do
        {
          return false;
          this.lpT = new aso();
          this.lpT.rUP = true;
          this.lpT.rUO = com.tencent.mm.plugin.mmsight.model.j.lgz.lgM;
          if (this.lip != null) {
            this.lpT.rUR = this.lip.scene;
          }
          if (paramBoolean) {
            break;
          }
        } while (this.lpz.a(this.lpI, true) < 0);
      }
      k.bey();
      this.fam = k.d(this.lem);
      if (this.fam != null) {
        break;
      }
      x.e("MicroMsg.SightCaptureUI", "create mediaRecorder error");
      this.lqk = true;
      return false;
      paramBoolean = this.lpz.a(this, this.lpI, true);
      this.lpS = this.lpz.lgb;
    } while (paramBoolean);
    return false;
    com.tencent.mm.plugin.mmsight.d.a(this.fam, this.lip);
    this.fam.a(this);
    this.lpz.a(this.fam.bem());
    if (this.lpN != null) {
      this.lpN.Q(this.lpz.getPreviewWidth(), this.lpz.getPreviewHeight(), this.lpz.getOrientation());
    }
    this.fam.p(this.lpz.getPreviewWidth(), this.lpz.getPreviewHeight(), this.lpz.lfD.x, this.lpz.lfD.y);
    paramBoolean = this.fam.sQ(this.lpz.getOrientation());
    x.i("MicroMsg.SightCaptureUI", "preInit result: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean) {
      this.lqk = true;
    }
    return paramBoolean;
  }
  
  private void stopRecord()
  {
    x.l("MicroMsg.SightCaptureUI", "stopRecord, currentStatus: %s", new Object[] { Integer.valueOf(this.fOu) });
    if (this.fOu == 2)
    {
      updateState(7);
      this.lpB.setTouchEnable(false);
      int i = this.lpz.getPreviewWidth();
      int j = this.lpz.getPreviewHeight();
      this.fam.E(new SightCaptureUI.9(this, i, j));
    }
  }
  
  private static String tc(int paramInt)
  {
    if (paramInt == -1) {
      return "CAPTURE_STATE_BINGDING";
    }
    if (paramInt == 0) {
      return "CAPTURE_STATE_INIT";
    }
    if (paramInt == 1) {
      return "CAPTURE_STATE_CAPTURING";
    }
    if (paramInt == 2) {
      return "CAPTURE_STATE_RECORDING";
    }
    if (paramInt == 3) {
      return "CAPTURE_STATE_PREVIEW_PICTURE";
    }
    if (paramInt == 4) {
      return "CAPTURE_STATE_PREVIEW_VIDEO";
    }
    if (paramInt == 6) {
      return "CAPTURE_STATE_SUPERMAN";
    }
    if (paramInt == 7) {
      return "CAPTURE_STATE_WAIT_TO_PREVIEW";
    }
    if (paramInt == 8) {
      return "CAPTURE_STATE_INIT_ERROR";
    }
    if (paramInt == 9) {
      return "CAPTURE_STATE_STOP_ERROR";
    }
    return "UNKNOW";
  }
  
  private void updateState(int paramInt)
  {
    x.i("MicroMsg.SightCaptureUI", "pre state %s %s update state %s %s", new Object[] { Integer.valueOf(this.fOu), tc(this.fOu), Integer.valueOf(paramInt), tc(paramInt) });
    x.i("MicroMsg.TestCaptureUiEvent", "pre state %s %s update state %s %s %s", new Object[] { Integer.valueOf(this.fOu), tc(this.fOu), Integer.valueOf(paramInt), tc(paramInt), bi.cjd().toString() });
    if (paramInt == this.fOu) {}
    do
    {
      do
      {
        return;
        com.tencent.mm.plugin.mmsight.d.Hp("TIME_RECODER_2_PLAY");
        this.fOu = paramInt;
        if (this.fOu != 7) {
          ah.M(this.lql);
        }
        if (this.fOu != 0) {
          break;
        }
        this.lpE.setVisibility(8);
        this.lpH.setVisibility(8);
        this.lpF.setVisibility(8);
        this.lpL.setVisibility(8);
        this.lpK.setVisibility(0);
        if (this.lqf > 1) {
          this.lpG.setVisibility(0);
        }
        if (this.lpz != null) {
          this.lpz.a(e.a.lgd);
        }
        com.tencent.mm.plugin.mmsight.model.a.reset();
      } while (this.lqh == null);
      try
      {
        this.lqh.interrupt();
        this.lqh = null;
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.SightCaptureUI", localException, "update to state init, interrupt failed: %s", new Object[] { localException.getMessage() });
        }
      }
      Object localObject;
      if ((this.fOu == 1) || (this.fOu == 2))
      {
        this.lpE.setVisibility(0);
        this.lpH.setVisibility(8);
        this.lpF.setVisibility(0);
        this.lpF.setClipChildren(false);
        this.lpC.setVisibility(8);
        this.kIx.setVisibility(8);
        this.lpD.setVisibility(0);
        this.lpB.setVisibility(0);
        this.lkZ.setVisibility(8);
        if (this.fOu == 1) {
          this.lpB.reset();
        }
        for (;;)
        {
          this.lpQ.setVisibility(8);
          this.lpL.setVisibility(8);
          this.lpP.setVisibility(0);
          if (this.lqf > 1) {
            this.lpG.setVisibility(0);
          }
          this.lpP.bringToFront();
          this.lpG.bringToFront();
          bfo();
          bfp();
          return;
          this.lpB.setTouchEnable(true);
          localObject = this.lpB;
          x.i("MicroMsg.MMSightRecordButton", "hideProgressBar");
          ((MMSightRecordButton)localObject).lop.setVisibility(8);
        }
      }
      if ((this.fOu == 4) || (this.fOu == 3))
      {
        this.lpE.setVisibility(0);
        this.lpF.setVisibility(8);
        this.lpF.setClipChildren(false);
        this.lpC.setVisibility(0);
        this.kIx.setVisibility(0);
        this.lpD.setVisibility(8);
        this.lpB.setVisibility(8);
        if (this.fOu == 3)
        {
          this.lpH.setVisibility(0);
          this.lpL.setVisibility(0);
          this.lkZ.setVisibility(8);
        }
        for (;;)
        {
          this.lpP.setVisibility(8);
          return;
          this.lpL.setVisibility(8);
          this.lkZ.setVisibility(0);
          this.lkZ.setForceScaleFullScreen(true);
          localObject = this.lkZ.getLayoutParams();
          ((ViewGroup.LayoutParams)localObject).width = -1;
          ((ViewGroup.LayoutParams)localObject).height = -1;
          this.lkZ.setLayoutParams((ViewGroup.LayoutParams)localObject);
          if (this.fam.bdK()) {
            this.lpN.bfu();
          }
          this.lpK.setVisibility(8);
        }
      }
      if (this.fOu == 6)
      {
        this.lpC.setVisibility(8);
        this.kIx.setVisibility(8);
        this.lpH.setVisibility(8);
        this.lpD.setVisibility(8);
        this.lpB.setVisibility(8);
        return;
      }
      if (this.fOu == 7)
      {
        this.lpC.setVisibility(8);
        this.kIx.setVisibility(8);
        this.lpD.setVisibility(8);
        this.lpG.setVisibility(8);
        this.lpH.setVisibility(8);
        this.lpB.setTouchEnable(false);
        ah.i(this.lql, 1500L);
        this.lpB.bfe();
        return;
      }
      if (this.fOu == 8)
      {
        this.lpE.setVisibility(0);
        this.lpF.setVisibility(0);
        this.lpF.setClipChildren(false);
        this.lpC.setVisibility(8);
        this.kIx.setVisibility(8);
        this.lpH.setVisibility(8);
        this.lpD.setVisibility(0);
        if (this.lqf > 1) {
          this.lpG.setVisibility(0);
        }
        this.lpB.setVisibility(0);
        this.lpP.setVisibility(0);
        this.lkZ.setVisibility(8);
        this.lpQ.setVisibility(8);
        this.lpL.setVisibility(8);
        if (this.lqk) {
          Toast.makeText(this, a.f.mmsight_capture_codec_init_error, 1).show();
        }
        for (;;)
        {
          this.lpB.setTouchEnable(false);
          this.lpB.setEnabled(false);
          return;
          Toast.makeText(this, a.f.mmsight_capture_init_error, 1).show();
        }
      }
    } while (this.fOu != 9);
    this.lpC.setVisibility(8);
    this.kIx.setVisibility(8);
    this.lpH.setVisibility(8);
    this.lpD.setVisibility(0);
    this.lpG.setVisibility(8);
    this.lpB.reset();
    this.lpB.setTouchEnable(false);
    this.lpB.setEnabled(false);
    Toast.makeText(this, a.f.mmsight_capture_finish_error, 1).show();
  }
  
  public final void ZZ()
  {
    x.i("MicroMsg.SightCaptureUI", "onError: %s", new Object[] { Integer.valueOf(1) });
    try
    {
      if (this.fam != null) {
        this.fam.reset();
      }
      updateState(9);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.SightCaptureUI", "onError, reset mediaRecorder error: %s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.e.big_sight_capture_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent == null)
    {
      bool = true;
      x.i("MicroMsg.SightCaptureUI", "[onActivityResult] requestCode:%s  resultCode:%s data is null?:", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      switch (paramInt1)
      {
      }
    }
    do
    {
      return;
      bool = false;
      break;
      x.i("MicroMsg.SightCaptureUI", "[handlePhotoEditResult] resultCode:%s", new Object[] { Integer.valueOf(paramInt2) });
    } while ((paramInt2 != -1) || (paramIntent == null) || (this.fam == null));
    this.lqo = true;
    this.lqp = paramIntent.getBundleExtra("report_info");
    this.lqm = paramIntent.getStringExtra("before_photo_edit");
    this.lqn = paramIntent.getStringExtra("after_photo_edit");
    boolean bool = CaptureMMProxy.getInstance().getBoolean(aa.a.sVr, true);
    x.i("MicroMsg.SightCaptureUI", "rawEditPhotoPath:%s lastEditPhotoPath:%s imageState:%s", new Object[] { this.lqm, this.lqn, Boolean.valueOf(bool) });
    if (!bool)
    {
      paramIntent = CaptureMMProxy.getInstance().getSubCoreImageFullPath("photoEdited_" + System.currentTimeMillis());
      x.i("MicroMsg.SightCaptureUI", "saveFullPath:%s", new Object[] { paramIntent });
      FileOp.y(this.lqn, paramIntent);
      FileOp.deleteFile(this.lqn);
      r.a(this.lqn, this);
      this.fam.Hs(paramIntent);
      this.lqn = paramIntent;
    }
    for (;;)
    {
      paramIntent = new BitmapFactory.Options();
      paramIntent.inJustDecodeBounds = true;
      BitmapFactory.decodeFile(this.lqn, paramIntent);
      x.i("MicroMsg.SightCaptureUI", "rawW:%s rawH:%s", new Object[] { Integer.valueOf(paramIntent.outWidth), Integer.valueOf(paramIntent.outHeight) });
      paramIntent = com.tencent.mm.sdk.platformtools.c.j(this.lqn, paramIntent.outHeight, paramIntent.outWidth, 0);
      this.lpL.setVisibility(0);
      this.lpL.setImageBitmap(paramIntent);
      this.lpM.setVisibility(8);
      return;
      this.fam.Hs(this.lqn);
    }
  }
  
  public void onBackPressed()
  {
    x.i("MicroMsg.SightCaptureUI", "onBackPressed %d", new Object[] { Integer.valueOf(this.fOu) });
    if ((this.lpR != null) && (this.lpR.agV())) {}
    do
    {
      return;
      if (this.lpR != null)
      {
        this.lpR.release();
        this.lpR = null;
        DO(8);
        this.lpC.setVisibility(0);
        this.kIx.setVisibility(0);
        this.lpH.setVisibility(0);
        return;
      }
    } while (!bfr());
    super.onBackPressed();
    overridePendingTransition(-1, a.a.sight_slide_bottom_out);
    gA(true);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    supportRequestWindowFeature(1);
    super.onCreate(paramBundle);
    this.lip = ((SightParams)getIntent().getParcelableExtra("KEY_SIGHT_PARAMS"));
    if (this.lip == null)
    {
      x.e("MicroMsg.SightCaptureUI", "error!!!! sightParams is null!!");
      return;
    }
    CaptureMMProxy.createProxy(new CaptureMMProxy(this.iMQ));
    long l = bi.VG();
    this.iMQ.K(new SightCaptureUI.1(this, l));
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    x.i("MicroMsg.SightCaptureUI", "onDestroy");
    this.iMQ.release();
    if (this.fam != null)
    {
      this.fam.E(null);
      this.fam.clear();
    }
    if (this.fOu == -1) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        bfq();
        if (this.lkZ != null)
        {
          this.lkZ.stop();
          this.lkZ.setVideoCallback(null);
        }
        if (this.epT != null) {
          this.epT.zY();
        }
        if (this.lpR != null)
        {
          this.lpR.release();
          this.lpR = null;
        }
      }
      if (this.lqb != null)
      {
        this.lqb.disable();
        this.lqb = null;
      }
      com.tencent.mm.plugin.mmsight.model.a.j.lin.Fm();
      return;
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    x.i("MicroMsg.SightCaptureUI", "onPause, currentState: %s", new Object[] { tc(this.fOu) });
    if (this.fOu == 2) {
      stopRecord();
    }
    for (;;)
    {
      m.Bk(2);
      return;
      if (this.fOu == 1) {
        bfq();
      } else if ((this.fOu == 4) && (this.lkZ != null)) {
        this.lkZ.pause();
      }
    }
  }
  
  protected void onResume()
  {
    boolean bool2 = false;
    super.onResume();
    DO(8);
    String str = tc(this.fOu);
    boolean bool1 = bool2;
    if (this.fbo != null)
    {
      bool1 = bool2;
      if (this.fbo.isAvailable()) {
        bool1 = true;
      }
    }
    x.i("MicroMsg.SightCaptureUI", "onResume, currentState: %s, textureview available: %s", new Object[] { str, Boolean.valueOf(bool1) });
    if ((this.fOu == 2) || (this.fOu == 1)) {
      bfl();
    }
    for (;;)
    {
      m.Bk(1);
      return;
      if (this.fOu == 4)
      {
        if (this.fbo != null)
        {
          if (!this.fbo.isAvailable()) {
            break label142;
          }
          this.lpN.bfu();
        }
        for (;;)
        {
          if (this.lkZ == null) {
            break label158;
          }
          this.lkZ.start();
          break;
          label142:
          this.fbo.setTextureChangeCallback(new SightCaptureUI.12(this));
        }
      }
      else
      {
        label158:
        if (this.fOu == 3)
        {
          if (this.fbo != null) {
            this.fbo.setTextureChangeCallback(null);
          }
          this.lpN.a(this.lpZ, this.lqe, this.lqa);
        }
      }
    }
  }
  
  public final void sO(int paramInt)
  {
    if (this.lqf <= 1) {
      break label8;
    }
    for (;;)
    {
      label8:
      return;
      if (this.fOu != 2)
      {
        x.i("MicroMsg.SightCaptureUI", "onOrientationChange: %s", new Object[] { Integer.valueOf(paramInt) });
        if (paramInt < 0) {
          break;
        }
        float f;
        if ((paramInt == 90) || (paramInt == 270)) {
          if (paramInt == 270) {
            f = 90.0F;
          }
        }
        while (this.lpG.getRotation() != f)
        {
          this.lpG.animate().rotation(f).setDuration(100L).start();
          return;
          f = -90.0F;
          continue;
          f = paramInt;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/mmsight/ui/SightCaptureUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */