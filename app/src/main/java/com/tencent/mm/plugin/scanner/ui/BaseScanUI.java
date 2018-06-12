package com.tencent.mm.plugin.scanner.ui;

import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.e.d;
import com.tencent.mm.g.a.lr;
import com.tencent.mm.g.a.lr.b;
import com.tencent.mm.g.a.oq;
import com.tencent.mm.model.au;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector;
import com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector.1;
import com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector.a;
import com.tencent.mm.plugin.scanner.util.e.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMTextureView;
import com.tencent.mm.ui.e.i;
import com.tencent.mm.ui.s;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class BaseScanUI
  extends MMActivity
  implements Camera.AutoFocusCallback, Camera.PreviewCallback, TextureView.SurfaceTextureListener, i.b
{
  private int bJM = 0;
  private final Object dMd = new Object();
  private boolean eLU = true;
  private int[] eRw = new int[8];
  private boolean iTc = false;
  private boolean lAO = false;
  private final long mGX = 150L;
  private final int mGY = 2;
  private MMTextureView mGZ;
  private TranslateAnimation mHA;
  private ImageView mHB;
  private i mHC;
  private int mHD = 0;
  private boolean mHE = false;
  private long mHF;
  private long mHG;
  private int mHH;
  private com.tencent.mm.network.n mHI = new BaseScanUI.1(this);
  protected ag mHJ = new BaseScanUI.2(this);
  private final int mHK = 2600;
  protected ag mHL = new BaseScanUI.6(this);
  protected ag mHM = new BaseScanUI.7(this);
  private com.tencent.mm.sdk.b.c mHN = new BaseScanUI.8(this);
  protected ag mHO = new BaseScanUI.9(this);
  protected final int mHP = 0;
  protected final int mHQ = 1;
  protected final int mHR = 2;
  private SurfaceTexture mHa;
  private LinearLayout mHb;
  private TextView mHc;
  private FrameLayout mHd;
  private com.tencent.mm.plugin.scanner.util.h mHe;
  private Point mHf;
  private SelectScanModePanel mHg;
  private ScanMaskView mHh = null;
  private ScannerFlashSwitcher mHi;
  private boolean mHj = false;
  private boolean mHk = false;
  private boolean mHl = true;
  private i.a mHm;
  private int mHn;
  private int mHo;
  private int mHp;
  private int mHq;
  private boolean mHr = true;
  private Rect mHs = new Rect();
  private TextView mHt;
  private View mHu;
  private boolean mHv = false;
  private boolean mHw = true;
  private boolean mHx = false;
  private boolean mHy = false;
  private com.tencent.mm.plugin.scanner.util.e mHz = null;
  private PowerManager.WakeLock wakeLock = null;
  
  private void bpD()
  {
    boolean bool2 = true;
    if (!com.tencent.mm.compatible.f.b.zV()) {
      com.tencent.mm.ui.base.h.a(this, getString(R.l.app_special_no_open_camera_permission), getString(R.l.app_need_camera_title), getString(R.l.app_need_show_settings_button), true, new BaseScanUI.15(this));
    }
    for (;;)
    {
      return;
      if ((!this.mHw) || (this.mHl))
      {
        this.mHk = false;
        d(false, 0L);
        label69:
        this.mHy = false;
      }
      synchronized (this.dMd)
      {
        x.d("MicroMsg.scanner.BaseScanUI", "onResume open Camera");
        int i = this.mHD;
        boolean bool1 = bool2;
        if (7 != this.mHD)
        {
          bool1 = bool2;
          if (9 != this.mHD)
          {
            bool1 = bool2;
            if (10 != this.mHD)
            {
              if (11 != this.mHD) {
                break label305;
              }
              bool1 = bool2;
            }
          }
        }
        this.mHe = new com.tencent.mm.plugin.scanner.util.h(this, i, bool1);
        bst();
        if (this.mHC != null)
        {
          if (this.mHC.bsk() != null) {
            this.mHC.bsk().bsU();
          }
          this.mHC.onResume();
        }
        if (this.wakeLock == null)
        {
          this.wakeLock = ((PowerManager)getSystemService("power")).newWakeLock(10, "Scan Lock");
          this.wakeLock.acquire();
        }
        sendBroadcast(new Intent("com.tencent.mm.ui.ACTION_ACTIVE").putExtra("classname", getClass().getName()), "com.tencent.mm.permission.MM_MESSAGE");
        if (this.mHw) {
          au.a(this.mHI);
        }
        if (this.mHz == null) {
          continue;
        }
        this.mHz.onResume();
        return;
        this.mHk = true;
        bsr();
        break label69;
        label305:
        bool1 = false;
      }
    }
  }
  
  private void bsC()
  {
    oq localoq = new oq();
    localoq.bZB.bWA = 1;
    com.tencent.mm.sdk.b.a.sFg.m(localoq);
    setResult(0);
    finish();
  }
  
  private void bst()
  {
    ah.i(new BaseScanUI.3(this), 25L);
  }
  
  private void bsu()
  {
    this.iTc = true;
    com.tencent.mm.sdk.f.e.post(new BaseScanUI.4(this), "BaseScanUI_closeCamera");
  }
  
  private void bsv()
  {
    if (this.mHj) {
      return;
    }
    this.mHj = true;
    hu(true);
    Object localObject = new lr();
    ((lr)localObject).bWf.type = 2;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
    if (((lr)localObject).bWg.bWe)
    {
      x.i("MicroMsg.scanner.BaseScanUI", "Permission dialog showed");
      this.mHk = true;
      bsu();
      bsC();
      overridePendingTransition(0, 0);
      return;
    }
    localObject = com.tencent.mm.ui.base.h.a(this, getString(R.l.scan_open_camera_fail), getString(R.l.app_tip), new BaseScanUI.5(this));
    if (localObject == null)
    {
      x.d("MicroMsg.scanner.BaseScanUI", "comfirmDialog == null");
      return;
    }
    ((com.tencent.mm.ui.widget.a.c)localObject).setCancelable(false);
    ((com.tencent.mm.ui.widget.a.c)localObject).setCanceledOnTouchOutside(false);
    ((com.tencent.mm.ui.widget.a.c)localObject).show();
  }
  
  private void bsx()
  {
    Rect localRect = new Rect();
    getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    this.mHf = new Point(localRect.width(), localRect.height());
    x.d("MicroMsg.scanner.BaseScanUI", "update visible rect:%s", new Object[] { this.mHf });
  }
  
  private void d(boolean paramBoolean, long paramLong)
  {
    if ((this.mHp < 0) || (this.mHq <= 0) || ((this.mHC != null) && (!this.mHC.bsp()))) {
      return;
    }
    FrameLayout.LayoutParams localLayoutParams;
    if (paramBoolean)
    {
      localLayoutParams = (FrameLayout.LayoutParams)this.mHB.getLayoutParams();
      if (!this.mHr) {
        break label148;
      }
      localLayoutParams.width = this.mHn;
      localLayoutParams.gravity = 1;
      this.mHB.setLayoutParams(localLayoutParams);
      this.mHB.invalidate();
      this.mHB.setVisibility(0);
      if (!this.mHr) {
        break label179;
      }
    }
    label148:
    label179:
    for (this.mHA = new TranslateAnimation(0.0F, 0.0F, this.mHp, this.mHq);; this.mHA = new TranslateAnimation(this.mHp, this.mHq, 0.0F, 0.0F))
    {
      this.mHJ.removeMessages(1);
      if (paramLong > 0L) {
        break label205;
      }
      this.mHJ.sendEmptyMessage(1);
      return;
      localLayoutParams.height = this.mHo;
      localLayoutParams.gravity = 48;
      localLayoutParams.topMargin = this.mHs.top;
      break;
    }
    label205:
    bsr();
    this.mHJ.sendEmptyMessageDelayed(1, paramLong);
  }
  
  private void startPreview()
  {
    try
    {
      if (this.mHe == null)
      {
        x.w("MicroMsg.scanner.BaseScanUI", "scanCamera == null, in startPreview");
        return;
      }
      if (!this.mHe.isOpen())
      {
        x.w("MicroMsg.scanner.BaseScanUI", "camera not open");
        return;
      }
    }
    catch (Exception localException)
    {
      x.w("MicroMsg.scanner.BaseScanUI", "Exception in scanCamera.startPreview(), [%s]", new Object[] { localException.toString() });
      x.printErrStackTrace("MicroMsg.scanner.BaseScanUI", localException, "", new Object[0]);
      bsv();
      return;
    }
    if (this.mHa == null)
    {
      x.w("MicroMsg.scanner.BaseScanUI", "preview surface in null in startPreview");
      return;
    }
    if (this.mHe.iOl)
    {
      x.w("MicroMsg.scanner.BaseScanUI", "camera is previewing");
      return;
    }
    x.d("MicroMsg.scanner.BaseScanUI", "camera startPreview.");
    for (;;)
    {
      synchronized (this.dMd)
      {
        com.tencent.mm.plugin.scanner.util.h localh = this.mHe;
        SurfaceTexture localSurfaceTexture = this.mHa;
        long l = bi.VG();
        if ((localh.ddt != null) && (!localh.iOl))
        {
          if (localSurfaceTexture != null) {
            localh.ddt.setPreviewTexture(localSurfaceTexture);
          }
          localh.ddt.startPreview();
          localh.iOl = true;
          x.d("MicroMsg.scanner.ScanCamera", "startPreview done costTime=[%s]", new Object[] { Long.valueOf(bi.bI(l)) });
        }
        x.d("MicroMsg.scanner.BaseScanUI", "camera startPreview. done");
        this.eRw[5] = ((int)(System.currentTimeMillis() - this.mHF));
        if ((!bi.oW(this.mHe.getFocusMode())) && (this.mHe.getFocusMode().equals("continuous-video")))
        {
          localh = this.mHe;
          if (localh.ddt != null) {
            localh.ddt.cancelAutoFocus();
          }
          eu(0L);
          return;
        }
      }
      if (com.tencent.mm.compatible.e.q.deM.ddi > 0L) {
        eu((int)((float)com.tencent.mm.compatible.e.q.deM.ddi * af.exW));
      }
      ev(0L);
    }
  }
  
  private boolean zf()
  {
    return (7 == this.mHD) || (9 == this.mHD) || (10 == this.mHD) || (11 == this.mHD) || (d.zf());
  }
  
  public final void V(int paramInt1, int paramInt2, int paramInt3)
  {
    for (;;)
    {
      synchronized (this.dMd)
      {
        if ((!this.iTc) && (this.mHe != null) && (this.mHe.iOl))
        {
          x.i("MicroMsg.scanner.BaseScanUI", "zoom camera,action:%d,type:%d,scale:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
          int i = this.mHe.bth();
          if ((this.mHD != 1) && (this.mHD != 8) && (this.mHD != 4)) {
            break label272;
          }
          if ((paramInt2 == 1) && (!((p)this.mHC).bsQ()))
          {
            x.d("MicroMsg.scanner.BaseScanUI", "auto zoom is disable");
            return;
          }
          if (paramInt1 != 6) {
            break label261;
          }
          this.mHe.vG(paramInt3);
          if (paramInt2 == 2) {
            ((p)this.mHC).bsP();
          }
          if (this.mHe.bth() != i)
          {
            com.tencent.mm.plugin.scanner.a.l locall = com.tencent.mm.plugin.scanner.a.l.mFT;
            paramInt1 = this.mHe.bth();
            String str1 = "";
            if (paramInt2 != 1) {
              break label300;
            }
            str1 = String.format("(0@%.2f)", new Object[] { Double.valueOf(paramInt1 / 100.0D) });
            if (locall.mGf.length() + str1.length() < 1024) {
              locall.mGf.append(str1);
            }
          }
        }
        return;
      }
      label261:
      this.mHe.vH(paramInt1);
      continue;
      label272:
      if (paramInt1 == 6)
      {
        this.mHe.vG(paramInt3);
      }
      else
      {
        this.mHe.vH(paramInt1);
        continue;
        label300:
        if (paramInt2 == 2) {
          String str2 = "" + String.format("(1@%.2f)", new Object[] { Double.valueOf(paramInt1 / 100.0D) });
        }
      }
    }
  }
  
  public final void a(i.a parama)
  {
    this.mHm = parama;
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2, int paramInt3, e.a parama)
  {
    x.i("MicroMsg.scanner.BaseScanUI", "dealQBarString, qbarString: %s, codeType: %s, codeVersion: %s", new Object[] { paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.mHz != null) {
      this.mHz.bsY();
    }
    Bundle localBundle = getIntent().getBundleExtra("_stat_obj");
    this.mHz = new com.tencent.mm.plugin.scanner.util.e();
    this.mHz.a(this, paramString, paramInt1, paramInt2, paramInt3, parama, localBundle);
    if ((this.mHD == 1) || (this.mHD == 8) || (this.mHD == 4))
    {
      paramInt1 = com.tencent.mm.plugin.scanner.a.l.mFT.mxT;
      paramInt1 = com.tencent.mm.plugin.scanner.a.l.mFQ;
    }
  }
  
  public final void b(int paramInt, View.OnClickListener paramOnClickListener)
  {
    if (this.mHb != null) {
      if (!getIntent().getBooleanExtra("key_is_hide_right_btn", false)) {
        if (paramOnClickListener != null)
        {
          this.mHb.setVisibility(paramInt);
          this.mHb.setOnClickListener(paramOnClickListener);
          this.mHc.setBackgroundDrawable(null);
          this.mHc.setText(getString(R.l.self_qrcode_gallery_land));
        }
      }
    }
    while (getIntent().getBooleanExtra("key_is_hide_right_btn", false))
    {
      return;
      this.mHb.setVisibility(8);
      return;
    }
    if (paramOnClickListener != null)
    {
      addIconOptionMenu(0, R.k.actionbar_icon_dark_more, new BaseScanUI.10(this, paramOnClickListener));
      return;
    }
    removeOptionMenu(0);
  }
  
  public final void bsA()
  {
    bsC();
  }
  
  public final void bsB()
  {
    super.finish();
  }
  
  public final void bsD()
  {
    if ((this.mHe != null) && (!this.mHk))
    {
      Object localObject = this.mHe.getFocusMode();
      if ((!bi.oW((String)localObject)) && (!((String)localObject).equals("auto")))
      {
        localObject = this.mHe;
        if ((((com.tencent.mm.plugin.scanner.util.h)localObject).ddt != null) && (((com.tencent.mm.plugin.scanner.util.h)localObject).iOl))
        {
          Camera.Parameters localParameters = ((com.tencent.mm.plugin.scanner.util.h)localObject).ddt.getParameters();
          List localList = localParameters.getSupportedFocusModes();
          if ((localList != null) && (localList.contains("auto")) && (!bi.oW(localParameters.getFocusMode())) && (!localParameters.getFocusMode().equals("auto")))
          {
            localParameters.setFocusMode("auto");
            ((com.tencent.mm.plugin.scanner.util.h)localObject).ddt.setParameters(localParameters);
          }
        }
        ev(0L);
      }
    }
  }
  
  public final void bsr()
  {
    if ((this.mHB != null) && (this.mHA != null))
    {
      this.mHB.setVisibility(8);
      this.mHB.clearAnimation();
      this.mHB.setAnimation(null);
    }
  }
  
  public final void bss()
  {
    if (!this.mHk) {
      as.I(this, R.l.qrcode_completed);
    }
  }
  
  public final void bsw()
  {
    for (;;)
    {
      Object localObject2;
      try
      {
        bsx();
        if (this.mHC == null)
        {
          x.d("MicroMsg.scanner.BaseScanUI", "initBodyByScanMode null scanMode");
          return;
        }
        if ((this.mHe == null) || (!this.mHe.isOpen())) {
          return;
        }
        this.mHC.g(this.mHf);
        Object localObject1 = this.mHe;
        ((com.tencent.mm.plugin.scanner.util.h)localObject1).iOo = new Point(this.mHf);
        x.d("MicroMsg.scanner.ScanCamera", "set visible resolution:%s", new Object[] { ((com.tencent.mm.plugin.scanner.util.h)localObject1).iOo });
        this.mHC.h(this.mHe.iOm);
        localObject1 = this.mHe;
        localObject2 = this.mHC.B(true, zf());
        int i = this.mHD;
        ((com.tencent.mm.plugin.scanner.util.h)localObject1).iOr = false;
        ((com.tencent.mm.plugin.scanner.util.h)localObject1).mNo = ((com.tencent.mm.plugin.scanner.util.h)localObject1).c((Rect)localObject2, i);
        ((com.tencent.mm.plugin.scanner.util.h)localObject1).btf();
        x.i("MicroMsg.scanner.ScanCamera", "scanDisplayRect:" + ((com.tencent.mm.plugin.scanner.util.h)localObject1).mNo);
        localObject1 = ((com.tencent.mm.plugin.scanner.util.h)localObject1).mNo;
        x.d("MicroMsg.scanner.BaseScanUI", "CameraScreenHeightRate() = [%s], CameraScreenWidthRate() = [%s], rect = [%s]", new Object[] { Float.valueOf(this.mHe.btc()), Float.valueOf(this.mHe.btb()), localObject1 });
        if (zf()) {
          break label1214;
        }
        x.d("MicroMsg.scanner.BaseScanUI", "portrait needRotate:" + this.mHe.iOp);
        if (this.mHe.iOp)
        {
          this.mHn = ((int)(((Rect)localObject1).height() * this.mHe.btb()));
          this.mHo = ((int)(((Rect)localObject1).width() * this.mHe.btc()));
          localObject2 = new FrameLayout.LayoutParams(this.mHn, this.mHo, 3);
          if ((!this.mHe.iOp) || (zf())) {
            break label1281;
          }
          ((FrameLayout.LayoutParams)localObject2).leftMargin = ((int)(((Rect)localObject1).top * this.mHe.btb()));
          ((FrameLayout.LayoutParams)localObject2).topMargin = ((int)(((Rect)localObject1).left * this.mHe.btc()));
          x.d("MicroMsg.scanner.BaseScanUI", "mask : leftMargin=[%s], topMargin=[%s], width=[%s], height=[%s], needRotate=[%s]", new Object[] { Integer.valueOf(((FrameLayout.LayoutParams)localObject2).leftMargin), Integer.valueOf(((FrameLayout.LayoutParams)localObject2).topMargin), Integer.valueOf(this.mHn), Integer.valueOf(this.mHo), Boolean.valueOf(this.mHe.iOp) });
          localObject1 = new Rect(((FrameLayout.LayoutParams)localObject2).leftMargin, ((FrameLayout.LayoutParams)localObject2).topMargin, ((FrameLayout.LayoutParams)localObject2).leftMargin + this.mHn, ((FrameLayout.LayoutParams)localObject2).topMargin + this.mHo);
          if (this.mHf.x - ((Rect)localObject1).right < ((Rect)localObject1).left)
          {
            x.w("MicroMsg.scanner.BaseScanUI", "this is a special device");
            if (this.mHf.x - ((Rect)localObject1).left > ((Rect)localObject1).left) {
              ((Rect)localObject1).right = (this.mHf.x - ((Rect)localObject1).left);
            }
          }
          this.mHn = ((Rect)localObject1).width();
          if (this.mHh == null) {
            break label1320;
          }
          localObject2 = this.mHh.getMaskRect();
          this.mHh.bsL();
          this.mHh = new ScanMaskView(this, (Rect)localObject2);
          localObject2 = new FrameLayout.LayoutParams(-1, -1);
          this.mHh.setLayoutParams((ViewGroup.LayoutParams)localObject2);
          this.mHd.removeAllViews();
          View.inflate(this, this.mHC.bsl(), this.mHd);
          this.mHC.cv(this.mHd.getChildAt(0));
          this.mHd.addView(this.mHh, 0, (ViewGroup.LayoutParams)localObject2);
          localObject2 = this.mHh;
          if ((((Rect)localObject1).left != ((ScanMaskView)localObject2).mJT.left) || (((Rect)localObject1).right != ((ScanMaskView)localObject2).mJT.right) || (((Rect)localObject1).top != ((ScanMaskView)localObject2).mJT.top) || (((Rect)localObject1).bottom != ((ScanMaskView)localObject2).mJT.bottom))
          {
            ((ScanMaskView)localObject2).mKa = (((Rect)localObject1).left - ((ScanMaskView)localObject2).mJT.left);
            ((ScanMaskView)localObject2).mKb = (((Rect)localObject1).right - ((ScanMaskView)localObject2).mJT.right);
            ((ScanMaskView)localObject2).mKc = (((Rect)localObject1).top - ((ScanMaskView)localObject2).mJT.top);
            ((ScanMaskView)localObject2).mKd = (((Rect)localObject1).bottom - ((ScanMaskView)localObject2).mJT.bottom);
            ((ScanMaskView)localObject2).mJY = new Rect(((ScanMaskView)localObject2).mJT.left, ((ScanMaskView)localObject2).mJT.top, ((ScanMaskView)localObject2).mJT.right, ((ScanMaskView)localObject2).mJT.bottom);
            ((ScanMaskView)localObject2).mJX = true;
            ((ScanMaskView)localObject2).mKf = new ValueAnimator();
            ((ScanMaskView)localObject2).mKf.setFloatValues(new float[] { 0.0F, 1.0F });
            ((ScanMaskView)localObject2).mKf.setDuration(200L);
            ((ScanMaskView)localObject2).mKf.addUpdateListener(new ScanMaskView.1((ScanMaskView)localObject2));
            ((ScanMaskView)localObject2).mKf.start();
          }
          this.mHC.j((Rect)localObject1);
          this.mHh.setBackgroundColor(0);
          x.d("MicroMsg.scanner.BaseScanUI", "newRect = %s", new Object[] { localObject1 });
          if (!this.mHr) {
            break label1336;
          }
          this.mHp = ((Rect)localObject1).top;
          this.mHq = (((Rect)localObject1).bottom - BackwardSupportUtil.b.b(this, 8.0F));
          this.mHs = ((Rect)localObject1);
          if (this.mHi != null)
          {
            localObject1 = (FrameLayout.LayoutParams)this.mHi.getLayoutParams();
            if (this.mHD != 3) {
              break label1368;
            }
            ((FrameLayout.LayoutParams)localObject1).topMargin = (this.mHg.getTop() - com.tencent.mm.bp.a.fromDPToPix(this, 70));
            x.l("MicroMsg.scanner.BaseScanUI", "initFlashSwitcher, scanMaskRect: %s, scanLineStart: %s, scanLineEnd: %s", new Object[] { this.mHs, Integer.valueOf(this.mHp), Integer.valueOf(this.mHq) });
            this.mHi.setLayoutParams((ViewGroup.LayoutParams)localObject1);
            this.mHi.setOnClickListener(new BaseScanUI.19(this));
            if ((this.mHe == null) || (!this.mHe.lfJ)) {
              break label1397;
            }
            this.mHi.setVisibility(0);
          }
          if ((this.mHw) && (!this.mHl)) {
            break;
          }
          d(true, this.mHh.getMaskAnimDuration() + 150L);
          if ((this.mHe != null) && (this.mHe.iOl)) {
            ev(0L);
          }
          if ((this.mHt == null) || (this.mHu == null)) {
            return;
          }
          this.mHt.setVisibility(8);
          this.mHu.setVisibility(8);
          return;
        }
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.scanner.BaseScanUI", localException, "", new Object[0]);
        return;
      }
      this.mHn = ((int)(localException.width() * this.mHe.btb()));
      this.mHo = ((int)(localException.height() * this.mHe.btc()));
      continue;
      label1214:
      x.d("MicroMsg.scanner.BaseScanUI", "landscape needRotate:" + this.mHe.iOp);
      this.mHn = ((int)(localException.width() * this.mHe.btb()));
      this.mHo = ((int)(localException.height() * this.mHe.btc()));
      continue;
      label1281:
      ((FrameLayout.LayoutParams)localObject2).leftMargin = ((int)(localException.left * this.mHe.btb()));
      ((FrameLayout.LayoutParams)localObject2).topMargin = ((int)(localException.top * this.mHe.btc()));
      continue;
      label1320:
      this.mHh = new ScanMaskView(this, localException);
      continue;
      label1336:
      this.mHp = localException.left;
      this.mHq = (localException.right - BackwardSupportUtil.b.b(this, 8.0F));
      this.mHs = localException;
      continue;
      label1368:
      localException.topMargin = (this.mHs.top + (this.mHs.height() - com.tencent.mm.bp.a.fromDPToPix(this, 70)));
      continue;
      label1397:
      this.mHi.setVisibility(8);
    }
    if ((this.mHt != null) && (this.mHu != null))
    {
      this.mHt.setText(R.l.scan_no_network);
      this.mHu.setVisibility(0);
      this.mHt.setVisibility(0);
    }
  }
  
  public final void bsy()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("preview_ui_title", R.l.scan_select_local_img);
    com.tencent.mm.pluginsdk.ui.tools.l.a(this, 4660, localIntent);
  }
  
  public final boolean bsz()
  {
    if (this.mHe == null)
    {
      x.d("MicroMsg.scanner.BaseScanUI", "scanCamera == null, cameraNeedRotate return false");
      return false;
    }
    return this.mHe.iOp;
  }
  
  public final void eu(long paramLong)
  {
    x.i("MicroMsg.scanner.BaseScanUI", "takeOneShotDelay: %s", new Object[] { Long.valueOf(paramLong) });
    this.mHM.removeMessages(0);
    if (!this.mHk)
    {
      this.mHM.sendEmptyMessageDelayed(0, paramLong);
      return;
    }
    x.w("MicroMsg.scanner.BaseScanUI", "takeOneShotDelay() scanPause");
  }
  
  public final void ev(long paramLong)
  {
    if ((this.mHe != null) && (!this.mHk) && (this.mHe.iOl))
    {
      x.d("MicroMsg.scanner.BaseScanUI", "focus delay:" + paramLong);
      String str = this.mHe.getFocusMode();
      if ((!bi.oW(str)) && (str.equals("continuous-video"))) {
        eu(0L);
      }
    }
    else
    {
      return;
    }
    this.mHO.removeMessages(0);
    this.mHO.sendEmptyMessageDelayed(0, paramLong);
  }
  
  protected final int getForceOrientation()
  {
    if (!zf())
    {
      x.d("MicroMsg.scanner.BaseScanUI", "getForceOrientation PORTRAIT");
      return 1;
    }
    x.d("MicroMsg.scanner.BaseScanUI", "getForceOrientation LANDSCAPE");
    return 0;
  }
  
  protected final int getLayoutId()
  {
    if (!zf())
    {
      x.d("MicroMsg.scanner.BaseScanUI", "getLayoutId PORTRAIT");
      return R.i.scan_base;
    }
    x.d("MicroMsg.scanner.BaseScanUI", "getLayoutId LANDSCAPE");
    return R.i.scan_base_land;
  }
  
  public final void hu(boolean paramBoolean)
  {
    this.mHk = paramBoolean;
    if (paramBoolean)
    {
      bsr();
      if (this.mHu != null) {
        this.mHu.setVisibility(0);
      }
    }
    do
    {
      return;
      ev(0L);
      d(false, 0L);
    } while (this.mHu == null);
    this.mHu.setVisibility(8);
  }
  
  protected final void initView()
  {
    if (zf())
    {
      getWindow().setFlags(1024, 1024);
      this.mController.hideTitleView();
      x.d("MicroMsg.scanner.BaseScanUI", "oncreate LANDSCAPE");
    }
    this.mHu = findViewById(R.h.scan_no_data_mask);
    this.mHt = ((TextView)findViewById(R.h.scan_no_network_tips));
    this.mHb = ((LinearLayout)findViewById(R.h.scan_title_btn));
    this.mHc = ((TextView)findViewById(R.h.scan_title_btn_bg));
    this.mHd = ((FrameLayout)findViewById(R.h.scan_body_fl));
    this.mHi = ((ScannerFlashSwitcher)findViewById(R.h.scanner_flash_switcher));
    this.mGZ = ((MMTextureView)findViewById(R.h.preview_view));
    this.mGZ.setOpaque(false);
    this.mGZ.setSurfaceTextureListener(this);
    Object localObject2;
    Object localObject1;
    if ((7 == this.mHD) || (9 == this.mHD) || (10 == this.mHD) || (11 == this.mHD))
    {
      localObject2 = (Button)findViewById(R.h.scan_bank_ret_btn);
      ((Button)localObject2).setVisibility(0);
      findViewById(R.h.scan_bottom_ll).setVisibility(8);
      findViewById(R.h.scan_top_ll).setVisibility(8);
      if (9 != this.mHD)
      {
        localObject1 = localObject2;
        if (10 != this.mHD) {}
      }
      else
      {
        ViewGroup.LayoutParams localLayoutParams = ((Button)localObject2).getLayoutParams();
        localObject1 = localObject2;
        if (localLayoutParams != null)
        {
          localObject1 = localObject2;
          if ((localLayoutParams instanceof ViewGroup.MarginLayoutParams))
          {
            localObject1 = (ViewGroup.MarginLayoutParams)localLayoutParams;
            ((ViewGroup.MarginLayoutParams)localObject1).leftMargin = ((ViewGroup.MarginLayoutParams)localObject1).topMargin;
            ((Button)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
            localObject1 = localObject2;
          }
        }
      }
      if (localObject1 == null) {
        break label502;
      }
      ((Button)localObject1).setOnClickListener(new BaseScanUI.12(this));
    }
    int i;
    for (;;)
    {
      this.mHB = ((ImageView)findViewById(R.h.scan_line));
      this.bJM = getIntent().getIntExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
      this.mHg = ((SelectScanModePanel)findViewById(R.h.scan_select_scan_mode_panel));
      this.mHd.setVisibility(0);
      if ((7 != this.mHD) && (9 != this.mHD) && (10 != this.mHD) && (11 != this.mHD) && (zf()))
      {
        this.mHD = 1;
        this.mHv = true;
      }
      localObject1 = getIntent().getIntArrayExtra("key_support_scan_code_type");
      localObject2 = new HashSet();
      if ((localObject1 == null) || (localObject1.length <= 0)) {
        break label517;
      }
      i = 0;
      while (i < localObject1.length)
      {
        ((Set)localObject2).add(Integer.valueOf(localObject1[i]));
        i += 1;
      }
      localObject1 = (Button)findViewById(R.h.scan_back_btn);
      break;
      label502:
      setBackBtn(new BaseScanUI.13(this));
    }
    label517:
    bsx();
    setMMSubTitle(null);
    if (this.mHD == 2)
    {
      this.mHC = new k(this, this.mHf);
      setMMTitle(com.tencent.mm.plugin.scanner.util.p.et(com.tencent.mm.plugin.scanner.util.p.mOb, getString(R.l.scan_img_title)));
      this.mHr = this.mHC.bso();
      localObject1 = this.mHB;
      if (!this.mHr) {
        break label1573;
      }
      i = R.g.qrcode_scan_line;
      label595:
      ((ImageView)localObject1).setBackgroundResource(i);
      i = this.mHD;
      if ((7 != this.mHD) && (9 != this.mHD) && (10 != this.mHD) && (11 != this.mHD)) {
        break label1580;
      }
    }
    for (;;)
    {
      if (this.mHe != null) {
        this.mHe.vF(this.mHD);
      }
      lF(getResources().getColor(R.e.transparent));
      x.i("MicroMsg.scanner.BaseScanUI", "initView() done, fromSource=[%s], directSelectMode=[%s]", new Object[] { Integer.valueOf(this.bJM), Integer.valueOf(this.mHD) });
      return;
      if (this.mHD == 5)
      {
        this.mHC = new q(this, this.mHf);
        setMMTitle(R.l.scan_entry_street);
        x.i("MicroMsg.scanner.BaseScanUI", "summerper checkPermission checkLocation[%b], stack[%s]", new Object[] { Boolean.valueOf(com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 64, null, null)), bi.cjd() });
        break;
      }
      if (this.mHD == 3)
      {
        this.mHC = new o(this, this.mHf);
        setMMTitle(R.l.scan_entry_ocr);
        break;
      }
      if ((this.mHD == 4) && (!zf()))
      {
        if (((Set)localObject2).isEmpty()) {}
        for (this.mHC = new p(this, this.mHf, this.bJM, 2);; this.mHC = new p(this, this.mHf, this.bJM, (Set)localObject2))
        {
          ((p)this.mHC).mLp = getIntent().getBooleanExtra("key_is_finish_on_scanned", false);
          this.mHg.setVisibility(8);
          setMMTitle(R.l.scan_entry_zbar);
          break;
        }
      }
      if (this.mHD == 8)
      {
        if (((Set)localObject2).isEmpty()) {}
        for (this.mHC = new p(this, this.mHf, this.bJM, 1);; this.mHC = new p(this, this.mHf, this.bJM, (Set)localObject2))
        {
          ((p)this.mHC).mLp = getIntent().getBooleanExtra("key_is_finish_on_scanned", false);
          this.mHg.setVisibility(8);
          setMMTitle(R.l.scan_entry_qrcode);
          break;
        }
      }
      if (7 == this.mHD)
      {
        localObject1 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
        this.mHC = new j(this, this.mHf, (DisplayMetrics)localObject1, getWindowManager().getDefaultDisplay().getRotation());
        localObject1 = (j)this.mHC;
        if ((getIntent() != null) && (getIntent().getBooleanExtra("scan_bankcard_with_confirm_ui", false))) {}
        for (boolean bool = true;; bool = false)
        {
          ((j)localObject1).mKx = bool;
          setMMTitle(R.l.scan_entry_bankcard);
          this.mHg.setVisibility(8);
          break;
        }
      }
      if (9 == this.mHD)
      {
        localObject1 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
        this.mHC = new m(this, this.mHf, (DisplayMetrics)localObject1, getWindowManager().getDefaultDisplay().getRotation());
        setMMTitle(R.l.scan_entry_id_card);
        this.mHg.setVisibility(8);
        break;
      }
      if (10 == this.mHD)
      {
        localObject1 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
        this.mHC = new l(this, this.mHf, (DisplayMetrics)localObject1, getWindowManager().getDefaultDisplay().getRotation());
        setMMTitle(R.l.scan_entry_driving_licence);
        this.mHg.setVisibility(8);
        break;
      }
      if (11 == this.mHD)
      {
        localObject1 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
        this.mHC = new n(this, this.mHf, (DisplayMetrics)localObject1, getWindowManager().getDefaultDisplay().getRotation());
        setMMTitle(R.l.scan_entry_id_card_for_pay_auth);
        this.mHg.setVisibility(8);
        break;
      }
      this.mHD = 1;
      if (((Set)localObject2).isEmpty())
      {
        localObject1 = this.mHf;
        int j = this.bJM;
        if (zf())
        {
          i = 1;
          label1428:
          this.mHC = new p(this, (Point)localObject1, j, i);
          label1444:
          ((p)this.mHC).mLp = getIntent().getBooleanExtra("key_is_finish_on_scanned", false);
          if (!com.tencent.mm.al.b.PC()) {
            break label1532;
          }
          this.mHv = true;
          this.mHg.setVisibility(8);
        }
      }
      for (;;)
      {
        if (!this.mHv) {
          break label1563;
        }
        setMMTitle(R.l.scan_entry_qrcode);
        break;
        i = 0;
        break label1428;
        this.mHC = new p(this, this.mHf, this.bJM, (Set)localObject2);
        break label1444;
        label1532:
        if (getIntent().getBooleanExtra("BaseScanUI_only_scan_qrcode_with_zbar", false))
        {
          this.mHv = false;
          this.mHg.setVisibility(8);
        }
      }
      label1563:
      setMMTitle(R.l.scan_entry_qrcode_zbar);
      break;
      label1573:
      i = R.g.qrcode_scan_line_hor;
      break label595;
      label1580:
      this.mHg.setOnGridItemClickCallback(new BaseScanUI.14(this));
      this.mHg.setSelectedMode(i);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.mHm != null) {
      this.mHm.b(this, paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    x.i("MicroMsg.scanner.BaseScanUI", "onAutoFocus, success: %s, camera: %s", new Object[] { Boolean.valueOf(paramBoolean), paramCamera });
    this.eRw[4] = ((int)(System.currentTimeMillis() - this.mHG));
    com.tencent.mm.compatible.e.q.deM.ddi = this.eRw[4];
    if (this.mHk) {}
    do
    {
      do
      {
        return;
      } while (this.mHC == null);
      if ((this.mHe != null) && (this.mHe.iOl) && (paramBoolean)) {
        eu(0L);
      }
    } while (this.mHC.mKh <= 0L);
    ev(this.mHC.mKh);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    x.i("MicroMsg.scanner.BaseScanUI", "screen orientation %d", new Object[] { Integer.valueOf(paramConfiguration.orientation) });
    if ((paramConfiguration.orientation == 2) || (paramConfiguration.orientation == 1)) {
      ah.i(new BaseScanUI.11(this), 200L);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.mHD = getIntent().getIntExtra("BaseScanUI_select_scan_mode", 1);
    super.onCreate(paramBundle);
    s.initLanguage(this);
    getWindow().addFlags(2097280);
    getWindow().getDecorView().setSystemUiVisibility(1280);
    if ((au.DF().Lg() == 6) || (au.DF().Lg() == 4)) {
      this.mHl = true;
    }
    for (;;)
    {
      if ((7 == this.mHD) || (11 == this.mHD)) {
        this.mHw = false;
      }
      com.tencent.mm.sdk.b.a.sFg.b(this.mHN);
      initView();
      this.mHF = System.currentTimeMillis();
      paramBundle = ScanCameraLightDetector.mNw;
      try
      {
        paramBundle.mNB = com.tencent.mm.sdk.f.e.Xs("ScanCameraLightDetector_detectThread");
        paramBundle.mNB.start();
        paramBundle.handler = new ScanCameraLightDetector.1(paramBundle, paramBundle.mNB.getLooper());
        x.i("MicroMsg.ScanCameraLightDetector", "start, sensorManager: %s, lightSensor: %s, isRegister: %s", new Object[] { paramBundle.ejl, paramBundle.mNy, Boolean.valueOf(paramBundle.mNz) });
        this.mHF = System.currentTimeMillis();
        return;
        this.mHl = false;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.ScanCameraLightDetector", localException, "start error: %s", new Object[] { localException.getMessage() });
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    x.i("MicroMsg.scanner.BaseScanUI", "onDestroy()");
    if (this.mHC != null) {
      this.mHC.onDestroy();
    }
    if (this.mHh != null) {
      this.mHh.bsL();
    }
    if (this.mGZ != null) {
      this.mGZ.setSurfaceTextureListener(null);
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.mHN);
    ScanCameraLightDetector localScanCameraLightDetector = ScanCameraLightDetector.mNw;
    x.i("MicroMsg.ScanCameraLightDetector", "stop, isRegister: %s, sensorManager: %s, lightSensor: %s", new Object[] { Boolean.valueOf(localScanCameraLightDetector.mNz), localScanCameraLightDetector.ejl, localScanCameraLightDetector.mNy });
    try
    {
      localScanCameraLightDetector.mNx = -1L;
      if (localScanCameraLightDetector.mNB != null) {
        localScanCameraLightDetector.mNB.quit();
      }
      super.onDestroy();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.ScanCameraLightDetector", localException, "stop error: %s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
    {
      x.d("MicroMsg.scanner.BaseScanUI", "keyCode KEYCODE_BACK");
      this.mHk = true;
      bsC();
      overridePendingTransition(0, 0);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    x.i("MicroMsg.scanner.BaseScanUI", "onPause(), scanMode: %s, mQBarStringHandler: %s", new Object[] { this.mHC, this.mHz });
    this.mHk = true;
    com.tencent.mm.plugin.scanner.util.m.mNW.stop();
    if (this.mHC != null)
    {
      this.mHC.onPause();
      if (this.mHC.bsk() != null) {
        this.mHC.bsk().ll();
      }
    }
    int i;
    if (this.mHe != null)
    {
      String str = this.mHe.getFocusMode();
      if ((!bi.oW(str)) && (str.equals("continuous-video"))) {
        this.eRw[2] = 1;
      }
    }
    else
    {
      bsu();
      if (this.mHi != null)
      {
        this.mHi.bsS();
        this.mHi.hide();
      }
      if ((this.wakeLock != null) && (this.wakeLock.isHeld()))
      {
        this.wakeLock.release();
        this.wakeLock = null;
      }
      sendBroadcast(new Intent("com.tencent.mm.ui.ACTION_DEACTIVE").putExtra("classname", getClass().getName()), "com.tencent.mm.permission.MM_MESSAGE");
      if (this.mHw) {
        au.b(this.mHI);
      }
      if (this.mHz != null) {
        this.mHz.onPause();
      }
      if ((this.mHD == 1) || (this.mHD == 8) || (this.mHD == 4))
      {
        com.tencent.mm.plugin.scanner.a.l.mFT.aXS();
        i = (int)(System.currentTimeMillis() - this.mHF);
        x.i("MicroMsg.scanner.BaseScanUI", "scan cost time:" + i);
        if (!com.tencent.mm.plugin.scanner.a.l.mFT.mFV) {
          break label490;
        }
        this.eRw[0] = 1;
      }
    }
    for (;;)
    {
      this.eRw[1] = i;
      this.eRw[3] = com.tencent.mm.plugin.scanner.a.l.mFT.mFW;
      if (com.tencent.mm.plugin.scanner.util.m.mNW.btn() > 0L) {
        this.eRw[6] = ((int)(com.tencent.mm.plugin.scanner.util.m.mNW.btn() - this.mHF));
      }
      this.eRw[7] = this.mHD;
      com.tencent.mm.plugin.report.service.h.mEJ.h(14176, new Object[] { Integer.valueOf(this.eRw[0]), Integer.valueOf(this.eRw[1]), Integer.valueOf(this.eRw[2]), Integer.valueOf(this.eRw[3]), Integer.valueOf(this.eRw[4]), Integer.valueOf(this.eRw[5]), Integer.valueOf(this.eRw[6]), Integer.valueOf(this.eRw[7]) });
      super.onPause();
      return;
      this.eRw[2] = 0;
      break;
      label490:
      this.eRw[0] = 0;
    }
  }
  
  public void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    int j = 1;
    boolean bool2 = true;
    if (paramArrayOfByte == null) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      x.i("MicroMsg.scanner.BaseScanUI", "onPreviewFrame, data==null: %s, camera: %s", new Object[] { Boolean.valueOf(bool1), paramCamera });
      if ((!this.mHk) && (this.mHC != null) && (this.mHC.bsk() != null) && (this.mHC.B(false, zf()) != null)) {
        break;
      }
      x.w("MicroMsg.scanner.BaseScanUI", "onPreviewFrame error state, scanPause = [%s]", new Object[] { Boolean.valueOf(this.mHk) });
      return;
    }
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      if (paramArrayOfByte == null) {}
      for (bool1 = bool2;; bool1 = false)
      {
        x.e("MicroMsg.scanner.BaseScanUI", "onPreviewFrame, wrong data, data is null [%s]", new Object[] { Boolean.valueOf(bool1) });
        bsv();
        return;
      }
    }
    if (this.mHe == null)
    {
      x.e("MicroMsg.scanner.BaseScanUI", "onPreviewFrame, scanCamera == null, finish this activity");
      return;
    }
    if (this.mHe != null)
    {
      paramCamera = this.mHe;
      if (paramCamera.mNr < 0)
      {
        if (!paramCamera.bti()) {
          break label483;
        }
        i = 1;
        label197:
        paramCamera.mNr = i;
      }
      if (paramCamera.mNr != 1) {
        break label488;
      }
    }
    label483:
    label488:
    for (int i = j;; i = 0)
    {
      if ((i != 0) && (!this.mHe.lfJ) && (this.mHl))
      {
        paramCamera = ScanCameraLightDetector.mNw;
        i = this.mHe.iOm.x;
        j = this.mHe.iOm.y;
        if ((paramCamera.mNx < 0L) || ((bi.bI(paramCamera.mNx) >= 1000L) && (paramCamera.handler != null) && (paramCamera.mNB != null) && (paramCamera.mNB.isAlive())))
        {
          localObject1 = new ScanCameraLightDetector.a(paramCamera, (byte)0);
          ((ScanCameraLightDetector.a)localObject1).lho = paramArrayOfByte;
          ((ScanCameraLightDetector.a)localObject1).width = i;
          ((ScanCameraLightDetector.a)localObject1).height = j;
          localObject2 = Message.obtain();
          ((Message)localObject2).what = 233;
          ((Message)localObject2).obj = localObject1;
          paramCamera.handler.sendMessage((Message)localObject2);
          paramCamera.mNx = bi.VG();
        }
      }
      if ((this.mHe == null) || (this.mHk)) {
        break;
      }
      paramCamera = this.mHC;
      Object localObject1 = this.mHe.iOm;
      i = this.mHe.iOq;
      Object localObject2 = this.mHe;
      ((com.tencent.mm.plugin.scanner.util.h)localObject2).iKQ = ((com.tencent.mm.plugin.scanner.util.h)localObject2).c(this.mHC.hx(zf()), this.mHD);
      x.i("MicroMsg.scanner.ScanCamera", "scanRect:" + ((com.tencent.mm.plugin.scanner.util.h)localObject2).iKQ);
      paramCamera.a(paramArrayOfByte, (Point)localObject1, i, ((com.tencent.mm.plugin.scanner.util.h)localObject2).iKQ);
      return;
      i = 0;
      break label197;
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    x.i("MicroMsg.scanner.BaseScanUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults len[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt.length), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    do
    {
      return;
      if ((paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
      {
        bpD();
        return;
      }
      this.eLU = false;
      com.tencent.mm.ui.base.h.a(this, getString(R.l.permission_camera_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new BaseScanUI.16(this), new BaseScanUI.17(this));
      return;
    } while ((paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0));
    com.tencent.mm.ui.base.h.a(this, getString(R.l.permission_location_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        BaseScanUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
      }
    }, null);
  }
  
  protected void onResume()
  {
    super.onResume();
    Object localObject;
    if (!this.mHE)
    {
      localObject = new Intent();
      ((Intent)localObject).setComponent(new ComponentName(e.i.thA, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
      ((Intent)localObject).putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
      sendBroadcast((Intent)localObject);
      this.mHE = true;
    }
    if (this.eLU)
    {
      boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.CAMERA", 16, null, null);
      x.i("MicroMsg.scanner.BaseScanUI", "summerper checkPermission checkCamera[%b]", new Object[] { Boolean.valueOf(bool) });
      if (bool) {}
    }
    do
    {
      return;
      bpD();
      if ((!this.mHk) && ((this.mHD == 1) || (this.mHD == 8) || (this.mHD == 4)))
      {
        com.tencent.mm.plugin.scanner.a.l.mFT.reset();
        com.tencent.mm.plugin.scanner.a.l.mFT.vy(com.tencent.mm.plugin.scanner.a.l.mFQ);
      }
      localObject = com.tencent.mm.plugin.scanner.util.m.mNW;
      x.i("MicroMsg.ScanStableDetector", "start detect scan stable");
    } while (((com.tencent.mm.plugin.scanner.util.m)localObject).bgR == null);
    ((com.tencent.mm.plugin.scanner.util.m)localObject).mNU = 0;
    ((com.tencent.mm.plugin.scanner.util.m)localObject).mNT[0] = 0.0F;
    ((com.tencent.mm.plugin.scanner.util.m)localObject).mNT[1] = 0.0F;
    ((com.tencent.mm.plugin.scanner.util.m)localObject).mNT[2] = 0.0F;
    x.i("MicroMsg.ScanStableDetector", "register accelerate listener");
    ((com.tencent.mm.plugin.scanner.util.m)localObject).bgR.registerListener((SensorEventListener)localObject, ((com.tencent.mm.plugin.scanner.util.m)localObject).mNS, 50000);
  }
  
  public void onStart()
  {
    super.onStart();
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    x.d("MicroMsg.scanner.BaseScanUI", "onSurfaceTextureAvailable");
    this.mGZ.crS();
    this.mHa = paramSurfaceTexture;
    this.mHx = true;
    if (this.mHy)
    {
      bst();
      this.mHy = false;
    }
    startPreview();
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    x.d("MicroMsg.scanner.BaseScanUI", "onSurfaceTextureDestroyed");
    this.mHx = false;
    return false;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    x.d("MicroMsg.scanner.BaseScanUI", "onSurfaceTextureSizeChanged");
    this.mHa = paramSurfaceTexture;
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  
  public final void vA(int paramInt)
  {
    this.mHL.removeMessages(0);
    this.mHL.sendEmptyMessageDelayed(paramInt, 50L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/BaseScanUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */