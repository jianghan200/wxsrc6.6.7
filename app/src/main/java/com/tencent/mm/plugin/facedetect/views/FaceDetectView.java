package com.tencent.mm.plugin.facedetect.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.g;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.d.b;
import com.tencent.mm.plugin.facedetect.d.b.b;
import com.tencent.mm.plugin.facedetect.model.f;
import com.tencent.mm.plugin.facedetect.model.g;
import com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.c.a.c;
import com.tencent.mm.w.a.a;

public class FaceDetectView
  extends RelativeLayout
{
  public static long iTW = 100L;
  public static int iTX = 1;
  public volatile boolean hxu = false;
  public long iNF = -1L;
  private TextView iRy = null;
  public FaceDetectCameraView iTG = null;
  public FaceDetectDecorView iTH = null;
  public ViewGroup iTI = null;
  public ViewGroup iTJ = null;
  private a iTK = null;
  public b iTL;
  public boolean iTM = false;
  public boolean iTN = false;
  public String iTO = ad.getContext().getString(a.h.soter_face_err_msg_ok);
  public boolean iTP = true;
  public boolean iTQ = false;
  public long iTR = -1L;
  private long iTS = -1L;
  private final int iTT = 1500;
  private Animation iTU;
  private View iTV = null;
  public boolean isPaused = false;
  
  public FaceDetectView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FaceDetectView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, (byte)0);
  }
  
  private FaceDetectView(Context paramContext, AttributeSet paramAttributeSet, int paramInt, byte paramByte)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = LayoutInflater.from(paramContext).inflate(a.g.soter_face_detect_view, null, false);
    addView(paramContext);
    this.iTG = ((FaceDetectCameraView)paramContext.findViewById(a.e.camera_view));
    this.iTH = ((FaceDetectDecorView)paramContext.findViewById(a.e.helper_view));
    this.iTV = paramContext.findViewById(a.e.gauss_blur_view);
    this.iTG.iSU = new FaceDetectView.1(this);
    paramContext = getContext();
    if (paramContext == null)
    {
      x.e("MicroMsg.MMAnimationEffectLoader", "hy: context is null.");
      paramContext = null;
    }
    for (;;)
    {
      this.iTU = paramContext;
      return;
      paramContext = AnimationUtils.loadAnimation(paramContext, a.a.anim_shake);
      paramContext.setInterpolator(new c());
    }
  }
  
  private void AX(String paramString)
  {
    if (bi.oV(paramString).equals(this.iRy.getText().toString()))
    {
      x.v("MicroMsg.FaceDetectView", "hy: same error. ignore");
      return;
    }
    this.iRy.setText(paramString);
    this.iRy.setVisibility(0);
    this.iRy.setAnimation(this.iTU);
  }
  
  private void aKL()
  {
    this.iRy.setText("");
    this.iRy.setVisibility(4);
  }
  
  public final void eL(boolean paramBoolean)
  {
    if (this.iTL != null) {
      this.iTL.aKe();
    }
    if (!this.hxu)
    {
      this.hxu = true;
      if (paramBoolean) {
        if (this.iTG != null) {
          f.y(new FaceDetectView.5(this));
        }
      }
      for (;;)
      {
        x.i("MicroMsg.FaceDetectView", "hy: stopped capture face");
        this.iTN = false;
        aKL();
        return;
        if (this.iTG != null)
        {
          this.iTG.aKF();
          f.iNu.iNv.iPA.aJS();
        }
      }
    }
    x.w("MicroMsg.FaceDetectView", "hy: already end");
  }
  
  public int getCameraBestHeight()
  {
    return this.iTG.getEncodeVideoBestSize().y;
  }
  
  public int getCameraBestWidth()
  {
    return this.iTG.getEncodeVideoBestSize().x;
  }
  
  public int getCameraPreivewWidth()
  {
    return this.iTG.iTm.getPreviewWidth();
  }
  
  public int getCameraPreviewHeight()
  {
    return this.iTG.iTm.getPreviewHeight();
  }
  
  public int getCameraRotation()
  {
    return this.iTG.iTm.getRotation();
  }
  
  public b.b getCurrentMotionCancelInfo()
  {
    if (this.iTL != null) {
      return this.iTL.aKf();
    }
    return new b.b(90004, "user cancelled in processing");
  }
  
  public Bitmap getPreviewBm()
  {
    return this.iTG.getBitmap();
  }
  
  public final void i(boolean paramBoolean, String paramString)
  {
    if (paramBoolean)
    {
      e.post(new FaceDetectView.2(this, paramString), "face_detect_set_backgroud");
      return;
    }
    paramString = new AlphaAnimation(1.0F, 0.0F);
    paramString.setInterpolator(new LinearInterpolator());
    paramString.setDuration(500L);
    paramString.setFillAfter(true);
    this.iTV.startAnimation(paramString);
  }
  
  public void setCallback(a parama)
  {
    this.iTK = parama;
  }
  
  public void setErrTextView(TextView paramTextView)
  {
    this.iRy = paramTextView;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/facedetect/views/FaceDetectView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */